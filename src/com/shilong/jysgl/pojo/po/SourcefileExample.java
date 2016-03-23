package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SourcefileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcefileExample() {
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

        public Criteria andSfidIsNull() {
            addCriterion("sfid is null");
            return (Criteria) this;
        }

        public Criteria andSfidIsNotNull() {
            addCriterion("sfid is not null");
            return (Criteria) this;
        }

        public Criteria andSfidEqualTo(String value) {
            addCriterion("sfid =", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotEqualTo(String value) {
            addCriterion("sfid <>", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThan(String value) {
            addCriterion("sfid >", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThanOrEqualTo(String value) {
            addCriterion("sfid >=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThan(String value) {
            addCriterion("sfid <", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThanOrEqualTo(String value) {
            addCriterion("sfid <=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLike(String value) {
            addCriterion("sfid like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotLike(String value) {
            addCriterion("sfid not like", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidIn(List<String> values) {
            addCriterion("sfid in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotIn(List<String> values) {
            addCriterion("sfid not in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidBetween(String value1, String value2) {
            addCriterion("sfid between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotBetween(String value1, String value2) {
            addCriterion("sfid not between", value1, value2, "sfid");
            return (Criteria) this;
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andZywjmcIsNull() {
            addCriterion("zywjmc is null");
            return (Criteria) this;
        }

        public Criteria andZywjmcIsNotNull() {
            addCriterion("zywjmc is not null");
            return (Criteria) this;
        }

        public Criteria andZywjmcEqualTo(String value) {
            addCriterion("zywjmc =", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcNotEqualTo(String value) {
            addCriterion("zywjmc <>", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcGreaterThan(String value) {
            addCriterion("zywjmc >", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcGreaterThanOrEqualTo(String value) {
            addCriterion("zywjmc >=", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcLessThan(String value) {
            addCriterion("zywjmc <", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcLessThanOrEqualTo(String value) {
            addCriterion("zywjmc <=", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcLike(String value) {
            addCriterion("zywjmc like", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcNotLike(String value) {
            addCriterion("zywjmc not like", value, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcIn(List<String> values) {
            addCriterion("zywjmc in", values, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcNotIn(List<String> values) {
            addCriterion("zywjmc not in", values, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcBetween(String value1, String value2) {
            addCriterion("zywjmc between", value1, value2, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjmcNotBetween(String value1, String value2) {
            addCriterion("zywjmc not between", value1, value2, "zywjmc");
            return (Criteria) this;
        }

        public Criteria andZywjlxIsNull() {
            addCriterion("zywjlx is null");
            return (Criteria) this;
        }

        public Criteria andZywjlxIsNotNull() {
            addCriterion("zywjlx is not null");
            return (Criteria) this;
        }

        public Criteria andZywjlxEqualTo(String value) {
            addCriterion("zywjlx =", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxNotEqualTo(String value) {
            addCriterion("zywjlx <>", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxGreaterThan(String value) {
            addCriterion("zywjlx >", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxGreaterThanOrEqualTo(String value) {
            addCriterion("zywjlx >=", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxLessThan(String value) {
            addCriterion("zywjlx <", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxLessThanOrEqualTo(String value) {
            addCriterion("zywjlx <=", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxLike(String value) {
            addCriterion("zywjlx like", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxNotLike(String value) {
            addCriterion("zywjlx not like", value, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxIn(List<String> values) {
            addCriterion("zywjlx in", values, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxNotIn(List<String> values) {
            addCriterion("zywjlx not in", values, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxBetween(String value1, String value2) {
            addCriterion("zywjlx between", value1, value2, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andZywjlxNotBetween(String value1, String value2) {
            addCriterion("zywjlx not between", value1, value2, "zywjlx");
            return (Criteria) this;
        }

        public Criteria andWjljIsNull() {
            addCriterion("wjlj is null");
            return (Criteria) this;
        }

        public Criteria andWjljIsNotNull() {
            addCriterion("wjlj is not null");
            return (Criteria) this;
        }

        public Criteria andWjljEqualTo(String value) {
            addCriterion("wjlj =", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotEqualTo(String value) {
            addCriterion("wjlj <>", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljGreaterThan(String value) {
            addCriterion("wjlj >", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljGreaterThanOrEqualTo(String value) {
            addCriterion("wjlj >=", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljLessThan(String value) {
            addCriterion("wjlj <", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljLessThanOrEqualTo(String value) {
            addCriterion("wjlj <=", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljLike(String value) {
            addCriterion("wjlj like", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotLike(String value) {
            addCriterion("wjlj not like", value, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljIn(List<String> values) {
            addCriterion("wjlj in", values, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotIn(List<String> values) {
            addCriterion("wjlj not in", values, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljBetween(String value1, String value2) {
            addCriterion("wjlj between", value1, value2, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjljNotBetween(String value1, String value2) {
            addCriterion("wjlj not between", value1, value2, "wjlj");
            return (Criteria) this;
        }

        public Criteria andWjdxIsNull() {
            addCriterion("wjdx is null");
            return (Criteria) this;
        }

        public Criteria andWjdxIsNotNull() {
            addCriterion("wjdx is not null");
            return (Criteria) this;
        }

        public Criteria andWjdxEqualTo(Long value) {
            addCriterion("wjdx =", value, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxNotEqualTo(Long value) {
            addCriterion("wjdx <>", value, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxGreaterThan(Long value) {
            addCriterion("wjdx >", value, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxGreaterThanOrEqualTo(Long value) {
            addCriterion("wjdx >=", value, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxLessThan(Long value) {
            addCriterion("wjdx <", value, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxLessThanOrEqualTo(Long value) {
            addCriterion("wjdx <=", value, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxIn(List<Long> values) {
            addCriterion("wjdx in", values, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxNotIn(List<Long> values) {
            addCriterion("wjdx not in", values, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxBetween(Long value1, Long value2) {
            addCriterion("wjdx between", value1, value2, "wjdx");
            return (Criteria) this;
        }

        public Criteria andWjdxNotBetween(Long value1, Long value2) {
            addCriterion("wjdx not between", value1, value2, "wjdx");
            return (Criteria) this;
        }

        public Criteria andScsjIsNull() {
            addCriterion("scsj is null");
            return (Criteria) this;
        }

        public Criteria andScsjIsNotNull() {
            addCriterion("scsj is not null");
            return (Criteria) this;
        }

        public Criteria andScsjEqualTo(Date value) {
            addCriterionForJDBCDate("scsj =", value, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("scsj <>", value, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjGreaterThan(Date value) {
            addCriterionForJDBCDate("scsj >", value, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scsj >=", value, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjLessThan(Date value) {
            addCriterionForJDBCDate("scsj <", value, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scsj <=", value, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjIn(List<Date> values) {
            addCriterionForJDBCDate("scsj in", values, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("scsj not in", values, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scsj between", value1, value2, "scsj");
            return (Criteria) this;
        }

        public Criteria andScsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scsj not between", value1, value2, "scsj");
            return (Criteria) this;
        }

        public Criteria andXzcsIsNull() {
            addCriterion("xzcs is null");
            return (Criteria) this;
        }

        public Criteria andXzcsIsNotNull() {
            addCriterion("xzcs is not null");
            return (Criteria) this;
        }

        public Criteria andXzcsEqualTo(Integer value) {
            addCriterion("xzcs =", value, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsNotEqualTo(Integer value) {
            addCriterion("xzcs <>", value, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsGreaterThan(Integer value) {
            addCriterion("xzcs >", value, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsGreaterThanOrEqualTo(Integer value) {
            addCriterion("xzcs >=", value, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsLessThan(Integer value) {
            addCriterion("xzcs <", value, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsLessThanOrEqualTo(Integer value) {
            addCriterion("xzcs <=", value, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsIn(List<Integer> values) {
            addCriterion("xzcs in", values, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsNotIn(List<Integer> values) {
            addCriterion("xzcs not in", values, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsBetween(Integer value1, Integer value2) {
            addCriterion("xzcs between", value1, value2, "xzcs");
            return (Criteria) this;
        }

        public Criteria andXzcsNotBetween(Integer value1, Integer value2) {
            addCriterion("xzcs not between", value1, value2, "xzcs");
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