package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 数据归属单位主键对象
 * @author 
 */
public class SysDeptReleKey extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**单位编号*/
	private java.lang.String deptId;
	/**数据归属单位编号*/
	private java.lang.String releDeptId;

	/**
	 * 取得单位编号
	 *@return java.lang.String 单位编号
	 */
	public java.lang.String getDeptId(){
		return this.deptId;
	}

	/**
	 * 设置单位编号
	 *@param java.lang.String 单位编号
	 */
	public void setDeptId(java.lang.String deptId){
		this.deptId = deptId;
	}
	/**
	 * 取得数据归属单位编号
	 *@return java.lang.String 数据归属单位编号
	 */
	public java.lang.String getReleDeptId(){
		return this.releDeptId;
	}

	/**
	 * 设置数据归属单位编号
	 *@param java.lang.String 数据归属单位编号
	 */
	public void setReleDeptId(java.lang.String releDeptId){
		this.releDeptId = releDeptId;
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

