package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysMessage extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**消息编号*/
	private java.lang.Long msgId;
	/**消息标题*/
	private java.lang.String msgTitle;
	/**消息内容*/
	private java.lang.String msgContent;
	/**消息类型*/
	private java.lang.String msgType;
	/**发送用户IP*/
	private java.lang.String sendUserIp;
	/**发送用户编号*/
	private java.lang.Long sendUserId;
	/**发送用户姓名*/
	private java.lang.String sendUserName;
	/**发送时间*/
	private java.util.Date sendTime;
	/**发送方删除标识*/
	private java.lang.String sendDelFlag;
	/**接受方删除标识*/
	private java.lang.String receiveDelFlag;
	/**已读标识*/
	private java.lang.String readFlag;
	/**接收用户IP*/
	private java.lang.String receiveUserIp;
	/**接收用户编号*/
	private java.lang.Long receiveUserId;
	/**接收用户姓名*/
	private java.lang.String receiveUserName;
	/**接收时间*/
	private java.util.Date receiveTime;
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
	 * 取得消息编号
	 *@return java.lang.Long 消息编号
	 */
	public java.lang.Long getMsgId(){
		return this.msgId;
	}

	/**
	 * 设置消息编号
	 *@param java.lang.Long 消息编号
	 */
	public void setMsgId(java.lang.Long msgId){
		this.msgId = msgId;
	}
	/**
	 * 取得消息标题
	 *@return java.lang.String 消息标题
	 */
	public java.lang.String getMsgTitle(){
		return this.msgTitle;
	}

	/**
	 * 设置消息标题
	 *@param java.lang.String 消息标题
	 */
	public void setMsgTitle(java.lang.String msgTitle){
		this.msgTitle = msgTitle;
	}
	/**
	 * 取得消息内容
	 *@return java.lang.String 消息内容
	 */
	public java.lang.String getMsgContent(){
		return this.msgContent;
	}

	/**
	 * 设置消息内容
	 *@param java.lang.String 消息内容
	 */
	public void setMsgContent(java.lang.String msgContent){
		this.msgContent = msgContent;
	}
	/**
	 * 取得消息类型
	 *@return java.lang.String 消息类型
	 */
	public java.lang.String getMsgType(){
		return this.msgType;
	}

	/**
	 * 设置消息类型
	 *@param java.lang.String 消息类型
	 */
	public void setMsgType(java.lang.String msgType){
		this.msgType = msgType;
	}
	/**
	 * 取得发送用户IP
	 *@return java.lang.String 发送用户IP
	 */
	public java.lang.String getSendUserIp(){
		return this.sendUserIp;
	}

	/**
	 * 设置发送用户IP
	 *@param java.lang.String 发送用户IP
	 */
	public void setSendUserIp(java.lang.String sendUserIp){
		this.sendUserIp = sendUserIp;
	}
	/**
	 * 取得发送用户编号
	 *@return java.lang.Long 发送用户编号
	 */
	public java.lang.Long getSendUserId(){
		return this.sendUserId;
	}

	/**
	 * 设置发送用户编号
	 *@param java.lang.Long 发送用户编号
	 */
	public void setSendUserId(java.lang.Long sendUserId){
		this.sendUserId = sendUserId;
	}
	/**
	 * 取得发送用户姓名
	 *@return java.lang.String 发送用户姓名
	 */
	public java.lang.String getSendUserName(){
		return this.sendUserName;
	}

	/**
	 * 设置发送用户姓名
	 *@param java.lang.String 发送用户姓名
	 */
	public void setSendUserName(java.lang.String sendUserName){
		this.sendUserName = sendUserName;
	}
	/**
	 * 取得发送时间
	 *@return java.util.Date 发送时间
	 */
	public java.util.Date getSendTime(){
		return this.sendTime;
	}

	/**
	 * 设置发送时间
	 *@param java.util.Date 发送时间
	 */
	public void setSendTime(java.util.Date sendTime){
		this.sendTime = sendTime;
	}
	/**
	 * 取得发送方删除标识
	 *@return java.lang.String 发送方删除标识
	 */
	public java.lang.String getSendDelFlag(){
		return this.sendDelFlag;
	}

	/**
	 * 设置发送方删除标识
	 *@param java.lang.String 发送方删除标识
	 */
	public void setSendDelFlag(java.lang.String sendDelFlag){
		this.sendDelFlag = sendDelFlag;
	}
	/**
	 * 取得接受方删除标识
	 *@return java.lang.String 接受方删除标识
	 */
	public java.lang.String getReceiveDelFlag(){
		return this.receiveDelFlag;
	}

	/**
	 * 设置接受方删除标识
	 *@param java.lang.String 接受方删除标识
	 */
	public void setReceiveDelFlag(java.lang.String receiveDelFlag){
		this.receiveDelFlag = receiveDelFlag;
	}
	/**
	 * 取得已读标识
	 *@return java.lang.String 已读标识
	 */
	public java.lang.String getReadFlag(){
		return this.readFlag;
	}

	/**
	 * 设置已读标识
	 *@param java.lang.String 已读标识
	 */
	public void setReadFlag(java.lang.String readFlag){
		this.readFlag = readFlag;
	}
	/**
	 * 取得接收用户IP
	 *@return java.lang.String 接收用户IP
	 */
	public java.lang.String getReceiveUserIp(){
		return this.receiveUserIp;
	}

	/**
	 * 设置接收用户IP
	 *@param java.lang.String 接收用户IP
	 */
	public void setReceiveUserIp(java.lang.String receiveUserIp){
		this.receiveUserIp = receiveUserIp;
	}
	/**
	 * 取得接收用户编号
	 *@return java.lang.Long 接收用户编号
	 */
	public java.lang.Long getReceiveUserId(){
		return this.receiveUserId;
	}

	/**
	 * 设置接收用户编号
	 *@param java.lang.Long 接收用户编号
	 */
	public void setReceiveUserId(java.lang.Long receiveUserId){
		this.receiveUserId = receiveUserId;
	}
	/**
	 * 取得接收用户姓名
	 *@return java.lang.String 接收用户姓名
	 */
	public java.lang.String getReceiveUserName(){
		return this.receiveUserName;
	}

	/**
	 * 设置接收用户姓名
	 *@param java.lang.String 接收用户姓名
	 */
	public void setReceiveUserName(java.lang.String receiveUserName){
		this.receiveUserName = receiveUserName;
	}
	/**
	 * 取得接收时间
	 *@return java.util.Date 接收时间
	 */
	public java.util.Date getReceiveTime(){
		return this.receiveTime;
	}

	/**
	 * 设置接收时间
	 *@param java.util.Date 接收时间
	 */
	public void setReceiveTime(java.util.Date receiveTime){
		this.receiveTime = receiveTime;
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

