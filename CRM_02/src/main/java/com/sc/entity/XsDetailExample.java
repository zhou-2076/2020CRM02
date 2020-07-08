package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsDetailExample() {
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

        public Criteria andSaleDetailIdIsNull() {
            addCriterion("SALE_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdIsNotNull() {
            addCriterion("SALE_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdEqualTo(Long value) {
            addCriterion("SALE_DETAIL_ID =", value, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdNotEqualTo(Long value) {
            addCriterion("SALE_DETAIL_ID <>", value, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdGreaterThan(Long value) {
            addCriterion("SALE_DETAIL_ID >", value, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_DETAIL_ID >=", value, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdLessThan(Long value) {
            addCriterion("SALE_DETAIL_ID <", value, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("SALE_DETAIL_ID <=", value, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdIn(List<Long> values) {
            addCriterion("SALE_DETAIL_ID in", values, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdNotIn(List<Long> values) {
            addCriterion("SALE_DETAIL_ID not in", values, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdBetween(Long value1, Long value2) {
            addCriterion("SALE_DETAIL_ID between", value1, value2, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("SALE_DETAIL_ID not between", value1, value2, "saleDetailId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNull() {
            addCriterion("SALE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("SALE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Long value) {
            addCriterion("SALE_ID =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Long value) {
            addCriterion("SALE_ID <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Long value) {
            addCriterion("SALE_ID >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_ID >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Long value) {
            addCriterion("SALE_ID <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Long value) {
            addCriterion("SALE_ID <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Long> values) {
            addCriterion("SALE_ID in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Long> values) {
            addCriterion("SALE_ID not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Long value1, Long value2) {
            addCriterion("SALE_ID between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Long value1, Long value2) {
            addCriterion("SALE_ID not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("GOOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("GOOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Long value) {
            addCriterion("GOOD_ID =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Long value) {
            addCriterion("GOOD_ID <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Long value) {
            addCriterion("GOOD_ID >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOOD_ID >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Long value) {
            addCriterion("GOOD_ID <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Long value) {
            addCriterion("GOOD_ID <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Long> values) {
            addCriterion("GOOD_ID in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Long> values) {
            addCriterion("GOOD_ID not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Long value1, Long value2) {
            addCriterion("GOOD_ID between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Long value1, Long value2) {
            addCriterion("GOOD_ID not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNull() {
            addCriterion("GOOD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNotNull() {
            addCriterion("GOOD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNumEqualTo(Long value) {
            addCriterion("GOOD_NUM =", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotEqualTo(Long value) {
            addCriterion("GOOD_NUM <>", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThan(Long value) {
            addCriterion("GOOD_NUM >", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThanOrEqualTo(Long value) {
            addCriterion("GOOD_NUM >=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThan(Long value) {
            addCriterion("GOOD_NUM <", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThanOrEqualTo(Long value) {
            addCriterion("GOOD_NUM <=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumIn(List<Long> values) {
            addCriterion("GOOD_NUM in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotIn(List<Long> values) {
            addCriterion("GOOD_NUM not in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumBetween(Long value1, Long value2) {
            addCriterion("GOOD_NUM between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotBetween(Long value1, Long value2) {
            addCriterion("GOOD_NUM not between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("GOOD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("GOOD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(BigDecimal value) {
            addCriterion("GOOD_PRICE >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(BigDecimal value) {
            addCriterion("GOOD_PRICE <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<BigDecimal> values) {
            addCriterion("GOOD_PRICE in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOOD_PRICE not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_PRICE between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_PRICE not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkIsNull() {
            addCriterion("SALE_DETAIL_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkIsNotNull() {
            addCriterion("SALE_DETAIL_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkEqualTo(String value) {
            addCriterion("SALE_DETAIL_REMARK =", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkNotEqualTo(String value) {
            addCriterion("SALE_DETAIL_REMARK <>", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkGreaterThan(String value) {
            addCriterion("SALE_DETAIL_REMARK >", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_DETAIL_REMARK >=", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkLessThan(String value) {
            addCriterion("SALE_DETAIL_REMARK <", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkLessThanOrEqualTo(String value) {
            addCriterion("SALE_DETAIL_REMARK <=", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkLike(String value) {
            addCriterion("SALE_DETAIL_REMARK like", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkNotLike(String value) {
            addCriterion("SALE_DETAIL_REMARK not like", value, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkIn(List<String> values) {
            addCriterion("SALE_DETAIL_REMARK in", values, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkNotIn(List<String> values) {
            addCriterion("SALE_DETAIL_REMARK not in", values, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkBetween(String value1, String value2) {
            addCriterion("SALE_DETAIL_REMARK between", value1, value2, "saleDetailRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDetailRemarkNotBetween(String value1, String value2) {
            addCriterion("SALE_DETAIL_REMARK not between", value1, value2, "saleDetailRemark");
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