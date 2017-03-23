package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author
 */
public class SysResourceView extends BaseModel implements Serializable {
	/** 序列化版本号 */
	private static final long serialVersionUID = 1L;
	/** 资源标识号 */
	private java.lang.Long resourceId;
	/** 资源名称 */
	private java.lang.String resourceName;
	/** 资源描述 */
	private java.lang.String resourceDesc;
	/** 资源级别 */
	private java.lang.Long resourceLevel;
	/** 菜单标识号 */
	private java.lang.Long menuId;
	/** 菜单名称 */
	private java.lang.String menuName;
	/** 菜单排序 */
	private java.lang.Long orderFlag;
	/** 是否选中 */
	private java.lang.String checked;

	public java.lang.Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(java.lang.Long resourceId) {
		this.resourceId = resourceId;
	}

	public java.lang.String getResourceName() {
		return resourceName;
	}

	public void setResourceName(java.lang.String resourceName) {
		this.resourceName = resourceName;
	}

	public java.lang.String getResourceDesc() {
		return resourceDesc;
	}

	public void setResourceDesc(java.lang.String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	public java.lang.Long getResourceLevel() {
		return resourceLevel;
	}

	public void setResourceLevel(java.lang.Long resourceLevel) {
		this.resourceLevel = resourceLevel;
	}

	public java.lang.Long getMenuId() {
		return menuId;
	}

	public void setMenuId(java.lang.Long menuId) {
		this.menuId = menuId;
	}

	public java.lang.String getMenuName() {
		return menuName;
	}

	public void setMenuName(java.lang.String menuName) {
		this.menuName = menuName;
	}

	public java.lang.Long getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(java.lang.Long orderFlag) {
		this.orderFlag = orderFlag;
	}

	public java.lang.String getChecked() {
		return checked;
	}

	public void setChecked(java.lang.String checked) {
		this.checked = checked;
	}

	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (Field f : fields) {
			if (Modifier.isStatic(f.getModifiers())
			        || Modifier.isFinal(f.getModifiers()))
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
			if (value != null)
				sb.append(f.getName()).append('=').append(value).append(',');
		}
		sb.append(']');

		return sb.toString();
	}

}
