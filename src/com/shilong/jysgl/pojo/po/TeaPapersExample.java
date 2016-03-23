package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TeaPapersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeaPapersExample() {
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

        public Criteria andSmwcIsNull() {
            addCriterion("smwc is null");
            return (Criteria) this;
        }

        public Criteria andSmwcIsNotNull() {
            addCriterion("smwc is not null");
            return (Criteria) this;
        }

        public Criteria andSmwcEqualTo(String value) {
            addCriterion("smwc =", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcNotEqualTo(String value) {
            addCriterion("smwc <>", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcGreaterThan(String value) {
            addCriterion("smwc >", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcGreaterThanOrEqualTo(String value) {
            addCriterion("smwc >=", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcLessThan(String value) {
            addCriterion("smwc <", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcLessThanOrEqualTo(String value) {
            addCriterion("smwc <=", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcLike(String value) {
            addCriterion("smwc like", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcNotLike(String value) {
            addCriterion("smwc not like", value, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcIn(List<String> values) {
            addCriterion("smwc in", values, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcNotIn(List<String> values) {
            addCriterion("smwc not in", values, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcBetween(String value1, String value2) {
            addCriterion("smwc between", value1, value2, "smwc");
            return (Criteria) this;
        }

        public Criteria andSmwcNotBetween(String value1, String value2) {
            addCriterion("smwc not between", value1, value2, "smwc");
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