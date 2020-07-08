package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgSmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgSmsExample() {
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

        public Criteria andSmsIdIsNull() {
            addCriterion("SMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNotNull() {
            addCriterion("SMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSmsIdEqualTo(Long value) {
            addCriterion("SMS_ID =", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotEqualTo(Long value) {
            addCriterion("SMS_ID <>", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThan(Long value) {
            addCriterion("SMS_ID >", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SMS_ID >=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThan(Long value) {
            addCriterion("SMS_ID <", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThanOrEqualTo(Long value) {
            addCriterion("SMS_ID <=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdIn(List<Long> values) {
            addCriterion("SMS_ID in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotIn(List<Long> values) {
            addCriterion("SMS_ID not in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdBetween(Long value1, Long value2) {
            addCriterion("SMS_ID between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotBetween(Long value1, Long value2) {
            addCriterion("SMS_ID not between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsTitleIsNull() {
            addCriterion("SMS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSmsTitleIsNotNull() {
            addCriterion("SMS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSmsTitleEqualTo(String value) {
            addCriterion("SMS_TITLE =", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleNotEqualTo(String value) {
            addCriterion("SMS_TITLE <>", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleGreaterThan(String value) {
            addCriterion("SMS_TITLE >", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_TITLE >=", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleLessThan(String value) {
            addCriterion("SMS_TITLE <", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleLessThanOrEqualTo(String value) {
            addCriterion("SMS_TITLE <=", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleLike(String value) {
            addCriterion("SMS_TITLE like", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleNotLike(String value) {
            addCriterion("SMS_TITLE not like", value, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleIn(List<String> values) {
            addCriterion("SMS_TITLE in", values, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleNotIn(List<String> values) {
            addCriterion("SMS_TITLE not in", values, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleBetween(String value1, String value2) {
            addCriterion("SMS_TITLE between", value1, value2, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsTitleNotBetween(String value1, String value2) {
            addCriterion("SMS_TITLE not between", value1, value2, "smsTitle");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNull() {
            addCriterion("SMS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSmsContentIsNotNull() {
            addCriterion("SMS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSmsContentEqualTo(String value) {
            addCriterion("SMS_CONTENT =", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotEqualTo(String value) {
            addCriterion("SMS_CONTENT <>", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThan(String value) {
            addCriterion("SMS_CONTENT >", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_CONTENT >=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThan(String value) {
            addCriterion("SMS_CONTENT <", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLessThanOrEqualTo(String value) {
            addCriterion("SMS_CONTENT <=", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentLike(String value) {
            addCriterion("SMS_CONTENT like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotLike(String value) {
            addCriterion("SMS_CONTENT not like", value, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentIn(List<String> values) {
            addCriterion("SMS_CONTENT in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotIn(List<String> values) {
            addCriterion("SMS_CONTENT not in", values, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentBetween(String value1, String value2) {
            addCriterion("SMS_CONTENT between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsContentNotBetween(String value1, String value2) {
            addCriterion("SMS_CONTENT not between", value1, value2, "smsContent");
            return (Criteria) this;
        }

        public Criteria andSmsSenderIsNull() {
            addCriterion("SMS_SENDER is null");
            return (Criteria) this;
        }

        public Criteria andSmsSenderIsNotNull() {
            addCriterion("SMS_SENDER is not null");
            return (Criteria) this;
        }

        public Criteria andSmsSenderEqualTo(String value) {
            addCriterion("SMS_SENDER =", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderNotEqualTo(String value) {
            addCriterion("SMS_SENDER <>", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderGreaterThan(String value) {
            addCriterion("SMS_SENDER >", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_SENDER >=", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderLessThan(String value) {
            addCriterion("SMS_SENDER <", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderLessThanOrEqualTo(String value) {
            addCriterion("SMS_SENDER <=", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderLike(String value) {
            addCriterion("SMS_SENDER like", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderNotLike(String value) {
            addCriterion("SMS_SENDER not like", value, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderIn(List<String> values) {
            addCriterion("SMS_SENDER in", values, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderNotIn(List<String> values) {
            addCriterion("SMS_SENDER not in", values, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderBetween(String value1, String value2) {
            addCriterion("SMS_SENDER between", value1, value2, "smsSender");
            return (Criteria) this;
        }

        public Criteria andSmsSenderNotBetween(String value1, String value2) {
            addCriterion("SMS_SENDER not between", value1, value2, "smsSender");
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