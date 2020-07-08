package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgSupMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgSupMsgExample() {
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

        public Criteria andGysIdIsNull() {
            addCriterion("GYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGysIdIsNotNull() {
            addCriterion("GYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGysIdEqualTo(Long value) {
            addCriterion("GYS_ID =", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotEqualTo(Long value) {
            addCriterion("GYS_ID <>", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThan(Long value) {
            addCriterion("GYS_ID >", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GYS_ID >=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThan(Long value) {
            addCriterion("GYS_ID <", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThanOrEqualTo(Long value) {
            addCriterion("GYS_ID <=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdIn(List<Long> values) {
            addCriterion("GYS_ID in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotIn(List<Long> values) {
            addCriterion("GYS_ID not in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdBetween(Long value1, Long value2) {
            addCriterion("GYS_ID between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotBetween(Long value1, Long value2) {
            addCriterion("GYS_ID not between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysNameIsNull() {
            addCriterion("GYS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGysNameIsNotNull() {
            addCriterion("GYS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGysNameEqualTo(String value) {
            addCriterion("GYS_NAME =", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotEqualTo(String value) {
            addCriterion("GYS_NAME <>", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameGreaterThan(String value) {
            addCriterion("GYS_NAME >", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameGreaterThanOrEqualTo(String value) {
            addCriterion("GYS_NAME >=", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLessThan(String value) {
            addCriterion("GYS_NAME <", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLessThanOrEqualTo(String value) {
            addCriterion("GYS_NAME <=", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLike(String value) {
            addCriterion("GYS_NAME like", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotLike(String value) {
            addCriterion("GYS_NAME not like", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameIn(List<String> values) {
            addCriterion("GYS_NAME in", values, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotIn(List<String> values) {
            addCriterion("GYS_NAME not in", values, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameBetween(String value1, String value2) {
            addCriterion("GYS_NAME between", value1, value2, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotBetween(String value1, String value2) {
            addCriterion("GYS_NAME not between", value1, value2, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameIsNull() {
            addCriterion("GYS_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGysShortNameIsNotNull() {
            addCriterion("GYS_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGysShortNameEqualTo(String value) {
            addCriterion("GYS_SHORT_NAME =", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameNotEqualTo(String value) {
            addCriterion("GYS_SHORT_NAME <>", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameGreaterThan(String value) {
            addCriterion("GYS_SHORT_NAME >", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("GYS_SHORT_NAME >=", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameLessThan(String value) {
            addCriterion("GYS_SHORT_NAME <", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameLessThanOrEqualTo(String value) {
            addCriterion("GYS_SHORT_NAME <=", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameLike(String value) {
            addCriterion("GYS_SHORT_NAME like", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameNotLike(String value) {
            addCriterion("GYS_SHORT_NAME not like", value, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameIn(List<String> values) {
            addCriterion("GYS_SHORT_NAME in", values, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameNotIn(List<String> values) {
            addCriterion("GYS_SHORT_NAME not in", values, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameBetween(String value1, String value2) {
            addCriterion("GYS_SHORT_NAME between", value1, value2, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andGysShortNameNotBetween(String value1, String value2) {
            addCriterion("GYS_SHORT_NAME not between", value1, value2, "gysShortName");
            return (Criteria) this;
        }

        public Criteria andLxrIsNull() {
            addCriterion("LXR is null");
            return (Criteria) this;
        }

        public Criteria andLxrIsNotNull() {
            addCriterion("LXR is not null");
            return (Criteria) this;
        }

        public Criteria andLxrEqualTo(String value) {
            addCriterion("LXR =", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotEqualTo(String value) {
            addCriterion("LXR <>", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThan(String value) {
            addCriterion("LXR >", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThanOrEqualTo(String value) {
            addCriterion("LXR >=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThan(String value) {
            addCriterion("LXR <", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThanOrEqualTo(String value) {
            addCriterion("LXR <=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLike(String value) {
            addCriterion("LXR like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotLike(String value) {
            addCriterion("LXR not like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrIn(List<String> values) {
            addCriterion("LXR in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotIn(List<String> values) {
            addCriterion("LXR not in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrBetween(String value1, String value2) {
            addCriterion("LXR between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotBetween(String value1, String value2) {
            addCriterion("LXR not between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(Long value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(Long value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(Long value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(Long value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(Long value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(Long value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<Long> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<Long> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(Long value1, Long value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(Long value1, Long value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneIsNull() {
            addCriterion("MOBLE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneIsNotNull() {
            addCriterion("MOBLE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneEqualTo(Long value) {
            addCriterion("MOBLE_PHONE =", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNotEqualTo(Long value) {
            addCriterion("MOBLE_PHONE <>", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneGreaterThan(Long value) {
            addCriterion("MOBLE_PHONE >", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("MOBLE_PHONE >=", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneLessThan(Long value) {
            addCriterion("MOBLE_PHONE <", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneLessThanOrEqualTo(Long value) {
            addCriterion("MOBLE_PHONE <=", value, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneIn(List<Long> values) {
            addCriterion("MOBLE_PHONE in", values, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNotIn(List<Long> values) {
            addCriterion("MOBLE_PHONE not in", values, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneBetween(Long value1, Long value2) {
            addCriterion("MOBLE_PHONE between", value1, value2, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andMoblePhoneNotBetween(Long value1, Long value2) {
            addCriterion("MOBLE_PHONE not between", value1, value2, "moblePhone");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("CZ is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("CZ is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(Long value) {
            addCriterion("CZ =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(Long value) {
            addCriterion("CZ <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(Long value) {
            addCriterion("CZ >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(Long value) {
            addCriterion("CZ >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(Long value) {
            addCriterion("CZ <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(Long value) {
            addCriterion("CZ <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<Long> values) {
            addCriterion("CZ in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<Long> values) {
            addCriterion("CZ not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(Long value1, Long value2) {
            addCriterion("CZ between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(Long value1, Long value2) {
            addCriterion("CZ not between", value1, value2, "cz");
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

        public Criteria andYbIsNull() {
            addCriterion("YB is null");
            return (Criteria) this;
        }

        public Criteria andYbIsNotNull() {
            addCriterion("YB is not null");
            return (Criteria) this;
        }

        public Criteria andYbEqualTo(Long value) {
            addCriterion("YB =", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotEqualTo(Long value) {
            addCriterion("YB <>", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThan(Long value) {
            addCriterion("YB >", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThanOrEqualTo(Long value) {
            addCriterion("YB >=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThan(Long value) {
            addCriterion("YB <", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThanOrEqualTo(Long value) {
            addCriterion("YB <=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbIn(List<Long> values) {
            addCriterion("YB in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotIn(List<Long> values) {
            addCriterion("YB not in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbBetween(Long value1, Long value2) {
            addCriterion("YB between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotBetween(Long value1, Long value2) {
            addCriterion("YB not between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andEmilIsNull() {
            addCriterion("EMIL is null");
            return (Criteria) this;
        }

        public Criteria andEmilIsNotNull() {
            addCriterion("EMIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmilEqualTo(String value) {
            addCriterion("EMIL =", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilNotEqualTo(String value) {
            addCriterion("EMIL <>", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilGreaterThan(String value) {
            addCriterion("EMIL >", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilGreaterThanOrEqualTo(String value) {
            addCriterion("EMIL >=", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilLessThan(String value) {
            addCriterion("EMIL <", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilLessThanOrEqualTo(String value) {
            addCriterion("EMIL <=", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilLike(String value) {
            addCriterion("EMIL like", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilNotLike(String value) {
            addCriterion("EMIL not like", value, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilIn(List<String> values) {
            addCriterion("EMIL in", values, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilNotIn(List<String> values) {
            addCriterion("EMIL not in", values, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilBetween(String value1, String value2) {
            addCriterion("EMIL between", value1, value2, "emil");
            return (Criteria) this;
        }

        public Criteria andEmilNotBetween(String value1, String value2) {
            addCriterion("EMIL not between", value1, value2, "emil");
            return (Criteria) this;
        }

        public Criteria andKhYhIsNull() {
            addCriterion("KH_YH is null");
            return (Criteria) this;
        }

        public Criteria andKhYhIsNotNull() {
            addCriterion("KH_YH is not null");
            return (Criteria) this;
        }

        public Criteria andKhYhEqualTo(String value) {
            addCriterion("KH_YH =", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhNotEqualTo(String value) {
            addCriterion("KH_YH <>", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhGreaterThan(String value) {
            addCriterion("KH_YH >", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhGreaterThanOrEqualTo(String value) {
            addCriterion("KH_YH >=", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhLessThan(String value) {
            addCriterion("KH_YH <", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhLessThanOrEqualTo(String value) {
            addCriterion("KH_YH <=", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhLike(String value) {
            addCriterion("KH_YH like", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhNotLike(String value) {
            addCriterion("KH_YH not like", value, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhIn(List<String> values) {
            addCriterion("KH_YH in", values, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhNotIn(List<String> values) {
            addCriterion("KH_YH not in", values, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhBetween(String value1, String value2) {
            addCriterion("KH_YH between", value1, value2, "khYh");
            return (Criteria) this;
        }

        public Criteria andKhYhNotBetween(String value1, String value2) {
            addCriterion("KH_YH not between", value1, value2, "khYh");
            return (Criteria) this;
        }

        public Criteria andYhZhIsNull() {
            addCriterion("YH_ZH is null");
            return (Criteria) this;
        }

        public Criteria andYhZhIsNotNull() {
            addCriterion("YH_ZH is not null");
            return (Criteria) this;
        }

        public Criteria andYhZhEqualTo(Long value) {
            addCriterion("YH_ZH =", value, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhNotEqualTo(Long value) {
            addCriterion("YH_ZH <>", value, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhGreaterThan(Long value) {
            addCriterion("YH_ZH >", value, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhGreaterThanOrEqualTo(Long value) {
            addCriterion("YH_ZH >=", value, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhLessThan(Long value) {
            addCriterion("YH_ZH <", value, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhLessThanOrEqualTo(Long value) {
            addCriterion("YH_ZH <=", value, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhIn(List<Long> values) {
            addCriterion("YH_ZH in", values, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhNotIn(List<Long> values) {
            addCriterion("YH_ZH not in", values, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhBetween(Long value1, Long value2) {
            addCriterion("YH_ZH between", value1, value2, "yhZh");
            return (Criteria) this;
        }

        public Criteria andYhZhNotBetween(Long value1, Long value2) {
            addCriterion("YH_ZH not between", value1, value2, "yhZh");
            return (Criteria) this;
        }

        public Criteria andCompanyZyIsNull() {
            addCriterion("COMPANY_ZY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyZyIsNotNull() {
            addCriterion("COMPANY_ZY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyZyEqualTo(String value) {
            addCriterion("COMPANY_ZY =", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyNotEqualTo(String value) {
            addCriterion("COMPANY_ZY <>", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyGreaterThan(String value) {
            addCriterion("COMPANY_ZY >", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ZY >=", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyLessThan(String value) {
            addCriterion("COMPANY_ZY <", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ZY <=", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyLike(String value) {
            addCriterion("COMPANY_ZY like", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyNotLike(String value) {
            addCriterion("COMPANY_ZY not like", value, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyIn(List<String> values) {
            addCriterion("COMPANY_ZY in", values, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyNotIn(List<String> values) {
            addCriterion("COMPANY_ZY not in", values, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyBetween(String value1, String value2) {
            addCriterion("COMPANY_ZY between", value1, value2, "companyZy");
            return (Criteria) this;
        }

        public Criteria andCompanyZyNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ZY not between", value1, value2, "companyZy");
            return (Criteria) this;
        }

        public Criteria andSfYxIsNull() {
            addCriterion("SF_YX is null");
            return (Criteria) this;
        }

        public Criteria andSfYxIsNotNull() {
            addCriterion("SF_YX is not null");
            return (Criteria) this;
        }

        public Criteria andSfYxEqualTo(String value) {
            addCriterion("SF_YX =", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxNotEqualTo(String value) {
            addCriterion("SF_YX <>", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxGreaterThan(String value) {
            addCriterion("SF_YX >", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxGreaterThanOrEqualTo(String value) {
            addCriterion("SF_YX >=", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxLessThan(String value) {
            addCriterion("SF_YX <", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxLessThanOrEqualTo(String value) {
            addCriterion("SF_YX <=", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxLike(String value) {
            addCriterion("SF_YX like", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxNotLike(String value) {
            addCriterion("SF_YX not like", value, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxIn(List<String> values) {
            addCriterion("SF_YX in", values, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxNotIn(List<String> values) {
            addCriterion("SF_YX not in", values, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxBetween(String value1, String value2) {
            addCriterion("SF_YX between", value1, value2, "sfYx");
            return (Criteria) this;
        }

        public Criteria andSfYxNotBetween(String value1, String value2) {
            addCriterion("SF_YX not between", value1, value2, "sfYx");
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