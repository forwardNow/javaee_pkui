package com.pkusoft.admin.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.subject.WebSubject;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysDeptRele;
import com.pkusoft.admin.model.SysResource;
import com.pkusoft.admin.model.SysResourceCriteria;
import com.pkusoft.admin.model.SysUser;
import com.pkusoft.admin.service.SysDeptReleService;
import com.pkusoft.admin.service.SysDeptService;
import com.pkusoft.admin.service.SysResourceService;
import com.pkusoft.admin.service.SysRoleUserService;
import com.pkusoft.admin.service.SysUserService;
import com.pkusoft.common.cache.DeptCache;
import com.pkusoft.common.cache.UserCache;
import com.pkusoft.common.constants.FunctionId;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.User;
import com.pkusoft.framework.User.UserInfo;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.listener.OnlineUserListener;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.OnlineUsers;
import com.pkusoft.framework.security.CaptchaUsernamePasswordToken;

public class ShiroDbRealm extends AuthorizingRealm {
	private static Logger logger = LoggerFactory.getLogger(ShiroDbRealm.class);
	private static final String HASH_ALGORITHMS = MessageDigestAlgorithms.SHA_1; // SHA-1
	public static final int HASH_ITERATIONS = 1024;

	@Autowired
	protected SysUserService sysUserService;
	
	@Autowired
	protected SysDeptService sysDeptService;
	
	@Autowired
	protected SysDeptReleService sysDeptReleService;

	@Autowired
	protected SysResourceService sysResourceService;
	
	@Autowired
	protected SysRoleUserService sysRoleUserService;

	/**
	 * 认证回调函数,登录时调用.
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {

		CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) authcToken;

		WebSubject subject  = (WebSubject) SecurityUtils.getSubject();
		HttpServletRequest request = (HttpServletRequest) subject.getServletRequest();
		Session session = subject.getSession();

		// 验证码 验证
		//String captcha = (String)session.getAttribute("captcha");

		// 忽略大小写
		/*if (captcha == null || !captcha.equalsIgnoreCase(token.getCaptcha())) {
			throw new IncorrectCaptchaException("验证码错误！"); 
		} */
		
		SysUser user = UserCache.getUserByLoginName(token.getUsername()); //sysUserService.getByProperty("loginName", token.getUsername());
		if(user == null){
			return null;
		}
		
		// ssessionlistener会创建UserInfo
		UserInfo u = (UserInfo) session.getAttribute(General.AUTH_KEY);
		User.setCurrent(u);

		AuthenticationInfo info = new SimpleAuthenticationInfo(u, user.getPassword(), ByteSource.Util.bytes(user.getSalt()), getName());
		
		BeanUtils.copyProperties(user, u);
		SysDept sysDept = DeptCache.getDeptByDeptId(user.getDeptId()); //sysDeptService.get(user.getDeptId());
		if(sysDept == null && !General.SUPER_USER.equals(token.getUsername())){
			String errorMsg = "登录失败，不能关联到当前单位信息";
			session.setAttribute("errorMsg", errorMsg);
			throw new AuthenticationException(errorMsg);
		}
		/*if(!StringUtils.hasText(sysDept.getDataTunitid()) && !General.SUPER_USER.equals(token.getUsername())){
			String errorMsg = "登录失败，当前单位未设置数据归属，请联系管理员。";
			session.setAttribute("errorMsg", errorMsg);
			throw new AuthenticationException(errorMsg);
		}*/
		if(sysDept != null){
			u.setDeptName(sysDept.getDeptName());
			u.setCunitid(sysDept.getCunitid());
			u.setSunitid(sysDept.getSunitid());
			u.setTunitid(sysDept.getTunitid());
			
			List<SysDeptRele> dataDeptlist = sysDeptReleService.getListByProperty("deptId", sysDept.getDeptId());
			u.setDataUnitList(dataDeptlist);

			u.getMap().put("txtDataUnitId", getDataUnitId(dataDeptlist));
		}
		
		if(General.NO.equals(u.getStatus())){
			String errorMsg = "登录失败，用户已停用";
			LogUtils.log(FunctionId.LOG_LOGIN, errorMsg);
			session.setAttribute("errorMsg", errorMsg);
			throw new AuthenticationException(errorMsg);
		}
		
		// 用户的数据权限
		List<Map<String,Object>> permitCfgList = sysUserService.getUserPermitList(user.getUserId());
		com.pkusoft.framework.util.WebUtils.initUserDataPermit(permitCfgList);
		
		//List<SysRoleUser> roleUserList = sysRoleUserService.getSysRoleUserListByUserId(user.getUserId());
		
		// start 登陆成功后调用
		u.setLoginStatus(User.ONLINE);
		u.setLogin(true);
		u.setManager(true);
		// -----end

		// 记录登录日志
		Long loginId = LogUtils.log(FunctionId.LOG_LOGIN, "登录成功");
		u.setLoginId(loginId + "");
		
		// 重新登录，不跳到上一次访问页面，统一跳转到首页
		session.removeAttribute(WebUtils.SAVED_REQUEST_KEY);
		
		// 记录在线用户
		OnlineUsers.getInstance().addLoginSession(request.getSession());
		logger.debug("后台用户{}({})上线", u.getIp(),u.getLoginName());  
		return info;
	}

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User.UserInfo user = (User.UserInfo) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		if (General.SUPER_USER.equals(user.getLoginName())) {
			List<SysResource> list = sysResourceService.getListByCriteria(new Criteria<SysResourceCriteria>());
			info.addStringPermissions(getResourceName(list));
		} else {
			List<SysResource> list = sysResourceService.getResourceListByUserId(user.getUserId());
			info.addStringPermissions(getResourceName(list));
		}
		return info;
	}

	/**
	 * 设定Password校验的Hash算法与迭代次数.
	 */
	@PostConstruct
	public void initCredentialsMatcher() {
		HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(
				HASH_ALGORITHMS);
		matcher.setHashIterations(HASH_ITERATIONS);

		setCredentialsMatcher(matcher);
	}

	
	/**
	 * 根据资源列表获取资源名列表
	 * @param list 资源列表
	 * @return 资源名列表
	 */
	private List<String> getResourceName(List<SysResource> list){
		List<String> resList = new ArrayList<String>();
		Iterator<SysResource> it = list.iterator();
		String name;
		while (it.hasNext()) {
			name = it.next().getResourceName();
			if(StringUtils.hasText(name)){
				resList.add(name.trim());
			}
		}
		
		return resList;
	}
	
	/**
	 * get
	 * @param dataDeptlist
	 * @return
	 */
	private String getDataUnitId(List<SysDeptRele> dataDeptlist){
		String txtDataUnitId = "";
		boolean first = true;
		for (SysDeptRele rele : dataDeptlist) {
			if(first){
				txtDataUnitId += ("'" + rele.getReleDeptId() + "'");
				first = false;
			}else{
				txtDataUnitId += (",'" + rele.getReleDeptId() + "'");
			}
		}
		return txtDataUnitId;
	}
}
