package com.aisino.db1.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andOrgCustomerIdIsNull() {
            addCriterion("ORG_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdIsNotNull() {
            addCriterion("ORG_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdEqualTo(Long value) {
            addCriterion("ORG_CUSTOMER_ID =", value, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdNotEqualTo(Long value) {
            addCriterion("ORG_CUSTOMER_ID <>", value, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdGreaterThan(Long value) {
            addCriterion("ORG_CUSTOMER_ID >", value, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_CUSTOMER_ID >=", value, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdLessThan(Long value) {
            addCriterion("ORG_CUSTOMER_ID <", value, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_CUSTOMER_ID <=", value, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdIn(List<Long> values) {
            addCriterion("ORG_CUSTOMER_ID in", values, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdNotIn(List<Long> values) {
            addCriterion("ORG_CUSTOMER_ID not in", values, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdBetween(Long value1, Long value2) {
            addCriterion("ORG_CUSTOMER_ID between", value1, value2, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrgCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_CUSTOMER_ID not between", value1, value2, "orgCustomerId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdIsNull() {
            addCriterion("CUST_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustClassIdIsNotNull() {
            addCriterion("CUST_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustClassIdEqualTo(Integer value) {
            addCriterion("CUST_CLASS_ID =", value, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdNotEqualTo(Integer value) {
            addCriterion("CUST_CLASS_ID <>", value, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdGreaterThan(Integer value) {
            addCriterion("CUST_CLASS_ID >", value, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUST_CLASS_ID >=", value, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdLessThan(Integer value) {
            addCriterion("CUST_CLASS_ID <", value, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUST_CLASS_ID <=", value, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdIn(List<Integer> values) {
            addCriterion("CUST_CLASS_ID in", values, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdNotIn(List<Integer> values) {
            addCriterion("CUST_CLASS_ID not in", values, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdBetween(Integer value1, Integer value2) {
            addCriterion("CUST_CLASS_ID between", value1, value2, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUST_CLASS_ID not between", value1, value2, "custClassId");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeIsNull() {
            addCriterion("CUST_TAX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeIsNotNull() {
            addCriterion("CUST_TAX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeEqualTo(String value) {
            addCriterion("CUST_TAX_CODE =", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeNotEqualTo(String value) {
            addCriterion("CUST_TAX_CODE <>", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeGreaterThan(String value) {
            addCriterion("CUST_TAX_CODE >", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TAX_CODE >=", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeLessThan(String value) {
            addCriterion("CUST_TAX_CODE <", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeLessThanOrEqualTo(String value) {
            addCriterion("CUST_TAX_CODE <=", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeLike(String value) {
            addCriterion("CUST_TAX_CODE like", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeNotLike(String value) {
            addCriterion("CUST_TAX_CODE not like", value, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeIn(List<String> values) {
            addCriterion("CUST_TAX_CODE in", values, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeNotIn(List<String> values) {
            addCriterion("CUST_TAX_CODE not in", values, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeBetween(String value1, String value2) {
            addCriterion("CUST_TAX_CODE between", value1, value2, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andCustTaxCodeNotBetween(String value1, String value2) {
            addCriterion("CUST_TAX_CODE not between", value1, value2, "custTaxCode");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdIsNull() {
            addCriterion("TAX_BUREAU_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdIsNotNull() {
            addCriterion("TAX_BUREAU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdEqualTo(Integer value) {
            addCriterion("TAX_BUREAU_ID =", value, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdNotEqualTo(Integer value) {
            addCriterion("TAX_BUREAU_ID <>", value, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdGreaterThan(Integer value) {
            addCriterion("TAX_BUREAU_ID >", value, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAX_BUREAU_ID >=", value, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdLessThan(Integer value) {
            addCriterion("TAX_BUREAU_ID <", value, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdLessThanOrEqualTo(Integer value) {
            addCriterion("TAX_BUREAU_ID <=", value, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdIn(List<Integer> values) {
            addCriterion("TAX_BUREAU_ID in", values, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdNotIn(List<Integer> values) {
            addCriterion("TAX_BUREAU_ID not in", values, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdBetween(Integer value1, Integer value2) {
            addCriterion("TAX_BUREAU_ID between", value1, value2, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andTaxBureauIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TAX_BUREAU_ID not between", value1, value2, "taxBureauId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdIsNull() {
            addCriterion("SUBSTATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubstationIdIsNotNull() {
            addCriterion("SUBSTATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubstationIdEqualTo(Integer value) {
            addCriterion("SUBSTATION_ID =", value, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdNotEqualTo(Integer value) {
            addCriterion("SUBSTATION_ID <>", value, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdGreaterThan(Integer value) {
            addCriterion("SUBSTATION_ID >", value, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUBSTATION_ID >=", value, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdLessThan(Integer value) {
            addCriterion("SUBSTATION_ID <", value, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUBSTATION_ID <=", value, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdIn(List<Integer> values) {
            addCriterion("SUBSTATION_ID in", values, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdNotIn(List<Integer> values) {
            addCriterion("SUBSTATION_ID not in", values, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdBetween(Integer value1, Integer value2) {
            addCriterion("SUBSTATION_ID between", value1, value2, "substationId");
            return (Criteria) this;
        }

        public Criteria andSubstationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUBSTATION_ID not between", value1, value2, "substationId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdIsNull() {
            addCriterion("SERVICE_PERSONAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdIsNotNull() {
            addCriterion("SERVICE_PERSONAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdEqualTo(Integer value) {
            addCriterion("SERVICE_PERSONAL_ID =", value, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdNotEqualTo(Integer value) {
            addCriterion("SERVICE_PERSONAL_ID <>", value, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdGreaterThan(Integer value) {
            addCriterion("SERVICE_PERSONAL_ID >", value, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_PERSONAL_ID >=", value, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdLessThan(Integer value) {
            addCriterion("SERVICE_PERSONAL_ID <", value, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_PERSONAL_ID <=", value, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdIn(List<Integer> values) {
            addCriterion("SERVICE_PERSONAL_ID in", values, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdNotIn(List<Integer> values) {
            addCriterion("SERVICE_PERSONAL_ID not in", values, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_PERSONAL_ID between", value1, value2, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andServicePersonalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_PERSONAL_ID not between", value1, value2, "servicePersonalId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
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

        public Criteria andRegionIdIsNull() {
            addCriterion("REGION_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("REGION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("REGION_ID =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("REGION_ID <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("REGION_ID >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGION_ID >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("REGION_ID <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("REGION_ID <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("REGION_ID in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("REGION_ID not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("REGION_ID between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REGION_ID not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdIsNull() {
            addCriterion("ENTERPRISE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdIsNotNull() {
            addCriterion("ENTERPRISE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdEqualTo(Integer value) {
            addCriterion("ENTERPRISE_TYPE_ID =", value, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdNotEqualTo(Integer value) {
            addCriterion("ENTERPRISE_TYPE_ID <>", value, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdGreaterThan(Integer value) {
            addCriterion("ENTERPRISE_TYPE_ID >", value, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_TYPE_ID >=", value, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdLessThan(Integer value) {
            addCriterion("ENTERPRISE_TYPE_ID <", value, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_TYPE_ID <=", value, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdIn(List<Integer> values) {
            addCriterion("ENTERPRISE_TYPE_ID in", values, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdNotIn(List<Integer> values) {
            addCriterion("ENTERPRISE_TYPE_ID not in", values, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_TYPE_ID between", value1, value2, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_TYPE_ID not between", value1, value2, "enterpriseTypeId");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNull() {
            addCriterion("VOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNotNull() {
            addCriterion("VOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVocationIdEqualTo(Integer value) {
            addCriterion("VOCATION_ID =", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotEqualTo(Integer value) {
            addCriterion("VOCATION_ID <>", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThan(Integer value) {
            addCriterion("VOCATION_ID >", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOCATION_ID >=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThan(Integer value) {
            addCriterion("VOCATION_ID <", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("VOCATION_ID <=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdIn(List<Integer> values) {
            addCriterion("VOCATION_ID in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotIn(List<Integer> values) {
            addCriterion("VOCATION_ID not in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdBetween(Integer value1, Integer value2) {
            addCriterion("VOCATION_ID between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VOCATION_ID not between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("BUSINESS_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("BUSINESS_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("BUSINESS_SCOPE >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("BUSINESS_SCOPE <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("BUSINESS_SCOPE like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("BUSINESS_SCOPE not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNull() {
            addCriterion("ACCOUNT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNotNull() {
            addCriterion("ACCOUNT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBankEqualTo(String value) {
            addCriterion("ACCOUNT_BANK =", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotEqualTo(String value) {
            addCriterion("ACCOUNT_BANK <>", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThan(String value) {
            addCriterion("ACCOUNT_BANK >", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK >=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThan(String value) {
            addCriterion("ACCOUNT_BANK <", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK <=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLike(String value) {
            addCriterion("ACCOUNT_BANK like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotLike(String value) {
            addCriterion("ACCOUNT_BANK not like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankIn(List<String> values) {
            addCriterion("ACCOUNT_BANK in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotIn(List<String> values) {
            addCriterion("ACCOUNT_BANK not in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK not between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("REGISTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("REGISTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("REGISTER_DATE =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("REGISTER_DATE <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("REGISTER_DATE >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("REGISTER_DATE <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("REGISTER_DATE in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("REGISTER_DATE not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andIsMissingIsNull() {
            addCriterion("IS_MISSING is null");
            return (Criteria) this;
        }

        public Criteria andIsMissingIsNotNull() {
            addCriterion("IS_MISSING is not null");
            return (Criteria) this;
        }

        public Criteria andIsMissingEqualTo(Short value) {
            addCriterion("IS_MISSING =", value, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingNotEqualTo(Short value) {
            addCriterion("IS_MISSING <>", value, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingGreaterThan(Short value) {
            addCriterion("IS_MISSING >", value, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_MISSING >=", value, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingLessThan(Short value) {
            addCriterion("IS_MISSING <", value, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingLessThanOrEqualTo(Short value) {
            addCriterion("IS_MISSING <=", value, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingIn(List<Short> values) {
            addCriterion("IS_MISSING in", values, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingNotIn(List<Short> values) {
            addCriterion("IS_MISSING not in", values, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingBetween(Short value1, Short value2) {
            addCriterion("IS_MISSING between", value1, value2, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsMissingNotBetween(Short value1, Short value2) {
            addCriterion("IS_MISSING not between", value1, value2, "isMissing");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Short value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Short value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Short value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Short value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Short value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Short> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Short> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Short value1, Short value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Short value1, Short value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("CREATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("CREATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Integer value) {
            addCriterion("CREATER_ID =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Integer value) {
            addCriterion("CREATER_ID <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Integer value) {
            addCriterion("CREATER_ID >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATER_ID >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Integer value) {
            addCriterion("CREATER_ID <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATER_ID <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Integer> values) {
            addCriterion("CREATER_ID in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Integer> values) {
            addCriterion("CREATER_ID not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATER_ID between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATER_ID not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdIsNull() {
            addCriterion("UPDATE_OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdIsNotNull() {
            addCriterion("UPDATE_OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdEqualTo(Integer value) {
            addCriterion("UPDATE_OPERATOR_ID =", value, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdNotEqualTo(Integer value) {
            addCriterion("UPDATE_OPERATOR_ID <>", value, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdGreaterThan(Integer value) {
            addCriterion("UPDATE_OPERATOR_ID >", value, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_OPERATOR_ID >=", value, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdLessThan(Integer value) {
            addCriterion("UPDATE_OPERATOR_ID <", value, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_OPERATOR_ID <=", value, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdIn(List<Integer> values) {
            addCriterion("UPDATE_OPERATOR_ID in", values, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdNotIn(List<Integer> values) {
            addCriterion("UPDATE_OPERATOR_ID not in", values, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_OPERATOR_ID between", value1, value2, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_OPERATOR_ID not between", value1, value2, "updateOperatorId");
            return (Criteria) this;
        }

        public Criteria andShortcutIsNull() {
            addCriterion("SHORTCUT is null");
            return (Criteria) this;
        }

        public Criteria andShortcutIsNotNull() {
            addCriterion("SHORTCUT is not null");
            return (Criteria) this;
        }

        public Criteria andShortcutEqualTo(String value) {
            addCriterion("SHORTCUT =", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotEqualTo(String value) {
            addCriterion("SHORTCUT <>", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutGreaterThan(String value) {
            addCriterion("SHORTCUT >", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTCUT >=", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutLessThan(String value) {
            addCriterion("SHORTCUT <", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutLessThanOrEqualTo(String value) {
            addCriterion("SHORTCUT <=", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutLike(String value) {
            addCriterion("SHORTCUT like", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotLike(String value) {
            addCriterion("SHORTCUT not like", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutIn(List<String> values) {
            addCriterion("SHORTCUT in", values, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotIn(List<String> values) {
            addCriterion("SHORTCUT not in", values, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutBetween(String value1, String value2) {
            addCriterion("SHORTCUT between", value1, value2, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotBetween(String value1, String value2) {
            addCriterion("SHORTCUT not between", value1, value2, "shortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdIsNull() {
            addCriterion("SUB_SECURITY_BUREAU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdIsNotNull() {
            addCriterion("SUB_SECURITY_BUREAU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdEqualTo(Integer value) {
            addCriterion("SUB_SECURITY_BUREAU_ID =", value, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdNotEqualTo(Integer value) {
            addCriterion("SUB_SECURITY_BUREAU_ID <>", value, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdGreaterThan(Integer value) {
            addCriterion("SUB_SECURITY_BUREAU_ID >", value, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_SECURITY_BUREAU_ID >=", value, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdLessThan(Integer value) {
            addCriterion("SUB_SECURITY_BUREAU_ID <", value, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_SECURITY_BUREAU_ID <=", value, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdIn(List<Integer> values) {
            addCriterion("SUB_SECURITY_BUREAU_ID in", values, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdNotIn(List<Integer> values) {
            addCriterion("SUB_SECURITY_BUREAU_ID not in", values, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdBetween(Integer value1, Integer value2) {
            addCriterion("SUB_SECURITY_BUREAU_ID between", value1, value2, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_SECURITY_BUREAU_ID not between", value1, value2, "subSecurityBureauId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdIsNull() {
            addCriterion("STAR_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdIsNotNull() {
            addCriterion("STAR_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdEqualTo(String value) {
            addCriterion("STAR_LEVEL_ID =", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdNotEqualTo(String value) {
            addCriterion("STAR_LEVEL_ID <>", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdGreaterThan(String value) {
            addCriterion("STAR_LEVEL_ID >", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("STAR_LEVEL_ID >=", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdLessThan(String value) {
            addCriterion("STAR_LEVEL_ID <", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdLessThanOrEqualTo(String value) {
            addCriterion("STAR_LEVEL_ID <=", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdLike(String value) {
            addCriterion("STAR_LEVEL_ID like", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdNotLike(String value) {
            addCriterion("STAR_LEVEL_ID not like", value, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdIn(List<String> values) {
            addCriterion("STAR_LEVEL_ID in", values, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdNotIn(List<String> values) {
            addCriterion("STAR_LEVEL_ID not in", values, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdBetween(String value1, String value2) {
            addCriterion("STAR_LEVEL_ID between", value1, value2, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andStarLevelIdNotBetween(String value1, String value2) {
            addCriterion("STAR_LEVEL_ID not between", value1, value2, "starLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdIsNull() {
            addCriterion("CUST_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdIsNotNull() {
            addCriterion("CUST_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdEqualTo(String value) {
            addCriterion("CUST_LEVEL_ID =", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdNotEqualTo(String value) {
            addCriterion("CUST_LEVEL_ID <>", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdGreaterThan(String value) {
            addCriterion("CUST_LEVEL_ID >", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_LEVEL_ID >=", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdLessThan(String value) {
            addCriterion("CUST_LEVEL_ID <", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_LEVEL_ID <=", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdLike(String value) {
            addCriterion("CUST_LEVEL_ID like", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdNotLike(String value) {
            addCriterion("CUST_LEVEL_ID not like", value, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdIn(List<String> values) {
            addCriterion("CUST_LEVEL_ID in", values, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdNotIn(List<String> values) {
            addCriterion("CUST_LEVEL_ID not in", values, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdBetween(String value1, String value2) {
            addCriterion("CUST_LEVEL_ID between", value1, value2, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIdNotBetween(String value1, String value2) {
            addCriterion("CUST_LEVEL_ID not between", value1, value2, "custLevelId");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundIsNull() {
            addCriterion("REGISTERED_FUND is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundIsNotNull() {
            addCriterion("REGISTERED_FUND is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundEqualTo(BigDecimal value) {
            addCriterion("REGISTERED_FUND =", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundNotEqualTo(BigDecimal value) {
            addCriterion("REGISTERED_FUND <>", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundGreaterThan(BigDecimal value) {
            addCriterion("REGISTERED_FUND >", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTERED_FUND >=", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundLessThan(BigDecimal value) {
            addCriterion("REGISTERED_FUND <", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTERED_FUND <=", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundIn(List<BigDecimal> values) {
            addCriterion("REGISTERED_FUND in", values, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundNotIn(List<BigDecimal> values) {
            addCriterion("REGISTERED_FUND not in", values, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTERED_FUND between", value1, value2, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTERED_FUND not between", value1, value2, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andPersonCountIsNull() {
            addCriterion("PERSON_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPersonCountIsNotNull() {
            addCriterion("PERSON_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCountEqualTo(Integer value) {
            addCriterion("PERSON_COUNT =", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountNotEqualTo(Integer value) {
            addCriterion("PERSON_COUNT <>", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountGreaterThan(Integer value) {
            addCriterion("PERSON_COUNT >", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERSON_COUNT >=", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountLessThan(Integer value) {
            addCriterion("PERSON_COUNT <", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountLessThanOrEqualTo(Integer value) {
            addCriterion("PERSON_COUNT <=", value, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountIn(List<Integer> values) {
            addCriterion("PERSON_COUNT in", values, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountNotIn(List<Integer> values) {
            addCriterion("PERSON_COUNT not in", values, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_COUNT between", value1, value2, "personCount");
            return (Criteria) this;
        }

        public Criteria andPersonCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_COUNT not between", value1, value2, "personCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountIsNull() {
            addCriterion("ACCOUNTANT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountantCountIsNotNull() {
            addCriterion("ACCOUNTANT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountantCountEqualTo(Integer value) {
            addCriterion("ACCOUNTANT_COUNT =", value, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountNotEqualTo(Integer value) {
            addCriterion("ACCOUNTANT_COUNT <>", value, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountGreaterThan(Integer value) {
            addCriterion("ACCOUNTANT_COUNT >", value, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTANT_COUNT >=", value, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountLessThan(Integer value) {
            addCriterion("ACCOUNTANT_COUNT <", value, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTANT_COUNT <=", value, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountIn(List<Integer> values) {
            addCriterion("ACCOUNTANT_COUNT in", values, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountNotIn(List<Integer> values) {
            addCriterion("ACCOUNTANT_COUNT not in", values, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTANT_COUNT between", value1, value2, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andAccountantCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTANT_COUNT not between", value1, value2, "accountantCount");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdIsNull() {
            addCriterion("CUST_SCALE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdIsNotNull() {
            addCriterion("CUST_SCALE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdEqualTo(String value) {
            addCriterion("CUST_SCALE_ID =", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdNotEqualTo(String value) {
            addCriterion("CUST_SCALE_ID <>", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdGreaterThan(String value) {
            addCriterion("CUST_SCALE_ID >", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_SCALE_ID >=", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdLessThan(String value) {
            addCriterion("CUST_SCALE_ID <", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_SCALE_ID <=", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdLike(String value) {
            addCriterion("CUST_SCALE_ID like", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdNotLike(String value) {
            addCriterion("CUST_SCALE_ID not like", value, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdIn(List<String> values) {
            addCriterion("CUST_SCALE_ID in", values, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdNotIn(List<String> values) {
            addCriterion("CUST_SCALE_ID not in", values, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdBetween(String value1, String value2) {
            addCriterion("CUST_SCALE_ID between", value1, value2, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andCustScaleIdNotBetween(String value1, String value2) {
            addCriterion("CUST_SCALE_ID not between", value1, value2, "custScaleId");
            return (Criteria) this;
        }

        public Criteria andComputerCountIsNull() {
            addCriterion("COMPUTER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andComputerCountIsNotNull() {
            addCriterion("COMPUTER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andComputerCountEqualTo(Integer value) {
            addCriterion("COMPUTER_COUNT =", value, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountNotEqualTo(Integer value) {
            addCriterion("COMPUTER_COUNT <>", value, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountGreaterThan(Integer value) {
            addCriterion("COMPUTER_COUNT >", value, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPUTER_COUNT >=", value, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountLessThan(Integer value) {
            addCriterion("COMPUTER_COUNT <", value, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountLessThanOrEqualTo(Integer value) {
            addCriterion("COMPUTER_COUNT <=", value, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountIn(List<Integer> values) {
            addCriterion("COMPUTER_COUNT in", values, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountNotIn(List<Integer> values) {
            addCriterion("COMPUTER_COUNT not in", values, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountBetween(Integer value1, Integer value2) {
            addCriterion("COMPUTER_COUNT between", value1, value2, "computerCount");
            return (Criteria) this;
        }

        public Criteria andComputerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPUTER_COUNT not between", value1, value2, "computerCount");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdIsNull() {
            addCriterion("NETWORK_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdIsNotNull() {
            addCriterion("NETWORK_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdEqualTo(String value) {
            addCriterion("NETWORK_TYPE_ID =", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdNotEqualTo(String value) {
            addCriterion("NETWORK_TYPE_ID <>", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdGreaterThan(String value) {
            addCriterion("NETWORK_TYPE_ID >", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_TYPE_ID >=", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdLessThan(String value) {
            addCriterion("NETWORK_TYPE_ID <", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_TYPE_ID <=", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdLike(String value) {
            addCriterion("NETWORK_TYPE_ID like", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdNotLike(String value) {
            addCriterion("NETWORK_TYPE_ID not like", value, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdIn(List<String> values) {
            addCriterion("NETWORK_TYPE_ID in", values, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdNotIn(List<String> values) {
            addCriterion("NETWORK_TYPE_ID not in", values, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdBetween(String value1, String value2) {
            addCriterion("NETWORK_TYPE_ID between", value1, value2, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIdNotBetween(String value1, String value2) {
            addCriterion("NETWORK_TYPE_ID not between", value1, value2, "networkTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdIsNull() {
            addCriterion("CREDIT_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdIsNotNull() {
            addCriterion("CREDIT_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdEqualTo(String value) {
            addCriterion("CREDIT_LEVEL_ID =", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotEqualTo(String value) {
            addCriterion("CREDIT_LEVEL_ID <>", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdGreaterThan(String value) {
            addCriterion("CREDIT_LEVEL_ID >", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_LEVEL_ID >=", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdLessThan(String value) {
            addCriterion("CREDIT_LEVEL_ID <", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_LEVEL_ID <=", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdLike(String value) {
            addCriterion("CREDIT_LEVEL_ID like", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotLike(String value) {
            addCriterion("CREDIT_LEVEL_ID not like", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdIn(List<String> values) {
            addCriterion("CREDIT_LEVEL_ID in", values, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotIn(List<String> values) {
            addCriterion("CREDIT_LEVEL_ID not in", values, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdBetween(String value1, String value2) {
            addCriterion("CREDIT_LEVEL_ID between", value1, value2, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotBetween(String value1, String value2) {
            addCriterion("CREDIT_LEVEL_ID not between", value1, value2, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("CREDIT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("CREDIT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(BigDecimal value) {
            addCriterion("CREDIT_LIMIT =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(BigDecimal value) {
            addCriterion("CREDIT_LIMIT <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(BigDecimal value) {
            addCriterion("CREDIT_LIMIT >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT_LIMIT >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(BigDecimal value) {
            addCriterion("CREDIT_LIMIT <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT_LIMIT <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<BigDecimal> values) {
            addCriterion("CREDIT_LIMIT in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<BigDecimal> values) {
            addCriterion("CREDIT_LIMIT not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT_LIMIT between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT_LIMIT not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCustCodeIsNull() {
            addCriterion("CUST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustCodeIsNotNull() {
            addCriterion("CUST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustCodeEqualTo(String value) {
            addCriterion("CUST_CODE =", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotEqualTo(String value) {
            addCriterion("CUST_CODE <>", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeGreaterThan(String value) {
            addCriterion("CUST_CODE >", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_CODE >=", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLessThan(String value) {
            addCriterion("CUST_CODE <", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLessThanOrEqualTo(String value) {
            addCriterion("CUST_CODE <=", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLike(String value) {
            addCriterion("CUST_CODE like", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotLike(String value) {
            addCriterion("CUST_CODE not like", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeIn(List<String> values) {
            addCriterion("CUST_CODE in", values, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotIn(List<String> values) {
            addCriterion("CUST_CODE not in", values, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeBetween(String value1, String value2) {
            addCriterion("CUST_CODE between", value1, value2, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotBetween(String value1, String value2) {
            addCriterion("CUST_CODE not between", value1, value2, "custCode");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIsNull() {
            addCriterion("GENERAL_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIsNotNull() {
            addCriterion("GENERAL_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerEqualTo(String value) {
            addCriterion("GENERAL_MANAGER =", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotEqualTo(String value) {
            addCriterion("GENERAL_MANAGER <>", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerGreaterThan(String value) {
            addCriterion("GENERAL_MANAGER >", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerGreaterThanOrEqualTo(String value) {
            addCriterion("GENERAL_MANAGER >=", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLessThan(String value) {
            addCriterion("GENERAL_MANAGER <", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLessThanOrEqualTo(String value) {
            addCriterion("GENERAL_MANAGER <=", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLike(String value) {
            addCriterion("GENERAL_MANAGER like", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotLike(String value) {
            addCriterion("GENERAL_MANAGER not like", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIn(List<String> values) {
            addCriterion("GENERAL_MANAGER in", values, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotIn(List<String> values) {
            addCriterion("GENERAL_MANAGER not in", values, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerBetween(String value1, String value2) {
            addCriterion("GENERAL_MANAGER between", value1, value2, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotBetween(String value1, String value2) {
            addCriterion("GENERAL_MANAGER not between", value1, value2, "generalManager");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdIsNull() {
            addCriterion("LOCATION_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdIsNotNull() {
            addCriterion("LOCATION_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ID =", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdNotEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ID <>", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdGreaterThan(String value) {
            addCriterion("LOCATION_TYPE_ID >", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ID >=", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdLessThan(String value) {
            addCriterion("LOCATION_TYPE_ID <", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ID <=", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdLike(String value) {
            addCriterion("LOCATION_TYPE_ID like", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdNotLike(String value) {
            addCriterion("LOCATION_TYPE_ID not like", value, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdIn(List<String> values) {
            addCriterion("LOCATION_TYPE_ID in", values, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdNotIn(List<String> values) {
            addCriterion("LOCATION_TYPE_ID not in", values, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdBetween(String value1, String value2) {
            addCriterion("LOCATION_TYPE_ID between", value1, value2, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIdNotBetween(String value1, String value2) {
            addCriterion("LOCATION_TYPE_ID not between", value1, value2, "locationTypeId");
            return (Criteria) this;
        }

        public Criteria andTrainingCountIsNull() {
            addCriterion("TRAINING_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTrainingCountIsNotNull() {
            addCriterion("TRAINING_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingCountEqualTo(Integer value) {
            addCriterion("TRAINING_COUNT =", value, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountNotEqualTo(Integer value) {
            addCriterion("TRAINING_COUNT <>", value, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountGreaterThan(Integer value) {
            addCriterion("TRAINING_COUNT >", value, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRAINING_COUNT >=", value, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountLessThan(Integer value) {
            addCriterion("TRAINING_COUNT <", value, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountLessThanOrEqualTo(Integer value) {
            addCriterion("TRAINING_COUNT <=", value, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountIn(List<Integer> values) {
            addCriterion("TRAINING_COUNT in", values, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountNotIn(List<Integer> values) {
            addCriterion("TRAINING_COUNT not in", values, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountBetween(Integer value1, Integer value2) {
            addCriterion("TRAINING_COUNT between", value1, value2, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andTrainingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("TRAINING_COUNT not between", value1, value2, "trainingCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountIsNull() {
            addCriterion("SECURITY_PERSON_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountIsNotNull() {
            addCriterion("SECURITY_PERSON_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountEqualTo(Integer value) {
            addCriterion("SECURITY_PERSON_COUNT =", value, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountNotEqualTo(Integer value) {
            addCriterion("SECURITY_PERSON_COUNT <>", value, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountGreaterThan(Integer value) {
            addCriterion("SECURITY_PERSON_COUNT >", value, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECURITY_PERSON_COUNT >=", value, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountLessThan(Integer value) {
            addCriterion("SECURITY_PERSON_COUNT <", value, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountLessThanOrEqualTo(Integer value) {
            addCriterion("SECURITY_PERSON_COUNT <=", value, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountIn(List<Integer> values) {
            addCriterion("SECURITY_PERSON_COUNT in", values, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountNotIn(List<Integer> values) {
            addCriterion("SECURITY_PERSON_COUNT not in", values, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountBetween(Integer value1, Integer value2) {
            addCriterion("SECURITY_PERSON_COUNT between", value1, value2, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SECURITY_PERSON_COUNT not between", value1, value2, "securityPersonCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountIsNull() {
            addCriterion("ROOM_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRoomCountIsNotNull() {
            addCriterion("ROOM_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCountEqualTo(Integer value) {
            addCriterion("ROOM_COUNT =", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotEqualTo(Integer value) {
            addCriterion("ROOM_COUNT <>", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountGreaterThan(Integer value) {
            addCriterion("ROOM_COUNT >", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOM_COUNT >=", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountLessThan(Integer value) {
            addCriterion("ROOM_COUNT <", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountLessThanOrEqualTo(Integer value) {
            addCriterion("ROOM_COUNT <=", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountIn(List<Integer> values) {
            addCriterion("ROOM_COUNT in", values, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotIn(List<Integer> values) {
            addCriterion("ROOM_COUNT not in", values, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_COUNT between", value1, value2, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_COUNT not between", value1, value2, "roomCount");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdIsNull() {
            addCriterion("PARENT_ORG_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdIsNotNull() {
            addCriterion("PARENT_ORG_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdEqualTo(Long value) {
            addCriterion("PARENT_ORG_CUSTOMER_ID =", value, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdNotEqualTo(Long value) {
            addCriterion("PARENT_ORG_CUSTOMER_ID <>", value, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdGreaterThan(Long value) {
            addCriterion("PARENT_ORG_CUSTOMER_ID >", value, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ORG_CUSTOMER_ID >=", value, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdLessThan(Long value) {
            addCriterion("PARENT_ORG_CUSTOMER_ID <", value, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ORG_CUSTOMER_ID <=", value, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdIn(List<Long> values) {
            addCriterion("PARENT_ORG_CUSTOMER_ID in", values, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdNotIn(List<Long> values) {
            addCriterion("PARENT_ORG_CUSTOMER_ID not in", values, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ORG_CUSTOMER_ID between", value1, value2, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andParentOrgCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ORG_CUSTOMER_ID not between", value1, value2, "parentOrgCustomerId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdIsNull() {
            addCriterion("VOCATION_FORCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdIsNotNull() {
            addCriterion("VOCATION_FORCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdEqualTo(String value) {
            addCriterion("VOCATION_FORCE_ID =", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdNotEqualTo(String value) {
            addCriterion("VOCATION_FORCE_ID <>", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdGreaterThan(String value) {
            addCriterion("VOCATION_FORCE_ID >", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOCATION_FORCE_ID >=", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdLessThan(String value) {
            addCriterion("VOCATION_FORCE_ID <", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdLessThanOrEqualTo(String value) {
            addCriterion("VOCATION_FORCE_ID <=", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdLike(String value) {
            addCriterion("VOCATION_FORCE_ID like", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdNotLike(String value) {
            addCriterion("VOCATION_FORCE_ID not like", value, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdIn(List<String> values) {
            addCriterion("VOCATION_FORCE_ID in", values, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdNotIn(List<String> values) {
            addCriterion("VOCATION_FORCE_ID not in", values, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdBetween(String value1, String value2) {
            addCriterion("VOCATION_FORCE_ID between", value1, value2, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andVocationForceIdNotBetween(String value1, String value2) {
            addCriterion("VOCATION_FORCE_ID not between", value1, value2, "vocationForceId");
            return (Criteria) this;
        }

        public Criteria andTel1IsNull() {
            addCriterion("TEL1 is null");
            return (Criteria) this;
        }

        public Criteria andTel1IsNotNull() {
            addCriterion("TEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andTel1EqualTo(String value) {
            addCriterion("TEL1 =", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotEqualTo(String value) {
            addCriterion("TEL1 <>", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1GreaterThan(String value) {
            addCriterion("TEL1 >", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1GreaterThanOrEqualTo(String value) {
            addCriterion("TEL1 >=", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1LessThan(String value) {
            addCriterion("TEL1 <", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1LessThanOrEqualTo(String value) {
            addCriterion("TEL1 <=", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1Like(String value) {
            addCriterion("TEL1 like", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotLike(String value) {
            addCriterion("TEL1 not like", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1In(List<String> values) {
            addCriterion("TEL1 in", values, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotIn(List<String> values) {
            addCriterion("TEL1 not in", values, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1Between(String value1, String value2) {
            addCriterion("TEL1 between", value1, value2, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotBetween(String value1, String value2) {
            addCriterion("TEL1 not between", value1, value2, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel2IsNull() {
            addCriterion("TEL2 is null");
            return (Criteria) this;
        }

        public Criteria andTel2IsNotNull() {
            addCriterion("TEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andTel2EqualTo(String value) {
            addCriterion("TEL2 =", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotEqualTo(String value) {
            addCriterion("TEL2 <>", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2GreaterThan(String value) {
            addCriterion("TEL2 >", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2GreaterThanOrEqualTo(String value) {
            addCriterion("TEL2 >=", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2LessThan(String value) {
            addCriterion("TEL2 <", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2LessThanOrEqualTo(String value) {
            addCriterion("TEL2 <=", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2Like(String value) {
            addCriterion("TEL2 like", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotLike(String value) {
            addCriterion("TEL2 not like", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2In(List<String> values) {
            addCriterion("TEL2 in", values, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotIn(List<String> values) {
            addCriterion("TEL2 not in", values, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2Between(String value1, String value2) {
            addCriterion("TEL2 between", value1, value2, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotBetween(String value1, String value2) {
            addCriterion("TEL2 not between", value1, value2, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel3IsNull() {
            addCriterion("TEL3 is null");
            return (Criteria) this;
        }

        public Criteria andTel3IsNotNull() {
            addCriterion("TEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andTel3EqualTo(String value) {
            addCriterion("TEL3 =", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotEqualTo(String value) {
            addCriterion("TEL3 <>", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3GreaterThan(String value) {
            addCriterion("TEL3 >", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3GreaterThanOrEqualTo(String value) {
            addCriterion("TEL3 >=", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3LessThan(String value) {
            addCriterion("TEL3 <", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3LessThanOrEqualTo(String value) {
            addCriterion("TEL3 <=", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3Like(String value) {
            addCriterion("TEL3 like", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotLike(String value) {
            addCriterion("TEL3 not like", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3In(List<String> values) {
            addCriterion("TEL3 in", values, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotIn(List<String> values) {
            addCriterion("TEL3 not in", values, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3Between(String value1, String value2) {
            addCriterion("TEL3 between", value1, value2, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotBetween(String value1, String value2) {
            addCriterion("TEL3 not between", value1, value2, "tel3");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSecurityTelIsNull() {
            addCriterion("SECURITY_TEL is null");
            return (Criteria) this;
        }

        public Criteria andSecurityTelIsNotNull() {
            addCriterion("SECURITY_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityTelEqualTo(String value) {
            addCriterion("SECURITY_TEL =", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNotEqualTo(String value) {
            addCriterion("SECURITY_TEL <>", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelGreaterThan(String value) {
            addCriterion("SECURITY_TEL >", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITY_TEL >=", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelLessThan(String value) {
            addCriterion("SECURITY_TEL <", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelLessThanOrEqualTo(String value) {
            addCriterion("SECURITY_TEL <=", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelLike(String value) {
            addCriterion("SECURITY_TEL like", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNotLike(String value) {
            addCriterion("SECURITY_TEL not like", value, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelIn(List<String> values) {
            addCriterion("SECURITY_TEL in", values, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNotIn(List<String> values) {
            addCriterion("SECURITY_TEL not in", values, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelBetween(String value1, String value2) {
            addCriterion("SECURITY_TEL between", value1, value2, "securityTel");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNotBetween(String value1, String value2) {
            addCriterion("SECURITY_TEL not between", value1, value2, "securityTel");
            return (Criteria) this;
        }

        public Criteria andBedCountIsNull() {
            addCriterion("BED_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBedCountIsNotNull() {
            addCriterion("BED_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBedCountEqualTo(Integer value) {
            addCriterion("BED_COUNT =", value, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountNotEqualTo(Integer value) {
            addCriterion("BED_COUNT <>", value, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountGreaterThan(Integer value) {
            addCriterion("BED_COUNT >", value, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BED_COUNT >=", value, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountLessThan(Integer value) {
            addCriterion("BED_COUNT <", value, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountLessThanOrEqualTo(Integer value) {
            addCriterion("BED_COUNT <=", value, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountIn(List<Integer> values) {
            addCriterion("BED_COUNT in", values, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountNotIn(List<Integer> values) {
            addCriterion("BED_COUNT not in", values, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountBetween(Integer value1, Integer value2) {
            addCriterion("BED_COUNT between", value1, value2, "bedCount");
            return (Criteria) this;
        }

        public Criteria andBedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("BED_COUNT not between", value1, value2, "bedCount");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonIsNull() {
            addCriterion("SECURITY_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonIsNotNull() {
            addCriterion("SECURITY_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonEqualTo(String value) {
            addCriterion("SECURITY_PERSON =", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonNotEqualTo(String value) {
            addCriterion("SECURITY_PERSON <>", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonGreaterThan(String value) {
            addCriterion("SECURITY_PERSON >", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITY_PERSON >=", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonLessThan(String value) {
            addCriterion("SECURITY_PERSON <", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonLessThanOrEqualTo(String value) {
            addCriterion("SECURITY_PERSON <=", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonLike(String value) {
            addCriterion("SECURITY_PERSON like", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonNotLike(String value) {
            addCriterion("SECURITY_PERSON not like", value, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonIn(List<String> values) {
            addCriterion("SECURITY_PERSON in", values, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonNotIn(List<String> values) {
            addCriterion("SECURITY_PERSON not in", values, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonBetween(String value1, String value2) {
            addCriterion("SECURITY_PERSON between", value1, value2, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andSecurityPersonNotBetween(String value1, String value2) {
            addCriterion("SECURITY_PERSON not between", value1, value2, "securityPerson");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoIsNull() {
            addCriterion("REMARK_INFO is null");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoIsNotNull() {
            addCriterion("REMARK_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoEqualTo(String value) {
            addCriterion("REMARK_INFO =", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoNotEqualTo(String value) {
            addCriterion("REMARK_INFO <>", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoGreaterThan(String value) {
            addCriterion("REMARK_INFO >", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK_INFO >=", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoLessThan(String value) {
            addCriterion("REMARK_INFO <", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoLessThanOrEqualTo(String value) {
            addCriterion("REMARK_INFO <=", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoLike(String value) {
            addCriterion("REMARK_INFO like", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoNotLike(String value) {
            addCriterion("REMARK_INFO not like", value, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoIn(List<String> values) {
            addCriterion("REMARK_INFO in", values, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoNotIn(List<String> values) {
            addCriterion("REMARK_INFO not in", values, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoBetween(String value1, String value2) {
            addCriterion("REMARK_INFO between", value1, value2, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkInfoNotBetween(String value1, String value2) {
            addCriterion("REMARK_INFO not between", value1, value2, "remarkInfo");
            return (Criteria) this;
        }

        public Criteria andManagerOrgIsNull() {
            addCriterion("MANAGER_ORG is null");
            return (Criteria) this;
        }

        public Criteria andManagerOrgIsNotNull() {
            addCriterion("MANAGER_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andManagerOrgEqualTo(String value) {
            addCriterion("MANAGER_ORG =", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgNotEqualTo(String value) {
            addCriterion("MANAGER_ORG <>", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgGreaterThan(String value) {
            addCriterion("MANAGER_ORG >", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER_ORG >=", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgLessThan(String value) {
            addCriterion("MANAGER_ORG <", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgLessThanOrEqualTo(String value) {
            addCriterion("MANAGER_ORG <=", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgLike(String value) {
            addCriterion("MANAGER_ORG like", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgNotLike(String value) {
            addCriterion("MANAGER_ORG not like", value, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgIn(List<String> values) {
            addCriterion("MANAGER_ORG in", values, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgNotIn(List<String> values) {
            addCriterion("MANAGER_ORG not in", values, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgBetween(String value1, String value2) {
            addCriterion("MANAGER_ORG between", value1, value2, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andManagerOrgNotBetween(String value1, String value2) {
            addCriterion("MANAGER_ORG not between", value1, value2, "managerOrg");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIsNull() {
            addCriterion("POLICE_STATION is null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIsNotNull() {
            addCriterion("POLICE_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceStationEqualTo(String value) {
            addCriterion("POLICE_STATION =", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotEqualTo(String value) {
            addCriterion("POLICE_STATION <>", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationGreaterThan(String value) {
            addCriterion("POLICE_STATION >", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_STATION >=", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLessThan(String value) {
            addCriterion("POLICE_STATION <", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLessThanOrEqualTo(String value) {
            addCriterion("POLICE_STATION <=", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationLike(String value) {
            addCriterion("POLICE_STATION like", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotLike(String value) {
            addCriterion("POLICE_STATION not like", value, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationIn(List<String> values) {
            addCriterion("POLICE_STATION in", values, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotIn(List<String> values) {
            addCriterion("POLICE_STATION not in", values, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationBetween(String value1, String value2) {
            addCriterion("POLICE_STATION between", value1, value2, "policeStation");
            return (Criteria) this;
        }

        public Criteria andPoliceStationNotBetween(String value1, String value2) {
            addCriterion("POLICE_STATION not between", value1, value2, "policeStation");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeIsNull() {
            addCriterion("SUB_COUNTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeIsNotNull() {
            addCriterion("SUB_COUNTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeEqualTo(String value) {
            addCriterion("SUB_COUNTY_CODE =", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeNotEqualTo(String value) {
            addCriterion("SUB_COUNTY_CODE <>", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeGreaterThan(String value) {
            addCriterion("SUB_COUNTY_CODE >", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_COUNTY_CODE >=", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeLessThan(String value) {
            addCriterion("SUB_COUNTY_CODE <", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("SUB_COUNTY_CODE <=", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeLike(String value) {
            addCriterion("SUB_COUNTY_CODE like", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeNotLike(String value) {
            addCriterion("SUB_COUNTY_CODE not like", value, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeIn(List<String> values) {
            addCriterion("SUB_COUNTY_CODE in", values, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeNotIn(List<String> values) {
            addCriterion("SUB_COUNTY_CODE not in", values, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeBetween(String value1, String value2) {
            addCriterion("SUB_COUNTY_CODE between", value1, value2, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubCountyCodeNotBetween(String value1, String value2) {
            addCriterion("SUB_COUNTY_CODE not between", value1, value2, "subCountyCode");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIsNull() {
            addCriterion("SUB_SECURITY_BUREAU is null");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIsNotNull() {
            addCriterion("SUB_SECURITY_BUREAU is not null");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauEqualTo(String value) {
            addCriterion("SUB_SECURITY_BUREAU =", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauNotEqualTo(String value) {
            addCriterion("SUB_SECURITY_BUREAU <>", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauGreaterThan(String value) {
            addCriterion("SUB_SECURITY_BUREAU >", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_SECURITY_BUREAU >=", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauLessThan(String value) {
            addCriterion("SUB_SECURITY_BUREAU <", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauLessThanOrEqualTo(String value) {
            addCriterion("SUB_SECURITY_BUREAU <=", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauLike(String value) {
            addCriterion("SUB_SECURITY_BUREAU like", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauNotLike(String value) {
            addCriterion("SUB_SECURITY_BUREAU not like", value, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauIn(List<String> values) {
            addCriterion("SUB_SECURITY_BUREAU in", values, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauNotIn(List<String> values) {
            addCriterion("SUB_SECURITY_BUREAU not in", values, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauBetween(String value1, String value2) {
            addCriterion("SUB_SECURITY_BUREAU between", value1, value2, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andSubSecurityBureauNotBetween(String value1, String value2) {
            addCriterion("SUB_SECURITY_BUREAU not between", value1, value2, "subSecurityBureau");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonIsNull() {
            addCriterion("REGISTER_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonIsNotNull() {
            addCriterion("REGISTER_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonEqualTo(String value) {
            addCriterion("REGISTER_PERSON =", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonNotEqualTo(String value) {
            addCriterion("REGISTER_PERSON <>", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonGreaterThan(String value) {
            addCriterion("REGISTER_PERSON >", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_PERSON >=", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonLessThan(String value) {
            addCriterion("REGISTER_PERSON <", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_PERSON <=", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonLike(String value) {
            addCriterion("REGISTER_PERSON like", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonNotLike(String value) {
            addCriterion("REGISTER_PERSON not like", value, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonIn(List<String> values) {
            addCriterion("REGISTER_PERSON in", values, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonNotIn(List<String> values) {
            addCriterion("REGISTER_PERSON not in", values, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonBetween(String value1, String value2) {
            addCriterion("REGISTER_PERSON between", value1, value2, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andRegisterPersonNotBetween(String value1, String value2) {
            addCriterion("REGISTER_PERSON not between", value1, value2, "registerPerson");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdIsNull() {
            addCriterion("OWN_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdIsNotNull() {
            addCriterion("OWN_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdEqualTo(String value) {
            addCriterion("OWN_CUSTOMER_ID =", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdNotEqualTo(String value) {
            addCriterion("OWN_CUSTOMER_ID <>", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdGreaterThan(String value) {
            addCriterion("OWN_CUSTOMER_ID >", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("OWN_CUSTOMER_ID >=", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdLessThan(String value) {
            addCriterion("OWN_CUSTOMER_ID <", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("OWN_CUSTOMER_ID <=", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdLike(String value) {
            addCriterion("OWN_CUSTOMER_ID like", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdNotLike(String value) {
            addCriterion("OWN_CUSTOMER_ID not like", value, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdIn(List<String> values) {
            addCriterion("OWN_CUSTOMER_ID in", values, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdNotIn(List<String> values) {
            addCriterion("OWN_CUSTOMER_ID not in", values, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdBetween(String value1, String value2) {
            addCriterion("OWN_CUSTOMER_ID between", value1, value2, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andOwnCustomerIdNotBetween(String value1, String value2) {
            addCriterion("OWN_CUSTOMER_ID not between", value1, value2, "ownCustomerId");
            return (Criteria) this;
        }

        public Criteria andCreateFromIsNull() {
            addCriterion("CREATE_FROM is null");
            return (Criteria) this;
        }

        public Criteria andCreateFromIsNotNull() {
            addCriterion("CREATE_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andCreateFromEqualTo(Short value) {
            addCriterion("CREATE_FROM =", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromNotEqualTo(Short value) {
            addCriterion("CREATE_FROM <>", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromGreaterThan(Short value) {
            addCriterion("CREATE_FROM >", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromGreaterThanOrEqualTo(Short value) {
            addCriterion("CREATE_FROM >=", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromLessThan(Short value) {
            addCriterion("CREATE_FROM <", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromLessThanOrEqualTo(Short value) {
            addCriterion("CREATE_FROM <=", value, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromIn(List<Short> values) {
            addCriterion("CREATE_FROM in", values, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromNotIn(List<Short> values) {
            addCriterion("CREATE_FROM not in", values, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromBetween(Short value1, Short value2) {
            addCriterion("CREATE_FROM between", value1, value2, "createFrom");
            return (Criteria) this;
        }

        public Criteria andCreateFromNotBetween(Short value1, Short value2) {
            addCriterion("CREATE_FROM not between", value1, value2, "createFrom");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCollectionBankIsNull() {
            addCriterion("COLLECTION_BANK is null");
            return (Criteria) this;
        }

        public Criteria andCollectionBankIsNotNull() {
            addCriterion("COLLECTION_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionBankEqualTo(String value) {
            addCriterion("COLLECTION_BANK =", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankNotEqualTo(String value) {
            addCriterion("COLLECTION_BANK <>", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankGreaterThan(String value) {
            addCriterion("COLLECTION_BANK >", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTION_BANK >=", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankLessThan(String value) {
            addCriterion("COLLECTION_BANK <", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankLessThanOrEqualTo(String value) {
            addCriterion("COLLECTION_BANK <=", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankLike(String value) {
            addCriterion("COLLECTION_BANK like", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankNotLike(String value) {
            addCriterion("COLLECTION_BANK not like", value, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankIn(List<String> values) {
            addCriterion("COLLECTION_BANK in", values, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankNotIn(List<String> values) {
            addCriterion("COLLECTION_BANK not in", values, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankBetween(String value1, String value2) {
            addCriterion("COLLECTION_BANK between", value1, value2, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionBankNotBetween(String value1, String value2) {
            addCriterion("COLLECTION_BANK not between", value1, value2, "collectionBank");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIsNull() {
            addCriterion("COLLECTION_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIsNotNull() {
            addCriterion("COLLECTION_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountEqualTo(String value) {
            addCriterion("COLLECTION_ACCOUNT =", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotEqualTo(String value) {
            addCriterion("COLLECTION_ACCOUNT <>", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountGreaterThan(String value) {
            addCriterion("COLLECTION_ACCOUNT >", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTION_ACCOUNT >=", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountLessThan(String value) {
            addCriterion("COLLECTION_ACCOUNT <", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountLessThanOrEqualTo(String value) {
            addCriterion("COLLECTION_ACCOUNT <=", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountLike(String value) {
            addCriterion("COLLECTION_ACCOUNT like", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotLike(String value) {
            addCriterion("COLLECTION_ACCOUNT not like", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIn(List<String> values) {
            addCriterion("COLLECTION_ACCOUNT in", values, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotIn(List<String> values) {
            addCriterion("COLLECTION_ACCOUNT not in", values, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountBetween(String value1, String value2) {
            addCriterion("COLLECTION_ACCOUNT between", value1, value2, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotBetween(String value1, String value2) {
            addCriterion("COLLECTION_ACCOUNT not between", value1, value2, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdIsNull() {
            addCriterion("SERVICE_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdIsNotNull() {
            addCriterion("SERVICE_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdEqualTo(Integer value) {
            addCriterion("SERVICE_DEPARTMENT_ID =", value, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdNotEqualTo(Integer value) {
            addCriterion("SERVICE_DEPARTMENT_ID <>", value, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdGreaterThan(Integer value) {
            addCriterion("SERVICE_DEPARTMENT_ID >", value, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_DEPARTMENT_ID >=", value, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdLessThan(Integer value) {
            addCriterion("SERVICE_DEPARTMENT_ID <", value, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_DEPARTMENT_ID <=", value, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdIn(List<Integer> values) {
            addCriterion("SERVICE_DEPARTMENT_ID in", values, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdNotIn(List<Integer> values) {
            addCriterion("SERVICE_DEPARTMENT_ID not in", values, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_DEPARTMENT_ID between", value1, value2, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andServiceDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_DEPARTMENT_ID not between", value1, value2, "serviceDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNull() {
            addCriterion("CUST_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNotNull() {
            addCriterion("CUST_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelEqualTo(Integer value) {
            addCriterion("CUST_LEVEL =", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotEqualTo(Integer value) {
            addCriterion("CUST_LEVEL <>", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThan(Integer value) {
            addCriterion("CUST_LEVEL >", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUST_LEVEL >=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThan(Integer value) {
            addCriterion("CUST_LEVEL <", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CUST_LEVEL <=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelIn(List<Integer> values) {
            addCriterion("CUST_LEVEL in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotIn(List<Integer> values) {
            addCriterion("CUST_LEVEL not in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelBetween(Integer value1, Integer value2) {
            addCriterion("CUST_LEVEL between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CUST_LEVEL not between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdIsNull() {
            addCriterion("LOCAL_TAX_AUTHORITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdIsNotNull() {
            addCriterion("LOCAL_TAX_AUTHORITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdEqualTo(Integer value) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID =", value, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdNotEqualTo(Integer value) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID <>", value, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdGreaterThan(Integer value) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID >", value, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID >=", value, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdLessThan(Integer value) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID <", value, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID <=", value, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdIn(List<Integer> values) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID in", values, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdNotIn(List<Integer> values) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID not in", values, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID between", value1, value2, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andLocalTaxAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOCAL_TAX_AUTHORITY_ID not between", value1, value2, "localTaxAuthorityId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIsNull() {
            addCriterion("ENTERPRISE_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIsNotNull() {
            addCriterion("ENTERPRISE_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleEqualTo(Integer value) {
            addCriterion("ENTERPRISE_SCALE =", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotEqualTo(Integer value) {
            addCriterion("ENTERPRISE_SCALE <>", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleGreaterThan(Integer value) {
            addCriterion("ENTERPRISE_SCALE >", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_SCALE >=", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLessThan(Integer value) {
            addCriterion("ENTERPRISE_SCALE <", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLessThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_SCALE <=", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIn(List<Integer> values) {
            addCriterion("ENTERPRISE_SCALE in", values, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotIn(List<Integer> values) {
            addCriterion("ENTERPRISE_SCALE not in", values, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_SCALE between", value1, value2, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_SCALE not between", value1, value2, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesIsNull() {
            addCriterion("IS_WITH_BRANCHES is null");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesIsNotNull() {
            addCriterion("IS_WITH_BRANCHES is not null");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesEqualTo(Short value) {
            addCriterion("IS_WITH_BRANCHES =", value, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesNotEqualTo(Short value) {
            addCriterion("IS_WITH_BRANCHES <>", value, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesGreaterThan(Short value) {
            addCriterion("IS_WITH_BRANCHES >", value, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_WITH_BRANCHES >=", value, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesLessThan(Short value) {
            addCriterion("IS_WITH_BRANCHES <", value, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesLessThanOrEqualTo(Short value) {
            addCriterion("IS_WITH_BRANCHES <=", value, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesIn(List<Short> values) {
            addCriterion("IS_WITH_BRANCHES in", values, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesNotIn(List<Short> values) {
            addCriterion("IS_WITH_BRANCHES not in", values, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesBetween(Short value1, Short value2) {
            addCriterion("IS_WITH_BRANCHES between", value1, value2, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andIsWithBranchesNotBetween(Short value1, Short value2) {
            addCriterion("IS_WITH_BRANCHES not between", value1, value2, "isWithBranches");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinIsNull() {
            addCriterion("CUST_NAME_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinIsNotNull() {
            addCriterion("CUST_NAME_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinEqualTo(String value) {
            addCriterion("CUST_NAME_PINYIN =", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinNotEqualTo(String value) {
            addCriterion("CUST_NAME_PINYIN <>", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinGreaterThan(String value) {
            addCriterion("CUST_NAME_PINYIN >", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME_PINYIN >=", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinLessThan(String value) {
            addCriterion("CUST_NAME_PINYIN <", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME_PINYIN <=", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinLike(String value) {
            addCriterion("CUST_NAME_PINYIN like", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinNotLike(String value) {
            addCriterion("CUST_NAME_PINYIN not like", value, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinIn(List<String> values) {
            addCriterion("CUST_NAME_PINYIN in", values, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinNotIn(List<String> values) {
            addCriterion("CUST_NAME_PINYIN not in", values, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinBetween(String value1, String value2) {
            addCriterion("CUST_NAME_PINYIN between", value1, value2, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCustNamePinyinNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME_PINYIN not between", value1, value2, "custNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdIsNull() {
            addCriterion("SOURCE_BUSINESS_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdIsNotNull() {
            addCriterion("SOURCE_BUSINESS_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdEqualTo(Integer value) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID =", value, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdNotEqualTo(Integer value) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID <>", value, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdGreaterThan(Integer value) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID >", value, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID >=", value, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdLessThan(Integer value) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID <", value, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID <=", value, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdIn(List<Integer> values) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID in", values, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdNotIn(List<Integer> values) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID not in", values, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID between", value1, value2, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceBusinessTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_BUSINESS_TYPE_ID not between", value1, value2, "sourceBusinessTypeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNull() {
            addCriterion("POLICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNotNull() {
            addCriterion("POLICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdEqualTo(Integer value) {
            addCriterion("POLICE_ID =", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotEqualTo(Integer value) {
            addCriterion("POLICE_ID <>", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThan(Integer value) {
            addCriterion("POLICE_ID >", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POLICE_ID >=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThan(Integer value) {
            addCriterion("POLICE_ID <", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThanOrEqualTo(Integer value) {
            addCriterion("POLICE_ID <=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIn(List<Integer> values) {
            addCriterion("POLICE_ID in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotIn(List<Integer> values) {
            addCriterion("POLICE_ID not in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdBetween(Integer value1, Integer value2) {
            addCriterion("POLICE_ID between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POLICE_ID not between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkIsNull() {
            addCriterion("SYN_DATA_MARK is null");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkIsNotNull() {
            addCriterion("SYN_DATA_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkEqualTo(Short value) {
            addCriterion("SYN_DATA_MARK =", value, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkNotEqualTo(Short value) {
            addCriterion("SYN_DATA_MARK <>", value, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkGreaterThan(Short value) {
            addCriterion("SYN_DATA_MARK >", value, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkGreaterThanOrEqualTo(Short value) {
            addCriterion("SYN_DATA_MARK >=", value, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkLessThan(Short value) {
            addCriterion("SYN_DATA_MARK <", value, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkLessThanOrEqualTo(Short value) {
            addCriterion("SYN_DATA_MARK <=", value, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkIn(List<Short> values) {
            addCriterion("SYN_DATA_MARK in", values, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkNotIn(List<Short> values) {
            addCriterion("SYN_DATA_MARK not in", values, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkBetween(Short value1, Short value2) {
            addCriterion("SYN_DATA_MARK between", value1, value2, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andSynDataMarkNotBetween(Short value1, Short value2) {
            addCriterion("SYN_DATA_MARK not between", value1, value2, "synDataMark");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionIsNull() {
            addCriterion("IS_BANK_COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionIsNotNull() {
            addCriterion("IS_BANK_COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionEqualTo(Short value) {
            addCriterion("IS_BANK_COLLECTION =", value, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionNotEqualTo(Short value) {
            addCriterion("IS_BANK_COLLECTION <>", value, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionGreaterThan(Short value) {
            addCriterion("IS_BANK_COLLECTION >", value, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_BANK_COLLECTION >=", value, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionLessThan(Short value) {
            addCriterion("IS_BANK_COLLECTION <", value, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionLessThanOrEqualTo(Short value) {
            addCriterion("IS_BANK_COLLECTION <=", value, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionIn(List<Short> values) {
            addCriterion("IS_BANK_COLLECTION in", values, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionNotIn(List<Short> values) {
            addCriterion("IS_BANK_COLLECTION not in", values, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionBetween(Short value1, Short value2) {
            addCriterion("IS_BANK_COLLECTION between", value1, value2, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andIsBankCollectionNotBetween(Short value1, Short value2) {
            addCriterion("IS_BANK_COLLECTION not between", value1, value2, "isBankCollection");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdIsNull() {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdIsNotNull() {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdEqualTo(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID =", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdNotEqualTo(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID <>", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdGreaterThan(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID >", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID >=", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdLessThan(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID <", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID <=", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdLike(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID like", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdNotLike(String value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID not like", value, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdIn(List<String> values) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID in", values, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdNotIn(List<String> values) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID not in", values, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdBetween(String value1, String value2) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID between", value1, value2, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementIdNotBetween(String value1, String value2) {
            addCriterion("BANK_COLLECTION_AGREEMENT_ID not between", value1, value2, "bankCollectionAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateIsNull() {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateIsNotNull() {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateEqualTo(Date value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE =", value, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateNotEqualTo(Date value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE <>", value, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateGreaterThan(Date value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE >", value, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE >=", value, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateLessThan(Date value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE <", value, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateLessThanOrEqualTo(Date value) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE <=", value, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateIn(List<Date> values) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE in", values, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateNotIn(List<Date> values) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE not in", values, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateBetween(Date value1, Date value2) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE between", value1, value2, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andBankCollectionAgreementDateNotBetween(Date value1, Date value2) {
            addCriterion("BANK_COLLECTION_AGREEMENT_DATE not between", value1, value2, "bankCollectionAgreementDate");
            return (Criteria) this;
        }

        public Criteria andImportNoIsNull() {
            addCriterion("IMPORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andImportNoIsNotNull() {
            addCriterion("IMPORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andImportNoEqualTo(String value) {
            addCriterion("IMPORT_NO =", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotEqualTo(String value) {
            addCriterion("IMPORT_NO <>", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoGreaterThan(String value) {
            addCriterion("IMPORT_NO >", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_NO >=", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoLessThan(String value) {
            addCriterion("IMPORT_NO <", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_NO <=", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoLike(String value) {
            addCriterion("IMPORT_NO like", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotLike(String value) {
            addCriterion("IMPORT_NO not like", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoIn(List<String> values) {
            addCriterion("IMPORT_NO in", values, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotIn(List<String> values) {
            addCriterion("IMPORT_NO not in", values, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoBetween(String value1, String value2) {
            addCriterion("IMPORT_NO between", value1, value2, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotBetween(String value1, String value2) {
            addCriterion("IMPORT_NO not between", value1, value2, "importNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoIsNull() {
            addCriterion("VPN_NO is null");
            return (Criteria) this;
        }

        public Criteria andVpnNoIsNotNull() {
            addCriterion("VPN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVpnNoEqualTo(String value) {
            addCriterion("VPN_NO =", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotEqualTo(String value) {
            addCriterion("VPN_NO <>", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoGreaterThan(String value) {
            addCriterion("VPN_NO >", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoGreaterThanOrEqualTo(String value) {
            addCriterion("VPN_NO >=", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoLessThan(String value) {
            addCriterion("VPN_NO <", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoLessThanOrEqualTo(String value) {
            addCriterion("VPN_NO <=", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoLike(String value) {
            addCriterion("VPN_NO like", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotLike(String value) {
            addCriterion("VPN_NO not like", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoIn(List<String> values) {
            addCriterion("VPN_NO in", values, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotIn(List<String> values) {
            addCriterion("VPN_NO not in", values, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoBetween(String value1, String value2) {
            addCriterion("VPN_NO between", value1, value2, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotBetween(String value1, String value2) {
            addCriterion("VPN_NO not between", value1, value2, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnPassIsNull() {
            addCriterion("VPN_PASS is null");
            return (Criteria) this;
        }

        public Criteria andVpnPassIsNotNull() {
            addCriterion("VPN_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andVpnPassEqualTo(String value) {
            addCriterion("VPN_PASS =", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassNotEqualTo(String value) {
            addCriterion("VPN_PASS <>", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassGreaterThan(String value) {
            addCriterion("VPN_PASS >", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassGreaterThanOrEqualTo(String value) {
            addCriterion("VPN_PASS >=", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassLessThan(String value) {
            addCriterion("VPN_PASS <", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassLessThanOrEqualTo(String value) {
            addCriterion("VPN_PASS <=", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassLike(String value) {
            addCriterion("VPN_PASS like", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassNotLike(String value) {
            addCriterion("VPN_PASS not like", value, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassIn(List<String> values) {
            addCriterion("VPN_PASS in", values, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassNotIn(List<String> values) {
            addCriterion("VPN_PASS not in", values, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassBetween(String value1, String value2) {
            addCriterion("VPN_PASS between", value1, value2, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andVpnPassNotBetween(String value1, String value2) {
            addCriterion("VPN_PASS not between", value1, value2, "vpnPass");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdIsNull() {
            addCriterion("CHILD_POLICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdIsNotNull() {
            addCriterion("CHILD_POLICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdEqualTo(Integer value) {
            addCriterion("CHILD_POLICE_ID =", value, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdNotEqualTo(Integer value) {
            addCriterion("CHILD_POLICE_ID <>", value, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdGreaterThan(Integer value) {
            addCriterion("CHILD_POLICE_ID >", value, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHILD_POLICE_ID >=", value, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdLessThan(Integer value) {
            addCriterion("CHILD_POLICE_ID <", value, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHILD_POLICE_ID <=", value, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdIn(List<Integer> values) {
            addCriterion("CHILD_POLICE_ID in", values, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdNotIn(List<Integer> values) {
            addCriterion("CHILD_POLICE_ID not in", values, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdBetween(Integer value1, Integer value2) {
            addCriterion("CHILD_POLICE_ID between", value1, value2, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andChildPoliceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHILD_POLICE_ID not between", value1, value2, "childPoliceId");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueIsNull() {
            addCriterion("SELF_SEL_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueIsNotNull() {
            addCriterion("SELF_SEL_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueEqualTo(String value) {
            addCriterion("SELF_SEL_VALUE =", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueNotEqualTo(String value) {
            addCriterion("SELF_SEL_VALUE <>", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueGreaterThan(String value) {
            addCriterion("SELF_SEL_VALUE >", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_SEL_VALUE >=", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueLessThan(String value) {
            addCriterion("SELF_SEL_VALUE <", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueLessThanOrEqualTo(String value) {
            addCriterion("SELF_SEL_VALUE <=", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueLike(String value) {
            addCriterion("SELF_SEL_VALUE like", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueNotLike(String value) {
            addCriterion("SELF_SEL_VALUE not like", value, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueIn(List<String> values) {
            addCriterion("SELF_SEL_VALUE in", values, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueNotIn(List<String> values) {
            addCriterion("SELF_SEL_VALUE not in", values, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueBetween(String value1, String value2) {
            addCriterion("SELF_SEL_VALUE between", value1, value2, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andSelfSelValueNotBetween(String value1, String value2) {
            addCriterion("SELF_SEL_VALUE not between", value1, value2, "selfSelValue");
            return (Criteria) this;
        }

        public Criteria andUserDefine01IsNull() {
            addCriterion("USER_DEFINE01 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine01IsNotNull() {
            addCriterion("USER_DEFINE01 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine01EqualTo(String value) {
            addCriterion("USER_DEFINE01 =", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01NotEqualTo(String value) {
            addCriterion("USER_DEFINE01 <>", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01GreaterThan(String value) {
            addCriterion("USER_DEFINE01 >", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE01 >=", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01LessThan(String value) {
            addCriterion("USER_DEFINE01 <", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE01 <=", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01Like(String value) {
            addCriterion("USER_DEFINE01 like", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01NotLike(String value) {
            addCriterion("USER_DEFINE01 not like", value, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01In(List<String> values) {
            addCriterion("USER_DEFINE01 in", values, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01NotIn(List<String> values) {
            addCriterion("USER_DEFINE01 not in", values, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01Between(String value1, String value2) {
            addCriterion("USER_DEFINE01 between", value1, value2, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine01NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE01 not between", value1, value2, "userDefine01");
            return (Criteria) this;
        }

        public Criteria andUserDefine02IsNull() {
            addCriterion("USER_DEFINE02 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine02IsNotNull() {
            addCriterion("USER_DEFINE02 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine02EqualTo(String value) {
            addCriterion("USER_DEFINE02 =", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02NotEqualTo(String value) {
            addCriterion("USER_DEFINE02 <>", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02GreaterThan(String value) {
            addCriterion("USER_DEFINE02 >", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE02 >=", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02LessThan(String value) {
            addCriterion("USER_DEFINE02 <", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE02 <=", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02Like(String value) {
            addCriterion("USER_DEFINE02 like", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02NotLike(String value) {
            addCriterion("USER_DEFINE02 not like", value, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02In(List<String> values) {
            addCriterion("USER_DEFINE02 in", values, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02NotIn(List<String> values) {
            addCriterion("USER_DEFINE02 not in", values, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02Between(String value1, String value2) {
            addCriterion("USER_DEFINE02 between", value1, value2, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine02NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE02 not between", value1, value2, "userDefine02");
            return (Criteria) this;
        }

        public Criteria andUserDefine03IsNull() {
            addCriterion("USER_DEFINE03 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine03IsNotNull() {
            addCriterion("USER_DEFINE03 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine03EqualTo(String value) {
            addCriterion("USER_DEFINE03 =", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03NotEqualTo(String value) {
            addCriterion("USER_DEFINE03 <>", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03GreaterThan(String value) {
            addCriterion("USER_DEFINE03 >", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE03 >=", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03LessThan(String value) {
            addCriterion("USER_DEFINE03 <", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE03 <=", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03Like(String value) {
            addCriterion("USER_DEFINE03 like", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03NotLike(String value) {
            addCriterion("USER_DEFINE03 not like", value, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03In(List<String> values) {
            addCriterion("USER_DEFINE03 in", values, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03NotIn(List<String> values) {
            addCriterion("USER_DEFINE03 not in", values, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03Between(String value1, String value2) {
            addCriterion("USER_DEFINE03 between", value1, value2, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine03NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE03 not between", value1, value2, "userDefine03");
            return (Criteria) this;
        }

        public Criteria andUserDefine04IsNull() {
            addCriterion("USER_DEFINE04 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine04IsNotNull() {
            addCriterion("USER_DEFINE04 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine04EqualTo(String value) {
            addCriterion("USER_DEFINE04 =", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04NotEqualTo(String value) {
            addCriterion("USER_DEFINE04 <>", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04GreaterThan(String value) {
            addCriterion("USER_DEFINE04 >", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE04 >=", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04LessThan(String value) {
            addCriterion("USER_DEFINE04 <", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE04 <=", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04Like(String value) {
            addCriterion("USER_DEFINE04 like", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04NotLike(String value) {
            addCriterion("USER_DEFINE04 not like", value, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04In(List<String> values) {
            addCriterion("USER_DEFINE04 in", values, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04NotIn(List<String> values) {
            addCriterion("USER_DEFINE04 not in", values, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04Between(String value1, String value2) {
            addCriterion("USER_DEFINE04 between", value1, value2, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine04NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE04 not between", value1, value2, "userDefine04");
            return (Criteria) this;
        }

        public Criteria andUserDefine05IsNull() {
            addCriterion("USER_DEFINE05 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine05IsNotNull() {
            addCriterion("USER_DEFINE05 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine05EqualTo(String value) {
            addCriterion("USER_DEFINE05 =", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05NotEqualTo(String value) {
            addCriterion("USER_DEFINE05 <>", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05GreaterThan(String value) {
            addCriterion("USER_DEFINE05 >", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE05 >=", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05LessThan(String value) {
            addCriterion("USER_DEFINE05 <", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE05 <=", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05Like(String value) {
            addCriterion("USER_DEFINE05 like", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05NotLike(String value) {
            addCriterion("USER_DEFINE05 not like", value, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05In(List<String> values) {
            addCriterion("USER_DEFINE05 in", values, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05NotIn(List<String> values) {
            addCriterion("USER_DEFINE05 not in", values, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05Between(String value1, String value2) {
            addCriterion("USER_DEFINE05 between", value1, value2, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine05NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE05 not between", value1, value2, "userDefine05");
            return (Criteria) this;
        }

        public Criteria andUserDefine06IsNull() {
            addCriterion("USER_DEFINE06 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine06IsNotNull() {
            addCriterion("USER_DEFINE06 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine06EqualTo(String value) {
            addCriterion("USER_DEFINE06 =", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06NotEqualTo(String value) {
            addCriterion("USER_DEFINE06 <>", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06GreaterThan(String value) {
            addCriterion("USER_DEFINE06 >", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE06 >=", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06LessThan(String value) {
            addCriterion("USER_DEFINE06 <", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE06 <=", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06Like(String value) {
            addCriterion("USER_DEFINE06 like", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06NotLike(String value) {
            addCriterion("USER_DEFINE06 not like", value, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06In(List<String> values) {
            addCriterion("USER_DEFINE06 in", values, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06NotIn(List<String> values) {
            addCriterion("USER_DEFINE06 not in", values, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06Between(String value1, String value2) {
            addCriterion("USER_DEFINE06 between", value1, value2, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine06NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE06 not between", value1, value2, "userDefine06");
            return (Criteria) this;
        }

        public Criteria andUserDefine07IsNull() {
            addCriterion("USER_DEFINE07 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine07IsNotNull() {
            addCriterion("USER_DEFINE07 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine07EqualTo(String value) {
            addCriterion("USER_DEFINE07 =", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07NotEqualTo(String value) {
            addCriterion("USER_DEFINE07 <>", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07GreaterThan(String value) {
            addCriterion("USER_DEFINE07 >", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE07 >=", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07LessThan(String value) {
            addCriterion("USER_DEFINE07 <", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE07 <=", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07Like(String value) {
            addCriterion("USER_DEFINE07 like", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07NotLike(String value) {
            addCriterion("USER_DEFINE07 not like", value, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07In(List<String> values) {
            addCriterion("USER_DEFINE07 in", values, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07NotIn(List<String> values) {
            addCriterion("USER_DEFINE07 not in", values, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07Between(String value1, String value2) {
            addCriterion("USER_DEFINE07 between", value1, value2, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine07NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE07 not between", value1, value2, "userDefine07");
            return (Criteria) this;
        }

        public Criteria andUserDefine08IsNull() {
            addCriterion("USER_DEFINE08 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine08IsNotNull() {
            addCriterion("USER_DEFINE08 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine08EqualTo(String value) {
            addCriterion("USER_DEFINE08 =", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08NotEqualTo(String value) {
            addCriterion("USER_DEFINE08 <>", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08GreaterThan(String value) {
            addCriterion("USER_DEFINE08 >", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE08 >=", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08LessThan(String value) {
            addCriterion("USER_DEFINE08 <", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE08 <=", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08Like(String value) {
            addCriterion("USER_DEFINE08 like", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08NotLike(String value) {
            addCriterion("USER_DEFINE08 not like", value, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08In(List<String> values) {
            addCriterion("USER_DEFINE08 in", values, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08NotIn(List<String> values) {
            addCriterion("USER_DEFINE08 not in", values, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08Between(String value1, String value2) {
            addCriterion("USER_DEFINE08 between", value1, value2, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine08NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE08 not between", value1, value2, "userDefine08");
            return (Criteria) this;
        }

        public Criteria andUserDefine09IsNull() {
            addCriterion("USER_DEFINE09 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine09IsNotNull() {
            addCriterion("USER_DEFINE09 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine09EqualTo(String value) {
            addCriterion("USER_DEFINE09 =", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09NotEqualTo(String value) {
            addCriterion("USER_DEFINE09 <>", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09GreaterThan(String value) {
            addCriterion("USER_DEFINE09 >", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE09 >=", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09LessThan(String value) {
            addCriterion("USER_DEFINE09 <", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE09 <=", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09Like(String value) {
            addCriterion("USER_DEFINE09 like", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09NotLike(String value) {
            addCriterion("USER_DEFINE09 not like", value, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09In(List<String> values) {
            addCriterion("USER_DEFINE09 in", values, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09NotIn(List<String> values) {
            addCriterion("USER_DEFINE09 not in", values, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09Between(String value1, String value2) {
            addCriterion("USER_DEFINE09 between", value1, value2, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine09NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE09 not between", value1, value2, "userDefine09");
            return (Criteria) this;
        }

        public Criteria andUserDefine10IsNull() {
            addCriterion("USER_DEFINE10 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine10IsNotNull() {
            addCriterion("USER_DEFINE10 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine10EqualTo(String value) {
            addCriterion("USER_DEFINE10 =", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10NotEqualTo(String value) {
            addCriterion("USER_DEFINE10 <>", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10GreaterThan(String value) {
            addCriterion("USER_DEFINE10 >", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE10 >=", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10LessThan(String value) {
            addCriterion("USER_DEFINE10 <", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE10 <=", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10Like(String value) {
            addCriterion("USER_DEFINE10 like", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10NotLike(String value) {
            addCriterion("USER_DEFINE10 not like", value, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10In(List<String> values) {
            addCriterion("USER_DEFINE10 in", values, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10NotIn(List<String> values) {
            addCriterion("USER_DEFINE10 not in", values, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10Between(String value1, String value2) {
            addCriterion("USER_DEFINE10 between", value1, value2, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine10NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE10 not between", value1, value2, "userDefine10");
            return (Criteria) this;
        }

        public Criteria andUserDefine11IsNull() {
            addCriterion("USER_DEFINE11 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine11IsNotNull() {
            addCriterion("USER_DEFINE11 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine11EqualTo(String value) {
            addCriterion("USER_DEFINE11 =", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11NotEqualTo(String value) {
            addCriterion("USER_DEFINE11 <>", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11GreaterThan(String value) {
            addCriterion("USER_DEFINE11 >", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE11 >=", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11LessThan(String value) {
            addCriterion("USER_DEFINE11 <", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE11 <=", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11Like(String value) {
            addCriterion("USER_DEFINE11 like", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11NotLike(String value) {
            addCriterion("USER_DEFINE11 not like", value, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11In(List<String> values) {
            addCriterion("USER_DEFINE11 in", values, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11NotIn(List<String> values) {
            addCriterion("USER_DEFINE11 not in", values, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11Between(String value1, String value2) {
            addCriterion("USER_DEFINE11 between", value1, value2, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine11NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE11 not between", value1, value2, "userDefine11");
            return (Criteria) this;
        }

        public Criteria andUserDefine12IsNull() {
            addCriterion("USER_DEFINE12 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine12IsNotNull() {
            addCriterion("USER_DEFINE12 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine12EqualTo(String value) {
            addCriterion("USER_DEFINE12 =", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12NotEqualTo(String value) {
            addCriterion("USER_DEFINE12 <>", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12GreaterThan(String value) {
            addCriterion("USER_DEFINE12 >", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE12 >=", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12LessThan(String value) {
            addCriterion("USER_DEFINE12 <", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE12 <=", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12Like(String value) {
            addCriterion("USER_DEFINE12 like", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12NotLike(String value) {
            addCriterion("USER_DEFINE12 not like", value, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12In(List<String> values) {
            addCriterion("USER_DEFINE12 in", values, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12NotIn(List<String> values) {
            addCriterion("USER_DEFINE12 not in", values, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12Between(String value1, String value2) {
            addCriterion("USER_DEFINE12 between", value1, value2, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine12NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE12 not between", value1, value2, "userDefine12");
            return (Criteria) this;
        }

        public Criteria andUserDefine13IsNull() {
            addCriterion("USER_DEFINE13 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine13IsNotNull() {
            addCriterion("USER_DEFINE13 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine13EqualTo(String value) {
            addCriterion("USER_DEFINE13 =", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13NotEqualTo(String value) {
            addCriterion("USER_DEFINE13 <>", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13GreaterThan(String value) {
            addCriterion("USER_DEFINE13 >", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE13 >=", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13LessThan(String value) {
            addCriterion("USER_DEFINE13 <", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE13 <=", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13Like(String value) {
            addCriterion("USER_DEFINE13 like", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13NotLike(String value) {
            addCriterion("USER_DEFINE13 not like", value, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13In(List<String> values) {
            addCriterion("USER_DEFINE13 in", values, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13NotIn(List<String> values) {
            addCriterion("USER_DEFINE13 not in", values, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13Between(String value1, String value2) {
            addCriterion("USER_DEFINE13 between", value1, value2, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine13NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE13 not between", value1, value2, "userDefine13");
            return (Criteria) this;
        }

        public Criteria andUserDefine14IsNull() {
            addCriterion("USER_DEFINE14 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine14IsNotNull() {
            addCriterion("USER_DEFINE14 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine14EqualTo(String value) {
            addCriterion("USER_DEFINE14 =", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14NotEqualTo(String value) {
            addCriterion("USER_DEFINE14 <>", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14GreaterThan(String value) {
            addCriterion("USER_DEFINE14 >", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE14 >=", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14LessThan(String value) {
            addCriterion("USER_DEFINE14 <", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE14 <=", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14Like(String value) {
            addCriterion("USER_DEFINE14 like", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14NotLike(String value) {
            addCriterion("USER_DEFINE14 not like", value, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14In(List<String> values) {
            addCriterion("USER_DEFINE14 in", values, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14NotIn(List<String> values) {
            addCriterion("USER_DEFINE14 not in", values, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14Between(String value1, String value2) {
            addCriterion("USER_DEFINE14 between", value1, value2, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine14NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE14 not between", value1, value2, "userDefine14");
            return (Criteria) this;
        }

        public Criteria andUserDefine15IsNull() {
            addCriterion("USER_DEFINE15 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine15IsNotNull() {
            addCriterion("USER_DEFINE15 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine15EqualTo(String value) {
            addCriterion("USER_DEFINE15 =", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15NotEqualTo(String value) {
            addCriterion("USER_DEFINE15 <>", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15GreaterThan(String value) {
            addCriterion("USER_DEFINE15 >", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE15 >=", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15LessThan(String value) {
            addCriterion("USER_DEFINE15 <", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE15 <=", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15Like(String value) {
            addCriterion("USER_DEFINE15 like", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15NotLike(String value) {
            addCriterion("USER_DEFINE15 not like", value, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15In(List<String> values) {
            addCriterion("USER_DEFINE15 in", values, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15NotIn(List<String> values) {
            addCriterion("USER_DEFINE15 not in", values, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15Between(String value1, String value2) {
            addCriterion("USER_DEFINE15 between", value1, value2, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine15NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE15 not between", value1, value2, "userDefine15");
            return (Criteria) this;
        }

        public Criteria andUserDefine16IsNull() {
            addCriterion("USER_DEFINE16 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine16IsNotNull() {
            addCriterion("USER_DEFINE16 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine16EqualTo(String value) {
            addCriterion("USER_DEFINE16 =", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16NotEqualTo(String value) {
            addCriterion("USER_DEFINE16 <>", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16GreaterThan(String value) {
            addCriterion("USER_DEFINE16 >", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE16 >=", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16LessThan(String value) {
            addCriterion("USER_DEFINE16 <", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE16 <=", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16Like(String value) {
            addCriterion("USER_DEFINE16 like", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16NotLike(String value) {
            addCriterion("USER_DEFINE16 not like", value, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16In(List<String> values) {
            addCriterion("USER_DEFINE16 in", values, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16NotIn(List<String> values) {
            addCriterion("USER_DEFINE16 not in", values, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16Between(String value1, String value2) {
            addCriterion("USER_DEFINE16 between", value1, value2, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andUserDefine16NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE16 not between", value1, value2, "userDefine16");
            return (Criteria) this;
        }

        public Criteria andIsDkhIsNull() {
            addCriterion("IS_DKH is null");
            return (Criteria) this;
        }

        public Criteria andIsDkhIsNotNull() {
            addCriterion("IS_DKH is not null");
            return (Criteria) this;
        }

        public Criteria andIsDkhEqualTo(String value) {
            addCriterion("IS_DKH =", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhNotEqualTo(String value) {
            addCriterion("IS_DKH <>", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhGreaterThan(String value) {
            addCriterion("IS_DKH >", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DKH >=", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhLessThan(String value) {
            addCriterion("IS_DKH <", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhLessThanOrEqualTo(String value) {
            addCriterion("IS_DKH <=", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhLike(String value) {
            addCriterion("IS_DKH like", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhNotLike(String value) {
            addCriterion("IS_DKH not like", value, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhIn(List<String> values) {
            addCriterion("IS_DKH in", values, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhNotIn(List<String> values) {
            addCriterion("IS_DKH not in", values, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhBetween(String value1, String value2) {
            addCriterion("IS_DKH between", value1, value2, "isDkh");
            return (Criteria) this;
        }

        public Criteria andIsDkhNotBetween(String value1, String value2) {
            addCriterion("IS_DKH not between", value1, value2, "isDkh");
            return (Criteria) this;
        }

        public Criteria andUserDefine18IsNull() {
            addCriterion("USER_DEFINE18 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine18IsNotNull() {
            addCriterion("USER_DEFINE18 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine18EqualTo(String value) {
            addCriterion("USER_DEFINE18 =", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18NotEqualTo(String value) {
            addCriterion("USER_DEFINE18 <>", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18GreaterThan(String value) {
            addCriterion("USER_DEFINE18 >", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE18 >=", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18LessThan(String value) {
            addCriterion("USER_DEFINE18 <", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE18 <=", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18Like(String value) {
            addCriterion("USER_DEFINE18 like", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18NotLike(String value) {
            addCriterion("USER_DEFINE18 not like", value, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18In(List<String> values) {
            addCriterion("USER_DEFINE18 in", values, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18NotIn(List<String> values) {
            addCriterion("USER_DEFINE18 not in", values, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18Between(String value1, String value2) {
            addCriterion("USER_DEFINE18 between", value1, value2, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine18NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE18 not between", value1, value2, "userDefine18");
            return (Criteria) this;
        }

        public Criteria andUserDefine19IsNull() {
            addCriterion("USER_DEFINE19 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine19IsNotNull() {
            addCriterion("USER_DEFINE19 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine19EqualTo(String value) {
            addCriterion("USER_DEFINE19 =", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19NotEqualTo(String value) {
            addCriterion("USER_DEFINE19 <>", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19GreaterThan(String value) {
            addCriterion("USER_DEFINE19 >", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE19 >=", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19LessThan(String value) {
            addCriterion("USER_DEFINE19 <", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE19 <=", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19Like(String value) {
            addCriterion("USER_DEFINE19 like", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19NotLike(String value) {
            addCriterion("USER_DEFINE19 not like", value, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19In(List<String> values) {
            addCriterion("USER_DEFINE19 in", values, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19NotIn(List<String> values) {
            addCriterion("USER_DEFINE19 not in", values, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19Between(String value1, String value2) {
            addCriterion("USER_DEFINE19 between", value1, value2, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine19NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE19 not between", value1, value2, "userDefine19");
            return (Criteria) this;
        }

        public Criteria andUserDefine20IsNull() {
            addCriterion("USER_DEFINE20 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine20IsNotNull() {
            addCriterion("USER_DEFINE20 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine20EqualTo(String value) {
            addCriterion("USER_DEFINE20 =", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20NotEqualTo(String value) {
            addCriterion("USER_DEFINE20 <>", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20GreaterThan(String value) {
            addCriterion("USER_DEFINE20 >", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE20 >=", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20LessThan(String value) {
            addCriterion("USER_DEFINE20 <", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE20 <=", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20Like(String value) {
            addCriterion("USER_DEFINE20 like", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20NotLike(String value) {
            addCriterion("USER_DEFINE20 not like", value, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20In(List<String> values) {
            addCriterion("USER_DEFINE20 in", values, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20NotIn(List<String> values) {
            addCriterion("USER_DEFINE20 not in", values, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20Between(String value1, String value2) {
            addCriterion("USER_DEFINE20 between", value1, value2, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andUserDefine20NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE20 not between", value1, value2, "userDefine20");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(String value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(String value) {
            addCriterion("TAX_RATE <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(String value) {
            addCriterion("TAX_RATE >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_RATE >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(String value) {
            addCriterion("TAX_RATE <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(String value) {
            addCriterion("TAX_RATE <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLike(String value) {
            addCriterion("TAX_RATE like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotLike(String value) {
            addCriterion("TAX_RATE not like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<String> values) {
            addCriterion("TAX_RATE in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<String> values) {
            addCriterion("TAX_RATE not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(String value1, String value2) {
            addCriterion("TAX_RATE between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(String value1, String value2) {
            addCriterion("TAX_RATE not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andMerCodeIsNull() {
            addCriterion("MER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMerCodeIsNotNull() {
            addCriterion("MER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMerCodeEqualTo(String value) {
            addCriterion("MER_CODE =", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotEqualTo(String value) {
            addCriterion("MER_CODE <>", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeGreaterThan(String value) {
            addCriterion("MER_CODE >", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MER_CODE >=", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLessThan(String value) {
            addCriterion("MER_CODE <", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLessThanOrEqualTo(String value) {
            addCriterion("MER_CODE <=", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLike(String value) {
            addCriterion("MER_CODE like", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotLike(String value) {
            addCriterion("MER_CODE not like", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeIn(List<String> values) {
            addCriterion("MER_CODE in", values, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotIn(List<String> values) {
            addCriterion("MER_CODE not in", values, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeBetween(String value1, String value2) {
            addCriterion("MER_CODE between", value1, value2, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotBetween(String value1, String value2) {
            addCriterion("MER_CODE not between", value1, value2, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyIsNull() {
            addCriterion("MER_DEVPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyIsNotNull() {
            addCriterion("MER_DEVPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyEqualTo(Short value) {
            addCriterion("MER_DEVPROPERTY =", value, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyNotEqualTo(Short value) {
            addCriterion("MER_DEVPROPERTY <>", value, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyGreaterThan(Short value) {
            addCriterion("MER_DEVPROPERTY >", value, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyGreaterThanOrEqualTo(Short value) {
            addCriterion("MER_DEVPROPERTY >=", value, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyLessThan(Short value) {
            addCriterion("MER_DEVPROPERTY <", value, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyLessThanOrEqualTo(Short value) {
            addCriterion("MER_DEVPROPERTY <=", value, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyIn(List<Short> values) {
            addCriterion("MER_DEVPROPERTY in", values, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyNotIn(List<Short> values) {
            addCriterion("MER_DEVPROPERTY not in", values, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyBetween(Short value1, Short value2) {
            addCriterion("MER_DEVPROPERTY between", value1, value2, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerDevpropertyNotBetween(Short value1, Short value2) {
            addCriterion("MER_DEVPROPERTY not between", value1, value2, "merDevproperty");
            return (Criteria) this;
        }

        public Criteria andMerTransactionIsNull() {
            addCriterion("MER_TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andMerTransactionIsNotNull() {
            addCriterion("MER_TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andMerTransactionEqualTo(String value) {
            addCriterion("MER_TRANSACTION =", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionNotEqualTo(String value) {
            addCriterion("MER_TRANSACTION <>", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionGreaterThan(String value) {
            addCriterion("MER_TRANSACTION >", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("MER_TRANSACTION >=", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionLessThan(String value) {
            addCriterion("MER_TRANSACTION <", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionLessThanOrEqualTo(String value) {
            addCriterion("MER_TRANSACTION <=", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionLike(String value) {
            addCriterion("MER_TRANSACTION like", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionNotLike(String value) {
            addCriterion("MER_TRANSACTION not like", value, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionIn(List<String> values) {
            addCriterion("MER_TRANSACTION in", values, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionNotIn(List<String> values) {
            addCriterion("MER_TRANSACTION not in", values, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionBetween(String value1, String value2) {
            addCriterion("MER_TRANSACTION between", value1, value2, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerTransactionNotBetween(String value1, String value2) {
            addCriterion("MER_TRANSACTION not between", value1, value2, "merTransaction");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeIsNull() {
            addCriterion("MER_BUS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeIsNotNull() {
            addCriterion("MER_BUS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeEqualTo(String value) {
            addCriterion("MER_BUS_TIME =", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeNotEqualTo(String value) {
            addCriterion("MER_BUS_TIME <>", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeGreaterThan(String value) {
            addCriterion("MER_BUS_TIME >", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MER_BUS_TIME >=", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeLessThan(String value) {
            addCriterion("MER_BUS_TIME <", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeLessThanOrEqualTo(String value) {
            addCriterion("MER_BUS_TIME <=", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeLike(String value) {
            addCriterion("MER_BUS_TIME like", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeNotLike(String value) {
            addCriterion("MER_BUS_TIME not like", value, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeIn(List<String> values) {
            addCriterion("MER_BUS_TIME in", values, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeNotIn(List<String> values) {
            addCriterion("MER_BUS_TIME not in", values, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeBetween(String value1, String value2) {
            addCriterion("MER_BUS_TIME between", value1, value2, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerBusTimeNotBetween(String value1, String value2) {
            addCriterion("MER_BUS_TIME not between", value1, value2, "merBusTime");
            return (Criteria) this;
        }

        public Criteria andMerSingleIsNull() {
            addCriterion("MER_SINGLE is null");
            return (Criteria) this;
        }

        public Criteria andMerSingleIsNotNull() {
            addCriterion("MER_SINGLE is not null");
            return (Criteria) this;
        }

        public Criteria andMerSingleEqualTo(String value) {
            addCriterion("MER_SINGLE =", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleNotEqualTo(String value) {
            addCriterion("MER_SINGLE <>", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleGreaterThan(String value) {
            addCriterion("MER_SINGLE >", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleGreaterThanOrEqualTo(String value) {
            addCriterion("MER_SINGLE >=", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleLessThan(String value) {
            addCriterion("MER_SINGLE <", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleLessThanOrEqualTo(String value) {
            addCriterion("MER_SINGLE <=", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleLike(String value) {
            addCriterion("MER_SINGLE like", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleNotLike(String value) {
            addCriterion("MER_SINGLE not like", value, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleIn(List<String> values) {
            addCriterion("MER_SINGLE in", values, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleNotIn(List<String> values) {
            addCriterion("MER_SINGLE not in", values, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleBetween(String value1, String value2) {
            addCriterion("MER_SINGLE between", value1, value2, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerSingleNotBetween(String value1, String value2) {
            addCriterion("MER_SINGLE not between", value1, value2, "merSingle");
            return (Criteria) this;
        }

        public Criteria andMerCommuIsNull() {
            addCriterion("MER_COMMU is null");
            return (Criteria) this;
        }

        public Criteria andMerCommuIsNotNull() {
            addCriterion("MER_COMMU is not null");
            return (Criteria) this;
        }

        public Criteria andMerCommuEqualTo(String value) {
            addCriterion("MER_COMMU =", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuNotEqualTo(String value) {
            addCriterion("MER_COMMU <>", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuGreaterThan(String value) {
            addCriterion("MER_COMMU >", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuGreaterThanOrEqualTo(String value) {
            addCriterion("MER_COMMU >=", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuLessThan(String value) {
            addCriterion("MER_COMMU <", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuLessThanOrEqualTo(String value) {
            addCriterion("MER_COMMU <=", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuLike(String value) {
            addCriterion("MER_COMMU like", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuNotLike(String value) {
            addCriterion("MER_COMMU not like", value, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuIn(List<String> values) {
            addCriterion("MER_COMMU in", values, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuNotIn(List<String> values) {
            addCriterion("MER_COMMU not in", values, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuBetween(String value1, String value2) {
            addCriterion("MER_COMMU between", value1, value2, "merCommu");
            return (Criteria) this;
        }

        public Criteria andMerCommuNotBetween(String value1, String value2) {
            addCriterion("MER_COMMU not between", value1, value2, "merCommu");
            return (Criteria) this;
        }

        public Criteria andShopKeyidIsNull() {
            addCriterion("SHOP_KEYID is null");
            return (Criteria) this;
        }

        public Criteria andShopKeyidIsNotNull() {
            addCriterion("SHOP_KEYID is not null");
            return (Criteria) this;
        }

        public Criteria andShopKeyidEqualTo(String value) {
            addCriterion("SHOP_KEYID =", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidNotEqualTo(String value) {
            addCriterion("SHOP_KEYID <>", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidGreaterThan(String value) {
            addCriterion("SHOP_KEYID >", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_KEYID >=", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidLessThan(String value) {
            addCriterion("SHOP_KEYID <", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidLessThanOrEqualTo(String value) {
            addCriterion("SHOP_KEYID <=", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidLike(String value) {
            addCriterion("SHOP_KEYID like", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidNotLike(String value) {
            addCriterion("SHOP_KEYID not like", value, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidIn(List<String> values) {
            addCriterion("SHOP_KEYID in", values, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidNotIn(List<String> values) {
            addCriterion("SHOP_KEYID not in", values, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidBetween(String value1, String value2) {
            addCriterion("SHOP_KEYID between", value1, value2, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopKeyidNotBetween(String value1, String value2) {
            addCriterion("SHOP_KEYID not between", value1, value2, "shopKeyid");
            return (Criteria) this;
        }

        public Criteria andShopOrReIsNull() {
            addCriterion("SHOP_OR_RE is null");
            return (Criteria) this;
        }

        public Criteria andShopOrReIsNotNull() {
            addCriterion("SHOP_OR_RE is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrReEqualTo(String value) {
            addCriterion("SHOP_OR_RE =", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReNotEqualTo(String value) {
            addCriterion("SHOP_OR_RE <>", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReGreaterThan(String value) {
            addCriterion("SHOP_OR_RE >", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_OR_RE >=", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReLessThan(String value) {
            addCriterion("SHOP_OR_RE <", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReLessThanOrEqualTo(String value) {
            addCriterion("SHOP_OR_RE <=", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReLike(String value) {
            addCriterion("SHOP_OR_RE like", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReNotLike(String value) {
            addCriterion("SHOP_OR_RE not like", value, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReIn(List<String> values) {
            addCriterion("SHOP_OR_RE in", values, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReNotIn(List<String> values) {
            addCriterion("SHOP_OR_RE not in", values, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReBetween(String value1, String value2) {
            addCriterion("SHOP_OR_RE between", value1, value2, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andShopOrReNotBetween(String value1, String value2) {
            addCriterion("SHOP_OR_RE not between", value1, value2, "shopOrRe");
            return (Criteria) this;
        }

        public Criteria andSelfHyIsNull() {
            addCriterion("SELF_HY is null");
            return (Criteria) this;
        }

        public Criteria andSelfHyIsNotNull() {
            addCriterion("SELF_HY is not null");
            return (Criteria) this;
        }

        public Criteria andSelfHyEqualTo(Integer value) {
            addCriterion("SELF_HY =", value, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyNotEqualTo(Integer value) {
            addCriterion("SELF_HY <>", value, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyGreaterThan(Integer value) {
            addCriterion("SELF_HY >", value, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SELF_HY >=", value, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyLessThan(Integer value) {
            addCriterion("SELF_HY <", value, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyLessThanOrEqualTo(Integer value) {
            addCriterion("SELF_HY <=", value, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyIn(List<Integer> values) {
            addCriterion("SELF_HY in", values, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyNotIn(List<Integer> values) {
            addCriterion("SELF_HY not in", values, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyBetween(Integer value1, Integer value2) {
            addCriterion("SELF_HY between", value1, value2, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfHyNotBetween(Integer value1, Integer value2) {
            addCriterion("SELF_HY not between", value1, value2, "selfHy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyIsNull() {
            addCriterion("SELF_EHY is null");
            return (Criteria) this;
        }

        public Criteria andSelfEhyIsNotNull() {
            addCriterion("SELF_EHY is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEhyEqualTo(Integer value) {
            addCriterion("SELF_EHY =", value, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyNotEqualTo(Integer value) {
            addCriterion("SELF_EHY <>", value, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyGreaterThan(Integer value) {
            addCriterion("SELF_EHY >", value, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SELF_EHY >=", value, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyLessThan(Integer value) {
            addCriterion("SELF_EHY <", value, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyLessThanOrEqualTo(Integer value) {
            addCriterion("SELF_EHY <=", value, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyIn(List<Integer> values) {
            addCriterion("SELF_EHY in", values, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyNotIn(List<Integer> values) {
            addCriterion("SELF_EHY not in", values, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyBetween(Integer value1, Integer value2) {
            addCriterion("SELF_EHY between", value1, value2, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfEhyNotBetween(Integer value1, Integer value2) {
            addCriterion("SELF_EHY not between", value1, value2, "selfEhy");
            return (Criteria) this;
        }

        public Criteria andSelfShyIsNull() {
            addCriterion("SELF_SHY is null");
            return (Criteria) this;
        }

        public Criteria andSelfShyIsNotNull() {
            addCriterion("SELF_SHY is not null");
            return (Criteria) this;
        }

        public Criteria andSelfShyEqualTo(Integer value) {
            addCriterion("SELF_SHY =", value, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyNotEqualTo(Integer value) {
            addCriterion("SELF_SHY <>", value, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyGreaterThan(Integer value) {
            addCriterion("SELF_SHY >", value, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SELF_SHY >=", value, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyLessThan(Integer value) {
            addCriterion("SELF_SHY <", value, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyLessThanOrEqualTo(Integer value) {
            addCriterion("SELF_SHY <=", value, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyIn(List<Integer> values) {
            addCriterion("SELF_SHY in", values, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyNotIn(List<Integer> values) {
            addCriterion("SELF_SHY not in", values, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyBetween(Integer value1, Integer value2) {
            addCriterion("SELF_SHY between", value1, value2, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfShyNotBetween(Integer value1, Integer value2) {
            addCriterion("SELF_SHY not between", value1, value2, "selfShy");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutIsNull() {
            addCriterion("SELF_IS_MOVEOUT is null");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutIsNotNull() {
            addCriterion("SELF_IS_MOVEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutEqualTo(Short value) {
            addCriterion("SELF_IS_MOVEOUT =", value, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutNotEqualTo(Short value) {
            addCriterion("SELF_IS_MOVEOUT <>", value, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutGreaterThan(Short value) {
            addCriterion("SELF_IS_MOVEOUT >", value, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutGreaterThanOrEqualTo(Short value) {
            addCriterion("SELF_IS_MOVEOUT >=", value, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutLessThan(Short value) {
            addCriterion("SELF_IS_MOVEOUT <", value, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutLessThanOrEqualTo(Short value) {
            addCriterion("SELF_IS_MOVEOUT <=", value, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutIn(List<Short> values) {
            addCriterion("SELF_IS_MOVEOUT in", values, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutNotIn(List<Short> values) {
            addCriterion("SELF_IS_MOVEOUT not in", values, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutBetween(Short value1, Short value2) {
            addCriterion("SELF_IS_MOVEOUT between", value1, value2, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsMoveoutNotBetween(Short value1, Short value2) {
            addCriterion("SELF_IS_MOVEOUT not between", value1, value2, "selfIsMoveout");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallIsNull() {
            addCriterion("SELF_IS_INSTALL is null");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallIsNotNull() {
            addCriterion("SELF_IS_INSTALL is not null");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallEqualTo(Short value) {
            addCriterion("SELF_IS_INSTALL =", value, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallNotEqualTo(Short value) {
            addCriterion("SELF_IS_INSTALL <>", value, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallGreaterThan(Short value) {
            addCriterion("SELF_IS_INSTALL >", value, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallGreaterThanOrEqualTo(Short value) {
            addCriterion("SELF_IS_INSTALL >=", value, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallLessThan(Short value) {
            addCriterion("SELF_IS_INSTALL <", value, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallLessThanOrEqualTo(Short value) {
            addCriterion("SELF_IS_INSTALL <=", value, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallIn(List<Short> values) {
            addCriterion("SELF_IS_INSTALL in", values, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallNotIn(List<Short> values) {
            addCriterion("SELF_IS_INSTALL not in", values, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallBetween(Short value1, Short value2) {
            addCriterion("SELF_IS_INSTALL between", value1, value2, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfIsInstallNotBetween(Short value1, Short value2) {
            addCriterion("SELF_IS_INSTALL not between", value1, value2, "selfIsInstall");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoIsNull() {
            addCriterion("SELF_CONTRACTNO is null");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoIsNotNull() {
            addCriterion("SELF_CONTRACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoEqualTo(String value) {
            addCriterion("SELF_CONTRACTNO =", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoNotEqualTo(String value) {
            addCriterion("SELF_CONTRACTNO <>", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoGreaterThan(String value) {
            addCriterion("SELF_CONTRACTNO >", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_CONTRACTNO >=", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoLessThan(String value) {
            addCriterion("SELF_CONTRACTNO <", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoLessThanOrEqualTo(String value) {
            addCriterion("SELF_CONTRACTNO <=", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoLike(String value) {
            addCriterion("SELF_CONTRACTNO like", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoNotLike(String value) {
            addCriterion("SELF_CONTRACTNO not like", value, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoIn(List<String> values) {
            addCriterion("SELF_CONTRACTNO in", values, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoNotIn(List<String> values) {
            addCriterion("SELF_CONTRACTNO not in", values, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoBetween(String value1, String value2) {
            addCriterion("SELF_CONTRACTNO between", value1, value2, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfContractnoNotBetween(String value1, String value2) {
            addCriterion("SELF_CONTRACTNO not between", value1, value2, "selfContractno");
            return (Criteria) this;
        }

        public Criteria andSelfCampincIsNull() {
            addCriterion("SELF_CAMPINC is null");
            return (Criteria) this;
        }

        public Criteria andSelfCampincIsNotNull() {
            addCriterion("SELF_CAMPINC is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCampincEqualTo(Short value) {
            addCriterion("SELF_CAMPINC =", value, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincNotEqualTo(Short value) {
            addCriterion("SELF_CAMPINC <>", value, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincGreaterThan(Short value) {
            addCriterion("SELF_CAMPINC >", value, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincGreaterThanOrEqualTo(Short value) {
            addCriterion("SELF_CAMPINC >=", value, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincLessThan(Short value) {
            addCriterion("SELF_CAMPINC <", value, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincLessThanOrEqualTo(Short value) {
            addCriterion("SELF_CAMPINC <=", value, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincIn(List<Short> values) {
            addCriterion("SELF_CAMPINC in", values, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincNotIn(List<Short> values) {
            addCriterion("SELF_CAMPINC not in", values, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincBetween(Short value1, Short value2) {
            addCriterion("SELF_CAMPINC between", value1, value2, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andSelfCampincNotBetween(Short value1, Short value2) {
            addCriterion("SELF_CAMPINC not between", value1, value2, "selfCampinc");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteIsNull() {
            addCriterion("LOGOUT_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteIsNotNull() {
            addCriterion("LOGOUT_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteEqualTo(Short value) {
            addCriterion("LOGOUT_NOTE =", value, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteNotEqualTo(Short value) {
            addCriterion("LOGOUT_NOTE <>", value, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteGreaterThan(Short value) {
            addCriterion("LOGOUT_NOTE >", value, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGOUT_NOTE >=", value, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteLessThan(Short value) {
            addCriterion("LOGOUT_NOTE <", value, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteLessThanOrEqualTo(Short value) {
            addCriterion("LOGOUT_NOTE <=", value, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteIn(List<Short> values) {
            addCriterion("LOGOUT_NOTE in", values, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteNotIn(List<Short> values) {
            addCriterion("LOGOUT_NOTE not in", values, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteBetween(Short value1, Short value2) {
            addCriterion("LOGOUT_NOTE between", value1, value2, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andLogoutNoteNotBetween(Short value1, Short value2) {
            addCriterion("LOGOUT_NOTE not between", value1, value2, "logoutNote");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeIsNull() {
            addCriterion("BACKUP_TAX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeIsNotNull() {
            addCriterion("BACKUP_TAX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeEqualTo(String value) {
            addCriterion("BACKUP_TAX_CODE =", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeNotEqualTo(String value) {
            addCriterion("BACKUP_TAX_CODE <>", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeGreaterThan(String value) {
            addCriterion("BACKUP_TAX_CODE >", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BACKUP_TAX_CODE >=", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeLessThan(String value) {
            addCriterion("BACKUP_TAX_CODE <", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeLessThanOrEqualTo(String value) {
            addCriterion("BACKUP_TAX_CODE <=", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeLike(String value) {
            addCriterion("BACKUP_TAX_CODE like", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeNotLike(String value) {
            addCriterion("BACKUP_TAX_CODE not like", value, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeIn(List<String> values) {
            addCriterion("BACKUP_TAX_CODE in", values, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeNotIn(List<String> values) {
            addCriterion("BACKUP_TAX_CODE not in", values, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeBetween(String value1, String value2) {
            addCriterion("BACKUP_TAX_CODE between", value1, value2, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andBackupTaxCodeNotBetween(String value1, String value2) {
            addCriterion("BACKUP_TAX_CODE not between", value1, value2, "backupTaxCode");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdIsNull() {
            addCriterion("ORG_MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdIsNotNull() {
            addCriterion("ORG_MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdEqualTo(String value) {
            addCriterion("ORG_MER_ID =", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdNotEqualTo(String value) {
            addCriterion("ORG_MER_ID <>", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdGreaterThan(String value) {
            addCriterion("ORG_MER_ID >", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_MER_ID >=", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdLessThan(String value) {
            addCriterion("ORG_MER_ID <", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_MER_ID <=", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdLike(String value) {
            addCriterion("ORG_MER_ID like", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdNotLike(String value) {
            addCriterion("ORG_MER_ID not like", value, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdIn(List<String> values) {
            addCriterion("ORG_MER_ID in", values, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdNotIn(List<String> values) {
            addCriterion("ORG_MER_ID not in", values, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdBetween(String value1, String value2) {
            addCriterion("ORG_MER_ID between", value1, value2, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andOrgMerIdNotBetween(String value1, String value2) {
            addCriterion("ORG_MER_ID not between", value1, value2, "orgMerId");
            return (Criteria) this;
        }

        public Criteria andSelfJniIsNull() {
            addCriterion("SELF_JNI is null");
            return (Criteria) this;
        }

        public Criteria andSelfJniIsNotNull() {
            addCriterion("SELF_JNI is not null");
            return (Criteria) this;
        }

        public Criteria andSelfJniEqualTo(Short value) {
            addCriterion("SELF_JNI =", value, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniNotEqualTo(Short value) {
            addCriterion("SELF_JNI <>", value, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniGreaterThan(Short value) {
            addCriterion("SELF_JNI >", value, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniGreaterThanOrEqualTo(Short value) {
            addCriterion("SELF_JNI >=", value, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniLessThan(Short value) {
            addCriterion("SELF_JNI <", value, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniLessThanOrEqualTo(Short value) {
            addCriterion("SELF_JNI <=", value, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniIn(List<Short> values) {
            addCriterion("SELF_JNI in", values, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniNotIn(List<Short> values) {
            addCriterion("SELF_JNI not in", values, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniBetween(Short value1, Short value2) {
            addCriterion("SELF_JNI between", value1, value2, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfJniNotBetween(Short value1, Short value2) {
            addCriterion("SELF_JNI not between", value1, value2, "selfJni");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqIsNull() {
            addCriterion("SELF_FWUQ is null");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqIsNotNull() {
            addCriterion("SELF_FWUQ is not null");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqEqualTo(Short value) {
            addCriterion("SELF_FWUQ =", value, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqNotEqualTo(Short value) {
            addCriterion("SELF_FWUQ <>", value, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqGreaterThan(Short value) {
            addCriterion("SELF_FWUQ >", value, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqGreaterThanOrEqualTo(Short value) {
            addCriterion("SELF_FWUQ >=", value, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqLessThan(Short value) {
            addCriterion("SELF_FWUQ <", value, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqLessThanOrEqualTo(Short value) {
            addCriterion("SELF_FWUQ <=", value, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqIn(List<Short> values) {
            addCriterion("SELF_FWUQ in", values, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqNotIn(List<Short> values) {
            addCriterion("SELF_FWUQ not in", values, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqBetween(Short value1, Short value2) {
            addCriterion("SELF_FWUQ between", value1, value2, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andSelfFwuqNotBetween(Short value1, Short value2) {
            addCriterion("SELF_FWUQ not between", value1, value2, "selfFwuq");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeIsNull() {
            addCriterion("PARTA_AFFILIATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeIsNotNull() {
            addCriterion("PARTA_AFFILIATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeEqualTo(Integer value) {
            addCriterion("PARTA_AFFILIATION_CODE =", value, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeNotEqualTo(Integer value) {
            addCriterion("PARTA_AFFILIATION_CODE <>", value, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeGreaterThan(Integer value) {
            addCriterion("PARTA_AFFILIATION_CODE >", value, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARTA_AFFILIATION_CODE >=", value, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeLessThan(Integer value) {
            addCriterion("PARTA_AFFILIATION_CODE <", value, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeLessThanOrEqualTo(Integer value) {
            addCriterion("PARTA_AFFILIATION_CODE <=", value, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeIn(List<Integer> values) {
            addCriterion("PARTA_AFFILIATION_CODE in", values, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeNotIn(List<Integer> values) {
            addCriterion("PARTA_AFFILIATION_CODE not in", values, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeBetween(Integer value1, Integer value2) {
            addCriterion("PARTA_AFFILIATION_CODE between", value1, value2, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andPartaAffiliationCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PARTA_AFFILIATION_CODE not between", value1, value2, "partaAffiliationCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeIsNull() {
            addCriterion("RELATED_PARTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeIsNotNull() {
            addCriterion("RELATED_PARTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeEqualTo(String value) {
            addCriterion("RELATED_PARTY_CODE =", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeNotEqualTo(String value) {
            addCriterion("RELATED_PARTY_CODE <>", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeGreaterThan(String value) {
            addCriterion("RELATED_PARTY_CODE >", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RELATED_PARTY_CODE >=", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeLessThan(String value) {
            addCriterion("RELATED_PARTY_CODE <", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeLessThanOrEqualTo(String value) {
            addCriterion("RELATED_PARTY_CODE <=", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeLike(String value) {
            addCriterion("RELATED_PARTY_CODE like", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeNotLike(String value) {
            addCriterion("RELATED_PARTY_CODE not like", value, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeIn(List<String> values) {
            addCriterion("RELATED_PARTY_CODE in", values, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeNotIn(List<String> values) {
            addCriterion("RELATED_PARTY_CODE not in", values, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeBetween(String value1, String value2) {
            addCriterion("RELATED_PARTY_CODE between", value1, value2, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andRelatedPartyCodeNotBetween(String value1, String value2) {
            addCriterion("RELATED_PARTY_CODE not between", value1, value2, "relatedPartyCode");
            return (Criteria) this;
        }

        public Criteria andAuditSignIsNull() {
            addCriterion("AUDIT_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andAuditSignIsNotNull() {
            addCriterion("AUDIT_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andAuditSignEqualTo(Short value) {
            addCriterion("AUDIT_SIGN =", value, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignNotEqualTo(Short value) {
            addCriterion("AUDIT_SIGN <>", value, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignGreaterThan(Short value) {
            addCriterion("AUDIT_SIGN >", value, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_SIGN >=", value, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignLessThan(Short value) {
            addCriterion("AUDIT_SIGN <", value, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_SIGN <=", value, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignIn(List<Short> values) {
            addCriterion("AUDIT_SIGN in", values, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignNotIn(List<Short> values) {
            addCriterion("AUDIT_SIGN not in", values, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignBetween(Short value1, Short value2) {
            addCriterion("AUDIT_SIGN between", value1, value2, "auditSign");
            return (Criteria) this;
        }

        public Criteria andAuditSignNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_SIGN not between", value1, value2, "auditSign");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipIsNull() {
            addCriterion("SELF_ISVIP is null");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipIsNotNull() {
            addCriterion("SELF_ISVIP is not null");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipEqualTo(Short value) {
            addCriterion("SELF_ISVIP =", value, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipNotEqualTo(Short value) {
            addCriterion("SELF_ISVIP <>", value, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipGreaterThan(Short value) {
            addCriterion("SELF_ISVIP >", value, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipGreaterThanOrEqualTo(Short value) {
            addCriterion("SELF_ISVIP >=", value, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipLessThan(Short value) {
            addCriterion("SELF_ISVIP <", value, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipLessThanOrEqualTo(Short value) {
            addCriterion("SELF_ISVIP <=", value, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipIn(List<Short> values) {
            addCriterion("SELF_ISVIP in", values, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipNotIn(List<Short> values) {
            addCriterion("SELF_ISVIP not in", values, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipBetween(Short value1, Short value2) {
            addCriterion("SELF_ISVIP between", value1, value2, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andSelfIsvipNotBetween(Short value1, Short value2) {
            addCriterion("SELF_ISVIP not between", value1, value2, "selfIsvip");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNull() {
            addCriterion("RESOURCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNotNull() {
            addCriterion("RESOURCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeEqualTo(Short value) {
            addCriterion("RESOURCE_CODE =", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotEqualTo(Short value) {
            addCriterion("RESOURCE_CODE <>", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThan(Short value) {
            addCriterion("RESOURCE_CODE >", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("RESOURCE_CODE >=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThan(Short value) {
            addCriterion("RESOURCE_CODE <", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThanOrEqualTo(Short value) {
            addCriterion("RESOURCE_CODE <=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIn(List<Short> values) {
            addCriterion("RESOURCE_CODE in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotIn(List<Short> values) {
            addCriterion("RESOURCE_CODE not in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeBetween(Short value1, Short value2) {
            addCriterion("RESOURCE_CODE between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotBetween(Short value1, Short value2) {
            addCriterion("RESOURCE_CODE not between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andUserDefine17IsNull() {
            addCriterion("USER_DEFINE17 is null");
            return (Criteria) this;
        }

        public Criteria andUserDefine17IsNotNull() {
            addCriterion("USER_DEFINE17 is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefine17EqualTo(String value) {
            addCriterion("USER_DEFINE17 =", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17NotEqualTo(String value) {
            addCriterion("USER_DEFINE17 <>", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17GreaterThan(String value) {
            addCriterion("USER_DEFINE17 >", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17GreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE17 >=", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17LessThan(String value) {
            addCriterion("USER_DEFINE17 <", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17LessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE17 <=", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17Like(String value) {
            addCriterion("USER_DEFINE17 like", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17NotLike(String value) {
            addCriterion("USER_DEFINE17 not like", value, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17In(List<String> values) {
            addCriterion("USER_DEFINE17 in", values, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17NotIn(List<String> values) {
            addCriterion("USER_DEFINE17 not in", values, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17Between(String value1, String value2) {
            addCriterion("USER_DEFINE17 between", value1, value2, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andUserDefine17NotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE17 not between", value1, value2, "userDefine17");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIsNull() {
            addCriterion("INVOICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIsNotNull() {
            addCriterion("INVOICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameEqualTo(String value) {
            addCriterion("INVOICE_NAME =", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotEqualTo(String value) {
            addCriterion("INVOICE_NAME <>", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameGreaterThan(String value) {
            addCriterion("INVOICE_NAME >", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NAME >=", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLessThan(String value) {
            addCriterion("INVOICE_NAME <", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NAME <=", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameLike(String value) {
            addCriterion("INVOICE_NAME like", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotLike(String value) {
            addCriterion("INVOICE_NAME not like", value, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameIn(List<String> values) {
            addCriterion("INVOICE_NAME in", values, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotIn(List<String> values) {
            addCriterion("INVOICE_NAME not in", values, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameBetween(String value1, String value2) {
            addCriterion("INVOICE_NAME between", value1, value2, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceNameNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NAME not between", value1, value2, "invoiceName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIsNull() {
            addCriterion("INVOICE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIsNotNull() {
            addCriterion("INVOICE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelEqualTo(String value) {
            addCriterion("INVOICE_TEL =", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotEqualTo(String value) {
            addCriterion("INVOICE_TEL <>", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelGreaterThan(String value) {
            addCriterion("INVOICE_TEL >", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TEL >=", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLessThan(String value) {
            addCriterion("INVOICE_TEL <", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TEL <=", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelLike(String value) {
            addCriterion("INVOICE_TEL like", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotLike(String value) {
            addCriterion("INVOICE_TEL not like", value, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelIn(List<String> values) {
            addCriterion("INVOICE_TEL in", values, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotIn(List<String> values) {
            addCriterion("INVOICE_TEL not in", values, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelBetween(String value1, String value2) {
            addCriterion("INVOICE_TEL between", value1, value2, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTelNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TEL not between", value1, value2, "invoiceTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIsNull() {
            addCriterion("INVOICE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIsNotNull() {
            addCriterion("INVOICE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrEqualTo(String value) {
            addCriterion("INVOICE_ADDR =", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotEqualTo(String value) {
            addCriterion("INVOICE_ADDR <>", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrGreaterThan(String value) {
            addCriterion("INVOICE_ADDR >", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDR >=", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrLessThan(String value) {
            addCriterion("INVOICE_ADDR <", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDR <=", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrLike(String value) {
            addCriterion("INVOICE_ADDR like", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotLike(String value) {
            addCriterion("INVOICE_ADDR not like", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIn(List<String> values) {
            addCriterion("INVOICE_ADDR in", values, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotIn(List<String> values) {
            addCriterion("INVOICE_ADDR not in", values, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDR between", value1, value2, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDR not between", value1, value2, "invoiceAddr");
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