package com.example.demo.po.LRX;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ACD_DUTYExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ACD_DUTYExample() {
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

        public Criteria andJbssIsNull() {
            addCriterion("JBSS is null");
            return (Criteria) this;
        }

        public Criteria andJbssIsNotNull() {
            addCriterion("JBSS is not null");
            return (Criteria) this;
        }

        public Criteria andJbssEqualTo(String value) {
            addCriterion("JBSS =", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssNotEqualTo(String value) {
            addCriterion("JBSS <>", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssGreaterThan(String value) {
            addCriterion("JBSS >", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssGreaterThanOrEqualTo(String value) {
            addCriterion("JBSS >=", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssLessThan(String value) {
            addCriterion("JBSS <", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssLessThanOrEqualTo(String value) {
            addCriterion("JBSS <=", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssLike(String value) {
            addCriterion("JBSS like", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssNotLike(String value) {
            addCriterion("JBSS not like", value, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssIn(List<String> values) {
            addCriterion("JBSS in", values, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssNotIn(List<String> values) {
            addCriterion("JBSS not in", values, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssBetween(String value1, String value2) {
            addCriterion("JBSS between", value1, value2, "jbss");
            return (Criteria) this;
        }

        public Criteria andJbssNotBetween(String value1, String value2) {
            addCriterion("JBSS not between", value1, value2, "jbss");
            return (Criteria) this;
        }

        public Criteria andDsfqkIsNull() {
            addCriterion("DSFQK is null");
            return (Criteria) this;
        }

        public Criteria andDsfqkIsNotNull() {
            addCriterion("DSFQK is not null");
            return (Criteria) this;
        }

        public Criteria andDsfqkEqualTo(String value) {
            addCriterion("DSFQK =", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkNotEqualTo(String value) {
            addCriterion("DSFQK <>", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkGreaterThan(String value) {
            addCriterion("DSFQK >", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkGreaterThanOrEqualTo(String value) {
            addCriterion("DSFQK >=", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkLessThan(String value) {
            addCriterion("DSFQK <", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkLessThanOrEqualTo(String value) {
            addCriterion("DSFQK <=", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkLike(String value) {
            addCriterion("DSFQK like", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkNotLike(String value) {
            addCriterion("DSFQK not like", value, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkIn(List<String> values) {
            addCriterion("DSFQK in", values, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkNotIn(List<String> values) {
            addCriterion("DSFQK not in", values, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkBetween(String value1, String value2) {
            addCriterion("DSFQK between", value1, value2, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andDsfqkNotBetween(String value1, String value2) {
            addCriterion("DSFQK not between", value1, value2, "dsfqk");
            return (Criteria) this;
        }

        public Criteria andRdnrIsNull() {
            addCriterion("RDNR is null");
            return (Criteria) this;
        }

        public Criteria andRdnrIsNotNull() {
            addCriterion("RDNR is not null");
            return (Criteria) this;
        }

        public Criteria andRdnrEqualTo(String value) {
            addCriterion("RDNR =", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrNotEqualTo(String value) {
            addCriterion("RDNR <>", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrGreaterThan(String value) {
            addCriterion("RDNR >", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrGreaterThanOrEqualTo(String value) {
            addCriterion("RDNR >=", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrLessThan(String value) {
            addCriterion("RDNR <", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrLessThanOrEqualTo(String value) {
            addCriterion("RDNR <=", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrLike(String value) {
            addCriterion("RDNR like", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrNotLike(String value) {
            addCriterion("RDNR not like", value, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrIn(List<String> values) {
            addCriterion("RDNR in", values, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrNotIn(List<String> values) {
            addCriterion("RDNR not in", values, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrBetween(String value1, String value2) {
            addCriterion("RDNR between", value1, value2, "rdnr");
            return (Criteria) this;
        }

        public Criteria andRdnrNotBetween(String value1, String value2) {
            addCriterion("RDNR not between", value1, value2, "rdnr");
            return (Criteria) this;
        }

        public Criteria andBaryjIsNull() {
            addCriterion("BARYJ is null");
            return (Criteria) this;
        }

        public Criteria andBaryjIsNotNull() {
            addCriterion("BARYJ is not null");
            return (Criteria) this;
        }

        public Criteria andBaryjEqualTo(String value) {
            addCriterion("BARYJ =", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjNotEqualTo(String value) {
            addCriterion("BARYJ <>", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjGreaterThan(String value) {
            addCriterion("BARYJ >", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjGreaterThanOrEqualTo(String value) {
            addCriterion("BARYJ >=", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjLessThan(String value) {
            addCriterion("BARYJ <", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjLessThanOrEqualTo(String value) {
            addCriterion("BARYJ <=", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjLike(String value) {
            addCriterion("BARYJ like", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjNotLike(String value) {
            addCriterion("BARYJ not like", value, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjIn(List<String> values) {
            addCriterion("BARYJ in", values, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjNotIn(List<String> values) {
            addCriterion("BARYJ not in", values, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjBetween(String value1, String value2) {
            addCriterion("BARYJ between", value1, value2, "baryj");
            return (Criteria) this;
        }

        public Criteria andBaryjNotBetween(String value1, String value2) {
            addCriterion("BARYJ not between", value1, value2, "baryj");
            return (Criteria) this;
        }

        public Criteria andZjyjIsNull() {
            addCriterion("ZJYJ is null");
            return (Criteria) this;
        }

        public Criteria andZjyjIsNotNull() {
            addCriterion("ZJYJ is not null");
            return (Criteria) this;
        }

        public Criteria andZjyjEqualTo(String value) {
            addCriterion("ZJYJ =", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjNotEqualTo(String value) {
            addCriterion("ZJYJ <>", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjGreaterThan(String value) {
            addCriterion("ZJYJ >", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjGreaterThanOrEqualTo(String value) {
            addCriterion("ZJYJ >=", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjLessThan(String value) {
            addCriterion("ZJYJ <", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjLessThanOrEqualTo(String value) {
            addCriterion("ZJYJ <=", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjLike(String value) {
            addCriterion("ZJYJ like", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjNotLike(String value) {
            addCriterion("ZJYJ not like", value, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjIn(List<String> values) {
            addCriterion("ZJYJ in", values, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjNotIn(List<String> values) {
            addCriterion("ZJYJ not in", values, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjBetween(String value1, String value2) {
            addCriterion("ZJYJ between", value1, value2, "zjyj");
            return (Criteria) this;
        }

        public Criteria andZjyjNotBetween(String value1, String value2) {
            addCriterion("ZJYJ not between", value1, value2, "zjyj");
            return (Criteria) this;
        }

        public Criteria andCbr1IsNull() {
            addCriterion("CBR1 is null");
            return (Criteria) this;
        }

        public Criteria andCbr1IsNotNull() {
            addCriterion("CBR1 is not null");
            return (Criteria) this;
        }

        public Criteria andCbr1EqualTo(String value) {
            addCriterion("CBR1 =", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1NotEqualTo(String value) {
            addCriterion("CBR1 <>", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1GreaterThan(String value) {
            addCriterion("CBR1 >", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1GreaterThanOrEqualTo(String value) {
            addCriterion("CBR1 >=", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1LessThan(String value) {
            addCriterion("CBR1 <", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1LessThanOrEqualTo(String value) {
            addCriterion("CBR1 <=", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1Like(String value) {
            addCriterion("CBR1 like", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1NotLike(String value) {
            addCriterion("CBR1 not like", value, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1In(List<String> values) {
            addCriterion("CBR1 in", values, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1NotIn(List<String> values) {
            addCriterion("CBR1 not in", values, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1Between(String value1, String value2) {
            addCriterion("CBR1 between", value1, value2, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr1NotBetween(String value1, String value2) {
            addCriterion("CBR1 not between", value1, value2, "cbr1");
            return (Criteria) this;
        }

        public Criteria andCbr2IsNull() {
            addCriterion("CBR2 is null");
            return (Criteria) this;
        }

        public Criteria andCbr2IsNotNull() {
            addCriterion("CBR2 is not null");
            return (Criteria) this;
        }

        public Criteria andCbr2EqualTo(String value) {
            addCriterion("CBR2 =", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2NotEqualTo(String value) {
            addCriterion("CBR2 <>", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2GreaterThan(String value) {
            addCriterion("CBR2 >", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2GreaterThanOrEqualTo(String value) {
            addCriterion("CBR2 >=", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2LessThan(String value) {
            addCriterion("CBR2 <", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2LessThanOrEqualTo(String value) {
            addCriterion("CBR2 <=", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2Like(String value) {
            addCriterion("CBR2 like", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2NotLike(String value) {
            addCriterion("CBR2 not like", value, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2In(List<String> values) {
            addCriterion("CBR2 in", values, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2NotIn(List<String> values) {
            addCriterion("CBR2 not in", values, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2Between(String value1, String value2) {
            addCriterion("CBR2 between", value1, value2, "cbr2");
            return (Criteria) this;
        }

        public Criteria andCbr2NotBetween(String value1, String value2) {
            addCriterion("CBR2 not between", value1, value2, "cbr2");
            return (Criteria) this;
        }

        public Criteria andXbrqIsNull() {
            addCriterion("XBRQ is null");
            return (Criteria) this;
        }

        public Criteria andXbrqIsNotNull() {
            addCriterion("XBRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXbrqEqualTo(Date value) {
            addCriterion("XBRQ =", value, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqNotEqualTo(Date value) {
            addCriterion("XBRQ <>", value, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqGreaterThan(Date value) {
            addCriterion("XBRQ >", value, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("XBRQ >=", value, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqLessThan(Date value) {
            addCriterion("XBRQ <", value, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqLessThanOrEqualTo(Date value) {
            addCriterion("XBRQ <=", value, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqIn(List<Date> values) {
            addCriterion("XBRQ in", values, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqNotIn(List<Date> values) {
            addCriterion("XBRQ not in", values, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqBetween(Date value1, Date value2) {
            addCriterion("XBRQ between", value1, value2, "xbrq");
            return (Criteria) this;
        }

        public Criteria andXbrqNotBetween(Date value1, Date value2) {
            addCriterion("XBRQ not between", value1, value2, "xbrq");
            return (Criteria) this;
        }

        public Criteria andTqsprqIsNull() {
            addCriterion("TQSPRQ is null");
            return (Criteria) this;
        }

        public Criteria andTqsprqIsNotNull() {
            addCriterion("TQSPRQ is not null");
            return (Criteria) this;
        }

        public Criteria andTqsprqEqualTo(Date value) {
            addCriterion("TQSPRQ =", value, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqNotEqualTo(Date value) {
            addCriterion("TQSPRQ <>", value, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqGreaterThan(Date value) {
            addCriterion("TQSPRQ >", value, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqGreaterThanOrEqualTo(Date value) {
            addCriterion("TQSPRQ >=", value, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqLessThan(Date value) {
            addCriterion("TQSPRQ <", value, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqLessThanOrEqualTo(Date value) {
            addCriterion("TQSPRQ <=", value, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqIn(List<Date> values) {
            addCriterion("TQSPRQ in", values, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqNotIn(List<Date> values) {
            addCriterion("TQSPRQ not in", values, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqBetween(Date value1, Date value2) {
            addCriterion("TQSPRQ between", value1, value2, "tqsprq");
            return (Criteria) this;
        }

        public Criteria andTqsprqNotBetween(Date value1, Date value2) {
            addCriterion("TQSPRQ not between", value1, value2, "tqsprq");
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

        public Criteria andWsztIsNull() {
            addCriterion("WSZT is null");
            return (Criteria) this;
        }

        public Criteria andWsztIsNotNull() {
            addCriterion("WSZT is not null");
            return (Criteria) this;
        }

        public Criteria andWsztEqualTo(String value) {
            addCriterion("WSZT =", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztNotEqualTo(String value) {
            addCriterion("WSZT <>", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztGreaterThan(String value) {
            addCriterion("WSZT >", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztGreaterThanOrEqualTo(String value) {
            addCriterion("WSZT >=", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztLessThan(String value) {
            addCriterion("WSZT <", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztLessThanOrEqualTo(String value) {
            addCriterion("WSZT <=", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztLike(String value) {
            addCriterion("WSZT like", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztNotLike(String value) {
            addCriterion("WSZT not like", value, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztIn(List<String> values) {
            addCriterion("WSZT in", values, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztNotIn(List<String> values) {
            addCriterion("WSZT not in", values, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztBetween(String value1, String value2) {
            addCriterion("WSZT between", value1, value2, "wszt");
            return (Criteria) this;
        }

        public Criteria andWsztNotBetween(String value1, String value2) {
            addCriterion("WSZT not between", value1, value2, "wszt");
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

        public Criteria andDsfqk1IsNull() {
            addCriterion("DSFQK1 is null");
            return (Criteria) this;
        }

        public Criteria andDsfqk1IsNotNull() {
            addCriterion("DSFQK1 is not null");
            return (Criteria) this;
        }

        public Criteria andDsfqk1EqualTo(String value) {
            addCriterion("DSFQK1 =", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1NotEqualTo(String value) {
            addCriterion("DSFQK1 <>", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1GreaterThan(String value) {
            addCriterion("DSFQK1 >", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1GreaterThanOrEqualTo(String value) {
            addCriterion("DSFQK1 >=", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1LessThan(String value) {
            addCriterion("DSFQK1 <", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1LessThanOrEqualTo(String value) {
            addCriterion("DSFQK1 <=", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1Like(String value) {
            addCriterion("DSFQK1 like", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1NotLike(String value) {
            addCriterion("DSFQK1 not like", value, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1In(List<String> values) {
            addCriterion("DSFQK1 in", values, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1NotIn(List<String> values) {
            addCriterion("DSFQK1 not in", values, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1Between(String value1, String value2) {
            addCriterion("DSFQK1 between", value1, value2, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk1NotBetween(String value1, String value2) {
            addCriterion("DSFQK1 not between", value1, value2, "dsfqk1");
            return (Criteria) this;
        }

        public Criteria andDsfqk2IsNull() {
            addCriterion("DSFQK2 is null");
            return (Criteria) this;
        }

        public Criteria andDsfqk2IsNotNull() {
            addCriterion("DSFQK2 is not null");
            return (Criteria) this;
        }

        public Criteria andDsfqk2EqualTo(String value) {
            addCriterion("DSFQK2 =", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2NotEqualTo(String value) {
            addCriterion("DSFQK2 <>", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2GreaterThan(String value) {
            addCriterion("DSFQK2 >", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2GreaterThanOrEqualTo(String value) {
            addCriterion("DSFQK2 >=", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2LessThan(String value) {
            addCriterion("DSFQK2 <", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2LessThanOrEqualTo(String value) {
            addCriterion("DSFQK2 <=", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2Like(String value) {
            addCriterion("DSFQK2 like", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2NotLike(String value) {
            addCriterion("DSFQK2 not like", value, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2In(List<String> values) {
            addCriterion("DSFQK2 in", values, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2NotIn(List<String> values) {
            addCriterion("DSFQK2 not in", values, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2Between(String value1, String value2) {
            addCriterion("DSFQK2 between", value1, value2, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk2NotBetween(String value1, String value2) {
            addCriterion("DSFQK2 not between", value1, value2, "dsfqk2");
            return (Criteria) this;
        }

        public Criteria andDsfqk3IsNull() {
            addCriterion("DSFQK3 is null");
            return (Criteria) this;
        }

        public Criteria andDsfqk3IsNotNull() {
            addCriterion("DSFQK3 is not null");
            return (Criteria) this;
        }

        public Criteria andDsfqk3EqualTo(String value) {
            addCriterion("DSFQK3 =", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3NotEqualTo(String value) {
            addCriterion("DSFQK3 <>", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3GreaterThan(String value) {
            addCriterion("DSFQK3 >", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3GreaterThanOrEqualTo(String value) {
            addCriterion("DSFQK3 >=", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3LessThan(String value) {
            addCriterion("DSFQK3 <", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3LessThanOrEqualTo(String value) {
            addCriterion("DSFQK3 <=", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3Like(String value) {
            addCriterion("DSFQK3 like", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3NotLike(String value) {
            addCriterion("DSFQK3 not like", value, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3In(List<String> values) {
            addCriterion("DSFQK3 in", values, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3NotIn(List<String> values) {
            addCriterion("DSFQK3 not in", values, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3Between(String value1, String value2) {
            addCriterion("DSFQK3 between", value1, value2, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk3NotBetween(String value1, String value2) {
            addCriterion("DSFQK3 not between", value1, value2, "dsfqk3");
            return (Criteria) this;
        }

        public Criteria andDsfqk4IsNull() {
            addCriterion("DSFQK4 is null");
            return (Criteria) this;
        }

        public Criteria andDsfqk4IsNotNull() {
            addCriterion("DSFQK4 is not null");
            return (Criteria) this;
        }

        public Criteria andDsfqk4EqualTo(String value) {
            addCriterion("DSFQK4 =", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4NotEqualTo(String value) {
            addCriterion("DSFQK4 <>", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4GreaterThan(String value) {
            addCriterion("DSFQK4 >", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4GreaterThanOrEqualTo(String value) {
            addCriterion("DSFQK4 >=", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4LessThan(String value) {
            addCriterion("DSFQK4 <", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4LessThanOrEqualTo(String value) {
            addCriterion("DSFQK4 <=", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4Like(String value) {
            addCriterion("DSFQK4 like", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4NotLike(String value) {
            addCriterion("DSFQK4 not like", value, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4In(List<String> values) {
            addCriterion("DSFQK4 in", values, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4NotIn(List<String> values) {
            addCriterion("DSFQK4 not in", values, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4Between(String value1, String value2) {
            addCriterion("DSFQK4 between", value1, value2, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andDsfqk4NotBetween(String value1, String value2) {
            addCriterion("DSFQK4 not between", value1, value2, "dsfqk4");
            return (Criteria) this;
        }

        public Criteria andJbss1IsNull() {
            addCriterion("JBSS1 is null");
            return (Criteria) this;
        }

        public Criteria andJbss1IsNotNull() {
            addCriterion("JBSS1 is not null");
            return (Criteria) this;
        }

        public Criteria andJbss1EqualTo(String value) {
            addCriterion("JBSS1 =", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1NotEqualTo(String value) {
            addCriterion("JBSS1 <>", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1GreaterThan(String value) {
            addCriterion("JBSS1 >", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1GreaterThanOrEqualTo(String value) {
            addCriterion("JBSS1 >=", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1LessThan(String value) {
            addCriterion("JBSS1 <", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1LessThanOrEqualTo(String value) {
            addCriterion("JBSS1 <=", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1Like(String value) {
            addCriterion("JBSS1 like", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1NotLike(String value) {
            addCriterion("JBSS1 not like", value, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1In(List<String> values) {
            addCriterion("JBSS1 in", values, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1NotIn(List<String> values) {
            addCriterion("JBSS1 not in", values, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1Between(String value1, String value2) {
            addCriterion("JBSS1 between", value1, value2, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss1NotBetween(String value1, String value2) {
            addCriterion("JBSS1 not between", value1, value2, "jbss1");
            return (Criteria) this;
        }

        public Criteria andJbss2IsNull() {
            addCriterion("JBSS2 is null");
            return (Criteria) this;
        }

        public Criteria andJbss2IsNotNull() {
            addCriterion("JBSS2 is not null");
            return (Criteria) this;
        }

        public Criteria andJbss2EqualTo(String value) {
            addCriterion("JBSS2 =", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2NotEqualTo(String value) {
            addCriterion("JBSS2 <>", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2GreaterThan(String value) {
            addCriterion("JBSS2 >", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2GreaterThanOrEqualTo(String value) {
            addCriterion("JBSS2 >=", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2LessThan(String value) {
            addCriterion("JBSS2 <", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2LessThanOrEqualTo(String value) {
            addCriterion("JBSS2 <=", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2Like(String value) {
            addCriterion("JBSS2 like", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2NotLike(String value) {
            addCriterion("JBSS2 not like", value, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2In(List<String> values) {
            addCriterion("JBSS2 in", values, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2NotIn(List<String> values) {
            addCriterion("JBSS2 not in", values, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2Between(String value1, String value2) {
            addCriterion("JBSS2 between", value1, value2, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss2NotBetween(String value1, String value2) {
            addCriterion("JBSS2 not between", value1, value2, "jbss2");
            return (Criteria) this;
        }

        public Criteria andJbss3IsNull() {
            addCriterion("JBSS3 is null");
            return (Criteria) this;
        }

        public Criteria andJbss3IsNotNull() {
            addCriterion("JBSS3 is not null");
            return (Criteria) this;
        }

        public Criteria andJbss3EqualTo(String value) {
            addCriterion("JBSS3 =", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3NotEqualTo(String value) {
            addCriterion("JBSS3 <>", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3GreaterThan(String value) {
            addCriterion("JBSS3 >", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3GreaterThanOrEqualTo(String value) {
            addCriterion("JBSS3 >=", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3LessThan(String value) {
            addCriterion("JBSS3 <", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3LessThanOrEqualTo(String value) {
            addCriterion("JBSS3 <=", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3Like(String value) {
            addCriterion("JBSS3 like", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3NotLike(String value) {
            addCriterion("JBSS3 not like", value, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3In(List<String> values) {
            addCriterion("JBSS3 in", values, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3NotIn(List<String> values) {
            addCriterion("JBSS3 not in", values, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3Between(String value1, String value2) {
            addCriterion("JBSS3 between", value1, value2, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss3NotBetween(String value1, String value2) {
            addCriterion("JBSS3 not between", value1, value2, "jbss3");
            return (Criteria) this;
        }

        public Criteria andJbss4IsNull() {
            addCriterion("JBSS4 is null");
            return (Criteria) this;
        }

        public Criteria andJbss4IsNotNull() {
            addCriterion("JBSS4 is not null");
            return (Criteria) this;
        }

        public Criteria andJbss4EqualTo(String value) {
            addCriterion("JBSS4 =", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4NotEqualTo(String value) {
            addCriterion("JBSS4 <>", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4GreaterThan(String value) {
            addCriterion("JBSS4 >", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4GreaterThanOrEqualTo(String value) {
            addCriterion("JBSS4 >=", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4LessThan(String value) {
            addCriterion("JBSS4 <", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4LessThanOrEqualTo(String value) {
            addCriterion("JBSS4 <=", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4Like(String value) {
            addCriterion("JBSS4 like", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4NotLike(String value) {
            addCriterion("JBSS4 not like", value, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4In(List<String> values) {
            addCriterion("JBSS4 in", values, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4NotIn(List<String> values) {
            addCriterion("JBSS4 not in", values, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4Between(String value1, String value2) {
            addCriterion("JBSS4 between", value1, value2, "jbss4");
            return (Criteria) this;
        }

        public Criteria andJbss4NotBetween(String value1, String value2) {
            addCriterion("JBSS4 not between", value1, value2, "jbss4");
            return (Criteria) this;
        }

        public Criteria andRdnr1IsNull() {
            addCriterion("RDNR1 is null");
            return (Criteria) this;
        }

        public Criteria andRdnr1IsNotNull() {
            addCriterion("RDNR1 is not null");
            return (Criteria) this;
        }

        public Criteria andRdnr1EqualTo(String value) {
            addCriterion("RDNR1 =", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1NotEqualTo(String value) {
            addCriterion("RDNR1 <>", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1GreaterThan(String value) {
            addCriterion("RDNR1 >", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1GreaterThanOrEqualTo(String value) {
            addCriterion("RDNR1 >=", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1LessThan(String value) {
            addCriterion("RDNR1 <", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1LessThanOrEqualTo(String value) {
            addCriterion("RDNR1 <=", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1Like(String value) {
            addCriterion("RDNR1 like", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1NotLike(String value) {
            addCriterion("RDNR1 not like", value, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1In(List<String> values) {
            addCriterion("RDNR1 in", values, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1NotIn(List<String> values) {
            addCriterion("RDNR1 not in", values, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1Between(String value1, String value2) {
            addCriterion("RDNR1 between", value1, value2, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr1NotBetween(String value1, String value2) {
            addCriterion("RDNR1 not between", value1, value2, "rdnr1");
            return (Criteria) this;
        }

        public Criteria andRdnr2IsNull() {
            addCriterion("RDNR2 is null");
            return (Criteria) this;
        }

        public Criteria andRdnr2IsNotNull() {
            addCriterion("RDNR2 is not null");
            return (Criteria) this;
        }

        public Criteria andRdnr2EqualTo(String value) {
            addCriterion("RDNR2 =", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2NotEqualTo(String value) {
            addCriterion("RDNR2 <>", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2GreaterThan(String value) {
            addCriterion("RDNR2 >", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2GreaterThanOrEqualTo(String value) {
            addCriterion("RDNR2 >=", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2LessThan(String value) {
            addCriterion("RDNR2 <", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2LessThanOrEqualTo(String value) {
            addCriterion("RDNR2 <=", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2Like(String value) {
            addCriterion("RDNR2 like", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2NotLike(String value) {
            addCriterion("RDNR2 not like", value, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2In(List<String> values) {
            addCriterion("RDNR2 in", values, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2NotIn(List<String> values) {
            addCriterion("RDNR2 not in", values, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2Between(String value1, String value2) {
            addCriterion("RDNR2 between", value1, value2, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr2NotBetween(String value1, String value2) {
            addCriterion("RDNR2 not between", value1, value2, "rdnr2");
            return (Criteria) this;
        }

        public Criteria andRdnr3IsNull() {
            addCriterion("RDNR3 is null");
            return (Criteria) this;
        }

        public Criteria andRdnr3IsNotNull() {
            addCriterion("RDNR3 is not null");
            return (Criteria) this;
        }

        public Criteria andRdnr3EqualTo(String value) {
            addCriterion("RDNR3 =", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3NotEqualTo(String value) {
            addCriterion("RDNR3 <>", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3GreaterThan(String value) {
            addCriterion("RDNR3 >", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3GreaterThanOrEqualTo(String value) {
            addCriterion("RDNR3 >=", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3LessThan(String value) {
            addCriterion("RDNR3 <", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3LessThanOrEqualTo(String value) {
            addCriterion("RDNR3 <=", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3Like(String value) {
            addCriterion("RDNR3 like", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3NotLike(String value) {
            addCriterion("RDNR3 not like", value, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3In(List<String> values) {
            addCriterion("RDNR3 in", values, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3NotIn(List<String> values) {
            addCriterion("RDNR3 not in", values, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3Between(String value1, String value2) {
            addCriterion("RDNR3 between", value1, value2, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr3NotBetween(String value1, String value2) {
            addCriterion("RDNR3 not between", value1, value2, "rdnr3");
            return (Criteria) this;
        }

        public Criteria andRdnr4IsNull() {
            addCriterion("RDNR4 is null");
            return (Criteria) this;
        }

        public Criteria andRdnr4IsNotNull() {
            addCriterion("RDNR4 is not null");
            return (Criteria) this;
        }

        public Criteria andRdnr4EqualTo(String value) {
            addCriterion("RDNR4 =", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4NotEqualTo(String value) {
            addCriterion("RDNR4 <>", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4GreaterThan(String value) {
            addCriterion("RDNR4 >", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4GreaterThanOrEqualTo(String value) {
            addCriterion("RDNR4 >=", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4LessThan(String value) {
            addCriterion("RDNR4 <", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4LessThanOrEqualTo(String value) {
            addCriterion("RDNR4 <=", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4Like(String value) {
            addCriterion("RDNR4 like", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4NotLike(String value) {
            addCriterion("RDNR4 not like", value, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4In(List<String> values) {
            addCriterion("RDNR4 in", values, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4NotIn(List<String> values) {
            addCriterion("RDNR4 not in", values, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4Between(String value1, String value2) {
            addCriterion("RDNR4 between", value1, value2, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andRdnr4NotBetween(String value1, String value2) {
            addCriterion("RDNR4 not between", value1, value2, "rdnr4");
            return (Criteria) this;
        }

        public Criteria andBaryj1IsNull() {
            addCriterion("BARYJ1 is null");
            return (Criteria) this;
        }

        public Criteria andBaryj1IsNotNull() {
            addCriterion("BARYJ1 is not null");
            return (Criteria) this;
        }

        public Criteria andBaryj1EqualTo(String value) {
            addCriterion("BARYJ1 =", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1NotEqualTo(String value) {
            addCriterion("BARYJ1 <>", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1GreaterThan(String value) {
            addCriterion("BARYJ1 >", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1GreaterThanOrEqualTo(String value) {
            addCriterion("BARYJ1 >=", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1LessThan(String value) {
            addCriterion("BARYJ1 <", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1LessThanOrEqualTo(String value) {
            addCriterion("BARYJ1 <=", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1Like(String value) {
            addCriterion("BARYJ1 like", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1NotLike(String value) {
            addCriterion("BARYJ1 not like", value, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1In(List<String> values) {
            addCriterion("BARYJ1 in", values, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1NotIn(List<String> values) {
            addCriterion("BARYJ1 not in", values, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1Between(String value1, String value2) {
            addCriterion("BARYJ1 between", value1, value2, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj1NotBetween(String value1, String value2) {
            addCriterion("BARYJ1 not between", value1, value2, "baryj1");
            return (Criteria) this;
        }

        public Criteria andBaryj2IsNull() {
            addCriterion("BARYJ2 is null");
            return (Criteria) this;
        }

        public Criteria andBaryj2IsNotNull() {
            addCriterion("BARYJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andBaryj2EqualTo(String value) {
            addCriterion("BARYJ2 =", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2NotEqualTo(String value) {
            addCriterion("BARYJ2 <>", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2GreaterThan(String value) {
            addCriterion("BARYJ2 >", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2GreaterThanOrEqualTo(String value) {
            addCriterion("BARYJ2 >=", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2LessThan(String value) {
            addCriterion("BARYJ2 <", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2LessThanOrEqualTo(String value) {
            addCriterion("BARYJ2 <=", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2Like(String value) {
            addCriterion("BARYJ2 like", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2NotLike(String value) {
            addCriterion("BARYJ2 not like", value, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2In(List<String> values) {
            addCriterion("BARYJ2 in", values, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2NotIn(List<String> values) {
            addCriterion("BARYJ2 not in", values, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2Between(String value1, String value2) {
            addCriterion("BARYJ2 between", value1, value2, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj2NotBetween(String value1, String value2) {
            addCriterion("BARYJ2 not between", value1, value2, "baryj2");
            return (Criteria) this;
        }

        public Criteria andBaryj3IsNull() {
            addCriterion("BARYJ3 is null");
            return (Criteria) this;
        }

        public Criteria andBaryj3IsNotNull() {
            addCriterion("BARYJ3 is not null");
            return (Criteria) this;
        }

        public Criteria andBaryj3EqualTo(String value) {
            addCriterion("BARYJ3 =", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3NotEqualTo(String value) {
            addCriterion("BARYJ3 <>", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3GreaterThan(String value) {
            addCriterion("BARYJ3 >", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3GreaterThanOrEqualTo(String value) {
            addCriterion("BARYJ3 >=", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3LessThan(String value) {
            addCriterion("BARYJ3 <", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3LessThanOrEqualTo(String value) {
            addCriterion("BARYJ3 <=", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3Like(String value) {
            addCriterion("BARYJ3 like", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3NotLike(String value) {
            addCriterion("BARYJ3 not like", value, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3In(List<String> values) {
            addCriterion("BARYJ3 in", values, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3NotIn(List<String> values) {
            addCriterion("BARYJ3 not in", values, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3Between(String value1, String value2) {
            addCriterion("BARYJ3 between", value1, value2, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj3NotBetween(String value1, String value2) {
            addCriterion("BARYJ3 not between", value1, value2, "baryj3");
            return (Criteria) this;
        }

        public Criteria andBaryj4IsNull() {
            addCriterion("BARYJ4 is null");
            return (Criteria) this;
        }

        public Criteria andBaryj4IsNotNull() {
            addCriterion("BARYJ4 is not null");
            return (Criteria) this;
        }

        public Criteria andBaryj4EqualTo(String value) {
            addCriterion("BARYJ4 =", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4NotEqualTo(String value) {
            addCriterion("BARYJ4 <>", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4GreaterThan(String value) {
            addCriterion("BARYJ4 >", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4GreaterThanOrEqualTo(String value) {
            addCriterion("BARYJ4 >=", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4LessThan(String value) {
            addCriterion("BARYJ4 <", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4LessThanOrEqualTo(String value) {
            addCriterion("BARYJ4 <=", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4Like(String value) {
            addCriterion("BARYJ4 like", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4NotLike(String value) {
            addCriterion("BARYJ4 not like", value, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4In(List<String> values) {
            addCriterion("BARYJ4 in", values, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4NotIn(List<String> values) {
            addCriterion("BARYJ4 not in", values, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4Between(String value1, String value2) {
            addCriterion("BARYJ4 between", value1, value2, "baryj4");
            return (Criteria) this;
        }

        public Criteria andBaryj4NotBetween(String value1, String value2) {
            addCriterion("BARYJ4 not between", value1, value2, "baryj4");
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