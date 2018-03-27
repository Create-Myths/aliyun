package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class YunDatatypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunDatatypeExample() {
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

        public Criteria andDatatypeidIsNull() {
            addCriterion("datatypeid is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeidIsNotNull() {
            addCriterion("datatypeid is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeidEqualTo(Long value) {
            addCriterion("datatypeid =", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidNotEqualTo(Long value) {
            addCriterion("datatypeid <>", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidGreaterThan(Long value) {
            addCriterion("datatypeid >", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("datatypeid >=", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidLessThan(Long value) {
            addCriterion("datatypeid <", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidLessThanOrEqualTo(Long value) {
            addCriterion("datatypeid <=", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidIn(List<Long> values) {
            addCriterion("datatypeid in", values, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidNotIn(List<Long> values) {
            addCriterion("datatypeid not in", values, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidBetween(Long value1, Long value2) {
            addCriterion("datatypeid between", value1, value2, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidNotBetween(Long value1, Long value2) {
            addCriterion("datatypeid not between", value1, value2, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatanameIsNull() {
            addCriterion("dataname is null");
            return (Criteria) this;
        }

        public Criteria andDatanameIsNotNull() {
            addCriterion("dataname is not null");
            return (Criteria) this;
        }

        public Criteria andDatanameEqualTo(String value) {
            addCriterion("dataname =", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotEqualTo(String value) {
            addCriterion("dataname <>", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameGreaterThan(String value) {
            addCriterion("dataname >", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameGreaterThanOrEqualTo(String value) {
            addCriterion("dataname >=", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameLessThan(String value) {
            addCriterion("dataname <", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameLessThanOrEqualTo(String value) {
            addCriterion("dataname <=", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameLike(String value) {
            addCriterion("dataname like", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotLike(String value) {
            addCriterion("dataname not like", value, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameIn(List<String> values) {
            addCriterion("dataname in", values, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotIn(List<String> values) {
            addCriterion("dataname not in", values, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameBetween(String value1, String value2) {
            addCriterion("dataname between", value1, value2, "dataname");
            return (Criteria) this;
        }

        public Criteria andDatanameNotBetween(String value1, String value2) {
            addCriterion("dataname not between", value1, value2, "dataname");
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