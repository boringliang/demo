package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PIS_INFO_BASEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PIS_INFO_BASEExample() {
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

        public Criteria andInfoChannelIsNull() {
            addCriterion("INFO_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andInfoChannelIsNotNull() {
            addCriterion("INFO_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andInfoChannelEqualTo(String value) {
            addCriterion("INFO_CHANNEL =", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelNotEqualTo(String value) {
            addCriterion("INFO_CHANNEL <>", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelGreaterThan(String value) {
            addCriterion("INFO_CHANNEL >", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_CHANNEL >=", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelLessThan(String value) {
            addCriterion("INFO_CHANNEL <", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelLessThanOrEqualTo(String value) {
            addCriterion("INFO_CHANNEL <=", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelLike(String value) {
            addCriterion("INFO_CHANNEL like", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelNotLike(String value) {
            addCriterion("INFO_CHANNEL not like", value, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelIn(List<String> values) {
            addCriterion("INFO_CHANNEL in", values, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelNotIn(List<String> values) {
            addCriterion("INFO_CHANNEL not in", values, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelBetween(String value1, String value2) {
            addCriterion("INFO_CHANNEL between", value1, value2, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoChannelNotBetween(String value1, String value2) {
            addCriterion("INFO_CHANNEL not between", value1, value2, "infoChannel");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNull() {
            addCriterion("INFO_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNotNull() {
            addCriterion("INFO_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceEqualTo(String value) {
            addCriterion("INFO_SOURCE =", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotEqualTo(String value) {
            addCriterion("INFO_SOURCE <>", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThan(String value) {
            addCriterion("INFO_SOURCE >", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE >=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThan(String value) {
            addCriterion("INFO_SOURCE <", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThanOrEqualTo(String value) {
            addCriterion("INFO_SOURCE <=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLike(String value) {
            addCriterion("INFO_SOURCE like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotLike(String value) {
            addCriterion("INFO_SOURCE not like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIn(List<String> values) {
            addCriterion("INFO_SOURCE in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotIn(List<String> values) {
            addCriterion("INFO_SOURCE not in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotBetween(String value1, String value2) {
            addCriterion("INFO_SOURCE not between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureIsNull() {
            addCriterion("INFO_FEATURE is null");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureIsNotNull() {
            addCriterion("INFO_FEATURE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureEqualTo(String value) {
            addCriterion("INFO_FEATURE =", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureNotEqualTo(String value) {
            addCriterion("INFO_FEATURE <>", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureGreaterThan(String value) {
            addCriterion("INFO_FEATURE >", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_FEATURE >=", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureLessThan(String value) {
            addCriterion("INFO_FEATURE <", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureLessThanOrEqualTo(String value) {
            addCriterion("INFO_FEATURE <=", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureLike(String value) {
            addCriterion("INFO_FEATURE like", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureNotLike(String value) {
            addCriterion("INFO_FEATURE not like", value, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureIn(List<String> values) {
            addCriterion("INFO_FEATURE in", values, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureNotIn(List<String> values) {
            addCriterion("INFO_FEATURE not in", values, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureBetween(String value1, String value2) {
            addCriterion("INFO_FEATURE between", value1, value2, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoFeatureNotBetween(String value1, String value2) {
            addCriterion("INFO_FEATURE not between", value1, value2, "infoFeature");
            return (Criteria) this;
        }

        public Criteria andInfoLevelIsNull() {
            addCriterion("INFO_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andInfoLevelIsNotNull() {
            addCriterion("INFO_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andInfoLevelEqualTo(String value) {
            addCriterion("INFO_LEVEL =", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelNotEqualTo(String value) {
            addCriterion("INFO_LEVEL <>", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelGreaterThan(String value) {
            addCriterion("INFO_LEVEL >", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_LEVEL >=", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelLessThan(String value) {
            addCriterion("INFO_LEVEL <", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelLessThanOrEqualTo(String value) {
            addCriterion("INFO_LEVEL <=", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelLike(String value) {
            addCriterion("INFO_LEVEL like", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelNotLike(String value) {
            addCriterion("INFO_LEVEL not like", value, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelIn(List<String> values) {
            addCriterion("INFO_LEVEL in", values, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelNotIn(List<String> values) {
            addCriterion("INFO_LEVEL not in", values, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelBetween(String value1, String value2) {
            addCriterion("INFO_LEVEL between", value1, value2, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoLevelNotBetween(String value1, String value2) {
            addCriterion("INFO_LEVEL not between", value1, value2, "infoLevel");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNull() {
            addCriterion("INFO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNotNull() {
            addCriterion("INFO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeEqualTo(String value) {
            addCriterion("INFO_TYPE =", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotEqualTo(String value) {
            addCriterion("INFO_TYPE <>", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThan(String value) {
            addCriterion("INFO_TYPE >", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_TYPE >=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThan(String value) {
            addCriterion("INFO_TYPE <", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThanOrEqualTo(String value) {
            addCriterion("INFO_TYPE <=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLike(String value) {
            addCriterion("INFO_TYPE like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotLike(String value) {
            addCriterion("INFO_TYPE not like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIn(List<String> values) {
            addCriterion("INFO_TYPE in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotIn(List<String> values) {
            addCriterion("INFO_TYPE not in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeBetween(String value1, String value2) {
            addCriterion("INFO_TYPE between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotBetween(String value1, String value2) {
            addCriterion("INFO_TYPE not between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeIsNull() {
            addCriterion("INFO_SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeIsNotNull() {
            addCriterion("INFO_SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeEqualTo(String value) {
            addCriterion("INFO_SUBTYPE =", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeNotEqualTo(String value) {
            addCriterion("INFO_SUBTYPE <>", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeGreaterThan(String value) {
            addCriterion("INFO_SUBTYPE >", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_SUBTYPE >=", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeLessThan(String value) {
            addCriterion("INFO_SUBTYPE <", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeLessThanOrEqualTo(String value) {
            addCriterion("INFO_SUBTYPE <=", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeLike(String value) {
            addCriterion("INFO_SUBTYPE like", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeNotLike(String value) {
            addCriterion("INFO_SUBTYPE not like", value, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeIn(List<String> values) {
            addCriterion("INFO_SUBTYPE in", values, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeNotIn(List<String> values) {
            addCriterion("INFO_SUBTYPE not in", values, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeBetween(String value1, String value2) {
            addCriterion("INFO_SUBTYPE between", value1, value2, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoSubtypeNotBetween(String value1, String value2) {
            addCriterion("INFO_SUBTYPE not between", value1, value2, "infoSubtype");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIsNull() {
            addCriterion("INFO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIsNotNull() {
            addCriterion("INFO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTimeEqualTo(Date value) {
            addCriterion("INFO_TIME =", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotEqualTo(Date value) {
            addCriterion("INFO_TIME <>", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeGreaterThan(Date value) {
            addCriterion("INFO_TIME >", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INFO_TIME >=", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeLessThan(Date value) {
            addCriterion("INFO_TIME <", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("INFO_TIME <=", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIn(List<Date> values) {
            addCriterion("INFO_TIME in", values, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotIn(List<Date> values) {
            addCriterion("INFO_TIME not in", values, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeBetween(Date value1, Date value2) {
            addCriterion("INFO_TIME between", value1, value2, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("INFO_TIME not between", value1, value2, "infoTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andInfoStageIsNull() {
            addCriterion("INFO_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andInfoStageIsNotNull() {
            addCriterion("INFO_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoStageEqualTo(String value) {
            addCriterion("INFO_STAGE =", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageNotEqualTo(String value) {
            addCriterion("INFO_STAGE <>", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageGreaterThan(String value) {
            addCriterion("INFO_STAGE >", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_STAGE >=", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageLessThan(String value) {
            addCriterion("INFO_STAGE <", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageLessThanOrEqualTo(String value) {
            addCriterion("INFO_STAGE <=", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageLike(String value) {
            addCriterion("INFO_STAGE like", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageNotLike(String value) {
            addCriterion("INFO_STAGE not like", value, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageIn(List<String> values) {
            addCriterion("INFO_STAGE in", values, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageNotIn(List<String> values) {
            addCriterion("INFO_STAGE not in", values, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageBetween(String value1, String value2) {
            addCriterion("INFO_STAGE between", value1, value2, "infoStage");
            return (Criteria) this;
        }

        public Criteria andInfoStageNotBetween(String value1, String value2) {
            addCriterion("INFO_STAGE not between", value1, value2, "infoStage");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNull() {
            addCriterion("DISPATCH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNotNull() {
            addCriterion("DISPATCH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeEqualTo(Date value) {
            addCriterion("DISPATCH_TIME =", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotEqualTo(Date value) {
            addCriterion("DISPATCH_TIME <>", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThan(Date value) {
            addCriterion("DISPATCH_TIME >", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DISPATCH_TIME >=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThan(Date value) {
            addCriterion("DISPATCH_TIME <", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("DISPATCH_TIME <=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIn(List<Date> values) {
            addCriterion("DISPATCH_TIME in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotIn(List<Date> values) {
            addCriterion("DISPATCH_TIME not in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeBetween(Date value1, Date value2) {
            addCriterion("DISPATCH_TIME between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("DISPATCH_TIME not between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("SIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("SIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("SIGN_TIME =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("SIGN_TIME <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("SIGN_TIME >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGN_TIME >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("SIGN_TIME <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("SIGN_TIME <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("SIGN_TIME in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("SIGN_TIME not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("SIGN_TIME between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("SIGN_TIME not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeIsNull() {
            addCriterion("THIRDSYSCODE is null");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeIsNotNull() {
            addCriterion("THIRDSYSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeEqualTo(String value) {
            addCriterion("THIRDSYSCODE =", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeNotEqualTo(String value) {
            addCriterion("THIRDSYSCODE <>", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeGreaterThan(String value) {
            addCriterion("THIRDSYSCODE >", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeGreaterThanOrEqualTo(String value) {
            addCriterion("THIRDSYSCODE >=", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeLessThan(String value) {
            addCriterion("THIRDSYSCODE <", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeLessThanOrEqualTo(String value) {
            addCriterion("THIRDSYSCODE <=", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeLike(String value) {
            addCriterion("THIRDSYSCODE like", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeNotLike(String value) {
            addCriterion("THIRDSYSCODE not like", value, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeIn(List<String> values) {
            addCriterion("THIRDSYSCODE in", values, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeNotIn(List<String> values) {
            addCriterion("THIRDSYSCODE not in", values, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeBetween(String value1, String value2) {
            addCriterion("THIRDSYSCODE between", value1, value2, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andThirdsyscodeNotBetween(String value1, String value2) {
            addCriterion("THIRDSYSCODE not between", value1, value2, "thirdsyscode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeIsNull() {
            addCriterion("SIMHASHCODE is null");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeIsNotNull() {
            addCriterion("SIMHASHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeEqualTo(String value) {
            addCriterion("SIMHASHCODE =", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeNotEqualTo(String value) {
            addCriterion("SIMHASHCODE <>", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeGreaterThan(String value) {
            addCriterion("SIMHASHCODE >", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SIMHASHCODE >=", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeLessThan(String value) {
            addCriterion("SIMHASHCODE <", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeLessThanOrEqualTo(String value) {
            addCriterion("SIMHASHCODE <=", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeLike(String value) {
            addCriterion("SIMHASHCODE like", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeNotLike(String value) {
            addCriterion("SIMHASHCODE not like", value, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeIn(List<String> values) {
            addCriterion("SIMHASHCODE in", values, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeNotIn(List<String> values) {
            addCriterion("SIMHASHCODE not in", values, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeBetween(String value1, String value2) {
            addCriterion("SIMHASHCODE between", value1, value2, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andSimhashcodeNotBetween(String value1, String value2) {
            addCriterion("SIMHASHCODE not between", value1, value2, "simhashcode");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateIsNull() {
            addCriterion("INFO_COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateIsNotNull() {
            addCriterion("INFO_COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateEqualTo(String value) {
            addCriterion("INFO_COORDINATE =", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateNotEqualTo(String value) {
            addCriterion("INFO_COORDINATE <>", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateGreaterThan(String value) {
            addCriterion("INFO_COORDINATE >", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_COORDINATE >=", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateLessThan(String value) {
            addCriterion("INFO_COORDINATE <", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateLessThanOrEqualTo(String value) {
            addCriterion("INFO_COORDINATE <=", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateLike(String value) {
            addCriterion("INFO_COORDINATE like", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateNotLike(String value) {
            addCriterion("INFO_COORDINATE not like", value, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateIn(List<String> values) {
            addCriterion("INFO_COORDINATE in", values, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateNotIn(List<String> values) {
            addCriterion("INFO_COORDINATE not in", values, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateBetween(String value1, String value2) {
            addCriterion("INFO_COORDINATE between", value1, value2, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoCoordinateNotBetween(String value1, String value2) {
            addCriterion("INFO_COORDINATE not between", value1, value2, "infoCoordinate");
            return (Criteria) this;
        }

        public Criteria andInfoAddressIsNull() {
            addCriterion("INFO_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andInfoAddressIsNotNull() {
            addCriterion("INFO_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andInfoAddressEqualTo(Object value) {
            addCriterion("INFO_ADDRESS =", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressNotEqualTo(Object value) {
            addCriterion("INFO_ADDRESS <>", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressGreaterThan(Object value) {
            addCriterion("INFO_ADDRESS >", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressGreaterThanOrEqualTo(Object value) {
            addCriterion("INFO_ADDRESS >=", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressLessThan(Object value) {
            addCriterion("INFO_ADDRESS <", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressLessThanOrEqualTo(Object value) {
            addCriterion("INFO_ADDRESS <=", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressIn(List<Object> values) {
            addCriterion("INFO_ADDRESS in", values, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressNotIn(List<Object> values) {
            addCriterion("INFO_ADDRESS not in", values, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressBetween(Object value1, Object value2) {
            addCriterion("INFO_ADDRESS between", value1, value2, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressNotBetween(Object value1, Object value2) {
            addCriterion("INFO_ADDRESS not between", value1, value2, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("CONFIRM_TIME =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("CONFIRM_TIME >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("CONFIRM_TIME <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("CONFIRM_TIME in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("CONFIRM_TIME not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridIsNull() {
            addCriterion("CONFIRM_USERID is null");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridIsNotNull() {
            addCriterion("CONFIRM_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridEqualTo(String value) {
            addCriterion("CONFIRM_USERID =", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridNotEqualTo(String value) {
            addCriterion("CONFIRM_USERID <>", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridGreaterThan(String value) {
            addCriterion("CONFIRM_USERID >", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_USERID >=", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridLessThan(String value) {
            addCriterion("CONFIRM_USERID <", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_USERID <=", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridLike(String value) {
            addCriterion("CONFIRM_USERID like", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridNotLike(String value) {
            addCriterion("CONFIRM_USERID not like", value, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridIn(List<String> values) {
            addCriterion("CONFIRM_USERID in", values, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridNotIn(List<String> values) {
            addCriterion("CONFIRM_USERID not in", values, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridBetween(String value1, String value2) {
            addCriterion("CONFIRM_USERID between", value1, value2, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andConfirmUseridNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_USERID not between", value1, value2, "confirmUserid");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("CLOSE_TIME =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("CLOSE_TIME <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("CLOSE_TIME >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("CLOSE_TIME <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("CLOSE_TIME in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("CLOSE_TIME not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidIsNull() {
            addCriterion("INFO_DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidIsNotNull() {
            addCriterion("INFO_DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidEqualTo(String value) {
            addCriterion("INFO_DEPTID =", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidNotEqualTo(String value) {
            addCriterion("INFO_DEPTID <>", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidGreaterThan(String value) {
            addCriterion("INFO_DEPTID >", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_DEPTID >=", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidLessThan(String value) {
            addCriterion("INFO_DEPTID <", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidLessThanOrEqualTo(String value) {
            addCriterion("INFO_DEPTID <=", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidLike(String value) {
            addCriterion("INFO_DEPTID like", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidNotLike(String value) {
            addCriterion("INFO_DEPTID not like", value, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidIn(List<String> values) {
            addCriterion("INFO_DEPTID in", values, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidNotIn(List<String> values) {
            addCriterion("INFO_DEPTID not in", values, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidBetween(String value1, String value2) {
            addCriterion("INFO_DEPTID between", value1, value2, "infoDeptid");
            return (Criteria) this;
        }

        public Criteria andInfoDeptidNotBetween(String value1, String value2) {
            addCriterion("INFO_DEPTID not between", value1, value2, "infoDeptid");
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