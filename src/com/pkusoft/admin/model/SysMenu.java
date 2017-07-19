package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysMenu extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**菜单标识号*/
	private java.lang.Long menuId;
	/**菜单名称*/
	private java.lang.String menuName;
	/**链接路径*/
	private java.lang.String menuUrl;
	/**图标*/
	private java.lang.String icon;
	/**菜单等级*/
	private java.lang.String menuLevel;
	/**菜单树等级*/
	private java.lang.Long treeLevel;
	/**父菜单编号*/
	private java.lang.Long treeParentid;
	/**是否可用*/
	private java.lang.String visiable;
	/**是否展开*/
	private java.lang.String expand;
	/**菜单顺序*/
	private java.lang.Long orderFlag;
	/**保留字段1*/
	private java.lang.String reserve1;
	/**保留字段2*/
	private java.lang.String reserve2;
	/**保留字段3*/
	private java.lang.String reserve3;
	/**保留字段4*/
	private java.lang.String reserve4;
	/**保留字段5*/
	private java.lang.String reserve5;
	/**备注*/
	private java.lang.String memo;
	/**录入时间*/
	private java.util.Date addTime;
	/**录入用户编号*/
	private java.lang.Long addUserId;
	/**录入用户姓名*/
	private java.lang.String addUserName;
	/**修改时间*/
	private java.util.Date modifyTime;
	/**修改用户编号*/
	private java.lang.Long modifyUserId;
	/**修改用户姓名*/
	private java.lang.String modifyUserName;
	private String sysId;
	private String sysName;
	
	public String getSysId() {
		return sysId;
	}

	public void setSysId( String sysId ) {
		this.sysId = sysId;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName( String sysName ) {
		this.sysName = sysName;
	}

	/**
	 * 取得菜单标识号
	 *@return java.lang.Long 菜单标识号
	 */
	public java.lang.Long getMenuId(){
		return this.menuId;
	}

	/**
	 * 设置菜单标识号
	 *@param java.lang.Long 菜单标识号
	 */
	public void setMenuId(java.lang.Long menuId){
		this.menuId = menuId;
	}
	/**
	 * 取得菜单名称
	 *@return java.lang.String 菜单名称
	 */
	public java.lang.String getMenuName(){
		return this.menuName;
	}

	/**
	 * 设置菜单名称
	 *@param java.lang.String 菜单名称
	 */
	public void setMenuName(java.lang.String menuName){
		this.menuName = menuName;
	}

	/**
	 * 取得图标
	 *@return java.lang.String 图标
	 */
	public java.lang.String getIcon(){
		return this.icon;
	}
	/**
	 * 取得链接路径
	 *@return java.lang.String 链接路径
	 */
	public java.lang.String getMenuUrl() {
		return menuUrl;
	}

	/**
	 * 设置链接路径
	 *@param java.lang.String 链接路径
	 */
	public void setMenuUrl(java.lang.String menuUrl) {
		this.menuUrl = menuUrl;
	}

	/**
	 * 设置图标
	 *@param java.lang.String 图标
	 */
	public void setIcon(java.lang.String icon){
		this.icon = icon;
	}
	/**
	 * 取得菜单等级
	 *@return java.lang.String 菜单等级
	 */
	public java.lang.String getMenuLevel(){
		return this.menuLevel;
	}

	/**
	 * 设置菜单等级
	 *@param java.lang.String 菜单等级
	 */
	public void setMenuLevel(java.lang.String menuLevel){
		this.menuLevel = menuLevel;
	}
	/**
	 * 取得菜单树等级
	 *@return java.lang.Long 菜单树等级
	 */
	public java.lang.Long getTreeLevel(){
		return this.treeLevel;
	}

	/**
	 * 设置菜单树等级
	 *@param java.lang.Long 菜单树等级
	 */
	public void setTreeLevel(java.lang.Long treeLevel){
		this.treeLevel = treeLevel;
	}
	/**
	 * 取得父菜单编号
	 *@return java.lang.Long 父菜单编号
	 */
	public java.lang.Long getTreeParentid(){
		return this.treeParentid;
	}

	/**
	 * 设置父菜单编号
	 *@param java.lang.Long 父菜单编号
	 */
	public void setTreeParentid(java.lang.Long treeParentid){
		this.treeParentid = treeParentid;
	}
	/**
	 * 取得是否可用
	 *@return java.lang.String 是否可用
	 */
	public java.lang.String getVisiable(){
		return this.visiable;
	}

	/**
	 * 设置是否可用
	 *@param java.lang.String 是否可用
	 */
	public void setVisiable(java.lang.String visiable){
		this.visiable = visiable;
	}
	/**
	 * 取得是否展开
	 *@return java.lang.String 是否展开
	 */
	public java.lang.String getExpand(){
		return this.expand;
	}

	/**
	 * 设置是否展开
	 *@param java.lang.String 是否展开
	 */
	public void setExpand(java.lang.String expand){
		this.expand = expand;
	}
	/**
	 * 取得菜单顺序
	 *@return java.lang.Long 菜单顺序
	 */
	public java.lang.Long getOrderFlag(){
		return this.orderFlag;
	}

	/**
	 * 设置菜单顺序
	 *@param java.lang.Long 菜单顺序
	 */
	public void setOrderFlag(java.lang.Long orderFlag){
		this.orderFlag = orderFlag;
	}
	/**
	 * 取得保留字段1
	 *@return java.lang.String 保留字段1
	 */
	public java.lang.String getReserve1(){
		return this.reserve1;
	}

	/**
	 * 设置保留字段1
	 *@param java.lang.String 保留字段1
	 */
	public void setReserve1(java.lang.String reserve1){
		this.reserve1 = reserve1;
	}
	/**
	 * 取得保留字段2
	 *@return java.lang.String 保留字段2
	 */
	public java.lang.String getReserve2(){
		return this.reserve2;
	}

	/**
	 * 设置保留字段2
	 *@param java.lang.String 保留字段2
	 */
	public void setReserve2(java.lang.String reserve2){
		this.reserve2 = reserve2;
	}
	/**
	 * 取得保留字段3
	 *@return java.lang.String 保留字段3
	 */
	public java.lang.String getReserve3(){
		return this.reserve3;
	}

	/**
	 * 设置保留字段3
	 *@param java.lang.String 保留字段3
	 */
	public void setReserve3(java.lang.String reserve3){
		this.reserve3 = reserve3;
	}
	/**
	 * 取得保留字段4
	 *@return java.lang.String 保留字段4
	 */
	public java.lang.String getReserve4(){
		return this.reserve4;
	}

	/**
	 * 设置保留字段4
	 *@param java.lang.String 保留字段4
	 */
	public void setReserve4(java.lang.String reserve4){
		this.reserve4 = reserve4;
	}
	/**
	 * 取得保留字段5
	 *@return java.lang.String 保留字段5
	 */
	public java.lang.String getReserve5(){
		return this.reserve5;
	}

	/**
	 * 设置保留字段5
	 *@param java.lang.String 保留字段5
	 */
	public void setReserve5(java.lang.String reserve5){
		this.reserve5 = reserve5;
	}
	/**
	 * 取得备注
	 *@return java.lang.String 备注
	 */
	public java.lang.String getMemo(){
		return this.memo;
	}

	/**
	 * 设置备注
	 *@param java.lang.String 备注
	 */
	public void setMemo(java.lang.String memo){
		this.memo = memo;
	}
	/**
	 * 取得录入时间
	 *@return java.util.Date 录入时间
	 */
	public java.util.Date getAddTime(){
		return this.addTime;
	}

	/**
	 * 设置录入时间
	 *@param java.util.Date 录入时间
	 */
	public void setAddTime(java.util.Date addTime){
		this.addTime = addTime;
	}
	/**
	 * 取得录入用户编号
	 *@return java.lang.Long 录入用户编号
	 */
	public java.lang.Long getAddUserId(){
		return this.addUserId;
	}

	/**
	 * 设置录入用户编号
	 *@param java.lang.Long 录入用户编号
	 */
	public void setAddUserId(java.lang.Long addUserId){
		this.addUserId = addUserId;
	}
	/**
	 * 取得录入用户姓名
	 *@return java.lang.String 录入用户姓名
	 */
	public java.lang.String getAddUserName(){
		return this.addUserName;
	}

	/**
	 * 设置录入用户姓名
	 *@param java.lang.String 录入用户姓名
	 */
	public void setAddUserName(java.lang.String addUserName){
		this.addUserName = addUserName;
	}
	/**
	 * 取得修改时间
	 *@return java.util.Date 修改时间
	 */
	public java.util.Date getModifyTime(){
		return this.modifyTime;
	}

	/**
	 * 设置修改时间
	 *@param java.util.Date 修改时间
	 */
	public void setModifyTime(java.util.Date modifyTime){
		this.modifyTime = modifyTime;
	}
	/**
	 * 取得修改用户编号
	 *@return java.lang.Long 修改用户编号
	 */
	public java.lang.Long getModifyUserId(){
		return this.modifyUserId;
	}

	/**
	 * 设置修改用户编号
	 *@param java.lang.Long 修改用户编号
	 */
	public void setModifyUserId(java.lang.Long modifyUserId){
		this.modifyUserId = modifyUserId;
	}
	/**
	 * 取得修改用户姓名
	 *@return java.lang.String 修改用户姓名
	 */
	public java.lang.String getModifyUserName(){
		return this.modifyUserName;
	}

	/**
	 * 设置修改用户姓名
	 *@param java.lang.String 修改用户姓名
	 */
	public void setModifyUserName(java.lang.String modifyUserName){
		this.modifyUserName = modifyUserName;
	}


	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(Field f : fields) {
			if(Modifier.isStatic(f.getModifiers()) || Modifier.isFinal(f.getModifiers()))
				continue;
			Object value = null;
			try {
				f.setAccessible(true);
				value = f.get(this);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			if(value != null)
				sb.append(f.getName()).append('=').append(value).append(',');
		}
		sb.append(']');
		
		return sb.toString();
	}

}

