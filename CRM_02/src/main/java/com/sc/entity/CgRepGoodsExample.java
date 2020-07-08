package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgRepGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgRepGoodsExample() {
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

        public Criteria andCgRepIdIsNull() {
            addCriterion("CG_REP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCgRepIdIsNotNull() {
            addCriterion("CG_REP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCgRepIdEqualTo(Long value) {
            addCriterion("CG_REP_ID =", value, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdNotEqualTo(Long value) {
            addCriterion("CG_REP_ID <>", value, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdGreaterThan(Long value) {
            addCriterion("CG_REP_ID >", value, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CG_REP_ID >=", value, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdLessThan(Long value) {
            addCriterion("CG_REP_ID <", value, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdLessThanOrEqualTo(Long value) {
            addCriterion("CG_REP_ID <=", value, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdIn(List<Long> values) {
            addCriterion("CG_REP_ID in", values, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdNotIn(List<Long> values) {
            addCriterion("CG_REP_ID not in", values, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdBetween(Long value1, Long value2) {
            addCriterion("CG_REP_ID between", value1, value2, "cgRepId");
            return (Criteria) this;
        }

        public Criteria andCgRepIdNotBetween(Long value1, Long value2) {
            addCriterion("CG_REP_ID not between", value1, value2, "cgRepId");
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

        public Criteria andJhDateIsNull() {
            addCriterion("JH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andJhDateIsNotNull() {
            addCriterion("JH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andJhDateEqualTo(Date value) {
            addCriterion("JH_DATE =", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateNotEqualTo(Date value) {
            addCriterion("JH_DATE <>", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateGreaterThan(Date value) {
            addCriterion("JH_DATE >", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateGreaterThanOrEqualTo(Date value) {
            addCriterion("JH_DATE >=", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateLessThan(Date value) {
            addCriterion("JH_DATE <", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateLessThanOrEqualTo(Date value) {
            addCriterion("JH_DATE <=", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateIn(List<Date> values) {
            addCriterion("JH_DATE in", values, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateNotIn(List<Date> values) {
            addCriterion("JH_DATE not in", values, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateBetween(Date value1, Date value2) {
            addCriterion("JH_DATE between", value1, value2, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateNotBetween(Date value1, Date value2) {
            addCriterion("JH_DATE not between", value1, value2, "jhDate");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("ZT like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("ZT not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
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