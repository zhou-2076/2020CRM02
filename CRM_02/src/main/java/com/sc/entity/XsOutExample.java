package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsOutExample() {
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

        public Criteria andMakeSaleDateIsNull() {
            addCriterion("MAKE_SALE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateIsNotNull() {
            addCriterion("MAKE_SALE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateEqualTo(Date value) {
            addCriterion("MAKE_SALE_DATE =", value, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateNotEqualTo(Date value) {
            addCriterion("MAKE_SALE_DATE <>", value, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateGreaterThan(Date value) {
            addCriterion("MAKE_SALE_DATE >", value, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MAKE_SALE_DATE >=", value, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateLessThan(Date value) {
            addCriterion("MAKE_SALE_DATE <", value, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateLessThanOrEqualTo(Date value) {
            addCriterion("MAKE_SALE_DATE <=", value, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateIn(List<Date> values) {
            addCriterion("MAKE_SALE_DATE in", values, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateNotIn(List<Date> values) {
            addCriterion("MAKE_SALE_DATE not in", values, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateBetween(Date value1, Date value2) {
            addCriterion("MAKE_SALE_DATE between", value1, value2, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andMakeSaleDateNotBetween(Date value1, Date value2) {
            addCriterion("MAKE_SALE_DATE not between", value1, value2, "makeSaleDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(BigDecimal value) {
            addCriterion("INVOICE =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(BigDecimal value) {
            addCriterion("INVOICE <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(BigDecimal value) {
            addCriterion("INVOICE >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(BigDecimal value) {
            addCriterion("INVOICE <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<BigDecimal> values) {
            addCriterion("INVOICE in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<BigDecimal> values) {
            addCriterion("INVOICE not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andSaleAmountIsNull() {
            addCriterion("SALE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("SALE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("SALE_AMOUNT >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(BigDecimal value) {
            addCriterion("SALE_AMOUNT <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<BigDecimal> values) {
            addCriterion("SALE_AMOUNT in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("SALE_AMOUNT not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_AMOUNT between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_AMOUNT not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusIsNull() {
            addCriterion("SALE_OUT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusIsNotNull() {
            addCriterion("SALE_OUT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusEqualTo(String value) {
            addCriterion("SALE_OUT_STATUS =", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusNotEqualTo(String value) {
            addCriterion("SALE_OUT_STATUS <>", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusGreaterThan(String value) {
            addCriterion("SALE_OUT_STATUS >", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_OUT_STATUS >=", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusLessThan(String value) {
            addCriterion("SALE_OUT_STATUS <", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusLessThanOrEqualTo(String value) {
            addCriterion("SALE_OUT_STATUS <=", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusLike(String value) {
            addCriterion("SALE_OUT_STATUS like", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusNotLike(String value) {
            addCriterion("SALE_OUT_STATUS not like", value, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusIn(List<String> values) {
            addCriterion("SALE_OUT_STATUS in", values, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusNotIn(List<String> values) {
            addCriterion("SALE_OUT_STATUS not in", values, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusBetween(String value1, String value2) {
            addCriterion("SALE_OUT_STATUS between", value1, value2, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andSaleOutStatusNotBetween(String value1, String value2) {
            addCriterion("SALE_OUT_STATUS not between", value1, value2, "saleOutStatus");
            return (Criteria) this;
        }

        public Criteria andRebateIsNull() {
            addCriterion("REBATE is null");
            return (Criteria) this;
        }

        public Criteria andRebateIsNotNull() {
            addCriterion("REBATE is not null");
            return (Criteria) this;
        }

        public Criteria andRebateEqualTo(String value) {
            addCriterion("REBATE =", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotEqualTo(String value) {
            addCriterion("REBATE <>", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThan(String value) {
            addCriterion("REBATE >", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThanOrEqualTo(String value) {
            addCriterion("REBATE >=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThan(String value) {
            addCriterion("REBATE <", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThanOrEqualTo(String value) {
            addCriterion("REBATE <=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLike(String value) {
            addCriterion("REBATE like", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotLike(String value) {
            addCriterion("REBATE not like", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateIn(List<String> values) {
            addCriterion("REBATE in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotIn(List<String> values) {
            addCriterion("REBATE not in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateBetween(String value1, String value2) {
            addCriterion("REBATE between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotBetween(String value1, String value2) {
            addCriterion("REBATE not between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOutRemarkIsNull() {
            addCriterion("OUT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andOutRemarkIsNotNull() {
            addCriterion("OUT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andOutRemarkEqualTo(String value) {
            addCriterion("OUT_REMARK =", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkNotEqualTo(String value) {
            addCriterion("OUT_REMARK <>", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkGreaterThan(String value) {
            addCriterion("OUT_REMARK >", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_REMARK >=", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkLessThan(String value) {
            addCriterion("OUT_REMARK <", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkLessThanOrEqualTo(String value) {
            addCriterion("OUT_REMARK <=", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkLike(String value) {
            addCriterion("OUT_REMARK like", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkNotLike(String value) {
            addCriterion("OUT_REMARK not like", value, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkIn(List<String> values) {
            addCriterion("OUT_REMARK in", values, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkNotIn(List<String> values) {
            addCriterion("OUT_REMARK not in", values, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkBetween(String value1, String value2) {
            addCriterion("OUT_REMARK between", value1, value2, "outRemark");
            return (Criteria) this;
        }

        public Criteria andOutRemarkNotBetween(String value1, String value2) {
            addCriterion("OUT_REMARK not between", value1, value2, "outRemark");
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