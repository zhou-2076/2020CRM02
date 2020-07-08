package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsRunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsRunExample() {
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

        public Criteria andRunIdIsNull() {
            addCriterion("RUN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRunIdIsNotNull() {
            addCriterion("RUN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRunIdEqualTo(Long value) {
            addCriterion("RUN_ID =", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdNotEqualTo(Long value) {
            addCriterion("RUN_ID <>", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdGreaterThan(Long value) {
            addCriterion("RUN_ID >", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RUN_ID >=", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdLessThan(Long value) {
            addCriterion("RUN_ID <", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdLessThanOrEqualTo(Long value) {
            addCriterion("RUN_ID <=", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdIn(List<Long> values) {
            addCriterion("RUN_ID in", values, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdNotIn(List<Long> values) {
            addCriterion("RUN_ID not in", values, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdBetween(Long value1, Long value2) {
            addCriterion("RUN_ID between", value1, value2, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdNotBetween(Long value1, Long value2) {
            addCriterion("RUN_ID not between", value1, value2, "runId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNull() {
            addCriterion("CUSTOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNotNull() {
            addCriterion("CUSTOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdEqualTo(Long value) {
            addCriterion("CUSTOM_ID =", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotEqualTo(Long value) {
            addCriterion("CUSTOM_ID <>", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThan(Long value) {
            addCriterion("CUSTOM_ID >", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_ID >=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThan(Long value) {
            addCriterion("CUSTOM_ID <", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_ID <=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIn(List<Long> values) {
            addCriterion("CUSTOM_ID in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotIn(List<Long> values) {
            addCriterion("CUSTOM_ID not in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdBetween(Long value1, Long value2) {
            addCriterion("CUSTOM_ID between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOM_ID not between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Long value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Long value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Long value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Long value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Long> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Long> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andDealWayIsNull() {
            addCriterion("DEAL_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDealWayIsNotNull() {
            addCriterion("DEAL_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDealWayEqualTo(String value) {
            addCriterion("DEAL_WAY =", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayNotEqualTo(String value) {
            addCriterion("DEAL_WAY <>", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayGreaterThan(String value) {
            addCriterion("DEAL_WAY >", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_WAY >=", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayLessThan(String value) {
            addCriterion("DEAL_WAY <", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayLessThanOrEqualTo(String value) {
            addCriterion("DEAL_WAY <=", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayLike(String value) {
            addCriterion("DEAL_WAY like", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayNotLike(String value) {
            addCriterion("DEAL_WAY not like", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayIn(List<String> values) {
            addCriterion("DEAL_WAY in", values, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayNotIn(List<String> values) {
            addCriterion("DEAL_WAY not in", values, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayBetween(String value1, String value2) {
            addCriterion("DEAL_WAY between", value1, value2, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayNotBetween(String value1, String value2) {
            addCriterion("DEAL_WAY not between", value1, value2, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealMeasureIsNull() {
            addCriterion("DEAL_MEASURE is null");
            return (Criteria) this;
        }

        public Criteria andDealMeasureIsNotNull() {
            addCriterion("DEAL_MEASURE is not null");
            return (Criteria) this;
        }

        public Criteria andDealMeasureEqualTo(String value) {
            addCriterion("DEAL_MEASURE =", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureNotEqualTo(String value) {
            addCriterion("DEAL_MEASURE <>", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureGreaterThan(String value) {
            addCriterion("DEAL_MEASURE >", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_MEASURE >=", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureLessThan(String value) {
            addCriterion("DEAL_MEASURE <", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureLessThanOrEqualTo(String value) {
            addCriterion("DEAL_MEASURE <=", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureLike(String value) {
            addCriterion("DEAL_MEASURE like", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureNotLike(String value) {
            addCriterion("DEAL_MEASURE not like", value, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureIn(List<String> values) {
            addCriterion("DEAL_MEASURE in", values, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureNotIn(List<String> values) {
            addCriterion("DEAL_MEASURE not in", values, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureBetween(String value1, String value2) {
            addCriterion("DEAL_MEASURE between", value1, value2, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andDealMeasureNotBetween(String value1, String value2) {
            addCriterion("DEAL_MEASURE not between", value1, value2, "dealMeasure");
            return (Criteria) this;
        }

        public Criteria andRunIsNull() {
            addCriterion("RUN is null");
            return (Criteria) this;
        }

        public Criteria andRunIsNotNull() {
            addCriterion("RUN is not null");
            return (Criteria) this;
        }

        public Criteria andRunEqualTo(String value) {
            addCriterion("RUN =", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunNotEqualTo(String value) {
            addCriterion("RUN <>", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunGreaterThan(String value) {
            addCriterion("RUN >", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunGreaterThanOrEqualTo(String value) {
            addCriterion("RUN >=", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunLessThan(String value) {
            addCriterion("RUN <", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunLessThanOrEqualTo(String value) {
            addCriterion("RUN <=", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunLike(String value) {
            addCriterion("RUN like", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunNotLike(String value) {
            addCriterion("RUN not like", value, "run");
            return (Criteria) this;
        }

        public Criteria andRunIn(List<String> values) {
            addCriterion("RUN in", values, "run");
            return (Criteria) this;
        }

        public Criteria andRunNotIn(List<String> values) {
            addCriterion("RUN not in", values, "run");
            return (Criteria) this;
        }

        public Criteria andRunBetween(String value1, String value2) {
            addCriterion("RUN between", value1, value2, "run");
            return (Criteria) this;
        }

        public Criteria andRunNotBetween(String value1, String value2) {
            addCriterion("RUN not between", value1, value2, "run");
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