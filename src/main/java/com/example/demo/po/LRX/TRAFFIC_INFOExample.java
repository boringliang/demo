package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.List;

public class TRAFFIC_INFOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRAFFIC_INFOExample() {
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

        public Criteria andIdEqualTo(Object value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Object value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Object value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Object value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Object value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Object value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Object> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Object> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Object value1, Object value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Object value1, Object value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Object value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Object value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Object value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Object value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Object value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Object value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Object> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Object> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Object value1, Object value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Object value1, Object value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(Object value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(Object value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(Object value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(Object value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(Object value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(Object value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<Object> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<Object> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(Object value1, Object value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(Object value1, Object value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("CREATEID is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("CREATEID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Object value) {
            addCriterion("CREATEID =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Object value) {
            addCriterion("CREATEID <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Object value) {
            addCriterion("CREATEID >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATEID >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Object value) {
            addCriterion("CREATEID <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Object value) {
            addCriterion("CREATEID <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Object> values) {
            addCriterion("CREATEID in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Object> values) {
            addCriterion("CREATEID not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Object value1, Object value2) {
            addCriterion("CREATEID between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Object value1, Object value2) {
            addCriterion("CREATEID not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Object value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Object value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Object value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Object value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Object value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Object> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Object> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Object value1, Object value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Object value1, Object value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNull() {
            addCriterion("UPDATEID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("UPDATEID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(Object value) {
            addCriterion("UPDATEID =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(Object value) {
            addCriterion("UPDATEID <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(Object value) {
            addCriterion("UPDATEID >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(Object value) {
            addCriterion("UPDATEID >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(Object value) {
            addCriterion("UPDATEID <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(Object value) {
            addCriterion("UPDATEID <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<Object> values) {
            addCriterion("UPDATEID in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<Object> values) {
            addCriterion("UPDATEID not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(Object value1, Object value2) {
            addCriterion("UPDATEID between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(Object value1, Object value2) {
            addCriterion("UPDATEID not between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Object value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Object value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Object value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Object value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Object value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Object value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Object> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Object> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Object value1, Object value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Object value1, Object value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(Object value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(Object value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(Object value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(Object value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(Object value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(Object value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<Object> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<Object> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(Object value1, Object value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(Object value1, Object value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIsNull() {
            addCriterion("COORDINATES is null");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIsNotNull() {
            addCriterion("COORDINATES is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinatesEqualTo(Object value) {
            addCriterion("COORDINATES =", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotEqualTo(Object value) {
            addCriterion("COORDINATES <>", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesGreaterThan(Object value) {
            addCriterion("COORDINATES >", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesGreaterThanOrEqualTo(Object value) {
            addCriterion("COORDINATES >=", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLessThan(Object value) {
            addCriterion("COORDINATES <", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLessThanOrEqualTo(Object value) {
            addCriterion("COORDINATES <=", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIn(List<Object> values) {
            addCriterion("COORDINATES in", values, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotIn(List<Object> values) {
            addCriterion("COORDINATES not in", values, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesBetween(Object value1, Object value2) {
            addCriterion("COORDINATES between", value1, value2, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotBetween(Object value1, Object value2) {
            addCriterion("COORDINATES not between", value1, value2, "coordinates");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Object value) {
            addCriterion("DIRECTION =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Object value) {
            addCriterion("DIRECTION <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Object value) {
            addCriterion("DIRECTION >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Object value) {
            addCriterion("DIRECTION >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Object value) {
            addCriterion("DIRECTION <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Object value) {
            addCriterion("DIRECTION <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Object> values) {
            addCriterion("DIRECTION in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Object> values) {
            addCriterion("DIRECTION not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Object value1, Object value2) {
            addCriterion("DIRECTION between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Object value1, Object value2) {
            addCriterion("DIRECTION not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDadeptIsNull() {
            addCriterion("DADEPT is null");
            return (Criteria) this;
        }

        public Criteria andDadeptIsNotNull() {
            addCriterion("DADEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDadeptEqualTo(Object value) {
            addCriterion("DADEPT =", value, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptNotEqualTo(Object value) {
            addCriterion("DADEPT <>", value, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptGreaterThan(Object value) {
            addCriterion("DADEPT >", value, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptGreaterThanOrEqualTo(Object value) {
            addCriterion("DADEPT >=", value, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptLessThan(Object value) {
            addCriterion("DADEPT <", value, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptLessThanOrEqualTo(Object value) {
            addCriterion("DADEPT <=", value, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptIn(List<Object> values) {
            addCriterion("DADEPT in", values, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptNotIn(List<Object> values) {
            addCriterion("DADEPT not in", values, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptBetween(Object value1, Object value2) {
            addCriterion("DADEPT between", value1, value2, "dadept");
            return (Criteria) this;
        }

        public Criteria andDadeptNotBetween(Object value1, Object value2) {
            addCriterion("DADEPT not between", value1, value2, "dadept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptIsNull() {
            addCriterion("ZHONGDEPT is null");
            return (Criteria) this;
        }

        public Criteria andZhongdeptIsNotNull() {
            addCriterion("ZHONGDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andZhongdeptEqualTo(Object value) {
            addCriterion("ZHONGDEPT =", value, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptNotEqualTo(Object value) {
            addCriterion("ZHONGDEPT <>", value, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptGreaterThan(Object value) {
            addCriterion("ZHONGDEPT >", value, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHONGDEPT >=", value, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptLessThan(Object value) {
            addCriterion("ZHONGDEPT <", value, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptLessThanOrEqualTo(Object value) {
            addCriterion("ZHONGDEPT <=", value, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptIn(List<Object> values) {
            addCriterion("ZHONGDEPT in", values, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptNotIn(List<Object> values) {
            addCriterion("ZHONGDEPT not in", values, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptBetween(Object value1, Object value2) {
            addCriterion("ZHONGDEPT between", value1, value2, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andZhongdeptNotBetween(Object value1, Object value2) {
            addCriterion("ZHONGDEPT not between", value1, value2, "zhongdept");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("AUDITOR is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("AUDITOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(Object value) {
            addCriterion("AUDITOR =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(Object value) {
            addCriterion("AUDITOR <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(Object value) {
            addCriterion("AUDITOR >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(Object value) {
            addCriterion("AUDITOR >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(Object value) {
            addCriterion("AUDITOR <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(Object value) {
            addCriterion("AUDITOR <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<Object> values) {
            addCriterion("AUDITOR in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<Object> values) {
            addCriterion("AUDITOR not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(Object value1, Object value2) {
            addCriterion("AUDITOR between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(Object value1, Object value2) {
            addCriterion("AUDITOR not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("AUDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("AUDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Object value) {
            addCriterion("AUDIT_TIME =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Object value) {
            addCriterion("AUDIT_TIME <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Object value) {
            addCriterion("AUDIT_TIME >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Object value) {
            addCriterion("AUDIT_TIME >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Object value) {
            addCriterion("AUDIT_TIME <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Object value) {
            addCriterion("AUDIT_TIME <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Object> values) {
            addCriterion("AUDIT_TIME in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Object> values) {
            addCriterion("AUDIT_TIME not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Object value1, Object value2) {
            addCriterion("AUDIT_TIME between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Object value1, Object value2) {
            addCriterion("AUDIT_TIME not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionIsNull() {
            addCriterion("AUDIT_SUGGESTION is null");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionIsNotNull() {
            addCriterion("AUDIT_SUGGESTION is not null");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionEqualTo(Object value) {
            addCriterion("AUDIT_SUGGESTION =", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionNotEqualTo(Object value) {
            addCriterion("AUDIT_SUGGESTION <>", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionGreaterThan(Object value) {
            addCriterion("AUDIT_SUGGESTION >", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionGreaterThanOrEqualTo(Object value) {
            addCriterion("AUDIT_SUGGESTION >=", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionLessThan(Object value) {
            addCriterion("AUDIT_SUGGESTION <", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionLessThanOrEqualTo(Object value) {
            addCriterion("AUDIT_SUGGESTION <=", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionIn(List<Object> values) {
            addCriterion("AUDIT_SUGGESTION in", values, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionNotIn(List<Object> values) {
            addCriterion("AUDIT_SUGGESTION not in", values, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionBetween(Object value1, Object value2) {
            addCriterion("AUDIT_SUGGESTION between", value1, value2, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionNotBetween(Object value1, Object value2) {
            addCriterion("AUDIT_SUGGESTION not between", value1, value2, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Object value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Object value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Object value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Object value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Object value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Object value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Object> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Object> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Object value1, Object value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Object value1, Object value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Object value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Object value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Object value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Object value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Object value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Object> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Object> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Object value1, Object value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Object value1, Object value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDldmIsNull() {
            addCriterion("DLDM is null");
            return (Criteria) this;
        }

        public Criteria andDldmIsNotNull() {
            addCriterion("DLDM is not null");
            return (Criteria) this;
        }

        public Criteria andDldmEqualTo(Object value) {
            addCriterion("DLDM =", value, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmNotEqualTo(Object value) {
            addCriterion("DLDM <>", value, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmGreaterThan(Object value) {
            addCriterion("DLDM >", value, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmGreaterThanOrEqualTo(Object value) {
            addCriterion("DLDM >=", value, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmLessThan(Object value) {
            addCriterion("DLDM <", value, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmLessThanOrEqualTo(Object value) {
            addCriterion("DLDM <=", value, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmIn(List<Object> values) {
            addCriterion("DLDM in", values, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmNotIn(List<Object> values) {
            addCriterion("DLDM not in", values, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmBetween(Object value1, Object value2) {
            addCriterion("DLDM between", value1, value2, "dldm");
            return (Criteria) this;
        }

        public Criteria andDldmNotBetween(Object value1, Object value2) {
            addCriterion("DLDM not between", value1, value2, "dldm");
            return (Criteria) this;
        }

        public Criteria andStartpointIsNull() {
            addCriterion("STARTPOINT is null");
            return (Criteria) this;
        }

        public Criteria andStartpointIsNotNull() {
            addCriterion("STARTPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andStartpointEqualTo(Object value) {
            addCriterion("STARTPOINT =", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotEqualTo(Object value) {
            addCriterion("STARTPOINT <>", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointGreaterThan(Object value) {
            addCriterion("STARTPOINT >", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointGreaterThanOrEqualTo(Object value) {
            addCriterion("STARTPOINT >=", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLessThan(Object value) {
            addCriterion("STARTPOINT <", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLessThanOrEqualTo(Object value) {
            addCriterion("STARTPOINT <=", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointIn(List<Object> values) {
            addCriterion("STARTPOINT in", values, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotIn(List<Object> values) {
            addCriterion("STARTPOINT not in", values, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointBetween(Object value1, Object value2) {
            addCriterion("STARTPOINT between", value1, value2, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotBetween(Object value1, Object value2) {
            addCriterion("STARTPOINT not between", value1, value2, "startpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNull() {
            addCriterion("ENDPOINT is null");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNotNull() {
            addCriterion("ENDPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andEndpointEqualTo(Object value) {
            addCriterion("ENDPOINT =", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotEqualTo(Object value) {
            addCriterion("ENDPOINT <>", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThan(Object value) {
            addCriterion("ENDPOINT >", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThanOrEqualTo(Object value) {
            addCriterion("ENDPOINT >=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThan(Object value) {
            addCriterion("ENDPOINT <", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThanOrEqualTo(Object value) {
            addCriterion("ENDPOINT <=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIn(List<Object> values) {
            addCriterion("ENDPOINT in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotIn(List<Object> values) {
            addCriterion("ENDPOINT not in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointBetween(Object value1, Object value2) {
            addCriterion("ENDPOINT between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotBetween(Object value1, Object value2) {
            addCriterion("ENDPOINT not between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andLancountIsNull() {
            addCriterion("LANCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLancountIsNotNull() {
            addCriterion("LANCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLancountEqualTo(Object value) {
            addCriterion("LANCOUNT =", value, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountNotEqualTo(Object value) {
            addCriterion("LANCOUNT <>", value, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountGreaterThan(Object value) {
            addCriterion("LANCOUNT >", value, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountGreaterThanOrEqualTo(Object value) {
            addCriterion("LANCOUNT >=", value, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountLessThan(Object value) {
            addCriterion("LANCOUNT <", value, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountLessThanOrEqualTo(Object value) {
            addCriterion("LANCOUNT <=", value, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountIn(List<Object> values) {
            addCriterion("LANCOUNT in", values, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountNotIn(List<Object> values) {
            addCriterion("LANCOUNT not in", values, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountBetween(Object value1, Object value2) {
            addCriterion("LANCOUNT between", value1, value2, "lancount");
            return (Criteria) this;
        }

        public Criteria andLancountNotBetween(Object value1, Object value2) {
            addCriterion("LANCOUNT not between", value1, value2, "lancount");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Object value) {
            addCriterion("LENGTH =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Object value) {
            addCriterion("LENGTH <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Object value) {
            addCriterion("LENGTH >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Object value) {
            addCriterion("LENGTH >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Object value) {
            addCriterion("LENGTH <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Object value) {
            addCriterion("LENGTH <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Object> values) {
            addCriterion("LENGTH in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Object> values) {
            addCriterion("LENGTH not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Object value1, Object value2) {
            addCriterion("LENGTH between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Object value1, Object value2) {
            addCriterion("LENGTH not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLightflagIsNull() {
            addCriterion("LIGHTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andLightflagIsNotNull() {
            addCriterion("LIGHTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLightflagEqualTo(Object value) {
            addCriterion("LIGHTFLAG =", value, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagNotEqualTo(Object value) {
            addCriterion("LIGHTFLAG <>", value, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagGreaterThan(Object value) {
            addCriterion("LIGHTFLAG >", value, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagGreaterThanOrEqualTo(Object value) {
            addCriterion("LIGHTFLAG >=", value, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagLessThan(Object value) {
            addCriterion("LIGHTFLAG <", value, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagLessThanOrEqualTo(Object value) {
            addCriterion("LIGHTFLAG <=", value, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagIn(List<Object> values) {
            addCriterion("LIGHTFLAG in", values, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagNotIn(List<Object> values) {
            addCriterion("LIGHTFLAG not in", values, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagBetween(Object value1, Object value2) {
            addCriterion("LIGHTFLAG between", value1, value2, "lightflag");
            return (Criteria) this;
        }

        public Criteria andLightflagNotBetween(Object value1, Object value2) {
            addCriterion("LIGHTFLAG not between", value1, value2, "lightflag");
            return (Criteria) this;
        }

        public Criteria andPic1IsNull() {
            addCriterion("PIC1 is null");
            return (Criteria) this;
        }

        public Criteria andPic1IsNotNull() {
            addCriterion("PIC1 is not null");
            return (Criteria) this;
        }

        public Criteria andPic1EqualTo(Object value) {
            addCriterion("PIC1 =", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotEqualTo(Object value) {
            addCriterion("PIC1 <>", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThan(Object value) {
            addCriterion("PIC1 >", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThanOrEqualTo(Object value) {
            addCriterion("PIC1 >=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThan(Object value) {
            addCriterion("PIC1 <", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThanOrEqualTo(Object value) {
            addCriterion("PIC1 <=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1In(List<Object> values) {
            addCriterion("PIC1 in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotIn(List<Object> values) {
            addCriterion("PIC1 not in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Between(Object value1, Object value2) {
            addCriterion("PIC1 between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotBetween(Object value1, Object value2) {
            addCriterion("PIC1 not between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic2IsNull() {
            addCriterion("PIC2 is null");
            return (Criteria) this;
        }

        public Criteria andPic2IsNotNull() {
            addCriterion("PIC2 is not null");
            return (Criteria) this;
        }

        public Criteria andPic2EqualTo(Object value) {
            addCriterion("PIC2 =", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotEqualTo(Object value) {
            addCriterion("PIC2 <>", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThan(Object value) {
            addCriterion("PIC2 >", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThanOrEqualTo(Object value) {
            addCriterion("PIC2 >=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThan(Object value) {
            addCriterion("PIC2 <", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThanOrEqualTo(Object value) {
            addCriterion("PIC2 <=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2In(List<Object> values) {
            addCriterion("PIC2 in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotIn(List<Object> values) {
            addCriterion("PIC2 not in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Between(Object value1, Object value2) {
            addCriterion("PIC2 between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotBetween(Object value1, Object value2) {
            addCriterion("PIC2 not between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andGsglIsNull() {
            addCriterion("GSGL is null");
            return (Criteria) this;
        }

        public Criteria andGsglIsNotNull() {
            addCriterion("GSGL is not null");
            return (Criteria) this;
        }

        public Criteria andGsglEqualTo(Object value) {
            addCriterion("GSGL =", value, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglNotEqualTo(Object value) {
            addCriterion("GSGL <>", value, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglGreaterThan(Object value) {
            addCriterion("GSGL >", value, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglGreaterThanOrEqualTo(Object value) {
            addCriterion("GSGL >=", value, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglLessThan(Object value) {
            addCriterion("GSGL <", value, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglLessThanOrEqualTo(Object value) {
            addCriterion("GSGL <=", value, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglIn(List<Object> values) {
            addCriterion("GSGL in", values, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglNotIn(List<Object> values) {
            addCriterion("GSGL not in", values, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglBetween(Object value1, Object value2) {
            addCriterion("GSGL between", value1, value2, "gsgl");
            return (Criteria) this;
        }

        public Criteria andGsglNotBetween(Object value1, Object value2) {
            addCriterion("GSGL not between", value1, value2, "gsgl");
            return (Criteria) this;
        }

        public Criteria andServicelevelIsNull() {
            addCriterion("SERVICELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andServicelevelIsNotNull() {
            addCriterion("SERVICELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andServicelevelEqualTo(Object value) {
            addCriterion("SERVICELEVEL =", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelNotEqualTo(Object value) {
            addCriterion("SERVICELEVEL <>", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelGreaterThan(Object value) {
            addCriterion("SERVICELEVEL >", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelGreaterThanOrEqualTo(Object value) {
            addCriterion("SERVICELEVEL >=", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelLessThan(Object value) {
            addCriterion("SERVICELEVEL <", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelLessThanOrEqualTo(Object value) {
            addCriterion("SERVICELEVEL <=", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelIn(List<Object> values) {
            addCriterion("SERVICELEVEL in", values, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelNotIn(List<Object> values) {
            addCriterion("SERVICELEVEL not in", values, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelBetween(Object value1, Object value2) {
            addCriterion("SERVICELEVEL between", value1, value2, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelNotBetween(Object value1, Object value2) {
            addCriterion("SERVICELEVEL not between", value1, value2, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeIsNull() {
            addCriterion("ALLEYWAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeIsNotNull() {
            addCriterion("ALLEYWAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeEqualTo(Object value) {
            addCriterion("ALLEYWAYTYPE =", value, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeNotEqualTo(Object value) {
            addCriterion("ALLEYWAYTYPE <>", value, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeGreaterThan(Object value) {
            addCriterion("ALLEYWAYTYPE >", value, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeGreaterThanOrEqualTo(Object value) {
            addCriterion("ALLEYWAYTYPE >=", value, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeLessThan(Object value) {
            addCriterion("ALLEYWAYTYPE <", value, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeLessThanOrEqualTo(Object value) {
            addCriterion("ALLEYWAYTYPE <=", value, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeIn(List<Object> values) {
            addCriterion("ALLEYWAYTYPE in", values, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeNotIn(List<Object> values) {
            addCriterion("ALLEYWAYTYPE not in", values, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeBetween(Object value1, Object value2) {
            addCriterion("ALLEYWAYTYPE between", value1, value2, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaytypeNotBetween(Object value1, Object value2) {
            addCriterion("ALLEYWAYTYPE not between", value1, value2, "alleywaytype");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeIsNull() {
            addCriterion("ALLEYWAYCODE is null");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeIsNotNull() {
            addCriterion("ALLEYWAYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeEqualTo(Object value) {
            addCriterion("ALLEYWAYCODE =", value, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeNotEqualTo(Object value) {
            addCriterion("ALLEYWAYCODE <>", value, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeGreaterThan(Object value) {
            addCriterion("ALLEYWAYCODE >", value, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeGreaterThanOrEqualTo(Object value) {
            addCriterion("ALLEYWAYCODE >=", value, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeLessThan(Object value) {
            addCriterion("ALLEYWAYCODE <", value, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeLessThanOrEqualTo(Object value) {
            addCriterion("ALLEYWAYCODE <=", value, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeIn(List<Object> values) {
            addCriterion("ALLEYWAYCODE in", values, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeNotIn(List<Object> values) {
            addCriterion("ALLEYWAYCODE not in", values, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeBetween(Object value1, Object value2) {
            addCriterion("ALLEYWAYCODE between", value1, value2, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaycodeNotBetween(Object value1, Object value2) {
            addCriterion("ALLEYWAYCODE not between", value1, value2, "alleywaycode");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoIsNull() {
            addCriterion("ALLEYWAYTO is null");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoIsNotNull() {
            addCriterion("ALLEYWAYTO is not null");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoEqualTo(Object value) {
            addCriterion("ALLEYWAYTO =", value, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoNotEqualTo(Object value) {
            addCriterion("ALLEYWAYTO <>", value, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoGreaterThan(Object value) {
            addCriterion("ALLEYWAYTO >", value, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoGreaterThanOrEqualTo(Object value) {
            addCriterion("ALLEYWAYTO >=", value, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoLessThan(Object value) {
            addCriterion("ALLEYWAYTO <", value, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoLessThanOrEqualTo(Object value) {
            addCriterion("ALLEYWAYTO <=", value, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoIn(List<Object> values) {
            addCriterion("ALLEYWAYTO in", values, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoNotIn(List<Object> values) {
            addCriterion("ALLEYWAYTO not in", values, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoBetween(Object value1, Object value2) {
            addCriterion("ALLEYWAYTO between", value1, value2, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andAlleywaytoNotBetween(Object value1, Object value2) {
            addCriterion("ALLEYWAYTO not between", value1, value2, "alleywayto");
            return (Criteria) this;
        }

        public Criteria andIntollcountIsNull() {
            addCriterion("INTOLLCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIntollcountIsNotNull() {
            addCriterion("INTOLLCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIntollcountEqualTo(Object value) {
            addCriterion("INTOLLCOUNT =", value, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountNotEqualTo(Object value) {
            addCriterion("INTOLLCOUNT <>", value, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountGreaterThan(Object value) {
            addCriterion("INTOLLCOUNT >", value, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountGreaterThanOrEqualTo(Object value) {
            addCriterion("INTOLLCOUNT >=", value, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountLessThan(Object value) {
            addCriterion("INTOLLCOUNT <", value, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountLessThanOrEqualTo(Object value) {
            addCriterion("INTOLLCOUNT <=", value, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountIn(List<Object> values) {
            addCriterion("INTOLLCOUNT in", values, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountNotIn(List<Object> values) {
            addCriterion("INTOLLCOUNT not in", values, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountBetween(Object value1, Object value2) {
            addCriterion("INTOLLCOUNT between", value1, value2, "intollcount");
            return (Criteria) this;
        }

        public Criteria andIntollcountNotBetween(Object value1, Object value2) {
            addCriterion("INTOLLCOUNT not between", value1, value2, "intollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountIsNull() {
            addCriterion("OUTTOLLCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOuttollcountIsNotNull() {
            addCriterion("OUTTOLLCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOuttollcountEqualTo(Object value) {
            addCriterion("OUTTOLLCOUNT =", value, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountNotEqualTo(Object value) {
            addCriterion("OUTTOLLCOUNT <>", value, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountGreaterThan(Object value) {
            addCriterion("OUTTOLLCOUNT >", value, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountGreaterThanOrEqualTo(Object value) {
            addCriterion("OUTTOLLCOUNT >=", value, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountLessThan(Object value) {
            addCriterion("OUTTOLLCOUNT <", value, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountLessThanOrEqualTo(Object value) {
            addCriterion("OUTTOLLCOUNT <=", value, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountIn(List<Object> values) {
            addCriterion("OUTTOLLCOUNT in", values, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountNotIn(List<Object> values) {
            addCriterion("OUTTOLLCOUNT not in", values, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountBetween(Object value1, Object value2) {
            addCriterion("OUTTOLLCOUNT between", value1, value2, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andOuttollcountNotBetween(Object value1, Object value2) {
            addCriterion("OUTTOLLCOUNT not between", value1, value2, "outtollcount");
            return (Criteria) this;
        }

        public Criteria andEtcIsNull() {
            addCriterion("ETC is null");
            return (Criteria) this;
        }

        public Criteria andEtcIsNotNull() {
            addCriterion("ETC is not null");
            return (Criteria) this;
        }

        public Criteria andEtcEqualTo(Object value) {
            addCriterion("ETC =", value, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcNotEqualTo(Object value) {
            addCriterion("ETC <>", value, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcGreaterThan(Object value) {
            addCriterion("ETC >", value, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcGreaterThanOrEqualTo(Object value) {
            addCriterion("ETC >=", value, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcLessThan(Object value) {
            addCriterion("ETC <", value, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcLessThanOrEqualTo(Object value) {
            addCriterion("ETC <=", value, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcIn(List<Object> values) {
            addCriterion("ETC in", values, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcNotIn(List<Object> values) {
            addCriterion("ETC not in", values, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcBetween(Object value1, Object value2) {
            addCriterion("ETC between", value1, value2, "etc");
            return (Criteria) this;
        }

        public Criteria andEtcNotBetween(Object value1, Object value2) {
            addCriterion("ETC not between", value1, value2, "etc");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("DELFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("DELFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(Object value) {
            addCriterion("DELFLAG =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(Object value) {
            addCriterion("DELFLAG <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(Object value) {
            addCriterion("DELFLAG >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(Object value) {
            addCriterion("DELFLAG >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(Object value) {
            addCriterion("DELFLAG <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(Object value) {
            addCriterion("DELFLAG <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<Object> values) {
            addCriterion("DELFLAG in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<Object> values) {
            addCriterion("DELFLAG not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(Object value1, Object value2) {
            addCriterion("DELFLAG between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(Object value1, Object value2) {
            addCriterion("DELFLAG not between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andManagementdeptIsNull() {
            addCriterion("MANAGEMENTDEPT is null");
            return (Criteria) this;
        }

        public Criteria andManagementdeptIsNotNull() {
            addCriterion("MANAGEMENTDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andManagementdeptEqualTo(Object value) {
            addCriterion("MANAGEMENTDEPT =", value, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptNotEqualTo(Object value) {
            addCriterion("MANAGEMENTDEPT <>", value, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptGreaterThan(Object value) {
            addCriterion("MANAGEMENTDEPT >", value, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptGreaterThanOrEqualTo(Object value) {
            addCriterion("MANAGEMENTDEPT >=", value, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptLessThan(Object value) {
            addCriterion("MANAGEMENTDEPT <", value, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptLessThanOrEqualTo(Object value) {
            addCriterion("MANAGEMENTDEPT <=", value, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptIn(List<Object> values) {
            addCriterion("MANAGEMENTDEPT in", values, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptNotIn(List<Object> values) {
            addCriterion("MANAGEMENTDEPT not in", values, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptBetween(Object value1, Object value2) {
            addCriterion("MANAGEMENTDEPT between", value1, value2, "managementdept");
            return (Criteria) this;
        }

        public Criteria andManagementdeptNotBetween(Object value1, Object value2) {
            addCriterion("MANAGEMENTDEPT not between", value1, value2, "managementdept");
            return (Criteria) this;
        }

        public Criteria andPointcodeIsNull() {
            addCriterion("POINTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPointcodeIsNotNull() {
            addCriterion("POINTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPointcodeEqualTo(Object value) {
            addCriterion("POINTCODE =", value, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeNotEqualTo(Object value) {
            addCriterion("POINTCODE <>", value, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeGreaterThan(Object value) {
            addCriterion("POINTCODE >", value, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeGreaterThanOrEqualTo(Object value) {
            addCriterion("POINTCODE >=", value, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeLessThan(Object value) {
            addCriterion("POINTCODE <", value, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeLessThanOrEqualTo(Object value) {
            addCriterion("POINTCODE <=", value, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeIn(List<Object> values) {
            addCriterion("POINTCODE in", values, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeNotIn(List<Object> values) {
            addCriterion("POINTCODE not in", values, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeBetween(Object value1, Object value2) {
            addCriterion("POINTCODE between", value1, value2, "pointcode");
            return (Criteria) this;
        }

        public Criteria andPointcodeNotBetween(Object value1, Object value2) {
            addCriterion("POINTCODE not between", value1, value2, "pointcode");
            return (Criteria) this;
        }

        public Criteria andIndirectionIsNull() {
            addCriterion("INDIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andIndirectionIsNotNull() {
            addCriterion("INDIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andIndirectionEqualTo(Object value) {
            addCriterion("INDIRECTION =", value, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionNotEqualTo(Object value) {
            addCriterion("INDIRECTION <>", value, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionGreaterThan(Object value) {
            addCriterion("INDIRECTION >", value, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionGreaterThanOrEqualTo(Object value) {
            addCriterion("INDIRECTION >=", value, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionLessThan(Object value) {
            addCriterion("INDIRECTION <", value, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionLessThanOrEqualTo(Object value) {
            addCriterion("INDIRECTION <=", value, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionIn(List<Object> values) {
            addCriterion("INDIRECTION in", values, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionNotIn(List<Object> values) {
            addCriterion("INDIRECTION not in", values, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionBetween(Object value1, Object value2) {
            addCriterion("INDIRECTION between", value1, value2, "indirection");
            return (Criteria) this;
        }

        public Criteria andIndirectionNotBetween(Object value1, Object value2) {
            addCriterion("INDIRECTION not between", value1, value2, "indirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionIsNull() {
            addCriterion("OUTDIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andOutdirectionIsNotNull() {
            addCriterion("OUTDIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andOutdirectionEqualTo(Object value) {
            addCriterion("OUTDIRECTION =", value, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionNotEqualTo(Object value) {
            addCriterion("OUTDIRECTION <>", value, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionGreaterThan(Object value) {
            addCriterion("OUTDIRECTION >", value, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionGreaterThanOrEqualTo(Object value) {
            addCriterion("OUTDIRECTION >=", value, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionLessThan(Object value) {
            addCriterion("OUTDIRECTION <", value, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionLessThanOrEqualTo(Object value) {
            addCriterion("OUTDIRECTION <=", value, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionIn(List<Object> values) {
            addCriterion("OUTDIRECTION in", values, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionNotIn(List<Object> values) {
            addCriterion("OUTDIRECTION not in", values, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionBetween(Object value1, Object value2) {
            addCriterion("OUTDIRECTION between", value1, value2, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOutdirectionNotBetween(Object value1, Object value2) {
            addCriterion("OUTDIRECTION not between", value1, value2, "outdirection");
            return (Criteria) this;
        }

        public Criteria andOnstatusIsNull() {
            addCriterion("ONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOnstatusIsNotNull() {
            addCriterion("ONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOnstatusEqualTo(Object value) {
            addCriterion("ONSTATUS =", value, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusNotEqualTo(Object value) {
            addCriterion("ONSTATUS <>", value, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusGreaterThan(Object value) {
            addCriterion("ONSTATUS >", value, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusGreaterThanOrEqualTo(Object value) {
            addCriterion("ONSTATUS >=", value, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusLessThan(Object value) {
            addCriterion("ONSTATUS <", value, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusLessThanOrEqualTo(Object value) {
            addCriterion("ONSTATUS <=", value, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusIn(List<Object> values) {
            addCriterion("ONSTATUS in", values, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusNotIn(List<Object> values) {
            addCriterion("ONSTATUS not in", values, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusBetween(Object value1, Object value2) {
            addCriterion("ONSTATUS between", value1, value2, "onstatus");
            return (Criteria) this;
        }

        public Criteria andOnstatusNotBetween(Object value1, Object value2) {
            addCriterion("ONSTATUS not between", value1, value2, "onstatus");
            return (Criteria) this;
        }

        public Criteria andInlanecountIsNull() {
            addCriterion("INLANECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInlanecountIsNotNull() {
            addCriterion("INLANECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInlanecountEqualTo(Object value) {
            addCriterion("INLANECOUNT =", value, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountNotEqualTo(Object value) {
            addCriterion("INLANECOUNT <>", value, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountGreaterThan(Object value) {
            addCriterion("INLANECOUNT >", value, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountGreaterThanOrEqualTo(Object value) {
            addCriterion("INLANECOUNT >=", value, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountLessThan(Object value) {
            addCriterion("INLANECOUNT <", value, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountLessThanOrEqualTo(Object value) {
            addCriterion("INLANECOUNT <=", value, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountIn(List<Object> values) {
            addCriterion("INLANECOUNT in", values, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountNotIn(List<Object> values) {
            addCriterion("INLANECOUNT not in", values, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountBetween(Object value1, Object value2) {
            addCriterion("INLANECOUNT between", value1, value2, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andInlanecountNotBetween(Object value1, Object value2) {
            addCriterion("INLANECOUNT not between", value1, value2, "inlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountIsNull() {
            addCriterion("OUTLANECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOutlanecountIsNotNull() {
            addCriterion("OUTLANECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOutlanecountEqualTo(Object value) {
            addCriterion("OUTLANECOUNT =", value, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountNotEqualTo(Object value) {
            addCriterion("OUTLANECOUNT <>", value, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountGreaterThan(Object value) {
            addCriterion("OUTLANECOUNT >", value, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountGreaterThanOrEqualTo(Object value) {
            addCriterion("OUTLANECOUNT >=", value, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountLessThan(Object value) {
            addCriterion("OUTLANECOUNT <", value, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountLessThanOrEqualTo(Object value) {
            addCriterion("OUTLANECOUNT <=", value, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountIn(List<Object> values) {
            addCriterion("OUTLANECOUNT in", values, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountNotIn(List<Object> values) {
            addCriterion("OUTLANECOUNT not in", values, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountBetween(Object value1, Object value2) {
            addCriterion("OUTLANECOUNT between", value1, value2, "outlanecount");
            return (Criteria) this;
        }

        public Criteria andOutlanecountNotBetween(Object value1, Object value2) {
            addCriterion("OUTLANECOUNT not between", value1, value2, "outlanecount");
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