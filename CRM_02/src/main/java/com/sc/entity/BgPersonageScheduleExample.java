package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgPersonageScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgPersonageScheduleExample() {
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

        public Criteria andScheduleArrangeIdIsNull() {
            addCriterion("SCHEDULE_ARRANGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdIsNotNull() {
            addCriterion("SCHEDULE_ARRANGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdEqualTo(Long value) {
            addCriterion("SCHEDULE_ARRANGE_ID =", value, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdNotEqualTo(Long value) {
            addCriterion("SCHEDULE_ARRANGE_ID <>", value, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdGreaterThan(Long value) {
            addCriterion("SCHEDULE_ARRANGE_ID >", value, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SCHEDULE_ARRANGE_ID >=", value, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdLessThan(Long value) {
            addCriterion("SCHEDULE_ARRANGE_ID <", value, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdLessThanOrEqualTo(Long value) {
            addCriterion("SCHEDULE_ARRANGE_ID <=", value, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdIn(List<Long> values) {
            addCriterion("SCHEDULE_ARRANGE_ID in", values, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdNotIn(List<Long> values) {
            addCriterion("SCHEDULE_ARRANGE_ID not in", values, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdBetween(Long value1, Long value2) {
            addCriterion("SCHEDULE_ARRANGE_ID between", value1, value2, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andScheduleArrangeIdNotBetween(Long value1, Long value2) {
            addCriterion("SCHEDULE_ARRANGE_ID not between", value1, value2, "scheduleArrangeId");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryIsNull() {
            addCriterion("ARRANGE_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryIsNotNull() {
            addCriterion("ARRANGE_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryEqualTo(String value) {
            addCriterion("ARRANGE_CATEGORY =", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryNotEqualTo(String value) {
            addCriterion("ARRANGE_CATEGORY <>", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryGreaterThan(String value) {
            addCriterion("ARRANGE_CATEGORY >", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGE_CATEGORY >=", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryLessThan(String value) {
            addCriterion("ARRANGE_CATEGORY <", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryLessThanOrEqualTo(String value) {
            addCriterion("ARRANGE_CATEGORY <=", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryLike(String value) {
            addCriterion("ARRANGE_CATEGORY like", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryNotLike(String value) {
            addCriterion("ARRANGE_CATEGORY not like", value, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryIn(List<String> values) {
            addCriterion("ARRANGE_CATEGORY in", values, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryNotIn(List<String> values) {
            addCriterion("ARRANGE_CATEGORY not in", values, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryBetween(String value1, String value2) {
            addCriterion("ARRANGE_CATEGORY between", value1, value2, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeCategoryNotBetween(String value1, String value2) {
            addCriterion("ARRANGE_CATEGORY not between", value1, value2, "arrangeCategory");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeIsNull() {
            addCriterion("ARRANGE_THEME is null");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeIsNotNull() {
            addCriterion("ARRANGE_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeEqualTo(String value) {
            addCriterion("ARRANGE_THEME =", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeNotEqualTo(String value) {
            addCriterion("ARRANGE_THEME <>", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeGreaterThan(String value) {
            addCriterion("ARRANGE_THEME >", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGE_THEME >=", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeLessThan(String value) {
            addCriterion("ARRANGE_THEME <", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeLessThanOrEqualTo(String value) {
            addCriterion("ARRANGE_THEME <=", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeLike(String value) {
            addCriterion("ARRANGE_THEME like", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeNotLike(String value) {
            addCriterion("ARRANGE_THEME not like", value, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeIn(List<String> values) {
            addCriterion("ARRANGE_THEME in", values, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeNotIn(List<String> values) {
            addCriterion("ARRANGE_THEME not in", values, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeBetween(String value1, String value2) {
            addCriterion("ARRANGE_THEME between", value1, value2, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeThemeNotBetween(String value1, String value2) {
            addCriterion("ARRANGE_THEME not between", value1, value2, "arrangeTheme");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdIsNull() {
            addCriterion("FILL_PERSOMMEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdIsNotNull() {
            addCriterion("FILL_PERSOMMEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdEqualTo(Long value) {
            addCriterion("FILL_PERSOMMEL_ID =", value, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdNotEqualTo(Long value) {
            addCriterion("FILL_PERSOMMEL_ID <>", value, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdGreaterThan(Long value) {
            addCriterion("FILL_PERSOMMEL_ID >", value, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FILL_PERSOMMEL_ID >=", value, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdLessThan(Long value) {
            addCriterion("FILL_PERSOMMEL_ID <", value, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdLessThanOrEqualTo(Long value) {
            addCriterion("FILL_PERSOMMEL_ID <=", value, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdIn(List<Long> values) {
            addCriterion("FILL_PERSOMMEL_ID in", values, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdNotIn(List<Long> values) {
            addCriterion("FILL_PERSOMMEL_ID not in", values, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdBetween(Long value1, Long value2) {
            addCriterion("FILL_PERSOMMEL_ID between", value1, value2, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andFillPersommelIdNotBetween(Long value1, Long value2) {
            addCriterion("FILL_PERSOMMEL_ID not between", value1, value2, "fillPersommelId");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeIsNull() {
            addCriterion("ARRANGE_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeIsNotNull() {
            addCriterion("ARRANGE_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeEqualTo(String value) {
            addCriterion("ARRANGE_DESCRIBE =", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeNotEqualTo(String value) {
            addCriterion("ARRANGE_DESCRIBE <>", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeGreaterThan(String value) {
            addCriterion("ARRANGE_DESCRIBE >", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGE_DESCRIBE >=", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeLessThan(String value) {
            addCriterion("ARRANGE_DESCRIBE <", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeLessThanOrEqualTo(String value) {
            addCriterion("ARRANGE_DESCRIBE <=", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeLike(String value) {
            addCriterion("ARRANGE_DESCRIBE like", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeNotLike(String value) {
            addCriterion("ARRANGE_DESCRIBE not like", value, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeIn(List<String> values) {
            addCriterion("ARRANGE_DESCRIBE in", values, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeNotIn(List<String> values) {
            addCriterion("ARRANGE_DESCRIBE not in", values, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeBetween(String value1, String value2) {
            addCriterion("ARRANGE_DESCRIBE between", value1, value2, "arrangeDescribe");
            return (Criteria) this;
        }

        public Criteria andArrangeDescribeNotBetween(String value1, String value2) {
            addCriterion("ARRANGE_DESCRIBE not between", value1, value2, "arrangeDescribe");
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