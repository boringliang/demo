package com.example.demo.po.LRX;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PIS_INFO_DETAILSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PIS_INFO_DETAILSExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("AREAID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AREAID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("AREAID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("AREAID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("AREAID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("AREAID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("AREAID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("AREAID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("AREAID like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("AREAID not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("AREAID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("AREAID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("AREAID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("AREAID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andInfoLocationIsNull() {
            addCriterion("INFO_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andInfoLocationIsNotNull() {
            addCriterion("INFO_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andInfoLocationEqualTo(String value) {
            addCriterion("INFO_LOCATION =", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationNotEqualTo(String value) {
            addCriterion("INFO_LOCATION <>", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationGreaterThan(String value) {
            addCriterion("INFO_LOCATION >", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_LOCATION >=", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationLessThan(String value) {
            addCriterion("INFO_LOCATION <", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationLessThanOrEqualTo(String value) {
            addCriterion("INFO_LOCATION <=", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationLike(String value) {
            addCriterion("INFO_LOCATION like", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationNotLike(String value) {
            addCriterion("INFO_LOCATION not like", value, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationIn(List<String> values) {
            addCriterion("INFO_LOCATION in", values, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationNotIn(List<String> values) {
            addCriterion("INFO_LOCATION not in", values, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationBetween(String value1, String value2) {
            addCriterion("INFO_LOCATION between", value1, value2, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andInfoLocationNotBetween(String value1, String value2) {
            addCriterion("INFO_LOCATION not between", value1, value2, "infoLocation");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateIsNull() {
            addCriterion("LOCATION_COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateIsNotNull() {
            addCriterion("LOCATION_COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateEqualTo(String value) {
            addCriterion("LOCATION_COORDINATE =", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateNotEqualTo(String value) {
            addCriterion("LOCATION_COORDINATE <>", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateGreaterThan(String value) {
            addCriterion("LOCATION_COORDINATE >", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_COORDINATE >=", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateLessThan(String value) {
            addCriterion("LOCATION_COORDINATE <", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_COORDINATE <=", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateLike(String value) {
            addCriterion("LOCATION_COORDINATE like", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateNotLike(String value) {
            addCriterion("LOCATION_COORDINATE not like", value, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateIn(List<String> values) {
            addCriterion("LOCATION_COORDINATE in", values, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateNotIn(List<String> values) {
            addCriterion("LOCATION_COORDINATE not in", values, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateBetween(String value1, String value2) {
            addCriterion("LOCATION_COORDINATE between", value1, value2, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andLocationCoordinateNotBetween(String value1, String value2) {
            addCriterion("LOCATION_COORDINATE not between", value1, value2, "locationCoordinate");
            return (Criteria) this;
        }

        public Criteria andReporterNameIsNull() {
            addCriterion("REPORTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReporterNameIsNotNull() {
            addCriterion("REPORTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReporterNameEqualTo(String value) {
            addCriterion("REPORTER_NAME =", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameNotEqualTo(String value) {
            addCriterion("REPORTER_NAME <>", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameGreaterThan(String value) {
            addCriterion("REPORTER_NAME >", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTER_NAME >=", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameLessThan(String value) {
            addCriterion("REPORTER_NAME <", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameLessThanOrEqualTo(String value) {
            addCriterion("REPORTER_NAME <=", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameLike(String value) {
            addCriterion("REPORTER_NAME like", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameNotLike(String value) {
            addCriterion("REPORTER_NAME not like", value, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameIn(List<String> values) {
            addCriterion("REPORTER_NAME in", values, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameNotIn(List<String> values) {
            addCriterion("REPORTER_NAME not in", values, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameBetween(String value1, String value2) {
            addCriterion("REPORTER_NAME between", value1, value2, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterNameNotBetween(String value1, String value2) {
            addCriterion("REPORTER_NAME not between", value1, value2, "reporterName");
            return (Criteria) this;
        }

        public Criteria andReporterSexIsNull() {
            addCriterion("REPORTER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andReporterSexIsNotNull() {
            addCriterion("REPORTER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andReporterSexEqualTo(String value) {
            addCriterion("REPORTER_SEX =", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexNotEqualTo(String value) {
            addCriterion("REPORTER_SEX <>", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexGreaterThan(String value) {
            addCriterion("REPORTER_SEX >", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTER_SEX >=", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexLessThan(String value) {
            addCriterion("REPORTER_SEX <", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexLessThanOrEqualTo(String value) {
            addCriterion("REPORTER_SEX <=", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexLike(String value) {
            addCriterion("REPORTER_SEX like", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexNotLike(String value) {
            addCriterion("REPORTER_SEX not like", value, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexIn(List<String> values) {
            addCriterion("REPORTER_SEX in", values, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexNotIn(List<String> values) {
            addCriterion("REPORTER_SEX not in", values, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexBetween(String value1, String value2) {
            addCriterion("REPORTER_SEX between", value1, value2, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterSexNotBetween(String value1, String value2) {
            addCriterion("REPORTER_SEX not between", value1, value2, "reporterSex");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneIsNull() {
            addCriterion("REPORTER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneIsNotNull() {
            addCriterion("REPORTER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneEqualTo(String value) {
            addCriterion("REPORTER_PHONE =", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotEqualTo(String value) {
            addCriterion("REPORTER_PHONE <>", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneGreaterThan(String value) {
            addCriterion("REPORTER_PHONE >", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTER_PHONE >=", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneLessThan(String value) {
            addCriterion("REPORTER_PHONE <", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneLessThanOrEqualTo(String value) {
            addCriterion("REPORTER_PHONE <=", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneLike(String value) {
            addCriterion("REPORTER_PHONE like", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotLike(String value) {
            addCriterion("REPORTER_PHONE not like", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneIn(List<String> values) {
            addCriterion("REPORTER_PHONE in", values, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotIn(List<String> values) {
            addCriterion("REPORTER_PHONE not in", values, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneBetween(String value1, String value2) {
            addCriterion("REPORTER_PHONE between", value1, value2, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotBetween(String value1, String value2) {
            addCriterion("REPORTER_PHONE not between", value1, value2, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andWoundedNumIsNull() {
            addCriterion("WOUNDED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andWoundedNumIsNotNull() {
            addCriterion("WOUNDED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andWoundedNumEqualTo(BigDecimal value) {
            addCriterion("WOUNDED_NUM =", value, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumNotEqualTo(BigDecimal value) {
            addCriterion("WOUNDED_NUM <>", value, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumGreaterThan(BigDecimal value) {
            addCriterion("WOUNDED_NUM >", value, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WOUNDED_NUM >=", value, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumLessThan(BigDecimal value) {
            addCriterion("WOUNDED_NUM <", value, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WOUNDED_NUM <=", value, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumIn(List<BigDecimal> values) {
            addCriterion("WOUNDED_NUM in", values, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumNotIn(List<BigDecimal> values) {
            addCriterion("WOUNDED_NUM not in", values, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WOUNDED_NUM between", value1, value2, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andWoundedNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WOUNDED_NUM not between", value1, value2, "woundedNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumIsNull() {
            addCriterion("DEATH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDeathNumIsNotNull() {
            addCriterion("DEATH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDeathNumEqualTo(BigDecimal value) {
            addCriterion("DEATH_NUM =", value, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumNotEqualTo(BigDecimal value) {
            addCriterion("DEATH_NUM <>", value, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumGreaterThan(BigDecimal value) {
            addCriterion("DEATH_NUM >", value, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEATH_NUM >=", value, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumLessThan(BigDecimal value) {
            addCriterion("DEATH_NUM <", value, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEATH_NUM <=", value, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumIn(List<BigDecimal> values) {
            addCriterion("DEATH_NUM in", values, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumNotIn(List<BigDecimal> values) {
            addCriterion("DEATH_NUM not in", values, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEATH_NUM between", value1, value2, "deathNum");
            return (Criteria) this;
        }

        public Criteria andDeathNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEATH_NUM not between", value1, value2, "deathNum");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeIsNull() {
            addCriterion("ACCIDENT_SHAPE is null");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeIsNotNull() {
            addCriterion("ACCIDENT_SHAPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeEqualTo(String value) {
            addCriterion("ACCIDENT_SHAPE =", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeNotEqualTo(String value) {
            addCriterion("ACCIDENT_SHAPE <>", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeGreaterThan(String value) {
            addCriterion("ACCIDENT_SHAPE >", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCIDENT_SHAPE >=", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeLessThan(String value) {
            addCriterion("ACCIDENT_SHAPE <", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeLessThanOrEqualTo(String value) {
            addCriterion("ACCIDENT_SHAPE <=", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeLike(String value) {
            addCriterion("ACCIDENT_SHAPE like", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeNotLike(String value) {
            addCriterion("ACCIDENT_SHAPE not like", value, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeIn(List<String> values) {
            addCriterion("ACCIDENT_SHAPE in", values, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeNotIn(List<String> values) {
            addCriterion("ACCIDENT_SHAPE not in", values, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeBetween(String value1, String value2) {
            addCriterion("ACCIDENT_SHAPE between", value1, value2, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andAccidentShapeNotBetween(String value1, String value2) {
            addCriterion("ACCIDENT_SHAPE not between", value1, value2, "accidentShape");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptIsNull() {
            addCriterion("ENTRUST_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptIsNotNull() {
            addCriterion("ENTRUST_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptEqualTo(String value) {
            addCriterion("ENTRUST_DEPT =", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptNotEqualTo(String value) {
            addCriterion("ENTRUST_DEPT <>", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptGreaterThan(String value) {
            addCriterion("ENTRUST_DEPT >", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRUST_DEPT >=", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptLessThan(String value) {
            addCriterion("ENTRUST_DEPT <", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptLessThanOrEqualTo(String value) {
            addCriterion("ENTRUST_DEPT <=", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptLike(String value) {
            addCriterion("ENTRUST_DEPT like", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptNotLike(String value) {
            addCriterion("ENTRUST_DEPT not like", value, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptIn(List<String> values) {
            addCriterion("ENTRUST_DEPT in", values, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptNotIn(List<String> values) {
            addCriterion("ENTRUST_DEPT not in", values, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptBetween(String value1, String value2) {
            addCriterion("ENTRUST_DEPT between", value1, value2, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustDeptNotBetween(String value1, String value2) {
            addCriterion("ENTRUST_DEPT not between", value1, value2, "entrustDept");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonIsNull() {
            addCriterion("ENTRUST_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonIsNotNull() {
            addCriterion("ENTRUST_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonEqualTo(String value) {
            addCriterion("ENTRUST_PERSON =", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonNotEqualTo(String value) {
            addCriterion("ENTRUST_PERSON <>", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonGreaterThan(String value) {
            addCriterion("ENTRUST_PERSON >", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRUST_PERSON >=", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonLessThan(String value) {
            addCriterion("ENTRUST_PERSON <", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonLessThanOrEqualTo(String value) {
            addCriterion("ENTRUST_PERSON <=", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonLike(String value) {
            addCriterion("ENTRUST_PERSON like", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonNotLike(String value) {
            addCriterion("ENTRUST_PERSON not like", value, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonIn(List<String> values) {
            addCriterion("ENTRUST_PERSON in", values, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonNotIn(List<String> values) {
            addCriterion("ENTRUST_PERSON not in", values, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonBetween(String value1, String value2) {
            addCriterion("ENTRUST_PERSON between", value1, value2, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPersonNotBetween(String value1, String value2) {
            addCriterion("ENTRUST_PERSON not between", value1, value2, "entrustPerson");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneIsNull() {
            addCriterion("ENTRUST_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneIsNotNull() {
            addCriterion("ENTRUST_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneEqualTo(String value) {
            addCriterion("ENTRUST_PHONE =", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneNotEqualTo(String value) {
            addCriterion("ENTRUST_PHONE <>", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneGreaterThan(String value) {
            addCriterion("ENTRUST_PHONE >", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRUST_PHONE >=", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneLessThan(String value) {
            addCriterion("ENTRUST_PHONE <", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneLessThanOrEqualTo(String value) {
            addCriterion("ENTRUST_PHONE <=", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneLike(String value) {
            addCriterion("ENTRUST_PHONE like", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneNotLike(String value) {
            addCriterion("ENTRUST_PHONE not like", value, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneIn(List<String> values) {
            addCriterion("ENTRUST_PHONE in", values, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneNotIn(List<String> values) {
            addCriterion("ENTRUST_PHONE not in", values, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneBetween(String value1, String value2) {
            addCriterion("ENTRUST_PHONE between", value1, value2, "entrustPhone");
            return (Criteria) this;
        }

        public Criteria andEntrustPhoneNotBetween(String value1, String value2) {
            addCriterion("ENTRUST_PHONE not between", value1, value2, "entrustPhone");
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