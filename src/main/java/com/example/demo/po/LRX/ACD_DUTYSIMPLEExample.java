package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ACD_DUTYSIMPLEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ACD_DUTYSIMPLEExample() {
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

        public Criteria andDjbhIsNull() {
            addCriterion("DJBH is null");
            return (Criteria) this;
        }

        public Criteria andDjbhIsNotNull() {
            addCriterion("DJBH is not null");
            return (Criteria) this;
        }

        public Criteria andDjbhEqualTo(String value) {
            addCriterion("DJBH =", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotEqualTo(String value) {
            addCriterion("DJBH <>", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhGreaterThan(String value) {
            addCriterion("DJBH >", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhGreaterThanOrEqualTo(String value) {
            addCriterion("DJBH >=", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLessThan(String value) {
            addCriterion("DJBH <", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLessThanOrEqualTo(String value) {
            addCriterion("DJBH <=", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLike(String value) {
            addCriterion("DJBH like", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotLike(String value) {
            addCriterion("DJBH not like", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhIn(List<String> values) {
            addCriterion("DJBH in", values, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotIn(List<String> values) {
            addCriterion("DJBH not in", values, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhBetween(String value1, String value2) {
            addCriterion("DJBH between", value1, value2, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotBetween(String value1, String value2) {
            addCriterion("DJBH not between", value1, value2, "djbh");
            return (Criteria) this;
        }

        public Criteria andSgbhIsNull() {
            addCriterion("SGBH is null");
            return (Criteria) this;
        }

        public Criteria andSgbhIsNotNull() {
            addCriterion("SGBH is not null");
            return (Criteria) this;
        }

        public Criteria andSgbhEqualTo(String value) {
            addCriterion("SGBH =", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhNotEqualTo(String value) {
            addCriterion("SGBH <>", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhGreaterThan(String value) {
            addCriterion("SGBH >", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhGreaterThanOrEqualTo(String value) {
            addCriterion("SGBH >=", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhLessThan(String value) {
            addCriterion("SGBH <", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhLessThanOrEqualTo(String value) {
            addCriterion("SGBH <=", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhLike(String value) {
            addCriterion("SGBH like", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhNotLike(String value) {
            addCriterion("SGBH not like", value, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhIn(List<String> values) {
            addCriterion("SGBH in", values, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhNotIn(List<String> values) {
            addCriterion("SGBH not in", values, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhBetween(String value1, String value2) {
            addCriterion("SGBH between", value1, value2, "sgbh");
            return (Criteria) this;
        }

        public Criteria andSgbhNotBetween(String value1, String value2) {
            addCriterion("SGBH not between", value1, value2, "sgbh");
            return (Criteria) this;
        }

        public Criteria andXzqhIsNull() {
            addCriterion("XZQH is null");
            return (Criteria) this;
        }

        public Criteria andXzqhIsNotNull() {
            addCriterion("XZQH is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhEqualTo(String value) {
            addCriterion("XZQH =", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotEqualTo(String value) {
            addCriterion("XZQH <>", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhGreaterThan(String value) {
            addCriterion("XZQH >", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhGreaterThanOrEqualTo(String value) {
            addCriterion("XZQH >=", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhLessThan(String value) {
            addCriterion("XZQH <", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhLessThanOrEqualTo(String value) {
            addCriterion("XZQH <=", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhLike(String value) {
            addCriterion("XZQH like", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotLike(String value) {
            addCriterion("XZQH not like", value, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhIn(List<String> values) {
            addCriterion("XZQH in", values, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotIn(List<String> values) {
            addCriterion("XZQH not in", values, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhBetween(String value1, String value2) {
            addCriterion("XZQH between", value1, value2, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXzqhNotBetween(String value1, String value2) {
            addCriterion("XZQH not between", value1, value2, "xzqh");
            return (Criteria) this;
        }

        public Criteria andXqIsNull() {
            addCriterion("XQ is null");
            return (Criteria) this;
        }

        public Criteria andXqIsNotNull() {
            addCriterion("XQ is not null");
            return (Criteria) this;
        }

        public Criteria andXqEqualTo(Short value) {
            addCriterion("XQ =", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotEqualTo(Short value) {
            addCriterion("XQ <>", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqGreaterThan(Short value) {
            addCriterion("XQ >", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqGreaterThanOrEqualTo(Short value) {
            addCriterion("XQ >=", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLessThan(Short value) {
            addCriterion("XQ <", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLessThanOrEqualTo(Short value) {
            addCriterion("XQ <=", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqIn(List<Short> values) {
            addCriterion("XQ in", values, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotIn(List<Short> values) {
            addCriterion("XQ not in", values, "xq");
            return (Criteria) this;
        }

        public Criteria andXqBetween(Short value1, Short value2) {
            addCriterion("XQ between", value1, value2, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotBetween(Short value1, Short value2) {
            addCriterion("XQ not between", value1, value2, "xq");
            return (Criteria) this;
        }

        public Criteria andSgfssjIsNull() {
            addCriterion("SGFSSJ is null");
            return (Criteria) this;
        }

        public Criteria andSgfssjIsNotNull() {
            addCriterion("SGFSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSgfssjEqualTo(Date value) {
            addCriterion("SGFSSJ =", value, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjNotEqualTo(Date value) {
            addCriterion("SGFSSJ <>", value, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjGreaterThan(Date value) {
            addCriterion("SGFSSJ >", value, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjGreaterThanOrEqualTo(Date value) {
            addCriterion("SGFSSJ >=", value, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjLessThan(Date value) {
            addCriterion("SGFSSJ <", value, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjLessThanOrEqualTo(Date value) {
            addCriterion("SGFSSJ <=", value, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjIn(List<Date> values) {
            addCriterion("SGFSSJ in", values, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjNotIn(List<Date> values) {
            addCriterion("SGFSSJ not in", values, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjBetween(Date value1, Date value2) {
            addCriterion("SGFSSJ between", value1, value2, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andSgfssjNotBetween(Date value1, Date value2) {
            addCriterion("SGFSSJ not between", value1, value2, "sgfssj");
            return (Criteria) this;
        }

        public Criteria andLhIsNull() {
            addCriterion("LH is null");
            return (Criteria) this;
        }

        public Criteria andLhIsNotNull() {
            addCriterion("LH is not null");
            return (Criteria) this;
        }

        public Criteria andLhEqualTo(String value) {
            addCriterion("LH =", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhNotEqualTo(String value) {
            addCriterion("LH <>", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhGreaterThan(String value) {
            addCriterion("LH >", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhGreaterThanOrEqualTo(String value) {
            addCriterion("LH >=", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhLessThan(String value) {
            addCriterion("LH <", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhLessThanOrEqualTo(String value) {
            addCriterion("LH <=", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhLike(String value) {
            addCriterion("LH like", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhNotLike(String value) {
            addCriterion("LH not like", value, "lh");
            return (Criteria) this;
        }

        public Criteria andLhIn(List<String> values) {
            addCriterion("LH in", values, "lh");
            return (Criteria) this;
        }

        public Criteria andLhNotIn(List<String> values) {
            addCriterion("LH not in", values, "lh");
            return (Criteria) this;
        }

        public Criteria andLhBetween(String value1, String value2) {
            addCriterion("LH between", value1, value2, "lh");
            return (Criteria) this;
        }

        public Criteria andLhNotBetween(String value1, String value2) {
            addCriterion("LH not between", value1, value2, "lh");
            return (Criteria) this;
        }

        public Criteria andLmIsNull() {
            addCriterion("LM is null");
            return (Criteria) this;
        }

        public Criteria andLmIsNotNull() {
            addCriterion("LM is not null");
            return (Criteria) this;
        }

        public Criteria andLmEqualTo(String value) {
            addCriterion("LM =", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotEqualTo(String value) {
            addCriterion("LM <>", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmGreaterThan(String value) {
            addCriterion("LM >", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmGreaterThanOrEqualTo(String value) {
            addCriterion("LM >=", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmLessThan(String value) {
            addCriterion("LM <", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmLessThanOrEqualTo(String value) {
            addCriterion("LM <=", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmLike(String value) {
            addCriterion("LM like", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotLike(String value) {
            addCriterion("LM not like", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmIn(List<String> values) {
            addCriterion("LM in", values, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotIn(List<String> values) {
            addCriterion("LM not in", values, "lm");
            return (Criteria) this;
        }

        public Criteria andLmBetween(String value1, String value2) {
            addCriterion("LM between", value1, value2, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotBetween(String value1, String value2) {
            addCriterion("LM not between", value1, value2, "lm");
            return (Criteria) this;
        }

        public Criteria andGlsIsNull() {
            addCriterion("GLS is null");
            return (Criteria) this;
        }

        public Criteria andGlsIsNotNull() {
            addCriterion("GLS is not null");
            return (Criteria) this;
        }

        public Criteria andGlsEqualTo(Integer value) {
            addCriterion("GLS =", value, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsNotEqualTo(Integer value) {
            addCriterion("GLS <>", value, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsGreaterThan(Integer value) {
            addCriterion("GLS >", value, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLS >=", value, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsLessThan(Integer value) {
            addCriterion("GLS <", value, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsLessThanOrEqualTo(Integer value) {
            addCriterion("GLS <=", value, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsIn(List<Integer> values) {
            addCriterion("GLS in", values, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsNotIn(List<Integer> values) {
            addCriterion("GLS not in", values, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsBetween(Integer value1, Integer value2) {
            addCriterion("GLS between", value1, value2, "gls");
            return (Criteria) this;
        }

        public Criteria andGlsNotBetween(Integer value1, Integer value2) {
            addCriterion("GLS not between", value1, value2, "gls");
            return (Criteria) this;
        }

        public Criteria andMsIsNull() {
            addCriterion("MS is null");
            return (Criteria) this;
        }

        public Criteria andMsIsNotNull() {
            addCriterion("MS is not null");
            return (Criteria) this;
        }

        public Criteria andMsEqualTo(Short value) {
            addCriterion("MS =", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotEqualTo(Short value) {
            addCriterion("MS <>", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThan(Short value) {
            addCriterion("MS >", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThanOrEqualTo(Short value) {
            addCriterion("MS >=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThan(Short value) {
            addCriterion("MS <", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThanOrEqualTo(Short value) {
            addCriterion("MS <=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsIn(List<Short> values) {
            addCriterion("MS in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotIn(List<Short> values) {
            addCriterion("MS not in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsBetween(Short value1, Short value2) {
            addCriterion("MS between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotBetween(Short value1, Short value2) {
            addCriterion("MS not between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andJdwzIsNull() {
            addCriterion("JDWZ is null");
            return (Criteria) this;
        }

        public Criteria andJdwzIsNotNull() {
            addCriterion("JDWZ is not null");
            return (Criteria) this;
        }

        public Criteria andJdwzEqualTo(Integer value) {
            addCriterion("JDWZ =", value, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzNotEqualTo(Integer value) {
            addCriterion("JDWZ <>", value, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzGreaterThan(Integer value) {
            addCriterion("JDWZ >", value, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzGreaterThanOrEqualTo(Integer value) {
            addCriterion("JDWZ >=", value, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzLessThan(Integer value) {
            addCriterion("JDWZ <", value, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzLessThanOrEqualTo(Integer value) {
            addCriterion("JDWZ <=", value, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzIn(List<Integer> values) {
            addCriterion("JDWZ in", values, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzNotIn(List<Integer> values) {
            addCriterion("JDWZ not in", values, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzBetween(Integer value1, Integer value2) {
            addCriterion("JDWZ between", value1, value2, "jdwz");
            return (Criteria) this;
        }

        public Criteria andJdwzNotBetween(Integer value1, Integer value2) {
            addCriterion("JDWZ not between", value1, value2, "jdwz");
            return (Criteria) this;
        }

        public Criteria andSgddIsNull() {
            addCriterion("SGDD is null");
            return (Criteria) this;
        }

        public Criteria andSgddIsNotNull() {
            addCriterion("SGDD is not null");
            return (Criteria) this;
        }

        public Criteria andSgddEqualTo(String value) {
            addCriterion("SGDD =", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddNotEqualTo(String value) {
            addCriterion("SGDD <>", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddGreaterThan(String value) {
            addCriterion("SGDD >", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddGreaterThanOrEqualTo(String value) {
            addCriterion("SGDD >=", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddLessThan(String value) {
            addCriterion("SGDD <", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddLessThanOrEqualTo(String value) {
            addCriterion("SGDD <=", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddLike(String value) {
            addCriterion("SGDD like", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddNotLike(String value) {
            addCriterion("SGDD not like", value, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddIn(List<String> values) {
            addCriterion("SGDD in", values, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddNotIn(List<String> values) {
            addCriterion("SGDD not in", values, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddBetween(String value1, String value2) {
            addCriterion("SGDD between", value1, value2, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSgddNotBetween(String value1, String value2) {
            addCriterion("SGDD not between", value1, value2, "sgdd");
            return (Criteria) this;
        }

        public Criteria andSsrsIsNull() {
            addCriterion("SSRS is null");
            return (Criteria) this;
        }

        public Criteria andSsrsIsNotNull() {
            addCriterion("SSRS is not null");
            return (Criteria) this;
        }

        public Criteria andSsrsEqualTo(Short value) {
            addCriterion("SSRS =", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsNotEqualTo(Short value) {
            addCriterion("SSRS <>", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsGreaterThan(Short value) {
            addCriterion("SSRS >", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsGreaterThanOrEqualTo(Short value) {
            addCriterion("SSRS >=", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsLessThan(Short value) {
            addCriterion("SSRS <", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsLessThanOrEqualTo(Short value) {
            addCriterion("SSRS <=", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsIn(List<Short> values) {
            addCriterion("SSRS in", values, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsNotIn(List<Short> values) {
            addCriterion("SSRS not in", values, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsBetween(Short value1, Short value2) {
            addCriterion("SSRS between", value1, value2, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsNotBetween(Short value1, Short value2) {
            addCriterion("SSRS not between", value1, value2, "ssrs");
            return (Criteria) this;
        }

        public Criteria andZjccssIsNull() {
            addCriterion("ZJCCSS is null");
            return (Criteria) this;
        }

        public Criteria andZjccssIsNotNull() {
            addCriterion("ZJCCSS is not null");
            return (Criteria) this;
        }

        public Criteria andZjccssEqualTo(Integer value) {
            addCriterion("ZJCCSS =", value, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssNotEqualTo(Integer value) {
            addCriterion("ZJCCSS <>", value, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssGreaterThan(Integer value) {
            addCriterion("ZJCCSS >", value, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZJCCSS >=", value, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssLessThan(Integer value) {
            addCriterion("ZJCCSS <", value, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssLessThanOrEqualTo(Integer value) {
            addCriterion("ZJCCSS <=", value, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssIn(List<Integer> values) {
            addCriterion("ZJCCSS in", values, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssNotIn(List<Integer> values) {
            addCriterion("ZJCCSS not in", values, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssBetween(Integer value1, Integer value2) {
            addCriterion("ZJCCSS between", value1, value2, "zjccss");
            return (Criteria) this;
        }

        public Criteria andZjccssNotBetween(Integer value1, Integer value2) {
            addCriterion("ZJCCSS not between", value1, value2, "zjccss");
            return (Criteria) this;
        }

        public Criteria andLwsglxIsNull() {
            addCriterion("LWSGLX is null");
            return (Criteria) this;
        }

        public Criteria andLwsglxIsNotNull() {
            addCriterion("LWSGLX is not null");
            return (Criteria) this;
        }

        public Criteria andLwsglxEqualTo(String value) {
            addCriterion("LWSGLX =", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxNotEqualTo(String value) {
            addCriterion("LWSGLX <>", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxGreaterThan(String value) {
            addCriterion("LWSGLX >", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxGreaterThanOrEqualTo(String value) {
            addCriterion("LWSGLX >=", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxLessThan(String value) {
            addCriterion("LWSGLX <", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxLessThanOrEqualTo(String value) {
            addCriterion("LWSGLX <=", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxLike(String value) {
            addCriterion("LWSGLX like", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxNotLike(String value) {
            addCriterion("LWSGLX not like", value, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxIn(List<String> values) {
            addCriterion("LWSGLX in", values, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxNotIn(List<String> values) {
            addCriterion("LWSGLX not in", values, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxBetween(String value1, String value2) {
            addCriterion("LWSGLX between", value1, value2, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andLwsglxNotBetween(String value1, String value2) {
            addCriterion("LWSGLX not between", value1, value2, "lwsglx");
            return (Criteria) this;
        }

        public Criteria andRdyyflIsNull() {
            addCriterion("RDYYFL is null");
            return (Criteria) this;
        }

        public Criteria andRdyyflIsNotNull() {
            addCriterion("RDYYFL is not null");
            return (Criteria) this;
        }

        public Criteria andRdyyflEqualTo(String value) {
            addCriterion("RDYYFL =", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflNotEqualTo(String value) {
            addCriterion("RDYYFL <>", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflGreaterThan(String value) {
            addCriterion("RDYYFL >", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflGreaterThanOrEqualTo(String value) {
            addCriterion("RDYYFL >=", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflLessThan(String value) {
            addCriterion("RDYYFL <", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflLessThanOrEqualTo(String value) {
            addCriterion("RDYYFL <=", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflLike(String value) {
            addCriterion("RDYYFL like", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflNotLike(String value) {
            addCriterion("RDYYFL not like", value, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflIn(List<String> values) {
            addCriterion("RDYYFL in", values, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflNotIn(List<String> values) {
            addCriterion("RDYYFL not in", values, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflBetween(String value1, String value2) {
            addCriterion("RDYYFL between", value1, value2, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andRdyyflNotBetween(String value1, String value2) {
            addCriterion("RDYYFL not between", value1, value2, "rdyyfl");
            return (Criteria) this;
        }

        public Criteria andSgrdyyIsNull() {
            addCriterion("SGRDYY is null");
            return (Criteria) this;
        }

        public Criteria andSgrdyyIsNotNull() {
            addCriterion("SGRDYY is not null");
            return (Criteria) this;
        }

        public Criteria andSgrdyyEqualTo(String value) {
            addCriterion("SGRDYY =", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyNotEqualTo(String value) {
            addCriterion("SGRDYY <>", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyGreaterThan(String value) {
            addCriterion("SGRDYY >", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyGreaterThanOrEqualTo(String value) {
            addCriterion("SGRDYY >=", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyLessThan(String value) {
            addCriterion("SGRDYY <", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyLessThanOrEqualTo(String value) {
            addCriterion("SGRDYY <=", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyLike(String value) {
            addCriterion("SGRDYY like", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyNotLike(String value) {
            addCriterion("SGRDYY not like", value, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyIn(List<String> values) {
            addCriterion("SGRDYY in", values, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyNotIn(List<String> values) {
            addCriterion("SGRDYY not in", values, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyBetween(String value1, String value2) {
            addCriterion("SGRDYY between", value1, value2, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andSgrdyyNotBetween(String value1, String value2) {
            addCriterion("SGRDYY not between", value1, value2, "sgrdyy");
            return (Criteria) this;
        }

        public Criteria andTqIsNull() {
            addCriterion("TQ is null");
            return (Criteria) this;
        }

        public Criteria andTqIsNotNull() {
            addCriterion("TQ is not null");
            return (Criteria) this;
        }

        public Criteria andTqEqualTo(String value) {
            addCriterion("TQ =", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqNotEqualTo(String value) {
            addCriterion("TQ <>", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqGreaterThan(String value) {
            addCriterion("TQ >", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqGreaterThanOrEqualTo(String value) {
            addCriterion("TQ >=", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqLessThan(String value) {
            addCriterion("TQ <", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqLessThanOrEqualTo(String value) {
            addCriterion("TQ <=", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqLike(String value) {
            addCriterion("TQ like", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqNotLike(String value) {
            addCriterion("TQ not like", value, "tq");
            return (Criteria) this;
        }

        public Criteria andTqIn(List<String> values) {
            addCriterion("TQ in", values, "tq");
            return (Criteria) this;
        }

        public Criteria andTqNotIn(List<String> values) {
            addCriterion("TQ not in", values, "tq");
            return (Criteria) this;
        }

        public Criteria andTqBetween(String value1, String value2) {
            addCriterion("TQ between", value1, value2, "tq");
            return (Criteria) this;
        }

        public Criteria andTqNotBetween(String value1, String value2) {
            addCriterion("TQ not between", value1, value2, "tq");
            return (Criteria) this;
        }

        public Criteria andXcIsNull() {
            addCriterion("XC is null");
            return (Criteria) this;
        }

        public Criteria andXcIsNotNull() {
            addCriterion("XC is not null");
            return (Criteria) this;
        }

        public Criteria andXcEqualTo(String value) {
            addCriterion("XC =", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcNotEqualTo(String value) {
            addCriterion("XC <>", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcGreaterThan(String value) {
            addCriterion("XC >", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcGreaterThanOrEqualTo(String value) {
            addCriterion("XC >=", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcLessThan(String value) {
            addCriterion("XC <", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcLessThanOrEqualTo(String value) {
            addCriterion("XC <=", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcLike(String value) {
            addCriterion("XC like", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcNotLike(String value) {
            addCriterion("XC not like", value, "xc");
            return (Criteria) this;
        }

        public Criteria andXcIn(List<String> values) {
            addCriterion("XC in", values, "xc");
            return (Criteria) this;
        }

        public Criteria andXcNotIn(List<String> values) {
            addCriterion("XC not in", values, "xc");
            return (Criteria) this;
        }

        public Criteria andXcBetween(String value1, String value2) {
            addCriterion("XC between", value1, value2, "xc");
            return (Criteria) this;
        }

        public Criteria andXcNotBetween(String value1, String value2) {
            addCriterion("XC not between", value1, value2, "xc");
            return (Criteria) this;
        }

        public Criteria andSwsgIsNull() {
            addCriterion("SWSG is null");
            return (Criteria) this;
        }

        public Criteria andSwsgIsNotNull() {
            addCriterion("SWSG is not null");
            return (Criteria) this;
        }

        public Criteria andSwsgEqualTo(String value) {
            addCriterion("SWSG =", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgNotEqualTo(String value) {
            addCriterion("SWSG <>", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgGreaterThan(String value) {
            addCriterion("SWSG >", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgGreaterThanOrEqualTo(String value) {
            addCriterion("SWSG >=", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgLessThan(String value) {
            addCriterion("SWSG <", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgLessThanOrEqualTo(String value) {
            addCriterion("SWSG <=", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgLike(String value) {
            addCriterion("SWSG like", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgNotLike(String value) {
            addCriterion("SWSG not like", value, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgIn(List<String> values) {
            addCriterion("SWSG in", values, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgNotIn(List<String> values) {
            addCriterion("SWSG not in", values, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgBetween(String value1, String value2) {
            addCriterion("SWSG between", value1, value2, "swsg");
            return (Criteria) this;
        }

        public Criteria andSwsgNotBetween(String value1, String value2) {
            addCriterion("SWSG not between", value1, value2, "swsg");
            return (Criteria) this;
        }

        public Criteria andSgxtIsNull() {
            addCriterion("SGXT is null");
            return (Criteria) this;
        }

        public Criteria andSgxtIsNotNull() {
            addCriterion("SGXT is not null");
            return (Criteria) this;
        }

        public Criteria andSgxtEqualTo(String value) {
            addCriterion("SGXT =", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtNotEqualTo(String value) {
            addCriterion("SGXT <>", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtGreaterThan(String value) {
            addCriterion("SGXT >", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtGreaterThanOrEqualTo(String value) {
            addCriterion("SGXT >=", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtLessThan(String value) {
            addCriterion("SGXT <", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtLessThanOrEqualTo(String value) {
            addCriterion("SGXT <=", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtLike(String value) {
            addCriterion("SGXT like", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtNotLike(String value) {
            addCriterion("SGXT not like", value, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtIn(List<String> values) {
            addCriterion("SGXT in", values, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtNotIn(List<String> values) {
            addCriterion("SGXT not in", values, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtBetween(String value1, String value2) {
            addCriterion("SGXT between", value1, value2, "sgxt");
            return (Criteria) this;
        }

        public Criteria andSgxtNotBetween(String value1, String value2) {
            addCriterion("SGXT not between", value1, value2, "sgxt");
            return (Criteria) this;
        }

        public Criteria andCljsgIsNull() {
            addCriterion("CLJSG is null");
            return (Criteria) this;
        }

        public Criteria andCljsgIsNotNull() {
            addCriterion("CLJSG is not null");
            return (Criteria) this;
        }

        public Criteria andCljsgEqualTo(String value) {
            addCriterion("CLJSG =", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgNotEqualTo(String value) {
            addCriterion("CLJSG <>", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgGreaterThan(String value) {
            addCriterion("CLJSG >", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgGreaterThanOrEqualTo(String value) {
            addCriterion("CLJSG >=", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgLessThan(String value) {
            addCriterion("CLJSG <", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgLessThanOrEqualTo(String value) {
            addCriterion("CLJSG <=", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgLike(String value) {
            addCriterion("CLJSG like", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgNotLike(String value) {
            addCriterion("CLJSG not like", value, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgIn(List<String> values) {
            addCriterion("CLJSG in", values, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgNotIn(List<String> values) {
            addCriterion("CLJSG not in", values, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgBetween(String value1, String value2) {
            addCriterion("CLJSG between", value1, value2, "cljsg");
            return (Criteria) this;
        }

        public Criteria andCljsgNotBetween(String value1, String value2) {
            addCriterion("CLJSG not between", value1, value2, "cljsg");
            return (Criteria) this;
        }

        public Criteria andDcsgIsNull() {
            addCriterion("DCSG is null");
            return (Criteria) this;
        }

        public Criteria andDcsgIsNotNull() {
            addCriterion("DCSG is not null");
            return (Criteria) this;
        }

        public Criteria andDcsgEqualTo(String value) {
            addCriterion("DCSG =", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgNotEqualTo(String value) {
            addCriterion("DCSG <>", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgGreaterThan(String value) {
            addCriterion("DCSG >", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgGreaterThanOrEqualTo(String value) {
            addCriterion("DCSG >=", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgLessThan(String value) {
            addCriterion("DCSG <", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgLessThanOrEqualTo(String value) {
            addCriterion("DCSG <=", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgLike(String value) {
            addCriterion("DCSG like", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgNotLike(String value) {
            addCriterion("DCSG not like", value, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgIn(List<String> values) {
            addCriterion("DCSG in", values, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgNotIn(List<String> values) {
            addCriterion("DCSG not in", values, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgBetween(String value1, String value2) {
            addCriterion("DCSG between", value1, value2, "dcsg");
            return (Criteria) this;
        }

        public Criteria andDcsgNotBetween(String value1, String value2) {
            addCriterion("DCSG not between", value1, value2, "dcsg");
            return (Criteria) this;
        }

        public Criteria andPzfsIsNull() {
            addCriterion("PZFS is null");
            return (Criteria) this;
        }

        public Criteria andPzfsIsNotNull() {
            addCriterion("PZFS is not null");
            return (Criteria) this;
        }

        public Criteria andPzfsEqualTo(String value) {
            addCriterion("PZFS =", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsNotEqualTo(String value) {
            addCriterion("PZFS <>", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsGreaterThan(String value) {
            addCriterion("PZFS >", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsGreaterThanOrEqualTo(String value) {
            addCriterion("PZFS >=", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsLessThan(String value) {
            addCriterion("PZFS <", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsLessThanOrEqualTo(String value) {
            addCriterion("PZFS <=", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsLike(String value) {
            addCriterion("PZFS like", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsNotLike(String value) {
            addCriterion("PZFS not like", value, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsIn(List<String> values) {
            addCriterion("PZFS in", values, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsNotIn(List<String> values) {
            addCriterion("PZFS not in", values, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsBetween(String value1, String value2) {
            addCriterion("PZFS between", value1, value2, "pzfs");
            return (Criteria) this;
        }

        public Criteria andPzfsNotBetween(String value1, String value2) {
            addCriterion("PZFS not between", value1, value2, "pzfs");
            return (Criteria) this;
        }

        public Criteria andLbqkIsNull() {
            addCriterion("LBQK is null");
            return (Criteria) this;
        }

        public Criteria andLbqkIsNotNull() {
            addCriterion("LBQK is not null");
            return (Criteria) this;
        }

        public Criteria andLbqkEqualTo(String value) {
            addCriterion("LBQK =", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkNotEqualTo(String value) {
            addCriterion("LBQK <>", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkGreaterThan(String value) {
            addCriterion("LBQK >", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkGreaterThanOrEqualTo(String value) {
            addCriterion("LBQK >=", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkLessThan(String value) {
            addCriterion("LBQK <", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkLessThanOrEqualTo(String value) {
            addCriterion("LBQK <=", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkLike(String value) {
            addCriterion("LBQK like", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkNotLike(String value) {
            addCriterion("LBQK not like", value, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkIn(List<String> values) {
            addCriterion("LBQK in", values, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkNotIn(List<String> values) {
            addCriterion("LBQK not in", values, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkBetween(String value1, String value2) {
            addCriterion("LBQK between", value1, value2, "lbqk");
            return (Criteria) this;
        }

        public Criteria andLbqkNotBetween(String value1, String value2) {
            addCriterion("LBQK not between", value1, value2, "lbqk");
            return (Criteria) this;
        }

        public Criteria andTjr1IsNull() {
            addCriterion("TJR1 is null");
            return (Criteria) this;
        }

        public Criteria andTjr1IsNotNull() {
            addCriterion("TJR1 is not null");
            return (Criteria) this;
        }

        public Criteria andTjr1EqualTo(String value) {
            addCriterion("TJR1 =", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1NotEqualTo(String value) {
            addCriterion("TJR1 <>", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1GreaterThan(String value) {
            addCriterion("TJR1 >", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1GreaterThanOrEqualTo(String value) {
            addCriterion("TJR1 >=", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1LessThan(String value) {
            addCriterion("TJR1 <", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1LessThanOrEqualTo(String value) {
            addCriterion("TJR1 <=", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1Like(String value) {
            addCriterion("TJR1 like", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1NotLike(String value) {
            addCriterion("TJR1 not like", value, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1In(List<String> values) {
            addCriterion("TJR1 in", values, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1NotIn(List<String> values) {
            addCriterion("TJR1 not in", values, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1Between(String value1, String value2) {
            addCriterion("TJR1 between", value1, value2, "tjr1");
            return (Criteria) this;
        }

        public Criteria andTjr1NotBetween(String value1, String value2) {
            addCriterion("TJR1 not between", value1, value2, "tjr1");
            return (Criteria) this;
        }

        public Criteria andCclrsjIsNull() {
            addCriterion("CCLRSJ is null");
            return (Criteria) this;
        }

        public Criteria andCclrsjIsNotNull() {
            addCriterion("CCLRSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCclrsjEqualTo(Date value) {
            addCriterion("CCLRSJ =", value, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjNotEqualTo(Date value) {
            addCriterion("CCLRSJ <>", value, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjGreaterThan(Date value) {
            addCriterion("CCLRSJ >", value, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjGreaterThanOrEqualTo(Date value) {
            addCriterion("CCLRSJ >=", value, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjLessThan(Date value) {
            addCriterion("CCLRSJ <", value, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjLessThanOrEqualTo(Date value) {
            addCriterion("CCLRSJ <=", value, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjIn(List<Date> values) {
            addCriterion("CCLRSJ in", values, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjNotIn(List<Date> values) {
            addCriterion("CCLRSJ not in", values, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjBetween(Date value1, Date value2) {
            addCriterion("CCLRSJ between", value1, value2, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andCclrsjNotBetween(Date value1, Date value2) {
            addCriterion("CCLRSJ not between", value1, value2, "cclrsj");
            return (Criteria) this;
        }

        public Criteria andJllxIsNull() {
            addCriterion("JLLX is null");
            return (Criteria) this;
        }

        public Criteria andJllxIsNotNull() {
            addCriterion("JLLX is not null");
            return (Criteria) this;
        }

        public Criteria andJllxEqualTo(String value) {
            addCriterion("JLLX =", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxNotEqualTo(String value) {
            addCriterion("JLLX <>", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxGreaterThan(String value) {
            addCriterion("JLLX >", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxGreaterThanOrEqualTo(String value) {
            addCriterion("JLLX >=", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxLessThan(String value) {
            addCriterion("JLLX <", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxLessThanOrEqualTo(String value) {
            addCriterion("JLLX <=", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxLike(String value) {
            addCriterion("JLLX like", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxNotLike(String value) {
            addCriterion("JLLX not like", value, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxIn(List<String> values) {
            addCriterion("JLLX in", values, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxNotIn(List<String> values) {
            addCriterion("JLLX not in", values, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxBetween(String value1, String value2) {
            addCriterion("JLLX between", value1, value2, "jllx");
            return (Criteria) this;
        }

        public Criteria andJllxNotBetween(String value1, String value2) {
            addCriterion("JLLX not between", value1, value2, "jllx");
            return (Criteria) this;
        }

        public Criteria andScsjdIsNull() {
            addCriterion("SCSJD is null");
            return (Criteria) this;
        }

        public Criteria andScsjdIsNotNull() {
            addCriterion("SCSJD is not null");
            return (Criteria) this;
        }

        public Criteria andScsjdEqualTo(Short value) {
            addCriterion("SCSJD =", value, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdNotEqualTo(Short value) {
            addCriterion("SCSJD <>", value, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdGreaterThan(Short value) {
            addCriterion("SCSJD >", value, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdGreaterThanOrEqualTo(Short value) {
            addCriterion("SCSJD >=", value, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdLessThan(Short value) {
            addCriterion("SCSJD <", value, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdLessThanOrEqualTo(Short value) {
            addCriterion("SCSJD <=", value, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdIn(List<Short> values) {
            addCriterion("SCSJD in", values, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdNotIn(List<Short> values) {
            addCriterion("SCSJD not in", values, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdBetween(Short value1, Short value2) {
            addCriterion("SCSJD between", value1, value2, "scsjd");
            return (Criteria) this;
        }

        public Criteria andScsjdNotBetween(Short value1, Short value2) {
            addCriterion("SCSJD not between", value1, value2, "scsjd");
            return (Criteria) this;
        }

        public Criteria andSszdIsNull() {
            addCriterion("SSZD is null");
            return (Criteria) this;
        }

        public Criteria andSszdIsNotNull() {
            addCriterion("SSZD is not null");
            return (Criteria) this;
        }

        public Criteria andSszdEqualTo(String value) {
            addCriterion("SSZD =", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdNotEqualTo(String value) {
            addCriterion("SSZD <>", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdGreaterThan(String value) {
            addCriterion("SSZD >", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdGreaterThanOrEqualTo(String value) {
            addCriterion("SSZD >=", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdLessThan(String value) {
            addCriterion("SSZD <", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdLessThanOrEqualTo(String value) {
            addCriterion("SSZD <=", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdLike(String value) {
            addCriterion("SSZD like", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdNotLike(String value) {
            addCriterion("SSZD not like", value, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdIn(List<String> values) {
            addCriterion("SSZD in", values, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdNotIn(List<String> values) {
            addCriterion("SSZD not in", values, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdBetween(String value1, String value2) {
            addCriterion("SSZD between", value1, value2, "sszd");
            return (Criteria) this;
        }

        public Criteria andSszdNotBetween(String value1, String value2) {
            addCriterion("SSZD not between", value1, value2, "sszd");
            return (Criteria) this;
        }

        public Criteria andDahIsNull() {
            addCriterion("DAH is null");
            return (Criteria) this;
        }

        public Criteria andDahIsNotNull() {
            addCriterion("DAH is not null");
            return (Criteria) this;
        }

        public Criteria andDahEqualTo(String value) {
            addCriterion("DAH =", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotEqualTo(String value) {
            addCriterion("DAH <>", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahGreaterThan(String value) {
            addCriterion("DAH >", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahGreaterThanOrEqualTo(String value) {
            addCriterion("DAH >=", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahLessThan(String value) {
            addCriterion("DAH <", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahLessThanOrEqualTo(String value) {
            addCriterion("DAH <=", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahLike(String value) {
            addCriterion("DAH like", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotLike(String value) {
            addCriterion("DAH not like", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahIn(List<String> values) {
            addCriterion("DAH in", values, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotIn(List<String> values) {
            addCriterion("DAH not in", values, "dah");
            return (Criteria) this;
        }

        public Criteria andDahBetween(String value1, String value2) {
            addCriterion("DAH between", value1, value2, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotBetween(String value1, String value2) {
            addCriterion("DAH not between", value1, value2, "dah");
            return (Criteria) this;
        }

        public Criteria andSbIsNull() {
            addCriterion("SB is null");
            return (Criteria) this;
        }

        public Criteria andSbIsNotNull() {
            addCriterion("SB is not null");
            return (Criteria) this;
        }

        public Criteria andSbEqualTo(String value) {
            addCriterion("SB =", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotEqualTo(String value) {
            addCriterion("SB <>", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbGreaterThan(String value) {
            addCriterion("SB >", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbGreaterThanOrEqualTo(String value) {
            addCriterion("SB >=", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLessThan(String value) {
            addCriterion("SB <", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLessThanOrEqualTo(String value) {
            addCriterion("SB <=", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLike(String value) {
            addCriterion("SB like", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotLike(String value) {
            addCriterion("SB not like", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbIn(List<String> values) {
            addCriterion("SB in", values, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotIn(List<String> values) {
            addCriterion("SB not in", values, "sb");
            return (Criteria) this;
        }

        public Criteria andSbBetween(String value1, String value2) {
            addCriterion("SB between", value1, value2, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotBetween(String value1, String value2) {
            addCriterion("SB not between", value1, value2, "sb");
            return (Criteria) this;
        }

        public Criteria andTjsgbhIsNull() {
            addCriterion("TJSGBH is null");
            return (Criteria) this;
        }

        public Criteria andTjsgbhIsNotNull() {
            addCriterion("TJSGBH is not null");
            return (Criteria) this;
        }

        public Criteria andTjsgbhEqualTo(String value) {
            addCriterion("TJSGBH =", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhNotEqualTo(String value) {
            addCriterion("TJSGBH <>", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhGreaterThan(String value) {
            addCriterion("TJSGBH >", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhGreaterThanOrEqualTo(String value) {
            addCriterion("TJSGBH >=", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhLessThan(String value) {
            addCriterion("TJSGBH <", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhLessThanOrEqualTo(String value) {
            addCriterion("TJSGBH <=", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhLike(String value) {
            addCriterion("TJSGBH like", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhNotLike(String value) {
            addCriterion("TJSGBH not like", value, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhIn(List<String> values) {
            addCriterion("TJSGBH in", values, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhNotIn(List<String> values) {
            addCriterion("TJSGBH not in", values, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhBetween(String value1, String value2) {
            addCriterion("TJSGBH between", value1, value2, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andTjsgbhNotBetween(String value1, String value2) {
            addCriterion("TJSGBH not between", value1, value2, "tjsgbh");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNull() {
            addCriterion("GLBM is null");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNotNull() {
            addCriterion("GLBM is not null");
            return (Criteria) this;
        }

        public Criteria andGlbmEqualTo(String value) {
            addCriterion("GLBM =", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotEqualTo(String value) {
            addCriterion("GLBM <>", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThan(String value) {
            addCriterion("GLBM >", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThanOrEqualTo(String value) {
            addCriterion("GLBM >=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThan(String value) {
            addCriterion("GLBM <", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThanOrEqualTo(String value) {
            addCriterion("GLBM <=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLike(String value) {
            addCriterion("GLBM like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotLike(String value) {
            addCriterion("GLBM not like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmIn(List<String> values) {
            addCriterion("GLBM in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotIn(List<String> values) {
            addCriterion("GLBM not in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmBetween(String value1, String value2) {
            addCriterion("GLBM between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotBetween(String value1, String value2) {
            addCriterion("GLBM not between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andDzzbIsNull() {
            addCriterion("DZZB is null");
            return (Criteria) this;
        }

        public Criteria andDzzbIsNotNull() {
            addCriterion("DZZB is not null");
            return (Criteria) this;
        }

        public Criteria andDzzbEqualTo(String value) {
            addCriterion("DZZB =", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbNotEqualTo(String value) {
            addCriterion("DZZB <>", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbGreaterThan(String value) {
            addCriterion("DZZB >", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbGreaterThanOrEqualTo(String value) {
            addCriterion("DZZB >=", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbLessThan(String value) {
            addCriterion("DZZB <", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbLessThanOrEqualTo(String value) {
            addCriterion("DZZB <=", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbLike(String value) {
            addCriterion("DZZB like", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbNotLike(String value) {
            addCriterion("DZZB not like", value, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbIn(List<String> values) {
            addCriterion("DZZB in", values, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbNotIn(List<String> values) {
            addCriterion("DZZB not in", values, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbBetween(String value1, String value2) {
            addCriterion("DZZB between", value1, value2, "dzzb");
            return (Criteria) this;
        }

        public Criteria andDzzbNotBetween(String value1, String value2) {
            addCriterion("DZZB not between", value1, value2, "dzzb");
            return (Criteria) this;
        }

        public Criteria andBadwIsNull() {
            addCriterion("BADW is null");
            return (Criteria) this;
        }

        public Criteria andBadwIsNotNull() {
            addCriterion("BADW is not null");
            return (Criteria) this;
        }

        public Criteria andBadwEqualTo(String value) {
            addCriterion("BADW =", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwNotEqualTo(String value) {
            addCriterion("BADW <>", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwGreaterThan(String value) {
            addCriterion("BADW >", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwGreaterThanOrEqualTo(String value) {
            addCriterion("BADW >=", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwLessThan(String value) {
            addCriterion("BADW <", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwLessThanOrEqualTo(String value) {
            addCriterion("BADW <=", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwLike(String value) {
            addCriterion("BADW like", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwNotLike(String value) {
            addCriterion("BADW not like", value, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwIn(List<String> values) {
            addCriterion("BADW in", values, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwNotIn(List<String> values) {
            addCriterion("BADW not in", values, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwBetween(String value1, String value2) {
            addCriterion("BADW between", value1, value2, "badw");
            return (Criteria) this;
        }

        public Criteria andBadwNotBetween(String value1, String value2) {
            addCriterion("BADW not between", value1, value2, "badw");
            return (Criteria) this;
        }

        public Criteria andWsbhIsNull() {
            addCriterion("WSBH is null");
            return (Criteria) this;
        }

        public Criteria andWsbhIsNotNull() {
            addCriterion("WSBH is not null");
            return (Criteria) this;
        }

        public Criteria andWsbhEqualTo(String value) {
            addCriterion("WSBH =", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhNotEqualTo(String value) {
            addCriterion("WSBH <>", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhGreaterThan(String value) {
            addCriterion("WSBH >", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhGreaterThanOrEqualTo(String value) {
            addCriterion("WSBH >=", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhLessThan(String value) {
            addCriterion("WSBH <", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhLessThanOrEqualTo(String value) {
            addCriterion("WSBH <=", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhLike(String value) {
            addCriterion("WSBH like", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhNotLike(String value) {
            addCriterion("WSBH not like", value, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhIn(List<String> values) {
            addCriterion("WSBH in", values, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhNotIn(List<String> values) {
            addCriterion("WSBH not in", values, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhBetween(String value1, String value2) {
            addCriterion("WSBH between", value1, value2, "wsbh");
            return (Criteria) this;
        }

        public Criteria andWsbhNotBetween(String value1, String value2) {
            addCriterion("WSBH not between", value1, value2, "wsbh");
            return (Criteria) this;
        }

        public Criteria andSgssIsNull() {
            addCriterion("SGSS is null");
            return (Criteria) this;
        }

        public Criteria andSgssIsNotNull() {
            addCriterion("SGSS is not null");
            return (Criteria) this;
        }

        public Criteria andSgssEqualTo(String value) {
            addCriterion("SGSS =", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssNotEqualTo(String value) {
            addCriterion("SGSS <>", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssGreaterThan(String value) {
            addCriterion("SGSS >", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssGreaterThanOrEqualTo(String value) {
            addCriterion("SGSS >=", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssLessThan(String value) {
            addCriterion("SGSS <", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssLessThanOrEqualTo(String value) {
            addCriterion("SGSS <=", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssLike(String value) {
            addCriterion("SGSS like", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssNotLike(String value) {
            addCriterion("SGSS not like", value, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssIn(List<String> values) {
            addCriterion("SGSS in", values, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssNotIn(List<String> values) {
            addCriterion("SGSS not in", values, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssBetween(String value1, String value2) {
            addCriterion("SGSS between", value1, value2, "sgss");
            return (Criteria) this;
        }

        public Criteria andSgssNotBetween(String value1, String value2) {
            addCriterion("SGSS not between", value1, value2, "sgss");
            return (Criteria) this;
        }

        public Criteria andZrtjjgIsNull() {
            addCriterion("ZRTJJG is null");
            return (Criteria) this;
        }

        public Criteria andZrtjjgIsNotNull() {
            addCriterion("ZRTJJG is not null");
            return (Criteria) this;
        }

        public Criteria andZrtjjgEqualTo(String value) {
            addCriterion("ZRTJJG =", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgNotEqualTo(String value) {
            addCriterion("ZRTJJG <>", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgGreaterThan(String value) {
            addCriterion("ZRTJJG >", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgGreaterThanOrEqualTo(String value) {
            addCriterion("ZRTJJG >=", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgLessThan(String value) {
            addCriterion("ZRTJJG <", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgLessThanOrEqualTo(String value) {
            addCriterion("ZRTJJG <=", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgLike(String value) {
            addCriterion("ZRTJJG like", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgNotLike(String value) {
            addCriterion("ZRTJJG not like", value, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgIn(List<String> values) {
            addCriterion("ZRTJJG in", values, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgNotIn(List<String> values) {
            addCriterion("ZRTJJG not in", values, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgBetween(String value1, String value2) {
            addCriterion("ZRTJJG between", value1, value2, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andZrtjjgNotBetween(String value1, String value2) {
            addCriterion("ZRTJJG not between", value1, value2, "zrtjjg");
            return (Criteria) this;
        }

        public Criteria andJar1IsNull() {
            addCriterion("JAR1 is null");
            return (Criteria) this;
        }

        public Criteria andJar1IsNotNull() {
            addCriterion("JAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andJar1EqualTo(String value) {
            addCriterion("JAR1 =", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1NotEqualTo(String value) {
            addCriterion("JAR1 <>", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1GreaterThan(String value) {
            addCriterion("JAR1 >", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1GreaterThanOrEqualTo(String value) {
            addCriterion("JAR1 >=", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1LessThan(String value) {
            addCriterion("JAR1 <", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1LessThanOrEqualTo(String value) {
            addCriterion("JAR1 <=", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1Like(String value) {
            addCriterion("JAR1 like", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1NotLike(String value) {
            addCriterion("JAR1 not like", value, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1In(List<String> values) {
            addCriterion("JAR1 in", values, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1NotIn(List<String> values) {
            addCriterion("JAR1 not in", values, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1Between(String value1, String value2) {
            addCriterion("JAR1 between", value1, value2, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar1NotBetween(String value1, String value2) {
            addCriterion("JAR1 not between", value1, value2, "jar1");
            return (Criteria) this;
        }

        public Criteria andJar2IsNull() {
            addCriterion("JAR2 is null");
            return (Criteria) this;
        }

        public Criteria andJar2IsNotNull() {
            addCriterion("JAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andJar2EqualTo(String value) {
            addCriterion("JAR2 =", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2NotEqualTo(String value) {
            addCriterion("JAR2 <>", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2GreaterThan(String value) {
            addCriterion("JAR2 >", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2GreaterThanOrEqualTo(String value) {
            addCriterion("JAR2 >=", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2LessThan(String value) {
            addCriterion("JAR2 <", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2LessThanOrEqualTo(String value) {
            addCriterion("JAR2 <=", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2Like(String value) {
            addCriterion("JAR2 like", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2NotLike(String value) {
            addCriterion("JAR2 not like", value, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2In(List<String> values) {
            addCriterion("JAR2 in", values, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2NotIn(List<String> values) {
            addCriterion("JAR2 not in", values, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2Between(String value1, String value2) {
            addCriterion("JAR2 between", value1, value2, "jar2");
            return (Criteria) this;
        }

        public Criteria andJar2NotBetween(String value1, String value2) {
            addCriterion("JAR2 not between", value1, value2, "jar2");
            return (Criteria) this;
        }

        public Criteria andJbrIsNull() {
            addCriterion("JBR is null");
            return (Criteria) this;
        }

        public Criteria andJbrIsNotNull() {
            addCriterion("JBR is not null");
            return (Criteria) this;
        }

        public Criteria andJbrEqualTo(String value) {
            addCriterion("JBR =", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotEqualTo(String value) {
            addCriterion("JBR <>", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThan(String value) {
            addCriterion("JBR >", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThanOrEqualTo(String value) {
            addCriterion("JBR >=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThan(String value) {
            addCriterion("JBR <", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThanOrEqualTo(String value) {
            addCriterion("JBR <=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLike(String value) {
            addCriterion("JBR like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotLike(String value) {
            addCriterion("JBR not like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrIn(List<String> values) {
            addCriterion("JBR in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotIn(List<String> values) {
            addCriterion("JBR not in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrBetween(String value1, String value2) {
            addCriterion("JBR between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotBetween(String value1, String value2) {
            addCriterion("JBR not between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNull() {
            addCriterion("GXSJ is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("GXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Date value) {
            addCriterion("GXSJ =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Date value) {
            addCriterion("GXSJ <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Date value) {
            addCriterion("GXSJ >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("GXSJ >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Date value) {
            addCriterion("GXSJ <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Date value) {
            addCriterion("GXSJ <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<Date> values) {
            addCriterion("GXSJ in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<Date> values) {
            addCriterion("GXSJ not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Date value1, Date value2) {
            addCriterion("GXSJ between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Date value1, Date value2) {
            addCriterion("GXSJ not between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andJywIsNull() {
            addCriterion("JYW is null");
            return (Criteria) this;
        }

        public Criteria andJywIsNotNull() {
            addCriterion("JYW is not null");
            return (Criteria) this;
        }

        public Criteria andJywEqualTo(String value) {
            addCriterion("JYW =", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotEqualTo(String value) {
            addCriterion("JYW <>", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywGreaterThan(String value) {
            addCriterion("JYW >", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywGreaterThanOrEqualTo(String value) {
            addCriterion("JYW >=", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLessThan(String value) {
            addCriterion("JYW <", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLessThanOrEqualTo(String value) {
            addCriterion("JYW <=", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLike(String value) {
            addCriterion("JYW like", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotLike(String value) {
            addCriterion("JYW not like", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywIn(List<String> values) {
            addCriterion("JYW in", values, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotIn(List<String> values) {
            addCriterion("JYW not in", values, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywBetween(String value1, String value2) {
            addCriterion("JYW between", value1, value2, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotBetween(String value1, String value2) {
            addCriterion("JYW not between", value1, value2, "jyw");
            return (Criteria) this;
        }

        public Criteria andJafsIsNull() {
            addCriterion("JAFS is null");
            return (Criteria) this;
        }

        public Criteria andJafsIsNotNull() {
            addCriterion("JAFS is not null");
            return (Criteria) this;
        }

        public Criteria andJafsEqualTo(String value) {
            addCriterion("JAFS =", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsNotEqualTo(String value) {
            addCriterion("JAFS <>", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsGreaterThan(String value) {
            addCriterion("JAFS >", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsGreaterThanOrEqualTo(String value) {
            addCriterion("JAFS >=", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsLessThan(String value) {
            addCriterion("JAFS <", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsLessThanOrEqualTo(String value) {
            addCriterion("JAFS <=", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsLike(String value) {
            addCriterion("JAFS like", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsNotLike(String value) {
            addCriterion("JAFS not like", value, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsIn(List<String> values) {
            addCriterion("JAFS in", values, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsNotIn(List<String> values) {
            addCriterion("JAFS not in", values, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsBetween(String value1, String value2) {
            addCriterion("JAFS between", value1, value2, "jafs");
            return (Criteria) this;
        }

        public Criteria andJafsNotBetween(String value1, String value2) {
            addCriterion("JAFS not between", value1, value2, "jafs");
            return (Criteria) this;
        }

        public Criteria andDllxIsNull() {
            addCriterion("DLLX is null");
            return (Criteria) this;
        }

        public Criteria andDllxIsNotNull() {
            addCriterion("DLLX is not null");
            return (Criteria) this;
        }

        public Criteria andDllxEqualTo(String value) {
            addCriterion("DLLX =", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotEqualTo(String value) {
            addCriterion("DLLX <>", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxGreaterThan(String value) {
            addCriterion("DLLX >", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxGreaterThanOrEqualTo(String value) {
            addCriterion("DLLX >=", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxLessThan(String value) {
            addCriterion("DLLX <", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxLessThanOrEqualTo(String value) {
            addCriterion("DLLX <=", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxLike(String value) {
            addCriterion("DLLX like", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotLike(String value) {
            addCriterion("DLLX not like", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxIn(List<String> values) {
            addCriterion("DLLX in", values, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotIn(List<String> values) {
            addCriterion("DLLX not in", values, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxBetween(String value1, String value2) {
            addCriterion("DLLX between", value1, value2, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotBetween(String value1, String value2) {
            addCriterion("DLLX not between", value1, value2, "dllx");
            return (Criteria) this;
        }

        public Criteria andGlxzdjIsNull() {
            addCriterion("GLXZDJ is null");
            return (Criteria) this;
        }

        public Criteria andGlxzdjIsNotNull() {
            addCriterion("GLXZDJ is not null");
            return (Criteria) this;
        }

        public Criteria andGlxzdjEqualTo(String value) {
            addCriterion("GLXZDJ =", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjNotEqualTo(String value) {
            addCriterion("GLXZDJ <>", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjGreaterThan(String value) {
            addCriterion("GLXZDJ >", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjGreaterThanOrEqualTo(String value) {
            addCriterion("GLXZDJ >=", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjLessThan(String value) {
            addCriterion("GLXZDJ <", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjLessThanOrEqualTo(String value) {
            addCriterion("GLXZDJ <=", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjLike(String value) {
            addCriterion("GLXZDJ like", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjNotLike(String value) {
            addCriterion("GLXZDJ not like", value, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjIn(List<String> values) {
            addCriterion("GLXZDJ in", values, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjNotIn(List<String> values) {
            addCriterion("GLXZDJ not in", values, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjBetween(String value1, String value2) {
            addCriterion("GLXZDJ between", value1, value2, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andGlxzdjNotBetween(String value1, String value2) {
            addCriterion("GLXZDJ not between", value1, value2, "glxzdj");
            return (Criteria) this;
        }

        public Criteria andTjfsIsNull() {
            addCriterion("TJFS is null");
            return (Criteria) this;
        }

        public Criteria andTjfsIsNotNull() {
            addCriterion("TJFS is not null");
            return (Criteria) this;
        }

        public Criteria andTjfsEqualTo(String value) {
            addCriterion("TJFS =", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsNotEqualTo(String value) {
            addCriterion("TJFS <>", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsGreaterThan(String value) {
            addCriterion("TJFS >", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsGreaterThanOrEqualTo(String value) {
            addCriterion("TJFS >=", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsLessThan(String value) {
            addCriterion("TJFS <", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsLessThanOrEqualTo(String value) {
            addCriterion("TJFS <=", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsLike(String value) {
            addCriterion("TJFS like", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsNotLike(String value) {
            addCriterion("TJFS not like", value, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsIn(List<String> values) {
            addCriterion("TJFS in", values, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsNotIn(List<String> values) {
            addCriterion("TJFS not in", values, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsBetween(String value1, String value2) {
            addCriterion("TJFS between", value1, value2, "tjfs");
            return (Criteria) this;
        }

        public Criteria andTjfsNotBetween(String value1, String value2) {
            addCriterion("TJFS not between", value1, value2, "tjfs");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNull() {
            addCriterion("SJLY is null");
            return (Criteria) this;
        }

        public Criteria andSjlyIsNotNull() {
            addCriterion("SJLY is not null");
            return (Criteria) this;
        }

        public Criteria andSjlyEqualTo(String value) {
            addCriterion("SJLY =", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotEqualTo(String value) {
            addCriterion("SJLY <>", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThan(String value) {
            addCriterion("SJLY >", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyGreaterThanOrEqualTo(String value) {
            addCriterion("SJLY >=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThan(String value) {
            addCriterion("SJLY <", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLessThanOrEqualTo(String value) {
            addCriterion("SJLY <=", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyLike(String value) {
            addCriterion("SJLY like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotLike(String value) {
            addCriterion("SJLY not like", value, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyIn(List<String> values) {
            addCriterion("SJLY in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotIn(List<String> values) {
            addCriterion("SJLY not in", values, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyBetween(String value1, String value2) {
            addCriterion("SJLY between", value1, value2, "sjly");
            return (Criteria) this;
        }

        public Criteria andSjlyNotBetween(String value1, String value2) {
            addCriterion("SJLY not between", value1, value2, "sjly");
            return (Criteria) this;
        }

        public Criteria andZblxIsNull() {
            addCriterion("ZBLX is null");
            return (Criteria) this;
        }

        public Criteria andZblxIsNotNull() {
            addCriterion("ZBLX is not null");
            return (Criteria) this;
        }

        public Criteria andZblxEqualTo(String value) {
            addCriterion("ZBLX =", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxNotEqualTo(String value) {
            addCriterion("ZBLX <>", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxGreaterThan(String value) {
            addCriterion("ZBLX >", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxGreaterThanOrEqualTo(String value) {
            addCriterion("ZBLX >=", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxLessThan(String value) {
            addCriterion("ZBLX <", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxLessThanOrEqualTo(String value) {
            addCriterion("ZBLX <=", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxLike(String value) {
            addCriterion("ZBLX like", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxNotLike(String value) {
            addCriterion("ZBLX not like", value, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxIn(List<String> values) {
            addCriterion("ZBLX in", values, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxNotIn(List<String> values) {
            addCriterion("ZBLX not in", values, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxBetween(String value1, String value2) {
            addCriterion("ZBLX between", value1, value2, "zblx");
            return (Criteria) this;
        }

        public Criteria andZblxNotBetween(String value1, String value2) {
            addCriterion("ZBLX not between", value1, value2, "zblx");
            return (Criteria) this;
        }

        public Criteria andSprIsNull() {
            addCriterion("SPR is null");
            return (Criteria) this;
        }

        public Criteria andSprIsNotNull() {
            addCriterion("SPR is not null");
            return (Criteria) this;
        }

        public Criteria andSprEqualTo(String value) {
            addCriterion("SPR =", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotEqualTo(String value) {
            addCriterion("SPR <>", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprGreaterThan(String value) {
            addCriterion("SPR >", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprGreaterThanOrEqualTo(String value) {
            addCriterion("SPR >=", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprLessThan(String value) {
            addCriterion("SPR <", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprLessThanOrEqualTo(String value) {
            addCriterion("SPR <=", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprLike(String value) {
            addCriterion("SPR like", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotLike(String value) {
            addCriterion("SPR not like", value, "spr");
            return (Criteria) this;
        }

        public Criteria andSprIn(List<String> values) {
            addCriterion("SPR in", values, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotIn(List<String> values) {
            addCriterion("SPR not in", values, "spr");
            return (Criteria) this;
        }

        public Criteria andSprBetween(String value1, String value2) {
            addCriterion("SPR between", value1, value2, "spr");
            return (Criteria) this;
        }

        public Criteria andSprNotBetween(String value1, String value2) {
            addCriterion("SPR not between", value1, value2, "spr");
            return (Criteria) this;
        }

        public Criteria andSprqIsNull() {
            addCriterion("SPRQ is null");
            return (Criteria) this;
        }

        public Criteria andSprqIsNotNull() {
            addCriterion("SPRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSprqEqualTo(Date value) {
            addCriterion("SPRQ =", value, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqNotEqualTo(Date value) {
            addCriterion("SPRQ <>", value, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqGreaterThan(Date value) {
            addCriterion("SPRQ >", value, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqGreaterThanOrEqualTo(Date value) {
            addCriterion("SPRQ >=", value, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqLessThan(Date value) {
            addCriterion("SPRQ <", value, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqLessThanOrEqualTo(Date value) {
            addCriterion("SPRQ <=", value, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqIn(List<Date> values) {
            addCriterion("SPRQ in", values, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqNotIn(List<Date> values) {
            addCriterion("SPRQ not in", values, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqBetween(Date value1, Date value2) {
            addCriterion("SPRQ between", value1, value2, "sprq");
            return (Criteria) this;
        }

        public Criteria andSprqNotBetween(Date value1, Date value2) {
            addCriterion("SPRQ not between", value1, value2, "sprq");
            return (Criteria) this;
        }

        public Criteria andZzrqIsNull() {
            addCriterion("ZZRQ is null");
            return (Criteria) this;
        }

        public Criteria andZzrqIsNotNull() {
            addCriterion("ZZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andZzrqEqualTo(Date value) {
            addCriterion("ZZRQ =", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqNotEqualTo(Date value) {
            addCriterion("ZZRQ <>", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqGreaterThan(Date value) {
            addCriterion("ZZRQ >", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ZZRQ >=", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqLessThan(Date value) {
            addCriterion("ZZRQ <", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqLessThanOrEqualTo(Date value) {
            addCriterion("ZZRQ <=", value, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqIn(List<Date> values) {
            addCriterion("ZZRQ in", values, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqNotIn(List<Date> values) {
            addCriterion("ZZRQ not in", values, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqBetween(Date value1, Date value2) {
            addCriterion("ZZRQ between", value1, value2, "zzrq");
            return (Criteria) this;
        }

        public Criteria andZzrqNotBetween(Date value1, Date value2) {
            addCriterion("ZZRQ not between", value1, value2, "zzrq");
            return (Criteria) this;
        }

        public Criteria andYwsbhIsNull() {
            addCriterion("YWSBH is null");
            return (Criteria) this;
        }

        public Criteria andYwsbhIsNotNull() {
            addCriterion("YWSBH is not null");
            return (Criteria) this;
        }

        public Criteria andYwsbhEqualTo(String value) {
            addCriterion("YWSBH =", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhNotEqualTo(String value) {
            addCriterion("YWSBH <>", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhGreaterThan(String value) {
            addCriterion("YWSBH >", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhGreaterThanOrEqualTo(String value) {
            addCriterion("YWSBH >=", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhLessThan(String value) {
            addCriterion("YWSBH <", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhLessThanOrEqualTo(String value) {
            addCriterion("YWSBH <=", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhLike(String value) {
            addCriterion("YWSBH like", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhNotLike(String value) {
            addCriterion("YWSBH not like", value, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhIn(List<String> values) {
            addCriterion("YWSBH in", values, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhNotIn(List<String> values) {
            addCriterion("YWSBH not in", values, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhBetween(String value1, String value2) {
            addCriterion("YWSBH between", value1, value2, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andYwsbhNotBetween(String value1, String value2) {
            addCriterion("YWSBH not between", value1, value2, "ywsbh");
            return (Criteria) this;
        }

        public Criteria andJmnrIsNull() {
            addCriterion("JMNR is null");
            return (Criteria) this;
        }

        public Criteria andJmnrIsNotNull() {
            addCriterion("JMNR is not null");
            return (Criteria) this;
        }

        public Criteria andJmnrEqualTo(String value) {
            addCriterion("JMNR =", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrNotEqualTo(String value) {
            addCriterion("JMNR <>", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrGreaterThan(String value) {
            addCriterion("JMNR >", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrGreaterThanOrEqualTo(String value) {
            addCriterion("JMNR >=", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrLessThan(String value) {
            addCriterion("JMNR <", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrLessThanOrEqualTo(String value) {
            addCriterion("JMNR <=", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrLike(String value) {
            addCriterion("JMNR like", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrNotLike(String value) {
            addCriterion("JMNR not like", value, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrIn(List<String> values) {
            addCriterion("JMNR in", values, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrNotIn(List<String> values) {
            addCriterion("JMNR not in", values, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrBetween(String value1, String value2) {
            addCriterion("JMNR between", value1, value2, "jmnr");
            return (Criteria) this;
        }

        public Criteria andJmnrNotBetween(String value1, String value2) {
            addCriterion("JMNR not between", value1, value2, "jmnr");
            return (Criteria) this;
        }

        public Criteria andSpthyjIsNull() {
            addCriterion("SPTHYJ is null");
            return (Criteria) this;
        }

        public Criteria andSpthyjIsNotNull() {
            addCriterion("SPTHYJ is not null");
            return (Criteria) this;
        }

        public Criteria andSpthyjEqualTo(String value) {
            addCriterion("SPTHYJ =", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjNotEqualTo(String value) {
            addCriterion("SPTHYJ <>", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjGreaterThan(String value) {
            addCriterion("SPTHYJ >", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjGreaterThanOrEqualTo(String value) {
            addCriterion("SPTHYJ >=", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjLessThan(String value) {
            addCriterion("SPTHYJ <", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjLessThanOrEqualTo(String value) {
            addCriterion("SPTHYJ <=", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjLike(String value) {
            addCriterion("SPTHYJ like", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjNotLike(String value) {
            addCriterion("SPTHYJ not like", value, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjIn(List<String> values) {
            addCriterion("SPTHYJ in", values, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjNotIn(List<String> values) {
            addCriterion("SPTHYJ not in", values, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjBetween(String value1, String value2) {
            addCriterion("SPTHYJ between", value1, value2, "spthyj");
            return (Criteria) this;
        }

        public Criteria andSpthyjNotBetween(String value1, String value2) {
            addCriterion("SPTHYJ not between", value1, value2, "spthyj");
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