package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KcGoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcGoodsInfoExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("\"PRODUCT_TYPE \" is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("\"PRODUCT_TYPE \" is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE \" =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE \" <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("\"PRODUCT_TYPE \" >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE \" >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("\"PRODUCT_TYPE \" <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE \" <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("\"PRODUCT_TYPE \" like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("\"PRODUCT_TYPE \" not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("\"PRODUCT_TYPE \" in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("\"PRODUCT_TYPE \" not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_TYPE \" between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_TYPE \" not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andGgsmIsNull() {
            addCriterion("GGSM is null");
            return (Criteria) this;
        }

        public Criteria andGgsmIsNotNull() {
            addCriterion("GGSM is not null");
            return (Criteria) this;
        }

        public Criteria andGgsmEqualTo(String value) {
            addCriterion("GGSM =", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmNotEqualTo(String value) {
            addCriterion("GGSM <>", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmGreaterThan(String value) {
            addCriterion("GGSM >", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmGreaterThanOrEqualTo(String value) {
            addCriterion("GGSM >=", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmLessThan(String value) {
            addCriterion("GGSM <", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmLessThanOrEqualTo(String value) {
            addCriterion("GGSM <=", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmLike(String value) {
            addCriterion("GGSM like", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmNotLike(String value) {
            addCriterion("GGSM not like", value, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmIn(List<String> values) {
            addCriterion("GGSM in", values, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmNotIn(List<String> values) {
            addCriterion("GGSM not in", values, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmBetween(String value1, String value2) {
            addCriterion("GGSM between", value1, value2, "ggsm");
            return (Criteria) this;
        }

        public Criteria andGgsmNotBetween(String value1, String value2) {
            addCriterion("GGSM not between", value1, value2, "ggsm");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("WAREHOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("WAREHOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(BigDecimal value) {
            addCriterion("WAREHOUSE_ID >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(BigDecimal value) {
            addCriterion("WAREHOUSE_ID <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<BigDecimal> values) {
            addCriterion("WAREHOUSE_ID in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<BigDecimal> values) {
            addCriterion("WAREHOUSE_ID not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAREHOUSE_ID between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAREHOUSE_ID not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNull() {
            addCriterion("KC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNotNull() {
            addCriterion("KC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andKcNumEqualTo(BigDecimal value) {
            addCriterion("KC_NUM =", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotEqualTo(BigDecimal value) {
            addCriterion("KC_NUM <>", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThan(BigDecimal value) {
            addCriterion("KC_NUM >", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KC_NUM >=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThan(BigDecimal value) {
            addCriterion("KC_NUM <", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KC_NUM <=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumIn(List<BigDecimal> values) {
            addCriterion("KC_NUM in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotIn(List<BigDecimal> values) {
            addCriterion("KC_NUM not in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KC_NUM between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KC_NUM not between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("COST =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("COST <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("COST >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("COST <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("COST in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("COST not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andRenallIsNull() {
            addCriterion("RENALL is null");
            return (Criteria) this;
        }

        public Criteria andRenallIsNotNull() {
            addCriterion("RENALL is not null");
            return (Criteria) this;
        }

        public Criteria andRenallEqualTo(BigDecimal value) {
            addCriterion("RENALL =", value, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallNotEqualTo(BigDecimal value) {
            addCriterion("RENALL <>", value, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallGreaterThan(BigDecimal value) {
            addCriterion("RENALL >", value, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENALL >=", value, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallLessThan(BigDecimal value) {
            addCriterion("RENALL <", value, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENALL <=", value, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallIn(List<BigDecimal> values) {
            addCriterion("RENALL in", values, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallNotIn(List<BigDecimal> values) {
            addCriterion("RENALL not in", values, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENALL between", value1, value2, "renall");
            return (Criteria) this;
        }

        public Criteria andRenallNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENALL not between", value1, value2, "renall");
            return (Criteria) this;
        }

        public Criteria andSellIsNull() {
            addCriterion("SELL is null");
            return (Criteria) this;
        }

        public Criteria andSellIsNotNull() {
            addCriterion("SELL is not null");
            return (Criteria) this;
        }

        public Criteria andSellEqualTo(BigDecimal value) {
            addCriterion("SELL =", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotEqualTo(BigDecimal value) {
            addCriterion("SELL <>", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThan(BigDecimal value) {
            addCriterion("SELL >", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELL >=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThan(BigDecimal value) {
            addCriterion("SELL <", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELL <=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellIn(List<BigDecimal> values) {
            addCriterion("SELL in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotIn(List<BigDecimal> values) {
            addCriterion("SELL not in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELL between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELL not between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNull() {
            addCriterion("ORDER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNotNull() {
            addCriterion("ORDER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkEqualTo(String value) {
            addCriterion("ORDER_REMARK =", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotEqualTo(String value) {
            addCriterion("ORDER_REMARK <>", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThan(String value) {
            addCriterion("ORDER_REMARK >", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_REMARK >=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThan(String value) {
            addCriterion("ORDER_REMARK <", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("ORDER_REMARK <=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLike(String value) {
            addCriterion("ORDER_REMARK like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotLike(String value) {
            addCriterion("ORDER_REMARK not like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIn(List<String> values) {
            addCriterion("ORDER_REMARK in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotIn(List<String> values) {
            addCriterion("ORDER_REMARK not in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkBetween(String value1, String value2) {
            addCriterion("ORDER_REMARK between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("ORDER_REMARK not between", value1, value2, "orderRemark");
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