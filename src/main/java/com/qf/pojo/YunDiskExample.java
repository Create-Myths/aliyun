package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YunDiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunDiskExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Long value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Long value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Long value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Long value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Long value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Long value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Long> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Long> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Long value1, Long value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Long value1, Long value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Long value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Long value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Long value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Long value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Long value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Long value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Long> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Long> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Long value1, Long value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Long value1, Long value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andDisknameIsNull() {
            addCriterion("diskname is null");
            return (Criteria) this;
        }

        public Criteria andDisknameIsNotNull() {
            addCriterion("diskname is not null");
            return (Criteria) this;
        }

        public Criteria andDisknameEqualTo(String value) {
            addCriterion("diskname =", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameNotEqualTo(String value) {
            addCriterion("diskname <>", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameGreaterThan(String value) {
            addCriterion("diskname >", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameGreaterThanOrEqualTo(String value) {
            addCriterion("diskname >=", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameLessThan(String value) {
            addCriterion("diskname <", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameLessThanOrEqualTo(String value) {
            addCriterion("diskname <=", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameLike(String value) {
            addCriterion("diskname like", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameNotLike(String value) {
            addCriterion("diskname not like", value, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameIn(List<String> values) {
            addCriterion("diskname in", values, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameNotIn(List<String> values) {
            addCriterion("diskname not in", values, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameBetween(String value1, String value2) {
            addCriterion("diskname between", value1, value2, "diskname");
            return (Criteria) this;
        }

        public Criteria andDisknameNotBetween(String value1, String value2) {
            addCriterion("diskname not between", value1, value2, "diskname");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityIsNull() {
            addCriterion("diskcapacity is null");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityIsNotNull() {
            addCriterion("diskcapacity is not null");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityEqualTo(String value) {
            addCriterion("diskcapacity =", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityNotEqualTo(String value) {
            addCriterion("diskcapacity <>", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityGreaterThan(String value) {
            addCriterion("diskcapacity >", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityGreaterThanOrEqualTo(String value) {
            addCriterion("diskcapacity >=", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityLessThan(String value) {
            addCriterion("diskcapacity <", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityLessThanOrEqualTo(String value) {
            addCriterion("diskcapacity <=", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityLike(String value) {
            addCriterion("diskcapacity like", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityNotLike(String value) {
            addCriterion("diskcapacity not like", value, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityIn(List<String> values) {
            addCriterion("diskcapacity in", values, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityNotIn(List<String> values) {
            addCriterion("diskcapacity not in", values, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityBetween(String value1, String value2) {
            addCriterion("diskcapacity between", value1, value2, "diskcapacity");
            return (Criteria) this;
        }

        public Criteria andDiskcapacityNotBetween(String value1, String value2) {
            addCriterion("diskcapacity not between", value1, value2, "diskcapacity");
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