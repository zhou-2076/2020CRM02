package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsFeedbackExample() {
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

        public Criteria andFeedbackIdIsNull() {
            addCriterion("FEEDBACK_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("FEEDBACK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(Long value) {
            addCriterion("FEEDBACK_ID =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(Long value) {
            addCriterion("FEEDBACK_ID <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(Long value) {
            addCriterion("FEEDBACK_ID >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_ID >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(Long value) {
            addCriterion("FEEDBACK_ID <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_ID <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<Long> values) {
            addCriterion("FEEDBACK_ID in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<Long> values) {
            addCriterion("FEEDBACK_ID not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_ID between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_ID not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andPriorIsNull() {
            addCriterion("PRIOR is null");
            return (Criteria) this;
        }

        public Criteria andPriorIsNotNull() {
            addCriterion("PRIOR is not null");
            return (Criteria) this;
        }

        public Criteria andPriorEqualTo(Long value) {
            addCriterion("PRIOR =", value, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorNotEqualTo(Long value) {
            addCriterion("PRIOR <>", value, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorGreaterThan(Long value) {
            addCriterion("PRIOR >", value, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorGreaterThanOrEqualTo(Long value) {
            addCriterion("PRIOR >=", value, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorLessThan(Long value) {
            addCriterion("PRIOR <", value, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorLessThanOrEqualTo(Long value) {
            addCriterion("PRIOR <=", value, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorIn(List<Long> values) {
            addCriterion("PRIOR in", values, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorNotIn(List<Long> values) {
            addCriterion("PRIOR not in", values, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorBetween(Long value1, Long value2) {
            addCriterion("PRIOR between", value1, value2, "prior");
            return (Criteria) this;
        }

        public Criteria andPriorNotBetween(Long value1, Long value2) {
            addCriterion("PRIOR not between", value1, value2, "prior");
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

        public Criteria andFeedbackStatusIsNull() {
            addCriterion("FEEDBACK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusIsNotNull() {
            addCriterion("FEEDBACK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusEqualTo(String value) {
            addCriterion("FEEDBACK_STATUS =", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusNotEqualTo(String value) {
            addCriterion("FEEDBACK_STATUS <>", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusGreaterThan(String value) {
            addCriterion("FEEDBACK_STATUS >", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_STATUS >=", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusLessThan(String value) {
            addCriterion("FEEDBACK_STATUS <", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_STATUS <=", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusLike(String value) {
            addCriterion("FEEDBACK_STATUS like", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusNotLike(String value) {
            addCriterion("FEEDBACK_STATUS not like", value, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusIn(List<String> values) {
            addCriterion("FEEDBACK_STATUS in", values, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusNotIn(List<String> values) {
            addCriterion("FEEDBACK_STATUS not in", values, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusBetween(String value1, String value2) {
            addCriterion("FEEDBACK_STATUS between", value1, value2, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackStatusNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_STATUS not between", value1, value2, "feedbackStatus");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNull() {
            addCriterion("FEEDBACK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNotNull() {
            addCriterion("FEEDBACK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE =", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <>", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThan(String value) {
            addCriterion("FEEDBACK_TYPE >", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE >=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThan(String value) {
            addCriterion("FEEDBACK_TYPE <", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLike(String value) {
            addCriterion("FEEDBACK_TYPE like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotLike(String value) {
            addCriterion("FEEDBACK_TYPE not like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE not in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE not between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("FEEDBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("FEEDBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(Date value) {
            addCriterion("FEEDBACK_TIME >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(Date value) {
            addCriterion("FEEDBACK_TIME <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<Date> values) {
            addCriterion("FEEDBACK_TIME in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<Date> values) {
            addCriterion("FEEDBACK_TIME not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_TIME between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_TIME not between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIsNull() {
            addCriterion("FEEDBACK_REASON is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIsNotNull() {
            addCriterion("FEEDBACK_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonEqualTo(String value) {
            addCriterion("FEEDBACK_REASON =", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotEqualTo(String value) {
            addCriterion("FEEDBACK_REASON <>", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonGreaterThan(String value) {
            addCriterion("FEEDBACK_REASON >", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_REASON >=", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLessThan(String value) {
            addCriterion("FEEDBACK_REASON <", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_REASON <=", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLike(String value) {
            addCriterion("FEEDBACK_REASON like", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotLike(String value) {
            addCriterion("FEEDBACK_REASON not like", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIn(List<String> values) {
            addCriterion("FEEDBACK_REASON in", values, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotIn(List<String> values) {
            addCriterion("FEEDBACK_REASON not in", values, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonBetween(String value1, String value2) {
            addCriterion("FEEDBACK_REASON between", value1, value2, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_REASON not between", value1, value2, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("PRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("PRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("PRINCIPAL =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("PRINCIPAL <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("PRINCIPAL >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("PRINCIPAL <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("PRINCIPAL like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("PRINCIPAL not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("PRINCIPAL in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("PRINCIPAL not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("PRINCIPAL between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceIsNull() {
            addCriterion("FEEDBACK_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceIsNotNull() {
            addCriterion("FEEDBACK_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE =", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE <>", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceGreaterThan(String value) {
            addCriterion("FEEDBACK_SOURCE >", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE >=", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceLessThan(String value) {
            addCriterion("FEEDBACK_SOURCE <", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_SOURCE <=", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceLike(String value) {
            addCriterion("FEEDBACK_SOURCE like", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotLike(String value) {
            addCriterion("FEEDBACK_SOURCE not like", value, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceIn(List<String> values) {
            addCriterion("FEEDBACK_SOURCE in", values, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotIn(List<String> values) {
            addCriterion("FEEDBACK_SOURCE not in", values, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceBetween(String value1, String value2) {
            addCriterion("FEEDBACK_SOURCE between", value1, value2, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackSourceNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_SOURCE not between", value1, value2, "feedbackSource");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeIsNull() {
            addCriterion("FEEDBACK_THEME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeIsNotNull() {
            addCriterion("FEEDBACK_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeEqualTo(String value) {
            addCriterion("FEEDBACK_THEME =", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotEqualTo(String value) {
            addCriterion("FEEDBACK_THEME <>", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeGreaterThan(String value) {
            addCriterion("FEEDBACK_THEME >", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_THEME >=", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeLessThan(String value) {
            addCriterion("FEEDBACK_THEME <", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_THEME <=", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeLike(String value) {
            addCriterion("FEEDBACK_THEME like", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotLike(String value) {
            addCriterion("FEEDBACK_THEME not like", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeIn(List<String> values) {
            addCriterion("FEEDBACK_THEME in", values, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotIn(List<String> values) {
            addCriterion("FEEDBACK_THEME not in", values, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_THEME between", value1, value2, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_THEME not between", value1, value2, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andAnalyseIsNull() {
            addCriterion("ANALYSE is null");
            return (Criteria) this;
        }

        public Criteria andAnalyseIsNotNull() {
            addCriterion("ANALYSE is not null");
            return (Criteria) this;
        }

        public Criteria andAnalyseEqualTo(String value) {
            addCriterion("ANALYSE =", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseNotEqualTo(String value) {
            addCriterion("ANALYSE <>", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseGreaterThan(String value) {
            addCriterion("ANALYSE >", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSE >=", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseLessThan(String value) {
            addCriterion("ANALYSE <", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseLessThanOrEqualTo(String value) {
            addCriterion("ANALYSE <=", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseLike(String value) {
            addCriterion("ANALYSE like", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseNotLike(String value) {
            addCriterion("ANALYSE not like", value, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseIn(List<String> values) {
            addCriterion("ANALYSE in", values, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseNotIn(List<String> values) {
            addCriterion("ANALYSE not in", values, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseBetween(String value1, String value2) {
            addCriterion("ANALYSE between", value1, value2, "analyse");
            return (Criteria) this;
        }

        public Criteria andAnalyseNotBetween(String value1, String value2) {
            addCriterion("ANALYSE not between", value1, value2, "analyse");
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