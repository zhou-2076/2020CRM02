package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtUserInfoExample() {
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

        public Criteria andWorkerIdIsNull() {
            addCriterion("WORKER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("WORKER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(Long value) {
            addCriterion("WORKER_ID =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(Long value) {
            addCriterion("WORKER_ID <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(Long value) {
            addCriterion("WORKER_ID >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WORKER_ID >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(Long value) {
            addCriterion("WORKER_ID <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(Long value) {
            addCriterion("WORKER_ID <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<Long> values) {
            addCriterion("WORKER_ID in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<Long> values) {
            addCriterion("WORKER_ID not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(Long value1, Long value2) {
            addCriterion("WORKER_ID between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(Long value1, Long value2) {
            addCriterion("WORKER_ID not between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNull() {
            addCriterion("WORKER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("WORKER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("WORKER_NAME =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("WORKER_NAME <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("WORKER_NAME >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_NAME >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("WORKER_NAME <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("WORKER_NAME <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("WORKER_NAME like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("WORKER_NAME not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("WORKER_NAME in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("WORKER_NAME not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("WORKER_NAME between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("WORKER_NAME not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNull() {
            addCriterion("WORKER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNotNull() {
            addCriterion("WORKER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexEqualTo(String value) {
            addCriterion("WORKER_SEX =", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotEqualTo(String value) {
            addCriterion("WORKER_SEX <>", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThan(String value) {
            addCriterion("WORKER_SEX >", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_SEX >=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThan(String value) {
            addCriterion("WORKER_SEX <", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThanOrEqualTo(String value) {
            addCriterion("WORKER_SEX <=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLike(String value) {
            addCriterion("WORKER_SEX like", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotLike(String value) {
            addCriterion("WORKER_SEX not like", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIn(List<String> values) {
            addCriterion("WORKER_SEX in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotIn(List<String> values) {
            addCriterion("WORKER_SEX not in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexBetween(String value1, String value2) {
            addCriterion("WORKER_SEX between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotBetween(String value1, String value2) {
            addCriterion("WORKER_SEX not between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoIsNull() {
            addCriterion("WORKER_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoIsNotNull() {
            addCriterion("WORKER_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoEqualTo(String value) {
            addCriterion("WORKER_PHOTO =", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotEqualTo(String value) {
            addCriterion("WORKER_PHOTO <>", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoGreaterThan(String value) {
            addCriterion("WORKER_PHOTO >", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_PHOTO >=", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoLessThan(String value) {
            addCriterion("WORKER_PHOTO <", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoLessThanOrEqualTo(String value) {
            addCriterion("WORKER_PHOTO <=", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoLike(String value) {
            addCriterion("WORKER_PHOTO like", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotLike(String value) {
            addCriterion("WORKER_PHOTO not like", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoIn(List<String> values) {
            addCriterion("WORKER_PHOTO in", values, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotIn(List<String> values) {
            addCriterion("WORKER_PHOTO not in", values, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoBetween(String value1, String value2) {
            addCriterion("WORKER_PHOTO between", value1, value2, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotBetween(String value1, String value2) {
            addCriterion("WORKER_PHOTO not between", value1, value2, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNull() {
            addCriterion("HOME_ADD is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNotNull() {
            addCriterion("HOME_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddEqualTo(String value) {
            addCriterion("HOME_ADD =", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotEqualTo(String value) {
            addCriterion("HOME_ADD <>", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThan(String value) {
            addCriterion("HOME_ADD >", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_ADD >=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThan(String value) {
            addCriterion("HOME_ADD <", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThanOrEqualTo(String value) {
            addCriterion("HOME_ADD <=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLike(String value) {
            addCriterion("HOME_ADD like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotLike(String value) {
            addCriterion("HOME_ADD not like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddIn(List<String> values) {
            addCriterion("HOME_ADD in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotIn(List<String> values) {
            addCriterion("HOME_ADD not in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddBetween(String value1, String value2) {
            addCriterion("HOME_ADD between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotBetween(String value1, String value2) {
            addCriterion("HOME_ADD not between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddIsNull() {
            addCriterion("NOW_ADD is null");
            return (Criteria) this;
        }

        public Criteria andNowAddIsNotNull() {
            addCriterion("NOW_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andNowAddEqualTo(String value) {
            addCriterion("NOW_ADD =", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddNotEqualTo(String value) {
            addCriterion("NOW_ADD <>", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddGreaterThan(String value) {
            addCriterion("NOW_ADD >", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_ADD >=", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddLessThan(String value) {
            addCriterion("NOW_ADD <", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddLessThanOrEqualTo(String value) {
            addCriterion("NOW_ADD <=", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddLike(String value) {
            addCriterion("NOW_ADD like", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddNotLike(String value) {
            addCriterion("NOW_ADD not like", value, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddIn(List<String> values) {
            addCriterion("NOW_ADD in", values, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddNotIn(List<String> values) {
            addCriterion("NOW_ADD not in", values, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddBetween(String value1, String value2) {
            addCriterion("NOW_ADD between", value1, value2, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andNowAddNotBetween(String value1, String value2) {
            addCriterion("NOW_ADD not between", value1, value2, "nowAdd");
            return (Criteria) this;
        }

        public Criteria andWorkerEduIsNull() {
            addCriterion("WORKER_EDU is null");
            return (Criteria) this;
        }

        public Criteria andWorkerEduIsNotNull() {
            addCriterion("WORKER_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerEduEqualTo(String value) {
            addCriterion("WORKER_EDU =", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotEqualTo(String value) {
            addCriterion("WORKER_EDU <>", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduGreaterThan(String value) {
            addCriterion("WORKER_EDU >", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_EDU >=", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduLessThan(String value) {
            addCriterion("WORKER_EDU <", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduLessThanOrEqualTo(String value) {
            addCriterion("WORKER_EDU <=", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduLike(String value) {
            addCriterion("WORKER_EDU like", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotLike(String value) {
            addCriterion("WORKER_EDU not like", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduIn(List<String> values) {
            addCriterion("WORKER_EDU in", values, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotIn(List<String> values) {
            addCriterion("WORKER_EDU not in", values, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduBetween(String value1, String value2) {
            addCriterion("WORKER_EDU between", value1, value2, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotBetween(String value1, String value2) {
            addCriterion("WORKER_EDU not between", value1, value2, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNull() {
            addCriterion("POLITICS is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNotNull() {
            addCriterion("POLITICS is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsEqualTo(String value) {
            addCriterion("POLITICS =", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotEqualTo(String value) {
            addCriterion("POLITICS <>", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThan(String value) {
            addCriterion("POLITICS >", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICS >=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThan(String value) {
            addCriterion("POLITICS <", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThanOrEqualTo(String value) {
            addCriterion("POLITICS <=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLike(String value) {
            addCriterion("POLITICS like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotLike(String value) {
            addCriterion("POLITICS not like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsIn(List<String> values) {
            addCriterion("POLITICS in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotIn(List<String> values) {
            addCriterion("POLITICS not in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsBetween(String value1, String value2) {
            addCriterion("POLITICS between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotBetween(String value1, String value2) {
            addCriterion("POLITICS not between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIsNull() {
            addCriterion("WORKER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIsNotNull() {
            addCriterion("WORKER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerTelEqualTo(String value) {
            addCriterion("WORKER_TEL =", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotEqualTo(String value) {
            addCriterion("WORKER_TEL <>", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelGreaterThan(String value) {
            addCriterion("WORKER_TEL >", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_TEL >=", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLessThan(String value) {
            addCriterion("WORKER_TEL <", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLessThanOrEqualTo(String value) {
            addCriterion("WORKER_TEL <=", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLike(String value) {
            addCriterion("WORKER_TEL like", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotLike(String value) {
            addCriterion("WORKER_TEL not like", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIn(List<String> values) {
            addCriterion("WORKER_TEL in", values, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotIn(List<String> values) {
            addCriterion("WORKER_TEL not in", values, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelBetween(String value1, String value2) {
            addCriterion("WORKER_TEL between", value1, value2, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotBetween(String value1, String value2) {
            addCriterion("WORKER_TEL not between", value1, value2, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWebRelationIsNull() {
            addCriterion("WEB_RELATION is null");
            return (Criteria) this;
        }

        public Criteria andWebRelationIsNotNull() {
            addCriterion("WEB_RELATION is not null");
            return (Criteria) this;
        }

        public Criteria andWebRelationEqualTo(String value) {
            addCriterion("WEB_RELATION =", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationNotEqualTo(String value) {
            addCriterion("WEB_RELATION <>", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationGreaterThan(String value) {
            addCriterion("WEB_RELATION >", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_RELATION >=", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationLessThan(String value) {
            addCriterion("WEB_RELATION <", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationLessThanOrEqualTo(String value) {
            addCriterion("WEB_RELATION <=", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationLike(String value) {
            addCriterion("WEB_RELATION like", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationNotLike(String value) {
            addCriterion("WEB_RELATION not like", value, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationIn(List<String> values) {
            addCriterion("WEB_RELATION in", values, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationNotIn(List<String> values) {
            addCriterion("WEB_RELATION not in", values, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationBetween(String value1, String value2) {
            addCriterion("WEB_RELATION between", value1, value2, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebRelationNotBetween(String value1, String value2) {
            addCriterion("WEB_RELATION not between", value1, value2, "webRelation");
            return (Criteria) this;
        }

        public Criteria andWebDetaIsNull() {
            addCriterion("WEB_DETA is null");
            return (Criteria) this;
        }

        public Criteria andWebDetaIsNotNull() {
            addCriterion("WEB_DETA is not null");
            return (Criteria) this;
        }

        public Criteria andWebDetaEqualTo(String value) {
            addCriterion("WEB_DETA =", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaNotEqualTo(String value) {
            addCriterion("WEB_DETA <>", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaGreaterThan(String value) {
            addCriterion("WEB_DETA >", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_DETA >=", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaLessThan(String value) {
            addCriterion("WEB_DETA <", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaLessThanOrEqualTo(String value) {
            addCriterion("WEB_DETA <=", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaLike(String value) {
            addCriterion("WEB_DETA like", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaNotLike(String value) {
            addCriterion("WEB_DETA not like", value, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaIn(List<String> values) {
            addCriterion("WEB_DETA in", values, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaNotIn(List<String> values) {
            addCriterion("WEB_DETA not in", values, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaBetween(String value1, String value2) {
            addCriterion("WEB_DETA between", value1, value2, "webDeta");
            return (Criteria) this;
        }

        public Criteria andWebDetaNotBetween(String value1, String value2) {
            addCriterion("WEB_DETA not between", value1, value2, "webDeta");
            return (Criteria) this;
        }

        public Criteria andAudItIsNull() {
            addCriterion("AUD_IT is null");
            return (Criteria) this;
        }

        public Criteria andAudItIsNotNull() {
            addCriterion("AUD_IT is not null");
            return (Criteria) this;
        }

        public Criteria andAudItEqualTo(String value) {
            addCriterion("AUD_IT =", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItNotEqualTo(String value) {
            addCriterion("AUD_IT <>", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItGreaterThan(String value) {
            addCriterion("AUD_IT >", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItGreaterThanOrEqualTo(String value) {
            addCriterion("AUD_IT >=", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItLessThan(String value) {
            addCriterion("AUD_IT <", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItLessThanOrEqualTo(String value) {
            addCriterion("AUD_IT <=", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItLike(String value) {
            addCriterion("AUD_IT like", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItNotLike(String value) {
            addCriterion("AUD_IT not like", value, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItIn(List<String> values) {
            addCriterion("AUD_IT in", values, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItNotIn(List<String> values) {
            addCriterion("AUD_IT not in", values, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItBetween(String value1, String value2) {
            addCriterion("AUD_IT between", value1, value2, "audIt");
            return (Criteria) this;
        }

        public Criteria andAudItNotBetween(String value1, String value2) {
            addCriterion("AUD_IT not between", value1, value2, "audIt");
            return (Criteria) this;
        }

        public Criteria andDutiesIdIsNull() {
            addCriterion("DUTIES_ID is null");
            return (Criteria) this;
        }

        public Criteria andDutiesIdIsNotNull() {
            addCriterion("DUTIES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDutiesIdEqualTo(Long value) {
            addCriterion("DUTIES_ID =", value, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdNotEqualTo(Long value) {
            addCriterion("DUTIES_ID <>", value, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdGreaterThan(Long value) {
            addCriterion("DUTIES_ID >", value, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DUTIES_ID >=", value, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdLessThan(Long value) {
            addCriterion("DUTIES_ID <", value, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdLessThanOrEqualTo(Long value) {
            addCriterion("DUTIES_ID <=", value, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdIn(List<Long> values) {
            addCriterion("DUTIES_ID in", values, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdNotIn(List<Long> values) {
            addCriterion("DUTIES_ID not in", values, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdBetween(Long value1, Long value2) {
            addCriterion("DUTIES_ID between", value1, value2, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andDutiesIdNotBetween(Long value1, Long value2) {
            addCriterion("DUTIES_ID not between", value1, value2, "dutiesId");
            return (Criteria) this;
        }

        public Criteria andWorkerStaIsNull() {
            addCriterion("WORKER_STA is null");
            return (Criteria) this;
        }

        public Criteria andWorkerStaIsNotNull() {
            addCriterion("WORKER_STA is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerStaEqualTo(String value) {
            addCriterion("WORKER_STA =", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaNotEqualTo(String value) {
            addCriterion("WORKER_STA <>", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaGreaterThan(String value) {
            addCriterion("WORKER_STA >", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_STA >=", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaLessThan(String value) {
            addCriterion("WORKER_STA <", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaLessThanOrEqualTo(String value) {
            addCriterion("WORKER_STA <=", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaLike(String value) {
            addCriterion("WORKER_STA like", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaNotLike(String value) {
            addCriterion("WORKER_STA not like", value, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaIn(List<String> values) {
            addCriterion("WORKER_STA in", values, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaNotIn(List<String> values) {
            addCriterion("WORKER_STA not in", values, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaBetween(String value1, String value2) {
            addCriterion("WORKER_STA between", value1, value2, "workerSta");
            return (Criteria) this;
        }

        public Criteria andWorkerStaNotBetween(String value1, String value2) {
            addCriterion("WORKER_STA not between", value1, value2, "workerSta");
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