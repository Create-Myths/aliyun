package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class YunOsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunOsExample() {
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

        public Criteria andOsidIsNull() {
            addCriterion("osid is null");
            return (Criteria) this;
        }

        public Criteria andOsidIsNotNull() {
            addCriterion("osid is not null");
            return (Criteria) this;
        }

        public Criteria andOsidEqualTo(Long value) {
            addCriterion("osid =", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotEqualTo(Long value) {
            addCriterion("osid <>", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThan(Long value) {
            addCriterion("osid >", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThanOrEqualTo(Long value) {
            addCriterion("osid >=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThan(Long value) {
            addCriterion("osid <", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThanOrEqualTo(Long value) {
            addCriterion("osid <=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidIn(List<Long> values) {
            addCriterion("osid in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotIn(List<Long> values) {
            addCriterion("osid not in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidBetween(Long value1, Long value2) {
            addCriterion("osid between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotBetween(Long value1, Long value2) {
            addCriterion("osid not between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNull() {
            addCriterion("ostype is null");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNotNull() {
            addCriterion("ostype is not null");
            return (Criteria) this;
        }

        public Criteria andOstypeEqualTo(String value) {
            addCriterion("ostype =", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotEqualTo(String value) {
            addCriterion("ostype <>", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThan(String value) {
            addCriterion("ostype >", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThanOrEqualTo(String value) {
            addCriterion("ostype >=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThan(String value) {
            addCriterion("ostype <", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThanOrEqualTo(String value) {
            addCriterion("ostype <=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLike(String value) {
            addCriterion("ostype like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotLike(String value) {
            addCriterion("ostype not like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeIn(List<String> values) {
            addCriterion("ostype in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotIn(List<String> values) {
            addCriterion("ostype not in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeBetween(String value1, String value2) {
            addCriterion("ostype between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotBetween(String value1, String value2) {
            addCriterion("ostype not between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNull() {
            addCriterion("osname is null");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNotNull() {
            addCriterion("osname is not null");
            return (Criteria) this;
        }

        public Criteria andOsnameEqualTo(String value) {
            addCriterion("osname =", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotEqualTo(String value) {
            addCriterion("osname <>", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThan(String value) {
            addCriterion("osname >", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThanOrEqualTo(String value) {
            addCriterion("osname >=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThan(String value) {
            addCriterion("osname <", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThanOrEqualTo(String value) {
            addCriterion("osname <=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLike(String value) {
            addCriterion("osname like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotLike(String value) {
            addCriterion("osname not like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameIn(List<String> values) {
            addCriterion("osname in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotIn(List<String> values) {
            addCriterion("osname not in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameBetween(String value1, String value2) {
            addCriterion("osname between", value1, value2, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotBetween(String value1, String value2) {
            addCriterion("osname not between", value1, value2, "osname");
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