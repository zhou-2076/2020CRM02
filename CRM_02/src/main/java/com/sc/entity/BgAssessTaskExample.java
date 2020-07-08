package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgAssessTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgAssessTaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNull() {
            addCriterion("TASK_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNotNull() {
            addCriterion("TASK_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleEqualTo(String value) {
            addCriterion("TASK_TITLE =", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotEqualTo(String value) {
            addCriterion("TASK_TITLE <>", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThan(String value) {
            addCriterion("TASK_TITLE >", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE >=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThan(String value) {
            addCriterion("TASK_TITLE <", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE <=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLike(String value) {
            addCriterion("TASK_TITLE like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotLike(String value) {
            addCriterion("TASK_TITLE not like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIn(List<String> values) {
            addCriterion("TASK_TITLE in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotIn(List<String> values) {
            addCriterion("TASK_TITLE not in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleBetween(String value1, String value2) {
            addCriterion("TASK_TITLE between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotBetween(String value1, String value2) {
            addCriterion("TASK_TITLE not between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntIsNull() {
            addCriterion("TASK_SPECIFIC_CONTRNT is null");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntIsNotNull() {
            addCriterion("TASK_SPECIFIC_CONTRNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT =", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntNotEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT <>", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntGreaterThan(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT >", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT >=", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntLessThan(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT <", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntLessThanOrEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT <=", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntLike(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT like", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntNotLike(String value) {
            addCriterion("TASK_SPECIFIC_CONTRNT not like", value, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntIn(List<String> values) {
            addCriterion("TASK_SPECIFIC_CONTRNT in", values, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntNotIn(List<String> values) {
            addCriterion("TASK_SPECIFIC_CONTRNT not in", values, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntBetween(String value1, String value2) {
            addCriterion("TASK_SPECIFIC_CONTRNT between", value1, value2, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContrntNotBetween(String value1, String value2) {
            addCriterion("TASK_SPECIFIC_CONTRNT not between", value1, value2, "taskSpecificContrnt");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorIsNull() {
            addCriterion("TASK_PROMULGATOR is null");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorIsNotNull() {
            addCriterion("TASK_PROMULGATOR is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorEqualTo(String value) {
            addCriterion("TASK_PROMULGATOR =", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorNotEqualTo(String value) {
            addCriterion("TASK_PROMULGATOR <>", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorGreaterThan(String value) {
            addCriterion("TASK_PROMULGATOR >", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PROMULGATOR >=", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorLessThan(String value) {
            addCriterion("TASK_PROMULGATOR <", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorLessThanOrEqualTo(String value) {
            addCriterion("TASK_PROMULGATOR <=", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorLike(String value) {
            addCriterion("TASK_PROMULGATOR like", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorNotLike(String value) {
            addCriterion("TASK_PROMULGATOR not like", value, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorIn(List<String> values) {
            addCriterion("TASK_PROMULGATOR in", values, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorNotIn(List<String> values) {
            addCriterion("TASK_PROMULGATOR not in", values, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorBetween(String value1, String value2) {
            addCriterion("TASK_PROMULGATOR between", value1, value2, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andTaskPromulgatorNotBetween(String value1, String value2) {
            addCriterion("TASK_PROMULGATOR not between", value1, value2, "taskPromulgator");
            return (Criteria) this;
        }

        public Criteria andAssessIndexIsNull() {
            addCriterion("ASSESS_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andAssessIndexIsNotNull() {
            addCriterion("ASSESS_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andAssessIndexEqualTo(String value) {
            addCriterion("ASSESS_INDEX =", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotEqualTo(String value) {
            addCriterion("ASSESS_INDEX <>", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexGreaterThan(String value) {
            addCriterion("ASSESS_INDEX >", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_INDEX >=", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexLessThan(String value) {
            addCriterion("ASSESS_INDEX <", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_INDEX <=", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexLike(String value) {
            addCriterion("ASSESS_INDEX like", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotLike(String value) {
            addCriterion("ASSESS_INDEX not like", value, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexIn(List<String> values) {
            addCriterion("ASSESS_INDEX in", values, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotIn(List<String> values) {
            addCriterion("ASSESS_INDEX not in", values, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexBetween(String value1, String value2) {
            addCriterion("ASSESS_INDEX between", value1, value2, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andAssessIndexNotBetween(String value1, String value2) {
            addCriterion("ASSESS_INDEX not between", value1, value2, "assessIndex");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNull() {
            addCriterion("TASK_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNotNull() {
            addCriterion("TASK_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeEqualTo(Date value) {
            addCriterion("TASK_START_TIME =", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotEqualTo(Date value) {
            addCriterion("TASK_START_TIME <>", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThan(Date value) {
            addCriterion("TASK_START_TIME >", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_START_TIME >=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThan(Date value) {
            addCriterion("TASK_START_TIME <", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_START_TIME <=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIn(List<Date> values) {
            addCriterion("TASK_START_TIME in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotIn(List<Date> values) {
            addCriterion("TASK_START_TIME not in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeBetween(Date value1, Date value2) {
            addCriterion("TASK_START_TIME between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_START_TIME not between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNull() {
            addCriterion("TASK_FINISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNotNull() {
            addCriterion("TASK_FINISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeEqualTo(Date value) {
            addCriterion("TASK_FINISH_TIME =", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotEqualTo(Date value) {
            addCriterion("TASK_FINISH_TIME <>", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThan(Date value) {
            addCriterion("TASK_FINISH_TIME >", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_FINISH_TIME >=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThan(Date value) {
            addCriterion("TASK_FINISH_TIME <", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_FINISH_TIME <=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIn(List<Date> values) {
            addCriterion("TASK_FINISH_TIME in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotIn(List<Date> values) {
            addCriterion("TASK_FINISH_TIME not in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeBetween(Date value1, Date value2) {
            addCriterion("TASK_FINISH_TIME between", value1, value2, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_FINISH_TIME not between", value1, value2, "taskFinishTime");
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