package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 系统公告查询标准
 * @author 
 */
public class SysNoticeCriteria extends BaseCriteria {
	public SysNoticeCriteria andOpidIsNull() {
        addCriterion("OPID is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidIsNotNull() {
        addCriterion("OPID is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidEqualTo(java.lang.Integer value) {
        addCriterion("OPID =", value, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidNotEqualTo(java.lang.Integer value) {
        addCriterion("OPID <>", value, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidGreaterThan(java.lang.Integer value) {
        addCriterion("OPID >", value, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidGreaterThanOrEqualTo(java.lang.Integer value) {
        addCriterion("OPID >=", value, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidLessThan(java.lang.Integer value) {
        addCriterion("OPID <", value, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidLessThanOrEqualTo(java.lang.Integer value) {
        addCriterion("OPID <=", value, "opid");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andOpidIn(List<java.lang.Integer> values) {
        addCriterion("OPID in", values, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidNotIn(List<java.lang.Integer> values) {
        addCriterion("OPID not in", values, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidBetween(java.lang.Integer value1, java.lang.Integer value2) {
        addCriterion("OPID between", value1, value2, "opid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOpidNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
        addCriterion("OPID not between", value1, value2, "opid");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andSubjectIsNull() {
        addCriterion("SUBJECT is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectIsNotNull() {
        addCriterion("SUBJECT is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectEqualTo(java.lang.String value) {
        addCriterion("SUBJECT =", value, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectNotEqualTo(java.lang.String value) {
        addCriterion("SUBJECT <>", value, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectGreaterThan(java.lang.String value) {
        addCriterion("SUBJECT >", value, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SUBJECT >=", value, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectLessThan(java.lang.String value) {
        addCriterion("SUBJECT <", value, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SUBJECT <=", value, "subject");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andSubjectLike(java.lang.String value) {
        addCriterion("SUBJECT like", value, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectNotLike(java.lang.String value) {
        addCriterion("SUBJECT not like", value, "subject");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andSubjectIn(List<java.lang.String> values) {
        addCriterion("SUBJECT in", values, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectNotIn(List<java.lang.String> values) {
        addCriterion("SUBJECT not in", values, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUBJECT between", value1, value2, "subject");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andSubjectNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUBJECT not between", value1, value2, "subject");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andContentIsNull() {
        addCriterion("CONTENT is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentIsNotNull() {
        addCriterion("CONTENT is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentEqualTo(String value) {
        addCriterion("CONTENT =", value, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentNotEqualTo(String value) {
        addCriterion("CONTENT <>", value, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentGreaterThan(String value) {
        addCriterion("CONTENT >", value, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentGreaterThanOrEqualTo(String value) {
        addCriterion("CONTENT >=", value, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentLessThan(String value) {
        addCriterion("CONTENT <", value, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentLessThanOrEqualTo(String value) {
        addCriterion("CONTENT <=", value, "content");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andContentIn(List<String> values) {
        addCriterion("CONTENT in", values, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentNotIn(List<String> values) {
        addCriterion("CONTENT not in", values, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentBetween(String value1, String value2) {
        addCriterion("CONTENT between", value1, value2, "content");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andContentNotBetween(String value1, String value2) {
        addCriterion("CONTENT not between", value1, value2, "content");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andAuthoridIsNull() {
        addCriterion("AUTHORID is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridIsNotNull() {
        addCriterion("AUTHORID is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridEqualTo(java.lang.String value) {
        addCriterion("AUTHORID =", value, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridNotEqualTo(java.lang.String value) {
        addCriterion("AUTHORID <>", value, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridGreaterThan(java.lang.String value) {
        addCriterion("AUTHORID >", value, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("AUTHORID >=", value, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridLessThan(java.lang.String value) {
        addCriterion("AUTHORID <", value, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridLessThanOrEqualTo(java.lang.String value) {
        addCriterion("AUTHORID <=", value, "authorid");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andAuthoridLike(java.lang.String value) {
        addCriterion("AUTHORID like", value, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridNotLike(java.lang.String value) {
        addCriterion("AUTHORID not like", value, "authorid");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andAuthoridIn(List<java.lang.String> values) {
        addCriterion("AUTHORID in", values, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridNotIn(List<java.lang.String> values) {
        addCriterion("AUTHORID not in", values, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("AUTHORID between", value1, value2, "authorid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthoridNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("AUTHORID not between", value1, value2, "authorid");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andAuthorIsNull() {
        addCriterion("AUTHOR is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorIsNotNull() {
        addCriterion("AUTHOR is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorEqualTo(java.lang.String value) {
        addCriterion("AUTHOR =", value, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorNotEqualTo(java.lang.String value) {
        addCriterion("AUTHOR <>", value, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorGreaterThan(java.lang.String value) {
        addCriterion("AUTHOR >", value, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("AUTHOR >=", value, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorLessThan(java.lang.String value) {
        addCriterion("AUTHOR <", value, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorLessThanOrEqualTo(java.lang.String value) {
        addCriterion("AUTHOR <=", value, "author");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andAuthorLike(java.lang.String value) {
        addCriterion("AUTHOR like", value, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorNotLike(java.lang.String value) {
        addCriterion("AUTHOR not like", value, "author");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andAuthorIn(List<java.lang.String> values) {
        addCriterion("AUTHOR in", values, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorNotIn(List<java.lang.String> values) {
        addCriterion("AUTHOR not in", values, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("AUTHOR between", value1, value2, "author");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andAuthorNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("AUTHOR not between", value1, value2, "author");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andOptimeIsNull() {
        addCriterion("OPTIME is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeIsNotNull() {
        addCriterion("OPTIME is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeEqualTo(java.util.Date value) {
        addCriterion("OPTIME =", value, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeNotEqualTo(java.util.Date value) {
        addCriterion("OPTIME <>", value, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeGreaterThan(java.util.Date value) {
        addCriterion("OPTIME >", value, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("OPTIME >=", value, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeLessThan(java.util.Date value) {
        addCriterion("OPTIME <", value, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("OPTIME <=", value, "optime");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andOptimeIn(List<java.util.Date> values) {
        addCriterion("OPTIME in", values, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeNotIn(List<java.util.Date> values) {
        addCriterion("OPTIME not in", values, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("OPTIME between", value1, value2, "optime");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andOptimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("OPTIME not between", value1, value2, "optime");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andIsPublishIsNull() {
        addCriterion("IS_PUBLISH is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishIsNotNull() {
        addCriterion("IS_PUBLISH is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishEqualTo(java.lang.String value) {
        addCriterion("IS_PUBLISH =", value, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishNotEqualTo(java.lang.String value) {
        addCriterion("IS_PUBLISH <>", value, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishGreaterThan(java.lang.String value) {
        addCriterion("IS_PUBLISH >", value, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_PUBLISH >=", value, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishLessThan(java.lang.String value) {
        addCriterion("IS_PUBLISH <", value, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishLessThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_PUBLISH <=", value, "isPublish");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andIsPublishLike(java.lang.String value) {
        addCriterion("IS_PUBLISH like", value, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishNotLike(java.lang.String value) {
        addCriterion("IS_PUBLISH not like", value, "isPublish");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andIsPublishIn(List<java.lang.String> values) {
        addCriterion("IS_PUBLISH in", values, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishNotIn(List<java.lang.String> values) {
        addCriterion("IS_PUBLISH not in", values, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_PUBLISH between", value1, value2, "isPublish");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsPublishNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_PUBLISH not between", value1, value2, "isPublish");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andIsWorktableIsNull() {
        addCriterion("IS_WORKTABLE is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableIsNotNull() {
        addCriterion("IS_WORKTABLE is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableEqualTo(java.lang.String value) {
        addCriterion("IS_WORKTABLE =", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableNotEqualTo(java.lang.String value) {
        addCriterion("IS_WORKTABLE <>", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableGreaterThan(java.lang.String value) {
        addCriterion("IS_WORKTABLE >", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_WORKTABLE >=", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableLessThan(java.lang.String value) {
        addCriterion("IS_WORKTABLE <", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableLessThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_WORKTABLE <=", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andIsWorktableLike(java.lang.String value) {
        addCriterion("IS_WORKTABLE like", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableNotLike(java.lang.String value) {
        addCriterion("IS_WORKTABLE not like", value, "isWorktable");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andIsWorktableIn(List<java.lang.String> values) {
        addCriterion("IS_WORKTABLE in", values, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableNotIn(List<java.lang.String> values) {
        addCriterion("IS_WORKTABLE not in", values, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_WORKTABLE between", value1, value2, "isWorktable");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andIsWorktableNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_WORKTABLE not between", value1, value2, "isWorktable");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andTimeLimitIsNull() {
        addCriterion("TIME_LIMIT is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitIsNotNull() {
        addCriterion("TIME_LIMIT is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitEqualTo(java.util.Date value) {
        addCriterion("TIME_LIMIT =", value, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitNotEqualTo(java.util.Date value) {
        addCriterion("TIME_LIMIT <>", value, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitGreaterThan(java.util.Date value) {
        addCriterion("TIME_LIMIT >", value, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("TIME_LIMIT >=", value, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitLessThan(java.util.Date value) {
        addCriterion("TIME_LIMIT <", value, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitLessThanOrEqualTo(java.util.Date value) {
        addCriterion("TIME_LIMIT <=", value, "timeLimit");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andTimeLimitIn(List<java.util.Date> values) {
        addCriterion("TIME_LIMIT in", values, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitNotIn(List<java.util.Date> values) {
        addCriterion("TIME_LIMIT not in", values, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("TIME_LIMIT between", value1, value2, "timeLimit");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andTimeLimitNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("TIME_LIMIT not between", value1, value2, "timeLimit");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andDeptidIsNull() {
        addCriterion("DEPTID is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidIsNotNull() {
        addCriterion("DEPTID is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidEqualTo(java.lang.String value) {
        addCriterion("DEPTID =", value, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidNotEqualTo(java.lang.String value) {
        addCriterion("DEPTID <>", value, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidGreaterThan(java.lang.String value) {
        addCriterion("DEPTID >", value, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPTID >=", value, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidLessThan(java.lang.String value) {
        addCriterion("DEPTID <", value, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPTID <=", value, "deptid");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andDeptidLike(java.lang.String value) {
        addCriterion("DEPTID like", value, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidNotLike(java.lang.String value) {
        addCriterion("DEPTID not like", value, "deptid");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andDeptidIn(List<java.lang.String> values) {
        addCriterion("DEPTID in", values, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidNotIn(List<java.lang.String> values) {
        addCriterion("DEPTID not in", values, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPTID between", value1, value2, "deptid");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPTID not between", value1, value2, "deptid");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andDeptnameIsNull() {
        addCriterion("DEPTNAME is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameIsNotNull() {
        addCriterion("DEPTNAME is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameEqualTo(java.lang.String value) {
        addCriterion("DEPTNAME =", value, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameNotEqualTo(java.lang.String value) {
        addCriterion("DEPTNAME <>", value, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameGreaterThan(java.lang.String value) {
        addCriterion("DEPTNAME >", value, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPTNAME >=", value, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameLessThan(java.lang.String value) {
        addCriterion("DEPTNAME <", value, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPTNAME <=", value, "deptname");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andDeptnameLike(java.lang.String value) {
        addCriterion("DEPTNAME like", value, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameNotLike(java.lang.String value) {
        addCriterion("DEPTNAME not like", value, "deptname");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andDeptnameIn(List<java.lang.String> values) {
        addCriterion("DEPTNAME in", values, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameNotIn(List<java.lang.String> values) {
        addCriterion("DEPTNAME not in", values, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPTNAME between", value1, value2, "deptname");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andDeptnameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPTNAME not between", value1, value2, "deptname");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysNoticeCriteria) this;
    }
	public SysNoticeCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysNoticeCriteria) this;
    }
    
    public SysNoticeCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysNoticeCriteria) this;
    }

    public SysNoticeCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysNoticeCriteria) this;
    }
}

