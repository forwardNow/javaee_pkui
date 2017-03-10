package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author
 */
public class SysMenuView extends BaseModel implements Serializable {
	/** 序列化版本号 */
	private static final long serialVersionUID = 1L;
	/** 菜单标识号 */
	private java.lang.Long menuId;
	/** 菜单名称 */
	private java.lang.String menuName;
	/** 菜单icon */
	private java.lang.String icon;
	/** 菜单树等级 */
	private java.lang.Long treeLevel;
	/** 父菜单编号 */
	private java.lang.Long treeParentid;

	/** 是否被选中 */
	private java.lang.String checked;

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

	public java.lang.String getIcon() {
		return icon;
	}

	public void setIcon(java.lang.String icon) {
		this.icon = icon;
	}

	public java.lang.String getChecked() {
		return checked;
	}

	public void setChecked(java.lang.String checked) {
		this.checked = checked;
	}

	public java.lang.Long getTreeLevel() {
		return treeLevel;
	}

	public void setTreeLevel(java.lang.Long treeLevel) {
		this.treeLevel = treeLevel;
	}

	public java.lang.Long getTreeParentid() {
		return treeParentid;
	}

	public void setTreeParentid(java.lang.Long treeParentid) {
		this.treeParentid = treeParentid;
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
