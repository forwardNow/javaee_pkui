package com.pkusoft.admin.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.admin.dao.SysMenuMapper;
import com.pkusoft.admin.model.SysMenu;
import com.pkusoft.admin.model.SysMenuCriteria;
import com.pkusoft.admin.model.SysMenuIcon;
import com.pkusoft.admin.service.SysMenuService;
import com.pkusoft.admin.service.SysRoleService;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;


/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysMenuService")
@Transactional
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenu> implements SysMenuService{
	/** 数据访问接口  */
	@Autowired
	private SysMenuMapper sysMenuMapper;
	
	/**角色访问接口*/
	@Autowired
	private SysRoleService sysRoleService;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	public BaseMapper<SysMenu> getMapper() {
		return this.sysMenuMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#getSysMenuList(com.pkusoft.admin.model.SysMenu, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMenu> getSysMenuList(SysMenu sysMenu, Pager pager) {
		Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
		criteria.setPager(pager);
		SysMenuCriteria sysMenuCriteria = criteria.createCriteria(SysMenuCriteria.class);
				
		List<SysMenu> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#saveSysMenu(com.pkusoft.admin.model.SysMenu)
	 */
	public int insertSysMenu(SysMenu sysMenu){
		if(null != sysMenu.getMenuId() ){ //根据的树节点编号查询得到父树节点信息
			SysMenu sysMenuParent = this.get(sysMenu.getMenuId());
			sysMenu.setTreeParentid(sysMenuParent.getMenuId());
			sysMenu.setTreeLevel(sysMenuParent.getTreeLevel()+1);
		} else {//默认添加的树级别为1级,并且为根节点
			Long  treeLevel = 1l;
			sysMenu.setTreeLevel(treeLevel);
		}
		
		//生成的菜单标识号
		long menuId = MaxIdUtils.getLongMaxIdA(IdType.SYS_MENU);
		sysMenu.setMenuId(menuId);
		
		//排序--随单位标识号从小到大排列,可以直接将MenuId赋值给orderFlag
		if ( sysMenu.getOrderFlag() == null ) {
			long orderFlag = menuId;
			sysMenu.setOrderFlag(orderFlag);	
		}
		
		//录入用户信息
		sysMenu.setAddUserId(User.getUserId());
		sysMenu.setAddUserName(User.getUserName());
		sysMenu.setAddTime(new Date());
		
		return sysMenuMapper.insert(sysMenu);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#updateSysMenu(com.pkusoft.admin.model.SysMenu)
	 */
	public int updateSysMenu(SysMenu sysMenu) {
		Assert.notNull(sysMenu);
		Assert.notNull(sysMenu.getMenuId(),"菜单编号不能为空");
		
		SysMenu oldSysMenu = this.get(sysMenu.getMenuId());
		
		Map<String,Object> sysMenuMap = MapUtils.toMapTrimNull(sysMenu);
		MapUtils.apply(sysMenuMap, oldSysMenu);
		
		// 修改用户信息
		oldSysMenu.setModifyUserId(User.getUserId());
		oldSysMenu.setModifyUserName(User.getUserName());
		oldSysMenu.setModifyTime(new Date());
		
		int count = this.update(oldSysMenu);
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#deleteSysMenu(java.lang.Long[])
	 */
	public int deleteSysMenu(java.lang.Long menuId) {
		Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
		SysMenuCriteria sysMenuCriteria = criteria.createCriteria(SysMenuCriteria.class);
		sysMenuCriteria.andMenuIdEqualTo(menuId);
		return this.deleteByCriteria(criteria);
	}
	
	/*(non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#getTreeLevelBySysMenuList()
	 * 
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMenu> getSysMenuListByTreeLevel(Long treeLevel){
		Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
		SysMenuCriteria sysMenuCriteria = criteria.createCriteria(SysMenuCriteria.class);
		sysMenuCriteria.andTreeLevelEqualTo(treeLevel);
		return this.getListByCriteria(criteria);
	}
	
	
	/*(non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#getSysMenuById(Long menuId)
	 * 
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public SysMenu getSysMenuById(Long menuId){
		return this.get(menuId);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#getMenuListByRole(java.lang.Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
    public List<SysMenu> getMenuListByRole(Long roleId){
		Assert.notNull(roleId);
		Map<String, Object> params = new HashMap<String, Object>();

		params.put("roleId", roleId);
		return sysMenuMapper.getMenuListByRole(params);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#deleteSysMenu(java.lang.Long[])
	 */
	public int deleteSysTreeParent(java.lang.Long menuId) {
		Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
		SysMenuCriteria sysMenuCriteria = criteria.createCriteria(SysMenuCriteria.class);
		sysMenuCriteria.andTreeParentidEqualTo(menuId);
		return this.deleteByCriteria(criteria);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#getSysMenuById(java.lang.Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMenu> getSysMenuByUserId(Long userId){
		Assert.notNull(userId);
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("userId", userId);
		return sysMenuMapper.getSysMenuByUserId(params);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#getMenuIcons()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMenuIcon> getMenuIcons() {

		List<SysMenuIcon> iconList = new ArrayList<SysMenuIcon>();

		String path = this.getClass().getClassLoader().getResource("/")
		        .getPath().replace("/WEB-INF/classes/", "/static/images/icons/16x16");
		path = path.substring(1, path.length());
		File file = new File(path);
		File icons[] = file.listFiles();
		SysMenuIcon smi;
		for (int i = 0;i < icons.length;i++) {
			if ( icons[i].getName().endsWith("png") ) {
				smi = new SysMenuIcon(i, icons[i].getName());
				iconList.add(smi);
			}
		}

		return iconList;
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMenuIcon> getMenuIcons( String iconDir ) {
		
		List<SysMenuIcon> iconList = new ArrayList<SysMenuIcon>();
		/*
		String path = this.getClass().getClassLoader().getResource("/")
				.getPath().replace("/WEB-INF/classes/", "/static/images/icons/16x16");
		*/
		String path = this.getClass().getClassLoader().getResource("/")
				.getPath().replace("/WEB-INF/classes/", iconDir);
		
		File file = new File(path);
		if ( !file.exists() ) {
			path = path.substring(1, path.length());
			file = new File( path );
		}
		File icons[] = file.listFiles();
		SysMenuIcon smi;
		for (int i = 0;i < icons.length;i++) {
			if ( icons[i].getName().endsWith("png") ) {
				smi = new SysMenuIcon(i, icons[i].getName());
				iconList.add(smi);
			}
		}
		
		return iconList;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMenuService#updateNode(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateNode(String sourceMenuId, String targetMenuId, String point) {
		Long parentId = null;
		Long treeLevel = null;
		
		Long longSourceMenuId = Long.parseLong(sourceMenuId);
		Long longTargetMenuId = null;
		
		SysMenu srcSysMenu  = this.get(longSourceMenuId);
		
		if("root".equals(targetMenuId)){
			treeLevel = new Long(1);
			parentId = null;
			
			int maxOrder = getMaxOrderFlagByParent(parentId);
			
			SysMenu sysMenu = new SysMenu();
			BeanUtils.copyProperties(srcSysMenu, sysMenu);
			sysMenu.setTreeParentid(parentId);
			sysMenu.setTreeLevel(treeLevel);
			sysMenu.setOrderFlag(new Long(maxOrder + 1));
			this.update(sysMenu);
			
		}else{
			longTargetMenuId = Long.parseLong(targetMenuId);
			SysMenu targetMenu = this.get(longTargetMenuId);
			
			// append, above or below
			if("append".equals(point)){
				parentId = longTargetMenuId;
				treeLevel = targetMenu.getTreeLevel() + 1;
				int maxOrder = getMaxOrderFlagByParent(parentId);
				
				SysMenu sysMenu = new SysMenu();
				BeanUtils.copyProperties(srcSysMenu, sysMenu);
				sysMenu.setTreeParentid(parentId);
				sysMenu.setTreeLevel(treeLevel);
				sysMenu.setOrderFlag(new Long(maxOrder + 1));
				this.update(sysMenu);
			}else{
				parentId = targetMenu.getTreeParentid();
				treeLevel = targetMenu.getTreeLevel();
				Long order = null;
				
				Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
				criteria.setOrderByClause("ORDER_FLAG");
				SysMenuCriteria sysMenuCriteria = criteria.createCriteria(SysMenuCriteria.class);
				if(parentId == null){
					sysMenuCriteria.andTreeParentidIsNull();
				}else{
					sysMenuCriteria.andTreeParentidEqualTo(parentId);
				}
				if("above".equals(point)){
					sysMenuCriteria.andOrderFlagGreaterThanOrEqualTo(targetMenu.getOrderFlag());
					order = targetMenu.getOrderFlag();
				}else if("below".equals(point)){
					sysMenuCriteria.andOrderFlagGreaterThan(targetMenu.getOrderFlag());
					order = targetMenu.getOrderFlag() + 1;
				}else{
					throw new RuntimeException("unknow point：" + point);
				}
				List<SysMenu> list = this.getListByCriteria(criteria);
				for (SysMenu item : list) {
					SysMenu sysMenu = new SysMenu();
					BeanUtils.copyProperties(item, sysMenu);
					sysMenu.setTreeParentid(parentId);
					sysMenu.setTreeLevel(treeLevel);
					sysMenu.setOrderFlag(new Long(item.getOrderFlag() + 1));
					this.update(sysMenu);
				}
				
				SysMenu sysMenu = new SysMenu();
				BeanUtils.copyProperties(srcSysMenu, sysMenu);
				sysMenu.setTreeParentid(parentId);
				sysMenu.setTreeLevel(treeLevel);
				sysMenu.setOrderFlag(order);
				this.update(sysMenu);
			}
			
		}
		
		// update children
		if(srcSysMenu.getTreeLevel().intValue() != treeLevel.intValue()){
			updateChildTreeLevel(srcSysMenu.getMenuId(),treeLevel);
		}
	}
	
	private void updateChildTreeLevel(Long currMenuId,Long currTreeLevel){
		Long childTreeLevel = currTreeLevel + 1;
		
		Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
		criteria.setOrderByClause("ORDER_FLAG");
		SysMenuCriteria sysMenuCriteria = criteria.createCriteria(SysMenuCriteria.class);
		sysMenuCriteria.andTreeParentidEqualTo(currMenuId);
		
		
		List<SysMenu> list = this.getListByCriteria(criteria);
		int orderFlag = 1;
		for (SysMenu item : list) {
			SysMenu sysMenu = new SysMenu();
			BeanUtils.copyProperties(item, sysMenu);
			sysMenu.setTreeLevel(childTreeLevel);
			sysMenu.setOrderFlag(new Long(orderFlag));
			this.update(sysMenu);
			orderFlag = orderFlag + 1;
			
			updateChildTreeLevel(item.getMenuId(),childTreeLevel);
		}
	}
	
	private int getMaxOrderFlagByParent(Long parantMenuId){
		Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
		criteria.setOrderByClause("ORDER_FLAG DESC");
		SysMenuCriteria sysMenuCriteria = criteria.createCriteria(SysMenuCriteria.class);
		if(parantMenuId == null){
			sysMenuCriteria.andTreeParentidIsNull();
		}else{
			sysMenuCriteria.andTreeParentidEqualTo(parantMenuId);
		}
				
		List<SysMenu> list = this.getListByCriteria(criteria);
		if(list.size() == 0){
			return 0;
		}else{
			return list.get(0).getOrderFlag().intValue();
		}
	}

	@Override
	public void updateSysMenu( List<SysMenu> sysMenuList ) {
		for ( int i = 0; i < sysMenuList.size(); i++ ) {
			SysMenu sysMenu = sysMenuList.get( i );
			SysMenu oldSysMenu = this.get(sysMenu.getMenuId());
			
			Map<String,Object> sysMenuMap = MapUtils.toMapTrimNull(sysMenu);
			MapUtils.apply(sysMenuMap, oldSysMenu);
			
			// 修改用户信息
			oldSysMenu.setModifyUserId(User.getUserId());
			oldSysMenu.setModifyUserName(User.getUserName());
			oldSysMenu.setModifyTime(new Date());
			
			this.update(oldSysMenu);		
		}
	}

}