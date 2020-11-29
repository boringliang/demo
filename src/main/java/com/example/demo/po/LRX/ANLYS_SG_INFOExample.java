package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.List;

public class ANLYS_SG_INFOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ANLYS_SG_INFOExample() {
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

        public Criteria andSgidIsNull() {
            addCriterion("SGID is null");
            return (Criteria) this;
        }

        public Criteria andSgidIsNotNull() {
            addCriterion("SGID is not null");
            return (Criteria) this;
        }

        public Criteria andSgidEqualTo(String value) {
            addCriterion("SGID =", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidNotEqualTo(String value) {
            addCriterion("SGID <>", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidGreaterThan(String value) {
            addCriterion("SGID >", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidGreaterThanOrEqualTo(String value) {
            addCriterion("SGID >=", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidLessThan(String value) {
            addCriterion("SGID <", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidLessThanOrEqualTo(String value) {
            addCriterion("SGID <=", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidLike(String value) {
            addCriterion("SGID like", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidNotLike(String value) {
            addCriterion("SGID not like", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidIn(List<String> values) {
            addCriterion("SGID in", values, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidNotIn(List<String> values) {
            addCriterion("SGID not in", values, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidBetween(String value1, String value2) {
            addCriterion("SGID between", value1, value2, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidNotBetween(String value1, String value2) {
            addCriterion("SGID not between", value1, value2, "sgid");
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

        public Criteria andSgsjIsNull() {
            addCriterion("SGSJ is null");
            return (Criteria) this;
        }

        public Criteria andSgsjIsNotNull() {
            addCriterion("SGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSgsjEqualTo(String value) {
            addCriterion("SGSJ =", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjNotEqualTo(String value) {
            addCriterion("SGSJ <>", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjGreaterThan(String value) {
            addCriterion("SGSJ >", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjGreaterThanOrEqualTo(String value) {
            addCriterion("SGSJ >=", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjLessThan(String value) {
            addCriterion("SGSJ <", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjLessThanOrEqualTo(String value) {
            addCriterion("SGSJ <=", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjLike(String value) {
            addCriterion("SGSJ like", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjNotLike(String value) {
            addCriterion("SGSJ not like", value, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjIn(List<String> values) {
            addCriterion("SGSJ in", values, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjNotIn(List<String> values) {
            addCriterion("SGSJ not in", values, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjBetween(String value1, String value2) {
            addCriterion("SGSJ between", value1, value2, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgsjNotBetween(String value1, String value2) {
            addCriterion("SGSJ not between", value1, value2, "sgsj");
            return (Criteria) this;
        }

        public Criteria andSgxqIsNull() {
            addCriterion("SGXQ is null");
            return (Criteria) this;
        }

        public Criteria andSgxqIsNotNull() {
            addCriterion("SGXQ is not null");
            return (Criteria) this;
        }

        public Criteria andSgxqEqualTo(String value) {
            addCriterion("SGXQ =", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqNotEqualTo(String value) {
            addCriterion("SGXQ <>", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqGreaterThan(String value) {
            addCriterion("SGXQ >", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqGreaterThanOrEqualTo(String value) {
            addCriterion("SGXQ >=", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqLessThan(String value) {
            addCriterion("SGXQ <", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqLessThanOrEqualTo(String value) {
            addCriterion("SGXQ <=", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqLike(String value) {
            addCriterion("SGXQ like", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqNotLike(String value) {
            addCriterion("SGXQ not like", value, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqIn(List<String> values) {
            addCriterion("SGXQ in", values, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqNotIn(List<String> values) {
            addCriterion("SGXQ not in", values, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqBetween(String value1, String value2) {
            addCriterion("SGXQ between", value1, value2, "sgxq");
            return (Criteria) this;
        }

        public Criteria andSgxqNotBetween(String value1, String value2) {
            addCriterion("SGXQ not between", value1, value2, "sgxq");
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

        public Criteria andSglyIsNull() {
            addCriterion("SGLY is null");
            return (Criteria) this;
        }

        public Criteria andSglyIsNotNull() {
            addCriterion("SGLY is not null");
            return (Criteria) this;
        }

        public Criteria andSglyEqualTo(String value) {
            addCriterion("SGLY =", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyNotEqualTo(String value) {
            addCriterion("SGLY <>", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyGreaterThan(String value) {
            addCriterion("SGLY >", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyGreaterThanOrEqualTo(String value) {
            addCriterion("SGLY >=", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyLessThan(String value) {
            addCriterion("SGLY <", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyLessThanOrEqualTo(String value) {
            addCriterion("SGLY <=", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyLike(String value) {
            addCriterion("SGLY like", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyNotLike(String value) {
            addCriterion("SGLY not like", value, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyIn(List<String> values) {
            addCriterion("SGLY in", values, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyNotIn(List<String> values) {
            addCriterion("SGLY not in", values, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyBetween(String value1, String value2) {
            addCriterion("SGLY between", value1, value2, "sgly");
            return (Criteria) this;
        }

        public Criteria andSglyNotBetween(String value1, String value2) {
            addCriterion("SGLY not between", value1, value2, "sgly");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1IsNull() {
            addCriterion("SGBH6IN1 is null");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1IsNotNull() {
            addCriterion("SGBH6IN1 is not null");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1EqualTo(String value) {
            addCriterion("SGBH6IN1 =", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1NotEqualTo(String value) {
            addCriterion("SGBH6IN1 <>", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1GreaterThan(String value) {
            addCriterion("SGBH6IN1 >", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1GreaterThanOrEqualTo(String value) {
            addCriterion("SGBH6IN1 >=", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1LessThan(String value) {
            addCriterion("SGBH6IN1 <", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1LessThanOrEqualTo(String value) {
            addCriterion("SGBH6IN1 <=", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1Like(String value) {
            addCriterion("SGBH6IN1 like", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1NotLike(String value) {
            addCriterion("SGBH6IN1 not like", value, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1In(List<String> values) {
            addCriterion("SGBH6IN1 in", values, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1NotIn(List<String> values) {
            addCriterion("SGBH6IN1 not in", values, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1Between(String value1, String value2) {
            addCriterion("SGBH6IN1 between", value1, value2, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgbh6in1NotBetween(String value1, String value2) {
            addCriterion("SGBH6IN1 not between", value1, value2, "sgbh6in1");
            return (Criteria) this;
        }

        public Criteria andSgcxlxIsNull() {
            addCriterion("SGCXLX is null");
            return (Criteria) this;
        }

        public Criteria andSgcxlxIsNotNull() {
            addCriterion("SGCXLX is not null");
            return (Criteria) this;
        }

        public Criteria andSgcxlxEqualTo(String value) {
            addCriterion("SGCXLX =", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxNotEqualTo(String value) {
            addCriterion("SGCXLX <>", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxGreaterThan(String value) {
            addCriterion("SGCXLX >", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxGreaterThanOrEqualTo(String value) {
            addCriterion("SGCXLX >=", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxLessThan(String value) {
            addCriterion("SGCXLX <", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxLessThanOrEqualTo(String value) {
            addCriterion("SGCXLX <=", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxLike(String value) {
            addCriterion("SGCXLX like", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxNotLike(String value) {
            addCriterion("SGCXLX not like", value, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxIn(List<String> values) {
            addCriterion("SGCXLX in", values, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxNotIn(List<String> values) {
            addCriterion("SGCXLX not in", values, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxBetween(String value1, String value2) {
            addCriterion("SGCXLX between", value1, value2, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andSgcxlxNotBetween(String value1, String value2) {
            addCriterion("SGCXLX not between", value1, value2, "sgcxlx");
            return (Criteria) this;
        }

        public Criteria andPointxIsNull() {
            addCriterion("POINTX is null");
            return (Criteria) this;
        }

        public Criteria andPointxIsNotNull() {
            addCriterion("POINTX is not null");
            return (Criteria) this;
        }

        public Criteria andPointxEqualTo(String value) {
            addCriterion("POINTX =", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxNotEqualTo(String value) {
            addCriterion("POINTX <>", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxGreaterThan(String value) {
            addCriterion("POINTX >", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxGreaterThanOrEqualTo(String value) {
            addCriterion("POINTX >=", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxLessThan(String value) {
            addCriterion("POINTX <", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxLessThanOrEqualTo(String value) {
            addCriterion("POINTX <=", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxLike(String value) {
            addCriterion("POINTX like", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxNotLike(String value) {
            addCriterion("POINTX not like", value, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxIn(List<String> values) {
            addCriterion("POINTX in", values, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxNotIn(List<String> values) {
            addCriterion("POINTX not in", values, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxBetween(String value1, String value2) {
            addCriterion("POINTX between", value1, value2, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointxNotBetween(String value1, String value2) {
            addCriterion("POINTX not between", value1, value2, "pointx");
            return (Criteria) this;
        }

        public Criteria andPointyIsNull() {
            addCriterion("POINTY is null");
            return (Criteria) this;
        }

        public Criteria andPointyIsNotNull() {
            addCriterion("POINTY is not null");
            return (Criteria) this;
        }

        public Criteria andPointyEqualTo(String value) {
            addCriterion("POINTY =", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyNotEqualTo(String value) {
            addCriterion("POINTY <>", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyGreaterThan(String value) {
            addCriterion("POINTY >", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyGreaterThanOrEqualTo(String value) {
            addCriterion("POINTY >=", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyLessThan(String value) {
            addCriterion("POINTY <", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyLessThanOrEqualTo(String value) {
            addCriterion("POINTY <=", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyLike(String value) {
            addCriterion("POINTY like", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyNotLike(String value) {
            addCriterion("POINTY not like", value, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyIn(List<String> values) {
            addCriterion("POINTY in", values, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyNotIn(List<String> values) {
            addCriterion("POINTY not in", values, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyBetween(String value1, String value2) {
            addCriterion("POINTY between", value1, value2, "pointy");
            return (Criteria) this;
        }

        public Criteria andPointyNotBetween(String value1, String value2) {
            addCriterion("POINTY not between", value1, value2, "pointy");
            return (Criteria) this;
        }

        public Criteria andCcssIsNull() {
            addCriterion("CCSS is null");
            return (Criteria) this;
        }

        public Criteria andCcssIsNotNull() {
            addCriterion("CCSS is not null");
            return (Criteria) this;
        }

        public Criteria andCcssEqualTo(String value) {
            addCriterion("CCSS =", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssNotEqualTo(String value) {
            addCriterion("CCSS <>", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssGreaterThan(String value) {
            addCriterion("CCSS >", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssGreaterThanOrEqualTo(String value) {
            addCriterion("CCSS >=", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssLessThan(String value) {
            addCriterion("CCSS <", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssLessThanOrEqualTo(String value) {
            addCriterion("CCSS <=", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssLike(String value) {
            addCriterion("CCSS like", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssNotLike(String value) {
            addCriterion("CCSS not like", value, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssIn(List<String> values) {
            addCriterion("CCSS in", values, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssNotIn(List<String> values) {
            addCriterion("CCSS not in", values, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssBetween(String value1, String value2) {
            addCriterion("CCSS between", value1, value2, "ccss");
            return (Criteria) this;
        }

        public Criteria andCcssNotBetween(String value1, String value2) {
            addCriterion("CCSS not between", value1, value2, "ccss");
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

        public Criteria andRdldmIsNull() {
            addCriterion("RDLDM is null");
            return (Criteria) this;
        }

        public Criteria andRdldmIsNotNull() {
            addCriterion("RDLDM is not null");
            return (Criteria) this;
        }

        public Criteria andRdldmEqualTo(String value) {
            addCriterion("RDLDM =", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmNotEqualTo(String value) {
            addCriterion("RDLDM <>", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmGreaterThan(String value) {
            addCriterion("RDLDM >", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmGreaterThanOrEqualTo(String value) {
            addCriterion("RDLDM >=", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmLessThan(String value) {
            addCriterion("RDLDM <", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmLessThanOrEqualTo(String value) {
            addCriterion("RDLDM <=", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmLike(String value) {
            addCriterion("RDLDM like", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmNotLike(String value) {
            addCriterion("RDLDM not like", value, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmIn(List<String> values) {
            addCriterion("RDLDM in", values, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmNotIn(List<String> values) {
            addCriterion("RDLDM not in", values, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmBetween(String value1, String value2) {
            addCriterion("RDLDM between", value1, value2, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRdldmNotBetween(String value1, String value2) {
            addCriterion("RDLDM not between", value1, value2, "rdldm");
            return (Criteria) this;
        }

        public Criteria andRlddmIsNull() {
            addCriterion("RLDDM is null");
            return (Criteria) this;
        }

        public Criteria andRlddmIsNotNull() {
            addCriterion("RLDDM is not null");
            return (Criteria) this;
        }

        public Criteria andRlddmEqualTo(String value) {
            addCriterion("RLDDM =", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmNotEqualTo(String value) {
            addCriterion("RLDDM <>", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmGreaterThan(String value) {
            addCriterion("RLDDM >", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmGreaterThanOrEqualTo(String value) {
            addCriterion("RLDDM >=", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmLessThan(String value) {
            addCriterion("RLDDM <", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmLessThanOrEqualTo(String value) {
            addCriterion("RLDDM <=", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmLike(String value) {
            addCriterion("RLDDM like", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmNotLike(String value) {
            addCriterion("RLDDM not like", value, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmIn(List<String> values) {
            addCriterion("RLDDM in", values, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmNotIn(List<String> values) {
            addCriterion("RLDDM not in", values, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmBetween(String value1, String value2) {
            addCriterion("RLDDM between", value1, value2, "rlddm");
            return (Criteria) this;
        }

        public Criteria andRlddmNotBetween(String value1, String value2) {
            addCriterion("RLDDM not between", value1, value2, "rlddm");
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

        public Criteria andSwrsEqualTo(String value) {
            addCriterion("SWRS =", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsNotEqualTo(String value) {
            addCriterion("SWRS <>", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsGreaterThan(String value) {
            addCriterion("SWRS >", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsGreaterThanOrEqualTo(String value) {
            addCriterion("SWRS >=", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsLessThan(String value) {
            addCriterion("SWRS <", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsLessThanOrEqualTo(String value) {
            addCriterion("SWRS <=", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsLike(String value) {
            addCriterion("SWRS like", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsNotLike(String value) {
            addCriterion("SWRS not like", value, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsIn(List<String> values) {
            addCriterion("SWRS in", values, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsNotIn(List<String> values) {
            addCriterion("SWRS not in", values, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsBetween(String value1, String value2) {
            addCriterion("SWRS between", value1, value2, "swrs");
            return (Criteria) this;
        }

        public Criteria andSwrsNotBetween(String value1, String value2) {
            addCriterion("SWRS not between", value1, value2, "swrs");
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

        public Criteria andSsrsEqualTo(String value) {
            addCriterion("SSRS =", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsNotEqualTo(String value) {
            addCriterion("SSRS <>", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsGreaterThan(String value) {
            addCriterion("SSRS >", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsGreaterThanOrEqualTo(String value) {
            addCriterion("SSRS >=", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsLessThan(String value) {
            addCriterion("SSRS <", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsLessThanOrEqualTo(String value) {
            addCriterion("SSRS <=", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsLike(String value) {
            addCriterion("SSRS like", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsNotLike(String value) {
            addCriterion("SSRS not like", value, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsIn(List<String> values) {
            addCriterion("SSRS in", values, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsNotIn(List<String> values) {
            addCriterion("SSRS not in", values, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsBetween(String value1, String value2) {
            addCriterion("SSRS between", value1, value2, "ssrs");
            return (Criteria) this;
        }

        public Criteria andSsrsNotBetween(String value1, String value2) {
            addCriterion("SSRS not between", value1, value2, "ssrs");
            return (Criteria) this;
        }

        public Criteria andYyfxIsNull() {
            addCriterion("YYFX is null");
            return (Criteria) this;
        }

        public Criteria andYyfxIsNotNull() {
            addCriterion("YYFX is not null");
            return (Criteria) this;
        }

        public Criteria andYyfxEqualTo(String value) {
            addCriterion("YYFX =", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxNotEqualTo(String value) {
            addCriterion("YYFX <>", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxGreaterThan(String value) {
            addCriterion("YYFX >", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxGreaterThanOrEqualTo(String value) {
            addCriterion("YYFX >=", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxLessThan(String value) {
            addCriterion("YYFX <", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxLessThanOrEqualTo(String value) {
            addCriterion("YYFX <=", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxLike(String value) {
            addCriterion("YYFX like", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxNotLike(String value) {
            addCriterion("YYFX not like", value, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxIn(List<String> values) {
            addCriterion("YYFX in", values, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxNotIn(List<String> values) {
            addCriterion("YYFX not in", values, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxBetween(String value1, String value2) {
            addCriterion("YYFX between", value1, value2, "yyfx");
            return (Criteria) this;
        }

        public Criteria andYyfxNotBetween(String value1, String value2) {
            addCriterion("YYFX not between", value1, value2, "yyfx");
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