package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.List;

public class ANLYS_POLICE_CASE_HOURExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ANLYS_POLICE_CASE_HOURExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("NID is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("NID is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(String value) {
            addCriterion("NID =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(String value) {
            addCriterion("NID <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(String value) {
            addCriterion("NID >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(String value) {
            addCriterion("NID >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(String value) {
            addCriterion("NID <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(String value) {
            addCriterion("NID <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLike(String value) {
            addCriterion("NID like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotLike(String value) {
            addCriterion("NID not like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<String> values) {
            addCriterion("NID in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<String> values) {
            addCriterion("NID not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(String value1, String value2) {
            addCriterion("NID between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(String value1, String value2) {
            addCriterion("NID not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryIsNull() {
            addCriterion("CASE_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryIsNotNull() {
            addCriterion("CASE_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryEqualTo(String value) {
            addCriterion("CASE_CATEGORY =", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryNotEqualTo(String value) {
            addCriterion("CASE_CATEGORY <>", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryGreaterThan(String value) {
            addCriterion("CASE_CATEGORY >", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_CATEGORY >=", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryLessThan(String value) {
            addCriterion("CASE_CATEGORY <", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryLessThanOrEqualTo(String value) {
            addCriterion("CASE_CATEGORY <=", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryLike(String value) {
            addCriterion("CASE_CATEGORY like", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryNotLike(String value) {
            addCriterion("CASE_CATEGORY not like", value, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryIn(List<String> values) {
            addCriterion("CASE_CATEGORY in", values, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryNotIn(List<String> values) {
            addCriterion("CASE_CATEGORY not in", values, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryBetween(String value1, String value2) {
            addCriterion("CASE_CATEGORY between", value1, value2, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andCaseCategoryNotBetween(String value1, String value2) {
            addCriterion("CASE_CATEGORY not between", value1, value2, "caseCategory");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeIsNull() {
            addCriterion("CONCRETE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeIsNotNull() {
            addCriterion("CONCRETE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeEqualTo(String value) {
            addCriterion("CONCRETE_TYPE =", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeNotEqualTo(String value) {
            addCriterion("CONCRETE_TYPE <>", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeGreaterThan(String value) {
            addCriterion("CONCRETE_TYPE >", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONCRETE_TYPE >=", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeLessThan(String value) {
            addCriterion("CONCRETE_TYPE <", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeLessThanOrEqualTo(String value) {
            addCriterion("CONCRETE_TYPE <=", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeLike(String value) {
            addCriterion("CONCRETE_TYPE like", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeNotLike(String value) {
            addCriterion("CONCRETE_TYPE not like", value, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeIn(List<String> values) {
            addCriterion("CONCRETE_TYPE in", values, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeNotIn(List<String> values) {
            addCriterion("CONCRETE_TYPE not in", values, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeBetween(String value1, String value2) {
            addCriterion("CONCRETE_TYPE between", value1, value2, "concreteType");
            return (Criteria) this;
        }

        public Criteria andConcreteTypeNotBetween(String value1, String value2) {
            addCriterion("CONCRETE_TYPE not between", value1, value2, "concreteType");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNull() {
            addCriterion("CASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNotNull() {
            addCriterion("CASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeEqualTo(String value) {
            addCriterion("CASE_TIME =", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotEqualTo(String value) {
            addCriterion("CASE_TIME <>", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThan(String value) {
            addCriterion("CASE_TIME >", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_TIME >=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThan(String value) {
            addCriterion("CASE_TIME <", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThanOrEqualTo(String value) {
            addCriterion("CASE_TIME <=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLike(String value) {
            addCriterion("CASE_TIME like", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotLike(String value) {
            addCriterion("CASE_TIME not like", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIn(List<String> values) {
            addCriterion("CASE_TIME in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotIn(List<String> values) {
            addCriterion("CASE_TIME not in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeBetween(String value1, String value2) {
            addCriterion("CASE_TIME between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotBetween(String value1, String value2) {
            addCriterion("CASE_TIME not between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtIsNull() {
            addCriterion("ALARM_AMOUBT is null");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtIsNotNull() {
            addCriterion("ALARM_AMOUBT is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtEqualTo(String value) {
            addCriterion("ALARM_AMOUBT =", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtNotEqualTo(String value) {
            addCriterion("ALARM_AMOUBT <>", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtGreaterThan(String value) {
            addCriterion("ALARM_AMOUBT >", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM_AMOUBT >=", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtLessThan(String value) {
            addCriterion("ALARM_AMOUBT <", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtLessThanOrEqualTo(String value) {
            addCriterion("ALARM_AMOUBT <=", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtLike(String value) {
            addCriterion("ALARM_AMOUBT like", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtNotLike(String value) {
            addCriterion("ALARM_AMOUBT not like", value, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtIn(List<String> values) {
            addCriterion("ALARM_AMOUBT in", values, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtNotIn(List<String> values) {
            addCriterion("ALARM_AMOUBT not in", values, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtBetween(String value1, String value2) {
            addCriterion("ALARM_AMOUBT between", value1, value2, "alarmAmoubt");
            return (Criteria) this;
        }

        public Criteria andAlarmAmoubtNotBetween(String value1, String value2) {
            addCriterion("ALARM_AMOUBT not between", value1, value2, "alarmAmoubt");
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