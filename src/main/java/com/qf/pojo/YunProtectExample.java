package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YunProtectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunProtectExample() {
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

        public Criteria andProtectidIsNull() {
            addCriterion("protectid is null");
            return (Criteria) this;
        }

        public Criteria andProtectidIsNotNull() {
            addCriterion("protectid is not null");
            return (Criteria) this;
        }

        public Criteria andProtectidEqualTo(Long value) {
            addCriterion("protectid =", value, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidNotEqualTo(Long value) {
            addCriterion("protectid <>", value, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidGreaterThan(Long value) {
            addCriterion("protectid >", value, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidGreaterThanOrEqualTo(Long value) {
            addCriterion("protectid >=", value, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidLessThan(Long value) {
            addCriterion("protectid <", value, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidLessThanOrEqualTo(Long value) {
            addCriterion("protectid <=", value, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidIn(List<Long> values) {
            addCriterion("protectid in", values, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidNotIn(List<Long> values) {
            addCriterion("protectid not in", values, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidBetween(Long value1, Long value2) {
            addCriterion("protectid between", value1, value2, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectidNotBetween(Long value1, Long value2) {
            addCriterion("protectid not between", value1, value2, "protectid");
            return (Criteria) this;
        }

        public Criteria andProtectnameIsNull() {
            addCriterion("protectname is null");
            return (Criteria) this;
        }

        public Criteria andProtectnameIsNotNull() {
            addCriterion("protectname is not null");
            return (Criteria) this;
        }

        public Criteria andProtectnameEqualTo(String value) {
            addCriterion("protectname =", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameNotEqualTo(String value) {
            addCriterion("protectname <>", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameGreaterThan(String value) {
            addCriterion("protectname >", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameGreaterThanOrEqualTo(String value) {
            addCriterion("protectname >=", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameLessThan(String value) {
            addCriterion("protectname <", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameLessThanOrEqualTo(String value) {
            addCriterion("protectname <=", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameLike(String value) {
            addCriterion("protectname like", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameNotLike(String value) {
            addCriterion("protectname not like", value, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameIn(List<String> values) {
            addCriterion("protectname in", values, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameNotIn(List<String> values) {
            addCriterion("protectname not in", values, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameBetween(String value1, String value2) {
            addCriterion("protectname between", value1, value2, "protectname");
            return (Criteria) this;
        }

        public Criteria andProtectnameNotBetween(String value1, String value2) {
            addCriterion("protectname not between", value1, value2, "protectname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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