package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsConnectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsConnectExample() {
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

        public Criteria andConnectIdIsNull() {
            addCriterion("CONNECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andConnectIdIsNotNull() {
            addCriterion("CONNECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConnectIdEqualTo(Long value) {
            addCriterion("CONNECT_ID =", value, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdNotEqualTo(Long value) {
            addCriterion("CONNECT_ID <>", value, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdGreaterThan(Long value) {
            addCriterion("CONNECT_ID >", value, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONNECT_ID >=", value, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdLessThan(Long value) {
            addCriterion("CONNECT_ID <", value, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdLessThanOrEqualTo(Long value) {
            addCriterion("CONNECT_ID <=", value, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdIn(List<Long> values) {
            addCriterion("CONNECT_ID in", values, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdNotIn(List<Long> values) {
            addCriterion("CONNECT_ID not in", values, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdBetween(Long value1, Long value2) {
            addCriterion("CONNECT_ID between", value1, value2, "connectId");
            return (Criteria) this;
        }

        public Criteria andConnectIdNotBetween(Long value1, Long value2) {
            addCriterion("CONNECT_ID not between", value1, value2, "connectId");
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

        public Criteria andConnectNameIsNull() {
            addCriterion("CONNECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConnectNameIsNotNull() {
            addCriterion("CONNECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConnectNameEqualTo(String value) {
            addCriterion("CONNECT_NAME =", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameNotEqualTo(String value) {
            addCriterion("CONNECT_NAME <>", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameGreaterThan(String value) {
            addCriterion("CONNECT_NAME >", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONNECT_NAME >=", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameLessThan(String value) {
            addCriterion("CONNECT_NAME <", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameLessThanOrEqualTo(String value) {
            addCriterion("CONNECT_NAME <=", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameLike(String value) {
            addCriterion("CONNECT_NAME like", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameNotLike(String value) {
            addCriterion("CONNECT_NAME not like", value, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameIn(List<String> values) {
            addCriterion("CONNECT_NAME in", values, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameNotIn(List<String> values) {
            addCriterion("CONNECT_NAME not in", values, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameBetween(String value1, String value2) {
            addCriterion("CONNECT_NAME between", value1, value2, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectNameNotBetween(String value1, String value2) {
            addCriterion("CONNECT_NAME not between", value1, value2, "connectName");
            return (Criteria) this;
        }

        public Criteria andConnectEnameIsNull() {
            addCriterion("CONNECT_ENAME is null");
            return (Criteria) this;
        }

        public Criteria andConnectEnameIsNotNull() {
            addCriterion("CONNECT_ENAME is not null");
            return (Criteria) this;
        }

        public Criteria andConnectEnameEqualTo(String value) {
            addCriterion("CONNECT_ENAME =", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameNotEqualTo(String value) {
            addCriterion("CONNECT_ENAME <>", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameGreaterThan(String value) {
            addCriterion("CONNECT_ENAME >", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameGreaterThanOrEqualTo(String value) {
            addCriterion("CONNECT_ENAME >=", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameLessThan(String value) {
            addCriterion("CONNECT_ENAME <", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameLessThanOrEqualTo(String value) {
            addCriterion("CONNECT_ENAME <=", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameLike(String value) {
            addCriterion("CONNECT_ENAME like", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameNotLike(String value) {
            addCriterion("CONNECT_ENAME not like", value, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameIn(List<String> values) {
            addCriterion("CONNECT_ENAME in", values, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameNotIn(List<String> values) {
            addCriterion("CONNECT_ENAME not in", values, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameBetween(String value1, String value2) {
            addCriterion("CONNECT_ENAME between", value1, value2, "connectEname");
            return (Criteria) this;
        }

        public Criteria andConnectEnameNotBetween(String value1, String value2) {
            addCriterion("CONNECT_ENAME not between", value1, value2, "connectEname");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDepartIsNull() {
            addCriterion("DEPART is null");
            return (Criteria) this;
        }

        public Criteria andDepartIsNotNull() {
            addCriterion("DEPART is not null");
            return (Criteria) this;
        }

        public Criteria andDepartEqualTo(String value) {
            addCriterion("DEPART =", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotEqualTo(String value) {
            addCriterion("DEPART <>", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThan(String value) {
            addCriterion("DEPART >", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART >=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThan(String value) {
            addCriterion("DEPART <", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThanOrEqualTo(String value) {
            addCriterion("DEPART <=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLike(String value) {
            addCriterion("DEPART like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotLike(String value) {
            addCriterion("DEPART not like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartIn(List<String> values) {
            addCriterion("DEPART in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotIn(List<String> values) {
            addCriterion("DEPART not in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartBetween(String value1, String value2) {
            addCriterion("DEPART between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotBetween(String value1, String value2) {
            addCriterion("DEPART not between", value1, value2, "depart");
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

        public Criteria andPhoneOfficeIsNull() {
            addCriterion("PHONE_OFFICE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeIsNotNull() {
            addCriterion("PHONE_OFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeEqualTo(BigDecimal value) {
            addCriterion("PHONE_OFFICE =", value, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeNotEqualTo(BigDecimal value) {
            addCriterion("PHONE_OFFICE <>", value, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeGreaterThan(BigDecimal value) {
            addCriterion("PHONE_OFFICE >", value, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PHONE_OFFICE >=", value, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeLessThan(BigDecimal value) {
            addCriterion("PHONE_OFFICE <", value, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PHONE_OFFICE <=", value, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeIn(List<BigDecimal> values) {
            addCriterion("PHONE_OFFICE in", values, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeNotIn(List<BigDecimal> values) {
            addCriterion("PHONE_OFFICE not in", values, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PHONE_OFFICE between", value1, value2, "phoneOffice");
            return (Criteria) this;
        }

        public Criteria andPhoneOfficeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PHONE_OFFICE not between", value1, value2, "phoneOffice");
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

        public Criteria andConnectAddressIsNull() {
            addCriterion("CONNECT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andConnectAddressIsNotNull() {
            addCriterion("CONNECT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andConnectAddressEqualTo(String value) {
            addCriterion("CONNECT_ADDRESS =", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressNotEqualTo(String value) {
            addCriterion("CONNECT_ADDRESS <>", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressGreaterThan(String value) {
            addCriterion("CONNECT_ADDRESS >", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONNECT_ADDRESS >=", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressLessThan(String value) {
            addCriterion("CONNECT_ADDRESS <", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressLessThanOrEqualTo(String value) {
            addCriterion("CONNECT_ADDRESS <=", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressLike(String value) {
            addCriterion("CONNECT_ADDRESS like", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressNotLike(String value) {
            addCriterion("CONNECT_ADDRESS not like", value, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressIn(List<String> values) {
            addCriterion("CONNECT_ADDRESS in", values, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressNotIn(List<String> values) {
            addCriterion("CONNECT_ADDRESS not in", values, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressBetween(String value1, String value2) {
            addCriterion("CONNECT_ADDRESS between", value1, value2, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectAddressNotBetween(String value1, String value2) {
            addCriterion("CONNECT_ADDRESS not between", value1, value2, "connectAddress");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkIsNull() {
            addCriterion("CONNECT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkIsNotNull() {
            addCriterion("CONNECT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkEqualTo(String value) {
            addCriterion("CONNECT_REMARK =", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkNotEqualTo(String value) {
            addCriterion("CONNECT_REMARK <>", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkGreaterThan(String value) {
            addCriterion("CONNECT_REMARK >", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CONNECT_REMARK >=", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkLessThan(String value) {
            addCriterion("CONNECT_REMARK <", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkLessThanOrEqualTo(String value) {
            addCriterion("CONNECT_REMARK <=", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkLike(String value) {
            addCriterion("CONNECT_REMARK like", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkNotLike(String value) {
            addCriterion("CONNECT_REMARK not like", value, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkIn(List<String> values) {
            addCriterion("CONNECT_REMARK in", values, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkNotIn(List<String> values) {
            addCriterion("CONNECT_REMARK not in", values, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkBetween(String value1, String value2) {
            addCriterion("CONNECT_REMARK between", value1, value2, "connectRemark");
            return (Criteria) this;
        }

        public Criteria andConnectRemarkNotBetween(String value1, String value2) {
            addCriterion("CONNECT_REMARK not between", value1, value2, "connectRemark");
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