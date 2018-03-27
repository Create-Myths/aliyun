package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class YunInetdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunInetdataExample() {
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

        public Criteria andDataidIsNull() {
            addCriterion("dataid is null");
            return (Criteria) this;
        }

        public Criteria andDataidIsNotNull() {
            addCriterion("dataid is not null");
            return (Criteria) this;
        }

        public Criteria andDataidEqualTo(Long value) {
            addCriterion("dataid =", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotEqualTo(Long value) {
            addCriterion("dataid <>", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThan(Long value) {
            addCriterion("dataid >", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThanOrEqualTo(Long value) {
            addCriterion("dataid >=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThan(Long value) {
            addCriterion("dataid <", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThanOrEqualTo(Long value) {
            addCriterion("dataid <=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidIn(List<Long> values) {
            addCriterion("dataid in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotIn(List<Long> values) {
            addCriterion("dataid not in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidBetween(Long value1, Long value2) {
            addCriterion("dataid between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotBetween(Long value1, Long value2) {
            addCriterion("dataid not between", value1, value2, "dataid");
            return (Criteria) this;
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

        public Criteria andInetIsNull() {
            addCriterion("inet is null");
            return (Criteria) this;
        }

        public Criteria andInetIsNotNull() {
            addCriterion("inet is not null");
            return (Criteria) this;
        }

        public Criteria andInetEqualTo(String value) {
            addCriterion("inet =", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetNotEqualTo(String value) {
            addCriterion("inet <>", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetGreaterThan(String value) {
            addCriterion("inet >", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetGreaterThanOrEqualTo(String value) {
            addCriterion("inet >=", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetLessThan(String value) {
            addCriterion("inet <", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetLessThanOrEqualTo(String value) {
            addCriterion("inet <=", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetLike(String value) {
            addCriterion("inet like", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetNotLike(String value) {
            addCriterion("inet not like", value, "inet");
            return (Criteria) this;
        }

        public Criteria andInetIn(List<String> values) {
            addCriterion("inet in", values, "inet");
            return (Criteria) this;
        }

        public Criteria andInetNotIn(List<String> values) {
            addCriterion("inet not in", values, "inet");
            return (Criteria) this;
        }

        public Criteria andInetBetween(String value1, String value2) {
            addCriterion("inet between", value1, value2, "inet");
            return (Criteria) this;
        }

        public Criteria andInetNotBetween(String value1, String value2) {
            addCriterion("inet not between", value1, value2, "inet");
            return (Criteria) this;
        }

        public Criteria andBandtypeIsNull() {
            addCriterion("bandtype is null");
            return (Criteria) this;
        }

        public Criteria andBandtypeIsNotNull() {
            addCriterion("bandtype is not null");
            return (Criteria) this;
        }

        public Criteria andBandtypeEqualTo(String value) {
            addCriterion("bandtype =", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeNotEqualTo(String value) {
            addCriterion("bandtype <>", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeGreaterThan(String value) {
            addCriterion("bandtype >", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeGreaterThanOrEqualTo(String value) {
            addCriterion("bandtype >=", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeLessThan(String value) {
            addCriterion("bandtype <", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeLessThanOrEqualTo(String value) {
            addCriterion("bandtype <=", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeLike(String value) {
            addCriterion("bandtype like", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeNotLike(String value) {
            addCriterion("bandtype not like", value, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeIn(List<String> values) {
            addCriterion("bandtype in", values, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeNotIn(List<String> values) {
            addCriterion("bandtype not in", values, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeBetween(String value1, String value2) {
            addCriterion("bandtype between", value1, value2, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandtypeNotBetween(String value1, String value2) {
            addCriterion("bandtype not between", value1, value2, "bandtype");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNull() {
            addCriterion("bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNotNull() {
            addCriterion("bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andBandwidthEqualTo(String value) {
            addCriterion("bandwidth =", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotEqualTo(String value) {
            addCriterion("bandwidth <>", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThan(String value) {
            addCriterion("bandwidth >", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThanOrEqualTo(String value) {
            addCriterion("bandwidth >=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThan(String value) {
            addCriterion("bandwidth <", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThanOrEqualTo(String value) {
            addCriterion("bandwidth <=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLike(String value) {
            addCriterion("bandwidth like", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotLike(String value) {
            addCriterion("bandwidth not like", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthIn(List<String> values) {
            addCriterion("bandwidth in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotIn(List<String> values) {
            addCriterion("bandwidth not in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthBetween(String value1, String value2) {
            addCriterion("bandwidth between", value1, value2, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotBetween(String value1, String value2) {
            addCriterion("bandwidth not between", value1, value2, "bandwidth");
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