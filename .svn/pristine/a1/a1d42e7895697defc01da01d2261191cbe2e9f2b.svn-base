package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AwardstuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardstuExample() {
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

        public Criteria andSaidIsNull() {
            addCriterion("said is null");
            return (Criteria) this;
        }

        public Criteria andSaidIsNotNull() {
            addCriterion("said is not null");
            return (Criteria) this;
        }

        public Criteria andSaidEqualTo(String value) {
            addCriterion("said =", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotEqualTo(String value) {
            addCriterion("said <>", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidGreaterThan(String value) {
            addCriterion("said >", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidGreaterThanOrEqualTo(String value) {
            addCriterion("said >=", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidLessThan(String value) {
            addCriterion("said <", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidLessThanOrEqualTo(String value) {
            addCriterion("said <=", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidLike(String value) {
            addCriterion("said like", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotLike(String value) {
            addCriterion("said not like", value, "said");
            return (Criteria) this;
        }

        public Criteria andSaidIn(List<String> values) {
            addCriterion("said in", values, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotIn(List<String> values) {
            addCriterion("said not in", values, "said");
            return (Criteria) this;
        }

        public Criteria andSaidBetween(String value1, String value2) {
            addCriterion("said between", value1, value2, "said");
            return (Criteria) this;
        }

        public Criteria andSaidNotBetween(String value1, String value2) {
            addCriterion("said not between", value1, value2, "said");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(String value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(String value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(String value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(String value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(String value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(String value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLike(String value) {
            addCriterion("stuid like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotLike(String value) {
            addCriterion("stuid not like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<String> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<String> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(String value1, String value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(String value1, String value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
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

        public Criteria andJxmcIsNull() {
            addCriterion("jxmc is null");
            return (Criteria) this;
        }

        public Criteria andJxmcIsNotNull() {
            addCriterion("jxmc is not null");
            return (Criteria) this;
        }

        public Criteria andJxmcEqualTo(String value) {
            addCriterion("jxmc =", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcNotEqualTo(String value) {
            addCriterion("jxmc <>", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcGreaterThan(String value) {
            addCriterion("jxmc >", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcGreaterThanOrEqualTo(String value) {
            addCriterion("jxmc >=", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcLessThan(String value) {
            addCriterion("jxmc <", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcLessThanOrEqualTo(String value) {
            addCriterion("jxmc <=", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcLike(String value) {
            addCriterion("jxmc like", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcNotLike(String value) {
            addCriterion("jxmc not like", value, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcIn(List<String> values) {
            addCriterion("jxmc in", values, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcNotIn(List<String> values) {
            addCriterion("jxmc not in", values, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcBetween(String value1, String value2) {
            addCriterion("jxmc between", value1, value2, "jxmc");
            return (Criteria) this;
        }

        public Criteria andJxmcNotBetween(String value1, String value2) {
            addCriterion("jxmc not between", value1, value2, "jxmc");
            return (Criteria) this;
        }

        public Criteria andBfdwIsNull() {
            addCriterion("bfdw is null");
            return (Criteria) this;
        }

        public Criteria andBfdwIsNotNull() {
            addCriterion("bfdw is not null");
            return (Criteria) this;
        }

        public Criteria andBfdwEqualTo(String value) {
            addCriterion("bfdw =", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwNotEqualTo(String value) {
            addCriterion("bfdw <>", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwGreaterThan(String value) {
            addCriterion("bfdw >", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwGreaterThanOrEqualTo(String value) {
            addCriterion("bfdw >=", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwLessThan(String value) {
            addCriterion("bfdw <", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwLessThanOrEqualTo(String value) {
            addCriterion("bfdw <=", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwLike(String value) {
            addCriterion("bfdw like", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwNotLike(String value) {
            addCriterion("bfdw not like", value, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwIn(List<String> values) {
            addCriterion("bfdw in", values, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwNotIn(List<String> values) {
            addCriterion("bfdw not in", values, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwBetween(String value1, String value2) {
            addCriterion("bfdw between", value1, value2, "bfdw");
            return (Criteria) this;
        }

        public Criteria andBfdwNotBetween(String value1, String value2) {
            addCriterion("bfdw not between", value1, value2, "bfdw");
            return (Criteria) this;
        }

        public Criteria andHjsjIsNull() {
            addCriterion("hjsj is null");
            return (Criteria) this;
        }

        public Criteria andHjsjIsNotNull() {
            addCriterion("hjsj is not null");
            return (Criteria) this;
        }

        public Criteria andHjsjEqualTo(Date value) {
            addCriterionForJDBCDate("hjsj =", value, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("hjsj <>", value, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("hjsj >", value, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hjsj >=", value, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjLessThan(Date value) {
            addCriterionForJDBCDate("hjsj <", value, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hjsj <=", value, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjIn(List<Date> values) {
            addCriterionForJDBCDate("hjsj in", values, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("hjsj not in", values, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hjsj between", value1, value2, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hjsj not between", value1, value2, "hjsj");
            return (Criteria) this;
        }

        public Criteria andHjjbIsNull() {
            addCriterion("hjjb is null");
            return (Criteria) this;
        }

        public Criteria andHjjbIsNotNull() {
            addCriterion("hjjb is not null");
            return (Criteria) this;
        }

        public Criteria andHjjbEqualTo(String value) {
            addCriterion("hjjb =", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbNotEqualTo(String value) {
            addCriterion("hjjb <>", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbGreaterThan(String value) {
            addCriterion("hjjb >", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbGreaterThanOrEqualTo(String value) {
            addCriterion("hjjb >=", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbLessThan(String value) {
            addCriterion("hjjb <", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbLessThanOrEqualTo(String value) {
            addCriterion("hjjb <=", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbLike(String value) {
            addCriterion("hjjb like", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbNotLike(String value) {
            addCriterion("hjjb not like", value, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbIn(List<String> values) {
            addCriterion("hjjb in", values, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbNotIn(List<String> values) {
            addCriterion("hjjb not in", values, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbBetween(String value1, String value2) {
            addCriterion("hjjb between", value1, value2, "hjjb");
            return (Criteria) this;
        }

        public Criteria andHjjbNotBetween(String value1, String value2) {
            addCriterion("hjjb not between", value1, value2, "hjjb");
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

        public Criteria andJxshyjIsNull() {
            addCriterion("jxshyj is null");
            return (Criteria) this;
        }

        public Criteria andJxshyjIsNotNull() {
            addCriterion("jxshyj is not null");
            return (Criteria) this;
        }

        public Criteria andJxshyjEqualTo(String value) {
            addCriterion("jxshyj =", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjNotEqualTo(String value) {
            addCriterion("jxshyj <>", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjGreaterThan(String value) {
            addCriterion("jxshyj >", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjGreaterThanOrEqualTo(String value) {
            addCriterion("jxshyj >=", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjLessThan(String value) {
            addCriterion("jxshyj <", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjLessThanOrEqualTo(String value) {
            addCriterion("jxshyj <=", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjLike(String value) {
            addCriterion("jxshyj like", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjNotLike(String value) {
            addCriterion("jxshyj not like", value, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjIn(List<String> values) {
            addCriterion("jxshyj in", values, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjNotIn(List<String> values) {
            addCriterion("jxshyj not in", values, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjBetween(String value1, String value2) {
            addCriterion("jxshyj between", value1, value2, "jxshyj");
            return (Criteria) this;
        }

        public Criteria andJxshyjNotBetween(String value1, String value2) {
            addCriterion("jxshyj not between", value1, value2, "jxshyj");
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