package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(String value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(String value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(String value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(String value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(String value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(String value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLike(String value) {
            addCriterion("bid like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotLike(String value) {
            addCriterion("bid not like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<String> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<String> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(String value1, String value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(String value1, String value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andZzmcIsNull() {
            addCriterion("zzmc is null");
            return (Criteria) this;
        }

        public Criteria andZzmcIsNotNull() {
            addCriterion("zzmc is not null");
            return (Criteria) this;
        }

        public Criteria andZzmcEqualTo(String value) {
            addCriterion("zzmc =", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcNotEqualTo(String value) {
            addCriterion("zzmc <>", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcGreaterThan(String value) {
            addCriterion("zzmc >", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcGreaterThanOrEqualTo(String value) {
            addCriterion("zzmc >=", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcLessThan(String value) {
            addCriterion("zzmc <", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcLessThanOrEqualTo(String value) {
            addCriterion("zzmc <=", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcLike(String value) {
            addCriterion("zzmc like", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcNotLike(String value) {
            addCriterion("zzmc not like", value, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcIn(List<String> values) {
            addCriterion("zzmc in", values, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcNotIn(List<String> values) {
            addCriterion("zzmc not in", values, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcBetween(String value1, String value2) {
            addCriterion("zzmc between", value1, value2, "zzmc");
            return (Criteria) this;
        }

        public Criteria andZzmcNotBetween(String value1, String value2) {
            addCriterion("zzmc not between", value1, value2, "zzmc");
            return (Criteria) this;
        }

        public Criteria andCbsIsNull() {
            addCriterion("cbs is null");
            return (Criteria) this;
        }

        public Criteria andCbsIsNotNull() {
            addCriterion("cbs is not null");
            return (Criteria) this;
        }

        public Criteria andCbsEqualTo(String value) {
            addCriterion("cbs =", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsNotEqualTo(String value) {
            addCriterion("cbs <>", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsGreaterThan(String value) {
            addCriterion("cbs >", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsGreaterThanOrEqualTo(String value) {
            addCriterion("cbs >=", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsLessThan(String value) {
            addCriterion("cbs <", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsLessThanOrEqualTo(String value) {
            addCriterion("cbs <=", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsLike(String value) {
            addCriterion("cbs like", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsNotLike(String value) {
            addCriterion("cbs not like", value, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsIn(List<String> values) {
            addCriterion("cbs in", values, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsNotIn(List<String> values) {
            addCriterion("cbs not in", values, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsBetween(String value1, String value2) {
            addCriterion("cbs between", value1, value2, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsNotBetween(String value1, String value2) {
            addCriterion("cbs not between", value1, value2, "cbs");
            return (Criteria) this;
        }

        public Criteria andCbsjIsNull() {
            addCriterion("cbsj is null");
            return (Criteria) this;
        }

        public Criteria andCbsjIsNotNull() {
            addCriterion("cbsj is not null");
            return (Criteria) this;
        }

        public Criteria andCbsjEqualTo(Date value) {
            addCriterionForJDBCDate("cbsj =", value, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("cbsj <>", value, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjGreaterThan(Date value) {
            addCriterionForJDBCDate("cbsj >", value, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbsj >=", value, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjLessThan(Date value) {
            addCriterionForJDBCDate("cbsj <", value, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbsj <=", value, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjIn(List<Date> values) {
            addCriterionForJDBCDate("cbsj in", values, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("cbsj not in", values, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbsj between", value1, value2, "cbsj");
            return (Criteria) this;
        }

        public Criteria andCbsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbsj not between", value1, value2, "cbsj");
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

        public Criteria andZzshyjIsNull() {
            addCriterion("zzshyj is null");
            return (Criteria) this;
        }

        public Criteria andZzshyjIsNotNull() {
            addCriterion("zzshyj is not null");
            return (Criteria) this;
        }

        public Criteria andZzshyjEqualTo(String value) {
            addCriterion("zzshyj =", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjNotEqualTo(String value) {
            addCriterion("zzshyj <>", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjGreaterThan(String value) {
            addCriterion("zzshyj >", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjGreaterThanOrEqualTo(String value) {
            addCriterion("zzshyj >=", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjLessThan(String value) {
            addCriterion("zzshyj <", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjLessThanOrEqualTo(String value) {
            addCriterion("zzshyj <=", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjLike(String value) {
            addCriterion("zzshyj like", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjNotLike(String value) {
            addCriterion("zzshyj not like", value, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjIn(List<String> values) {
            addCriterion("zzshyj in", values, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjNotIn(List<String> values) {
            addCriterion("zzshyj not in", values, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjBetween(String value1, String value2) {
            addCriterion("zzshyj between", value1, value2, "zzshyj");
            return (Criteria) this;
        }

        public Criteria andZzshyjNotBetween(String value1, String value2) {
            addCriterion("zzshyj not between", value1, value2, "zzshyj");
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