package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DictinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictinfoExample() {
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

        public Criteria andDictcodeIsNull() {
            addCriterion("dictcode is null");
            return (Criteria) this;
        }

        public Criteria andDictcodeIsNotNull() {
            addCriterion("dictcode is not null");
            return (Criteria) this;
        }

        public Criteria andDictcodeEqualTo(String value) {
            addCriterion("dictcode =", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotEqualTo(String value) {
            addCriterion("dictcode <>", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeGreaterThan(String value) {
            addCriterion("dictcode >", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictcode >=", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLessThan(String value) {
            addCriterion("dictcode <", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLessThanOrEqualTo(String value) {
            addCriterion("dictcode <=", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLike(String value) {
            addCriterion("dictcode like", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotLike(String value) {
            addCriterion("dictcode not like", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeIn(List<String> values) {
            addCriterion("dictcode in", values, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotIn(List<String> values) {
            addCriterion("dictcode not in", values, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeBetween(String value1, String value2) {
            addCriterion("dictcode between", value1, value2, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotBetween(String value1, String value2) {
            addCriterion("dictcode not between", value1, value2, "dictcode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNull() {
            addCriterion("typecode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typecode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typecode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typecode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typecode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typecode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typecode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typecode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typecode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typecode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("typecode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("typecode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typecode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typecode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andDictinfoIsNull() {
            addCriterion("dictinfo is null");
            return (Criteria) this;
        }

        public Criteria andDictinfoIsNotNull() {
            addCriterion("dictinfo is not null");
            return (Criteria) this;
        }

        public Criteria andDictinfoEqualTo(String value) {
            addCriterion("dictinfo =", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoNotEqualTo(String value) {
            addCriterion("dictinfo <>", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoGreaterThan(String value) {
            addCriterion("dictinfo >", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoGreaterThanOrEqualTo(String value) {
            addCriterion("dictinfo >=", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoLessThan(String value) {
            addCriterion("dictinfo <", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoLessThanOrEqualTo(String value) {
            addCriterion("dictinfo <=", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoLike(String value) {
            addCriterion("dictinfo like", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoNotLike(String value) {
            addCriterion("dictinfo not like", value, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoIn(List<String> values) {
            addCriterion("dictinfo in", values, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoNotIn(List<String> values) {
            addCriterion("dictinfo not in", values, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoBetween(String value1, String value2) {
            addCriterion("dictinfo between", value1, value2, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andDictinfoNotBetween(String value1, String value2) {
            addCriterion("dictinfo not between", value1, value2, "dictinfo");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNull() {
            addCriterion("isenable is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("isenable is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(String value) {
            addCriterion("isenable =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(String value) {
            addCriterion("isenable <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(String value) {
            addCriterion("isenable >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(String value) {
            addCriterion("isenable >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(String value) {
            addCriterion("isenable <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(String value) {
            addCriterion("isenable <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLike(String value) {
            addCriterion("isenable like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotLike(String value) {
            addCriterion("isenable not like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<String> values) {
            addCriterion("isenable in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<String> values) {
            addCriterion("isenable not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(String value1, String value2) {
            addCriterion("isenable between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(String value1, String value2) {
            addCriterion("isenable not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andDictsortIsNull() {
            addCriterion("dictsort is null");
            return (Criteria) this;
        }

        public Criteria andDictsortIsNotNull() {
            addCriterion("dictsort is not null");
            return (Criteria) this;
        }

        public Criteria andDictsortEqualTo(Integer value) {
            addCriterion("dictsort =", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotEqualTo(Integer value) {
            addCriterion("dictsort <>", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortGreaterThan(Integer value) {
            addCriterion("dictsort >", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictsort >=", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortLessThan(Integer value) {
            addCriterion("dictsort <", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortLessThanOrEqualTo(Integer value) {
            addCriterion("dictsort <=", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortIn(List<Integer> values) {
            addCriterion("dictsort in", values, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotIn(List<Integer> values) {
            addCriterion("dictsort not in", values, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortBetween(Integer value1, Integer value2) {
            addCriterion("dictsort between", value1, value2, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotBetween(Integer value1, Integer value2) {
            addCriterion("dictsort not between", value1, value2, "dictsort");
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