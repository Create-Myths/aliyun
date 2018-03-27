package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YunMemeryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunMemeryExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Long value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Long value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Long value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Long value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Long value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Long value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Long> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Long> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Long value1, Long value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Long value1, Long value2) {
            addCriterion("mid not between", value1, value2, "mid");
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

        public Criteria andMemnameIsNull() {
            addCriterion("memname is null");
            return (Criteria) this;
        }

        public Criteria andMemnameIsNotNull() {
            addCriterion("memname is not null");
            return (Criteria) this;
        }

        public Criteria andMemnameEqualTo(String value) {
            addCriterion("memname =", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotEqualTo(String value) {
            addCriterion("memname <>", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameGreaterThan(String value) {
            addCriterion("memname >", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameGreaterThanOrEqualTo(String value) {
            addCriterion("memname >=", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameLessThan(String value) {
            addCriterion("memname <", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameLessThanOrEqualTo(String value) {
            addCriterion("memname <=", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameLike(String value) {
            addCriterion("memname like", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotLike(String value) {
            addCriterion("memname not like", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameIn(List<String> values) {
            addCriterion("memname in", values, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotIn(List<String> values) {
            addCriterion("memname not in", values, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameBetween(String value1, String value2) {
            addCriterion("memname between", value1, value2, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotBetween(String value1, String value2) {
            addCriterion("memname not between", value1, value2, "memname");
            return (Criteria) this;
        }

        public Criteria andMemsizeIsNull() {
            addCriterion("memsize is null");
            return (Criteria) this;
        }

        public Criteria andMemsizeIsNotNull() {
            addCriterion("memsize is not null");
            return (Criteria) this;
        }

        public Criteria andMemsizeEqualTo(String value) {
            addCriterion("memsize =", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeNotEqualTo(String value) {
            addCriterion("memsize <>", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeGreaterThan(String value) {
            addCriterion("memsize >", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeGreaterThanOrEqualTo(String value) {
            addCriterion("memsize >=", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeLessThan(String value) {
            addCriterion("memsize <", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeLessThanOrEqualTo(String value) {
            addCriterion("memsize <=", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeLike(String value) {
            addCriterion("memsize like", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeNotLike(String value) {
            addCriterion("memsize not like", value, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeIn(List<String> values) {
            addCriterion("memsize in", values, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeNotIn(List<String> values) {
            addCriterion("memsize not in", values, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeBetween(String value1, String value2) {
            addCriterion("memsize between", value1, value2, "memsize");
            return (Criteria) this;
        }

        public Criteria andMemsizeNotBetween(String value1, String value2) {
            addCriterion("memsize not between", value1, value2, "memsize");
            return (Criteria) this;
        }

        public Criteria andTargetipIsNull() {
            addCriterion("targetip is null");
            return (Criteria) this;
        }

        public Criteria andTargetipIsNotNull() {
            addCriterion("targetip is not null");
            return (Criteria) this;
        }

        public Criteria andTargetipEqualTo(String value) {
            addCriterion("targetip =", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotEqualTo(String value) {
            addCriterion("targetip <>", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipGreaterThan(String value) {
            addCriterion("targetip >", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipGreaterThanOrEqualTo(String value) {
            addCriterion("targetip >=", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipLessThan(String value) {
            addCriterion("targetip <", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipLessThanOrEqualTo(String value) {
            addCriterion("targetip <=", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipLike(String value) {
            addCriterion("targetip like", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotLike(String value) {
            addCriterion("targetip not like", value, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipIn(List<String> values) {
            addCriterion("targetip in", values, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotIn(List<String> values) {
            addCriterion("targetip not in", values, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipBetween(String value1, String value2) {
            addCriterion("targetip between", value1, value2, "targetip");
            return (Criteria) this;
        }

        public Criteria andTargetipNotBetween(String value1, String value2) {
            addCriterion("targetip not between", value1, value2, "targetip");
            return (Criteria) this;
        }

        public Criteria andTportIsNull() {
            addCriterion("tport is null");
            return (Criteria) this;
        }

        public Criteria andTportIsNotNull() {
            addCriterion("tport is not null");
            return (Criteria) this;
        }

        public Criteria andTportEqualTo(String value) {
            addCriterion("tport =", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportNotEqualTo(String value) {
            addCriterion("tport <>", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportGreaterThan(String value) {
            addCriterion("tport >", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportGreaterThanOrEqualTo(String value) {
            addCriterion("tport >=", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportLessThan(String value) {
            addCriterion("tport <", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportLessThanOrEqualTo(String value) {
            addCriterion("tport <=", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportLike(String value) {
            addCriterion("tport like", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportNotLike(String value) {
            addCriterion("tport not like", value, "tport");
            return (Criteria) this;
        }

        public Criteria andTportIn(List<String> values) {
            addCriterion("tport in", values, "tport");
            return (Criteria) this;
        }

        public Criteria andTportNotIn(List<String> values) {
            addCriterion("tport not in", values, "tport");
            return (Criteria) this;
        }

        public Criteria andTportBetween(String value1, String value2) {
            addCriterion("tport between", value1, value2, "tport");
            return (Criteria) this;
        }

        public Criteria andTportNotBetween(String value1, String value2) {
            addCriterion("tport not between", value1, value2, "tport");
            return (Criteria) this;
        }

        public Criteria andSourceipIsNull() {
            addCriterion("sourceip is null");
            return (Criteria) this;
        }

        public Criteria andSourceipIsNotNull() {
            addCriterion("sourceip is not null");
            return (Criteria) this;
        }

        public Criteria andSourceipEqualTo(String value) {
            addCriterion("sourceip =", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotEqualTo(String value) {
            addCriterion("sourceip <>", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipGreaterThan(String value) {
            addCriterion("sourceip >", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipGreaterThanOrEqualTo(String value) {
            addCriterion("sourceip >=", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipLessThan(String value) {
            addCriterion("sourceip <", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipLessThanOrEqualTo(String value) {
            addCriterion("sourceip <=", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipLike(String value) {
            addCriterion("sourceip like", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotLike(String value) {
            addCriterion("sourceip not like", value, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipIn(List<String> values) {
            addCriterion("sourceip in", values, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotIn(List<String> values) {
            addCriterion("sourceip not in", values, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipBetween(String value1, String value2) {
            addCriterion("sourceip between", value1, value2, "sourceip");
            return (Criteria) this;
        }

        public Criteria andSourceipNotBetween(String value1, String value2) {
            addCriterion("sourceip not between", value1, value2, "sourceip");
            return (Criteria) this;
        }

        public Criteria andMemtypeIsNull() {
            addCriterion("memtype is null");
            return (Criteria) this;
        }

        public Criteria andMemtypeIsNotNull() {
            addCriterion("memtype is not null");
            return (Criteria) this;
        }

        public Criteria andMemtypeEqualTo(Short value) {
            addCriterion("memtype =", value, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeNotEqualTo(Short value) {
            addCriterion("memtype <>", value, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeGreaterThan(Short value) {
            addCriterion("memtype >", value, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("memtype >=", value, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeLessThan(Short value) {
            addCriterion("memtype <", value, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeLessThanOrEqualTo(Short value) {
            addCriterion("memtype <=", value, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeIn(List<Short> values) {
            addCriterion("memtype in", values, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeNotIn(List<Short> values) {
            addCriterion("memtype not in", values, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeBetween(Short value1, Short value2) {
            addCriterion("memtype between", value1, value2, "memtype");
            return (Criteria) this;
        }

        public Criteria andMemtypeNotBetween(Short value1, Short value2) {
            addCriterion("memtype not between", value1, value2, "memtype");
            return (Criteria) this;
        }

        public Criteria andBuynumIsNull() {
            addCriterion("buynum is null");
            return (Criteria) this;
        }

        public Criteria andBuynumIsNotNull() {
            addCriterion("buynum is not null");
            return (Criteria) this;
        }

        public Criteria andBuynumEqualTo(Integer value) {
            addCriterion("buynum =", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumNotEqualTo(Integer value) {
            addCriterion("buynum <>", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumGreaterThan(Integer value) {
            addCriterion("buynum >", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buynum >=", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumLessThan(Integer value) {
            addCriterion("buynum <", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumLessThanOrEqualTo(Integer value) {
            addCriterion("buynum <=", value, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumIn(List<Integer> values) {
            addCriterion("buynum in", values, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumNotIn(List<Integer> values) {
            addCriterion("buynum not in", values, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumBetween(Integer value1, Integer value2) {
            addCriterion("buynum between", value1, value2, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuynumNotBetween(Integer value1, Integer value2) {
            addCriterion("buynum not between", value1, value2, "buynum");
            return (Criteria) this;
        }

        public Criteria andBuytypeIsNull() {
            addCriterion("buytype is null");
            return (Criteria) this;
        }

        public Criteria andBuytypeIsNotNull() {
            addCriterion("buytype is not null");
            return (Criteria) this;
        }

        public Criteria andBuytypeEqualTo(Integer value) {
            addCriterion("buytype =", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotEqualTo(Integer value) {
            addCriterion("buytype <>", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThan(Integer value) {
            addCriterion("buytype >", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buytype >=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThan(Integer value) {
            addCriterion("buytype <", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThanOrEqualTo(Integer value) {
            addCriterion("buytype <=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeIn(List<Integer> values) {
            addCriterion("buytype in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotIn(List<Integer> values) {
            addCriterion("buytype not in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeBetween(Integer value1, Integer value2) {
            addCriterion("buytype between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("buytype not between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNull() {
            addCriterion("buytime is null");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNotNull() {
            addCriterion("buytime is not null");
            return (Criteria) this;
        }

        public Criteria andBuytimeEqualTo(Integer value) {
            addCriterion("buytime =", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotEqualTo(Integer value) {
            addCriterion("buytime <>", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThan(Integer value) {
            addCriterion("buytime >", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buytime >=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThan(Integer value) {
            addCriterion("buytime <", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThanOrEqualTo(Integer value) {
            addCriterion("buytime <=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeIn(List<Integer> values) {
            addCriterion("buytime in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotIn(List<Integer> values) {
            addCriterion("buytime not in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeBetween(Integer value1, Integer value2) {
            addCriterion("buytime between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("buytime not between", value1, value2, "buytime");
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

        public Criteria andPeriodtimeIsNull() {
            addCriterion("periodtime is null");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeIsNotNull() {
            addCriterion("periodtime is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeEqualTo(Date value) {
            addCriterion("periodtime =", value, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeNotEqualTo(Date value) {
            addCriterion("periodtime <>", value, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeGreaterThan(Date value) {
            addCriterion("periodtime >", value, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("periodtime >=", value, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeLessThan(Date value) {
            addCriterion("periodtime <", value, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeLessThanOrEqualTo(Date value) {
            addCriterion("periodtime <=", value, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeIn(List<Date> values) {
            addCriterion("periodtime in", values, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeNotIn(List<Date> values) {
            addCriterion("periodtime not in", values, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeBetween(Date value1, Date value2) {
            addCriterion("periodtime between", value1, value2, "periodtime");
            return (Criteria) this;
        }

        public Criteria andPeriodtimeNotBetween(Date value1, Date value2) {
            addCriterion("periodtime not between", value1, value2, "periodtime");
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