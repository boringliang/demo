package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.List;

public class ANLYS_MAJORCAR_ACCIDENT_DATAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ANLYS_MAJORCAR_ACCIDENT_DATAExample() {
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

        public Criteria andCcarnumberIsNull() {
            addCriterion("CCARNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCcarnumberIsNotNull() {
            addCriterion("CCARNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCcarnumberEqualTo(String value) {
            addCriterion("CCARNUMBER =", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberNotEqualTo(String value) {
            addCriterion("CCARNUMBER <>", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberGreaterThan(String value) {
            addCriterion("CCARNUMBER >", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CCARNUMBER >=", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberLessThan(String value) {
            addCriterion("CCARNUMBER <", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberLessThanOrEqualTo(String value) {
            addCriterion("CCARNUMBER <=", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberLike(String value) {
            addCriterion("CCARNUMBER like", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberNotLike(String value) {
            addCriterion("CCARNUMBER not like", value, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberIn(List<String> values) {
            addCriterion("CCARNUMBER in", values, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberNotIn(List<String> values) {
            addCriterion("CCARNUMBER not in", values, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberBetween(String value1, String value2) {
            addCriterion("CCARNUMBER between", value1, value2, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andCcarnumberNotBetween(String value1, String value2) {
            addCriterion("CCARNUMBER not between", value1, value2, "ccarnumber");
            return (Criteria) this;
        }

        public Criteria andClicensetypeIsNull() {
            addCriterion("CLICENSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andClicensetypeIsNotNull() {
            addCriterion("CLICENSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClicensetypeEqualTo(String value) {
            addCriterion("CLICENSETYPE =", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeNotEqualTo(String value) {
            addCriterion("CLICENSETYPE <>", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeGreaterThan(String value) {
            addCriterion("CLICENSETYPE >", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLICENSETYPE >=", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeLessThan(String value) {
            addCriterion("CLICENSETYPE <", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeLessThanOrEqualTo(String value) {
            addCriterion("CLICENSETYPE <=", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeLike(String value) {
            addCriterion("CLICENSETYPE like", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeNotLike(String value) {
            addCriterion("CLICENSETYPE not like", value, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeIn(List<String> values) {
            addCriterion("CLICENSETYPE in", values, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeNotIn(List<String> values) {
            addCriterion("CLICENSETYPE not in", values, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeBetween(String value1, String value2) {
            addCriterion("CLICENSETYPE between", value1, value2, "clicensetype");
            return (Criteria) this;
        }

        public Criteria andClicensetypeNotBetween(String value1, String value2) {
            addCriterion("CLICENSETYPE not between", value1, value2, "clicensetype");
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