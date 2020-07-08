package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtPermissionRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtPermissionRoleExample() {
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

        public Criteria andPermissionRoleIdIsNull() {
            addCriterion("PERMISSION_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdIsNotNull() {
            addCriterion("PERMISSION_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdEqualTo(Long value) {
            addCriterion("PERMISSION_ROLE_ID =", value, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdNotEqualTo(Long value) {
            addCriterion("PERMISSION_ROLE_ID <>", value, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdGreaterThan(Long value) {
            addCriterion("PERMISSION_ROLE_ID >", value, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PERMISSION_ROLE_ID >=", value, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdLessThan(Long value) {
            addCriterion("PERMISSION_ROLE_ID <", value, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("PERMISSION_ROLE_ID <=", value, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdIn(List<Long> values) {
            addCriterion("PERMISSION_ROLE_ID in", values, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdNotIn(List<Long> values) {
            addCriterion("PERMISSION_ROLE_ID not in", values, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdBetween(Long value1, Long value2) {
            addCriterion("PERMISSION_ROLE_ID between", value1, value2, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("PERMISSION_ROLE_ID not between", value1, value2, "permissionRoleId");
            return (Criteria) this;
        }

        public Criteria andQxIdIsNull() {
            addCriterion("QX_ID is null");
            return (Criteria) this;
        }

        public Criteria andQxIdIsNotNull() {
            addCriterion("QX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQxIdEqualTo(Long value) {
            addCriterion("QX_ID =", value, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdNotEqualTo(Long value) {
            addCriterion("QX_ID <>", value, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdGreaterThan(Long value) {
            addCriterion("QX_ID >", value, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QX_ID >=", value, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdLessThan(Long value) {
            addCriterion("QX_ID <", value, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdLessThanOrEqualTo(Long value) {
            addCriterion("QX_ID <=", value, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdIn(List<Long> values) {
            addCriterion("QX_ID in", values, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdNotIn(List<Long> values) {
            addCriterion("QX_ID not in", values, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdBetween(Long value1, Long value2) {
            addCriterion("QX_ID between", value1, value2, "qxId");
            return (Criteria) this;
        }

        public Criteria andQxIdNotBetween(Long value1, Long value2) {
            addCriterion("QX_ID not between", value1, value2, "qxId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
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