package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 系统公告对象
 * @author 
 */
public class SysNotice extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**操作编号*/
	private java.lang.Long opid;
	/**标题*/
	private java.lang.String subject;
	/**内容*/
	private String content;
	/**作者编号*/
	private java.lang.String authorid;
	/**作者*/
	private java.lang.String author;
	/**操作时间*/
	private java.util.Date optime;
	/**是否发布，0为不显示在首页，1为显示在首页，9为置顶*/
	private java.lang.String isPublish;
	/**是否显示在工作台上，0-不显示，1-显示*/
	private java.lang.String isWorktable;
	/**工作台显示有效期截止日期*/
	private java.util.Date timeLimit;
	/**单位ID只针对市局*/
	private java.lang.String deptid;
	/**单位名称只针对市局*/
	private java.lang.String deptname;
	/**预留字段1*/
	private java.lang.String reserve1;
	/**预留字段2*/
	private java.lang.String reserve2;
	/**预留字段3*/
	private java.lang.String reserve3;
	/**预留字段4*/
	private java.lang.String reserve4;
	/**预留字段5*/
	private java.lang.String reserve5;

	/**
	 * 取得操作编号
	 *@return java.lang.Integer 操作编号
	 */
	public java.lang.Long getOpid(){
		return this.opid;
	}

	/**
	 * 设置操作编号
	 *@param java.lang.Integer 操作编号
	 */
	public void setOpid(java.lang.Long opid){
		this.opid = opid;
	}
	/**
	 * 取得标题
	 *@return java.lang.String 标题
	 */
	public java.lang.String getSubject(){
		return this.subject;
	}

	/**
	 * 设置标题
	 *@param java.lang.String 标题
	 */
	public void setSubject(java.lang.String subject){
		this.subject = subject;
	}
	/**
	 * 取得内容
	 *@return java.sql.Clob 内容
	 */
	public String getContent(){
		return this.content;
	}

	/**
	 * 设置内容
	 *@param java.sql.Clob 内容
	 */
	public void setContent(String content){
		this.content = content;
	}
	/**
	 * 取得作者编号
	 *@return java.lang.String 作者编号
	 */
	public java.lang.String getAuthorid(){
		return this.authorid;
	}

	/**
	 * 设置作者编号
	 *@param java.lang.String 作者编号
	 */
	public void setAuthorid(java.lang.String authorid){
		this.authorid = authorid;
	}
	/**
	 * 取得作者
	 *@return java.lang.String 作者
	 */
	public java.lang.String getAuthor(){
		return this.author;
	}

	/**
	 * 设置作者
	 *@param java.lang.String 作者
	 */
	public void setAuthor(java.lang.String author){
		this.author = author;
	}
	/**
	 * 取得操作时间
	 *@return java.util.Date 操作时间
	 */
	public java.util.Date getOptime(){
		return this.optime;
	}

	/**
	 * 设置操作时间
	 *@param java.util.Date 操作时间
	 */
	public void setOptime(java.util.Date optime){
		this.optime = optime;
	}
	/**
	 * 取得是否发布，0为不显示在首页，1为显示在首页，9为置顶
	 *@return java.lang.String 是否发布，0为不显示在首页，1为显示在首页，9为置顶
	 */
	public java.lang.String getIsPublish(){
		return this.isPublish;
	}

	/**
	 * 设置是否发布，0为不显示在首页，1为显示在首页，9为置顶
	 *@param java.lang.String 是否发布，0为不显示在首页，1为显示在首页，9为置顶
	 */
	public void setIsPublish(java.lang.String isPublish){
		this.isPublish = isPublish;
	}
	/**
	 * 取得是否显示在工作台上，0-不显示，1-显示
	 *@return java.lang.String 是否显示在工作台上，0-不显示，1-显示
	 */
	public java.lang.String getIsWorktable(){
		return this.isWorktable;
	}

	/**
	 * 设置是否显示在工作台上，0-不显示，1-显示
	 *@param java.lang.String 是否显示在工作台上，0-不显示，1-显示
	 */
	public void setIsWorktable(java.lang.String isWorktable){
		this.isWorktable = isWorktable;
	}
	/**
	 * 取得工作台显示有效期截止日期
	 *@return java.util.Date 工作台显示有效期截止日期
	 */
	public java.util.Date getTimeLimit(){
		return this.timeLimit;
	}

	/**
	 * 设置工作台显示有效期截止日期
	 *@param java.util.Date 工作台显示有效期截止日期
	 */
	public void setTimeLimit(java.util.Date timeLimit){
		this.timeLimit = timeLimit;
	}
	/**
	 * 取得单位ID只针对市局
	 *@return java.lang.String 单位ID只针对市局
	 */
	public java.lang.String getDeptid(){
		return this.deptid;
	}

	/**
	 * 设置单位ID只针对市局
	 *@param java.lang.String 单位ID只针对市局
	 */
	public void setDeptid(java.lang.String deptid){
		this.deptid = deptid;
	}
	/**
	 * 取得单位名称只针对市局
	 *@return java.lang.String 单位名称只针对市局
	 */
	public java.lang.String getDeptname(){
		return this.deptname;
	}

	/**
	 * 设置单位名称只针对市局
	 *@param java.lang.String 单位名称只针对市局
	 */
	public void setDeptname(java.lang.String deptname){
		this.deptname = deptname;
	}
	/**
	 * 取得预留字段1
	 *@return java.lang.String 预留字段1
	 */
	public java.lang.String getReserve1(){
		return this.reserve1;
	}

	/**
	 * 设置预留字段1
	 *@param java.lang.String 预留字段1
	 */
	public void setReserve1(java.lang.String reserve1){
		this.reserve1 = reserve1;
	}
	/**
	 * 取得预留字段2
	 *@return java.lang.String 预留字段2
	 */
	public java.lang.String getReserve2(){
		return this.reserve2;
	}

	/**
	 * 设置预留字段2
	 *@param java.lang.String 预留字段2
	 */
	public void setReserve2(java.lang.String reserve2){
		this.reserve2 = reserve2;
	}
	/**
	 * 取得预留字段3
	 *@return java.lang.String 预留字段3
	 */
	public java.lang.String getReserve3(){
		return this.reserve3;
	}

	/**
	 * 设置预留字段3
	 *@param java.lang.String 预留字段3
	 */
	public void setReserve3(java.lang.String reserve3){
		this.reserve3 = reserve3;
	}
	/**
	 * 取得预留字段4
	 *@return java.lang.String 预留字段4
	 */
	public java.lang.String getReserve4(){
		return this.reserve4;
	}

	/**
	 * 设置预留字段4
	 *@param java.lang.String 预留字段4
	 */
	public void setReserve4(java.lang.String reserve4){
		this.reserve4 = reserve4;
	}
	/**
	 * 取得预留字段5
	 *@return java.lang.String 预留字段5
	 */
	public java.lang.String getReserve5(){
		return this.reserve5;
	}

	/**
	 * 设置预留字段5
	 *@param java.lang.String 预留字段5
	 */
	public void setReserve5(java.lang.String reserve5){
		this.reserve5 = reserve5;
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

