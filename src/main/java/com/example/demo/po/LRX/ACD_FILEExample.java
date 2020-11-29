package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ACD_FILEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ACD_FILEExample() {
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

        public Criteria andKskcsjIsNull() {
            addCriterion("KSKCSJ is null");
            return (Criteria) this;
        }

        public Criteria andKskcsjIsNotNull() {
            addCriterion("KSKCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKskcsjEqualTo(Date value) {
            addCriterion("KSKCSJ =", value, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjNotEqualTo(Date value) {
            addCriterion("KSKCSJ <>", value, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjGreaterThan(Date value) {
            addCriterion("KSKCSJ >", value, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjGreaterThanOrEqualTo(Date value) {
            addCriterion("KSKCSJ >=", value, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjLessThan(Date value) {
            addCriterion("KSKCSJ <", value, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjLessThanOrEqualTo(Date value) {
            addCriterion("KSKCSJ <=", value, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjIn(List<Date> values) {
            addCriterion("KSKCSJ in", values, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjNotIn(List<Date> values) {
            addCriterion("KSKCSJ not in", values, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjBetween(Date value1, Date value2) {
            addCriterion("KSKCSJ between", value1, value2, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andKskcsjNotBetween(Date value1, Date value2) {
            addCriterion("KSKCSJ not between", value1, value2, "kskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjIsNull() {
            addCriterion("JSKCSJ is null");
            return (Criteria) this;
        }

        public Criteria andJskcsjIsNotNull() {
            addCriterion("JSKCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJskcsjEqualTo(Date value) {
            addCriterion("JSKCSJ =", value, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjNotEqualTo(Date value) {
            addCriterion("JSKCSJ <>", value, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjGreaterThan(Date value) {
            addCriterion("JSKCSJ >", value, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjGreaterThanOrEqualTo(Date value) {
            addCriterion("JSKCSJ >=", value, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjLessThan(Date value) {
            addCriterion("JSKCSJ <", value, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjLessThanOrEqualTo(Date value) {
            addCriterion("JSKCSJ <=", value, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjIn(List<Date> values) {
            addCriterion("JSKCSJ in", values, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjNotIn(List<Date> values) {
            addCriterion("JSKCSJ not in", values, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjBetween(Date value1, Date value2) {
            addCriterion("JSKCSJ between", value1, value2, "jskcsj");
            return (Criteria) this;
        }

        public Criteria andJskcsjNotBetween(Date value1, Date value2) {
            addCriterion("JSKCSJ not between", value1, value2, "jskcsj");
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

        public Criteria andQdmsIsNull() {
            addCriterion("QDMS is null");
            return (Criteria) this;
        }

        public Criteria andQdmsIsNotNull() {
            addCriterion("QDMS is not null");
            return (Criteria) this;
        }

        public Criteria andQdmsEqualTo(Short value) {
            addCriterion("QDMS =", value, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsNotEqualTo(Short value) {
            addCriterion("QDMS <>", value, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsGreaterThan(Short value) {
            addCriterion("QDMS >", value, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsGreaterThanOrEqualTo(Short value) {
            addCriterion("QDMS >=", value, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsLessThan(Short value) {
            addCriterion("QDMS <", value, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsLessThanOrEqualTo(Short value) {
            addCriterion("QDMS <=", value, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsIn(List<Short> values) {
            addCriterion("QDMS in", values, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsNotIn(List<Short> values) {
            addCriterion("QDMS not in", values, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsBetween(Short value1, Short value2) {
            addCriterion("QDMS between", value1, value2, "qdms");
            return (Criteria) this;
        }

        public Criteria andQdmsNotBetween(Short value1, Short value2) {
            addCriterion("QDMS not between", value1, value2, "qdms");
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

        public Criteria andZhdmwzIsNull() {
            addCriterion("ZHDMWZ is null");
            return (Criteria) this;
        }

        public Criteria andZhdmwzIsNotNull() {
            addCriterion("ZHDMWZ is not null");
            return (Criteria) this;
        }

        public Criteria andZhdmwzEqualTo(String value) {
            addCriterion("ZHDMWZ =", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzNotEqualTo(String value) {
            addCriterion("ZHDMWZ <>", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzGreaterThan(String value) {
            addCriterion("ZHDMWZ >", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzGreaterThanOrEqualTo(String value) {
            addCriterion("ZHDMWZ >=", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzLessThan(String value) {
            addCriterion("ZHDMWZ <", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzLessThanOrEqualTo(String value) {
            addCriterion("ZHDMWZ <=", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzLike(String value) {
            addCriterion("ZHDMWZ like", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzNotLike(String value) {
            addCriterion("ZHDMWZ not like", value, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzIn(List<String> values) {
            addCriterion("ZHDMWZ in", values, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzNotIn(List<String> values) {
            addCriterion("ZHDMWZ not in", values, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzBetween(String value1, String value2) {
            addCriterion("ZHDMWZ between", value1, value2, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZhdmwzNotBetween(String value1, String value2) {
            addCriterion("ZHDMWZ not between", value1, value2, "zhdmwz");
            return (Criteria) this;
        }

        public Criteria andZyglssIsNull() {
            addCriterion("ZYGLSS is null");
            return (Criteria) this;
        }

        public Criteria andZyglssIsNotNull() {
            addCriterion("ZYGLSS is not null");
            return (Criteria) this;
        }

        public Criteria andZyglssEqualTo(String value) {
            addCriterion("ZYGLSS =", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssNotEqualTo(String value) {
            addCriterion("ZYGLSS <>", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssGreaterThan(String value) {
            addCriterion("ZYGLSS >", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssGreaterThanOrEqualTo(String value) {
            addCriterion("ZYGLSS >=", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssLessThan(String value) {
            addCriterion("ZYGLSS <", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssLessThanOrEqualTo(String value) {
            addCriterion("ZYGLSS <=", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssLike(String value) {
            addCriterion("ZYGLSS like", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssNotLike(String value) {
            addCriterion("ZYGLSS not like", value, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssIn(List<String> values) {
            addCriterion("ZYGLSS in", values, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssNotIn(List<String> values) {
            addCriterion("ZYGLSS not in", values, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssBetween(String value1, String value2) {
            addCriterion("ZYGLSS between", value1, value2, "zyglss");
            return (Criteria) this;
        }

        public Criteria andZyglssNotBetween(String value1, String value2) {
            addCriterion("ZYGLSS not between", value1, value2, "zyglss");
            return (Criteria) this;
        }

        public Criteria andDlaqsxIsNull() {
            addCriterion("DLAQSX is null");
            return (Criteria) this;
        }

        public Criteria andDlaqsxIsNotNull() {
            addCriterion("DLAQSX is not null");
            return (Criteria) this;
        }

        public Criteria andDlaqsxEqualTo(String value) {
            addCriterion("DLAQSX =", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxNotEqualTo(String value) {
            addCriterion("DLAQSX <>", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxGreaterThan(String value) {
            addCriterion("DLAQSX >", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxGreaterThanOrEqualTo(String value) {
            addCriterion("DLAQSX >=", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxLessThan(String value) {
            addCriterion("DLAQSX <", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxLessThanOrEqualTo(String value) {
            addCriterion("DLAQSX <=", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxLike(String value) {
            addCriterion("DLAQSX like", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxNotLike(String value) {
            addCriterion("DLAQSX not like", value, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxIn(List<String> values) {
            addCriterion("DLAQSX in", values, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxNotIn(List<String> values) {
            addCriterion("DLAQSX not in", values, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxBetween(String value1, String value2) {
            addCriterion("DLAQSX between", value1, value2, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andDlaqsxNotBetween(String value1, String value2) {
            addCriterion("DLAQSX not between", value1, value2, "dlaqsx");
            return (Criteria) this;
        }

        public Criteria andJtxhfsIsNull() {
            addCriterion("JTXHFS is null");
            return (Criteria) this;
        }

        public Criteria andJtxhfsIsNotNull() {
            addCriterion("JTXHFS is not null");
            return (Criteria) this;
        }

        public Criteria andJtxhfsEqualTo(String value) {
            addCriterion("JTXHFS =", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsNotEqualTo(String value) {
            addCriterion("JTXHFS <>", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsGreaterThan(String value) {
            addCriterion("JTXHFS >", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsGreaterThanOrEqualTo(String value) {
            addCriterion("JTXHFS >=", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsLessThan(String value) {
            addCriterion("JTXHFS <", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsLessThanOrEqualTo(String value) {
            addCriterion("JTXHFS <=", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsLike(String value) {
            addCriterion("JTXHFS like", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsNotLike(String value) {
            addCriterion("JTXHFS not like", value, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsIn(List<String> values) {
            addCriterion("JTXHFS in", values, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsNotIn(List<String> values) {
            addCriterion("JTXHFS not in", values, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsBetween(String value1, String value2) {
            addCriterion("JTXHFS between", value1, value2, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andJtxhfsNotBetween(String value1, String value2) {
            addCriterion("JTXHFS not between", value1, value2, "jtxhfs");
            return (Criteria) this;
        }

        public Criteria andFhsslxIsNull() {
            addCriterion("FHSSLX is null");
            return (Criteria) this;
        }

        public Criteria andFhsslxIsNotNull() {
            addCriterion("FHSSLX is not null");
            return (Criteria) this;
        }

        public Criteria andFhsslxEqualTo(String value) {
            addCriterion("FHSSLX =", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxNotEqualTo(String value) {
            addCriterion("FHSSLX <>", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxGreaterThan(String value) {
            addCriterion("FHSSLX >", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxGreaterThanOrEqualTo(String value) {
            addCriterion("FHSSLX >=", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxLessThan(String value) {
            addCriterion("FHSSLX <", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxLessThanOrEqualTo(String value) {
            addCriterion("FHSSLX <=", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxLike(String value) {
            addCriterion("FHSSLX like", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxNotLike(String value) {
            addCriterion("FHSSLX not like", value, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxIn(List<String> values) {
            addCriterion("FHSSLX in", values, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxNotIn(List<String> values) {
            addCriterion("FHSSLX not in", values, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxBetween(String value1, String value2) {
            addCriterion("FHSSLX between", value1, value2, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andFhsslxNotBetween(String value1, String value2) {
            addCriterion("FHSSLX not between", value1, value2, "fhsslx");
            return (Criteria) this;
        }

        public Criteria andDlwlglIsNull() {
            addCriterion("DLWLGL is null");
            return (Criteria) this;
        }

        public Criteria andDlwlglIsNotNull() {
            addCriterion("DLWLGL is not null");
            return (Criteria) this;
        }

        public Criteria andDlwlglEqualTo(String value) {
            addCriterion("DLWLGL =", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglNotEqualTo(String value) {
            addCriterion("DLWLGL <>", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglGreaterThan(String value) {
            addCriterion("DLWLGL >", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglGreaterThanOrEqualTo(String value) {
            addCriterion("DLWLGL >=", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglLessThan(String value) {
            addCriterion("DLWLGL <", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglLessThanOrEqualTo(String value) {
            addCriterion("DLWLGL <=", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglLike(String value) {
            addCriterion("DLWLGL like", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglNotLike(String value) {
            addCriterion("DLWLGL not like", value, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglIn(List<String> values) {
            addCriterion("DLWLGL in", values, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglNotIn(List<String> values) {
            addCriterion("DLWLGL not in", values, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglBetween(String value1, String value2) {
            addCriterion("DLWLGL between", value1, value2, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andDlwlglNotBetween(String value1, String value2) {
            addCriterion("DLWLGL not between", value1, value2, "dlwlgl");
            return (Criteria) this;
        }

        public Criteria andLmzkIsNull() {
            addCriterion("LMZK is null");
            return (Criteria) this;
        }

        public Criteria andLmzkIsNotNull() {
            addCriterion("LMZK is not null");
            return (Criteria) this;
        }

        public Criteria andLmzkEqualTo(String value) {
            addCriterion("LMZK =", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkNotEqualTo(String value) {
            addCriterion("LMZK <>", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkGreaterThan(String value) {
            addCriterion("LMZK >", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkGreaterThanOrEqualTo(String value) {
            addCriterion("LMZK >=", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkLessThan(String value) {
            addCriterion("LMZK <", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkLessThanOrEqualTo(String value) {
            addCriterion("LMZK <=", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkLike(String value) {
            addCriterion("LMZK like", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkNotLike(String value) {
            addCriterion("LMZK not like", value, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkIn(List<String> values) {
            addCriterion("LMZK in", values, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkNotIn(List<String> values) {
            addCriterion("LMZK not in", values, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkBetween(String value1, String value2) {
            addCriterion("LMZK between", value1, value2, "lmzk");
            return (Criteria) this;
        }

        public Criteria andLmzkNotBetween(String value1, String value2) {
            addCriterion("LMZK not between", value1, value2, "lmzk");
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

        public Criteria andLmjgIsNull() {
            addCriterion("LMJG is null");
            return (Criteria) this;
        }

        public Criteria andLmjgIsNotNull() {
            addCriterion("LMJG is not null");
            return (Criteria) this;
        }

        public Criteria andLmjgEqualTo(String value) {
            addCriterion("LMJG =", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgNotEqualTo(String value) {
            addCriterion("LMJG <>", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgGreaterThan(String value) {
            addCriterion("LMJG >", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgGreaterThanOrEqualTo(String value) {
            addCriterion("LMJG >=", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgLessThan(String value) {
            addCriterion("LMJG <", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgLessThanOrEqualTo(String value) {
            addCriterion("LMJG <=", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgLike(String value) {
            addCriterion("LMJG like", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgNotLike(String value) {
            addCriterion("LMJG not like", value, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgIn(List<String> values) {
            addCriterion("LMJG in", values, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgNotIn(List<String> values) {
            addCriterion("LMJG not in", values, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgBetween(String value1, String value2) {
            addCriterion("LMJG between", value1, value2, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLmjgNotBetween(String value1, String value2) {
            addCriterion("LMJG not between", value1, value2, "lmjg");
            return (Criteria) this;
        }

        public Criteria andLkldlxIsNull() {
            addCriterion("LKLDLX is null");
            return (Criteria) this;
        }

        public Criteria andLkldlxIsNotNull() {
            addCriterion("LKLDLX is not null");
            return (Criteria) this;
        }

        public Criteria andLkldlxEqualTo(String value) {
            addCriterion("LKLDLX =", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxNotEqualTo(String value) {
            addCriterion("LKLDLX <>", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxGreaterThan(String value) {
            addCriterion("LKLDLX >", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxGreaterThanOrEqualTo(String value) {
            addCriterion("LKLDLX >=", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxLessThan(String value) {
            addCriterion("LKLDLX <", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxLessThanOrEqualTo(String value) {
            addCriterion("LKLDLX <=", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxLike(String value) {
            addCriterion("LKLDLX like", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxNotLike(String value) {
            addCriterion("LKLDLX not like", value, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxIn(List<String> values) {
            addCriterion("LKLDLX in", values, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxNotIn(List<String> values) {
            addCriterion("LKLDLX not in", values, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxBetween(String value1, String value2) {
            addCriterion("LKLDLX between", value1, value2, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andLkldlxNotBetween(String value1, String value2) {
            addCriterion("LKLDLX not between", value1, value2, "lkldlx");
            return (Criteria) this;
        }

        public Criteria andDlxxIsNull() {
            addCriterion("DLXX is null");
            return (Criteria) this;
        }

        public Criteria andDlxxIsNotNull() {
            addCriterion("DLXX is not null");
            return (Criteria) this;
        }

        public Criteria andDlxxEqualTo(String value) {
            addCriterion("DLXX =", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxNotEqualTo(String value) {
            addCriterion("DLXX <>", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxGreaterThan(String value) {
            addCriterion("DLXX >", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxGreaterThanOrEqualTo(String value) {
            addCriterion("DLXX >=", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxLessThan(String value) {
            addCriterion("DLXX <", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxLessThanOrEqualTo(String value) {
            addCriterion("DLXX <=", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxLike(String value) {
            addCriterion("DLXX like", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxNotLike(String value) {
            addCriterion("DLXX not like", value, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxIn(List<String> values) {
            addCriterion("DLXX in", values, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxNotIn(List<String> values) {
            addCriterion("DLXX not in", values, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxBetween(String value1, String value2) {
            addCriterion("DLXX between", value1, value2, "dlxx");
            return (Criteria) this;
        }

        public Criteria andDlxxNotBetween(String value1, String value2) {
            addCriterion("DLXX not between", value1, value2, "dlxx");
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

        public Criteria andKcr1IsNull() {
            addCriterion("KCR1 is null");
            return (Criteria) this;
        }

        public Criteria andKcr1IsNotNull() {
            addCriterion("KCR1 is not null");
            return (Criteria) this;
        }

        public Criteria andKcr1EqualTo(String value) {
            addCriterion("KCR1 =", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1NotEqualTo(String value) {
            addCriterion("KCR1 <>", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1GreaterThan(String value) {
            addCriterion("KCR1 >", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1GreaterThanOrEqualTo(String value) {
            addCriterion("KCR1 >=", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1LessThan(String value) {
            addCriterion("KCR1 <", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1LessThanOrEqualTo(String value) {
            addCriterion("KCR1 <=", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1Like(String value) {
            addCriterion("KCR1 like", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1NotLike(String value) {
            addCriterion("KCR1 not like", value, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1In(List<String> values) {
            addCriterion("KCR1 in", values, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1NotIn(List<String> values) {
            addCriterion("KCR1 not in", values, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1Between(String value1, String value2) {
            addCriterion("KCR1 between", value1, value2, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr1NotBetween(String value1, String value2) {
            addCriterion("KCR1 not between", value1, value2, "kcr1");
            return (Criteria) this;
        }

        public Criteria andKcr2IsNull() {
            addCriterion("KCR2 is null");
            return (Criteria) this;
        }

        public Criteria andKcr2IsNotNull() {
            addCriterion("KCR2 is not null");
            return (Criteria) this;
        }

        public Criteria andKcr2EqualTo(String value) {
            addCriterion("KCR2 =", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2NotEqualTo(String value) {
            addCriterion("KCR2 <>", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2GreaterThan(String value) {
            addCriterion("KCR2 >", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2GreaterThanOrEqualTo(String value) {
            addCriterion("KCR2 >=", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2LessThan(String value) {
            addCriterion("KCR2 <", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2LessThanOrEqualTo(String value) {
            addCriterion("KCR2 <=", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2Like(String value) {
            addCriterion("KCR2 like", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2NotLike(String value) {
            addCriterion("KCR2 not like", value, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2In(List<String> values) {
            addCriterion("KCR2 in", values, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2NotIn(List<String> values) {
            addCriterion("KCR2 not in", values, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2Between(String value1, String value2) {
            addCriterion("KCR2 between", value1, value2, "kcr2");
            return (Criteria) this;
        }

        public Criteria andKcr2NotBetween(String value1, String value2) {
            addCriterion("KCR2 not between", value1, value2, "kcr2");
            return (Criteria) this;
        }

        public Criteria andBar1IsNull() {
            addCriterion("BAR1 is null");
            return (Criteria) this;
        }

        public Criteria andBar1IsNotNull() {
            addCriterion("BAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andBar1EqualTo(String value) {
            addCriterion("BAR1 =", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1NotEqualTo(String value) {
            addCriterion("BAR1 <>", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1GreaterThan(String value) {
            addCriterion("BAR1 >", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1GreaterThanOrEqualTo(String value) {
            addCriterion("BAR1 >=", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1LessThan(String value) {
            addCriterion("BAR1 <", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1LessThanOrEqualTo(String value) {
            addCriterion("BAR1 <=", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1Like(String value) {
            addCriterion("BAR1 like", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1NotLike(String value) {
            addCriterion("BAR1 not like", value, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1In(List<String> values) {
            addCriterion("BAR1 in", values, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1NotIn(List<String> values) {
            addCriterion("BAR1 not in", values, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1Between(String value1, String value2) {
            addCriterion("BAR1 between", value1, value2, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar1NotBetween(String value1, String value2) {
            addCriterion("BAR1 not between", value1, value2, "bar1");
            return (Criteria) this;
        }

        public Criteria andBar2IsNull() {
            addCriterion("BAR2 is null");
            return (Criteria) this;
        }

        public Criteria andBar2IsNotNull() {
            addCriterion("BAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andBar2EqualTo(String value) {
            addCriterion("BAR2 =", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2NotEqualTo(String value) {
            addCriterion("BAR2 <>", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2GreaterThan(String value) {
            addCriterion("BAR2 >", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2GreaterThanOrEqualTo(String value) {
            addCriterion("BAR2 >=", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2LessThan(String value) {
            addCriterion("BAR2 <", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2LessThanOrEqualTo(String value) {
            addCriterion("BAR2 <=", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2Like(String value) {
            addCriterion("BAR2 like", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2NotLike(String value) {
            addCriterion("BAR2 not like", value, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2In(List<String> values) {
            addCriterion("BAR2 in", values, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2NotIn(List<String> values) {
            addCriterion("BAR2 not in", values, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2Between(String value1, String value2) {
            addCriterion("BAR2 between", value1, value2, "bar2");
            return (Criteria) this;
        }

        public Criteria andBar2NotBetween(String value1, String value2) {
            addCriterion("BAR2 not between", value1, value2, "bar2");
            return (Criteria) this;
        }

        public Criteria andSwrsIsNull() {
            addCriterion("SWRS is null");
            return (Criteria) this;
        }

        public Criteria andSwrsIsNotNull() {
            addCriterion("SWRS is not null");
            return (Criteria) this;
        }

        public Criteria andSwrsEqualTo(Short value) {
            addCriterion("SWRS =", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsNotEqualTo(Short value) {
            addCriterion("SWRS <>", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsGreaterThan(Short value) {
            addCriterion("SWRS >", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsGreaterThanOrEqualTo(Short value) {
            addCriterion("SWRS >=", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsLessThan(Short value) {
            addCriterion("SWRS <", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsLessThanOrEqualTo(Short value) {
            addCriterion("SWRS <=", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsIn(List<Short> values) {
            addCriterion("SWRS in", values, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsNotIn(List<Short> values) {
            addCriterion("SWRS not in", values, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsBetween(Short value1, Short value2) {
            addCriterion("SWRS between", value1, value2, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsNotBetween(Short value1, Short value2) {
            addCriterion("SWRS not between", value1, value2, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsqIsNull() {
            addCriterion("SWRSQ is null");
            return (Criteria) this;
        }

        public Criteria andSwrsqIsNotNull() {
            addCriterion("SWRSQ is not null");
            return (Criteria) this;
        }

        public Criteria andSwrsqEqualTo(Short value) {
            addCriterion("SWRSQ =", value, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqNotEqualTo(Short value) {
            addCriterion("SWRSQ <>", value, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqGreaterThan(Short value) {
            addCriterion("SWRSQ >", value, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqGreaterThanOrEqualTo(Short value) {
            addCriterion("SWRSQ >=", value, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqLessThan(Short value) {
            addCriterion("SWRSQ <", value, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqLessThanOrEqualTo(Short value) {
            addCriterion("SWRSQ <=", value, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqIn(List<Short> values) {
            addCriterion("SWRSQ in", values, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqNotIn(List<Short> values) {
            addCriterion("SWRSQ not in", values, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqBetween(Short value1, Short value2) {
            addCriterion("SWRSQ between", value1, value2, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrsqNotBetween(Short value1, Short value2) {
            addCriterion("SWRSQ not between", value1, value2, "swrsq");
            return (Criteria) this;
        }

        public Criteria andSwrs24IsNull() {
            addCriterion("SWRS24 is null");
            return (Criteria) this;
        }

        public Criteria andSwrs24IsNotNull() {
            addCriterion("SWRS24 is not null");
            return (Criteria) this;
        }

        public Criteria andSwrs24EqualTo(Short value) {
            addCriterion("SWRS24 =", value, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24NotEqualTo(Short value) {
            addCriterion("SWRS24 <>", value, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24GreaterThan(Short value) {
            addCriterion("SWRS24 >", value, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24GreaterThanOrEqualTo(Short value) {
            addCriterion("SWRS24 >=", value, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24LessThan(Short value) {
            addCriterion("SWRS24 <", value, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24LessThanOrEqualTo(Short value) {
            addCriterion("SWRS24 <=", value, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24In(List<Short> values) {
            addCriterion("SWRS24 in", values, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24NotIn(List<Short> values) {
            addCriterion("SWRS24 not in", values, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24Between(Short value1, Short value2) {
            addCriterion("SWRS24 between", value1, value2, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs24NotBetween(Short value1, Short value2) {
            addCriterion("SWRS24 not between", value1, value2, "swrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24IsNull() {
            addCriterion("SSRS24 is null");
            return (Criteria) this;
        }

        public Criteria andSsrs24IsNotNull() {
            addCriterion("SSRS24 is not null");
            return (Criteria) this;
        }

        public Criteria andSsrs24EqualTo(Short value) {
            addCriterion("SSRS24 =", value, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24NotEqualTo(Short value) {
            addCriterion("SSRS24 <>", value, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24GreaterThan(Short value) {
            addCriterion("SSRS24 >", value, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24GreaterThanOrEqualTo(Short value) {
            addCriterion("SSRS24 >=", value, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24LessThan(Short value) {
            addCriterion("SSRS24 <", value, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24LessThanOrEqualTo(Short value) {
            addCriterion("SSRS24 <=", value, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24In(List<Short> values) {
            addCriterion("SSRS24 in", values, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24NotIn(List<Short> values) {
            addCriterion("SSRS24 not in", values, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24Between(Short value1, Short value2) {
            addCriterion("SSRS24 between", value1, value2, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSsrs24NotBetween(Short value1, Short value2) {
            addCriterion("SSRS24 not between", value1, value2, "ssrs24");
            return (Criteria) this;
        }

        public Criteria andSwrs3IsNull() {
            addCriterion("SWRS3 is null");
            return (Criteria) this;
        }

        public Criteria andSwrs3IsNotNull() {
            addCriterion("SWRS3 is not null");
            return (Criteria) this;
        }

        public Criteria andSwrs3EqualTo(Short value) {
            addCriterion("SWRS3 =", value, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3NotEqualTo(Short value) {
            addCriterion("SWRS3 <>", value, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3GreaterThan(Short value) {
            addCriterion("SWRS3 >", value, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3GreaterThanOrEqualTo(Short value) {
            addCriterion("SWRS3 >=", value, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3LessThan(Short value) {
            addCriterion("SWRS3 <", value, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3LessThanOrEqualTo(Short value) {
            addCriterion("SWRS3 <=", value, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3In(List<Short> values) {
            addCriterion("SWRS3 in", values, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3NotIn(List<Short> values) {
            addCriterion("SWRS3 not in", values, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3Between(Short value1, Short value2) {
            addCriterion("SWRS3 between", value1, value2, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs3NotBetween(Short value1, Short value2) {
            addCriterion("SWRS3 not between", value1, value2, "swrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3IsNull() {
            addCriterion("SSRS3 is null");
            return (Criteria) this;
        }

        public Criteria andSsrs3IsNotNull() {
            addCriterion("SSRS3 is not null");
            return (Criteria) this;
        }

        public Criteria andSsrs3EqualTo(Short value) {
            addCriterion("SSRS3 =", value, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3NotEqualTo(Short value) {
            addCriterion("SSRS3 <>", value, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3GreaterThan(Short value) {
            addCriterion("SSRS3 >", value, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3GreaterThanOrEqualTo(Short value) {
            addCriterion("SSRS3 >=", value, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3LessThan(Short value) {
            addCriterion("SSRS3 <", value, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3LessThanOrEqualTo(Short value) {
            addCriterion("SSRS3 <=", value, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3In(List<Short> values) {
            addCriterion("SSRS3 in", values, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3NotIn(List<Short> values) {
            addCriterion("SSRS3 not in", values, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3Between(Short value1, Short value2) {
            addCriterion("SSRS3 between", value1, value2, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSsrs3NotBetween(Short value1, Short value2) {
            addCriterion("SSRS3 not between", value1, value2, "ssrs3");
            return (Criteria) this;
        }

        public Criteria andSwrs7IsNull() {
            addCriterion("SWRS7 is null");
            return (Criteria) this;
        }

        public Criteria andSwrs7IsNotNull() {
            addCriterion("SWRS7 is not null");
            return (Criteria) this;
        }

        public Criteria andSwrs7EqualTo(Short value) {
            addCriterion("SWRS7 =", value, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7NotEqualTo(Short value) {
            addCriterion("SWRS7 <>", value, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7GreaterThan(Short value) {
            addCriterion("SWRS7 >", value, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7GreaterThanOrEqualTo(Short value) {
            addCriterion("SWRS7 >=", value, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7LessThan(Short value) {
            addCriterion("SWRS7 <", value, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7LessThanOrEqualTo(Short value) {
            addCriterion("SWRS7 <=", value, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7In(List<Short> values) {
            addCriterion("SWRS7 in", values, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7NotIn(List<Short> values) {
            addCriterion("SWRS7 not in", values, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7Between(Short value1, Short value2) {
            addCriterion("SWRS7 between", value1, value2, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs7NotBetween(Short value1, Short value2) {
            addCriterion("SWRS7 not between", value1, value2, "swrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7IsNull() {
            addCriterion("SSRS7 is null");
            return (Criteria) this;
        }

        public Criteria andSsrs7IsNotNull() {
            addCriterion("SSRS7 is not null");
            return (Criteria) this;
        }

        public Criteria andSsrs7EqualTo(Short value) {
            addCriterion("SSRS7 =", value, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7NotEqualTo(Short value) {
            addCriterion("SSRS7 <>", value, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7GreaterThan(Short value) {
            addCriterion("SSRS7 >", value, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7GreaterThanOrEqualTo(Short value) {
            addCriterion("SSRS7 >=", value, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7LessThan(Short value) {
            addCriterion("SSRS7 <", value, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7LessThanOrEqualTo(Short value) {
            addCriterion("SSRS7 <=", value, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7In(List<Short> values) {
            addCriterion("SSRS7 in", values, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7NotIn(List<Short> values) {
            addCriterion("SSRS7 not in", values, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7Between(Short value1, Short value2) {
            addCriterion("SSRS7 between", value1, value2, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSsrs7NotBetween(Short value1, Short value2) {
            addCriterion("SSRS7 not between", value1, value2, "ssrs7");
            return (Criteria) this;
        }

        public Criteria andSwrs30IsNull() {
            addCriterion("SWRS30 is null");
            return (Criteria) this;
        }

        public Criteria andSwrs30IsNotNull() {
            addCriterion("SWRS30 is not null");
            return (Criteria) this;
        }

        public Criteria andSwrs30EqualTo(Short value) {
            addCriterion("SWRS30 =", value, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30NotEqualTo(Short value) {
            addCriterion("SWRS30 <>", value, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30GreaterThan(Short value) {
            addCriterion("SWRS30 >", value, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30GreaterThanOrEqualTo(Short value) {
            addCriterion("SWRS30 >=", value, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30LessThan(Short value) {
            addCriterion("SWRS30 <", value, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30LessThanOrEqualTo(Short value) {
            addCriterion("SWRS30 <=", value, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30In(List<Short> values) {
            addCriterion("SWRS30 in", values, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30NotIn(List<Short> values) {
            addCriterion("SWRS30 not in", values, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30Between(Short value1, Short value2) {
            addCriterion("SWRS30 between", value1, value2, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSwrs30NotBetween(Short value1, Short value2) {
            addCriterion("SWRS30 not between", value1, value2, "swrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30IsNull() {
            addCriterion("SSRS30 is null");
            return (Criteria) this;
        }

        public Criteria andSsrs30IsNotNull() {
            addCriterion("SSRS30 is not null");
            return (Criteria) this;
        }

        public Criteria andSsrs30EqualTo(Short value) {
            addCriterion("SSRS30 =", value, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30NotEqualTo(Short value) {
            addCriterion("SSRS30 <>", value, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30GreaterThan(Short value) {
            addCriterion("SSRS30 >", value, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30GreaterThanOrEqualTo(Short value) {
            addCriterion("SSRS30 >=", value, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30LessThan(Short value) {
            addCriterion("SSRS30 <", value, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30LessThanOrEqualTo(Short value) {
            addCriterion("SSRS30 <=", value, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30In(List<Short> values) {
            addCriterion("SSRS30 in", values, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30NotIn(List<Short> values) {
            addCriterion("SSRS30 not in", values, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30Between(Short value1, Short value2) {
            addCriterion("SSRS30 between", value1, value2, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSsrs30NotBetween(Short value1, Short value2) {
            addCriterion("SSRS30 not between", value1, value2, "ssrs30");
            return (Criteria) this;
        }

        public Criteria andSzrsIsNull() {
            addCriterion("SZRS is null");
            return (Criteria) this;
        }

        public Criteria andSzrsIsNotNull() {
            addCriterion("SZRS is not null");
            return (Criteria) this;
        }

        public Criteria andSzrsEqualTo(Short value) {
            addCriterion("SZRS =", value, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsNotEqualTo(Short value) {
            addCriterion("SZRS <>", value, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsGreaterThan(Short value) {
            addCriterion("SZRS >", value, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsGreaterThanOrEqualTo(Short value) {
            addCriterion("SZRS >=", value, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsLessThan(Short value) {
            addCriterion("SZRS <", value, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsLessThanOrEqualTo(Short value) {
            addCriterion("SZRS <=", value, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsIn(List<Short> values) {
            addCriterion("SZRS in", values, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsNotIn(List<Short> values) {
            addCriterion("SZRS not in", values, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsBetween(Short value1, Short value2) {
            addCriterion("SZRS between", value1, value2, "szrs");
            return (Criteria) this;
        }

        public Criteria andSzrsNotBetween(Short value1, Short value2) {
            addCriterion("SZRS not between", value1, value2, "szrs");
            return (Criteria) this;
        }

        public Criteria andZsrsIsNull() {
            addCriterion("ZSRS is null");
            return (Criteria) this;
        }

        public Criteria andZsrsIsNotNull() {
            addCriterion("ZSRS is not null");
            return (Criteria) this;
        }

        public Criteria andZsrsEqualTo(Short value) {
            addCriterion("ZSRS =", value, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsNotEqualTo(Short value) {
            addCriterion("ZSRS <>", value, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsGreaterThan(Short value) {
            addCriterion("ZSRS >", value, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsGreaterThanOrEqualTo(Short value) {
            addCriterion("ZSRS >=", value, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsLessThan(Short value) {
            addCriterion("ZSRS <", value, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsLessThanOrEqualTo(Short value) {
            addCriterion("ZSRS <=", value, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsIn(List<Short> values) {
            addCriterion("ZSRS in", values, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsNotIn(List<Short> values) {
            addCriterion("ZSRS not in", values, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsBetween(Short value1, Short value2) {
            addCriterion("ZSRS between", value1, value2, "zsrs");
            return (Criteria) this;
        }

        public Criteria andZsrsNotBetween(Short value1, Short value2) {
            addCriterion("ZSRS not between", value1, value2, "zsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsIsNull() {
            addCriterion("QSRS is null");
            return (Criteria) this;
        }

        public Criteria andQsrsIsNotNull() {
            addCriterion("QSRS is not null");
            return (Criteria) this;
        }

        public Criteria andQsrsEqualTo(Short value) {
            addCriterion("QSRS =", value, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsNotEqualTo(Short value) {
            addCriterion("QSRS <>", value, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsGreaterThan(Short value) {
            addCriterion("QSRS >", value, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsGreaterThanOrEqualTo(Short value) {
            addCriterion("QSRS >=", value, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsLessThan(Short value) {
            addCriterion("QSRS <", value, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsLessThanOrEqualTo(Short value) {
            addCriterion("QSRS <=", value, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsIn(List<Short> values) {
            addCriterion("QSRS in", values, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsNotIn(List<Short> values) {
            addCriterion("QSRS not in", values, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsBetween(Short value1, Short value2) {
            addCriterion("QSRS between", value1, value2, "qsrs");
            return (Criteria) this;
        }

        public Criteria andQsrsNotBetween(Short value1, Short value2) {
            addCriterion("QSRS not between", value1, value2, "qsrs");
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

        public Criteria andJdcslIsNull() {
            addCriterion("JDCSL is null");
            return (Criteria) this;
        }

        public Criteria andJdcslIsNotNull() {
            addCriterion("JDCSL is not null");
            return (Criteria) this;
        }

        public Criteria andJdcslEqualTo(Short value) {
            addCriterion("JDCSL =", value, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslNotEqualTo(Short value) {
            addCriterion("JDCSL <>", value, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslGreaterThan(Short value) {
            addCriterion("JDCSL >", value, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslGreaterThanOrEqualTo(Short value) {
            addCriterion("JDCSL >=", value, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslLessThan(Short value) {
            addCriterion("JDCSL <", value, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslLessThanOrEqualTo(Short value) {
            addCriterion("JDCSL <=", value, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslIn(List<Short> values) {
            addCriterion("JDCSL in", values, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslNotIn(List<Short> values) {
            addCriterion("JDCSL not in", values, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslBetween(Short value1, Short value2) {
            addCriterion("JDCSL between", value1, value2, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andJdcslNotBetween(Short value1, Short value2) {
            addCriterion("JDCSL not between", value1, value2, "jdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslIsNull() {
            addCriterion("FJDCSL is null");
            return (Criteria) this;
        }

        public Criteria andFjdcslIsNotNull() {
            addCriterion("FJDCSL is not null");
            return (Criteria) this;
        }

        public Criteria andFjdcslEqualTo(Short value) {
            addCriterion("FJDCSL =", value, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslNotEqualTo(Short value) {
            addCriterion("FJDCSL <>", value, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslGreaterThan(Short value) {
            addCriterion("FJDCSL >", value, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslGreaterThanOrEqualTo(Short value) {
            addCriterion("FJDCSL >=", value, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslLessThan(Short value) {
            addCriterion("FJDCSL <", value, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslLessThanOrEqualTo(Short value) {
            addCriterion("FJDCSL <=", value, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslIn(List<Short> values) {
            addCriterion("FJDCSL in", values, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslNotIn(List<Short> values) {
            addCriterion("FJDCSL not in", values, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslBetween(Short value1, Short value2) {
            addCriterion("FJDCSL between", value1, value2, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andFjdcslNotBetween(Short value1, Short value2) {
            addCriterion("FJDCSL not between", value1, value2, "fjdcsl");
            return (Criteria) this;
        }

        public Criteria andXrslIsNull() {
            addCriterion("XRSL is null");
            return (Criteria) this;
        }

        public Criteria andXrslIsNotNull() {
            addCriterion("XRSL is not null");
            return (Criteria) this;
        }

        public Criteria andXrslEqualTo(Short value) {
            addCriterion("XRSL =", value, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslNotEqualTo(Short value) {
            addCriterion("XRSL <>", value, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslGreaterThan(Short value) {
            addCriterion("XRSL >", value, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslGreaterThanOrEqualTo(Short value) {
            addCriterion("XRSL >=", value, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslLessThan(Short value) {
            addCriterion("XRSL <", value, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslLessThanOrEqualTo(Short value) {
            addCriterion("XRSL <=", value, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslIn(List<Short> values) {
            addCriterion("XRSL in", values, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslNotIn(List<Short> values) {
            addCriterion("XRSL not in", values, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslBetween(Short value1, Short value2) {
            addCriterion("XRSL between", value1, value2, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXrslNotBetween(Short value1, Short value2) {
            addCriterion("XRSL not between", value1, value2, "xrsl");
            return (Criteria) this;
        }

        public Criteria andXsglbmIsNull() {
            addCriterion("XSGLBM is null");
            return (Criteria) this;
        }

        public Criteria andXsglbmIsNotNull() {
            addCriterion("XSGLBM is not null");
            return (Criteria) this;
        }

        public Criteria andXsglbmEqualTo(String value) {
            addCriterion("XSGLBM =", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmNotEqualTo(String value) {
            addCriterion("XSGLBM <>", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmGreaterThan(String value) {
            addCriterion("XSGLBM >", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmGreaterThanOrEqualTo(String value) {
            addCriterion("XSGLBM >=", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmLessThan(String value) {
            addCriterion("XSGLBM <", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmLessThanOrEqualTo(String value) {
            addCriterion("XSGLBM <=", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmLike(String value) {
            addCriterion("XSGLBM like", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmNotLike(String value) {
            addCriterion("XSGLBM not like", value, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmIn(List<String> values) {
            addCriterion("XSGLBM in", values, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmNotIn(List<String> values) {
            addCriterion("XSGLBM not in", values, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmBetween(String value1, String value2) {
            addCriterion("XSGLBM between", value1, value2, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsglbmNotBetween(String value1, String value2) {
            addCriterion("XSGLBM not between", value1, value2, "xsglbm");
            return (Criteria) this;
        }

        public Criteria andXsbadwIsNull() {
            addCriterion("XSBADW is null");
            return (Criteria) this;
        }

        public Criteria andXsbadwIsNotNull() {
            addCriterion("XSBADW is not null");
            return (Criteria) this;
        }

        public Criteria andXsbadwEqualTo(String value) {
            addCriterion("XSBADW =", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwNotEqualTo(String value) {
            addCriterion("XSBADW <>", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwGreaterThan(String value) {
            addCriterion("XSBADW >", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwGreaterThanOrEqualTo(String value) {
            addCriterion("XSBADW >=", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwLessThan(String value) {
            addCriterion("XSBADW <", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwLessThanOrEqualTo(String value) {
            addCriterion("XSBADW <=", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwLike(String value) {
            addCriterion("XSBADW like", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwNotLike(String value) {
            addCriterion("XSBADW not like", value, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwIn(List<String> values) {
            addCriterion("XSBADW in", values, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwNotIn(List<String> values) {
            addCriterion("XSBADW not in", values, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwBetween(String value1, String value2) {
            addCriterion("XSBADW between", value1, value2, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbadwNotBetween(String value1, String value2) {
            addCriterion("XSBADW not between", value1, value2, "xsbadw");
            return (Criteria) this;
        }

        public Criteria andXsbarIsNull() {
            addCriterion("XSBAR is null");
            return (Criteria) this;
        }

        public Criteria andXsbarIsNotNull() {
            addCriterion("XSBAR is not null");
            return (Criteria) this;
        }

        public Criteria andXsbarEqualTo(String value) {
            addCriterion("XSBAR =", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarNotEqualTo(String value) {
            addCriterion("XSBAR <>", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarGreaterThan(String value) {
            addCriterion("XSBAR >", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarGreaterThanOrEqualTo(String value) {
            addCriterion("XSBAR >=", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarLessThan(String value) {
            addCriterion("XSBAR <", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarLessThanOrEqualTo(String value) {
            addCriterion("XSBAR <=", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarLike(String value) {
            addCriterion("XSBAR like", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarNotLike(String value) {
            addCriterion("XSBAR not like", value, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarIn(List<String> values) {
            addCriterion("XSBAR in", values, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarNotIn(List<String> values) {
            addCriterion("XSBAR not in", values, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarBetween(String value1, String value2) {
            addCriterion("XSBAR between", value1, value2, "xsbar");
            return (Criteria) this;
        }

        public Criteria andXsbarNotBetween(String value1, String value2) {
            addCriterion("XSBAR not between", value1, value2, "xsbar");
            return (Criteria) this;
        }

        public Criteria andTpzsIsNull() {
            addCriterion("TPZS is null");
            return (Criteria) this;
        }

        public Criteria andTpzsIsNotNull() {
            addCriterion("TPZS is not null");
            return (Criteria) this;
        }

        public Criteria andTpzsEqualTo(Short value) {
            addCriterion("TPZS =", value, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsNotEqualTo(Short value) {
            addCriterion("TPZS <>", value, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsGreaterThan(Short value) {
            addCriterion("TPZS >", value, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsGreaterThanOrEqualTo(Short value) {
            addCriterion("TPZS >=", value, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsLessThan(Short value) {
            addCriterion("TPZS <", value, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsLessThanOrEqualTo(Short value) {
            addCriterion("TPZS <=", value, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsIn(List<Short> values) {
            addCriterion("TPZS in", values, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsNotIn(List<Short> values) {
            addCriterion("TPZS not in", values, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsBetween(Short value1, Short value2) {
            addCriterion("TPZS between", value1, value2, "tpzs");
            return (Criteria) this;
        }

        public Criteria andTpzsNotBetween(Short value1, Short value2) {
            addCriterion("TPZS not between", value1, value2, "tpzs");
            return (Criteria) this;
        }

        public Criteria andXctzsIsNull() {
            addCriterion("XCTZS is null");
            return (Criteria) this;
        }

        public Criteria andXctzsIsNotNull() {
            addCriterion("XCTZS is not null");
            return (Criteria) this;
        }

        public Criteria andXctzsEqualTo(Short value) {
            addCriterion("XCTZS =", value, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsNotEqualTo(Short value) {
            addCriterion("XCTZS <>", value, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsGreaterThan(Short value) {
            addCriterion("XCTZS >", value, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsGreaterThanOrEqualTo(Short value) {
            addCriterion("XCTZS >=", value, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsLessThan(Short value) {
            addCriterion("XCTZS <", value, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsLessThanOrEqualTo(Short value) {
            addCriterion("XCTZS <=", value, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsIn(List<Short> values) {
            addCriterion("XCTZS in", values, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsNotIn(List<Short> values) {
            addCriterion("XCTZS not in", values, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsBetween(Short value1, Short value2) {
            addCriterion("XCTZS between", value1, value2, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXctzsNotBetween(Short value1, Short value2) {
            addCriterion("XCTZS not between", value1, value2, "xctzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsIsNull() {
            addCriterion("XCZPZS is null");
            return (Criteria) this;
        }

        public Criteria andXczpzsIsNotNull() {
            addCriterion("XCZPZS is not null");
            return (Criteria) this;
        }

        public Criteria andXczpzsEqualTo(Short value) {
            addCriterion("XCZPZS =", value, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsNotEqualTo(Short value) {
            addCriterion("XCZPZS <>", value, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsGreaterThan(Short value) {
            addCriterion("XCZPZS >", value, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsGreaterThanOrEqualTo(Short value) {
            addCriterion("XCZPZS >=", value, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsLessThan(Short value) {
            addCriterion("XCZPZS <", value, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsLessThanOrEqualTo(Short value) {
            addCriterion("XCZPZS <=", value, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsIn(List<Short> values) {
            addCriterion("XCZPZS in", values, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsNotIn(List<Short> values) {
            addCriterion("XCZPZS not in", values, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsBetween(Short value1, Short value2) {
            addCriterion("XCZPZS between", value1, value2, "xczpzs");
            return (Criteria) this;
        }

        public Criteria andXczpzsNotBetween(Short value1, Short value2) {
            addCriterion("XCZPZS not between", value1, value2, "xczpzs");
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

        public Criteria andSglxIsNull() {
            addCriterion("SGLX is null");
            return (Criteria) this;
        }

        public Criteria andSglxIsNotNull() {
            addCriterion("SGLX is not null");
            return (Criteria) this;
        }

        public Criteria andSglxEqualTo(String value) {
            addCriterion("SGLX =", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxNotEqualTo(String value) {
            addCriterion("SGLX <>", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxGreaterThan(String value) {
            addCriterion("SGLX >", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxGreaterThanOrEqualTo(String value) {
            addCriterion("SGLX >=", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxLessThan(String value) {
            addCriterion("SGLX <", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxLessThanOrEqualTo(String value) {
            addCriterion("SGLX <=", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxLike(String value) {
            addCriterion("SGLX like", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxNotLike(String value) {
            addCriterion("SGLX not like", value, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxIn(List<String> values) {
            addCriterion("SGLX in", values, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxNotIn(List<String> values) {
            addCriterion("SGLX not in", values, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxBetween(String value1, String value2) {
            addCriterion("SGLX between", value1, value2, "sglx");
            return (Criteria) this;
        }

        public Criteria andSglxNotBetween(String value1, String value2) {
            addCriterion("SGLX not between", value1, value2, "sglx");
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

        public Criteria andCcyyflIsNull() {
            addCriterion("CCYYFL is null");
            return (Criteria) this;
        }

        public Criteria andCcyyflIsNotNull() {
            addCriterion("CCYYFL is not null");
            return (Criteria) this;
        }

        public Criteria andCcyyflEqualTo(String value) {
            addCriterion("CCYYFL =", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflNotEqualTo(String value) {
            addCriterion("CCYYFL <>", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflGreaterThan(String value) {
            addCriterion("CCYYFL >", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflGreaterThanOrEqualTo(String value) {
            addCriterion("CCYYFL >=", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflLessThan(String value) {
            addCriterion("CCYYFL <", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflLessThanOrEqualTo(String value) {
            addCriterion("CCYYFL <=", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflLike(String value) {
            addCriterion("CCYYFL like", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflNotLike(String value) {
            addCriterion("CCYYFL not like", value, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflIn(List<String> values) {
            addCriterion("CCYYFL in", values, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflNotIn(List<String> values) {
            addCriterion("CCYYFL not in", values, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflBetween(String value1, String value2) {
            addCriterion("CCYYFL between", value1, value2, "ccyyfl");
            return (Criteria) this;
        }

        public Criteria andCcyyflNotBetween(String value1, String value2) {
            addCriterion("CCYYFL not between", value1, value2, "ccyyfl");
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

        public Criteria andSgccyyIsNull() {
            addCriterion("SGCCYY is null");
            return (Criteria) this;
        }

        public Criteria andSgccyyIsNotNull() {
            addCriterion("SGCCYY is not null");
            return (Criteria) this;
        }

        public Criteria andSgccyyEqualTo(String value) {
            addCriterion("SGCCYY =", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyNotEqualTo(String value) {
            addCriterion("SGCCYY <>", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyGreaterThan(String value) {
            addCriterion("SGCCYY >", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyGreaterThanOrEqualTo(String value) {
            addCriterion("SGCCYY >=", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyLessThan(String value) {
            addCriterion("SGCCYY <", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyLessThanOrEqualTo(String value) {
            addCriterion("SGCCYY <=", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyLike(String value) {
            addCriterion("SGCCYY like", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyNotLike(String value) {
            addCriterion("SGCCYY not like", value, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyIn(List<String> values) {
            addCriterion("SGCCYY in", values, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyNotIn(List<String> values) {
            addCriterion("SGCCYY not in", values, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyBetween(String value1, String value2) {
            addCriterion("SGCCYY between", value1, value2, "sgccyy");
            return (Criteria) this;
        }

        public Criteria andSgccyyNotBetween(String value1, String value2) {
            addCriterion("SGCCYY not between", value1, value2, "sgccyy");
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

        public Criteria andJyaqIsNull() {
            addCriterion("JYAQ is null");
            return (Criteria) this;
        }

        public Criteria andJyaqIsNotNull() {
            addCriterion("JYAQ is not null");
            return (Criteria) this;
        }

        public Criteria andJyaqEqualTo(String value) {
            addCriterion("JYAQ =", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqNotEqualTo(String value) {
            addCriterion("JYAQ <>", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqGreaterThan(String value) {
            addCriterion("JYAQ >", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqGreaterThanOrEqualTo(String value) {
            addCriterion("JYAQ >=", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqLessThan(String value) {
            addCriterion("JYAQ <", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqLessThanOrEqualTo(String value) {
            addCriterion("JYAQ <=", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqLike(String value) {
            addCriterion("JYAQ like", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqNotLike(String value) {
            addCriterion("JYAQ not like", value, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqIn(List<String> values) {
            addCriterion("JYAQ in", values, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqNotIn(List<String> values) {
            addCriterion("JYAQ not in", values, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqBetween(String value1, String value2) {
            addCriterion("JYAQ between", value1, value2, "jyaq");
            return (Criteria) this;
        }

        public Criteria andJyaqNotBetween(String value1, String value2) {
            addCriterion("JYAQ not between", value1, value2, "jyaq");
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

        public Criteria andNjdIsNull() {
            addCriterion("NJD is null");
            return (Criteria) this;
        }

        public Criteria andNjdIsNotNull() {
            addCriterion("NJD is not null");
            return (Criteria) this;
        }

        public Criteria andNjdEqualTo(String value) {
            addCriterion("NJD =", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdNotEqualTo(String value) {
            addCriterion("NJD <>", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdGreaterThan(String value) {
            addCriterion("NJD >", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdGreaterThanOrEqualTo(String value) {
            addCriterion("NJD >=", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdLessThan(String value) {
            addCriterion("NJD <", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdLessThanOrEqualTo(String value) {
            addCriterion("NJD <=", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdLike(String value) {
            addCriterion("NJD like", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdNotLike(String value) {
            addCriterion("NJD not like", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdIn(List<String> values) {
            addCriterion("NJD in", values, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdNotIn(List<String> values) {
            addCriterion("NJD not in", values, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdBetween(String value1, String value2) {
            addCriterion("NJD between", value1, value2, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdNotBetween(String value1, String value2) {
            addCriterion("NJD not between", value1, value2, "njd");
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

        public Criteria andSftyIsNull() {
            addCriterion("SFTY is null");
            return (Criteria) this;
        }

        public Criteria andSftyIsNotNull() {
            addCriterion("SFTY is not null");
            return (Criteria) this;
        }

        public Criteria andSftyEqualTo(String value) {
            addCriterion("SFTY =", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyNotEqualTo(String value) {
            addCriterion("SFTY <>", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyGreaterThan(String value) {
            addCriterion("SFTY >", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyGreaterThanOrEqualTo(String value) {
            addCriterion("SFTY >=", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyLessThan(String value) {
            addCriterion("SFTY <", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyLessThanOrEqualTo(String value) {
            addCriterion("SFTY <=", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyLike(String value) {
            addCriterion("SFTY like", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyNotLike(String value) {
            addCriterion("SFTY not like", value, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyIn(List<String> values) {
            addCriterion("SFTY in", values, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyNotIn(List<String> values) {
            addCriterion("SFTY not in", values, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyBetween(String value1, String value2) {
            addCriterion("SFTY between", value1, value2, "sfty");
            return (Criteria) this;
        }

        public Criteria andSftyNotBetween(String value1, String value2) {
            addCriterion("SFTY not between", value1, value2, "sfty");
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

        public Criteria andTysgzpIsNull() {
            addCriterion("TYSGZP is null");
            return (Criteria) this;
        }

        public Criteria andTysgzpIsNotNull() {
            addCriterion("TYSGZP is not null");
            return (Criteria) this;
        }

        public Criteria andTysgzpEqualTo(String value) {
            addCriterion("TYSGZP =", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpNotEqualTo(String value) {
            addCriterion("TYSGZP <>", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpGreaterThan(String value) {
            addCriterion("TYSGZP >", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpGreaterThanOrEqualTo(String value) {
            addCriterion("TYSGZP >=", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpLessThan(String value) {
            addCriterion("TYSGZP <", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpLessThanOrEqualTo(String value) {
            addCriterion("TYSGZP <=", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpLike(String value) {
            addCriterion("TYSGZP like", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpNotLike(String value) {
            addCriterion("TYSGZP not like", value, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpIn(List<String> values) {
            addCriterion("TYSGZP in", values, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpNotIn(List<String> values) {
            addCriterion("TYSGZP not in", values, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpBetween(String value1, String value2) {
            addCriterion("TYSGZP between", value1, value2, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTysgzpNotBetween(String value1, String value2) {
            addCriterion("TYSGZP not between", value1, value2, "tysgzp");
            return (Criteria) this;
        }

        public Criteria andTyzpsjIsNull() {
            addCriterion("TYZPSJ is null");
            return (Criteria) this;
        }

        public Criteria andTyzpsjIsNotNull() {
            addCriterion("TYZPSJ is not null");
            return (Criteria) this;
        }

        public Criteria andTyzpsjEqualTo(Date value) {
            addCriterion("TYZPSJ =", value, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjNotEqualTo(Date value) {
            addCriterion("TYZPSJ <>", value, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjGreaterThan(Date value) {
            addCriterion("TYZPSJ >", value, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjGreaterThanOrEqualTo(Date value) {
            addCriterion("TYZPSJ >=", value, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjLessThan(Date value) {
            addCriterion("TYZPSJ <", value, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjLessThanOrEqualTo(Date value) {
            addCriterion("TYZPSJ <=", value, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjIn(List<Date> values) {
            addCriterion("TYZPSJ in", values, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjNotIn(List<Date> values) {
            addCriterion("TYZPSJ not in", values, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjBetween(Date value1, Date value2) {
            addCriterion("TYZPSJ between", value1, value2, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andTyzpsjNotBetween(Date value1, Date value2) {
            addCriterion("TYZPSJ not between", value1, value2, "tyzpsj");
            return (Criteria) this;
        }

        public Criteria andDxIsNull() {
            addCriterion("DX is null");
            return (Criteria) this;
        }

        public Criteria andDxIsNotNull() {
            addCriterion("DX is not null");
            return (Criteria) this;
        }

        public Criteria andDxEqualTo(String value) {
            addCriterion("DX =", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxNotEqualTo(String value) {
            addCriterion("DX <>", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxGreaterThan(String value) {
            addCriterion("DX >", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxGreaterThanOrEqualTo(String value) {
            addCriterion("DX >=", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxLessThan(String value) {
            addCriterion("DX <", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxLessThanOrEqualTo(String value) {
            addCriterion("DX <=", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxLike(String value) {
            addCriterion("DX like", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxNotLike(String value) {
            addCriterion("DX not like", value, "dx");
            return (Criteria) this;
        }

        public Criteria andDxIn(List<String> values) {
            addCriterion("DX in", values, "dx");
            return (Criteria) this;
        }

        public Criteria andDxNotIn(List<String> values) {
            addCriterion("DX not in", values, "dx");
            return (Criteria) this;
        }

        public Criteria andDxBetween(String value1, String value2) {
            addCriterion("DX between", value1, value2, "dx");
            return (Criteria) this;
        }

        public Criteria andDxNotBetween(String value1, String value2) {
            addCriterion("DX not between", value1, value2, "dx");
            return (Criteria) this;
        }

        public Criteria andZmtjIsNull() {
            addCriterion("ZMTJ is null");
            return (Criteria) this;
        }

        public Criteria andZmtjIsNotNull() {
            addCriterion("ZMTJ is not null");
            return (Criteria) this;
        }

        public Criteria andZmtjEqualTo(String value) {
            addCriterion("ZMTJ =", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjNotEqualTo(String value) {
            addCriterion("ZMTJ <>", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjGreaterThan(String value) {
            addCriterion("ZMTJ >", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjGreaterThanOrEqualTo(String value) {
            addCriterion("ZMTJ >=", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjLessThan(String value) {
            addCriterion("ZMTJ <", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjLessThanOrEqualTo(String value) {
            addCriterion("ZMTJ <=", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjLike(String value) {
            addCriterion("ZMTJ like", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjNotLike(String value) {
            addCriterion("ZMTJ not like", value, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjIn(List<String> values) {
            addCriterion("ZMTJ in", values, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjNotIn(List<String> values) {
            addCriterion("ZMTJ not in", values, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjBetween(String value1, String value2) {
            addCriterion("ZMTJ between", value1, value2, "zmtj");
            return (Criteria) this;
        }

        public Criteria andZmtjNotBetween(String value1, String value2) {
            addCriterion("ZMTJ not between", value1, value2, "zmtj");
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

        public Criteria andTjr2IsNull() {
            addCriterion("TJR2 is null");
            return (Criteria) this;
        }

        public Criteria andTjr2IsNotNull() {
            addCriterion("TJR2 is not null");
            return (Criteria) this;
        }

        public Criteria andTjr2EqualTo(String value) {
            addCriterion("TJR2 =", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2NotEqualTo(String value) {
            addCriterion("TJR2 <>", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2GreaterThan(String value) {
            addCriterion("TJR2 >", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2GreaterThanOrEqualTo(String value) {
            addCriterion("TJR2 >=", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2LessThan(String value) {
            addCriterion("TJR2 <", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2LessThanOrEqualTo(String value) {
            addCriterion("TJR2 <=", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2Like(String value) {
            addCriterion("TJR2 like", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2NotLike(String value) {
            addCriterion("TJR2 not like", value, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2In(List<String> values) {
            addCriterion("TJR2 in", values, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2NotIn(List<String> values) {
            addCriterion("TJR2 not in", values, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2Between(String value1, String value2) {
            addCriterion("TJR2 between", value1, value2, "tjr2");
            return (Criteria) this;
        }

        public Criteria andTjr2NotBetween(String value1, String value2) {
            addCriterion("TJR2 not between", value1, value2, "tjr2");
            return (Criteria) this;
        }

        public Criteria andYzwxpIsNull() {
            addCriterion("YZWXP is null");
            return (Criteria) this;
        }

        public Criteria andYzwxpIsNotNull() {
            addCriterion("YZWXP is not null");
            return (Criteria) this;
        }

        public Criteria andYzwxpEqualTo(String value) {
            addCriterion("YZWXP =", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpNotEqualTo(String value) {
            addCriterion("YZWXP <>", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpGreaterThan(String value) {
            addCriterion("YZWXP >", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpGreaterThanOrEqualTo(String value) {
            addCriterion("YZWXP >=", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpLessThan(String value) {
            addCriterion("YZWXP <", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpLessThanOrEqualTo(String value) {
            addCriterion("YZWXP <=", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpLike(String value) {
            addCriterion("YZWXP like", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpNotLike(String value) {
            addCriterion("YZWXP not like", value, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpIn(List<String> values) {
            addCriterion("YZWXP in", values, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpNotIn(List<String> values) {
            addCriterion("YZWXP not in", values, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpBetween(String value1, String value2) {
            addCriterion("YZWXP between", value1, value2, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxpNotBetween(String value1, String value2) {
            addCriterion("YZWXP not between", value1, value2, "yzwxp");
            return (Criteria) this;
        }

        public Criteria andYzwxphgIsNull() {
            addCriterion("YZWXPHG is null");
            return (Criteria) this;
        }

        public Criteria andYzwxphgIsNotNull() {
            addCriterion("YZWXPHG is not null");
            return (Criteria) this;
        }

        public Criteria andYzwxphgEqualTo(String value) {
            addCriterion("YZWXPHG =", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgNotEqualTo(String value) {
            addCriterion("YZWXPHG <>", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgGreaterThan(String value) {
            addCriterion("YZWXPHG >", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgGreaterThanOrEqualTo(String value) {
            addCriterion("YZWXPHG >=", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgLessThan(String value) {
            addCriterion("YZWXPHG <", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgLessThanOrEqualTo(String value) {
            addCriterion("YZWXPHG <=", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgLike(String value) {
            addCriterion("YZWXPHG like", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgNotLike(String value) {
            addCriterion("YZWXPHG not like", value, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgIn(List<String> values) {
            addCriterion("YZWXPHG in", values, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgNotIn(List<String> values) {
            addCriterion("YZWXPHG not in", values, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgBetween(String value1, String value2) {
            addCriterion("YZWXPHG between", value1, value2, "yzwxphg");
            return (Criteria) this;
        }

        public Criteria andYzwxphgNotBetween(String value1, String value2) {
            addCriterion("YZWXPHG not between", value1, value2, "yzwxphg");
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

        public Criteria andTjsjIsNull() {
            addCriterion("TJSJ is null");
            return (Criteria) this;
        }

        public Criteria andTjsjIsNotNull() {
            addCriterion("TJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andTjsjEqualTo(Date value) {
            addCriterion("TJSJ =", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotEqualTo(Date value) {
            addCriterion("TJSJ <>", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjGreaterThan(Date value) {
            addCriterion("TJSJ >", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("TJSJ >=", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjLessThan(Date value) {
            addCriterion("TJSJ <", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjLessThanOrEqualTo(Date value) {
            addCriterion("TJSJ <=", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjIn(List<Date> values) {
            addCriterion("TJSJ in", values, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotIn(List<Date> values) {
            addCriterion("TJSJ not in", values, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjBetween(Date value1, Date value2) {
            addCriterion("TJSJ between", value1, value2, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotBetween(Date value1, Date value2) {
            addCriterion("TJSJ not between", value1, value2, "tjsj");
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

        public Criteria andJnhIsNull() {
            addCriterion("JNH is null");
            return (Criteria) this;
        }

        public Criteria andJnhIsNotNull() {
            addCriterion("JNH is not null");
            return (Criteria) this;
        }

        public Criteria andJnhEqualTo(Short value) {
            addCriterion("JNH =", value, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhNotEqualTo(Short value) {
            addCriterion("JNH <>", value, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhGreaterThan(Short value) {
            addCriterion("JNH >", value, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhGreaterThanOrEqualTo(Short value) {
            addCriterion("JNH >=", value, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhLessThan(Short value) {
            addCriterion("JNH <", value, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhLessThanOrEqualTo(Short value) {
            addCriterion("JNH <=", value, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhIn(List<Short> values) {
            addCriterion("JNH in", values, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhNotIn(List<Short> values) {
            addCriterion("JNH not in", values, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhBetween(Short value1, Short value2) {
            addCriterion("JNH between", value1, value2, "jnh");
            return (Criteria) this;
        }

        public Criteria andJnhNotBetween(Short value1, Short value2) {
            addCriterion("JNH not between", value1, value2, "jnh");
            return (Criteria) this;
        }

        public Criteria andSxxzIsNull() {
            addCriterion("SXXZ is null");
            return (Criteria) this;
        }

        public Criteria andSxxzIsNotNull() {
            addCriterion("SXXZ is not null");
            return (Criteria) this;
        }

        public Criteria andSxxzEqualTo(String value) {
            addCriterion("SXXZ =", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzNotEqualTo(String value) {
            addCriterion("SXXZ <>", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzGreaterThan(String value) {
            addCriterion("SXXZ >", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzGreaterThanOrEqualTo(String value) {
            addCriterion("SXXZ >=", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzLessThan(String value) {
            addCriterion("SXXZ <", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzLessThanOrEqualTo(String value) {
            addCriterion("SXXZ <=", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzLike(String value) {
            addCriterion("SXXZ like", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzNotLike(String value) {
            addCriterion("SXXZ not like", value, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzIn(List<String> values) {
            addCriterion("SXXZ in", values, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzNotIn(List<String> values) {
            addCriterion("SXXZ not in", values, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzBetween(String value1, String value2) {
            addCriterion("SXXZ between", value1, value2, "sxxz");
            return (Criteria) this;
        }

        public Criteria andSxxzNotBetween(String value1, String value2) {
            addCriterion("SXXZ not between", value1, value2, "sxxz");
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

        public Criteria andYlzd1IsNull() {
            addCriterion("YLZD1 is null");
            return (Criteria) this;
        }

        public Criteria andYlzd1IsNotNull() {
            addCriterion("YLZD1 is not null");
            return (Criteria) this;
        }

        public Criteria andYlzd1EqualTo(String value) {
            addCriterion("YLZD1 =", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1NotEqualTo(String value) {
            addCriterion("YLZD1 <>", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1GreaterThan(String value) {
            addCriterion("YLZD1 >", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1GreaterThanOrEqualTo(String value) {
            addCriterion("YLZD1 >=", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1LessThan(String value) {
            addCriterion("YLZD1 <", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1LessThanOrEqualTo(String value) {
            addCriterion("YLZD1 <=", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1Like(String value) {
            addCriterion("YLZD1 like", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1NotLike(String value) {
            addCriterion("YLZD1 not like", value, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1In(List<String> values) {
            addCriterion("YLZD1 in", values, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1NotIn(List<String> values) {
            addCriterion("YLZD1 not in", values, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1Between(String value1, String value2) {
            addCriterion("YLZD1 between", value1, value2, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd1NotBetween(String value1, String value2) {
            addCriterion("YLZD1 not between", value1, value2, "ylzd1");
            return (Criteria) this;
        }

        public Criteria andYlzd2IsNull() {
            addCriterion("YLZD2 is null");
            return (Criteria) this;
        }

        public Criteria andYlzd2IsNotNull() {
            addCriterion("YLZD2 is not null");
            return (Criteria) this;
        }

        public Criteria andYlzd2EqualTo(String value) {
            addCriterion("YLZD2 =", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2NotEqualTo(String value) {
            addCriterion("YLZD2 <>", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2GreaterThan(String value) {
            addCriterion("YLZD2 >", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2GreaterThanOrEqualTo(String value) {
            addCriterion("YLZD2 >=", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2LessThan(String value) {
            addCriterion("YLZD2 <", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2LessThanOrEqualTo(String value) {
            addCriterion("YLZD2 <=", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2Like(String value) {
            addCriterion("YLZD2 like", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2NotLike(String value) {
            addCriterion("YLZD2 not like", value, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2In(List<String> values) {
            addCriterion("YLZD2 in", values, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2NotIn(List<String> values) {
            addCriterion("YLZD2 not in", values, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2Between(String value1, String value2) {
            addCriterion("YLZD2 between", value1, value2, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd2NotBetween(String value1, String value2) {
            addCriterion("YLZD2 not between", value1, value2, "ylzd2");
            return (Criteria) this;
        }

        public Criteria andYlzd3IsNull() {
            addCriterion("YLZD3 is null");
            return (Criteria) this;
        }

        public Criteria andYlzd3IsNotNull() {
            addCriterion("YLZD3 is not null");
            return (Criteria) this;
        }

        public Criteria andYlzd3EqualTo(String value) {
            addCriterion("YLZD3 =", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3NotEqualTo(String value) {
            addCriterion("YLZD3 <>", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3GreaterThan(String value) {
            addCriterion("YLZD3 >", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3GreaterThanOrEqualTo(String value) {
            addCriterion("YLZD3 >=", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3LessThan(String value) {
            addCriterion("YLZD3 <", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3LessThanOrEqualTo(String value) {
            addCriterion("YLZD3 <=", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3Like(String value) {
            addCriterion("YLZD3 like", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3NotLike(String value) {
            addCriterion("YLZD3 not like", value, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3In(List<String> values) {
            addCriterion("YLZD3 in", values, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3NotIn(List<String> values) {
            addCriterion("YLZD3 not in", values, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3Between(String value1, String value2) {
            addCriterion("YLZD3 between", value1, value2, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd3NotBetween(String value1, String value2) {
            addCriterion("YLZD3 not between", value1, value2, "ylzd3");
            return (Criteria) this;
        }

        public Criteria andYlzd4IsNull() {
            addCriterion("YLZD4 is null");
            return (Criteria) this;
        }

        public Criteria andYlzd4IsNotNull() {
            addCriterion("YLZD4 is not null");
            return (Criteria) this;
        }

        public Criteria andYlzd4EqualTo(String value) {
            addCriterion("YLZD4 =", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4NotEqualTo(String value) {
            addCriterion("YLZD4 <>", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4GreaterThan(String value) {
            addCriterion("YLZD4 >", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4GreaterThanOrEqualTo(String value) {
            addCriterion("YLZD4 >=", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4LessThan(String value) {
            addCriterion("YLZD4 <", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4LessThanOrEqualTo(String value) {
            addCriterion("YLZD4 <=", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4Like(String value) {
            addCriterion("YLZD4 like", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4NotLike(String value) {
            addCriterion("YLZD4 not like", value, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4In(List<String> values) {
            addCriterion("YLZD4 in", values, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4NotIn(List<String> values) {
            addCriterion("YLZD4 not in", values, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4Between(String value1, String value2) {
            addCriterion("YLZD4 between", value1, value2, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd4NotBetween(String value1, String value2) {
            addCriterion("YLZD4 not between", value1, value2, "ylzd4");
            return (Criteria) this;
        }

        public Criteria andYlzd5IsNull() {
            addCriterion("YLZD5 is null");
            return (Criteria) this;
        }

        public Criteria andYlzd5IsNotNull() {
            addCriterion("YLZD5 is not null");
            return (Criteria) this;
        }

        public Criteria andYlzd5EqualTo(String value) {
            addCriterion("YLZD5 =", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5NotEqualTo(String value) {
            addCriterion("YLZD5 <>", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5GreaterThan(String value) {
            addCriterion("YLZD5 >", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5GreaterThanOrEqualTo(String value) {
            addCriterion("YLZD5 >=", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5LessThan(String value) {
            addCriterion("YLZD5 <", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5LessThanOrEqualTo(String value) {
            addCriterion("YLZD5 <=", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5Like(String value) {
            addCriterion("YLZD5 like", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5NotLike(String value) {
            addCriterion("YLZD5 not like", value, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5In(List<String> values) {
            addCriterion("YLZD5 in", values, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5NotIn(List<String> values) {
            addCriterion("YLZD5 not in", values, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5Between(String value1, String value2) {
            addCriterion("YLZD5 between", value1, value2, "ylzd5");
            return (Criteria) this;
        }

        public Criteria andYlzd5NotBetween(String value1, String value2) {
            addCriterion("YLZD5 not between", value1, value2, "ylzd5");
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

        public Criteria andTdyl1IsNull() {
            addCriterion("TDYL1 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl1IsNotNull() {
            addCriterion("TDYL1 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl1EqualTo(String value) {
            addCriterion("TDYL1 =", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1NotEqualTo(String value) {
            addCriterion("TDYL1 <>", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1GreaterThan(String value) {
            addCriterion("TDYL1 >", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL1 >=", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1LessThan(String value) {
            addCriterion("TDYL1 <", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1LessThanOrEqualTo(String value) {
            addCriterion("TDYL1 <=", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1Like(String value) {
            addCriterion("TDYL1 like", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1NotLike(String value) {
            addCriterion("TDYL1 not like", value, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1In(List<String> values) {
            addCriterion("TDYL1 in", values, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1NotIn(List<String> values) {
            addCriterion("TDYL1 not in", values, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1Between(String value1, String value2) {
            addCriterion("TDYL1 between", value1, value2, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl1NotBetween(String value1, String value2) {
            addCriterion("TDYL1 not between", value1, value2, "tdyl1");
            return (Criteria) this;
        }

        public Criteria andTdyl2IsNull() {
            addCriterion("TDYL2 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl2IsNotNull() {
            addCriterion("TDYL2 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl2EqualTo(String value) {
            addCriterion("TDYL2 =", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2NotEqualTo(String value) {
            addCriterion("TDYL2 <>", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2GreaterThan(String value) {
            addCriterion("TDYL2 >", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL2 >=", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2LessThan(String value) {
            addCriterion("TDYL2 <", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2LessThanOrEqualTo(String value) {
            addCriterion("TDYL2 <=", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2Like(String value) {
            addCriterion("TDYL2 like", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2NotLike(String value) {
            addCriterion("TDYL2 not like", value, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2In(List<String> values) {
            addCriterion("TDYL2 in", values, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2NotIn(List<String> values) {
            addCriterion("TDYL2 not in", values, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2Between(String value1, String value2) {
            addCriterion("TDYL2 between", value1, value2, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl2NotBetween(String value1, String value2) {
            addCriterion("TDYL2 not between", value1, value2, "tdyl2");
            return (Criteria) this;
        }

        public Criteria andTdyl3IsNull() {
            addCriterion("TDYL3 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl3IsNotNull() {
            addCriterion("TDYL3 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl3EqualTo(String value) {
            addCriterion("TDYL3 =", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3NotEqualTo(String value) {
            addCriterion("TDYL3 <>", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3GreaterThan(String value) {
            addCriterion("TDYL3 >", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL3 >=", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3LessThan(String value) {
            addCriterion("TDYL3 <", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3LessThanOrEqualTo(String value) {
            addCriterion("TDYL3 <=", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3Like(String value) {
            addCriterion("TDYL3 like", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3NotLike(String value) {
            addCriterion("TDYL3 not like", value, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3In(List<String> values) {
            addCriterion("TDYL3 in", values, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3NotIn(List<String> values) {
            addCriterion("TDYL3 not in", values, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3Between(String value1, String value2) {
            addCriterion("TDYL3 between", value1, value2, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl3NotBetween(String value1, String value2) {
            addCriterion("TDYL3 not between", value1, value2, "tdyl3");
            return (Criteria) this;
        }

        public Criteria andTdyl4IsNull() {
            addCriterion("TDYL4 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl4IsNotNull() {
            addCriterion("TDYL4 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl4EqualTo(String value) {
            addCriterion("TDYL4 =", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4NotEqualTo(String value) {
            addCriterion("TDYL4 <>", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4GreaterThan(String value) {
            addCriterion("TDYL4 >", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL4 >=", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4LessThan(String value) {
            addCriterion("TDYL4 <", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4LessThanOrEqualTo(String value) {
            addCriterion("TDYL4 <=", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4Like(String value) {
            addCriterion("TDYL4 like", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4NotLike(String value) {
            addCriterion("TDYL4 not like", value, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4In(List<String> values) {
            addCriterion("TDYL4 in", values, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4NotIn(List<String> values) {
            addCriterion("TDYL4 not in", values, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4Between(String value1, String value2) {
            addCriterion("TDYL4 between", value1, value2, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl4NotBetween(String value1, String value2) {
            addCriterion("TDYL4 not between", value1, value2, "tdyl4");
            return (Criteria) this;
        }

        public Criteria andTdyl5IsNull() {
            addCriterion("TDYL5 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl5IsNotNull() {
            addCriterion("TDYL5 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl5EqualTo(String value) {
            addCriterion("TDYL5 =", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5NotEqualTo(String value) {
            addCriterion("TDYL5 <>", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5GreaterThan(String value) {
            addCriterion("TDYL5 >", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL5 >=", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5LessThan(String value) {
            addCriterion("TDYL5 <", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5LessThanOrEqualTo(String value) {
            addCriterion("TDYL5 <=", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5Like(String value) {
            addCriterion("TDYL5 like", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5NotLike(String value) {
            addCriterion("TDYL5 not like", value, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5In(List<String> values) {
            addCriterion("TDYL5 in", values, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5NotIn(List<String> values) {
            addCriterion("TDYL5 not in", values, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5Between(String value1, String value2) {
            addCriterion("TDYL5 between", value1, value2, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl5NotBetween(String value1, String value2) {
            addCriterion("TDYL5 not between", value1, value2, "tdyl5");
            return (Criteria) this;
        }

        public Criteria andTdyl6IsNull() {
            addCriterion("TDYL6 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl6IsNotNull() {
            addCriterion("TDYL6 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl6EqualTo(String value) {
            addCriterion("TDYL6 =", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6NotEqualTo(String value) {
            addCriterion("TDYL6 <>", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6GreaterThan(String value) {
            addCriterion("TDYL6 >", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL6 >=", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6LessThan(String value) {
            addCriterion("TDYL6 <", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6LessThanOrEqualTo(String value) {
            addCriterion("TDYL6 <=", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6Like(String value) {
            addCriterion("TDYL6 like", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6NotLike(String value) {
            addCriterion("TDYL6 not like", value, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6In(List<String> values) {
            addCriterion("TDYL6 in", values, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6NotIn(List<String> values) {
            addCriterion("TDYL6 not in", values, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6Between(String value1, String value2) {
            addCriterion("TDYL6 between", value1, value2, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl6NotBetween(String value1, String value2) {
            addCriterion("TDYL6 not between", value1, value2, "tdyl6");
            return (Criteria) this;
        }

        public Criteria andTdyl7IsNull() {
            addCriterion("TDYL7 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl7IsNotNull() {
            addCriterion("TDYL7 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl7EqualTo(String value) {
            addCriterion("TDYL7 =", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7NotEqualTo(String value) {
            addCriterion("TDYL7 <>", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7GreaterThan(String value) {
            addCriterion("TDYL7 >", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL7 >=", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7LessThan(String value) {
            addCriterion("TDYL7 <", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7LessThanOrEqualTo(String value) {
            addCriterion("TDYL7 <=", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7Like(String value) {
            addCriterion("TDYL7 like", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7NotLike(String value) {
            addCriterion("TDYL7 not like", value, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7In(List<String> values) {
            addCriterion("TDYL7 in", values, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7NotIn(List<String> values) {
            addCriterion("TDYL7 not in", values, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7Between(String value1, String value2) {
            addCriterion("TDYL7 between", value1, value2, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl7NotBetween(String value1, String value2) {
            addCriterion("TDYL7 not between", value1, value2, "tdyl7");
            return (Criteria) this;
        }

        public Criteria andTdyl8IsNull() {
            addCriterion("TDYL8 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl8IsNotNull() {
            addCriterion("TDYL8 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl8EqualTo(String value) {
            addCriterion("TDYL8 =", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8NotEqualTo(String value) {
            addCriterion("TDYL8 <>", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8GreaterThan(String value) {
            addCriterion("TDYL8 >", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL8 >=", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8LessThan(String value) {
            addCriterion("TDYL8 <", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8LessThanOrEqualTo(String value) {
            addCriterion("TDYL8 <=", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8Like(String value) {
            addCriterion("TDYL8 like", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8NotLike(String value) {
            addCriterion("TDYL8 not like", value, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8In(List<String> values) {
            addCriterion("TDYL8 in", values, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8NotIn(List<String> values) {
            addCriterion("TDYL8 not in", values, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8Between(String value1, String value2) {
            addCriterion("TDYL8 between", value1, value2, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl8NotBetween(String value1, String value2) {
            addCriterion("TDYL8 not between", value1, value2, "tdyl8");
            return (Criteria) this;
        }

        public Criteria andTdyl9IsNull() {
            addCriterion("TDYL9 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl9IsNotNull() {
            addCriterion("TDYL9 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl9EqualTo(String value) {
            addCriterion("TDYL9 =", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9NotEqualTo(String value) {
            addCriterion("TDYL9 <>", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9GreaterThan(String value) {
            addCriterion("TDYL9 >", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL9 >=", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9LessThan(String value) {
            addCriterion("TDYL9 <", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9LessThanOrEqualTo(String value) {
            addCriterion("TDYL9 <=", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9Like(String value) {
            addCriterion("TDYL9 like", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9NotLike(String value) {
            addCriterion("TDYL9 not like", value, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9In(List<String> values) {
            addCriterion("TDYL9 in", values, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9NotIn(List<String> values) {
            addCriterion("TDYL9 not in", values, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9Between(String value1, String value2) {
            addCriterion("TDYL9 between", value1, value2, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl9NotBetween(String value1, String value2) {
            addCriterion("TDYL9 not between", value1, value2, "tdyl9");
            return (Criteria) this;
        }

        public Criteria andTdyl10IsNull() {
            addCriterion("TDYL10 is null");
            return (Criteria) this;
        }

        public Criteria andTdyl10IsNotNull() {
            addCriterion("TDYL10 is not null");
            return (Criteria) this;
        }

        public Criteria andTdyl10EqualTo(String value) {
            addCriterion("TDYL10 =", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10NotEqualTo(String value) {
            addCriterion("TDYL10 <>", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10GreaterThan(String value) {
            addCriterion("TDYL10 >", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10GreaterThanOrEqualTo(String value) {
            addCriterion("TDYL10 >=", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10LessThan(String value) {
            addCriterion("TDYL10 <", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10LessThanOrEqualTo(String value) {
            addCriterion("TDYL10 <=", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10Like(String value) {
            addCriterion("TDYL10 like", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10NotLike(String value) {
            addCriterion("TDYL10 not like", value, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10In(List<String> values) {
            addCriterion("TDYL10 in", values, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10NotIn(List<String> values) {
            addCriterion("TDYL10 not in", values, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10Between(String value1, String value2) {
            addCriterion("TDYL10 between", value1, value2, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andTdyl10NotBetween(String value1, String value2) {
            addCriterion("TDYL10 not between", value1, value2, "tdyl10");
            return (Criteria) this;
        }

        public Criteria andBalxfsIsNull() {
            addCriterion("BALXFS is null");
            return (Criteria) this;
        }

        public Criteria andBalxfsIsNotNull() {
            addCriterion("BALXFS is not null");
            return (Criteria) this;
        }

        public Criteria andBalxfsEqualTo(String value) {
            addCriterion("BALXFS =", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsNotEqualTo(String value) {
            addCriterion("BALXFS <>", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsGreaterThan(String value) {
            addCriterion("BALXFS >", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsGreaterThanOrEqualTo(String value) {
            addCriterion("BALXFS >=", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsLessThan(String value) {
            addCriterion("BALXFS <", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsLessThanOrEqualTo(String value) {
            addCriterion("BALXFS <=", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsLike(String value) {
            addCriterion("BALXFS like", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsNotLike(String value) {
            addCriterion("BALXFS not like", value, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsIn(List<String> values) {
            addCriterion("BALXFS in", values, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsNotIn(List<String> values) {
            addCriterion("BALXFS not in", values, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsBetween(String value1, String value2) {
            addCriterion("BALXFS between", value1, value2, "balxfs");
            return (Criteria) this;
        }

        public Criteria andBalxfsNotBetween(String value1, String value2) {
            addCriterion("BALXFS not between", value1, value2, "balxfs");
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

        public Criteria andXyxdmIsNull() {
            addCriterion("XYXDM is null");
            return (Criteria) this;
        }

        public Criteria andXyxdmIsNotNull() {
            addCriterion("XYXDM is not null");
            return (Criteria) this;
        }

        public Criteria andXyxdmEqualTo(String value) {
            addCriterion("XYXDM =", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmNotEqualTo(String value) {
            addCriterion("XYXDM <>", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmGreaterThan(String value) {
            addCriterion("XYXDM >", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmGreaterThanOrEqualTo(String value) {
            addCriterion("XYXDM >=", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmLessThan(String value) {
            addCriterion("XYXDM <", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmLessThanOrEqualTo(String value) {
            addCriterion("XYXDM <=", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmLike(String value) {
            addCriterion("XYXDM like", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmNotLike(String value) {
            addCriterion("XYXDM not like", value, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmIn(List<String> values) {
            addCriterion("XYXDM in", values, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmNotIn(List<String> values) {
            addCriterion("XYXDM not in", values, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmBetween(String value1, String value2) {
            addCriterion("XYXDM between", value1, value2, "xyxdm");
            return (Criteria) this;
        }

        public Criteria andXyxdmNotBetween(String value1, String value2) {
            addCriterion("XYXDM not between", value1, value2, "xyxdm");
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

        public Criteria andSfecsgIsNull() {
            addCriterion("SFECSG is null");
            return (Criteria) this;
        }

        public Criteria andSfecsgIsNotNull() {
            addCriterion("SFECSG is not null");
            return (Criteria) this;
        }

        public Criteria andSfecsgEqualTo(String value) {
            addCriterion("SFECSG =", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgNotEqualTo(String value) {
            addCriterion("SFECSG <>", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgGreaterThan(String value) {
            addCriterion("SFECSG >", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgGreaterThanOrEqualTo(String value) {
            addCriterion("SFECSG >=", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgLessThan(String value) {
            addCriterion("SFECSG <", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgLessThanOrEqualTo(String value) {
            addCriterion("SFECSG <=", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgLike(String value) {
            addCriterion("SFECSG like", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgNotLike(String value) {
            addCriterion("SFECSG not like", value, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgIn(List<String> values) {
            addCriterion("SFECSG in", values, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgNotIn(List<String> values) {
            addCriterion("SFECSG not in", values, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgBetween(String value1, String value2) {
            addCriterion("SFECSG between", value1, value2, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfecsgNotBetween(String value1, String value2) {
            addCriterion("SFECSG not between", value1, value2, "sfecsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgIsNull() {
            addCriterion("SFDXSG is null");
            return (Criteria) this;
        }

        public Criteria andSfdxsgIsNotNull() {
            addCriterion("SFDXSG is not null");
            return (Criteria) this;
        }

        public Criteria andSfdxsgEqualTo(String value) {
            addCriterion("SFDXSG =", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgNotEqualTo(String value) {
            addCriterion("SFDXSG <>", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgGreaterThan(String value) {
            addCriterion("SFDXSG >", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgGreaterThanOrEqualTo(String value) {
            addCriterion("SFDXSG >=", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgLessThan(String value) {
            addCriterion("SFDXSG <", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgLessThanOrEqualTo(String value) {
            addCriterion("SFDXSG <=", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgLike(String value) {
            addCriterion("SFDXSG like", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgNotLike(String value) {
            addCriterion("SFDXSG not like", value, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgIn(List<String> values) {
            addCriterion("SFDXSG in", values, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgNotIn(List<String> values) {
            addCriterion("SFDXSG not in", values, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgBetween(String value1, String value2) {
            addCriterion("SFDXSG between", value1, value2, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andSfdxsgNotBetween(String value1, String value2) {
            addCriterion("SFDXSG not between", value1, value2, "sfdxsg");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjIsNull() {
            addCriterion("DLAQYHDJ is null");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjIsNotNull() {
            addCriterion("DLAQYHDJ is not null");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjEqualTo(String value) {
            addCriterion("DLAQYHDJ =", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjNotEqualTo(String value) {
            addCriterion("DLAQYHDJ <>", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjGreaterThan(String value) {
            addCriterion("DLAQYHDJ >", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjGreaterThanOrEqualTo(String value) {
            addCriterion("DLAQYHDJ >=", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjLessThan(String value) {
            addCriterion("DLAQYHDJ <", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjLessThanOrEqualTo(String value) {
            addCriterion("DLAQYHDJ <=", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjLike(String value) {
            addCriterion("DLAQYHDJ like", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjNotLike(String value) {
            addCriterion("DLAQYHDJ not like", value, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjIn(List<String> values) {
            addCriterion("DLAQYHDJ in", values, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjNotIn(List<String> values) {
            addCriterion("DLAQYHDJ not in", values, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjBetween(String value1, String value2) {
            addCriterion("DLAQYHDJ between", value1, value2, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDlaqyhdjNotBetween(String value1, String value2) {
            addCriterion("DLAQYHDJ not between", value1, value2, "dlaqyhdj");
            return (Criteria) this;
        }

        public Criteria andDsrzsIsNull() {
            addCriterion("DSRZS is null");
            return (Criteria) this;
        }

        public Criteria andDsrzsIsNotNull() {
            addCriterion("DSRZS is not null");
            return (Criteria) this;
        }

        public Criteria andDsrzsEqualTo(Short value) {
            addCriterion("DSRZS =", value, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsNotEqualTo(Short value) {
            addCriterion("DSRZS <>", value, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsGreaterThan(Short value) {
            addCriterion("DSRZS >", value, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsGreaterThanOrEqualTo(Short value) {
            addCriterion("DSRZS >=", value, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsLessThan(Short value) {
            addCriterion("DSRZS <", value, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsLessThanOrEqualTo(Short value) {
            addCriterion("DSRZS <=", value, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsIn(List<Short> values) {
            addCriterion("DSRZS in", values, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsNotIn(List<Short> values) {
            addCriterion("DSRZS not in", values, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsBetween(Short value1, Short value2) {
            addCriterion("DSRZS between", value1, value2, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andDsrzsNotBetween(Short value1, Short value2) {
            addCriterion("DSRZS not between", value1, value2, "dsrzs");
            return (Criteria) this;
        }

        public Criteria andFsjgIsNull() {
            addCriterion("FSJG is null");
            return (Criteria) this;
        }

        public Criteria andFsjgIsNotNull() {
            addCriterion("FSJG is not null");
            return (Criteria) this;
        }

        public Criteria andFsjgEqualTo(String value) {
            addCriterion("FSJG =", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgNotEqualTo(String value) {
            addCriterion("FSJG <>", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgGreaterThan(String value) {
            addCriterion("FSJG >", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgGreaterThanOrEqualTo(String value) {
            addCriterion("FSJG >=", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgLessThan(String value) {
            addCriterion("FSJG <", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgLessThanOrEqualTo(String value) {
            addCriterion("FSJG <=", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgLike(String value) {
            addCriterion("FSJG like", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgNotLike(String value) {
            addCriterion("FSJG not like", value, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgIn(List<String> values) {
            addCriterion("FSJG in", values, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgNotIn(List<String> values) {
            addCriterion("FSJG not in", values, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgBetween(String value1, String value2) {
            addCriterion("FSJG between", value1, value2, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFsjgNotBetween(String value1, String value2) {
            addCriterion("FSJG not between", value1, value2, "fsjg");
            return (Criteria) this;
        }

        public Criteria andFfjgIsNull() {
            addCriterion("FFJG is null");
            return (Criteria) this;
        }

        public Criteria andFfjgIsNotNull() {
            addCriterion("FFJG is not null");
            return (Criteria) this;
        }

        public Criteria andFfjgEqualTo(String value) {
            addCriterion("FFJG =", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgNotEqualTo(String value) {
            addCriterion("FFJG <>", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgGreaterThan(String value) {
            addCriterion("FFJG >", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgGreaterThanOrEqualTo(String value) {
            addCriterion("FFJG >=", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgLessThan(String value) {
            addCriterion("FFJG <", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgLessThanOrEqualTo(String value) {
            addCriterion("FFJG <=", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgLike(String value) {
            addCriterion("FFJG like", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgNotLike(String value) {
            addCriterion("FFJG not like", value, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgIn(List<String> values) {
            addCriterion("FFJG in", values, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgNotIn(List<String> values) {
            addCriterion("FFJG not in", values, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgBetween(String value1, String value2) {
            addCriterion("FFJG between", value1, value2, "ffjg");
            return (Criteria) this;
        }

        public Criteria andFfjgNotBetween(String value1, String value2) {
            addCriterion("FFJG not between", value1, value2, "ffjg");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzIsNull() {
            addCriterion("SDSGDSCWZ is null");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzIsNotNull() {
            addCriterion("SDSGDSCWZ is not null");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzEqualTo(String value) {
            addCriterion("SDSGDSCWZ =", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzNotEqualTo(String value) {
            addCriterion("SDSGDSCWZ <>", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzGreaterThan(String value) {
            addCriterion("SDSGDSCWZ >", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzGreaterThanOrEqualTo(String value) {
            addCriterion("SDSGDSCWZ >=", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzLessThan(String value) {
            addCriterion("SDSGDSCWZ <", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzLessThanOrEqualTo(String value) {
            addCriterion("SDSGDSCWZ <=", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzLike(String value) {
            addCriterion("SDSGDSCWZ like", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzNotLike(String value) {
            addCriterion("SDSGDSCWZ not like", value, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzIn(List<String> values) {
            addCriterion("SDSGDSCWZ in", values, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzNotIn(List<String> values) {
            addCriterion("SDSGDSCWZ not in", values, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzBetween(String value1, String value2) {
            addCriterion("SDSGDSCWZ between", value1, value2, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andSdsgdscwzNotBetween(String value1, String value2) {
            addCriterion("SDSGDSCWZ not between", value1, value2, "sdsgdscwz");
            return (Criteria) this;
        }

        public Criteria andHlztIsNull() {
            addCriterion("HLZT is null");
            return (Criteria) this;
        }

        public Criteria andHlztIsNotNull() {
            addCriterion("HLZT is not null");
            return (Criteria) this;
        }

        public Criteria andHlztEqualTo(String value) {
            addCriterion("HLZT =", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztNotEqualTo(String value) {
            addCriterion("HLZT <>", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztGreaterThan(String value) {
            addCriterion("HLZT >", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztGreaterThanOrEqualTo(String value) {
            addCriterion("HLZT >=", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztLessThan(String value) {
            addCriterion("HLZT <", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztLessThanOrEqualTo(String value) {
            addCriterion("HLZT <=", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztLike(String value) {
            addCriterion("HLZT like", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztNotLike(String value) {
            addCriterion("HLZT not like", value, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztIn(List<String> values) {
            addCriterion("HLZT in", values, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztNotIn(List<String> values) {
            addCriterion("HLZT not in", values, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztBetween(String value1, String value2) {
            addCriterion("HLZT between", value1, value2, "hlzt");
            return (Criteria) this;
        }

        public Criteria andHlztNotBetween(String value1, String value2) {
            addCriterion("HLZT not between", value1, value2, "hlzt");
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

        public Criteria andAjmcIsNull() {
            addCriterion("AJMC is null");
            return (Criteria) this;
        }

        public Criteria andAjmcIsNotNull() {
            addCriterion("AJMC is not null");
            return (Criteria) this;
        }

        public Criteria andAjmcEqualTo(String value) {
            addCriterion("AJMC =", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotEqualTo(String value) {
            addCriterion("AJMC <>", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcGreaterThan(String value) {
            addCriterion("AJMC >", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcGreaterThanOrEqualTo(String value) {
            addCriterion("AJMC >=", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcLessThan(String value) {
            addCriterion("AJMC <", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcLessThanOrEqualTo(String value) {
            addCriterion("AJMC <=", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcLike(String value) {
            addCriterion("AJMC like", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotLike(String value) {
            addCriterion("AJMC not like", value, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcIn(List<String> values) {
            addCriterion("AJMC in", values, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotIn(List<String> values) {
            addCriterion("AJMC not in", values, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcBetween(String value1, String value2) {
            addCriterion("AJMC between", value1, value2, "ajmc");
            return (Criteria) this;
        }

        public Criteria andAjmcNotBetween(String value1, String value2) {
            addCriterion("AJMC not between", value1, value2, "ajmc");
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