package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.List;

public class POLICE_CASEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public POLICE_CASEExample() {
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

        public Criteria andCaseIdIsNull() {
            addCriterion("CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(String value) {
            addCriterion("CASE_ID =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(String value) {
            addCriterion("CASE_ID <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(String value) {
            addCriterion("CASE_ID >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_ID >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(String value) {
            addCriterion("CASE_ID <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(String value) {
            addCriterion("CASE_ID <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLike(String value) {
            addCriterion("CASE_ID like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotLike(String value) {
            addCriterion("CASE_ID not like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<String> values) {
            addCriterion("CASE_ID in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<String> values) {
            addCriterion("CASE_ID not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(String value1, String value2) {
            addCriterion("CASE_ID between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(String value1, String value2) {
            addCriterion("CASE_ID not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
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

        public Criteria andNlevelIsNull() {
            addCriterion("NLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andNlevelIsNotNull() {
            addCriterion("NLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andNlevelEqualTo(String value) {
            addCriterion("NLEVEL =", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelNotEqualTo(String value) {
            addCriterion("NLEVEL <>", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelGreaterThan(String value) {
            addCriterion("NLEVEL >", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelGreaterThanOrEqualTo(String value) {
            addCriterion("NLEVEL >=", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelLessThan(String value) {
            addCriterion("NLEVEL <", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelLessThanOrEqualTo(String value) {
            addCriterion("NLEVEL <=", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelLike(String value) {
            addCriterion("NLEVEL like", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelNotLike(String value) {
            addCriterion("NLEVEL not like", value, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelIn(List<String> values) {
            addCriterion("NLEVEL in", values, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelNotIn(List<String> values) {
            addCriterion("NLEVEL not in", values, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelBetween(String value1, String value2) {
            addCriterion("NLEVEL between", value1, value2, "nlevel");
            return (Criteria) this;
        }

        public Criteria andNlevelNotBetween(String value1, String value2) {
            addCriterion("NLEVEL not between", value1, value2, "nlevel");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("DEPARTMENT_ID like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("DEPARTMENT_ID not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("BRIEF is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("BRIEF is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("BRIEF =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("BRIEF <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("BRIEF >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("BRIEF >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("BRIEF <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("BRIEF <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("BRIEF like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("BRIEF not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("BRIEF in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("BRIEF not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("BRIEF between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("BRIEF not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNull() {
            addCriterion("POINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("POINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPointIdEqualTo(String value) {
            addCriterion("POINT_ID =", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotEqualTo(String value) {
            addCriterion("POINT_ID <>", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThan(String value) {
            addCriterion("POINT_ID >", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("POINT_ID >=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThan(String value) {
            addCriterion("POINT_ID <", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThanOrEqualTo(String value) {
            addCriterion("POINT_ID <=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLike(String value) {
            addCriterion("POINT_ID like", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotLike(String value) {
            addCriterion("POINT_ID not like", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdIn(List<String> values) {
            addCriterion("POINT_ID in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotIn(List<String> values) {
            addCriterion("POINT_ID not in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdBetween(String value1, String value2) {
            addCriterion("POINT_ID between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotBetween(String value1, String value2) {
            addCriterion("POINT_ID not between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNull() {
            addCriterion("LOCATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNotNull() {
            addCriterion("LOCATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNameEqualTo(String value) {
            addCriterion("LOCATION_NAME =", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotEqualTo(String value) {
            addCriterion("LOCATION_NAME <>", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThan(String value) {
            addCriterion("LOCATION_NAME >", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_NAME >=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThan(String value) {
            addCriterion("LOCATION_NAME <", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_NAME <=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLike(String value) {
            addCriterion("LOCATION_NAME like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotLike(String value) {
            addCriterion("LOCATION_NAME not like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameIn(List<String> values) {
            addCriterion("LOCATION_NAME in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotIn(List<String> values) {
            addCriterion("LOCATION_NAME not in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameBetween(String value1, String value2) {
            addCriterion("LOCATION_NAME between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotBetween(String value1, String value2) {
            addCriterion("LOCATION_NAME not between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
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

        public Criteria andRoadIdIsNull() {
            addCriterion("ROAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoadIdIsNotNull() {
            addCriterion("ROAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoadIdEqualTo(String value) {
            addCriterion("ROAD_ID =", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotEqualTo(String value) {
            addCriterion("ROAD_ID <>", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdGreaterThan(String value) {
            addCriterion("ROAD_ID >", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROAD_ID >=", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdLessThan(String value) {
            addCriterion("ROAD_ID <", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdLessThanOrEqualTo(String value) {
            addCriterion("ROAD_ID <=", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdLike(String value) {
            addCriterion("ROAD_ID like", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotLike(String value) {
            addCriterion("ROAD_ID not like", value, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdIn(List<String> values) {
            addCriterion("ROAD_ID in", values, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotIn(List<String> values) {
            addCriterion("ROAD_ID not in", values, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdBetween(String value1, String value2) {
            addCriterion("ROAD_ID between", value1, value2, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadIdNotBetween(String value1, String value2) {
            addCriterion("ROAD_ID not between", value1, value2, "roadId");
            return (Criteria) this;
        }

        public Criteria andRoadNameIsNull() {
            addCriterion("ROAD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoadNameIsNotNull() {
            addCriterion("ROAD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoadNameEqualTo(String value) {
            addCriterion("ROAD_NAME =", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotEqualTo(String value) {
            addCriterion("ROAD_NAME <>", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThan(String value) {
            addCriterion("ROAD_NAME >", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROAD_NAME >=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThan(String value) {
            addCriterion("ROAD_NAME <", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThanOrEqualTo(String value) {
            addCriterion("ROAD_NAME <=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLike(String value) {
            addCriterion("ROAD_NAME like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotLike(String value) {
            addCriterion("ROAD_NAME not like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameIn(List<String> values) {
            addCriterion("ROAD_NAME in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotIn(List<String> values) {
            addCriterion("ROAD_NAME not in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameBetween(String value1, String value2) {
            addCriterion("ROAD_NAME between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotBetween(String value1, String value2) {
            addCriterion("ROAD_NAME not between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("VIDEO_URL is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("VIDEO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("VIDEO_URL =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("VIDEO_URL <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("VIDEO_URL >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("VIDEO_URL <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("VIDEO_URL like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("VIDEO_URL not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("VIDEO_URL in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("VIDEO_URL not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("VIDEO_URL between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("VIDEO_URL not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameIsNull() {
            addCriterion("REPORT_USRNAME is null");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameIsNotNull() {
            addCriterion("REPORT_USRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameEqualTo(String value) {
            addCriterion("REPORT_USRNAME =", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameNotEqualTo(String value) {
            addCriterion("REPORT_USRNAME <>", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameGreaterThan(String value) {
            addCriterion("REPORT_USRNAME >", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_USRNAME >=", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameLessThan(String value) {
            addCriterion("REPORT_USRNAME <", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_USRNAME <=", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameLike(String value) {
            addCriterion("REPORT_USRNAME like", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameNotLike(String value) {
            addCriterion("REPORT_USRNAME not like", value, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameIn(List<String> values) {
            addCriterion("REPORT_USRNAME in", values, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameNotIn(List<String> values) {
            addCriterion("REPORT_USRNAME not in", values, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameBetween(String value1, String value2) {
            addCriterion("REPORT_USRNAME between", value1, value2, "reportUsrname");
            return (Criteria) this;
        }

        public Criteria andReportUsrnameNotBetween(String value1, String value2) {
            addCriterion("REPORT_USRNAME not between", value1, value2, "reportUsrname");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("CARTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("CARTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("CARTYPE =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("CARTYPE <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("CARTYPE >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARTYPE >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("CARTYPE <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("CARTYPE <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("CARTYPE like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("CARTYPE not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("CARTYPE in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("CARTYPE not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("CARTYPE between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("CARTYPE not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNull() {
            addCriterion("CARNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNotNull() {
            addCriterion("CARNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumberEqualTo(String value) {
            addCriterion("CARNUMBER =", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotEqualTo(String value) {
            addCriterion("CARNUMBER <>", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThan(String value) {
            addCriterion("CARNUMBER >", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CARNUMBER >=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThan(String value) {
            addCriterion("CARNUMBER <", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThanOrEqualTo(String value) {
            addCriterion("CARNUMBER <=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLike(String value) {
            addCriterion("CARNUMBER like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotLike(String value) {
            addCriterion("CARNUMBER not like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberIn(List<String> values) {
            addCriterion("CARNUMBER in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotIn(List<String> values) {
            addCriterion("CARNUMBER not in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberBetween(String value1, String value2) {
            addCriterion("CARNUMBER between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotBetween(String value1, String value2) {
            addCriterion("CARNUMBER not between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andRecordlineIsNull() {
            addCriterion("RECORDLINE is null");
            return (Criteria) this;
        }

        public Criteria andRecordlineIsNotNull() {
            addCriterion("RECORDLINE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordlineEqualTo(String value) {
            addCriterion("RECORDLINE =", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineNotEqualTo(String value) {
            addCriterion("RECORDLINE <>", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineGreaterThan(String value) {
            addCriterion("RECORDLINE >", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDLINE >=", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineLessThan(String value) {
            addCriterion("RECORDLINE <", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineLessThanOrEqualTo(String value) {
            addCriterion("RECORDLINE <=", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineLike(String value) {
            addCriterion("RECORDLINE like", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineNotLike(String value) {
            addCriterion("RECORDLINE not like", value, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineIn(List<String> values) {
            addCriterion("RECORDLINE in", values, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineNotIn(List<String> values) {
            addCriterion("RECORDLINE not in", values, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineBetween(String value1, String value2) {
            addCriterion("RECORDLINE between", value1, value2, "recordline");
            return (Criteria) this;
        }

        public Criteria andRecordlineNotBetween(String value1, String value2) {
            addCriterion("RECORDLINE not between", value1, value2, "recordline");
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