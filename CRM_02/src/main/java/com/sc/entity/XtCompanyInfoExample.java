package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtCompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtCompanyInfoExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("COMPANY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("COMPANY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("COMPANY_CODE =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("COMPANY_CODE <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("COMPANY_CODE >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_CODE >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("COMPANY_CODE <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_CODE <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("COMPANY_CODE like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("COMPANY_CODE not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("COMPANY_CODE in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("COMPANY_CODE not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("COMPANY_CODE between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("COMPANY_CODE not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andEmlilIsNull() {
            addCriterion("EMLIL is null");
            return (Criteria) this;
        }

        public Criteria andEmlilIsNotNull() {
            addCriterion("EMLIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmlilEqualTo(String value) {
            addCriterion("EMLIL =", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilNotEqualTo(String value) {
            addCriterion("EMLIL <>", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilGreaterThan(String value) {
            addCriterion("EMLIL >", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilGreaterThanOrEqualTo(String value) {
            addCriterion("EMLIL >=", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilLessThan(String value) {
            addCriterion("EMLIL <", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilLessThanOrEqualTo(String value) {
            addCriterion("EMLIL <=", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilLike(String value) {
            addCriterion("EMLIL like", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilNotLike(String value) {
            addCriterion("EMLIL not like", value, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilIn(List<String> values) {
            addCriterion("EMLIL in", values, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilNotIn(List<String> values) {
            addCriterion("EMLIL not in", values, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilBetween(String value1, String value2) {
            addCriterion("EMLIL between", value1, value2, "emlil");
            return (Criteria) this;
        }

        public Criteria andEmlilNotBetween(String value1, String value2) {
            addCriterion("EMLIL not between", value1, value2, "emlil");
            return (Criteria) this;
        }

        public Criteria andLiaisonIsNull() {
            addCriterion("LIAISON is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonIsNotNull() {
            addCriterion("LIAISON is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonEqualTo(String value) {
            addCriterion("LIAISON =", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotEqualTo(String value) {
            addCriterion("LIAISON <>", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonGreaterThan(String value) {
            addCriterion("LIAISON >", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonGreaterThanOrEqualTo(String value) {
            addCriterion("LIAISON >=", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonLessThan(String value) {
            addCriterion("LIAISON <", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonLessThanOrEqualTo(String value) {
            addCriterion("LIAISON <=", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonLike(String value) {
            addCriterion("LIAISON like", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotLike(String value) {
            addCriterion("LIAISON not like", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonIn(List<String> values) {
            addCriterion("LIAISON in", values, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotIn(List<String> values) {
            addCriterion("LIAISON not in", values, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonBetween(String value1, String value2) {
            addCriterion("LIAISON between", value1, value2, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotBetween(String value1, String value2) {
            addCriterion("LIAISON not between", value1, value2, "liaison");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIsNull() {
            addCriterion("COMPANY_ADD is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIsNotNull() {
            addCriterion("COMPANY_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddEqualTo(String value) {
            addCriterion("COMPANY_ADD =", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotEqualTo(String value) {
            addCriterion("COMPANY_ADD <>", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddGreaterThan(String value) {
            addCriterion("COMPANY_ADD >", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADD >=", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLessThan(String value) {
            addCriterion("COMPANY_ADD <", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADD <=", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLike(String value) {
            addCriterion("COMPANY_ADD like", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotLike(String value) {
            addCriterion("COMPANY_ADD not like", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIn(List<String> values) {
            addCriterion("COMPANY_ADD in", values, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotIn(List<String> values) {
            addCriterion("COMPANY_ADD not in", values, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddBetween(String value1, String value2) {
            addCriterion("COMPANY_ADD between", value1, value2, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADD not between", value1, value2, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("\"TEL \" is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("\"TEL \" is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("\"TEL \" =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("\"TEL \" <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("\"TEL \" >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("\"TEL \" >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("\"TEL \" <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("\"TEL \" <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("\"TEL \" like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("\"TEL \" not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("\"TEL \" in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("\"TEL \" not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("\"TEL \" between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("\"TEL \" not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMpIsNull() {
            addCriterion("MP is null");
            return (Criteria) this;
        }

        public Criteria andMpIsNotNull() {
            addCriterion("MP is not null");
            return (Criteria) this;
        }

        public Criteria andMpEqualTo(String value) {
            addCriterion("MP =", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotEqualTo(String value) {
            addCriterion("MP <>", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThan(String value) {
            addCriterion("MP >", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThanOrEqualTo(String value) {
            addCriterion("MP >=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThan(String value) {
            addCriterion("MP <", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThanOrEqualTo(String value) {
            addCriterion("MP <=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLike(String value) {
            addCriterion("MP like", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotLike(String value) {
            addCriterion("MP not like", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpIn(List<String> values) {
            addCriterion("MP in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotIn(List<String> values) {
            addCriterion("MP not in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpBetween(String value1, String value2) {
            addCriterion("MP between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotBetween(String value1, String value2) {
            addCriterion("MP not between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("\"FAX  \" is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("\"FAX  \" is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("\"FAX  \" =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("\"FAX  \" <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("\"FAX  \" >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("\"FAX  \" >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("\"FAX  \" <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("\"FAX  \" <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("\"FAX  \" like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("\"FAX  \" not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("\"FAX  \" in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("\"FAX  \" not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("\"FAX  \" between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("\"FAX  \" not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andBankDepositIsNull() {
            addCriterion("BANK_DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andBankDepositIsNotNull() {
            addCriterion("BANK_DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andBankDepositEqualTo(String value) {
            addCriterion("BANK_DEPOSIT =", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotEqualTo(String value) {
            addCriterion("BANK_DEPOSIT <>", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositGreaterThan(String value) {
            addCriterion("BANK_DEPOSIT >", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_DEPOSIT >=", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLessThan(String value) {
            addCriterion("BANK_DEPOSIT <", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLessThanOrEqualTo(String value) {
            addCriterion("BANK_DEPOSIT <=", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLike(String value) {
            addCriterion("BANK_DEPOSIT like", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotLike(String value) {
            addCriterion("BANK_DEPOSIT not like", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositIn(List<String> values) {
            addCriterion("BANK_DEPOSIT in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotIn(List<String> values) {
            addCriterion("BANK_DEPOSIT not in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositBetween(String value1, String value2) {
            addCriterion("BANK_DEPOSIT between", value1, value2, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotBetween(String value1, String value2) {
            addCriterion("BANK_DEPOSIT not between", value1, value2, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankAccIsNull() {
            addCriterion("BANK_ACC is null");
            return (Criteria) this;
        }

        public Criteria andBankAccIsNotNull() {
            addCriterion("BANK_ACC is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccEqualTo(String value) {
            addCriterion("BANK_ACC =", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccNotEqualTo(String value) {
            addCriterion("BANK_ACC <>", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccGreaterThan(String value) {
            addCriterion("BANK_ACC >", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACC >=", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccLessThan(String value) {
            addCriterion("BANK_ACC <", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACC <=", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccLike(String value) {
            addCriterion("BANK_ACC like", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccNotLike(String value) {
            addCriterion("BANK_ACC not like", value, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccIn(List<String> values) {
            addCriterion("BANK_ACC in", values, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccNotIn(List<String> values) {
            addCriterion("BANK_ACC not in", values, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccBetween(String value1, String value2) {
            addCriterion("BANK_ACC between", value1, value2, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andBankAccNotBetween(String value1, String value2) {
            addCriterion("BANK_ACC not between", value1, value2, "bankAcc");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("EFFECT is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("EFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(String value) {
            addCriterion("EFFECT =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(String value) {
            addCriterion("EFFECT <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(String value) {
            addCriterion("EFFECT >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(String value) {
            addCriterion("EFFECT >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(String value) {
            addCriterion("EFFECT <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(String value) {
            addCriterion("EFFECT <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLike(String value) {
            addCriterion("EFFECT like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotLike(String value) {
            addCriterion("EFFECT not like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<String> values) {
            addCriterion("EFFECT in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<String> values) {
            addCriterion("EFFECT not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(String value1, String value2) {
            addCriterion("EFFECT between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(String value1, String value2) {
            addCriterion("EFFECT not between", value1, value2, "effect");
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