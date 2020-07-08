package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgOrderExample() {
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

        public Criteria andCgIdIsNull() {
            addCriterion("CG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCgIdIsNotNull() {
            addCriterion("CG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCgIdEqualTo(Long value) {
            addCriterion("CG_ID =", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotEqualTo(Long value) {
            addCriterion("CG_ID <>", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThan(Long value) {
            addCriterion("CG_ID >", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CG_ID >=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThan(Long value) {
            addCriterion("CG_ID <", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThanOrEqualTo(Long value) {
            addCriterion("CG_ID <=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdIn(List<Long> values) {
            addCriterion("CG_ID in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotIn(List<Long> values) {
            addCriterion("CG_ID not in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdBetween(Long value1, Long value2) {
            addCriterion("CG_ID between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotBetween(Long value1, Long value2) {
            addCriterion("CG_ID not between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgTitleIsNull() {
            addCriterion("CG_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCgTitleIsNotNull() {
            addCriterion("CG_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCgTitleEqualTo(String value) {
            addCriterion("CG_TITLE =", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleNotEqualTo(String value) {
            addCriterion("CG_TITLE <>", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleGreaterThan(String value) {
            addCriterion("CG_TITLE >", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CG_TITLE >=", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleLessThan(String value) {
            addCriterion("CG_TITLE <", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleLessThanOrEqualTo(String value) {
            addCriterion("CG_TITLE <=", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleLike(String value) {
            addCriterion("CG_TITLE like", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleNotLike(String value) {
            addCriterion("CG_TITLE not like", value, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleIn(List<String> values) {
            addCriterion("CG_TITLE in", values, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleNotIn(List<String> values) {
            addCriterion("CG_TITLE not in", values, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleBetween(String value1, String value2) {
            addCriterion("CG_TITLE between", value1, value2, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgTitleNotBetween(String value1, String value2) {
            addCriterion("CG_TITLE not between", value1, value2, "cgTitle");
            return (Criteria) this;
        }

        public Criteria andCgDateIsNull() {
            addCriterion("CG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCgDateIsNotNull() {
            addCriterion("CG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCgDateEqualTo(Date value) {
            addCriterion("CG_DATE =", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateNotEqualTo(Date value) {
            addCriterion("CG_DATE <>", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateGreaterThan(Date value) {
            addCriterion("CG_DATE >", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CG_DATE >=", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateLessThan(Date value) {
            addCriterion("CG_DATE <", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateLessThanOrEqualTo(Date value) {
            addCriterion("CG_DATE <=", value, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateIn(List<Date> values) {
            addCriterion("CG_DATE in", values, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateNotIn(List<Date> values) {
            addCriterion("CG_DATE not in", values, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateBetween(Date value1, Date value2) {
            addCriterion("CG_DATE between", value1, value2, "cgDate");
            return (Criteria) this;
        }

        public Criteria andCgDateNotBetween(Date value1, Date value2) {
            addCriterion("CG_DATE not between", value1, value2, "cgDate");
            return (Criteria) this;
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

        public Criteria andDkJeIsNull() {
            addCriterion("DK_JE is null");
            return (Criteria) this;
        }

        public Criteria andDkJeIsNotNull() {
            addCriterion("DK_JE is not null");
            return (Criteria) this;
        }

        public Criteria andDkJeEqualTo(Long value) {
            addCriterion("DK_JE =", value, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeNotEqualTo(Long value) {
            addCriterion("DK_JE <>", value, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeGreaterThan(Long value) {
            addCriterion("DK_JE >", value, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeGreaterThanOrEqualTo(Long value) {
            addCriterion("DK_JE >=", value, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeLessThan(Long value) {
            addCriterion("DK_JE <", value, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeLessThanOrEqualTo(Long value) {
            addCriterion("DK_JE <=", value, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeIn(List<Long> values) {
            addCriterion("DK_JE in", values, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeNotIn(List<Long> values) {
            addCriterion("DK_JE not in", values, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeBetween(Long value1, Long value2) {
            addCriterion("DK_JE between", value1, value2, "dkJe");
            return (Criteria) this;
        }

        public Criteria andDkJeNotBetween(Long value1, Long value2) {
            addCriterion("DK_JE not between", value1, value2, "dkJe");
            return (Criteria) this;
        }

        public Criteria andFpNumberIsNull() {
            addCriterion("FP_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFpNumberIsNotNull() {
            addCriterion("FP_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFpNumberEqualTo(Long value) {
            addCriterion("FP_NUMBER =", value, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberNotEqualTo(Long value) {
            addCriterion("FP_NUMBER <>", value, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberGreaterThan(Long value) {
            addCriterion("FP_NUMBER >", value, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("FP_NUMBER >=", value, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberLessThan(Long value) {
            addCriterion("FP_NUMBER <", value, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberLessThanOrEqualTo(Long value) {
            addCriterion("FP_NUMBER <=", value, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberIn(List<Long> values) {
            addCriterion("FP_NUMBER in", values, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberNotIn(List<Long> values) {
            addCriterion("FP_NUMBER not in", values, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberBetween(Long value1, Long value2) {
            addCriterion("FP_NUMBER between", value1, value2, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFpNumberNotBetween(Long value1, Long value2) {
            addCriterion("FP_NUMBER not between", value1, value2, "fpNumber");
            return (Criteria) this;
        }

        public Criteria andFkQkIsNull() {
            addCriterion("FK_QK is null");
            return (Criteria) this;
        }

        public Criteria andFkQkIsNotNull() {
            addCriterion("FK_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFkQkEqualTo(String value) {
            addCriterion("FK_QK =", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkNotEqualTo(String value) {
            addCriterion("FK_QK <>", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkGreaterThan(String value) {
            addCriterion("FK_QK >", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkGreaterThanOrEqualTo(String value) {
            addCriterion("FK_QK >=", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkLessThan(String value) {
            addCriterion("FK_QK <", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkLessThanOrEqualTo(String value) {
            addCriterion("FK_QK <=", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkLike(String value) {
            addCriterion("FK_QK like", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkNotLike(String value) {
            addCriterion("FK_QK not like", value, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkIn(List<String> values) {
            addCriterion("FK_QK in", values, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkNotIn(List<String> values) {
            addCriterion("FK_QK not in", values, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkBetween(String value1, String value2) {
            addCriterion("FK_QK between", value1, value2, "fkQk");
            return (Criteria) this;
        }

        public Criteria andFkQkNotBetween(String value1, String value2) {
            addCriterion("FK_QK not between", value1, value2, "fkQk");
            return (Criteria) this;
        }

        public Criteria andCgJzIsNull() {
            addCriterion("CG_JZ is null");
            return (Criteria) this;
        }

        public Criteria andCgJzIsNotNull() {
            addCriterion("CG_JZ is not null");
            return (Criteria) this;
        }

        public Criteria andCgJzEqualTo(String value) {
            addCriterion("CG_JZ =", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotEqualTo(String value) {
            addCriterion("CG_JZ <>", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzGreaterThan(String value) {
            addCriterion("CG_JZ >", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzGreaterThanOrEqualTo(String value) {
            addCriterion("CG_JZ >=", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzLessThan(String value) {
            addCriterion("CG_JZ <", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzLessThanOrEqualTo(String value) {
            addCriterion("CG_JZ <=", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzLike(String value) {
            addCriterion("CG_JZ like", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotLike(String value) {
            addCriterion("CG_JZ not like", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzIn(List<String> values) {
            addCriterion("CG_JZ in", values, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotIn(List<String> values) {
            addCriterion("CG_JZ not in", values, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzBetween(String value1, String value2) {
            addCriterion("CG_JZ between", value1, value2, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotBetween(String value1, String value2) {
            addCriterion("CG_JZ not between", value1, value2, "cgJz");
            return (Criteria) this;
        }

        public Criteria andJhDateIsNull() {
            addCriterion("JH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andJhDateIsNotNull() {
            addCriterion("JH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andJhDateEqualTo(Date value) {
            addCriterion("JH_DATE =", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateNotEqualTo(Date value) {
            addCriterion("JH_DATE <>", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateGreaterThan(Date value) {
            addCriterion("JH_DATE >", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateGreaterThanOrEqualTo(Date value) {
            addCriterion("JH_DATE >=", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateLessThan(Date value) {
            addCriterion("JH_DATE <", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateLessThanOrEqualTo(Date value) {
            addCriterion("JH_DATE <=", value, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateIn(List<Date> values) {
            addCriterion("JH_DATE in", values, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateNotIn(List<Date> values) {
            addCriterion("JH_DATE not in", values, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateBetween(Date value1, Date value2) {
            addCriterion("JH_DATE between", value1, value2, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhDateNotBetween(Date value1, Date value2) {
            addCriterion("JH_DATE not between", value1, value2, "jhDate");
            return (Criteria) this;
        }

        public Criteria andJhAddressIsNull() {
            addCriterion("JH_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andJhAddressIsNotNull() {
            addCriterion("JH_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andJhAddressEqualTo(String value) {
            addCriterion("JH_ADDRESS =", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressNotEqualTo(String value) {
            addCriterion("JH_ADDRESS <>", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressGreaterThan(String value) {
            addCriterion("JH_ADDRESS >", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressGreaterThanOrEqualTo(String value) {
            addCriterion("JH_ADDRESS >=", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressLessThan(String value) {
            addCriterion("JH_ADDRESS <", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressLessThanOrEqualTo(String value) {
            addCriterion("JH_ADDRESS <=", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressLike(String value) {
            addCriterion("JH_ADDRESS like", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressNotLike(String value) {
            addCriterion("JH_ADDRESS not like", value, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressIn(List<String> values) {
            addCriterion("JH_ADDRESS in", values, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressNotIn(List<String> values) {
            addCriterion("JH_ADDRESS not in", values, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressBetween(String value1, String value2) {
            addCriterion("JH_ADDRESS between", value1, value2, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhAddressNotBetween(String value1, String value2) {
            addCriterion("JH_ADDRESS not between", value1, value2, "jhAddress");
            return (Criteria) this;
        }

        public Criteria andJhFsIsNull() {
            addCriterion("JH_FS is null");
            return (Criteria) this;
        }

        public Criteria andJhFsIsNotNull() {
            addCriterion("JH_FS is not null");
            return (Criteria) this;
        }

        public Criteria andJhFsEqualTo(String value) {
            addCriterion("JH_FS =", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsNotEqualTo(String value) {
            addCriterion("JH_FS <>", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsGreaterThan(String value) {
            addCriterion("JH_FS >", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsGreaterThanOrEqualTo(String value) {
            addCriterion("JH_FS >=", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsLessThan(String value) {
            addCriterion("JH_FS <", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsLessThanOrEqualTo(String value) {
            addCriterion("JH_FS <=", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsLike(String value) {
            addCriterion("JH_FS like", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsNotLike(String value) {
            addCriterion("JH_FS not like", value, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsIn(List<String> values) {
            addCriterion("JH_FS in", values, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsNotIn(List<String> values) {
            addCriterion("JH_FS not in", values, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsBetween(String value1, String value2) {
            addCriterion("JH_FS between", value1, value2, "jhFs");
            return (Criteria) this;
        }

        public Criteria andJhFsNotBetween(String value1, String value2) {
            addCriterion("JH_FS not between", value1, value2, "jhFs");
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