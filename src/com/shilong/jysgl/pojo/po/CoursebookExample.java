package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CoursebookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursebookExample() {
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

        public Criteria andJcidIsNull() {
            addCriterion("jcid is null");
            return (Criteria) this;
        }

        public Criteria andJcidIsNotNull() {
            addCriterion("jcid is not null");
            return (Criteria) this;
        }

        public Criteria andJcidEqualTo(String value) {
            addCriterion("jcid =", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidNotEqualTo(String value) {
            addCriterion("jcid <>", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidGreaterThan(String value) {
            addCriterion("jcid >", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidGreaterThanOrEqualTo(String value) {
            addCriterion("jcid >=", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidLessThan(String value) {
            addCriterion("jcid <", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidLessThanOrEqualTo(String value) {
            addCriterion("jcid <=", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidLike(String value) {
            addCriterion("jcid like", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidNotLike(String value) {
            addCriterion("jcid not like", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidIn(List<String> values) {
            addCriterion("jcid in", values, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidNotIn(List<String> values) {
            addCriterion("jcid not in", values, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidBetween(String value1, String value2) {
            addCriterion("jcid between", value1, value2, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidNotBetween(String value1, String value2) {
            addCriterion("jcid not between", value1, value2, "jcid");
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

        public Criteria andJcmcIsNull() {
            addCriterion("jcmc is null");
            return (Criteria) this;
        }

        public Criteria andJcmcIsNotNull() {
            addCriterion("jcmc is not null");
            return (Criteria) this;
        }

        public Criteria andJcmcEqualTo(String value) {
            addCriterion("jcmc =", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcNotEqualTo(String value) {
            addCriterion("jcmc <>", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcGreaterThan(String value) {
            addCriterion("jcmc >", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcGreaterThanOrEqualTo(String value) {
            addCriterion("jcmc >=", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcLessThan(String value) {
            addCriterion("jcmc <", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcLessThanOrEqualTo(String value) {
            addCriterion("jcmc <=", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcLike(String value) {
            addCriterion("jcmc like", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcNotLike(String value) {
            addCriterion("jcmc not like", value, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcIn(List<String> values) {
            addCriterion("jcmc in", values, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcNotIn(List<String> values) {
            addCriterion("jcmc not in", values, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcBetween(String value1, String value2) {
            addCriterion("jcmc between", value1, value2, "jcmc");
            return (Criteria) this;
        }

        public Criteria andJcmcNotBetween(String value1, String value2) {
            addCriterion("jcmc not between", value1, value2, "jcmc");
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

        public Criteria andCsxlIsNull() {
            addCriterion("csxl is null");
            return (Criteria) this;
        }

        public Criteria andCsxlIsNotNull() {
            addCriterion("csxl is not null");
            return (Criteria) this;
        }

        public Criteria andCsxlEqualTo(String value) {
            addCriterion("csxl =", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlNotEqualTo(String value) {
            addCriterion("csxl <>", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlGreaterThan(String value) {
            addCriterion("csxl >", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlGreaterThanOrEqualTo(String value) {
            addCriterion("csxl >=", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlLessThan(String value) {
            addCriterion("csxl <", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlLessThanOrEqualTo(String value) {
            addCriterion("csxl <=", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlLike(String value) {
            addCriterion("csxl like", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlNotLike(String value) {
            addCriterion("csxl not like", value, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlIn(List<String> values) {
            addCriterion("csxl in", values, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlNotIn(List<String> values) {
            addCriterion("csxl not in", values, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlBetween(String value1, String value2) {
            addCriterion("csxl between", value1, value2, "csxl");
            return (Criteria) this;
        }

        public Criteria andCsxlNotBetween(String value1, String value2) {
            addCriterion("csxl not between", value1, value2, "csxl");
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