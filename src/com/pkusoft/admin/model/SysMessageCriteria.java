package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysMessageCriteria extends BaseCriteria {
	public SysMessageCriteria andMsgIdIsNull() {
        addCriterion("MSG_ID is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdIsNotNull() {
        addCriterion("MSG_ID is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdEqualTo(java.lang.Long value) {
        addCriterion("MSG_ID =", value, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdNotEqualTo(java.lang.Long value) {
        addCriterion("MSG_ID <>", value, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdGreaterThan(java.lang.Long value) {
        addCriterion("MSG_ID >", value, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MSG_ID >=", value, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdLessThan(java.lang.Long value) {
        addCriterion("MSG_ID <", value, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MSG_ID <=", value, "msgId");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andMsgIdIn(List<java.lang.Long> values) {
        addCriterion("MSG_ID in", values, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdNotIn(List<java.lang.Long> values) {
        addCriterion("MSG_ID not in", values, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MSG_ID between", value1, value2, "msgId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MSG_ID not between", value1, value2, "msgId");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andMsgTitleIsNull() {
        addCriterion("MSG_TITLE is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleIsNotNull() {
        addCriterion("MSG_TITLE is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleEqualTo(java.lang.String value) {
        addCriterion("MSG_TITLE =", value, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleNotEqualTo(java.lang.String value) {
        addCriterion("MSG_TITLE <>", value, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleGreaterThan(java.lang.String value) {
        addCriterion("MSG_TITLE >", value, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MSG_TITLE >=", value, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleLessThan(java.lang.String value) {
        addCriterion("MSG_TITLE <", value, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MSG_TITLE <=", value, "msgTitle");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andMsgTitleLike(java.lang.String value) {
        addCriterion("MSG_TITLE like", value, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleNotLike(java.lang.String value) {
        addCriterion("MSG_TITLE not like", value, "msgTitle");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andMsgTitleIn(List<java.lang.String> values) {
        addCriterion("MSG_TITLE in", values, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleNotIn(List<java.lang.String> values) {
        addCriterion("MSG_TITLE not in", values, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MSG_TITLE between", value1, value2, "msgTitle");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTitleNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MSG_TITLE not between", value1, value2, "msgTitle");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andMsgContentIsNull() {
        addCriterion("MSG_CONTENT is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentIsNotNull() {
        addCriterion("MSG_CONTENT is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentEqualTo(java.lang.String value) {
        addCriterion("MSG_CONTENT =", value, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentNotEqualTo(java.lang.String value) {
        addCriterion("MSG_CONTENT <>", value, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentGreaterThan(java.lang.String value) {
        addCriterion("MSG_CONTENT >", value, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MSG_CONTENT >=", value, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentLessThan(java.lang.String value) {
        addCriterion("MSG_CONTENT <", value, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MSG_CONTENT <=", value, "msgContent");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andMsgContentLike(java.lang.String value) {
        addCriterion("MSG_CONTENT like", value, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentNotLike(java.lang.String value) {
        addCriterion("MSG_CONTENT not like", value, "msgContent");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andMsgContentIn(List<java.lang.String> values) {
        addCriterion("MSG_CONTENT in", values, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentNotIn(List<java.lang.String> values) {
        addCriterion("MSG_CONTENT not in", values, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MSG_CONTENT between", value1, value2, "msgContent");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgContentNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MSG_CONTENT not between", value1, value2, "msgContent");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andMsgTypeIsNull() {
        addCriterion("MSG_TYPE is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeIsNotNull() {
        addCriterion("MSG_TYPE is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeEqualTo(java.lang.String value) {
        addCriterion("MSG_TYPE =", value, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeNotEqualTo(java.lang.String value) {
        addCriterion("MSG_TYPE <>", value, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeGreaterThan(java.lang.String value) {
        addCriterion("MSG_TYPE >", value, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MSG_TYPE >=", value, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeLessThan(java.lang.String value) {
        addCriterion("MSG_TYPE <", value, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MSG_TYPE <=", value, "msgType");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andMsgTypeLike(java.lang.String value) {
        addCriterion("MSG_TYPE like", value, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeNotLike(java.lang.String value) {
        addCriterion("MSG_TYPE not like", value, "msgType");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andMsgTypeIn(List<java.lang.String> values) {
        addCriterion("MSG_TYPE in", values, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeNotIn(List<java.lang.String> values) {
        addCriterion("MSG_TYPE not in", values, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MSG_TYPE between", value1, value2, "msgType");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andMsgTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MSG_TYPE not between", value1, value2, "msgType");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andSendUserIpIsNull() {
        addCriterion("SEND_USER_IP is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpIsNotNull() {
        addCriterion("SEND_USER_IP is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_IP =", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpNotEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_IP <>", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpGreaterThan(java.lang.String value) {
        addCriterion("SEND_USER_IP >", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_IP >=", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpLessThan(java.lang.String value) {
        addCriterion("SEND_USER_IP <", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_IP <=", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendUserIpLike(java.lang.String value) {
        addCriterion("SEND_USER_IP like", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpNotLike(java.lang.String value) {
        addCriterion("SEND_USER_IP not like", value, "sendUserIp");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendUserIpIn(List<java.lang.String> values) {
        addCriterion("SEND_USER_IP in", values, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpNotIn(List<java.lang.String> values) {
        addCriterion("SEND_USER_IP not in", values, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SEND_USER_IP between", value1, value2, "sendUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIpNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SEND_USER_IP not between", value1, value2, "sendUserIp");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andSendUserIdIsNull() {
        addCriterion("SEND_USER_ID is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdIsNotNull() {
        addCriterion("SEND_USER_ID is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdEqualTo(java.lang.Long value) {
        addCriterion("SEND_USER_ID =", value, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("SEND_USER_ID <>", value, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdGreaterThan(java.lang.Long value) {
        addCriterion("SEND_USER_ID >", value, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("SEND_USER_ID >=", value, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdLessThan(java.lang.Long value) {
        addCriterion("SEND_USER_ID <", value, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("SEND_USER_ID <=", value, "sendUserId");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendUserIdIn(List<java.lang.Long> values) {
        addCriterion("SEND_USER_ID in", values, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("SEND_USER_ID not in", values, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("SEND_USER_ID between", value1, value2, "sendUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("SEND_USER_ID not between", value1, value2, "sendUserId");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andSendUserNameIsNull() {
        addCriterion("SEND_USER_NAME is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameIsNotNull() {
        addCriterion("SEND_USER_NAME is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_NAME =", value, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameNotEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_NAME <>", value, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameGreaterThan(java.lang.String value) {
        addCriterion("SEND_USER_NAME >", value, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_NAME >=", value, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameLessThan(java.lang.String value) {
        addCriterion("SEND_USER_NAME <", value, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SEND_USER_NAME <=", value, "sendUserName");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendUserNameLike(java.lang.String value) {
        addCriterion("SEND_USER_NAME like", value, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameNotLike(java.lang.String value) {
        addCriterion("SEND_USER_NAME not like", value, "sendUserName");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendUserNameIn(List<java.lang.String> values) {
        addCriterion("SEND_USER_NAME in", values, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameNotIn(List<java.lang.String> values) {
        addCriterion("SEND_USER_NAME not in", values, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SEND_USER_NAME between", value1, value2, "sendUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SEND_USER_NAME not between", value1, value2, "sendUserName");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andSendTimeIsNull() {
        addCriterion("SEND_TIME is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeIsNotNull() {
        addCriterion("SEND_TIME is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeEqualTo(java.util.Date value) {
        addCriterion("SEND_TIME =", value, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeNotEqualTo(java.util.Date value) {
        addCriterion("SEND_TIME <>", value, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeGreaterThan(java.util.Date value) {
        addCriterion("SEND_TIME >", value, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("SEND_TIME >=", value, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeLessThan(java.util.Date value) {
        addCriterion("SEND_TIME <", value, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("SEND_TIME <=", value, "sendTime");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendTimeIn(List<java.util.Date> values) {
        addCriterion("SEND_TIME in", values, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeNotIn(List<java.util.Date> values) {
        addCriterion("SEND_TIME not in", values, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("SEND_TIME between", value1, value2, "sendTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("SEND_TIME not between", value1, value2, "sendTime");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andSendDelFlagIsNull() {
        addCriterion("SEND_DEL_FLAG is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagIsNotNull() {
        addCriterion("SEND_DEL_FLAG is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagEqualTo(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG =", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagNotEqualTo(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG <>", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagGreaterThan(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG >", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG >=", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagLessThan(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG <", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG <=", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendDelFlagLike(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG like", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagNotLike(java.lang.String value) {
        addCriterion("SEND_DEL_FLAG not like", value, "sendDelFlag");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andSendDelFlagIn(List<java.lang.String> values) {
        addCriterion("SEND_DEL_FLAG in", values, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagNotIn(List<java.lang.String> values) {
        addCriterion("SEND_DEL_FLAG not in", values, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SEND_DEL_FLAG between", value1, value2, "sendDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andSendDelFlagNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SEND_DEL_FLAG not between", value1, value2, "sendDelFlag");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReceiveDelFlagIsNull() {
        addCriterion("RECEIVE_DEL_FLAG is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagIsNotNull() {
        addCriterion("RECEIVE_DEL_FLAG is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG =", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagNotEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG <>", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagGreaterThan(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG >", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG >=", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagLessThan(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG <", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG <=", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveDelFlagLike(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG like", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagNotLike(java.lang.String value) {
        addCriterion("RECEIVE_DEL_FLAG not like", value, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveDelFlagIn(List<java.lang.String> values) {
        addCriterion("RECEIVE_DEL_FLAG in", values, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagNotIn(List<java.lang.String> values) {
        addCriterion("RECEIVE_DEL_FLAG not in", values, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RECEIVE_DEL_FLAG between", value1, value2, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveDelFlagNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RECEIVE_DEL_FLAG not between", value1, value2, "receiveDelFlag");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReadFlagIsNull() {
        addCriterion("READ_FLAG is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagIsNotNull() {
        addCriterion("READ_FLAG is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagEqualTo(java.lang.String value) {
        addCriterion("READ_FLAG =", value, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagNotEqualTo(java.lang.String value) {
        addCriterion("READ_FLAG <>", value, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagGreaterThan(java.lang.String value) {
        addCriterion("READ_FLAG >", value, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("READ_FLAG >=", value, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagLessThan(java.lang.String value) {
        addCriterion("READ_FLAG <", value, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagLessThanOrEqualTo(java.lang.String value) {
        addCriterion("READ_FLAG <=", value, "readFlag");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReadFlagLike(java.lang.String value) {
        addCriterion("READ_FLAG like", value, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagNotLike(java.lang.String value) {
        addCriterion("READ_FLAG not like", value, "readFlag");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReadFlagIn(List<java.lang.String> values) {
        addCriterion("READ_FLAG in", values, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagNotIn(List<java.lang.String> values) {
        addCriterion("READ_FLAG not in", values, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("READ_FLAG between", value1, value2, "readFlag");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReadFlagNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("READ_FLAG not between", value1, value2, "readFlag");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReceiveUserIpIsNull() {
        addCriterion("RECEIVE_USER_IP is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpIsNotNull() {
        addCriterion("RECEIVE_USER_IP is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP =", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpNotEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP <>", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpGreaterThan(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP >", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP >=", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpLessThan(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP <", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP <=", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveUserIpLike(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP like", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpNotLike(java.lang.String value) {
        addCriterion("RECEIVE_USER_IP not like", value, "receiveUserIp");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveUserIpIn(List<java.lang.String> values) {
        addCriterion("RECEIVE_USER_IP in", values, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpNotIn(List<java.lang.String> values) {
        addCriterion("RECEIVE_USER_IP not in", values, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RECEIVE_USER_IP between", value1, value2, "receiveUserIp");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIpNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RECEIVE_USER_IP not between", value1, value2, "receiveUserIp");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReceiveUserIdIsNull() {
        addCriterion("RECEIVE_USER_ID is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdIsNotNull() {
        addCriterion("RECEIVE_USER_ID is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdEqualTo(java.lang.Long value) {
        addCriterion("RECEIVE_USER_ID =", value, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("RECEIVE_USER_ID <>", value, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdGreaterThan(java.lang.Long value) {
        addCriterion("RECEIVE_USER_ID >", value, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("RECEIVE_USER_ID >=", value, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdLessThan(java.lang.Long value) {
        addCriterion("RECEIVE_USER_ID <", value, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("RECEIVE_USER_ID <=", value, "receiveUserId");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveUserIdIn(List<java.lang.Long> values) {
        addCriterion("RECEIVE_USER_ID in", values, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("RECEIVE_USER_ID not in", values, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("RECEIVE_USER_ID between", value1, value2, "receiveUserId");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("RECEIVE_USER_ID not between", value1, value2, "receiveUserId");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReceiveUserNameIsNull() {
        addCriterion("RECEIVE_USER_NAME is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameIsNotNull() {
        addCriterion("RECEIVE_USER_NAME is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME =", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameNotEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME <>", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameGreaterThan(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME >", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME >=", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameLessThan(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME <", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME <=", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveUserNameLike(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME like", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameNotLike(java.lang.String value) {
        addCriterion("RECEIVE_USER_NAME not like", value, "receiveUserName");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveUserNameIn(List<java.lang.String> values) {
        addCriterion("RECEIVE_USER_NAME in", values, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameNotIn(List<java.lang.String> values) {
        addCriterion("RECEIVE_USER_NAME not in", values, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RECEIVE_USER_NAME between", value1, value2, "receiveUserName");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RECEIVE_USER_NAME not between", value1, value2, "receiveUserName");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReceiveTimeIsNull() {
        addCriterion("RECEIVE_TIME is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeIsNotNull() {
        addCriterion("RECEIVE_TIME is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeEqualTo(java.util.Date value) {
        addCriterion("RECEIVE_TIME =", value, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeNotEqualTo(java.util.Date value) {
        addCriterion("RECEIVE_TIME <>", value, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeGreaterThan(java.util.Date value) {
        addCriterion("RECEIVE_TIME >", value, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("RECEIVE_TIME >=", value, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeLessThan(java.util.Date value) {
        addCriterion("RECEIVE_TIME <", value, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("RECEIVE_TIME <=", value, "receiveTime");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReceiveTimeIn(List<java.util.Date> values) {
        addCriterion("RECEIVE_TIME in", values, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeNotIn(List<java.util.Date> values) {
        addCriterion("RECEIVE_TIME not in", values, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReceiveTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysMessageCriteria) this;
    }
	public SysMessageCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysMessageCriteria) this;
    }
    
    public SysMessageCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysMessageCriteria) this;
    }

    public SysMessageCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysMessageCriteria) this;
    }
}

