package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YunLoadbalancingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunLoadbalancingExample() {
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

        public Criteria andLoadidIsNull() {
            addCriterion("loadid is null");
            return (Criteria) this;
        }

        public Criteria andLoadidIsNotNull() {
            addCriterion("loadid is not null");
            return (Criteria) this;
        }

        public Criteria andLoadidEqualTo(Long value) {
            addCriterion("loadid =", value, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidNotEqualTo(Long value) {
            addCriterion("loadid <>", value, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidGreaterThan(Long value) {
            addCriterion("loadid >", value, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidGreaterThanOrEqualTo(Long value) {
            addCriterion("loadid >=", value, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidLessThan(Long value) {
            addCriterion("loadid <", value, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidLessThanOrEqualTo(Long value) {
            addCriterion("loadid <=", value, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidIn(List<Long> values) {
            addCriterion("loadid in", values, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidNotIn(List<Long> values) {
            addCriterion("loadid not in", values, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidBetween(Long value1, Long value2) {
            addCriterion("loadid between", value1, value2, "loadid");
            return (Criteria) this;
        }

        public Criteria andLoadidNotBetween(Long value1, Long value2) {
            addCriterion("loadid not between", value1, value2, "loadid");
            return (Criteria) this;
        }

        public Criteria andLineIsNull() {
            addCriterion("line is null");
            return (Criteria) this;
        }

        public Criteria andLineIsNotNull() {
            addCriterion("line is not null");
            return (Criteria) this;
        }

        public Criteria andLineEqualTo(Short value) {
            addCriterion("line =", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotEqualTo(Short value) {
            addCriterion("line <>", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThan(Short value) {
            addCriterion("line >", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThanOrEqualTo(Short value) {
            addCriterion("line >=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThan(Short value) {
            addCriterion("line <", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThanOrEqualTo(Short value) {
            addCriterion("line <=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineIn(List<Short> values) {
            addCriterion("line in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotIn(List<Short> values) {
            addCriterion("line not in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineBetween(Short value1, Short value2) {
            addCriterion("line between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotBetween(Short value1, Short value2) {
            addCriterion("line not between", value1, value2, "line");
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

        public Criteria andLoadnameIsNull() {
            addCriterion("loadname is null");
            return (Criteria) this;
        }

        public Criteria andLoadnameIsNotNull() {
            addCriterion("loadname is not null");
            return (Criteria) this;
        }

        public Criteria andLoadnameEqualTo(String value) {
            addCriterion("loadname =", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameNotEqualTo(String value) {
            addCriterion("loadname <>", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameGreaterThan(String value) {
            addCriterion("loadname >", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameGreaterThanOrEqualTo(String value) {
            addCriterion("loadname >=", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameLessThan(String value) {
            addCriterion("loadname <", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameLessThanOrEqualTo(String value) {
            addCriterion("loadname <=", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameLike(String value) {
            addCriterion("loadname like", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameNotLike(String value) {
            addCriterion("loadname not like", value, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameIn(List<String> values) {
            addCriterion("loadname in", values, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameNotIn(List<String> values) {
            addCriterion("loadname not in", values, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameBetween(String value1, String value2) {
            addCriterion("loadname between", value1, value2, "loadname");
            return (Criteria) this;
        }

        public Criteria andLoadnameNotBetween(String value1, String value2) {
            addCriterion("loadname not between", value1, value2, "loadname");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andMonitorportIsNull() {
            addCriterion("monitorport is null");
            return (Criteria) this;
        }

        public Criteria andMonitorportIsNotNull() {
            addCriterion("monitorport is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorportEqualTo(Integer value) {
            addCriterion("monitorport =", value, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportNotEqualTo(Integer value) {
            addCriterion("monitorport <>", value, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportGreaterThan(Integer value) {
            addCriterion("monitorport >", value, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitorport >=", value, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportLessThan(Integer value) {
            addCriterion("monitorport <", value, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportLessThanOrEqualTo(Integer value) {
            addCriterion("monitorport <=", value, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportIn(List<Integer> values) {
            addCriterion("monitorport in", values, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportNotIn(List<Integer> values) {
            addCriterion("monitorport not in", values, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportBetween(Integer value1, Integer value2) {
            addCriterion("monitorport between", value1, value2, "monitorport");
            return (Criteria) this;
        }

        public Criteria andMonitorportNotBetween(Integer value1, Integer value2) {
            addCriterion("monitorport not between", value1, value2, "monitorport");
            return (Criteria) this;
        }

        public Criteria andFowardruleIsNull() {
            addCriterion("fowardrule is null");
            return (Criteria) this;
        }

        public Criteria andFowardruleIsNotNull() {
            addCriterion("fowardrule is not null");
            return (Criteria) this;
        }

        public Criteria andFowardruleEqualTo(String value) {
            addCriterion("fowardrule =", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleNotEqualTo(String value) {
            addCriterion("fowardrule <>", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleGreaterThan(String value) {
            addCriterion("fowardrule >", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleGreaterThanOrEqualTo(String value) {
            addCriterion("fowardrule >=", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleLessThan(String value) {
            addCriterion("fowardrule <", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleLessThanOrEqualTo(String value) {
            addCriterion("fowardrule <=", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleLike(String value) {
            addCriterion("fowardrule like", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleNotLike(String value) {
            addCriterion("fowardrule not like", value, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleIn(List<String> values) {
            addCriterion("fowardrule in", values, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleNotIn(List<String> values) {
            addCriterion("fowardrule not in", values, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleBetween(String value1, String value2) {
            addCriterion("fowardrule between", value1, value2, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andFowardruleNotBetween(String value1, String value2) {
            addCriterion("fowardrule not between", value1, value2, "fowardrule");
            return (Criteria) this;
        }

        public Criteria andKeepsessionIsNull() {
            addCriterion("keepsession is null");
            return (Criteria) this;
        }

        public Criteria andKeepsessionIsNotNull() {
            addCriterion("keepsession is not null");
            return (Criteria) this;
        }

        public Criteria andKeepsessionEqualTo(Short value) {
            addCriterion("keepsession =", value, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionNotEqualTo(Short value) {
            addCriterion("keepsession <>", value, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionGreaterThan(Short value) {
            addCriterion("keepsession >", value, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionGreaterThanOrEqualTo(Short value) {
            addCriterion("keepsession >=", value, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionLessThan(Short value) {
            addCriterion("keepsession <", value, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionLessThanOrEqualTo(Short value) {
            addCriterion("keepsession <=", value, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionIn(List<Short> values) {
            addCriterion("keepsession in", values, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionNotIn(List<Short> values) {
            addCriterion("keepsession not in", values, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionBetween(Short value1, Short value2) {
            addCriterion("keepsession between", value1, value2, "keepsession");
            return (Criteria) this;
        }

        public Criteria andKeepsessionNotBetween(Short value1, Short value2) {
            addCriterion("keepsession not between", value1, value2, "keepsession");
            return (Criteria) this;
        }

        public Criteria andCheckhealthIsNull() {
            addCriterion("checkhealth is null");
            return (Criteria) this;
        }

        public Criteria andCheckhealthIsNotNull() {
            addCriterion("checkhealth is not null");
            return (Criteria) this;
        }

        public Criteria andCheckhealthEqualTo(Short value) {
            addCriterion("checkhealth =", value, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthNotEqualTo(Short value) {
            addCriterion("checkhealth <>", value, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthGreaterThan(Short value) {
            addCriterion("checkhealth >", value, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthGreaterThanOrEqualTo(Short value) {
            addCriterion("checkhealth >=", value, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthLessThan(Short value) {
            addCriterion("checkhealth <", value, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthLessThanOrEqualTo(Short value) {
            addCriterion("checkhealth <=", value, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthIn(List<Short> values) {
            addCriterion("checkhealth in", values, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthNotIn(List<Short> values) {
            addCriterion("checkhealth not in", values, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthBetween(Short value1, Short value2) {
            addCriterion("checkhealth between", value1, value2, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andCheckhealthNotBetween(Short value1, Short value2) {
            addCriterion("checkhealth not between", value1, value2, "checkhealth");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPoolIsNull() {
            addCriterion("pool is null");
            return (Criteria) this;
        }

        public Criteria andPoolIsNotNull() {
            addCriterion("pool is not null");
            return (Criteria) this;
        }

        public Criteria andPoolEqualTo(String value) {
            addCriterion("pool =", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotEqualTo(String value) {
            addCriterion("pool <>", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolGreaterThan(String value) {
            addCriterion("pool >", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolGreaterThanOrEqualTo(String value) {
            addCriterion("pool >=", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolLessThan(String value) {
            addCriterion("pool <", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolLessThanOrEqualTo(String value) {
            addCriterion("pool <=", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolLike(String value) {
            addCriterion("pool like", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotLike(String value) {
            addCriterion("pool not like", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolIn(List<String> values) {
            addCriterion("pool in", values, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotIn(List<String> values) {
            addCriterion("pool not in", values, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolBetween(String value1, String value2) {
            addCriterion("pool between", value1, value2, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotBetween(String value1, String value2) {
            addCriterion("pool not between", value1, value2, "pool");
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

        public Criteria andOutipIsNull() {
            addCriterion("outip is null");
            return (Criteria) this;
        }

        public Criteria andOutipIsNotNull() {
            addCriterion("outip is not null");
            return (Criteria) this;
        }

        public Criteria andOutipEqualTo(String value) {
            addCriterion("outip =", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipNotEqualTo(String value) {
            addCriterion("outip <>", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipGreaterThan(String value) {
            addCriterion("outip >", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipGreaterThanOrEqualTo(String value) {
            addCriterion("outip >=", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipLessThan(String value) {
            addCriterion("outip <", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipLessThanOrEqualTo(String value) {
            addCriterion("outip <=", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipLike(String value) {
            addCriterion("outip like", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipNotLike(String value) {
            addCriterion("outip not like", value, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipIn(List<String> values) {
            addCriterion("outip in", values, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipNotIn(List<String> values) {
            addCriterion("outip not in", values, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipBetween(String value1, String value2) {
            addCriterion("outip between", value1, value2, "outip");
            return (Criteria) this;
        }

        public Criteria andOutipNotBetween(String value1, String value2) {
            addCriterion("outip not between", value1, value2, "outip");
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