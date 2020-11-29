package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.List;

public class BLACK_ALERT_INFOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BLACK_ALERT_INFOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHphmIsNull() {
            addCriterion("HPHM is null");
            return (Criteria) this;
        }

        public Criteria andHphmIsNotNull() {
            addCriterion("HPHM is not null");
            return (Criteria) this;
        }

        public Criteria andHphmEqualTo(String value) {
            addCriterion("HPHM =", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotEqualTo(String value) {
            addCriterion("HPHM <>", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmGreaterThan(String value) {
            addCriterion("HPHM >", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmGreaterThanOrEqualTo(String value) {
            addCriterion("HPHM >=", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmLessThan(String value) {
            addCriterion("HPHM <", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmLessThanOrEqualTo(String value) {
            addCriterion("HPHM <=", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmLike(String value) {
            addCriterion("HPHM like", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotLike(String value) {
            addCriterion("HPHM not like", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmIn(List<String> values) {
            addCriterion("HPHM in", values, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotIn(List<String> values) {
            addCriterion("HPHM not in", values, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmBetween(String value1, String value2) {
            addCriterion("HPHM between", value1, value2, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotBetween(String value1, String value2) {
            addCriterion("HPHM not between", value1, value2, "hphm");
            return (Criteria) this;
        }

        public Criteria andHpzlIsNull() {
            addCriterion("HPZL is null");
            return (Criteria) this;
        }

        public Criteria andHpzlIsNotNull() {
            addCriterion("HPZL is not null");
            return (Criteria) this;
        }

        public Criteria andHpzlEqualTo(String value) {
            addCriterion("HPZL =", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotEqualTo(String value) {
            addCriterion("HPZL <>", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlGreaterThan(String value) {
            addCriterion("HPZL >", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlGreaterThanOrEqualTo(String value) {
            addCriterion("HPZL >=", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLessThan(String value) {
            addCriterion("HPZL <", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLessThanOrEqualTo(String value) {
            addCriterion("HPZL <=", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLike(String value) {
            addCriterion("HPZL like", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotLike(String value) {
            addCriterion("HPZL not like", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlIn(List<String> values) {
            addCriterion("HPZL in", values, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotIn(List<String> values) {
            addCriterion("HPZL not in", values, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlBetween(String value1, String value2) {
            addCriterion("HPZL between", value1, value2, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotBetween(String value1, String value2) {
            addCriterion("HPZL not between", value1, value2, "hpzl");
            return (Criteria) this;
        }

        public Criteria andBjddIsNull() {
            addCriterion("BJDD is null");
            return (Criteria) this;
        }

        public Criteria andBjddIsNotNull() {
            addCriterion("BJDD is not null");
            return (Criteria) this;
        }

        public Criteria andBjddEqualTo(String value) {
            addCriterion("BJDD =", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddNotEqualTo(String value) {
            addCriterion("BJDD <>", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddGreaterThan(String value) {
            addCriterion("BJDD >", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddGreaterThanOrEqualTo(String value) {
            addCriterion("BJDD >=", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddLessThan(String value) {
            addCriterion("BJDD <", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddLessThanOrEqualTo(String value) {
            addCriterion("BJDD <=", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddLike(String value) {
            addCriterion("BJDD like", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddNotLike(String value) {
            addCriterion("BJDD not like", value, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddIn(List<String> values) {
            addCriterion("BJDD in", values, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddNotIn(List<String> values) {
            addCriterion("BJDD not in", values, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddBetween(String value1, String value2) {
            addCriterion("BJDD between", value1, value2, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddNotBetween(String value1, String value2) {
            addCriterion("BJDD not between", value1, value2, "bjdd");
            return (Criteria) this;
        }

        public Criteria andBjddmcIsNull() {
            addCriterion("BJDDMC is null");
            return (Criteria) this;
        }

        public Criteria andBjddmcIsNotNull() {
            addCriterion("BJDDMC is not null");
            return (Criteria) this;
        }

        public Criteria andBjddmcEqualTo(String value) {
            addCriterion("BJDDMC =", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcNotEqualTo(String value) {
            addCriterion("BJDDMC <>", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcGreaterThan(String value) {
            addCriterion("BJDDMC >", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcGreaterThanOrEqualTo(String value) {
            addCriterion("BJDDMC >=", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcLessThan(String value) {
            addCriterion("BJDDMC <", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcLessThanOrEqualTo(String value) {
            addCriterion("BJDDMC <=", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcLike(String value) {
            addCriterion("BJDDMC like", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcNotLike(String value) {
            addCriterion("BJDDMC not like", value, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcIn(List<String> values) {
            addCriterion("BJDDMC in", values, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcNotIn(List<String> values) {
            addCriterion("BJDDMC not in", values, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcBetween(String value1, String value2) {
            addCriterion("BJDDMC between", value1, value2, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjddmcNotBetween(String value1, String value2) {
            addCriterion("BJDDMC not between", value1, value2, "bjddmc");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNull() {
            addCriterion("BJSJ is null");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNotNull() {
            addCriterion("BJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjsjEqualTo(String value) {
            addCriterion("BJSJ =", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotEqualTo(String value) {
            addCriterion("BJSJ <>", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThan(String value) {
            addCriterion("BJSJ >", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThanOrEqualTo(String value) {
            addCriterion("BJSJ >=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThan(String value) {
            addCriterion("BJSJ <", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThanOrEqualTo(String value) {
            addCriterion("BJSJ <=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLike(String value) {
            addCriterion("BJSJ like", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotLike(String value) {
            addCriterion("BJSJ not like", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjIn(List<String> values) {
            addCriterion("BJSJ in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotIn(List<String> values) {
            addCriterion("BJSJ not in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjBetween(String value1, String value2) {
            addCriterion("BJSJ between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotBetween(String value1, String value2) {
            addCriterion("BJSJ not between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andGcsjIsNull() {
            addCriterion("GCSJ is null");
            return (Criteria) this;
        }

        public Criteria andGcsjIsNotNull() {
            addCriterion("GCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGcsjEqualTo(String value) {
            addCriterion("GCSJ =", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjNotEqualTo(String value) {
            addCriterion("GCSJ <>", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjGreaterThan(String value) {
            addCriterion("GCSJ >", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjGreaterThanOrEqualTo(String value) {
            addCriterion("GCSJ >=", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjLessThan(String value) {
            addCriterion("GCSJ <", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjLessThanOrEqualTo(String value) {
            addCriterion("GCSJ <=", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjLike(String value) {
            addCriterion("GCSJ like", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjNotLike(String value) {
            addCriterion("GCSJ not like", value, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjIn(List<String> values) {
            addCriterion("GCSJ in", values, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjNotIn(List<String> values) {
            addCriterion("GCSJ not in", values, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjBetween(String value1, String value2) {
            addCriterion("GCSJ between", value1, value2, "gcsj");
            return (Criteria) this;
        }

        public Criteria andGcsjNotBetween(String value1, String value2) {
            addCriterion("GCSJ not between", value1, value2, "gcsj");
            return (Criteria) this;
        }

        public Criteria andHmdbhIsNull() {
            addCriterion("HMDBH is null");
            return (Criteria) this;
        }

        public Criteria andHmdbhIsNotNull() {
            addCriterion("HMDBH is not null");
            return (Criteria) this;
        }

        public Criteria andHmdbhEqualTo(String value) {
            addCriterion("HMDBH =", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhNotEqualTo(String value) {
            addCriterion("HMDBH <>", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhGreaterThan(String value) {
            addCriterion("HMDBH >", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhGreaterThanOrEqualTo(String value) {
            addCriterion("HMDBH >=", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhLessThan(String value) {
            addCriterion("HMDBH <", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhLessThanOrEqualTo(String value) {
            addCriterion("HMDBH <=", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhLike(String value) {
            addCriterion("HMDBH like", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhNotLike(String value) {
            addCriterion("HMDBH not like", value, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhIn(List<String> values) {
            addCriterion("HMDBH in", values, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhNotIn(List<String> values) {
            addCriterion("HMDBH not in", values, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhBetween(String value1, String value2) {
            addCriterion("HMDBH between", value1, value2, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andHmdbhNotBetween(String value1, String value2) {
            addCriterion("HMDBH not between", value1, value2, "hmdbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhIsNull() {
            addCriterion("MHBKBH is null");
            return (Criteria) this;
        }

        public Criteria andMhbkbhIsNotNull() {
            addCriterion("MHBKBH is not null");
            return (Criteria) this;
        }

        public Criteria andMhbkbhEqualTo(String value) {
            addCriterion("MHBKBH =", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhNotEqualTo(String value) {
            addCriterion("MHBKBH <>", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhGreaterThan(String value) {
            addCriterion("MHBKBH >", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhGreaterThanOrEqualTo(String value) {
            addCriterion("MHBKBH >=", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhLessThan(String value) {
            addCriterion("MHBKBH <", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhLessThanOrEqualTo(String value) {
            addCriterion("MHBKBH <=", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhLike(String value) {
            addCriterion("MHBKBH like", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhNotLike(String value) {
            addCriterion("MHBKBH not like", value, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhIn(List<String> values) {
            addCriterion("MHBKBH in", values, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhNotIn(List<String> values) {
            addCriterion("MHBKBH not in", values, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhBetween(String value1, String value2) {
            addCriterion("MHBKBH between", value1, value2, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andMhbkbhNotBetween(String value1, String value2) {
            addCriterion("MHBKBH not between", value1, value2, "mhbkbh");
            return (Criteria) this;
        }

        public Criteria andClztIsNull() {
            addCriterion("CLZT is null");
            return (Criteria) this;
        }

        public Criteria andClztIsNotNull() {
            addCriterion("CLZT is not null");
            return (Criteria) this;
        }

        public Criteria andClztEqualTo(String value) {
            addCriterion("CLZT =", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotEqualTo(String value) {
            addCriterion("CLZT <>", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztGreaterThan(String value) {
            addCriterion("CLZT >", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztGreaterThanOrEqualTo(String value) {
            addCriterion("CLZT >=", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztLessThan(String value) {
            addCriterion("CLZT <", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztLessThanOrEqualTo(String value) {
            addCriterion("CLZT <=", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztLike(String value) {
            addCriterion("CLZT like", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotLike(String value) {
            addCriterion("CLZT not like", value, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztIn(List<String> values) {
            addCriterion("CLZT in", values, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotIn(List<String> values) {
            addCriterion("CLZT not in", values, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztBetween(String value1, String value2) {
            addCriterion("CLZT between", value1, value2, "clzt");
            return (Criteria) this;
        }

        public Criteria andClztNotBetween(String value1, String value2) {
            addCriterion("CLZT not between", value1, value2, "clzt");
            return (Criteria) this;
        }

        public Criteria andZjdzIsNull() {
            addCriterion("ZJDZ is null");
            return (Criteria) this;
        }

        public Criteria andZjdzIsNotNull() {
            addCriterion("ZJDZ is not null");
            return (Criteria) this;
        }

        public Criteria andZjdzEqualTo(String value) {
            addCriterion("ZJDZ =", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzNotEqualTo(String value) {
            addCriterion("ZJDZ <>", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzGreaterThan(String value) {
            addCriterion("ZJDZ >", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzGreaterThanOrEqualTo(String value) {
            addCriterion("ZJDZ >=", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzLessThan(String value) {
            addCriterion("ZJDZ <", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzLessThanOrEqualTo(String value) {
            addCriterion("ZJDZ <=", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzLike(String value) {
            addCriterion("ZJDZ like", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzNotLike(String value) {
            addCriterion("ZJDZ not like", value, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzIn(List<String> values) {
            addCriterion("ZJDZ in", values, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzNotIn(List<String> values) {
            addCriterion("ZJDZ not in", values, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzBetween(String value1, String value2) {
            addCriterion("ZJDZ between", value1, value2, "zjdz");
            return (Criteria) this;
        }

        public Criteria andZjdzNotBetween(String value1, String value2) {
            addCriterion("ZJDZ not between", value1, value2, "zjdz");
            return (Criteria) this;
        }

        public Criteria andXsfxIsNull() {
            addCriterion("XSFX is null");
            return (Criteria) this;
        }

        public Criteria andXsfxIsNotNull() {
            addCriterion("XSFX is not null");
            return (Criteria) this;
        }

        public Criteria andXsfxEqualTo(String value) {
            addCriterion("XSFX =", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxNotEqualTo(String value) {
            addCriterion("XSFX <>", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxGreaterThan(String value) {
            addCriterion("XSFX >", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxGreaterThanOrEqualTo(String value) {
            addCriterion("XSFX >=", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxLessThan(String value) {
            addCriterion("XSFX <", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxLessThanOrEqualTo(String value) {
            addCriterion("XSFX <=", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxLike(String value) {
            addCriterion("XSFX like", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxNotLike(String value) {
            addCriterion("XSFX not like", value, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxIn(List<String> values) {
            addCriterion("XSFX in", values, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxNotIn(List<String> values) {
            addCriterion("XSFX not in", values, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxBetween(String value1, String value2) {
            addCriterion("XSFX between", value1, value2, "xsfx");
            return (Criteria) this;
        }

        public Criteria andXsfxNotBetween(String value1, String value2) {
            addCriterion("XSFX not between", value1, value2, "xsfx");
            return (Criteria) this;
        }

        public Criteria andClsdIsNull() {
            addCriterion("CLSD is null");
            return (Criteria) this;
        }

        public Criteria andClsdIsNotNull() {
            addCriterion("CLSD is not null");
            return (Criteria) this;
        }

        public Criteria andClsdEqualTo(String value) {
            addCriterion("CLSD =", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdNotEqualTo(String value) {
            addCriterion("CLSD <>", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdGreaterThan(String value) {
            addCriterion("CLSD >", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdGreaterThanOrEqualTo(String value) {
            addCriterion("CLSD >=", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdLessThan(String value) {
            addCriterion("CLSD <", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdLessThanOrEqualTo(String value) {
            addCriterion("CLSD <=", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdLike(String value) {
            addCriterion("CLSD like", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdNotLike(String value) {
            addCriterion("CLSD not like", value, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdIn(List<String> values) {
            addCriterion("CLSD in", values, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdNotIn(List<String> values) {
            addCriterion("CLSD not in", values, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdBetween(String value1, String value2) {
            addCriterion("CLSD between", value1, value2, "clsd");
            return (Criteria) this;
        }

        public Criteria andClsdNotBetween(String value1, String value2) {
            addCriterion("CLSD not between", value1, value2, "clsd");
            return (Criteria) this;
        }

        public Criteria andFkrIsNull() {
            addCriterion("FKR is null");
            return (Criteria) this;
        }

        public Criteria andFkrIsNotNull() {
            addCriterion("FKR is not null");
            return (Criteria) this;
        }

        public Criteria andFkrEqualTo(String value) {
            addCriterion("FKR =", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrNotEqualTo(String value) {
            addCriterion("FKR <>", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrGreaterThan(String value) {
            addCriterion("FKR >", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrGreaterThanOrEqualTo(String value) {
            addCriterion("FKR >=", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrLessThan(String value) {
            addCriterion("FKR <", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrLessThanOrEqualTo(String value) {
            addCriterion("FKR <=", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrLike(String value) {
            addCriterion("FKR like", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrNotLike(String value) {
            addCriterion("FKR not like", value, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrIn(List<String> values) {
            addCriterion("FKR in", values, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrNotIn(List<String> values) {
            addCriterion("FKR not in", values, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrBetween(String value1, String value2) {
            addCriterion("FKR between", value1, value2, "fkr");
            return (Criteria) this;
        }

        public Criteria andFkrNotBetween(String value1, String value2) {
            addCriterion("FKR not between", value1, value2, "fkr");
            return (Criteria) this;
        }

        public Criteria andFksjIsNull() {
            addCriterion("FKSJ is null");
            return (Criteria) this;
        }

        public Criteria andFksjIsNotNull() {
            addCriterion("FKSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFksjEqualTo(String value) {
            addCriterion("FKSJ =", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjNotEqualTo(String value) {
            addCriterion("FKSJ <>", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjGreaterThan(String value) {
            addCriterion("FKSJ >", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjGreaterThanOrEqualTo(String value) {
            addCriterion("FKSJ >=", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjLessThan(String value) {
            addCriterion("FKSJ <", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjLessThanOrEqualTo(String value) {
            addCriterion("FKSJ <=", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjLike(String value) {
            addCriterion("FKSJ like", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjNotLike(String value) {
            addCriterion("FKSJ not like", value, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjIn(List<String> values) {
            addCriterion("FKSJ in", values, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjNotIn(List<String> values) {
            addCriterion("FKSJ not in", values, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjBetween(String value1, String value2) {
            addCriterion("FKSJ between", value1, value2, "fksj");
            return (Criteria) this;
        }

        public Criteria andFksjNotBetween(String value1, String value2) {
            addCriterion("FKSJ not between", value1, value2, "fksj");
            return (Criteria) this;
        }

        public Criteria andLjbzIsNull() {
            addCriterion("LJBZ is null");
            return (Criteria) this;
        }

        public Criteria andLjbzIsNotNull() {
            addCriterion("LJBZ is not null");
            return (Criteria) this;
        }

        public Criteria andLjbzEqualTo(String value) {
            addCriterion("LJBZ =", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzNotEqualTo(String value) {
            addCriterion("LJBZ <>", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzGreaterThan(String value) {
            addCriterion("LJBZ >", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzGreaterThanOrEqualTo(String value) {
            addCriterion("LJBZ >=", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzLessThan(String value) {
            addCriterion("LJBZ <", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzLessThanOrEqualTo(String value) {
            addCriterion("LJBZ <=", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzLike(String value) {
            addCriterion("LJBZ like", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzNotLike(String value) {
            addCriterion("LJBZ not like", value, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzIn(List<String> values) {
            addCriterion("LJBZ in", values, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzNotIn(List<String> values) {
            addCriterion("LJBZ not in", values, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzBetween(String value1, String value2) {
            addCriterion("LJBZ between", value1, value2, "ljbz");
            return (Criteria) this;
        }

        public Criteria andLjbzNotBetween(String value1, String value2) {
            addCriterion("LJBZ not between", value1, value2, "ljbz");
            return (Criteria) this;
        }

        public Criteria andFkxxIsNull() {
            addCriterion("FKXX is null");
            return (Criteria) this;
        }

        public Criteria andFkxxIsNotNull() {
            addCriterion("FKXX is not null");
            return (Criteria) this;
        }

        public Criteria andFkxxEqualTo(String value) {
            addCriterion("FKXX =", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxNotEqualTo(String value) {
            addCriterion("FKXX <>", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxGreaterThan(String value) {
            addCriterion("FKXX >", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxGreaterThanOrEqualTo(String value) {
            addCriterion("FKXX >=", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxLessThan(String value) {
            addCriterion("FKXX <", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxLessThanOrEqualTo(String value) {
            addCriterion("FKXX <=", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxLike(String value) {
            addCriterion("FKXX like", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxNotLike(String value) {
            addCriterion("FKXX not like", value, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxIn(List<String> values) {
            addCriterion("FKXX in", values, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxNotIn(List<String> values) {
            addCriterion("FKXX not in", values, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxBetween(String value1, String value2) {
            addCriterion("FKXX between", value1, value2, "fkxx");
            return (Criteria) this;
        }

        public Criteria andFkxxNotBetween(String value1, String value2) {
            addCriterion("FKXX not between", value1, value2, "fkxx");
            return (Criteria) this;
        }

        public Criteria andTsyhIsNull() {
            addCriterion("TSYH is null");
            return (Criteria) this;
        }

        public Criteria andTsyhIsNotNull() {
            addCriterion("TSYH is not null");
            return (Criteria) this;
        }

        public Criteria andTsyhEqualTo(String value) {
            addCriterion("TSYH =", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhNotEqualTo(String value) {
            addCriterion("TSYH <>", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhGreaterThan(String value) {
            addCriterion("TSYH >", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhGreaterThanOrEqualTo(String value) {
            addCriterion("TSYH >=", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhLessThan(String value) {
            addCriterion("TSYH <", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhLessThanOrEqualTo(String value) {
            addCriterion("TSYH <=", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhLike(String value) {
            addCriterion("TSYH like", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhNotLike(String value) {
            addCriterion("TSYH not like", value, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhIn(List<String> values) {
            addCriterion("TSYH in", values, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhNotIn(List<String> values) {
            addCriterion("TSYH not in", values, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhBetween(String value1, String value2) {
            addCriterion("TSYH between", value1, value2, "tsyh");
            return (Criteria) this;
        }

        public Criteria andTsyhNotBetween(String value1, String value2) {
            addCriterion("TSYH not between", value1, value2, "tsyh");
            return (Criteria) this;
        }

        public Criteria andCjrIsNull() {
            addCriterion("CJR is null");
            return (Criteria) this;
        }

        public Criteria andCjrIsNotNull() {
            addCriterion("CJR is not null");
            return (Criteria) this;
        }

        public Criteria andCjrEqualTo(String value) {
            addCriterion("CJR =", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotEqualTo(String value) {
            addCriterion("CJR <>", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThan(String value) {
            addCriterion("CJR >", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThanOrEqualTo(String value) {
            addCriterion("CJR >=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThan(String value) {
            addCriterion("CJR <", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThanOrEqualTo(String value) {
            addCriterion("CJR <=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLike(String value) {
            addCriterion("CJR like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotLike(String value) {
            addCriterion("CJR not like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrIn(List<String> values) {
            addCriterion("CJR in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotIn(List<String> values) {
            addCriterion("CJR not in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrBetween(String value1, String value2) {
            addCriterion("CJR between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotBetween(String value1, String value2) {
            addCriterion("CJR not between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(String value) {
            addCriterion("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(String value) {
            addCriterion("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(String value) {
            addCriterion("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(String value) {
            addCriterion("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(String value) {
            addCriterion("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(String value) {
            addCriterion("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLike(String value) {
            addCriterion("CJSJ like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotLike(String value) {
            addCriterion("CJSJ not like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<String> values) {
            addCriterion("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<String> values) {
            addCriterion("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(String value1, String value2) {
            addCriterion("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(String value1, String value2) {
            addCriterion("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCfqkIsNull() {
            addCriterion("CFQK is null");
            return (Criteria) this;
        }

        public Criteria andCfqkIsNotNull() {
            addCriterion("CFQK is not null");
            return (Criteria) this;
        }

        public Criteria andCfqkEqualTo(String value) {
            addCriterion("CFQK =", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkNotEqualTo(String value) {
            addCriterion("CFQK <>", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkGreaterThan(String value) {
            addCriterion("CFQK >", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkGreaterThanOrEqualTo(String value) {
            addCriterion("CFQK >=", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkLessThan(String value) {
            addCriterion("CFQK <", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkLessThanOrEqualTo(String value) {
            addCriterion("CFQK <=", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkLike(String value) {
            addCriterion("CFQK like", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkNotLike(String value) {
            addCriterion("CFQK not like", value, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkIn(List<String> values) {
            addCriterion("CFQK in", values, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkNotIn(List<String> values) {
            addCriterion("CFQK not in", values, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkBetween(String value1, String value2) {
            addCriterion("CFQK between", value1, value2, "cfqk");
            return (Criteria) this;
        }

        public Criteria andCfqkNotBetween(String value1, String value2) {
            addCriterion("CFQK not between", value1, value2, "cfqk");
            return (Criteria) this;
        }

        public Criteria andDetectidIsNull() {
            addCriterion("DETECTID is null");
            return (Criteria) this;
        }

        public Criteria andDetectidIsNotNull() {
            addCriterion("DETECTID is not null");
            return (Criteria) this;
        }

        public Criteria andDetectidEqualTo(String value) {
            addCriterion("DETECTID =", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidNotEqualTo(String value) {
            addCriterion("DETECTID <>", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidGreaterThan(String value) {
            addCriterion("DETECTID >", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidGreaterThanOrEqualTo(String value) {
            addCriterion("DETECTID >=", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidLessThan(String value) {
            addCriterion("DETECTID <", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidLessThanOrEqualTo(String value) {
            addCriterion("DETECTID <=", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidLike(String value) {
            addCriterion("DETECTID like", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidNotLike(String value) {
            addCriterion("DETECTID not like", value, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidIn(List<String> values) {
            addCriterion("DETECTID in", values, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidNotIn(List<String> values) {
            addCriterion("DETECTID not in", values, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidBetween(String value1, String value2) {
            addCriterion("DETECTID between", value1, value2, "detectid");
            return (Criteria) this;
        }

        public Criteria andDetectidNotBetween(String value1, String value2) {
            addCriterion("DETECTID not between", value1, value2, "detectid");
            return (Criteria) this;
        }

        public Criteria andXywhIsNull() {
            addCriterion("XYWH is null");
            return (Criteria) this;
        }

        public Criteria andXywhIsNotNull() {
            addCriterion("XYWH is not null");
            return (Criteria) this;
        }

        public Criteria andXywhEqualTo(String value) {
            addCriterion("XYWH =", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhNotEqualTo(String value) {
            addCriterion("XYWH <>", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhGreaterThan(String value) {
            addCriterion("XYWH >", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhGreaterThanOrEqualTo(String value) {
            addCriterion("XYWH >=", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhLessThan(String value) {
            addCriterion("XYWH <", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhLessThanOrEqualTo(String value) {
            addCriterion("XYWH <=", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhLike(String value) {
            addCriterion("XYWH like", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhNotLike(String value) {
            addCriterion("XYWH not like", value, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhIn(List<String> values) {
            addCriterion("XYWH in", values, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhNotIn(List<String> values) {
            addCriterion("XYWH not in", values, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhBetween(String value1, String value2) {
            addCriterion("XYWH between", value1, value2, "xywh");
            return (Criteria) this;
        }

        public Criteria andXywhNotBetween(String value1, String value2) {
            addCriterion("XYWH not between", value1, value2, "xywh");
            return (Criteria) this;
        }

        public Criteria andControllevelIsNull() {
            addCriterion("CONTROLLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andControllevelIsNotNull() {
            addCriterion("CONTROLLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andControllevelEqualTo(String value) {
            addCriterion("CONTROLLEVEL =", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelNotEqualTo(String value) {
            addCriterion("CONTROLLEVEL <>", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelGreaterThan(String value) {
            addCriterion("CONTROLLEVEL >", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROLLEVEL >=", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelLessThan(String value) {
            addCriterion("CONTROLLEVEL <", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelLessThanOrEqualTo(String value) {
            addCriterion("CONTROLLEVEL <=", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelLike(String value) {
            addCriterion("CONTROLLEVEL like", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelNotLike(String value) {
            addCriterion("CONTROLLEVEL not like", value, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelIn(List<String> values) {
            addCriterion("CONTROLLEVEL in", values, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelNotIn(List<String> values) {
            addCriterion("CONTROLLEVEL not in", values, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelBetween(String value1, String value2) {
            addCriterion("CONTROLLEVEL between", value1, value2, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControllevelNotBetween(String value1, String value2) {
            addCriterion("CONTROLLEVEL not between", value1, value2, "controllevel");
            return (Criteria) this;
        }

        public Criteria andControltypeIsNull() {
            addCriterion("CONTROLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andControltypeIsNotNull() {
            addCriterion("CONTROLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andControltypeEqualTo(String value) {
            addCriterion("CONTROLTYPE =", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeNotEqualTo(String value) {
            addCriterion("CONTROLTYPE <>", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeGreaterThan(String value) {
            addCriterion("CONTROLTYPE >", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROLTYPE >=", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeLessThan(String value) {
            addCriterion("CONTROLTYPE <", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeLessThanOrEqualTo(String value) {
            addCriterion("CONTROLTYPE <=", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeLike(String value) {
            addCriterion("CONTROLTYPE like", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeNotLike(String value) {
            addCriterion("CONTROLTYPE not like", value, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeIn(List<String> values) {
            addCriterion("CONTROLTYPE in", values, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeNotIn(List<String> values) {
            addCriterion("CONTROLTYPE not in", values, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeBetween(String value1, String value2) {
            addCriterion("CONTROLTYPE between", value1, value2, "controltype");
            return (Criteria) this;
        }

        public Criteria andControltypeNotBetween(String value1, String value2) {
            addCriterion("CONTROLTYPE not between", value1, value2, "controltype");
            return (Criteria) this;
        }

        public Criteria andClanenumberIsNull() {
            addCriterion("CLANENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andClanenumberIsNotNull() {
            addCriterion("CLANENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andClanenumberEqualTo(String value) {
            addCriterion("CLANENUMBER =", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberNotEqualTo(String value) {
            addCriterion("CLANENUMBER <>", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberGreaterThan(String value) {
            addCriterion("CLANENUMBER >", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberGreaterThanOrEqualTo(String value) {
            addCriterion("CLANENUMBER >=", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberLessThan(String value) {
            addCriterion("CLANENUMBER <", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberLessThanOrEqualTo(String value) {
            addCriterion("CLANENUMBER <=", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberLike(String value) {
            addCriterion("CLANENUMBER like", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberNotLike(String value) {
            addCriterion("CLANENUMBER not like", value, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberIn(List<String> values) {
            addCriterion("CLANENUMBER in", values, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberNotIn(List<String> values) {
            addCriterion("CLANENUMBER not in", values, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberBetween(String value1, String value2) {
            addCriterion("CLANENUMBER between", value1, value2, "clanenumber");
            return (Criteria) this;
        }

        public Criteria andClanenumberNotBetween(String value1, String value2) {
            addCriterion("CLANENUMBER not between", value1, value2, "clanenumber");
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