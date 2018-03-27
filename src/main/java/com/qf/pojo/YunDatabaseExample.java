package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YunDatabaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunDatabaseExample() {
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

        public Criteria andDbidIsNull() {
            addCriterion("dbid is null");
            return (Criteria) this;
        }

        public Criteria andDbidIsNotNull() {
            addCriterion("dbid is not null");
            return (Criteria) this;
        }

        public Criteria andDbidEqualTo(Long value) {
            addCriterion("dbid =", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotEqualTo(Long value) {
            addCriterion("dbid <>", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThan(Long value) {
            addCriterion("dbid >", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThanOrEqualTo(Long value) {
            addCriterion("dbid >=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThan(Long value) {
            addCriterion("dbid <", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThanOrEqualTo(Long value) {
            addCriterion("dbid <=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidIn(List<Long> values) {
            addCriterion("dbid in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotIn(List<Long> values) {
            addCriterion("dbid not in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidBetween(Long value1, Long value2) {
            addCriterion("dbid between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotBetween(Long value1, Long value2) {
            addCriterion("dbid not between", value1, value2, "dbid");
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

        public Criteria andDbnameIsNull() {
            addCriterion("dbname is null");
            return (Criteria) this;
        }

        public Criteria andDbnameIsNotNull() {
            addCriterion("dbname is not null");
            return (Criteria) this;
        }

        public Criteria andDbnameEqualTo(String value) {
            addCriterion("dbname =", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotEqualTo(String value) {
            addCriterion("dbname <>", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameGreaterThan(String value) {
            addCriterion("dbname >", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameGreaterThanOrEqualTo(String value) {
            addCriterion("dbname >=", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLessThan(String value) {
            addCriterion("dbname <", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLessThanOrEqualTo(String value) {
            addCriterion("dbname <=", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLike(String value) {
            addCriterion("dbname like", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotLike(String value) {
            addCriterion("dbname not like", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameIn(List<String> values) {
            addCriterion("dbname in", values, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotIn(List<String> values) {
            addCriterion("dbname not in", values, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameBetween(String value1, String value2) {
            addCriterion("dbname between", value1, value2, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotBetween(String value1, String value2) {
            addCriterion("dbname not between", value1, value2, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbmemIsNull() {
            addCriterion("dbmem is null");
            return (Criteria) this;
        }

        public Criteria andDbmemIsNotNull() {
            addCriterion("dbmem is not null");
            return (Criteria) this;
        }

        public Criteria andDbmemEqualTo(String value) {
            addCriterion("dbmem =", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemNotEqualTo(String value) {
            addCriterion("dbmem <>", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemGreaterThan(String value) {
            addCriterion("dbmem >", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemGreaterThanOrEqualTo(String value) {
            addCriterion("dbmem >=", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemLessThan(String value) {
            addCriterion("dbmem <", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemLessThanOrEqualTo(String value) {
            addCriterion("dbmem <=", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemLike(String value) {
            addCriterion("dbmem like", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemNotLike(String value) {
            addCriterion("dbmem not like", value, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemIn(List<String> values) {
            addCriterion("dbmem in", values, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemNotIn(List<String> values) {
            addCriterion("dbmem not in", values, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemBetween(String value1, String value2) {
            addCriterion("dbmem between", value1, value2, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbmemNotBetween(String value1, String value2) {
            addCriterion("dbmem not between", value1, value2, "dbmem");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeIsNull() {
            addCriterion("dbdisksize is null");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeIsNotNull() {
            addCriterion("dbdisksize is not null");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeEqualTo(String value) {
            addCriterion("dbdisksize =", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeNotEqualTo(String value) {
            addCriterion("dbdisksize <>", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeGreaterThan(String value) {
            addCriterion("dbdisksize >", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeGreaterThanOrEqualTo(String value) {
            addCriterion("dbdisksize >=", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeLessThan(String value) {
            addCriterion("dbdisksize <", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeLessThanOrEqualTo(String value) {
            addCriterion("dbdisksize <=", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeLike(String value) {
            addCriterion("dbdisksize like", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeNotLike(String value) {
            addCriterion("dbdisksize not like", value, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeIn(List<String> values) {
            addCriterion("dbdisksize in", values, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeNotIn(List<String> values) {
            addCriterion("dbdisksize not in", values, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeBetween(String value1, String value2) {
            addCriterion("dbdisksize between", value1, value2, "dbdisksize");
            return (Criteria) this;
        }

        public Criteria andDbdisksizeNotBetween(String value1, String value2) {
            addCriterion("dbdisksize not between", value1, value2, "dbdisksize");
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

        public Criteria andDbstatusIsNull() {
            addCriterion("dbstatus is null");
            return (Criteria) this;
        }

        public Criteria andDbstatusIsNotNull() {
            addCriterion("dbstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDbstatusEqualTo(Short value) {
            addCriterion("dbstatus =", value, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusNotEqualTo(Short value) {
            addCriterion("dbstatus <>", value, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusGreaterThan(Short value) {
            addCriterion("dbstatus >", value, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("dbstatus >=", value, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusLessThan(Short value) {
            addCriterion("dbstatus <", value, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusLessThanOrEqualTo(Short value) {
            addCriterion("dbstatus <=", value, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusIn(List<Short> values) {
            addCriterion("dbstatus in", values, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusNotIn(List<Short> values) {
            addCriterion("dbstatus not in", values, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusBetween(Short value1, Short value2) {
            addCriterion("dbstatus between", value1, value2, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbstatusNotBetween(Short value1, Short value2) {
            addCriterion("dbstatus not between", value1, value2, "dbstatus");
            return (Criteria) this;
        }

        public Criteria andDbipIsNull() {
            addCriterion("dbip is null");
            return (Criteria) this;
        }

        public Criteria andDbipIsNotNull() {
            addCriterion("dbip is not null");
            return (Criteria) this;
        }

        public Criteria andDbipEqualTo(String value) {
            addCriterion("dbip =", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipNotEqualTo(String value) {
            addCriterion("dbip <>", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipGreaterThan(String value) {
            addCriterion("dbip >", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipGreaterThanOrEqualTo(String value) {
            addCriterion("dbip >=", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipLessThan(String value) {
            addCriterion("dbip <", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipLessThanOrEqualTo(String value) {
            addCriterion("dbip <=", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipLike(String value) {
            addCriterion("dbip like", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipNotLike(String value) {
            addCriterion("dbip not like", value, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipIn(List<String> values) {
            addCriterion("dbip in", values, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipNotIn(List<String> values) {
            addCriterion("dbip not in", values, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipBetween(String value1, String value2) {
            addCriterion("dbip between", value1, value2, "dbip");
            return (Criteria) this;
        }

        public Criteria andDbipNotBetween(String value1, String value2) {
            addCriterion("dbip not between", value1, value2, "dbip");
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