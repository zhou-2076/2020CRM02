package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtJournalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtJournalExample() {
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

        public Criteria andJournalIdIsNull() {
            addCriterion("JOURNAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andJournalIdIsNotNull() {
            addCriterion("JOURNAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJournalIdEqualTo(Long value) {
            addCriterion("JOURNAL_ID =", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdNotEqualTo(Long value) {
            addCriterion("JOURNAL_ID <>", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdGreaterThan(Long value) {
            addCriterion("JOURNAL_ID >", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("JOURNAL_ID >=", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdLessThan(Long value) {
            addCriterion("JOURNAL_ID <", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdLessThanOrEqualTo(Long value) {
            addCriterion("JOURNAL_ID <=", value, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdIn(List<Long> values) {
            addCriterion("JOURNAL_ID in", values, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdNotIn(List<Long> values) {
            addCriterion("JOURNAL_ID not in", values, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdBetween(Long value1, Long value2) {
            addCriterion("JOURNAL_ID between", value1, value2, "journalId");
            return (Criteria) this;
        }

        public Criteria andJournalIdNotBetween(Long value1, Long value2) {
            addCriterion("JOURNAL_ID not between", value1, value2, "journalId");
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

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andQxIsNull() {
            addCriterion("QX is null");
            return (Criteria) this;
        }

        public Criteria andQxIsNotNull() {
            addCriterion("QX is not null");
            return (Criteria) this;
        }

        public Criteria andQxEqualTo(String value) {
            addCriterion("QX =", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotEqualTo(String value) {
            addCriterion("QX <>", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxGreaterThan(String value) {
            addCriterion("QX >", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxGreaterThanOrEqualTo(String value) {
            addCriterion("QX >=", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxLessThan(String value) {
            addCriterion("QX <", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxLessThanOrEqualTo(String value) {
            addCriterion("QX <=", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxLike(String value) {
            addCriterion("QX like", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotLike(String value) {
            addCriterion("QX not like", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxIn(List<String> values) {
            addCriterion("QX in", values, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotIn(List<String> values) {
            addCriterion("QX not in", values, "qx");
            return (Criteria) this;
        }

        public Criteria andQxBetween(String value1, String value2) {
            addCriterion("QX between", value1, value2, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotBetween(String value1, String value2) {
            addCriterion("QX not between", value1, value2, "qx");
            return (Criteria) this;
        }

        public Criteria andFwdateIsNull() {
            addCriterion("FWDATE is null");
            return (Criteria) this;
        }

        public Criteria andFwdateIsNotNull() {
            addCriterion("FWDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFwdateEqualTo(Date value) {
            addCriterion("FWDATE =", value, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateNotEqualTo(Date value) {
            addCriterion("FWDATE <>", value, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateGreaterThan(Date value) {
            addCriterion("FWDATE >", value, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateGreaterThanOrEqualTo(Date value) {
            addCriterion("FWDATE >=", value, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateLessThan(Date value) {
            addCriterion("FWDATE <", value, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateLessThanOrEqualTo(Date value) {
            addCriterion("FWDATE <=", value, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateIn(List<Date> values) {
            addCriterion("FWDATE in", values, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateNotIn(List<Date> values) {
            addCriterion("FWDATE not in", values, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateBetween(Date value1, Date value2) {
            addCriterion("FWDATE between", value1, value2, "fwdate");
            return (Criteria) this;
        }

        public Criteria andFwdateNotBetween(Date value1, Date value2) {
            addCriterion("FWDATE not between", value1, value2, "fwdate");
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