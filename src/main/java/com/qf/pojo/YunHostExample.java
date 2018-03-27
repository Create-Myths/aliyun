package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YunHostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YunHostExample() {
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

        public Criteria andHostnameIsNull() {
            addCriterion("hostname is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostname =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostname <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostname >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostname >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostname <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostname <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostname like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostname not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostname in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostname not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostname between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostname not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNull() {
            addCriterion("configid is null");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNotNull() {
            addCriterion("configid is not null");
            return (Criteria) this;
        }

        public Criteria andConfigidEqualTo(Long value) {
            addCriterion("configid =", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotEqualTo(Long value) {
            addCriterion("configid <>", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThan(Long value) {
            addCriterion("configid >", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThanOrEqualTo(Long value) {
            addCriterion("configid >=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThan(Long value) {
            addCriterion("configid <", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThanOrEqualTo(Long value) {
            addCriterion("configid <=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidIn(List<Long> values) {
            addCriterion("configid in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotIn(List<Long> values) {
            addCriterion("configid not in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidBetween(Long value1, Long value2) {
            addCriterion("configid between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotBetween(Long value1, Long value2) {
            addCriterion("configid not between", value1, value2, "configid");
            return (Criteria) this;
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

        public Criteria andCpuIsNull() {
            addCriterion("cpu is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("cpu is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(String value) {
            addCriterion("cpu =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(String value) {
            addCriterion("cpu <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(String value) {
            addCriterion("cpu >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(String value) {
            addCriterion("cpu >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(String value) {
            addCriterion("cpu <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(String value) {
            addCriterion("cpu <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLike(String value) {
            addCriterion("cpu like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotLike(String value) {
            addCriterion("cpu not like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<String> values) {
            addCriterion("cpu in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<String> values) {
            addCriterion("cpu not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(String value1, String value2) {
            addCriterion("cpu between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(String value1, String value2) {
            addCriterion("cpu not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andRamIsNull() {
            addCriterion("ram is null");
            return (Criteria) this;
        }

        public Criteria andRamIsNotNull() {
            addCriterion("ram is not null");
            return (Criteria) this;
        }

        public Criteria andRamEqualTo(String value) {
            addCriterion("ram =", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotEqualTo(String value) {
            addCriterion("ram <>", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThan(String value) {
            addCriterion("ram >", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThanOrEqualTo(String value) {
            addCriterion("ram >=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThan(String value) {
            addCriterion("ram <", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThanOrEqualTo(String value) {
            addCriterion("ram <=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLike(String value) {
            addCriterion("ram like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotLike(String value) {
            addCriterion("ram not like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamIn(List<String> values) {
            addCriterion("ram in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotIn(List<String> values) {
            addCriterion("ram not in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamBetween(String value1, String value2) {
            addCriterion("ram between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotBetween(String value1, String value2) {
            addCriterion("ram not between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeIsNull() {
            addCriterion("datadisksize is null");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeIsNotNull() {
            addCriterion("datadisksize is not null");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeEqualTo(String value) {
            addCriterion("datadisksize =", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeNotEqualTo(String value) {
            addCriterion("datadisksize <>", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeGreaterThan(String value) {
            addCriterion("datadisksize >", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeGreaterThanOrEqualTo(String value) {
            addCriterion("datadisksize >=", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeLessThan(String value) {
            addCriterion("datadisksize <", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeLessThanOrEqualTo(String value) {
            addCriterion("datadisksize <=", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeLike(String value) {
            addCriterion("datadisksize like", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeNotLike(String value) {
            addCriterion("datadisksize not like", value, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeIn(List<String> values) {
            addCriterion("datadisksize in", values, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeNotIn(List<String> values) {
            addCriterion("datadisksize not in", values, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeBetween(String value1, String value2) {
            addCriterion("datadisksize between", value1, value2, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andDatadisksizeNotBetween(String value1, String value2) {
            addCriterion("datadisksize not between", value1, value2, "datadisksize");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andInipIsNull() {
            addCriterion("inip is null");
            return (Criteria) this;
        }

        public Criteria andInipIsNotNull() {
            addCriterion("inip is not null");
            return (Criteria) this;
        }

        public Criteria andInipEqualTo(String value) {
            addCriterion("inip =", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipNotEqualTo(String value) {
            addCriterion("inip <>", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipGreaterThan(String value) {
            addCriterion("inip >", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipGreaterThanOrEqualTo(String value) {
            addCriterion("inip >=", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipLessThan(String value) {
            addCriterion("inip <", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipLessThanOrEqualTo(String value) {
            addCriterion("inip <=", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipLike(String value) {
            addCriterion("inip like", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipNotLike(String value) {
            addCriterion("inip not like", value, "inip");
            return (Criteria) this;
        }

        public Criteria andInipIn(List<String> values) {
            addCriterion("inip in", values, "inip");
            return (Criteria) this;
        }

        public Criteria andInipNotIn(List<String> values) {
            addCriterion("inip not in", values, "inip");
            return (Criteria) this;
        }

        public Criteria andInipBetween(String value1, String value2) {
            addCriterion("inip between", value1, value2, "inip");
            return (Criteria) this;
        }

        public Criteria andInipNotBetween(String value1, String value2) {
            addCriterion("inip not between", value1, value2, "inip");
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

        public Criteria andHstateIsNull() {
            addCriterion("hstate is null");
            return (Criteria) this;
        }

        public Criteria andHstateIsNotNull() {
            addCriterion("hstate is not null");
            return (Criteria) this;
        }

        public Criteria andHstateEqualTo(Short value) {
            addCriterion("hstate =", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateNotEqualTo(Short value) {
            addCriterion("hstate <>", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateGreaterThan(Short value) {
            addCriterion("hstate >", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateGreaterThanOrEqualTo(Short value) {
            addCriterion("hstate >=", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateLessThan(Short value) {
            addCriterion("hstate <", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateLessThanOrEqualTo(Short value) {
            addCriterion("hstate <=", value, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateIn(List<Short> values) {
            addCriterion("hstate in", values, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateNotIn(List<Short> values) {
            addCriterion("hstate not in", values, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateBetween(Short value1, Short value2) {
            addCriterion("hstate between", value1, value2, "hstate");
            return (Criteria) this;
        }

        public Criteria andHstateNotBetween(Short value1, Short value2) {
            addCriterion("hstate not between", value1, value2, "hstate");
            return (Criteria) this;
        }

        public Criteria andBuysumIsNull() {
            addCriterion("buysum is null");
            return (Criteria) this;
        }

        public Criteria andBuysumIsNotNull() {
            addCriterion("buysum is not null");
            return (Criteria) this;
        }

        public Criteria andBuysumEqualTo(Integer value) {
            addCriterion("buysum =", value, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumNotEqualTo(Integer value) {
            addCriterion("buysum <>", value, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumGreaterThan(Integer value) {
            addCriterion("buysum >", value, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buysum >=", value, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumLessThan(Integer value) {
            addCriterion("buysum <", value, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumLessThanOrEqualTo(Integer value) {
            addCriterion("buysum <=", value, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumIn(List<Integer> values) {
            addCriterion("buysum in", values, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumNotIn(List<Integer> values) {
            addCriterion("buysum not in", values, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumBetween(Integer value1, Integer value2) {
            addCriterion("buysum between", value1, value2, "buysum");
            return (Criteria) this;
        }

        public Criteria andBuysumNotBetween(Integer value1, Integer value2) {
            addCriterion("buysum not between", value1, value2, "buysum");
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

        public Criteria andExptimeIsNull() {
            addCriterion("exptime is null");
            return (Criteria) this;
        }

        public Criteria andExptimeIsNotNull() {
            addCriterion("exptime is not null");
            return (Criteria) this;
        }

        public Criteria andExptimeEqualTo(Date value) {
            addCriterion("exptime =", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotEqualTo(Date value) {
            addCriterion("exptime <>", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeGreaterThan(Date value) {
            addCriterion("exptime >", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exptime >=", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeLessThan(Date value) {
            addCriterion("exptime <", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeLessThanOrEqualTo(Date value) {
            addCriterion("exptime <=", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeIn(List<Date> values) {
            addCriterion("exptime in", values, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotIn(List<Date> values) {
            addCriterion("exptime not in", values, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeBetween(Date value1, Date value2) {
            addCriterion("exptime between", value1, value2, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotBetween(Date value1, Date value2) {
            addCriterion("exptime not between", value1, value2, "exptime");
            return (Criteria) this;
        }

        public Criteria andProtectionIsNull() {
            addCriterion("protection is null");
            return (Criteria) this;
        }

        public Criteria andProtectionIsNotNull() {
            addCriterion("protection is not null");
            return (Criteria) this;
        }

        public Criteria andProtectionEqualTo(String value) {
            addCriterion("protection =", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotEqualTo(String value) {
            addCriterion("protection <>", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionGreaterThan(String value) {
            addCriterion("protection >", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("protection >=", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLessThan(String value) {
            addCriterion("protection <", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLessThanOrEqualTo(String value) {
            addCriterion("protection <=", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionLike(String value) {
            addCriterion("protection like", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotLike(String value) {
            addCriterion("protection not like", value, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionIn(List<String> values) {
            addCriterion("protection in", values, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotIn(List<String> values) {
            addCriterion("protection not in", values, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionBetween(String value1, String value2) {
            addCriterion("protection between", value1, value2, "protection");
            return (Criteria) this;
        }

        public Criteria andProtectionNotBetween(String value1, String value2) {
            addCriterion("protection not between", value1, value2, "protection");
            return (Criteria) this;
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

        public Criteria andAccountidIsNull() {
            addCriterion("accountid is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Long value) {
            addCriterion("accountid =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Long value) {
            addCriterion("accountid <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Long value) {
            addCriterion("accountid >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("accountid >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Long value) {
            addCriterion("accountid <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Long value) {
            addCriterion("accountid <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Long> values) {
            addCriterion("accountid in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Long> values) {
            addCriterion("accountid not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Long value1, Long value2) {
            addCriterion("accountid between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Long value1, Long value2) {
            addCriterion("accountid not between", value1, value2, "accountid");
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