package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class YunDbtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunDbtypeExample() {
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

        public Criteria andDbtypeidIsNull() {
            addCriterion("dbtypeid is null");
            return (Criteria) this;
        }

        public Criteria andDbtypeidIsNotNull() {
            addCriterion("dbtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andDbtypeidEqualTo(Long value) {
            addCriterion("dbtypeid =", value, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidNotEqualTo(Long value) {
            addCriterion("dbtypeid <>", value, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidGreaterThan(Long value) {
            addCriterion("dbtypeid >", value, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("dbtypeid >=", value, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidLessThan(Long value) {
            addCriterion("dbtypeid <", value, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidLessThanOrEqualTo(Long value) {
            addCriterion("dbtypeid <=", value, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidIn(List<Long> values) {
            addCriterion("dbtypeid in", values, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidNotIn(List<Long> values) {
            addCriterion("dbtypeid not in", values, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidBetween(Long value1, Long value2) {
            addCriterion("dbtypeid between", value1, value2, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbtypeidNotBetween(Long value1, Long value2) {
            addCriterion("dbtypeid not between", value1, value2, "dbtypeid");
            return (Criteria) this;
        }

        public Criteria andDbconfignameIsNull() {
            addCriterion("dbconfigname is null");
            return (Criteria) this;
        }

        public Criteria andDbconfignameIsNotNull() {
            addCriterion("dbconfigname is not null");
            return (Criteria) this;
        }

        public Criteria andDbconfignameEqualTo(String value) {
            addCriterion("dbconfigname =", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameNotEqualTo(String value) {
            addCriterion("dbconfigname <>", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameGreaterThan(String value) {
            addCriterion("dbconfigname >", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameGreaterThanOrEqualTo(String value) {
            addCriterion("dbconfigname >=", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameLessThan(String value) {
            addCriterion("dbconfigname <", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameLessThanOrEqualTo(String value) {
            addCriterion("dbconfigname <=", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameLike(String value) {
            addCriterion("dbconfigname like", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameNotLike(String value) {
            addCriterion("dbconfigname not like", value, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameIn(List<String> values) {
            addCriterion("dbconfigname in", values, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameNotIn(List<String> values) {
            addCriterion("dbconfigname not in", values, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameBetween(String value1, String value2) {
            addCriterion("dbconfigname between", value1, value2, "dbconfigname");
            return (Criteria) this;
        }

        public Criteria andDbconfignameNotBetween(String value1, String value2) {
            addCriterion("dbconfigname not between", value1, value2, "dbconfigname");
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