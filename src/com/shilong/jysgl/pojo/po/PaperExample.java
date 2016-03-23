package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperExample() {
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

        public Criteria andPaidIsNull() {
            addCriterion("paid is null");
            return (Criteria) this;
        }

        public Criteria andPaidIsNotNull() {
            addCriterion("paid is not null");
            return (Criteria) this;
        }

        public Criteria andPaidEqualTo(String value) {
            addCriterion("paid =", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotEqualTo(String value) {
            addCriterion("paid <>", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidGreaterThan(String value) {
            addCriterion("paid >", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidGreaterThanOrEqualTo(String value) {
            addCriterion("paid >=", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLessThan(String value) {
            addCriterion("paid <", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLessThanOrEqualTo(String value) {
            addCriterion("paid <=", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLike(String value) {
            addCriterion("paid like", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotLike(String value) {
            addCriterion("paid not like", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidIn(List<String> values) {
            addCriterion("paid in", values, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotIn(List<String> values) {
            addCriterion("paid not in", values, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidBetween(String value1, String value2) {
            addCriterion("paid between", value1, value2, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotBetween(String value1, String value2) {
            addCriterion("paid not between", value1, value2, "paid");
            return (Criteria) this;
        }

        public Criteria andLwtmIsNull() {
            addCriterion("lwtm is null");
            return (Criteria) this;
        }

        public Criteria andLwtmIsNotNull() {
            addCriterion("lwtm is not null");
            return (Criteria) this;
        }

        public Criteria andLwtmEqualTo(String value) {
            addCriterion("lwtm =", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmNotEqualTo(String value) {
            addCriterion("lwtm <>", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmGreaterThan(String value) {
            addCriterion("lwtm >", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmGreaterThanOrEqualTo(String value) {
            addCriterion("lwtm >=", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmLessThan(String value) {
            addCriterion("lwtm <", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmLessThanOrEqualTo(String value) {
            addCriterion("lwtm <=", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmLike(String value) {
            addCriterion("lwtm like", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmNotLike(String value) {
            addCriterion("lwtm not like", value, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmIn(List<String> values) {
            addCriterion("lwtm in", values, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmNotIn(List<String> values) {
            addCriterion("lwtm not in", values, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmBetween(String value1, String value2) {
            addCriterion("lwtm between", value1, value2, "lwtm");
            return (Criteria) this;
        }

        public Criteria andLwtmNotBetween(String value1, String value2) {
            addCriterion("lwtm not between", value1, value2, "lwtm");
            return (Criteria) this;
        }

        public Criteria andFbqkmcIsNull() {
            addCriterion("fbqkmc is null");
            return (Criteria) this;
        }

        public Criteria andFbqkmcIsNotNull() {
            addCriterion("fbqkmc is not null");
            return (Criteria) this;
        }

        public Criteria andFbqkmcEqualTo(String value) {
            addCriterion("fbqkmc =", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcNotEqualTo(String value) {
            addCriterion("fbqkmc <>", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcGreaterThan(String value) {
            addCriterion("fbqkmc >", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcGreaterThanOrEqualTo(String value) {
            addCriterion("fbqkmc >=", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcLessThan(String value) {
            addCriterion("fbqkmc <", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcLessThanOrEqualTo(String value) {
            addCriterion("fbqkmc <=", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcLike(String value) {
            addCriterion("fbqkmc like", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcNotLike(String value) {
            addCriterion("fbqkmc not like", value, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcIn(List<String> values) {
            addCriterion("fbqkmc in", values, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcNotIn(List<String> values) {
            addCriterion("fbqkmc not in", values, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcBetween(String value1, String value2) {
            addCriterion("fbqkmc between", value1, value2, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbqkmcNotBetween(String value1, String value2) {
            addCriterion("fbqkmc not between", value1, value2, "fbqkmc");
            return (Criteria) this;
        }

        public Criteria andFbsjIsNull() {
            addCriterion("fbsj is null");
            return (Criteria) this;
        }

        public Criteria andFbsjIsNotNull() {
            addCriterion("fbsj is not null");
            return (Criteria) this;
        }

        public Criteria andFbsjEqualTo(Date value) {
            addCriterionForJDBCDate("fbsj =", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("fbsj <>", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThan(Date value) {
            addCriterionForJDBCDate("fbsj >", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fbsj >=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThan(Date value) {
            addCriterionForJDBCDate("fbsj <", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fbsj <=", value, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjIn(List<Date> values) {
            addCriterionForJDBCDate("fbsj in", values, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("fbsj not in", values, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fbsj between", value1, value2, "fbsj");
            return (Criteria) this;
        }

        public Criteria andFbsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fbsj not between", value1, value2, "fbsj");
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

        public Criteria andLwshyjIsNull() {
            addCriterion("lwshyj is null");
            return (Criteria) this;
        }

        public Criteria andLwshyjIsNotNull() {
            addCriterion("lwshyj is not null");
            return (Criteria) this;
        }

        public Criteria andLwshyjEqualTo(String value) {
            addCriterion("lwshyj =", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjNotEqualTo(String value) {
            addCriterion("lwshyj <>", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjGreaterThan(String value) {
            addCriterion("lwshyj >", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjGreaterThanOrEqualTo(String value) {
            addCriterion("lwshyj >=", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjLessThan(String value) {
            addCriterion("lwshyj <", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjLessThanOrEqualTo(String value) {
            addCriterion("lwshyj <=", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjLike(String value) {
            addCriterion("lwshyj like", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjNotLike(String value) {
            addCriterion("lwshyj not like", value, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjIn(List<String> values) {
            addCriterion("lwshyj in", values, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjNotIn(List<String> values) {
            addCriterion("lwshyj not in", values, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjBetween(String value1, String value2) {
            addCriterion("lwshyj between", value1, value2, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwshyjNotBetween(String value1, String value2) {
            addCriterion("lwshyj not between", value1, value2, "lwshyj");
            return (Criteria) this;
        }

        public Criteria andLwdcIsNull() {
            addCriterion("lwdc is null");
            return (Criteria) this;
        }

        public Criteria andLwdcIsNotNull() {
            addCriterion("lwdc is not null");
            return (Criteria) this;
        }

        public Criteria andLwdcEqualTo(String value) {
            addCriterion("lwdc =", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcNotEqualTo(String value) {
            addCriterion("lwdc <>", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcGreaterThan(String value) {
            addCriterion("lwdc >", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcGreaterThanOrEqualTo(String value) {
            addCriterion("lwdc >=", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcLessThan(String value) {
            addCriterion("lwdc <", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcLessThanOrEqualTo(String value) {
            addCriterion("lwdc <=", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcLike(String value) {
            addCriterion("lwdc like", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcNotLike(String value) {
            addCriterion("lwdc not like", value, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcIn(List<String> values) {
            addCriterion("lwdc in", values, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcNotIn(List<String> values) {
            addCriterion("lwdc not in", values, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcBetween(String value1, String value2) {
            addCriterion("lwdc between", value1, value2, "lwdc");
            return (Criteria) this;
        }

        public Criteria andLwdcNotBetween(String value1, String value2) {
            addCriterion("lwdc not between", value1, value2, "lwdc");
            return (Criteria) this;
        }

        public Criteria andJszkIsNull() {
            addCriterion("jszk is null");
            return (Criteria) this;
        }

        public Criteria andJszkIsNotNull() {
            addCriterion("jszk is not null");
            return (Criteria) this;
        }

        public Criteria andJszkEqualTo(String value) {
            addCriterion("jszk =", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkNotEqualTo(String value) {
            addCriterion("jszk <>", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkGreaterThan(String value) {
            addCriterion("jszk >", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkGreaterThanOrEqualTo(String value) {
            addCriterion("jszk >=", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkLessThan(String value) {
            addCriterion("jszk <", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkLessThanOrEqualTo(String value) {
            addCriterion("jszk <=", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkLike(String value) {
            addCriterion("jszk like", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkNotLike(String value) {
            addCriterion("jszk not like", value, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkIn(List<String> values) {
            addCriterion("jszk in", values, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkNotIn(List<String> values) {
            addCriterion("jszk not in", values, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkBetween(String value1, String value2) {
            addCriterion("jszk between", value1, value2, "jszk");
            return (Criteria) this;
        }

        public Criteria andJszkNotBetween(String value1, String value2) {
            addCriterion("jszk not between", value1, value2, "jszk");
            return (Criteria) this;
        }

        public Criteria andLwlbIsNull() {
            addCriterion("lwlb is null");
            return (Criteria) this;
        }

        public Criteria andLwlbIsNotNull() {
            addCriterion("lwlb is not null");
            return (Criteria) this;
        }

        public Criteria andLwlbEqualTo(String value) {
            addCriterion("lwlb =", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbNotEqualTo(String value) {
            addCriterion("lwlb <>", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbGreaterThan(String value) {
            addCriterion("lwlb >", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbGreaterThanOrEqualTo(String value) {
            addCriterion("lwlb >=", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbLessThan(String value) {
            addCriterion("lwlb <", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbLessThanOrEqualTo(String value) {
            addCriterion("lwlb <=", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbLike(String value) {
            addCriterion("lwlb like", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbNotLike(String value) {
            addCriterion("lwlb not like", value, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbIn(List<String> values) {
            addCriterion("lwlb in", values, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbNotIn(List<String> values) {
            addCriterion("lwlb not in", values, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbBetween(String value1, String value2) {
            addCriterion("lwlb between", value1, value2, "lwlb");
            return (Criteria) this;
        }

        public Criteria andLwlbNotBetween(String value1, String value2) {
            addCriterion("lwlb not between", value1, value2, "lwlb");
            return (Criteria) this;
        }

        public Criteria andFjIsNull() {
            addCriterion("fj is null");
            return (Criteria) this;
        }

        public Criteria andFjIsNotNull() {
            addCriterion("fj is not null");
            return (Criteria) this;
        }

        public Criteria andFjEqualTo(String value) {
            addCriterion("fj =", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotEqualTo(String value) {
            addCriterion("fj <>", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThan(String value) {
            addCriterion("fj >", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThanOrEqualTo(String value) {
            addCriterion("fj >=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThan(String value) {
            addCriterion("fj <", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThanOrEqualTo(String value) {
            addCriterion("fj <=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLike(String value) {
            addCriterion("fj like", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotLike(String value) {
            addCriterion("fj not like", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjIn(List<String> values) {
            addCriterion("fj in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotIn(List<String> values) {
            addCriterion("fj not in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjBetween(String value1, String value2) {
            addCriterion("fj between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotBetween(String value1, String value2) {
            addCriterion("fj not between", value1, value2, "fj");
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