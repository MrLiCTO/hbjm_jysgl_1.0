package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTeaidIsNull() {
            addCriterion("teaid is null");
            return (Criteria) this;
        }

        public Criteria andTeaidIsNotNull() {
            addCriterion("teaid is not null");
            return (Criteria) this;
        }

        public Criteria andTeaidEqualTo(String value) {
            addCriterion("teaid =", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotEqualTo(String value) {
            addCriterion("teaid <>", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThan(String value) {
            addCriterion("teaid >", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThanOrEqualTo(String value) {
            addCriterion("teaid >=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThan(String value) {
            addCriterion("teaid <", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThanOrEqualTo(String value) {
            addCriterion("teaid <=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLike(String value) {
            addCriterion("teaid like", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotLike(String value) {
            addCriterion("teaid not like", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidIn(List<String> values) {
            addCriterion("teaid in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotIn(List<String> values) {
            addCriterion("teaid not in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidBetween(String value1, String value2) {
            addCriterion("teaid between", value1, value2, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotBetween(String value1, String value2) {
            addCriterion("teaid not between", value1, value2, "teaid");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andBhIsNull() {
            addCriterion("bh is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("bh is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("bh =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("bh <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("bh >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("bh >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("bh <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("bh <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("bh like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("bh not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("bh in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("bh not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("bh between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("bh not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andJsIsNull() {
            addCriterion("js is null");
            return (Criteria) this;
        }

        public Criteria andJsIsNotNull() {
            addCriterion("js is not null");
            return (Criteria) this;
        }

        public Criteria andJsEqualTo(String value) {
            addCriterion("js =", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotEqualTo(String value) {
            addCriterion("js <>", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThan(String value) {
            addCriterion("js >", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThanOrEqualTo(String value) {
            addCriterion("js >=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThan(String value) {
            addCriterion("js <", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThanOrEqualTo(String value) {
            addCriterion("js <=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLike(String value) {
            addCriterion("js like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotLike(String value) {
            addCriterion("js not like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsIn(List<String> values) {
            addCriterion("js in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotIn(List<String> values) {
            addCriterion("js not in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsBetween(String value1, String value2) {
            addCriterion("js between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotBetween(String value1, String value2) {
            addCriterion("js not between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andMmIsNull() {
            addCriterion("mm is null");
            return (Criteria) this;
        }

        public Criteria andMmIsNotNull() {
            addCriterion("mm is not null");
            return (Criteria) this;
        }

        public Criteria andMmEqualTo(String value) {
            addCriterion("mm =", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotEqualTo(String value) {
            addCriterion("mm <>", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThan(String value) {
            addCriterion("mm >", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThanOrEqualTo(String value) {
            addCriterion("mm >=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThan(String value) {
            addCriterion("mm <", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThanOrEqualTo(String value) {
            addCriterion("mm <=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLike(String value) {
            addCriterion("mm like", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotLike(String value) {
            addCriterion("mm not like", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmIn(List<String> values) {
            addCriterion("mm in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotIn(List<String> values) {
            addCriterion("mm not in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmBetween(String value1, String value2) {
            addCriterion("mm between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotBetween(String value1, String value2) {
            addCriterion("mm not between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXyIsNull() {
            addCriterion("xy is null");
            return (Criteria) this;
        }

        public Criteria andXyIsNotNull() {
            addCriterion("xy is not null");
            return (Criteria) this;
        }

        public Criteria andXyEqualTo(String value) {
            addCriterion("xy =", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotEqualTo(String value) {
            addCriterion("xy <>", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThan(String value) {
            addCriterion("xy >", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyGreaterThanOrEqualTo(String value) {
            addCriterion("xy >=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThan(String value) {
            addCriterion("xy <", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLessThanOrEqualTo(String value) {
            addCriterion("xy <=", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyLike(String value) {
            addCriterion("xy like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotLike(String value) {
            addCriterion("xy not like", value, "xy");
            return (Criteria) this;
        }

        public Criteria andXyIn(List<String> values) {
            addCriterion("xy in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotIn(List<String> values) {
            addCriterion("xy not in", values, "xy");
            return (Criteria) this;
        }

        public Criteria andXyBetween(String value1, String value2) {
            addCriterion("xy between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andXyNotBetween(String value1, String value2) {
            addCriterion("xy not between", value1, value2, "xy");
            return (Criteria) this;
        }

        public Criteria andShztIsNull() {
            addCriterion("shzt is null");
            return (Criteria) this;
        }

        public Criteria andShztIsNotNull() {
            addCriterion("shzt is not null");
            return (Criteria) this;
        }

        public Criteria andShztEqualTo(String value) {
            addCriterion("shzt =", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotEqualTo(String value) {
            addCriterion("shzt <>", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztGreaterThan(String value) {
            addCriterion("shzt >", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztGreaterThanOrEqualTo(String value) {
            addCriterion("shzt >=", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztLessThan(String value) {
            addCriterion("shzt <", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztLessThanOrEqualTo(String value) {
            addCriterion("shzt <=", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztLike(String value) {
            addCriterion("shzt like", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotLike(String value) {
            addCriterion("shzt not like", value, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztIn(List<String> values) {
            addCriterion("shzt in", values, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotIn(List<String> values) {
            addCriterion("shzt not in", values, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztBetween(String value1, String value2) {
            addCriterion("shzt between", value1, value2, "shzt");
            return (Criteria) this;
        }

        public Criteria andShztNotBetween(String value1, String value2) {
            addCriterion("shzt not between", value1, value2, "shzt");
            return (Criteria) this;
        }

        public Criteria andXxshyjIsNull() {
            addCriterion("xxshyj is null");
            return (Criteria) this;
        }

        public Criteria andXxshyjIsNotNull() {
            addCriterion("xxshyj is not null");
            return (Criteria) this;
        }

        public Criteria andXxshyjEqualTo(String value) {
            addCriterion("xxshyj =", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjNotEqualTo(String value) {
            addCriterion("xxshyj <>", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjGreaterThan(String value) {
            addCriterion("xxshyj >", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjGreaterThanOrEqualTo(String value) {
            addCriterion("xxshyj >=", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjLessThan(String value) {
            addCriterion("xxshyj <", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjLessThanOrEqualTo(String value) {
            addCriterion("xxshyj <=", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjLike(String value) {
            addCriterion("xxshyj like", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjNotLike(String value) {
            addCriterion("xxshyj not like", value, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjIn(List<String> values) {
            addCriterion("xxshyj in", values, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjNotIn(List<String> values) {
            addCriterion("xxshyj not in", values, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjBetween(String value1, String value2) {
            addCriterion("xxshyj between", value1, value2, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andXxshyjNotBetween(String value1, String value2) {
            addCriterion("xxshyj not between", value1, value2, "xxshyj");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterionForJDBCDate("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterionForJDBCDate("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterionForJDBCDate("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andZcIsNull() {
            addCriterion("zc is null");
            return (Criteria) this;
        }

        public Criteria andZcIsNotNull() {
            addCriterion("zc is not null");
            return (Criteria) this;
        }

        public Criteria andZcEqualTo(String value) {
            addCriterion("zc =", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotEqualTo(String value) {
            addCriterion("zc <>", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThan(String value) {
            addCriterion("zc >", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThanOrEqualTo(String value) {
            addCriterion("zc >=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThan(String value) {
            addCriterion("zc <", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThanOrEqualTo(String value) {
            addCriterion("zc <=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLike(String value) {
            addCriterion("zc like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotLike(String value) {
            addCriterion("zc not like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcIn(List<String> values) {
            addCriterion("zc in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotIn(List<String> values) {
            addCriterion("zc not in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcBetween(String value1, String value2) {
            addCriterion("zc between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotBetween(String value1, String value2) {
            addCriterion("zc not between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andZzxlIsNull() {
            addCriterion("zzxl is null");
            return (Criteria) this;
        }

        public Criteria andZzxlIsNotNull() {
            addCriterion("zzxl is not null");
            return (Criteria) this;
        }

        public Criteria andZzxlEqualTo(String value) {
            addCriterion("zzxl =", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotEqualTo(String value) {
            addCriterion("zzxl <>", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlGreaterThan(String value) {
            addCriterion("zzxl >", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlGreaterThanOrEqualTo(String value) {
            addCriterion("zzxl >=", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlLessThan(String value) {
            addCriterion("zzxl <", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlLessThanOrEqualTo(String value) {
            addCriterion("zzxl <=", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlLike(String value) {
            addCriterion("zzxl like", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotLike(String value) {
            addCriterion("zzxl not like", value, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlIn(List<String> values) {
            addCriterion("zzxl in", values, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotIn(List<String> values) {
            addCriterion("zzxl not in", values, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlBetween(String value1, String value2) {
            addCriterion("zzxl between", value1, value2, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxlNotBetween(String value1, String value2) {
            addCriterion("zzxl not between", value1, value2, "zzxl");
            return (Criteria) this;
        }

        public Criteria andZzxwIsNull() {
            addCriterion("zzxw is null");
            return (Criteria) this;
        }

        public Criteria andZzxwIsNotNull() {
            addCriterion("zzxw is not null");
            return (Criteria) this;
        }

        public Criteria andZzxwEqualTo(String value) {
            addCriterion("zzxw =", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwNotEqualTo(String value) {
            addCriterion("zzxw <>", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwGreaterThan(String value) {
            addCriterion("zzxw >", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwGreaterThanOrEqualTo(String value) {
            addCriterion("zzxw >=", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwLessThan(String value) {
            addCriterion("zzxw <", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwLessThanOrEqualTo(String value) {
            addCriterion("zzxw <=", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwLike(String value) {
            addCriterion("zzxw like", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwNotLike(String value) {
            addCriterion("zzxw not like", value, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwIn(List<String> values) {
            addCriterion("zzxw in", values, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwNotIn(List<String> values) {
            addCriterion("zzxw not in", values, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwBetween(String value1, String value2) {
            addCriterion("zzxw between", value1, value2, "zzxw");
            return (Criteria) this;
        }

        public Criteria andZzxwNotBetween(String value1, String value2) {
            addCriterion("zzxw not between", value1, value2, "zzxw");
            return (Criteria) this;
        }

        public Criteria andByyxIsNull() {
            addCriterion("byyx is null");
            return (Criteria) this;
        }

        public Criteria andByyxIsNotNull() {
            addCriterion("byyx is not null");
            return (Criteria) this;
        }

        public Criteria andByyxEqualTo(String value) {
            addCriterion("byyx =", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotEqualTo(String value) {
            addCriterion("byyx <>", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxGreaterThan(String value) {
            addCriterion("byyx >", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxGreaterThanOrEqualTo(String value) {
            addCriterion("byyx >=", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLessThan(String value) {
            addCriterion("byyx <", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLessThanOrEqualTo(String value) {
            addCriterion("byyx <=", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxLike(String value) {
            addCriterion("byyx like", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotLike(String value) {
            addCriterion("byyx not like", value, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxIn(List<String> values) {
            addCriterion("byyx in", values, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotIn(List<String> values) {
            addCriterion("byyx not in", values, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxBetween(String value1, String value2) {
            addCriterion("byyx between", value1, value2, "byyx");
            return (Criteria) this;
        }

        public Criteria andByyxNotBetween(String value1, String value2) {
            addCriterion("byyx not between", value1, value2, "byyx");
            return (Criteria) this;
        }

        public Criteria andSxzyIsNull() {
            addCriterion("sxzy is null");
            return (Criteria) this;
        }

        public Criteria andSxzyIsNotNull() {
            addCriterion("sxzy is not null");
            return (Criteria) this;
        }

        public Criteria andSxzyEqualTo(String value) {
            addCriterion("sxzy =", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotEqualTo(String value) {
            addCriterion("sxzy <>", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyGreaterThan(String value) {
            addCriterion("sxzy >", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyGreaterThanOrEqualTo(String value) {
            addCriterion("sxzy >=", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLessThan(String value) {
            addCriterion("sxzy <", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLessThanOrEqualTo(String value) {
            addCriterion("sxzy <=", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLike(String value) {
            addCriterion("sxzy like", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotLike(String value) {
            addCriterion("sxzy not like", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyIn(List<String> values) {
            addCriterion("sxzy in", values, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotIn(List<String> values) {
            addCriterion("sxzy not in", values, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyBetween(String value1, String value2) {
            addCriterion("sxzy between", value1, value2, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotBetween(String value1, String value2) {
            addCriterion("sxzy not between", value1, value2, "sxzy");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andYjfxIsNull() {
            addCriterion("yjfx is null");
            return (Criteria) this;
        }

        public Criteria andYjfxIsNotNull() {
            addCriterion("yjfx is not null");
            return (Criteria) this;
        }

        public Criteria andYjfxEqualTo(String value) {
            addCriterion("yjfx =", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotEqualTo(String value) {
            addCriterion("yjfx <>", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxGreaterThan(String value) {
            addCriterion("yjfx >", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxGreaterThanOrEqualTo(String value) {
            addCriterion("yjfx >=", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxLessThan(String value) {
            addCriterion("yjfx <", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxLessThanOrEqualTo(String value) {
            addCriterion("yjfx <=", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxLike(String value) {
            addCriterion("yjfx like", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotLike(String value) {
            addCriterion("yjfx not like", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxIn(List<String> values) {
            addCriterion("yjfx in", values, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotIn(List<String> values) {
            addCriterion("yjfx not in", values, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxBetween(String value1, String value2) {
            addCriterion("yjfx between", value1, value2, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotBetween(String value1, String value2) {
            addCriterion("yjfx not between", value1, value2, "yjfx");
            return (Criteria) this;
        }

        public Criteria andZzztIsNull() {
            addCriterion("zzzt is null");
            return (Criteria) this;
        }

        public Criteria andZzztIsNotNull() {
            addCriterion("zzzt is not null");
            return (Criteria) this;
        }

        public Criteria andZzztEqualTo(String value) {
            addCriterion("zzzt =", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotEqualTo(String value) {
            addCriterion("zzzt <>", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztGreaterThan(String value) {
            addCriterion("zzzt >", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztGreaterThanOrEqualTo(String value) {
            addCriterion("zzzt >=", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztLessThan(String value) {
            addCriterion("zzzt <", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztLessThanOrEqualTo(String value) {
            addCriterion("zzzt <=", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztLike(String value) {
            addCriterion("zzzt like", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotLike(String value) {
            addCriterion("zzzt not like", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztIn(List<String> values) {
            addCriterion("zzzt in", values, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotIn(List<String> values) {
            addCriterion("zzzt not in", values, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztBetween(String value1, String value2) {
            addCriterion("zzzt between", value1, value2, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotBetween(String value1, String value2) {
            addCriterion("zzzt not between", value1, value2, "zzzt");
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