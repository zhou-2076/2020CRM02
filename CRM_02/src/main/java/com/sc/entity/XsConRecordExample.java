package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsConRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsConRecordExample() {
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

        public Criteria andConRecordIdIsNull() {
            addCriterion("CON_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andConRecordIdIsNotNull() {
            addCriterion("CON_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConRecordIdEqualTo(Long value) {
            addCriterion("CON_RECORD_ID =", value, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdNotEqualTo(Long value) {
            addCriterion("CON_RECORD_ID <>", value, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdGreaterThan(Long value) {
            addCriterion("CON_RECORD_ID >", value, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CON_RECORD_ID >=", value, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdLessThan(Long value) {
            addCriterion("CON_RECORD_ID <", value, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("CON_RECORD_ID <=", value, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdIn(List<Long> values) {
            addCriterion("CON_RECORD_ID in", values, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdNotIn(List<Long> values) {
            addCriterion("CON_RECORD_ID not in", values, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdBetween(Long value1, Long value2) {
            addCriterion("CON_RECORD_ID between", value1, value2, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("CON_RECORD_ID not between", value1, value2, "conRecordId");
            return (Criteria) this;
        }

        public Criteria andConThemeIsNull() {
            addCriterion("CON_THEME is null");
            return (Criteria) this;
        }

        public Criteria andConThemeIsNotNull() {
            addCriterion("CON_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andConThemeEqualTo(String value) {
            addCriterion("CON_THEME =", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotEqualTo(String value) {
            addCriterion("CON_THEME <>", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeGreaterThan(String value) {
            addCriterion("CON_THEME >", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeGreaterThanOrEqualTo(String value) {
            addCriterion("CON_THEME >=", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeLessThan(String value) {
            addCriterion("CON_THEME <", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeLessThanOrEqualTo(String value) {
            addCriterion("CON_THEME <=", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeLike(String value) {
            addCriterion("CON_THEME like", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotLike(String value) {
            addCriterion("CON_THEME not like", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeIn(List<String> values) {
            addCriterion("CON_THEME in", values, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotIn(List<String> values) {
            addCriterion("CON_THEME not in", values, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeBetween(String value1, String value2) {
            addCriterion("CON_THEME between", value1, value2, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotBetween(String value1, String value2) {
            addCriterion("CON_THEME not between", value1, value2, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConTimeIsNull() {
            addCriterion("CON_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConTimeIsNotNull() {
            addCriterion("CON_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConTimeEqualTo(Date value) {
            addCriterion("CON_TIME =", value, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeNotEqualTo(Date value) {
            addCriterion("CON_TIME <>", value, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeGreaterThan(Date value) {
            addCriterion("CON_TIME >", value, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CON_TIME >=", value, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeLessThan(Date value) {
            addCriterion("CON_TIME <", value, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeLessThanOrEqualTo(Date value) {
            addCriterion("CON_TIME <=", value, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeIn(List<Date> values) {
            addCriterion("CON_TIME in", values, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeNotIn(List<Date> values) {
            addCriterion("CON_TIME not in", values, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeBetween(Date value1, Date value2) {
            addCriterion("CON_TIME between", value1, value2, "conTime");
            return (Criteria) this;
        }

        public Criteria andConTimeNotBetween(Date value1, Date value2) {
            addCriterion("CON_TIME not between", value1, value2, "conTime");
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

        public Criteria andConContentIsNull() {
            addCriterion("CON_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andConContentIsNotNull() {
            addCriterion("CON_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andConContentEqualTo(String value) {
            addCriterion("CON_CONTENT =", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentNotEqualTo(String value) {
            addCriterion("CON_CONTENT <>", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentGreaterThan(String value) {
            addCriterion("CON_CONTENT >", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentGreaterThanOrEqualTo(String value) {
            addCriterion("CON_CONTENT >=", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentLessThan(String value) {
            addCriterion("CON_CONTENT <", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentLessThanOrEqualTo(String value) {
            addCriterion("CON_CONTENT <=", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentLike(String value) {
            addCriterion("CON_CONTENT like", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentNotLike(String value) {
            addCriterion("CON_CONTENT not like", value, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentIn(List<String> values) {
            addCriterion("CON_CONTENT in", values, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentNotIn(List<String> values) {
            addCriterion("CON_CONTENT not in", values, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentBetween(String value1, String value2) {
            addCriterion("CON_CONTENT between", value1, value2, "conContent");
            return (Criteria) this;
        }

        public Criteria andConContentNotBetween(String value1, String value2) {
            addCriterion("CON_CONTENT not between", value1, value2, "conContent");
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