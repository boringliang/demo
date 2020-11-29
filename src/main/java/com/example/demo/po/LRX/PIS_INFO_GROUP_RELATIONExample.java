package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PIS_INFO_GROUP_RELATIONExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PIS_INFO_GROUP_RELATIONExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(String value) {
            addCriterion("INFO_ID =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(String value) {
            addCriterion("INFO_ID <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(String value) {
            addCriterion("INFO_ID >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_ID >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(String value) {
            addCriterion("INFO_ID <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(String value) {
            addCriterion("INFO_ID <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLike(String value) {
            addCriterion("INFO_ID like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotLike(String value) {
            addCriterion("INFO_ID not like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<String> values) {
            addCriterion("INFO_ID in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<String> values) {
            addCriterion("INFO_ID not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(String value1, String value2) {
            addCriterion("INFO_ID between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(String value1, String value2) {
            addCriterion("INFO_ID not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNull() {
            addCriterion("IS_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNotNull() {
            addCriterion("IS_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsMainEqualTo(String value) {
            addCriterion("IS_MAIN =", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotEqualTo(String value) {
            addCriterion("IS_MAIN <>", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThan(String value) {
            addCriterion("IS_MAIN >", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MAIN >=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThan(String value) {
            addCriterion("IS_MAIN <", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThanOrEqualTo(String value) {
            addCriterion("IS_MAIN <=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLike(String value) {
            addCriterion("IS_MAIN like", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotLike(String value) {
            addCriterion("IS_MAIN not like", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainIn(List<String> values) {
            addCriterion("IS_MAIN in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotIn(List<String> values) {
            addCriterion("IS_MAIN not in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainBetween(String value1, String value2) {
            addCriterion("IS_MAIN between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotBetween(String value1, String value2) {
            addCriterion("IS_MAIN not between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andMergeTimeIsNull() {
            addCriterion("MERGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMergeTimeIsNotNull() {
            addCriterion("MERGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMergeTimeEqualTo(Date value) {
            addCriterion("MERGE_TIME =", value, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeNotEqualTo(Date value) {
            addCriterion("MERGE_TIME <>", value, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeGreaterThan(Date value) {
            addCriterion("MERGE_TIME >", value, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MERGE_TIME >=", value, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeLessThan(Date value) {
            addCriterion("MERGE_TIME <", value, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeLessThanOrEqualTo(Date value) {
            addCriterion("MERGE_TIME <=", value, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeIn(List<Date> values) {
            addCriterion("MERGE_TIME in", values, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeNotIn(List<Date> values) {
            addCriterion("MERGE_TIME not in", values, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeBetween(Date value1, Date value2) {
            addCriterion("MERGE_TIME between", value1, value2, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andMergeTimeNotBetween(Date value1, Date value2) {
            addCriterion("MERGE_TIME not between", value1, value2, "mergeTime");
            return (Criteria) this;
        }

        public Criteria andIsAppendIsNull() {
            addCriterion("IS_APPEND is null");
            return (Criteria) this;
        }

        public Criteria andIsAppendIsNotNull() {
            addCriterion("IS_APPEND is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppendEqualTo(String value) {
            addCriterion("IS_APPEND =", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotEqualTo(String value) {
            addCriterion("IS_APPEND <>", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendGreaterThan(String value) {
            addCriterion("IS_APPEND >", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendGreaterThanOrEqualTo(String value) {
            addCriterion("IS_APPEND >=", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLessThan(String value) {
            addCriterion("IS_APPEND <", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLessThanOrEqualTo(String value) {
            addCriterion("IS_APPEND <=", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLike(String value) {
            addCriterion("IS_APPEND like", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotLike(String value) {
            addCriterion("IS_APPEND not like", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendIn(List<String> values) {
            addCriterion("IS_APPEND in", values, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotIn(List<String> values) {
            addCriterion("IS_APPEND not in", values, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendBetween(String value1, String value2) {
            addCriterion("IS_APPEND between", value1, value2, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotBetween(String value1, String value2) {
            addCriterion("IS_APPEND not between", value1, value2, "isAppend");
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