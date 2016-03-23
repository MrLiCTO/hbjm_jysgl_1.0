package com.shilong.jysgl.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andPridIsNull() {
            addCriterion("prid is null");
            return (Criteria) this;
        }

        public Criteria andPridIsNotNull() {
            addCriterion("prid is not null");
            return (Criteria) this;
        }

        public Criteria andPridEqualTo(String value) {
            addCriterion("prid =", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridNotEqualTo(String value) {
            addCriterion("prid <>", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridGreaterThan(String value) {
            addCriterion("prid >", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridGreaterThanOrEqualTo(String value) {
            addCriterion("prid >=", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridLessThan(String value) {
            addCriterion("prid <", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridLessThanOrEqualTo(String value) {
            addCriterion("prid <=", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridLike(String value) {
            addCriterion("prid like", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridNotLike(String value) {
            addCriterion("prid not like", value, "prid");
            return (Criteria) this;
        }

        public Criteria andPridIn(List<String> values) {
            addCriterion("prid in", values, "prid");
            return (Criteria) this;
        }

        public Criteria andPridNotIn(List<String> values) {
            addCriterion("prid not in", values, "prid");
            return (Criteria) this;
        }

        public Criteria andPridBetween(String value1, String value2) {
            addCriterion("prid between", value1, value2, "prid");
            return (Criteria) this;
        }

        public Criteria andPridNotBetween(String value1, String value2) {
            addCriterion("prid not between", value1, value2, "prid");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNull() {
            addCriterion("xmmc is null");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNotNull() {
            addCriterion("xmmc is not null");
            return (Criteria) this;
        }

        public Criteria andXmmcEqualTo(String value) {
            addCriterion("xmmc =", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotEqualTo(String value) {
            addCriterion("xmmc <>", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThan(String value) {
            addCriterion("xmmc >", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThanOrEqualTo(String value) {
            addCriterion("xmmc >=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThan(String value) {
            addCriterion("xmmc <", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThanOrEqualTo(String value) {
            addCriterion("xmmc <=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLike(String value) {
            addCriterion("xmmc like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotLike(String value) {
            addCriterion("xmmc not like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcIn(List<String> values) {
            addCriterion("xmmc in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotIn(List<String> values) {
            addCriterion("xmmc not in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcBetween(String value1, String value2) {
            addCriterion("xmmc between", value1, value2, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotBetween(String value1, String value2) {
            addCriterion("xmmc not between", value1, value2, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmbhIsNull() {
            addCriterion("xmbh is null");
            return (Criteria) this;
        }

        public Criteria andXmbhIsNotNull() {
            addCriterion("xmbh is not null");
            return (Criteria) this;
        }

        public Criteria andXmbhEqualTo(String value) {
            addCriterion("xmbh =", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotEqualTo(String value) {
            addCriterion("xmbh <>", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhGreaterThan(String value) {
            addCriterion("xmbh >", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhGreaterThanOrEqualTo(String value) {
            addCriterion("xmbh >=", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLessThan(String value) {
            addCriterion("xmbh <", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLessThanOrEqualTo(String value) {
            addCriterion("xmbh <=", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLike(String value) {
            addCriterion("xmbh like", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotLike(String value) {
            addCriterion("xmbh not like", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhIn(List<String> values) {
            addCriterion("xmbh in", values, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotIn(List<String> values) {
            addCriterion("xmbh not in", values, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhBetween(String value1, String value2) {
            addCriterion("xmbh between", value1, value2, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotBetween(String value1, String value2) {
            addCriterion("xmbh not between", value1, value2, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmjbIsNull() {
            addCriterion("xmjb is null");
            return (Criteria) this;
        }

        public Criteria andXmjbIsNotNull() {
            addCriterion("xmjb is not null");
            return (Criteria) this;
        }

        public Criteria andXmjbEqualTo(String value) {
            addCriterion("xmjb =", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbNotEqualTo(String value) {
            addCriterion("xmjb <>", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbGreaterThan(String value) {
            addCriterion("xmjb >", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbGreaterThanOrEqualTo(String value) {
            addCriterion("xmjb >=", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbLessThan(String value) {
            addCriterion("xmjb <", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbLessThanOrEqualTo(String value) {
            addCriterion("xmjb <=", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbLike(String value) {
            addCriterion("xmjb like", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbNotLike(String value) {
            addCriterion("xmjb not like", value, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbIn(List<String> values) {
            addCriterion("xmjb in", values, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbNotIn(List<String> values) {
            addCriterion("xmjb not in", values, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbBetween(String value1, String value2) {
            addCriterion("xmjb between", value1, value2, "xmjb");
            return (Criteria) this;
        }

        public Criteria andXmjbNotBetween(String value1, String value2) {
            addCriterion("xmjb not between", value1, value2, "xmjb");
            return (Criteria) this;
        }

        public Criteria andPzdwIsNull() {
            addCriterion("pzdw is null");
            return (Criteria) this;
        }

        public Criteria andPzdwIsNotNull() {
            addCriterion("pzdw is not null");
            return (Criteria) this;
        }

        public Criteria andPzdwEqualTo(String value) {
            addCriterion("pzdw =", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwNotEqualTo(String value) {
            addCriterion("pzdw <>", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwGreaterThan(String value) {
            addCriterion("pzdw >", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwGreaterThanOrEqualTo(String value) {
            addCriterion("pzdw >=", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwLessThan(String value) {
            addCriterion("pzdw <", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwLessThanOrEqualTo(String value) {
            addCriterion("pzdw <=", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwLike(String value) {
            addCriterion("pzdw like", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwNotLike(String value) {
            addCriterion("pzdw not like", value, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwIn(List<String> values) {
            addCriterion("pzdw in", values, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwNotIn(List<String> values) {
            addCriterion("pzdw not in", values, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwBetween(String value1, String value2) {
            addCriterion("pzdw between", value1, value2, "pzdw");
            return (Criteria) this;
        }

        public Criteria andPzdwNotBetween(String value1, String value2) {
            addCriterion("pzdw not between", value1, value2, "pzdw");
            return (Criteria) this;
        }

        public Criteria andXmlxIsNull() {
            addCriterion("xmlx is null");
            return (Criteria) this;
        }

        public Criteria andXmlxIsNotNull() {
            addCriterion("xmlx is not null");
            return (Criteria) this;
        }

        public Criteria andXmlxEqualTo(String value) {
            addCriterion("xmlx =", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotEqualTo(String value) {
            addCriterion("xmlx <>", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxGreaterThan(String value) {
            addCriterion("xmlx >", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxGreaterThanOrEqualTo(String value) {
            addCriterion("xmlx >=", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxLessThan(String value) {
            addCriterion("xmlx <", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxLessThanOrEqualTo(String value) {
            addCriterion("xmlx <=", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxLike(String value) {
            addCriterion("xmlx like", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotLike(String value) {
            addCriterion("xmlx not like", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxIn(List<String> values) {
            addCriterion("xmlx in", values, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotIn(List<String> values) {
            addCriterion("xmlx not in", values, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxBetween(String value1, String value2) {
            addCriterion("xmlx between", value1, value2, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotBetween(String value1, String value2) {
            addCriterion("xmlx not between", value1, value2, "xmlx");
            return (Criteria) this;
        }

        public Criteria andLxsjIsNull() {
            addCriterion("lxsj is null");
            return (Criteria) this;
        }

        public Criteria andLxsjIsNotNull() {
            addCriterion("lxsj is not null");
            return (Criteria) this;
        }

        public Criteria andLxsjEqualTo(Date value) {
            addCriterionForJDBCDate("lxsj =", value, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("lxsj <>", value, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjGreaterThan(Date value) {
            addCriterionForJDBCDate("lxsj >", value, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lxsj >=", value, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjLessThan(Date value) {
            addCriterionForJDBCDate("lxsj <", value, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lxsj <=", value, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjIn(List<Date> values) {
            addCriterionForJDBCDate("lxsj in", values, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("lxsj not in", values, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lxsj between", value1, value2, "lxsj");
            return (Criteria) this;
        }

        public Criteria andLxsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lxsj not between", value1, value2, "lxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjIsNull() {
            addCriterion("jxsj is null");
            return (Criteria) this;
        }

        public Criteria andJxsjIsNotNull() {
            addCriterion("jxsj is not null");
            return (Criteria) this;
        }

        public Criteria andJxsjEqualTo(Date value) {
            addCriterionForJDBCDate("jxsj =", value, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("jxsj <>", value, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjGreaterThan(Date value) {
            addCriterionForJDBCDate("jxsj >", value, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxsj >=", value, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjLessThan(Date value) {
            addCriterionForJDBCDate("jxsj <", value, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jxsj <=", value, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjIn(List<Date> values) {
            addCriterionForJDBCDate("jxsj in", values, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("jxsj not in", values, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxsj between", value1, value2, "jxsj");
            return (Criteria) this;
        }

        public Criteria andJxsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jxsj not between", value1, value2, "jxsj");
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