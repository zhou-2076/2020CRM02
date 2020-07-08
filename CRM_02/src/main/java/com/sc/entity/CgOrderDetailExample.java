package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgOrderDetailExample() {
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

        public Criteria andCgXqIdIsNull() {
            addCriterion("CG_XQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andCgXqIdIsNotNull() {
            addCriterion("CG_XQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCgXqIdEqualTo(Long value) {
            addCriterion("CG_XQ_ID =", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotEqualTo(Long value) {
            addCriterion("CG_XQ_ID <>", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdGreaterThan(Long value) {
            addCriterion("CG_XQ_ID >", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CG_XQ_ID >=", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdLessThan(Long value) {
            addCriterion("CG_XQ_ID <", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdLessThanOrEqualTo(Long value) {
            addCriterion("CG_XQ_ID <=", value, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdIn(List<Long> values) {
            addCriterion("CG_XQ_ID in", values, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotIn(List<Long> values) {
            addCriterion("CG_XQ_ID not in", values, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdBetween(Long value1, Long value2) {
            addCriterion("CG_XQ_ID between", value1, value2, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgXqIdNotBetween(Long value1, Long value2) {
            addCriterion("CG_XQ_ID not between", value1, value2, "cgXqId");
            return (Criteria) this;
        }

        public Criteria andCgIdIsNull() {
            addCriterion("CG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCgIdIsNotNull() {
            addCriterion("CG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCgIdEqualTo(Long value) {
            addCriterion("CG_ID =", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotEqualTo(Long value) {
            addCriterion("CG_ID <>", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThan(Long value) {
            addCriterion("CG_ID >", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CG_ID >=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThan(Long value) {
            addCriterion("CG_ID <", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThanOrEqualTo(Long value) {
            addCriterion("CG_ID <=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdIn(List<Long> values) {
            addCriterion("CG_ID in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotIn(List<Long> values) {
            addCriterion("CG_ID not in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdBetween(Long value1, Long value2) {
            addCriterion("CG_ID between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotBetween(Long value1, Long value2) {
            addCriterion("CG_ID not between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNull() {
            addCriterion("CP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("CP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(Long value) {
            addCriterion("CP_ID =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(Long value) {
            addCriterion("CP_ID <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(Long value) {
            addCriterion("CP_ID >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CP_ID >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(Long value) {
            addCriterion("CP_ID <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(Long value) {
            addCriterion("CP_ID <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<Long> values) {
            addCriterion("CP_ID in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<Long> values) {
            addCriterion("CP_ID not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(Long value1, Long value2) {
            addCriterion("CP_ID between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(Long value1, Long value2) {
            addCriterion("CP_ID not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpNameIsNull() {
            addCriterion("CP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCpNameIsNotNull() {
            addCriterion("CP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCpNameEqualTo(String value) {
            addCriterion("CP_NAME =", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameNotEqualTo(String value) {
            addCriterion("CP_NAME <>", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameGreaterThan(String value) {
            addCriterion("CP_NAME >", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameGreaterThanOrEqualTo(String value) {
            addCriterion("CP_NAME >=", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameLessThan(String value) {
            addCriterion("CP_NAME <", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameLessThanOrEqualTo(String value) {
            addCriterion("CP_NAME <=", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameLike(String value) {
            addCriterion("CP_NAME like", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameNotLike(String value) {
            addCriterion("CP_NAME not like", value, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameIn(List<String> values) {
            addCriterion("CP_NAME in", values, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameNotIn(List<String> values) {
            addCriterion("CP_NAME not in", values, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameBetween(String value1, String value2) {
            addCriterion("CP_NAME between", value1, value2, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNameNotBetween(String value1, String value2) {
            addCriterion("CP_NAME not between", value1, value2, "cpName");
            return (Criteria) this;
        }

        public Criteria andCpNumIsNull() {
            addCriterion("CP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCpNumIsNotNull() {
            addCriterion("CP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCpNumEqualTo(Long value) {
            addCriterion("CP_NUM =", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumNotEqualTo(Long value) {
            addCriterion("CP_NUM <>", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumGreaterThan(Long value) {
            addCriterion("CP_NUM >", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumGreaterThanOrEqualTo(Long value) {
            addCriterion("CP_NUM >=", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumLessThan(Long value) {
            addCriterion("CP_NUM <", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumLessThanOrEqualTo(Long value) {
            addCriterion("CP_NUM <=", value, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumIn(List<Long> values) {
            addCriterion("CP_NUM in", values, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumNotIn(List<Long> values) {
            addCriterion("CP_NUM not in", values, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumBetween(Long value1, Long value2) {
            addCriterion("CP_NUM between", value1, value2, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpNumNotBetween(Long value1, Long value2) {
            addCriterion("CP_NUM not between", value1, value2, "cpNum");
            return (Criteria) this;
        }

        public Criteria andCpJgIsNull() {
            addCriterion("CP_JG is null");
            return (Criteria) this;
        }

        public Criteria andCpJgIsNotNull() {
            addCriterion("CP_JG is not null");
            return (Criteria) this;
        }

        public Criteria andCpJgEqualTo(BigDecimal value) {
            addCriterion("CP_JG =", value, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgNotEqualTo(BigDecimal value) {
            addCriterion("CP_JG <>", value, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgGreaterThan(BigDecimal value) {
            addCriterion("CP_JG >", value, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CP_JG >=", value, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgLessThan(BigDecimal value) {
            addCriterion("CP_JG <", value, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CP_JG <=", value, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgIn(List<BigDecimal> values) {
            addCriterion("CP_JG in", values, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgNotIn(List<BigDecimal> values) {
            addCriterion("CP_JG not in", values, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CP_JG between", value1, value2, "cpJg");
            return (Criteria) this;
        }

        public Criteria andCpJgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CP_JG not between", value1, value2, "cpJg");
            return (Criteria) this;
        }

        public Criteria andSfRkIsNull() {
            addCriterion("SF_RK is null");
            return (Criteria) this;
        }

        public Criteria andSfRkIsNotNull() {
            addCriterion("SF_RK is not null");
            return (Criteria) this;
        }

        public Criteria andSfRkEqualTo(String value) {
            addCriterion("SF_RK =", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkNotEqualTo(String value) {
            addCriterion("SF_RK <>", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkGreaterThan(String value) {
            addCriterion("SF_RK >", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkGreaterThanOrEqualTo(String value) {
            addCriterion("SF_RK >=", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkLessThan(String value) {
            addCriterion("SF_RK <", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkLessThanOrEqualTo(String value) {
            addCriterion("SF_RK <=", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkLike(String value) {
            addCriterion("SF_RK like", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkNotLike(String value) {
            addCriterion("SF_RK not like", value, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkIn(List<String> values) {
            addCriterion("SF_RK in", values, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkNotIn(List<String> values) {
            addCriterion("SF_RK not in", values, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkBetween(String value1, String value2) {
            addCriterion("SF_RK between", value1, value2, "sfRk");
            return (Criteria) this;
        }

        public Criteria andSfRkNotBetween(String value1, String value2) {
            addCriterion("SF_RK not between", value1, value2, "sfRk");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIsNull() {
            addCriterion("OPERATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIsNotNull() {
            addCriterion("OPERATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperaterIdEqualTo(Long value) {
            addCriterion("OPERATER_ID =", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotEqualTo(Long value) {
            addCriterion("OPERATER_ID <>", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdGreaterThan(Long value) {
            addCriterion("OPERATER_ID >", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATER_ID >=", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdLessThan(Long value) {
            addCriterion("OPERATER_ID <", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATER_ID <=", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIn(List<Long> values) {
            addCriterion("OPERATER_ID in", values, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotIn(List<Long> values) {
            addCriterion("OPERATER_ID not in", values, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdBetween(Long value1, Long value2) {
            addCriterion("OPERATER_ID between", value1, value2, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATER_ID not between", value1, value2, "operaterId");
            return (Criteria) this;
        }

        public Criteria andBzXxIsNull() {
            addCriterion("BZ_XX is null");
            return (Criteria) this;
        }

        public Criteria andBzXxIsNotNull() {
            addCriterion("BZ_XX is not null");
            return (Criteria) this;
        }

        public Criteria andBzXxEqualTo(String value) {
            addCriterion("BZ_XX =", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxNotEqualTo(String value) {
            addCriterion("BZ_XX <>", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxGreaterThan(String value) {
            addCriterion("BZ_XX >", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxGreaterThanOrEqualTo(String value) {
            addCriterion("BZ_XX >=", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxLessThan(String value) {
            addCriterion("BZ_XX <", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxLessThanOrEqualTo(String value) {
            addCriterion("BZ_XX <=", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxLike(String value) {
            addCriterion("BZ_XX like", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxNotLike(String value) {
            addCriterion("BZ_XX not like", value, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxIn(List<String> values) {
            addCriterion("BZ_XX in", values, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxNotIn(List<String> values) {
            addCriterion("BZ_XX not in", values, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxBetween(String value1, String value2) {
            addCriterion("BZ_XX between", value1, value2, "bzXx");
            return (Criteria) this;
        }

        public Criteria andBzXxNotBetween(String value1, String value2) {
            addCriterion("BZ_XX not between", value1, value2, "bzXx");
            return (Criteria) this;
        }

        public Criteria andConpanyIdIsNull() {
            addCriterion("CONPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andConpanyIdIsNotNull() {
            addCriterion("CONPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConpanyIdEqualTo(Long value) {
            addCriterion("CONPANY_ID =", value, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdNotEqualTo(Long value) {
            addCriterion("CONPANY_ID <>", value, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdGreaterThan(Long value) {
            addCriterion("CONPANY_ID >", value, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONPANY_ID >=", value, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdLessThan(Long value) {
            addCriterion("CONPANY_ID <", value, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdLessThanOrEqualTo(Long value) {
            addCriterion("CONPANY_ID <=", value, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdIn(List<Long> values) {
            addCriterion("CONPANY_ID in", values, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdNotIn(List<Long> values) {
            addCriterion("CONPANY_ID not in", values, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdBetween(Long value1, Long value2) {
            addCriterion("CONPANY_ID between", value1, value2, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andConpanyIdNotBetween(Long value1, Long value2) {
            addCriterion("CONPANY_ID not between", value1, value2, "conpanyId");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME not between", value1, value2, "lastTime");
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