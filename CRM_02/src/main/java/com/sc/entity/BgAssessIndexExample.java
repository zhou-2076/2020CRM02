package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgAssessIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgAssessIndexExample() {
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

        public Criteria andIndexIdIsNull() {
            addCriterion("INDEX_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndexIdIsNotNull() {
            addCriterion("INDEX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndexIdEqualTo(Long value) {
            addCriterion("INDEX_ID =", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotEqualTo(Long value) {
            addCriterion("INDEX_ID <>", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThan(Long value) {
            addCriterion("INDEX_ID >", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INDEX_ID >=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThan(Long value) {
            addCriterion("INDEX_ID <", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThanOrEqualTo(Long value) {
            addCriterion("INDEX_ID <=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdIn(List<Long> values) {
            addCriterion("INDEX_ID in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotIn(List<Long> values) {
            addCriterion("INDEX_ID not in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdBetween(Long value1, Long value2) {
            addCriterion("INDEX_ID between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotBetween(Long value1, Long value2) {
            addCriterion("INDEX_ID not between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andAssessIndexIsNull() {
            addCriterion("ASSESS_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andAssessIndexIsNotNull() {
            addCriterion("ASSESS_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andAssessIndexEqualTo(String value) {
            addCriterion("ASSESS_INDEX =", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotEqualTo(String value) {
            addCriterion("ASSESS_INDEX <>", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexGreaterThan(String value) {
            addCriterion("ASSESS_INDEX >", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_INDEX >=", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexLessThan(String value) {
            addCriterion("ASSESS_INDEX <", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_INDEX <=", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexLike(String value) {
            addCriterion("ASSESS_INDEX like", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotLike(String value) {
            addCriterion("ASSESS_INDEX not like", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexIn(List<String> values) {
            addCriterion("ASSESS_INDEX in", values, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotIn(List<String> values) {
            addCriterion("ASSESS_INDEX not in", values, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexBetween(String value1, String value2) {
            addCriterion("ASSESS_INDEX between", value1, value2, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotBetween(String value1, String value2) {
            addCriterion("ASSESS_INDEX not between", value1, value2, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andLastModifyDtaeIsNull() {
            addCriterion("LAST_MODIFY_DTAE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeIsNotNull() {
            addCriterion("LAST_MODIFY_DTAE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DTAE =", value, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DTAE <>", value, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DTAE >", value, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DTAE >=", value, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeLessThan(Date value) {
            addCriterion("LAST_MODIFY_DTAE <", value, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DTAE <=", value, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DTAE in", values, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DTAE not in", values, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DTAE between", value1, value2, "lastModifyDtae");
            return (Criteria) this;
        }

        public Criteria andLastModifyDtaeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DTAE not between", value1, value2, "lastModifyDtae");
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