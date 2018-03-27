package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YunWorklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunWorklistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Long value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Long value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Long value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Long value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Long value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Long value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Long> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Long> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Long value1, Long value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Long value1, Long value2) {
            addCriterion("workid not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidIsNull() {
            addCriterion("worktypeid is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeidIsNotNull() {
            addCriterion("worktypeid is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeidEqualTo(Long value) {
            addCriterion("worktypeid =", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidNotEqualTo(Long value) {
            addCriterion("worktypeid <>", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidGreaterThan(Long value) {
            addCriterion("worktypeid >", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("worktypeid >=", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidLessThan(Long value) {
            addCriterion("worktypeid <", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidLessThanOrEqualTo(Long value) {
            addCriterion("worktypeid <=", value, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidIn(List<Long> values) {
            addCriterion("worktypeid in", values, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidNotIn(List<Long> values) {
            addCriterion("worktypeid not in", values, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidBetween(Long value1, Long value2) {
            addCriterion("worktypeid between", value1, value2, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andWorktypeidNotBetween(Long value1, Long value2) {
            addCriterion("worktypeid not between", value1, value2, "worktypeid");
            return (Criteria) this;
        }

        public Criteria andProblemcontentIsNull() {
            addCriterion("problemcontent is null");
            return (Criteria) this;
        }

        public Criteria andProblemcontentIsNotNull() {
            addCriterion("problemcontent is not null");
            return (Criteria) this;
        }

        public Criteria andProblemcontentEqualTo(String value) {
            addCriterion("problemcontent =", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentNotEqualTo(String value) {
            addCriterion("problemcontent <>", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentGreaterThan(String value) {
            addCriterion("problemcontent >", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentGreaterThanOrEqualTo(String value) {
            addCriterion("problemcontent >=", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentLessThan(String value) {
            addCriterion("problemcontent <", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentLessThanOrEqualTo(String value) {
            addCriterion("problemcontent <=", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentLike(String value) {
            addCriterion("problemcontent like", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentNotLike(String value) {
            addCriterion("problemcontent not like", value, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentIn(List<String> values) {
            addCriterion("problemcontent in", values, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentNotIn(List<String> values) {
            addCriterion("problemcontent not in", values, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentBetween(String value1, String value2) {
            addCriterion("problemcontent between", value1, value2, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andProblemcontentNotBetween(String value1, String value2) {
            addCriterion("problemcontent not between", value1, value2, "problemcontent");
            return (Criteria) this;
        }

        public Criteria andCommittimeIsNull() {
            addCriterion("committime is null");
            return (Criteria) this;
        }

        public Criteria andCommittimeIsNotNull() {
            addCriterion("committime is not null");
            return (Criteria) this;
        }

        public Criteria andCommittimeEqualTo(Date value) {
            addCriterion("committime =", value, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeNotEqualTo(Date value) {
            addCriterion("committime <>", value, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeGreaterThan(Date value) {
            addCriterion("committime >", value, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("committime >=", value, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeLessThan(Date value) {
            addCriterion("committime <", value, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeLessThanOrEqualTo(Date value) {
            addCriterion("committime <=", value, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeIn(List<Date> values) {
            addCriterion("committime in", values, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeNotIn(List<Date> values) {
            addCriterion("committime not in", values, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeBetween(Date value1, Date value2) {
            addCriterion("committime between", value1, value2, "committime");
            return (Criteria) this;
        }

        public Criteria andCommittimeNotBetween(Date value1, Date value2) {
            addCriterion("committime not between", value1, value2, "committime");
            return (Criteria) this;
        }

        public Criteria andWorkstateIsNull() {
            addCriterion("workstate is null");
            return (Criteria) this;
        }

        public Criteria andWorkstateIsNotNull() {
            addCriterion("workstate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstateEqualTo(Short value) {
            addCriterion("workstate =", value, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateNotEqualTo(Short value) {
            addCriterion("workstate <>", value, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateGreaterThan(Short value) {
            addCriterion("workstate >", value, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateGreaterThanOrEqualTo(Short value) {
            addCriterion("workstate >=", value, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateLessThan(Short value) {
            addCriterion("workstate <", value, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateLessThanOrEqualTo(Short value) {
            addCriterion("workstate <=", value, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateIn(List<Short> values) {
            addCriterion("workstate in", values, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateNotIn(List<Short> values) {
            addCriterion("workstate not in", values, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateBetween(Short value1, Short value2) {
            addCriterion("workstate between", value1, value2, "workstate");
            return (Criteria) this;
        }

        public Criteria andWorkstateNotBetween(Short value1, Short value2) {
            addCriterion("workstate not between", value1, value2, "workstate");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}