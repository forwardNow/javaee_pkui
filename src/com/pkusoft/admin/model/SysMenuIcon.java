package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class SysMenuIcon implements Serializable {

	/** 序列化版本号 */
	private static final long serialVersionUID = 1L;
	/** 图标编号 */
	private int iconId;
	/** 图标名称 */
	private String iconName;

	
	public SysMenuIcon(int iconId, String iconName) {
	    super();
	    this.iconId = iconId;
	    this.iconName = iconName;
    }

	public int getIconId() {
		return iconId;
	}

	public void setIconId(int iconId) {
		this.iconId = iconId;
	}

	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
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
