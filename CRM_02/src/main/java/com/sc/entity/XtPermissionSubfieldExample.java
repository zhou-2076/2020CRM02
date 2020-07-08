package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtPermissionSubfieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtPermissionSubfieldExample() {
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

        public Criteria andQxFlIdIsNull() {
            addCriterion("QX_FL_ID is null");
            return (Criteria) this;
        }

        public Criteria andQxFlIdIsNotNull() {
            addCriterion("QX_FL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQxFlIdEqualTo(Long value) {
            addCriterion("QX_FL_ID =", value, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdNotEqualTo(Long value) {
            addCriterion("QX_FL_ID <>", value, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdGreaterThan(Long value) {
            addCriterion("QX_FL_ID >", value, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QX_FL_ID >=", value, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdLessThan(Long value) {
            addCriterion("QX_FL_ID <", value, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdLessThanOrEqualTo(Long value) {
            addCriterion("QX_FL_ID <=", value, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdIn(List<Long> values) {
            addCriterion("QX_FL_ID in", values, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdNotIn(List<Long> values) {
            addCriterion("QX_FL_ID not in", values, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdBetween(Long value1, Long value2) {
            addCriterion("QX_FL_ID between", value1, value2, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andQxFlIdNotBetween(Long value1, Long value2) {
            addCriterion("QX_FL_ID not between", value1, value2, "qxFlId");
            return (Criteria) this;
        }

        public Criteria andFlNameIsNull() {
            addCriterion("FL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFlNameIsNotNull() {
            addCriterion("FL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFlNameEqualTo(String value) {
            addCriterion("FL_NAME =", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotEqualTo(String value) {
            addCriterion("FL_NAME <>", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameGreaterThan(String value) {
            addCriterion("FL_NAME >", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameGreaterThanOrEqualTo(String value) {
            addCriterion("FL_NAME >=", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameLessThan(String value) {
            addCriterion("FL_NAME <", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameLessThanOrEqualTo(String value) {
            addCriterion("FL_NAME <=", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameLike(String value) {
            addCriterion("FL_NAME like", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotLike(String value) {
            addCriterion("FL_NAME not like", value, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameIn(List<String> values) {
            addCriterion("FL_NAME in", values, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotIn(List<String> values) {
            addCriterion("FL_NAME not in", values, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameBetween(String value1, String value2) {
            addCriterion("FL_NAME between", value1, value2, "flName");
            return (Criteria) this;
        }

        public Criteria andFlNameNotBetween(String value1, String value2) {
            addCriterion("FL_NAME not between", value1, value2, "flName");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("LAST_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("LAST_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DATE >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("LAST_MODIFY_DATE <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE not between", value1, value2, "lastModifyDate");
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