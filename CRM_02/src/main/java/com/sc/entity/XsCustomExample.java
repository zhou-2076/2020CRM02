package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsCustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsCustomExample() {
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

        public Criteria andCustomNameIsNull() {
            addCriterion("CUSTOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNotNull() {
            addCriterion("CUSTOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(String value) {
            addCriterion("CUSTOM_NAME =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(String value) {
            addCriterion("CUSTOM_NAME <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(String value) {
            addCriterion("CUSTOM_NAME >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_NAME >=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(String value) {
            addCriterion("CUSTOM_NAME <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_NAME <=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLike(String value) {
            addCriterion("CUSTOM_NAME like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotLike(String value) {
            addCriterion("CUSTOM_NAME not like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameIn(List<String> values) {
            addCriterion("CUSTOM_NAME in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<String> values) {
            addCriterion("CUSTOM_NAME not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(String value1, String value2) {
            addCriterion("CUSTOM_NAME between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_NAME not between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyIsNull() {
            addCriterion("CUSTOM_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyIsNotNull() {
            addCriterion("CUSTOM_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyEqualTo(String value) {
            addCriterion("CUSTOM_PROPERTY =", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyNotEqualTo(String value) {
            addCriterion("CUSTOM_PROPERTY <>", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyGreaterThan(String value) {
            addCriterion("CUSTOM_PROPERTY >", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_PROPERTY >=", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyLessThan(String value) {
            addCriterion("CUSTOM_PROPERTY <", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_PROPERTY <=", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyLike(String value) {
            addCriterion("CUSTOM_PROPERTY like", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyNotLike(String value) {
            addCriterion("CUSTOM_PROPERTY not like", value, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyIn(List<String> values) {
            addCriterion("CUSTOM_PROPERTY in", values, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyNotIn(List<String> values) {
            addCriterion("CUSTOM_PROPERTY not in", values, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyBetween(String value1, String value2) {
            addCriterion("CUSTOM_PROPERTY between", value1, value2, "customProperty");
            return (Criteria) this;
        }

        public Criteria andCustomPropertyNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_PROPERTY not between", value1, value2, "customProperty");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("WEBSITE =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("WEBSITE <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("WEBSITE >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("WEBSITE <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("WEBSITE like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("WEBSITE not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("WEBSITE in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("WEBSITE not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("WEBSITE between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("WEBSITE not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andSharaCodeIsNull() {
            addCriterion("SHARA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSharaCodeIsNotNull() {
            addCriterion("SHARA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSharaCodeEqualTo(Long value) {
            addCriterion("SHARA_CODE =", value, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeNotEqualTo(Long value) {
            addCriterion("SHARA_CODE <>", value, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeGreaterThan(Long value) {
            addCriterion("SHARA_CODE >", value, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("SHARA_CODE >=", value, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeLessThan(Long value) {
            addCriterion("SHARA_CODE <", value, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeLessThanOrEqualTo(Long value) {
            addCriterion("SHARA_CODE <=", value, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeIn(List<Long> values) {
            addCriterion("SHARA_CODE in", values, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeNotIn(List<Long> values) {
            addCriterion("SHARA_CODE not in", values, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeBetween(Long value1, Long value2) {
            addCriterion("SHARA_CODE between", value1, value2, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSharaCodeNotBetween(Long value1, Long value2) {
            addCriterion("SHARA_CODE not between", value1, value2, "sharaCode");
            return (Criteria) this;
        }

        public Criteria andSuperDepartIsNull() {
            addCriterion("SUPER_DEPART is null");
            return (Criteria) this;
        }

        public Criteria andSuperDepartIsNotNull() {
            addCriterion("SUPER_DEPART is not null");
            return (Criteria) this;
        }

        public Criteria andSuperDepartEqualTo(String value) {
            addCriterion("SUPER_DEPART =", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartNotEqualTo(String value) {
            addCriterion("SUPER_DEPART <>", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartGreaterThan(String value) {
            addCriterion("SUPER_DEPART >", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartGreaterThanOrEqualTo(String value) {
            addCriterion("SUPER_DEPART >=", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartLessThan(String value) {
            addCriterion("SUPER_DEPART <", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartLessThanOrEqualTo(String value) {
            addCriterion("SUPER_DEPART <=", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartLike(String value) {
            addCriterion("SUPER_DEPART like", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartNotLike(String value) {
            addCriterion("SUPER_DEPART not like", value, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartIn(List<String> values) {
            addCriterion("SUPER_DEPART in", values, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartNotIn(List<String> values) {
            addCriterion("SUPER_DEPART not in", values, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartBetween(String value1, String value2) {
            addCriterion("SUPER_DEPART between", value1, value2, "superDepart");
            return (Criteria) this;
        }

        public Criteria andSuperDepartNotBetween(String value1, String value2) {
            addCriterion("SUPER_DEPART not between", value1, value2, "superDepart");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andEmpNumIsNull() {
            addCriterion("EMP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumIsNotNull() {
            addCriterion("EMP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumEqualTo(Long value) {
            addCriterion("EMP_NUM =", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumNotEqualTo(Long value) {
            addCriterion("EMP_NUM <>", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumGreaterThan(Long value) {
            addCriterion("EMP_NUM >", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumGreaterThanOrEqualTo(Long value) {
            addCriterion("EMP_NUM >=", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumLessThan(Long value) {
            addCriterion("EMP_NUM <", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumLessThanOrEqualTo(Long value) {
            addCriterion("EMP_NUM <=", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumIn(List<Long> values) {
            addCriterion("EMP_NUM in", values, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumNotIn(List<Long> values) {
            addCriterion("EMP_NUM not in", values, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumBetween(Long value1, Long value2) {
            addCriterion("EMP_NUM between", value1, value2, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumNotBetween(Long value1, Long value2) {
            addCriterion("EMP_NUM not between", value1, value2, "empNum");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("INDUSTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("INDUSTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(BigDecimal value) {
            addCriterion("INDUSTRY_ID =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(BigDecimal value) {
            addCriterion("INDUSTRY_ID <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(BigDecimal value) {
            addCriterion("INDUSTRY_ID >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INDUSTRY_ID >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(BigDecimal value) {
            addCriterion("INDUSTRY_ID <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INDUSTRY_ID <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<BigDecimal> values) {
            addCriterion("INDUSTRY_ID in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<BigDecimal> values) {
            addCriterion("INDUSTRY_ID not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDUSTRY_ID between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDUSTRY_ID not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNull() {
            addCriterion("CUSTOM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNotNull() {
            addCriterion("CUSTOM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeEqualTo(String value) {
            addCriterion("CUSTOM_TYPE =", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotEqualTo(String value) {
            addCriterion("CUSTOM_TYPE <>", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThan(String value) {
            addCriterion("CUSTOM_TYPE >", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_TYPE >=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThan(String value) {
            addCriterion("CUSTOM_TYPE <", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_TYPE <=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLike(String value) {
            addCriterion("CUSTOM_TYPE like", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotLike(String value) {
            addCriterion("CUSTOM_TYPE not like", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIn(List<String> values) {
            addCriterion("CUSTOM_TYPE in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotIn(List<String> values) {
            addCriterion("CUSTOM_TYPE not in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeBetween(String value1, String value2) {
            addCriterion("CUSTOM_TYPE between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_TYPE not between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomStatusIsNull() {
            addCriterion("CUSTOM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustomStatusIsNotNull() {
            addCriterion("CUSTOM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomStatusEqualTo(String value) {
            addCriterion("CUSTOM_STATUS =", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusNotEqualTo(String value) {
            addCriterion("CUSTOM_STATUS <>", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusGreaterThan(String value) {
            addCriterion("CUSTOM_STATUS >", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_STATUS >=", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusLessThan(String value) {
            addCriterion("CUSTOM_STATUS <", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_STATUS <=", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusLike(String value) {
            addCriterion("CUSTOM_STATUS like", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusNotLike(String value) {
            addCriterion("CUSTOM_STATUS not like", value, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusIn(List<String> values) {
            addCriterion("CUSTOM_STATUS in", values, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusNotIn(List<String> values) {
            addCriterion("CUSTOM_STATUS not in", values, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusBetween(String value1, String value2) {
            addCriterion("CUSTOM_STATUS between", value1, value2, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomStatusNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_STATUS not between", value1, value2, "customStatus");
            return (Criteria) this;
        }

        public Criteria andCustomSourceIsNull() {
            addCriterion("CUSTOM_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCustomSourceIsNotNull() {
            addCriterion("CUSTOM_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomSourceEqualTo(String value) {
            addCriterion("CUSTOM_SOURCE =", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceNotEqualTo(String value) {
            addCriterion("CUSTOM_SOURCE <>", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceGreaterThan(String value) {
            addCriterion("CUSTOM_SOURCE >", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_SOURCE >=", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceLessThan(String value) {
            addCriterion("CUSTOM_SOURCE <", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_SOURCE <=", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceLike(String value) {
            addCriterion("CUSTOM_SOURCE like", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceNotLike(String value) {
            addCriterion("CUSTOM_SOURCE not like", value, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceIn(List<String> values) {
            addCriterion("CUSTOM_SOURCE in", values, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceNotIn(List<String> values) {
            addCriterion("CUSTOM_SOURCE not in", values, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceBetween(String value1, String value2) {
            addCriterion("CUSTOM_SOURCE between", value1, value2, "customSource");
            return (Criteria) this;
        }

        public Criteria andCustomSourceNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_SOURCE not between", value1, value2, "customSource");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIsNull() {
            addCriterion("PRINCIPAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIsNotNull() {
            addCriterion("PRINCIPAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdEqualTo(BigDecimal value) {
            addCriterion("PRINCIPAL_ID =", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotEqualTo(BigDecimal value) {
            addCriterion("PRINCIPAL_ID <>", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdGreaterThan(BigDecimal value) {
            addCriterion("PRINCIPAL_ID >", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINCIPAL_ID >=", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLessThan(BigDecimal value) {
            addCriterion("PRINCIPAL_ID <", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINCIPAL_ID <=", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIn(List<BigDecimal> values) {
            addCriterion("PRINCIPAL_ID in", values, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotIn(List<BigDecimal> values) {
            addCriterion("PRINCIPAL_ID not in", values, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINCIPAL_ID between", value1, value2, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINCIPAL_ID not between", value1, value2, "principalId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(BigDecimal value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(BigDecimal value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(BigDecimal value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(BigDecimal value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<BigDecimal> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<BigDecimal> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(BigDecimal value) {
            addCriterion("MOBILEPHONE =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(BigDecimal value) {
            addCriterion("MOBILEPHONE <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(BigDecimal value) {
            addCriterion("MOBILEPHONE >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBILEPHONE >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(BigDecimal value) {
            addCriterion("MOBILEPHONE <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBILEPHONE <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<BigDecimal> values) {
            addCriterion("MOBILEPHONE in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<BigDecimal> values) {
            addCriterion("MOBILEPHONE not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBILEPHONE between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBILEPHONE not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomFaxIsNull() {
            addCriterion("CUSTOM_FAX is null");
            return (Criteria) this;
        }

        public Criteria andCustomFaxIsNotNull() {
            addCriterion("CUSTOM_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andCustomFaxEqualTo(String value) {
            addCriterion("CUSTOM_FAX =", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxNotEqualTo(String value) {
            addCriterion("CUSTOM_FAX <>", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxGreaterThan(String value) {
            addCriterion("CUSTOM_FAX >", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_FAX >=", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxLessThan(String value) {
            addCriterion("CUSTOM_FAX <", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_FAX <=", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxLike(String value) {
            addCriterion("CUSTOM_FAX like", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxNotLike(String value) {
            addCriterion("CUSTOM_FAX not like", value, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxIn(List<String> values) {
            addCriterion("CUSTOM_FAX in", values, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxNotIn(List<String> values) {
            addCriterion("CUSTOM_FAX not in", values, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxBetween(String value1, String value2) {
            addCriterion("CUSTOM_FAX between", value1, value2, "customFax");
            return (Criteria) this;
        }

        public Criteria andCustomFaxNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_FAX not between", value1, value2, "customFax");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andNextTimeIsNull() {
            addCriterion("NEXT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNextTimeIsNotNull() {
            addCriterion("NEXT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextTimeEqualTo(Date value) {
            addCriterion("NEXT_TIME =", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotEqualTo(Date value) {
            addCriterion("NEXT_TIME <>", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeGreaterThan(Date value) {
            addCriterion("NEXT_TIME >", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NEXT_TIME >=", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeLessThan(Date value) {
            addCriterion("NEXT_TIME <", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeLessThanOrEqualTo(Date value) {
            addCriterion("NEXT_TIME <=", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeIn(List<Date> values) {
            addCriterion("NEXT_TIME in", values, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotIn(List<Date> values) {
            addCriterion("NEXT_TIME not in", values, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeBetween(Date value1, Date value2) {
            addCriterion("NEXT_TIME between", value1, value2, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotBetween(Date value1, Date value2) {
            addCriterion("NEXT_TIME not between", value1, value2, "nextTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSicIsNull() {
            addCriterion("SIC is null");
            return (Criteria) this;
        }

        public Criteria andSicIsNotNull() {
            addCriterion("SIC is not null");
            return (Criteria) this;
        }

        public Criteria andSicEqualTo(String value) {
            addCriterion("SIC =", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicNotEqualTo(String value) {
            addCriterion("SIC <>", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicGreaterThan(String value) {
            addCriterion("SIC >", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicGreaterThanOrEqualTo(String value) {
            addCriterion("SIC >=", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicLessThan(String value) {
            addCriterion("SIC <", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicLessThanOrEqualTo(String value) {
            addCriterion("SIC <=", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicLike(String value) {
            addCriterion("SIC like", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicNotLike(String value) {
            addCriterion("SIC not like", value, "sic");
            return (Criteria) this;
        }

        public Criteria andSicIn(List<String> values) {
            addCriterion("SIC in", values, "sic");
            return (Criteria) this;
        }

        public Criteria andSicNotIn(List<String> values) {
            addCriterion("SIC not in", values, "sic");
            return (Criteria) this;
        }

        public Criteria andSicBetween(String value1, String value2) {
            addCriterion("SIC between", value1, value2, "sic");
            return (Criteria) this;
        }

        public Criteria andSicNotBetween(String value1, String value2) {
            addCriterion("SIC not between", value1, value2, "sic");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("PAY_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("PAY_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("PAY_METHOD =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("PAY_METHOD <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("PAY_METHOD >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_METHOD >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("PAY_METHOD <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("PAY_METHOD <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("PAY_METHOD like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("PAY_METHOD not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("PAY_METHOD in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("PAY_METHOD not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("PAY_METHOD between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("PAY_METHOD not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkIsNull() {
            addCriterion("CUSTOM_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkIsNotNull() {
            addCriterion("CUSTOM_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkEqualTo(String value) {
            addCriterion("CUSTOM_REMARK =", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkNotEqualTo(String value) {
            addCriterion("CUSTOM_REMARK <>", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkGreaterThan(String value) {
            addCriterion("CUSTOM_REMARK >", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_REMARK >=", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkLessThan(String value) {
            addCriterion("CUSTOM_REMARK <", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_REMARK <=", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkLike(String value) {
            addCriterion("CUSTOM_REMARK like", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkNotLike(String value) {
            addCriterion("CUSTOM_REMARK not like", value, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkIn(List<String> values) {
            addCriterion("CUSTOM_REMARK in", values, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkNotIn(List<String> values) {
            addCriterion("CUSTOM_REMARK not in", values, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkBetween(String value1, String value2) {
            addCriterion("CUSTOM_REMARK between", value1, value2, "customRemark");
            return (Criteria) this;
        }

        public Criteria andCustomRemarkNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_REMARK not between", value1, value2, "customRemark");
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