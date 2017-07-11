package com.pkusoft.admin.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.admin.controller.ShiroDbRealm;
import com.pkusoft.admin.dao.SysUserMapper;
import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysRole;
import com.pkusoft.admin.model.SysRoleUser;
import com.pkusoft.admin.model.SysUser;
import com.pkusoft.admin.model.SysUserCriteria;
import com.pkusoft.admin.service.SysDeptService;
import com.pkusoft.admin.service.SysRoleService;
import com.pkusoft.admin.service.SysRoleUserService;
import com.pkusoft.admin.service.SysUserService;
import com.pkusoft.common.cache.SysParaCache;
import com.pkusoft.common.cache.UserCache;
import com.pkusoft.common.constants.Common;
import com.pkusoft.common.constants.DataPermitType;
import com.pkusoft.common.constants.ErrorCode;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.common.constants.ParaCode;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.exception.BizException;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.DigestUtils;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.WebUtils;

/**
 * 
 * @author 
 *
 */
@Service("sysUserService")
@Transactional
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService{
	/** 用户管理数据访问接口  */
	@Autowired
	private SysUserMapper sysUserMapper;
	
	/** 角色用户管理数据访问接口  */
	@Autowired
	private SysRoleUserService sysRoleUserService;
	
	/** 单位管理数据访问接口  */
	@Autowired
	private SysDeptService sysDeptService;
	
	/** 单位管理数据访问接口  */
	@Autowired
	private SysRoleService sysRoleService;
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysUser> getMapper() {
		return this.sysUserMapper;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#getSysUserList(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysUser> getSysUserList(Criteria<?> criteria){
		WebUtils.setUserDataPermit(DataPermitType.SYS_USER_LIST, criteria);
		
		List<SysUser> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		return list;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#getSysUserList(com.pkusoft.admin.model.SysUser, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysUser> getSysUserList(SysUser sysUser, Pager pager){
		Assert.notNull(sysUser);
		
		Criteria<SysUserCriteria> criteria = new Criteria<SysUserCriteria>();
		criteria.setPager(pager);
		SysUserCriteria sysUserCriteria = criteria.createCriteria(SysUserCriteria.class);
		
		if (StringUtils.hasText(sysUser.getPoliceCode())) {
			sysUserCriteria.andPoliceCodeEqualTo(sysUser.getPoliceCode());
		}
		if (StringUtils.hasText(sysUser.getUserName())) {
			sysUserCriteria.andUserNameLike("%" + sysUser.getUserName() + "%");
		}
		if ( null != sysUser.getDeptId()) {
			sysUserCriteria.andDeptIdEqualTo(sysUser.getDeptId());
		}
	
		WebUtils.setUserDataPermit(DataPermitType.SYS_USER_LIST, criteria);
		
		List<SysUser> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#getSysUserListByRole(java.lang.Long, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysUser> getSysUserListByRole(Long roleId, String roleIdOper, String userName, Pager pager) {
		Assert.notNull(roleId);
		Assert.notNull(roleIdOper);
//		Assert.notNull(userName);
		
		Map<String, Object> params = new HashMap<String, Object>();
		//查询条件
		params.put("roleId", roleId);
		params.put("userName", userName);		
		params.put("pager", pager);

		//操作用单位
		int userLevel = Integer.valueOf(User.getUserLevel());
		if (Common.CUNIT_LEVEL.equals(userLevel)) {
			params.put("userCunitId", User.getCunitid());
		}
		if (Common.SUNIT_LEVEL.equals(userLevel)) {
			params.put("userSunitId", User.getSunitid());
		}
		if (Common.TUNIT_LEVEL.equals(userLevel)) {
			params.put("userTunitId", User.getTunitid());
		}
				
		List<SysUser> list = null;
		if ( "in".equals(roleIdOper) ){
			list = sysUserMapper.getListInRole(params);
		}
		if ( "notIn".equals(roleIdOper) ){
			//此处应以所选角色的级别作为限制条件
			//提供选择的用户的级别必须与所选角色级别一致
			//params.put("userLevel", User.getUserLevel());
			//所选角色级别
//			params.put("roleLevel", sysRoleService.get(roleId).getRoleLevel());
			list = sysUserMapper.getListNotInRole(params);
		}
		return list;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysUserService#insertSysUser(com.pkusoft.admin.model.SysUser)
	 */
	public int insertSysUser(SysUser sysUser, Long[] roleId) {

		//唯一性验证
		if (!checkUserInfo(sysUser.getUserId(), "loginName", sysUser.getLoginName())) {
			throw new BizException(ErrorCode.ERR_SYS_USER_EXISTS, "用户" + sysUser.getLoginName() + "已存在");
		}
		
		// 完善新增用户的信息
		// 用户标识号
		Long sysUserId = MaxIdUtils.getLongMaxIdA(IdType.SYS_USER);
		sysUser.setUserId(sysUserId);
		
		//设置密码盐值		
		//sysUser.setSalt(SysParaCache.getSysParaValue("default_password_salt"));
		sysUser.setSalt("a");
		String password = DigestUtils.sha1Hex(sysUser.getPassword(), sysUser.getSalt(), ShiroDbRealm.HASH_ITERATIONS);
		sysUser.setPassword(password);
		
		// 用户级别(所属单位级别)
		//所属市局、分局、派出所
		//用户所属市局分局派出所根据起所属单位的主管单位来判断.
		SysDept sysDept = sysDeptService.get(sysUser.getDeptId());
		sysUser.setUserLevel(sysDept.getDeptLevel());
		sysUser.setCunitid(sysDept.getCunitid());
		sysUser.setSunitid(sysDept.getSunitid());
		sysUser.setTunitid(sysDept.getTunitid());
		
		// 操作人员信息
		sysUser.setAddUserId(User.getUserId());
		sysUser.setAddUserName(User.getUserName());
		sysUser.setAddTime(new Date());

		SysRoleUser sysRoleUser;
		if (null != roleId) {
			for (int i = 0; i < roleId.length; i++) {
				sysRoleUser = new SysRoleUser();
				//角色用户标识号
				Long sysRoleUserId = MaxIdUtils.getLongMaxIdA(IdType.SYS_ROLE_USER);
				sysRoleUser.setRoleUserId(sysRoleUserId);
				sysRoleUser.setUserId(sysUserId);
				sysRoleUser.setRoleId(roleId[i]);
				sysRoleUser.setAddUserId(User.getUserId());
				sysRoleUser.setAddUserName(User.getUserName());
				sysRoleUser.setAddTime(new Date());
				sysRoleUserService.insertSysRoleUser(sysRoleUser);
			}
		}
		
		int count = sysUserMapper.insert(sysUser);
		
		// 刷新用户缓存
		UserCache.set(sysUser.getUserId());
		
		return count;
	}

	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#updateSysUser(com.pkusoft.admin.model.SysUser, java.lang.Long[])
	 */
	public int updateSysUser(SysUser sysUser, Long[] roleId){
		Assert.notNull(sysUser);
		Assert.notNull(sysUser.getUserId(), "用户编号不能为空");
		
		//唯一性验证
		if (!(checkUserInfo(sysUser.getUserId(), "loginName", sysUser.getLoginName()) && 
				checkUserInfo(sysUser.getUserId(), "policeCode", sysUser.getPoliceCode()))) {
			throw new BizException(ErrorCode.ERR_SYS_USER_SAVE, "already");
		}
		
		//角色/先删除该用户所有角色，再插入新的角色信息
		sysRoleUserService.deleteSysRoleUserByUserId(sysUser.getUserId());
		if ( roleId != null ) {
			SysRoleUser sysRoleUser;
			for (int i = 0; i < roleId.length; i++) {
				sysRoleUser = new SysRoleUser();
				//角色用户标识号
				Long sysRoleUserId = MaxIdUtils.getLongMaxIdA(IdType.SYS_ROLE_USER);
				sysRoleUser.setRoleUserId(sysRoleUserId);
				sysRoleUser.setUserId(sysUser.getUserId());
				sysRoleUser.setRoleId(roleId[i]);
				sysRoleUser.setAddUserId(User.getUserId());
				sysRoleUser.setAddUserName(User.getUserName());
				sysRoleUser.setAddTime(new Date());
				sysRoleUserService.insertSysRoleUser(sysRoleUser);
			}
		}
		
		//基本信息
		SysUser oldSysUser = this.get(sysUser.getUserId());
		Map<String,Object> sysUserMap = MapUtils.toMapTrimNull(sysUser);
		MapUtils.apply(sysUserMap, oldSysUser);
		
		//所属市局、分局、派出所
		//用户所属市局分局派出所根据起所属单位的主管单位来判断.
		// 用户级别(所属单位级别) 这里需要设置单位级别
		SysDept sysDept = sysDeptService.get(sysUser.getDeptId());
		oldSysUser.setUserLevel(sysDept.getDeptLevel());
		oldSysUser.setCunitid(sysDept.getCunitid());
		oldSysUser.setSunitid(sysDept.getSunitid());
		oldSysUser.setTunitid(sysDept.getTunitid());
		
		// 操作人员信息
		oldSysUser.setModifyUserId(User.getUserId());
		oldSysUser.setModifyUserName(User.getUserName());
		oldSysUser.setModifyTime(new Date());
		
		int count = this.update(oldSysUser);
		
		// 刷新用户缓存
		UserCache.refresh(sysUser.getUserId());
		
		return count;
	}

	/**
	 * 删除用户信息
	 * 
	 * @param sysUser
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysUser(Long[] userId) {
		Criteria<SysUserCriteria> criteria = new Criteria<SysUserCriteria>();
		SysUserCriteria sysUserCriteria = criteria.createCriteria(SysUserCriteria.class);
		sysUserCriteria.andUserIdIn(CollectionUtils.arrayToList(userId));

		int count = this.deleteByCriteria(criteria);
		
		// 刷新缓存
		for (int i = 0; i < userId.length; i++) {
			UserCache.remove(userId[i]);
		}
		return count;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#resetPassword(java.lang.Long[])
	 */
	public int resetPassword(Long[] userId) {
		for (int i = 0; i < userId.length; i++) {
			SysUser sysUser = this.get(userId[i]);
			String password = DigestUtils.sha1Hex(
			        SysParaCache.getSysParaValue(ParaCode.ADMIN_DEFAULT_PASSWORD),
			        sysUser.getSalt(),
			        ShiroDbRealm.HASH_ITERATIONS
			);
			sysUser.setPassword(password);
			this.update(sysUser);
			
			// 刷新缓存
			UserCache.refresh(sysUser.getUserId());
		}
		return userId.length;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#checkUserInfo(java.lang.Long, java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
    public boolean checkUserInfo(Long userId, String fieldName, String fieldValue){
		List<SysUser> userList = new ArrayList<SysUser>();
		Criteria<SysUserCriteria> criteria = new Criteria<SysUserCriteria>();
		SysUserCriteria sysUserCriteria = criteria.createCriteria(SysUserCriteria.class);

		if (null == userId) { // 新增
			if ("loginName".equals(fieldName)) {
				sysUserCriteria.andLoginNameEqualTo(fieldValue);
			}
			if ("policeCode".equals(fieldName)) {
				sysUserCriteria.andPoliceCodeEqualTo(fieldValue);
			}
			userList = this.getListByCriteria(criteria);
		} else { // 修改
			SysUser sysUser = this.get(userId);
			if ("loginName".equals(fieldName)) {
				sysUserCriteria.andLoginNameNotEqualTo(sysUser.getLoginName());
				sysUserCriteria.andLoginNameEqualTo(fieldValue);
			}
			if ("policeCode".equals(fieldName)) {
				sysUserCriteria.andPoliceCodeNotEqualTo(sysUser.getPoliceCode());
				sysUserCriteria.andPoliceCodeEqualTo(fieldValue);
			}
			userList = this.getListByCriteria(criteria);
		}
		return userList.size() == 0 ? true : false;
    }
    
    
    /*
     * (non-Javadoc)
     * @see com.pkusoft.admin.service.SysUserService#getSysRoleListByLevel(java.lang.String)
     */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRole> getSysRoleListByLevel(String roleLevel) {

		List<SysRole> roleList = sysRoleService.getSysRoleListByLevel(roleLevel);
		return roleList;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#getSysRoleUserListByUserId(java.lang.Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRoleUser> getSysRoleUserListByUserId(Long userId) {
		List<SysRoleUser> roleUserList = sysRoleUserService.getSysRoleUserListByUserId(userId);
		return roleUserList;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysUserService#getUserPermitList(java.lang.Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<Map<String,Object>> getUserPermitList(Long userId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("userId", userId);
		
		return sysUserMapper.getUserPermitList(params);
	}
}