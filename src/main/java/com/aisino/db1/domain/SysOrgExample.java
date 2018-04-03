package com.aisino.db1.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOrgExample() {
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

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdIsNull() {
            addCriterion("PARENT_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdIsNotNull() {
            addCriterion("PARENT_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdEqualTo(Integer value) {
            addCriterion("PARENT_ORG_ID =", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ORG_ID <>", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdGreaterThan(Integer value) {
            addCriterion("PARENT_ORG_ID >", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ORG_ID >=", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdLessThan(Integer value) {
            addCriterion("PARENT_ORG_ID <", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ORG_ID <=", value, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdIn(List<Integer> values) {
            addCriterion("PARENT_ORG_ID in", values, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ORG_ID not in", values, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ORG_ID between", value1, value2, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andParentOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ORG_ID not between", value1, value2, "parentOrgId");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelIsNull() {
            addCriterion("UNITS_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelIsNotNull() {
            addCriterion("UNITS_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelEqualTo(Integer value) {
            addCriterion("UNITS_LEVEL =", value, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelNotEqualTo(Integer value) {
            addCriterion("UNITS_LEVEL <>", value, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelGreaterThan(Integer value) {
            addCriterion("UNITS_LEVEL >", value, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNITS_LEVEL >=", value, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelLessThan(Integer value) {
            addCriterion("UNITS_LEVEL <", value, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelLessThanOrEqualTo(Integer value) {
            addCriterion("UNITS_LEVEL <=", value, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelIn(List<Integer> values) {
            addCriterion("UNITS_LEVEL in", values, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelNotIn(List<Integer> values) {
            addCriterion("UNITS_LEVEL not in", values, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelBetween(Integer value1, Integer value2) {
            addCriterion("UNITS_LEVEL between", value1, value2, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andUnitsLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("UNITS_LEVEL not between", value1, value2, "unitsLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNull() {
            addCriterion("BUSINESS_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNotNull() {
            addCriterion("BUSINESS_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS =", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS <>", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThan(String value) {
            addCriterion("BUSINESS_ADDRESS >", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS >=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThan(String value) {
            addCriterion("BUSINESS_ADDRESS <", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS <=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLike(String value) {
            addCriterion("BUSINESS_ADDRESS like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotLike(String value) {
            addCriterion("BUSINESS_ADDRESS not like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIn(List<String> values) {
            addCriterion("BUSINESS_ADDRESS in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotIn(List<String> values) {
            addCriterion("BUSINESS_ADDRESS not in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressBetween(String value1, String value2) {
            addCriterion("BUSINESS_ADDRESS between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_ADDRESS not between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressIsNull() {
            addCriterion("COMMUNICATION_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressIsNotNull() {
            addCriterion("COMMUNICATION_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressEqualTo(String value) {
            addCriterion("COMMUNICATION_ADDRESS =", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressNotEqualTo(String value) {
            addCriterion("COMMUNICATION_ADDRESS <>", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressGreaterThan(String value) {
            addCriterion("COMMUNICATION_ADDRESS >", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNICATION_ADDRESS >=", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressLessThan(String value) {
            addCriterion("COMMUNICATION_ADDRESS <", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressLessThanOrEqualTo(String value) {
            addCriterion("COMMUNICATION_ADDRESS <=", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressLike(String value) {
            addCriterion("COMMUNICATION_ADDRESS like", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressNotLike(String value) {
            addCriterion("COMMUNICATION_ADDRESS not like", value, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressIn(List<String> values) {
            addCriterion("COMMUNICATION_ADDRESS in", values, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressNotIn(List<String> values) {
            addCriterion("COMMUNICATION_ADDRESS not in", values, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressBetween(String value1, String value2) {
            addCriterion("COMMUNICATION_ADDRESS between", value1, value2, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationAddressNotBetween(String value1, String value2) {
            addCriterion("COMMUNICATION_ADDRESS not between", value1, value2, "communicationAddress");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andOpretorIsNull() {
            addCriterion("OPRETOR is null");
            return (Criteria) this;
        }

        public Criteria andOpretorIsNotNull() {
            addCriterion("OPRETOR is not null");
            return (Criteria) this;
        }

        public Criteria andOpretorEqualTo(String value) {
            addCriterion("OPRETOR =", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorNotEqualTo(String value) {
            addCriterion("OPRETOR <>", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorGreaterThan(String value) {
            addCriterion("OPRETOR >", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorGreaterThanOrEqualTo(String value) {
            addCriterion("OPRETOR >=", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorLessThan(String value) {
            addCriterion("OPRETOR <", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorLessThanOrEqualTo(String value) {
            addCriterion("OPRETOR <=", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorLike(String value) {
            addCriterion("OPRETOR like", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorNotLike(String value) {
            addCriterion("OPRETOR not like", value, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorIn(List<String> values) {
            addCriterion("OPRETOR in", values, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorNotIn(List<String> values) {
            addCriterion("OPRETOR not in", values, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorBetween(String value1, String value2) {
            addCriterion("OPRETOR between", value1, value2, "opretor");
            return (Criteria) this;
        }

        public Criteria andOpretorNotBetween(String value1, String value2) {
            addCriterion("OPRETOR not between", value1, value2, "opretor");
            return (Criteria) this;
        }

        public Criteria andHotlineIsNull() {
            addCriterion("HOTLINE is null");
            return (Criteria) this;
        }

        public Criteria andHotlineIsNotNull() {
            addCriterion("HOTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andHotlineEqualTo(String value) {
            addCriterion("HOTLINE =", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotEqualTo(String value) {
            addCriterion("HOTLINE <>", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineGreaterThan(String value) {
            addCriterion("HOTLINE >", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineGreaterThanOrEqualTo(String value) {
            addCriterion("HOTLINE >=", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLessThan(String value) {
            addCriterion("HOTLINE <", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLessThanOrEqualTo(String value) {
            addCriterion("HOTLINE <=", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLike(String value) {
            addCriterion("HOTLINE like", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotLike(String value) {
            addCriterion("HOTLINE not like", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineIn(List<String> values) {
            addCriterion("HOTLINE in", values, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotIn(List<String> values) {
            addCriterion("HOTLINE not in", values, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineBetween(String value1, String value2) {
            addCriterion("HOTLINE between", value1, value2, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotBetween(String value1, String value2) {
            addCriterion("HOTLINE not between", value1, value2, "hotline");
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

        public Criteria andPrincipalTelephoneIsNull() {
            addCriterion("PRINCIPAL_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneIsNotNull() {
            addCriterion("PRINCIPAL_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneEqualTo(String value) {
            addCriterion("PRINCIPAL_TELEPHONE =", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneNotEqualTo(String value) {
            addCriterion("PRINCIPAL_TELEPHONE <>", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneGreaterThan(String value) {
            addCriterion("PRINCIPAL_TELEPHONE >", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_TELEPHONE >=", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneLessThan(String value) {
            addCriterion("PRINCIPAL_TELEPHONE <", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_TELEPHONE <=", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneLike(String value) {
            addCriterion("PRINCIPAL_TELEPHONE like", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneNotLike(String value) {
            addCriterion("PRINCIPAL_TELEPHONE not like", value, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneIn(List<String> values) {
            addCriterion("PRINCIPAL_TELEPHONE in", values, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneNotIn(List<String> values) {
            addCriterion("PRINCIPAL_TELEPHONE not in", values, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_TELEPHONE between", value1, value2, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelephoneNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_TELEPHONE not between", value1, value2, "principalTelephone");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNull() {
            addCriterion("PRINCIPAL_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNotNull() {
            addCriterion("PRINCIPAL_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileEqualTo(String value) {
            addCriterion("PRINCIPAL_MOBILE =", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotEqualTo(String value) {
            addCriterion("PRINCIPAL_MOBILE <>", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThan(String value) {
            addCriterion("PRINCIPAL_MOBILE >", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_MOBILE >=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThan(String value) {
            addCriterion("PRINCIPAL_MOBILE <", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_MOBILE <=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLike(String value) {
            addCriterion("PRINCIPAL_MOBILE like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotLike(String value) {
            addCriterion("PRINCIPAL_MOBILE not like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIn(List<String> values) {
            addCriterion("PRINCIPAL_MOBILE in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotIn(List<String> values) {
            addCriterion("PRINCIPAL_MOBILE not in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_MOBILE between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_MOBILE not between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneIsNull() {
            addCriterion("COMPLAIN_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneIsNotNull() {
            addCriterion("COMPLAIN_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneEqualTo(String value) {
            addCriterion("COMPLAIN_TELEPHONE =", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneNotEqualTo(String value) {
            addCriterion("COMPLAIN_TELEPHONE <>", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneGreaterThan(String value) {
            addCriterion("COMPLAIN_TELEPHONE >", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLAIN_TELEPHONE >=", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneLessThan(String value) {
            addCriterion("COMPLAIN_TELEPHONE <", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneLessThanOrEqualTo(String value) {
            addCriterion("COMPLAIN_TELEPHONE <=", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneLike(String value) {
            addCriterion("COMPLAIN_TELEPHONE like", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneNotLike(String value) {
            addCriterion("COMPLAIN_TELEPHONE not like", value, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneIn(List<String> values) {
            addCriterion("COMPLAIN_TELEPHONE in", values, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneNotIn(List<String> values) {
            addCriterion("COMPLAIN_TELEPHONE not in", values, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneBetween(String value1, String value2) {
            addCriterion("COMPLAIN_TELEPHONE between", value1, value2, "complainTelephone");
            return (Criteria) this;
        }

        public Criteria andComplainTelephoneNotBetween(String value1, String value2) {
            addCriterion("COMPLAIN_TELEPHONE not between", value1, value2, "complainTelephone");
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

        public Criteria andDefaultChargeAmountIsNull() {
            addCriterion("DEFAULT_CHARGE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountIsNotNull() {
            addCriterion("DEFAULT_CHARGE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_CHARGE_AMOUNT =", value, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_CHARGE_AMOUNT <>", value, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountGreaterThan(BigDecimal value) {
            addCriterion("DEFAULT_CHARGE_AMOUNT >", value, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_CHARGE_AMOUNT >=", value, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountLessThan(BigDecimal value) {
            addCriterion("DEFAULT_CHARGE_AMOUNT <", value, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_CHARGE_AMOUNT <=", value, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_CHARGE_AMOUNT in", values, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_CHARGE_AMOUNT not in", values, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_CHARGE_AMOUNT between", value1, value2, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_CHARGE_AMOUNT not between", value1, value2, "defaultChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleIsNull() {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleIsNotNull() {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleEqualTo(Short value) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE =", value, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleNotEqualTo(Short value) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE <>", value, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleGreaterThan(Short value) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE >", value, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleGreaterThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE >=", value, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleLessThan(Short value) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE <", value, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleLessThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE <=", value, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleIn(List<Short> values) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE in", values, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleNotIn(List<Short> values) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE not in", values, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE between", value1, value2, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andDefaultChargeExpiryRuleNotBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_CHARGE_EXPIRY_RULE not between", value1, value2, "defaultChargeExpiryRule");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNull() {
            addCriterion("TAX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNotNull() {
            addCriterion("TAX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdEqualTo(String value) {
            addCriterion("TAX_ID =", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotEqualTo(String value) {
            addCriterion("TAX_ID <>", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThan(String value) {
            addCriterion("TAX_ID >", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ID >=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThan(String value) {
            addCriterion("TAX_ID <", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThanOrEqualTo(String value) {
            addCriterion("TAX_ID <=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLike(String value) {
            addCriterion("TAX_ID like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotLike(String value) {
            addCriterion("TAX_ID not like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIn(List<String> values) {
            addCriterion("TAX_ID in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotIn(List<String> values) {
            addCriterion("TAX_ID not in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdBetween(String value1, String value2) {
            addCriterion("TAX_ID between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotBetween(String value1, String value2) {
            addCriterion("TAX_ID not between", value1, value2, "taxId");
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

        public Criteria andRegisteredFundEqualTo(String value) {
            addCriterion("REGISTERED_FUND =", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundNotEqualTo(String value) {
            addCriterion("REGISTERED_FUND <>", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundGreaterThan(String value) {
            addCriterion("REGISTERED_FUND >", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_FUND >=", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundLessThan(String value) {
            addCriterion("REGISTERED_FUND <", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_FUND <=", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundLike(String value) {
            addCriterion("REGISTERED_FUND like", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundNotLike(String value) {
            addCriterion("REGISTERED_FUND not like", value, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundIn(List<String> values) {
            addCriterion("REGISTERED_FUND in", values, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundNotIn(List<String> values) {
            addCriterion("REGISTERED_FUND not in", values, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundBetween(String value1, String value2) {
            addCriterion("REGISTERED_FUND between", value1, value2, "registeredFund");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_FUND not between", value1, value2, "registeredFund");
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

        public Criteria andHeadOfUnitIsNull() {
            addCriterion("HEAD_OF_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitIsNotNull() {
            addCriterion("HEAD_OF_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitEqualTo(String value) {
            addCriterion("HEAD_OF_UNIT =", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitNotEqualTo(String value) {
            addCriterion("HEAD_OF_UNIT <>", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitGreaterThan(String value) {
            addCriterion("HEAD_OF_UNIT >", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD_OF_UNIT >=", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitLessThan(String value) {
            addCriterion("HEAD_OF_UNIT <", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitLessThanOrEqualTo(String value) {
            addCriterion("HEAD_OF_UNIT <=", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitLike(String value) {
            addCriterion("HEAD_OF_UNIT like", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitNotLike(String value) {
            addCriterion("HEAD_OF_UNIT not like", value, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitIn(List<String> values) {
            addCriterion("HEAD_OF_UNIT in", values, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitNotIn(List<String> values) {
            addCriterion("HEAD_OF_UNIT not in", values, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitBetween(String value1, String value2) {
            addCriterion("HEAD_OF_UNIT between", value1, value2, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andHeadOfUnitNotBetween(String value1, String value2) {
            addCriterion("HEAD_OF_UNIT not between", value1, value2, "headOfUnit");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesIsNull() {
            addCriterion("SERVICE_VEHICLES is null");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesIsNotNull() {
            addCriterion("SERVICE_VEHICLES is not null");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesEqualTo(Short value) {
            addCriterion("SERVICE_VEHICLES =", value, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesNotEqualTo(Short value) {
            addCriterion("SERVICE_VEHICLES <>", value, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesGreaterThan(Short value) {
            addCriterion("SERVICE_VEHICLES >", value, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesGreaterThanOrEqualTo(Short value) {
            addCriterion("SERVICE_VEHICLES >=", value, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesLessThan(Short value) {
            addCriterion("SERVICE_VEHICLES <", value, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesLessThanOrEqualTo(Short value) {
            addCriterion("SERVICE_VEHICLES <=", value, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesIn(List<Short> values) {
            addCriterion("SERVICE_VEHICLES in", values, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesNotIn(List<Short> values) {
            addCriterion("SERVICE_VEHICLES not in", values, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesBetween(Short value1, Short value2) {
            addCriterion("SERVICE_VEHICLES between", value1, value2, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andServiceVehiclesNotBetween(Short value1, Short value2) {
            addCriterion("SERVICE_VEHICLES not between", value1, value2, "serviceVehicles");
            return (Criteria) this;
        }

        public Criteria andUidvalidityIsNull() {
            addCriterion("UIDVALIDITY is null");
            return (Criteria) this;
        }

        public Criteria andUidvalidityIsNotNull() {
            addCriterion("UIDVALIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andUidvalidityEqualTo(Short value) {
            addCriterion("UIDVALIDITY =", value, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityNotEqualTo(Short value) {
            addCriterion("UIDVALIDITY <>", value, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityGreaterThan(Short value) {
            addCriterion("UIDVALIDITY >", value, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityGreaterThanOrEqualTo(Short value) {
            addCriterion("UIDVALIDITY >=", value, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityLessThan(Short value) {
            addCriterion("UIDVALIDITY <", value, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityLessThanOrEqualTo(Short value) {
            addCriterion("UIDVALIDITY <=", value, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityIn(List<Short> values) {
            addCriterion("UIDVALIDITY in", values, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityNotIn(List<Short> values) {
            addCriterion("UIDVALIDITY not in", values, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityBetween(Short value1, Short value2) {
            addCriterion("UIDVALIDITY between", value1, value2, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andUidvalidityNotBetween(Short value1, Short value2) {
            addCriterion("UIDVALIDITY not between", value1, value2, "uidvalidity");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNull() {
            addCriterion("ZONE_ID is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {
            addCriterion("ZONE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(Integer value) {
            addCriterion("ZONE_ID =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(Integer value) {
            addCriterion("ZONE_ID <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(Integer value) {
            addCriterion("ZONE_ID >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZONE_ID >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(Integer value) {
            addCriterion("ZONE_ID <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(Integer value) {
            addCriterion("ZONE_ID <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<Integer> values) {
            addCriterion("ZONE_ID in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<Integer> values) {
            addCriterion("ZONE_ID not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(Integer value1, Integer value2) {
            addCriterion("ZONE_ID between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ZONE_ID not between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdIsNull() {
            addCriterion("ORG_TAX_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdIsNotNull() {
            addCriterion("ORG_TAX_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdEqualTo(Integer value) {
            addCriterion("ORG_TAX_DEPARTMENT_ID =", value, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdNotEqualTo(Integer value) {
            addCriterion("ORG_TAX_DEPARTMENT_ID <>", value, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdGreaterThan(Integer value) {
            addCriterion("ORG_TAX_DEPARTMENT_ID >", value, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_TAX_DEPARTMENT_ID >=", value, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdLessThan(Integer value) {
            addCriterion("ORG_TAX_DEPARTMENT_ID <", value, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_TAX_DEPARTMENT_ID <=", value, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdIn(List<Integer> values) {
            addCriterion("ORG_TAX_DEPARTMENT_ID in", values, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdNotIn(List<Integer> values) {
            addCriterion("ORG_TAX_DEPARTMENT_ID not in", values, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("ORG_TAX_DEPARTMENT_ID between", value1, value2, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andOrgTaxDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_TAX_DEPARTMENT_ID not between", value1, value2, "orgTaxDepartmentId");
            return (Criteria) this;
        }

        public Criteria andFoundationDateIsNull() {
            addCriterion("FOUNDATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFoundationDateIsNotNull() {
            addCriterion("FOUNDATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFoundationDateEqualTo(Date value) {
            addCriterion("FOUNDATION_DATE =", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateNotEqualTo(Date value) {
            addCriterion("FOUNDATION_DATE <>", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateGreaterThan(Date value) {
            addCriterion("FOUNDATION_DATE >", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FOUNDATION_DATE >=", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateLessThan(Date value) {
            addCriterion("FOUNDATION_DATE <", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateLessThanOrEqualTo(Date value) {
            addCriterion("FOUNDATION_DATE <=", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateIn(List<Date> values) {
            addCriterion("FOUNDATION_DATE in", values, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateNotIn(List<Date> values) {
            addCriterion("FOUNDATION_DATE not in", values, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateBetween(Date value1, Date value2) {
            addCriterion("FOUNDATION_DATE between", value1, value2, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateNotBetween(Date value1, Date value2) {
            addCriterion("FOUNDATION_DATE not between", value1, value2, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateIsNull() {
            addCriterion("ANTICOUNTERFEITING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateIsNotNull() {
            addCriterion("ANTICOUNTERFEITING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateEqualTo(Date value) {
            addCriterion("ANTICOUNTERFEITING_DATE =", value, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateNotEqualTo(Date value) {
            addCriterion("ANTICOUNTERFEITING_DATE <>", value, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateGreaterThan(Date value) {
            addCriterion("ANTICOUNTERFEITING_DATE >", value, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ANTICOUNTERFEITING_DATE >=", value, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateLessThan(Date value) {
            addCriterion("ANTICOUNTERFEITING_DATE <", value, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateLessThanOrEqualTo(Date value) {
            addCriterion("ANTICOUNTERFEITING_DATE <=", value, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateIn(List<Date> values) {
            addCriterion("ANTICOUNTERFEITING_DATE in", values, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateNotIn(List<Date> values) {
            addCriterion("ANTICOUNTERFEITING_DATE not in", values, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateBetween(Date value1, Date value2) {
            addCriterion("ANTICOUNTERFEITING_DATE between", value1, value2, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andAnticounterfeitingDateNotBetween(Date value1, Date value2) {
            addCriterion("ANTICOUNTERFEITING_DATE not between", value1, value2, "anticounterfeitingDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNull() {
            addCriterion("CREAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNotNull() {
            addCriterion("CREAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDateEqualTo(Date value) {
            addCriterion("CREAT_DATE =", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotEqualTo(Date value) {
            addCriterion("CREAT_DATE <>", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThan(Date value) {
            addCriterion("CREAT_DATE >", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREAT_DATE >=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThan(Date value) {
            addCriterion("CREAT_DATE <", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThanOrEqualTo(Date value) {
            addCriterion("CREAT_DATE <=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIn(List<Date> values) {
            addCriterion("CREAT_DATE in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotIn(List<Date> values) {
            addCriterion("CREAT_DATE not in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateBetween(Date value1, Date value2) {
            addCriterion("CREAT_DATE between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotBetween(Date value1, Date value2) {
            addCriterion("CREAT_DATE not between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealIsNull() {
            addCriterion("FILE_OFFICIAL_SEAL is null");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealIsNotNull() {
            addCriterion("FILE_OFFICIAL_SEAL is not null");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealEqualTo(String value) {
            addCriterion("FILE_OFFICIAL_SEAL =", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealNotEqualTo(String value) {
            addCriterion("FILE_OFFICIAL_SEAL <>", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealGreaterThan(String value) {
            addCriterion("FILE_OFFICIAL_SEAL >", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_OFFICIAL_SEAL >=", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealLessThan(String value) {
            addCriterion("FILE_OFFICIAL_SEAL <", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealLessThanOrEqualTo(String value) {
            addCriterion("FILE_OFFICIAL_SEAL <=", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealLike(String value) {
            addCriterion("FILE_OFFICIAL_SEAL like", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealNotLike(String value) {
            addCriterion("FILE_OFFICIAL_SEAL not like", value, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealIn(List<String> values) {
            addCriterion("FILE_OFFICIAL_SEAL in", values, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealNotIn(List<String> values) {
            addCriterion("FILE_OFFICIAL_SEAL not in", values, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealBetween(String value1, String value2) {
            addCriterion("FILE_OFFICIAL_SEAL between", value1, value2, "fileOfficialSeal");
            return (Criteria) this;
        }

        public Criteria andFileOfficialSealNotBetween(String value1, String value2) {
            addCriterion("FILE_OFFICIAL_SEAL not between", value1, value2, "fileOfficialSeal");
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

        public Criteria andAssistantGeneralManagerIsNull() {
            addCriterion("ASSISTANT_GENERAL_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerIsNotNull() {
            addCriterion("ASSISTANT_GENERAL_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerEqualTo(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER =", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerNotEqualTo(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER <>", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerGreaterThan(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER >", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerGreaterThanOrEqualTo(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER >=", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerLessThan(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER <", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerLessThanOrEqualTo(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER <=", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerLike(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER like", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerNotLike(String value) {
            addCriterion("ASSISTANT_GENERAL_MANAGER not like", value, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerIn(List<String> values) {
            addCriterion("ASSISTANT_GENERAL_MANAGER in", values, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerNotIn(List<String> values) {
            addCriterion("ASSISTANT_GENERAL_MANAGER not in", values, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerBetween(String value1, String value2) {
            addCriterion("ASSISTANT_GENERAL_MANAGER between", value1, value2, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andAssistantGeneralManagerNotBetween(String value1, String value2) {
            addCriterion("ASSISTANT_GENERAL_MANAGER not between", value1, value2, "assistantGeneralManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerIsNull() {
            addCriterion("FINANCE_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerIsNotNull() {
            addCriterion("FINANCE_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerEqualTo(String value) {
            addCriterion("FINANCE_MANAGER =", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerNotEqualTo(String value) {
            addCriterion("FINANCE_MANAGER <>", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerGreaterThan(String value) {
            addCriterion("FINANCE_MANAGER >", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCE_MANAGER >=", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerLessThan(String value) {
            addCriterion("FINANCE_MANAGER <", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerLessThanOrEqualTo(String value) {
            addCriterion("FINANCE_MANAGER <=", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerLike(String value) {
            addCriterion("FINANCE_MANAGER like", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerNotLike(String value) {
            addCriterion("FINANCE_MANAGER not like", value, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerIn(List<String> values) {
            addCriterion("FINANCE_MANAGER in", values, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerNotIn(List<String> values) {
            addCriterion("FINANCE_MANAGER not in", values, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerBetween(String value1, String value2) {
            addCriterion("FINANCE_MANAGER between", value1, value2, "financeManager");
            return (Criteria) this;
        }

        public Criteria andFinanceManagerNotBetween(String value1, String value2) {
            addCriterion("FINANCE_MANAGER not between", value1, value2, "financeManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerIsNull() {
            addCriterion("CUSTOMER_SERVICE_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerIsNotNull() {
            addCriterion("CUSTOMER_SERVICE_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerEqualTo(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER =", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerNotEqualTo(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER <>", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerGreaterThan(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER >", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER >=", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerLessThan(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER <", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER <=", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerLike(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER like", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerNotLike(String value) {
            addCriterion("CUSTOMER_SERVICE_MANAGER not like", value, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerIn(List<String> values) {
            addCriterion("CUSTOMER_SERVICE_MANAGER in", values, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerNotIn(List<String> values) {
            addCriterion("CUSTOMER_SERVICE_MANAGER not in", values, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SERVICE_MANAGER between", value1, value2, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceManagerNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SERVICE_MANAGER not between", value1, value2, "customerServiceManager");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("CONSIGNEE is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("CONSIGNEE is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("CONSIGNEE =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("CONSIGNEE <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("CONSIGNEE >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSIGNEE >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("CONSIGNEE <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("CONSIGNEE <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("CONSIGNEE like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("CONSIGNEE not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("CONSIGNEE in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("CONSIGNEE not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("CONSIGNEE between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("CONSIGNEE not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("BUSINESS =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("BUSINESS <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("BUSINESS >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("BUSINESS <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("BUSINESS like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("BUSINESS not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("BUSINESS in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("BUSINESS not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("BUSINESS between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("BUSINESS not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalIsNull() {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalIsNotNull() {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalEqualTo(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL =", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalNotEqualTo(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL <>", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalGreaterThan(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL >", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL >=", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalLessThan(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL <", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalLessThanOrEqualTo(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL <=", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalLike(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL like", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalNotLike(String value) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL not like", value, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalIn(List<String> values) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL in", values, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalNotIn(List<String> values) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL not in", values, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalBetween(String value1, String value2) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL between", value1, value2, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstOpenBadPrincipalNotBetween(String value1, String value2) {
            addCriterion("FIRST_OPEN_BAD_PRINCIPAL not between", value1, value2, "firstOpenBadPrincipal");
            return (Criteria) this;
        }

        public Criteria andOtherContactIsNull() {
            addCriterion("OTHER_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andOtherContactIsNotNull() {
            addCriterion("OTHER_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherContactEqualTo(String value) {
            addCriterion("OTHER_CONTACT =", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotEqualTo(String value) {
            addCriterion("OTHER_CONTACT <>", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactGreaterThan(String value) {
            addCriterion("OTHER_CONTACT >", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_CONTACT >=", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactLessThan(String value) {
            addCriterion("OTHER_CONTACT <", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactLessThanOrEqualTo(String value) {
            addCriterion("OTHER_CONTACT <=", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactLike(String value) {
            addCriterion("OTHER_CONTACT like", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotLike(String value) {
            addCriterion("OTHER_CONTACT not like", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactIn(List<String> values) {
            addCriterion("OTHER_CONTACT in", values, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotIn(List<String> values) {
            addCriterion("OTHER_CONTACT not in", values, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactBetween(String value1, String value2) {
            addCriterion("OTHER_CONTACT between", value1, value2, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotBetween(String value1, String value2) {
            addCriterion("OTHER_CONTACT not between", value1, value2, "otherContact");
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

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberIsNull() {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberIsNotNull() {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER =", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberNotEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER <>", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberGreaterThan(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER >", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER >=", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberLessThan(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER <", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER <=", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberLike(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER like", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberNotLike(String value) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER not like", value, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberIn(List<String> values) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER in", values, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberNotIn(List<String> values) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER not in", values, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberBetween(String value1, String value2) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER between", value1, value2, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifierNumberNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER_IDENTIFIER_NUMBER not between", value1, value2, "taxpayerIdentifierNumber");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneIsNull() {
            addCriterion("BILL_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneIsNotNull() {
            addCriterion("BILL_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneEqualTo(String value) {
            addCriterion("BILL_TELEPHONE =", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneNotEqualTo(String value) {
            addCriterion("BILL_TELEPHONE <>", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneGreaterThan(String value) {
            addCriterion("BILL_TELEPHONE >", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_TELEPHONE >=", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneLessThan(String value) {
            addCriterion("BILL_TELEPHONE <", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneLessThanOrEqualTo(String value) {
            addCriterion("BILL_TELEPHONE <=", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneLike(String value) {
            addCriterion("BILL_TELEPHONE like", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneNotLike(String value) {
            addCriterion("BILL_TELEPHONE not like", value, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneIn(List<String> values) {
            addCriterion("BILL_TELEPHONE in", values, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneNotIn(List<String> values) {
            addCriterion("BILL_TELEPHONE not in", values, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneBetween(String value1, String value2) {
            addCriterion("BILL_TELEPHONE between", value1, value2, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillTelephoneNotBetween(String value1, String value2) {
            addCriterion("BILL_TELEPHONE not between", value1, value2, "billTelephone");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankIsNull() {
            addCriterion("BILL_ACCOUNT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankIsNotNull() {
            addCriterion("BILL_ACCOUNT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankEqualTo(String value) {
            addCriterion("BILL_ACCOUNT_BANK =", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankNotEqualTo(String value) {
            addCriterion("BILL_ACCOUNT_BANK <>", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankGreaterThan(String value) {
            addCriterion("BILL_ACCOUNT_BANK >", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_ACCOUNT_BANK >=", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankLessThan(String value) {
            addCriterion("BILL_ACCOUNT_BANK <", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankLessThanOrEqualTo(String value) {
            addCriterion("BILL_ACCOUNT_BANK <=", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankLike(String value) {
            addCriterion("BILL_ACCOUNT_BANK like", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankNotLike(String value) {
            addCriterion("BILL_ACCOUNT_BANK not like", value, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankIn(List<String> values) {
            addCriterion("BILL_ACCOUNT_BANK in", values, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankNotIn(List<String> values) {
            addCriterion("BILL_ACCOUNT_BANK not in", values, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankBetween(String value1, String value2) {
            addCriterion("BILL_ACCOUNT_BANK between", value1, value2, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAccountBankNotBetween(String value1, String value2) {
            addCriterion("BILL_ACCOUNT_BANK not between", value1, value2, "billAccountBank");
            return (Criteria) this;
        }

        public Criteria andBillAddressIsNull() {
            addCriterion("BILL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBillAddressIsNotNull() {
            addCriterion("BILL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBillAddressEqualTo(String value) {
            addCriterion("BILL_ADDRESS =", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotEqualTo(String value) {
            addCriterion("BILL_ADDRESS <>", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressGreaterThan(String value) {
            addCriterion("BILL_ADDRESS >", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_ADDRESS >=", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressLessThan(String value) {
            addCriterion("BILL_ADDRESS <", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressLessThanOrEqualTo(String value) {
            addCriterion("BILL_ADDRESS <=", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressLike(String value) {
            addCriterion("BILL_ADDRESS like", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotLike(String value) {
            addCriterion("BILL_ADDRESS not like", value, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressIn(List<String> values) {
            addCriterion("BILL_ADDRESS in", values, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotIn(List<String> values) {
            addCriterion("BILL_ADDRESS not in", values, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressBetween(String value1, String value2) {
            addCriterion("BILL_ADDRESS between", value1, value2, "billAddress");
            return (Criteria) this;
        }

        public Criteria andBillAddressNotBetween(String value1, String value2) {
            addCriterion("BILL_ADDRESS not between", value1, value2, "billAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeIsNull() {
            addCriterion("RECEIVE_ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeIsNotNull() {
            addCriterion("RECEIVE_ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeEqualTo(String value) {
            addCriterion("RECEIVE_ZIP_CODE =", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeNotEqualTo(String value) {
            addCriterion("RECEIVE_ZIP_CODE <>", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeGreaterThan(String value) {
            addCriterion("RECEIVE_ZIP_CODE >", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ZIP_CODE >=", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeLessThan(String value) {
            addCriterion("RECEIVE_ZIP_CODE <", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ZIP_CODE <=", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeLike(String value) {
            addCriterion("RECEIVE_ZIP_CODE like", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeNotLike(String value) {
            addCriterion("RECEIVE_ZIP_CODE not like", value, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeIn(List<String> values) {
            addCriterion("RECEIVE_ZIP_CODE in", values, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeNotIn(List<String> values) {
            addCriterion("RECEIVE_ZIP_CODE not in", values, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeBetween(String value1, String value2) {
            addCriterion("RECEIVE_ZIP_CODE between", value1, value2, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveZipCodeNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_ZIP_CODE not between", value1, value2, "receiveZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("RECEIVE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("RECEIVE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("RECEIVE_ADDRESS >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("RECEIVE_ADDRESS <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("RECEIVE_ADDRESS like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("RECEIVE_ADDRESS not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("RECEIVE_ADDRESS in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("RECEIVE_ADDRESS not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("RECEIVE_ADDRESS between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_ADDRESS not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationIsNull() {
            addCriterion("COMPANY_TRAIN_INFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationIsNotNull() {
            addCriterion("COMPANY_TRAIN_INFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationEqualTo(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION =", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationNotEqualTo(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION <>", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationGreaterThan(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION >", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION >=", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationLessThan(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION <", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION <=", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationLike(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION like", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationNotLike(String value) {
            addCriterion("COMPANY_TRAIN_INFORMATION not like", value, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationIn(List<String> values) {
            addCriterion("COMPANY_TRAIN_INFORMATION in", values, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationNotIn(List<String> values) {
            addCriterion("COMPANY_TRAIN_INFORMATION not in", values, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationBetween(String value1, String value2) {
            addCriterion("COMPANY_TRAIN_INFORMATION between", value1, value2, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyTrainInformationNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TRAIN_INFORMATION not between", value1, value2, "companyTrainInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeIsNull() {
            addCriterion("COMPANY_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeIsNotNull() {
            addCriterion("COMPANY_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeEqualTo(Short value) {
            addCriterion("COMPANY_ATTRIBUTE =", value, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeNotEqualTo(Short value) {
            addCriterion("COMPANY_ATTRIBUTE <>", value, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeGreaterThan(Short value) {
            addCriterion("COMPANY_ATTRIBUTE >", value, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeGreaterThanOrEqualTo(Short value) {
            addCriterion("COMPANY_ATTRIBUTE >=", value, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeLessThan(Short value) {
            addCriterion("COMPANY_ATTRIBUTE <", value, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeLessThanOrEqualTo(Short value) {
            addCriterion("COMPANY_ATTRIBUTE <=", value, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeIn(List<Short> values) {
            addCriterion("COMPANY_ATTRIBUTE in", values, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeNotIn(List<Short> values) {
            addCriterion("COMPANY_ATTRIBUTE not in", values, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeBetween(Short value1, Short value2) {
            addCriterion("COMPANY_ATTRIBUTE between", value1, value2, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyAttributeNotBetween(Short value1, Short value2) {
            addCriterion("COMPANY_ATTRIBUTE not between", value1, value2, "companyAttribute");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesIsNull() {
            addCriterion("COMPANY_PROPERTIES is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesIsNotNull() {
            addCriterion("COMPANY_PROPERTIES is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesEqualTo(Short value) {
            addCriterion("COMPANY_PROPERTIES =", value, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesNotEqualTo(Short value) {
            addCriterion("COMPANY_PROPERTIES <>", value, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesGreaterThan(Short value) {
            addCriterion("COMPANY_PROPERTIES >", value, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesGreaterThanOrEqualTo(Short value) {
            addCriterion("COMPANY_PROPERTIES >=", value, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesLessThan(Short value) {
            addCriterion("COMPANY_PROPERTIES <", value, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesLessThanOrEqualTo(Short value) {
            addCriterion("COMPANY_PROPERTIES <=", value, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesIn(List<Short> values) {
            addCriterion("COMPANY_PROPERTIES in", values, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesNotIn(List<Short> values) {
            addCriterion("COMPANY_PROPERTIES not in", values, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesBetween(Short value1, Short value2) {
            addCriterion("COMPANY_PROPERTIES between", value1, value2, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andCompanyPropertiesNotBetween(Short value1, Short value2) {
            addCriterion("COMPANY_PROPERTIES not between", value1, value2, "companyProperties");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdIsNull() {
            addCriterion("PARENT_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdIsNotNull() {
            addCriterion("PARENT_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdEqualTo(Integer value) {
            addCriterion("PARENT_DEPARTMENT_ID =", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_DEPARTMENT_ID <>", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdGreaterThan(Integer value) {
            addCriterion("PARENT_DEPARTMENT_ID >", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_DEPARTMENT_ID >=", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdLessThan(Integer value) {
            addCriterion("PARENT_DEPARTMENT_ID <", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_DEPARTMENT_ID <=", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdIn(List<Integer> values) {
            addCriterion("PARENT_DEPARTMENT_ID in", values, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_DEPARTMENT_ID not in", values, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_DEPARTMENT_ID between", value1, value2, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_DEPARTMENT_ID not between", value1, value2, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidIsNull() {
            addCriterion("CHANGE_IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidIsNotNull() {
            addCriterion("CHANGE_IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidEqualTo(Short value) {
            addCriterion("CHANGE_IS_VALID =", value, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidNotEqualTo(Short value) {
            addCriterion("CHANGE_IS_VALID <>", value, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidGreaterThan(Short value) {
            addCriterion("CHANGE_IS_VALID >", value, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidGreaterThanOrEqualTo(Short value) {
            addCriterion("CHANGE_IS_VALID >=", value, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidLessThan(Short value) {
            addCriterion("CHANGE_IS_VALID <", value, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidLessThanOrEqualTo(Short value) {
            addCriterion("CHANGE_IS_VALID <=", value, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidIn(List<Short> values) {
            addCriterion("CHANGE_IS_VALID in", values, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidNotIn(List<Short> values) {
            addCriterion("CHANGE_IS_VALID not in", values, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidBetween(Short value1, Short value2) {
            addCriterion("CHANGE_IS_VALID between", value1, value2, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andChangeIsValidNotBetween(Short value1, Short value2) {
            addCriterion("CHANGE_IS_VALID not between", value1, value2, "changeIsValid");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIsNull() {
            addCriterion("ORG_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIsNotNull() {
            addCriterion("ORG_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME =", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME <>", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThan(String value) {
            addCriterion("ORG_SHORT_NAME >", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME >=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThan(String value) {
            addCriterion("ORG_SHORT_NAME <", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME <=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLike(String value) {
            addCriterion("ORG_SHORT_NAME like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotLike(String value) {
            addCriterion("ORG_SHORT_NAME not like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME not in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME between", value1, value2, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME not between", value1, value2, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andIleafIsNull() {
            addCriterion("ILEAF is null");
            return (Criteria) this;
        }

        public Criteria andIleafIsNotNull() {
            addCriterion("ILEAF is not null");
            return (Criteria) this;
        }

        public Criteria andIleafEqualTo(Short value) {
            addCriterion("ILEAF =", value, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafNotEqualTo(Short value) {
            addCriterion("ILEAF <>", value, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafGreaterThan(Short value) {
            addCriterion("ILEAF >", value, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafGreaterThanOrEqualTo(Short value) {
            addCriterion("ILEAF >=", value, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafLessThan(Short value) {
            addCriterion("ILEAF <", value, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafLessThanOrEqualTo(Short value) {
            addCriterion("ILEAF <=", value, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafIn(List<Short> values) {
            addCriterion("ILEAF in", values, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafNotIn(List<Short> values) {
            addCriterion("ILEAF not in", values, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafBetween(Short value1, Short value2) {
            addCriterion("ILEAF between", value1, value2, "ileaf");
            return (Criteria) this;
        }

        public Criteria andIleafNotBetween(Short value1, Short value2) {
            addCriterion("ILEAF not between", value1, value2, "ileaf");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andFwdwidIsNull() {
            addCriterion("FWDWID is null");
            return (Criteria) this;
        }

        public Criteria andFwdwidIsNotNull() {
            addCriterion("FWDWID is not null");
            return (Criteria) this;
        }

        public Criteria andFwdwidEqualTo(Integer value) {
            addCriterion("FWDWID =", value, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidNotEqualTo(Integer value) {
            addCriterion("FWDWID <>", value, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidGreaterThan(Integer value) {
            addCriterion("FWDWID >", value, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FWDWID >=", value, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidLessThan(Integer value) {
            addCriterion("FWDWID <", value, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidLessThanOrEqualTo(Integer value) {
            addCriterion("FWDWID <=", value, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidIn(List<Integer> values) {
            addCriterion("FWDWID in", values, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidNotIn(List<Integer> values) {
            addCriterion("FWDWID not in", values, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidBetween(Integer value1, Integer value2) {
            addCriterion("FWDWID between", value1, value2, "fwdwid");
            return (Criteria) this;
        }

        public Criteria andFwdwidNotBetween(Integer value1, Integer value2) {
            addCriterion("FWDWID not between", value1, value2, "fwdwid");
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

        public Criteria andSelfZoneIdIsNull() {
            addCriterion("SELF_ZONE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdIsNotNull() {
            addCriterion("SELF_ZONE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdEqualTo(Integer value) {
            addCriterion("SELF_ZONE_ID =", value, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdNotEqualTo(Integer value) {
            addCriterion("SELF_ZONE_ID <>", value, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdGreaterThan(Integer value) {
            addCriterion("SELF_ZONE_ID >", value, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SELF_ZONE_ID >=", value, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdLessThan(Integer value) {
            addCriterion("SELF_ZONE_ID <", value, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdLessThanOrEqualTo(Integer value) {
            addCriterion("SELF_ZONE_ID <=", value, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdIn(List<Integer> values) {
            addCriterion("SELF_ZONE_ID in", values, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdNotIn(List<Integer> values) {
            addCriterion("SELF_ZONE_ID not in", values, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdBetween(Integer value1, Integer value2) {
            addCriterion("SELF_ZONE_ID between", value1, value2, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andSelfZoneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SELF_ZONE_ID not between", value1, value2, "selfZoneId");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgIsNull() {
            addCriterion("SHOP_ADD_ORG is null");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgIsNotNull() {
            addCriterion("SHOP_ADD_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgEqualTo(String value) {
            addCriterion("SHOP_ADD_ORG =", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgNotEqualTo(String value) {
            addCriterion("SHOP_ADD_ORG <>", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgGreaterThan(String value) {
            addCriterion("SHOP_ADD_ORG >", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ADD_ORG >=", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgLessThan(String value) {
            addCriterion("SHOP_ADD_ORG <", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ADD_ORG <=", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgLike(String value) {
            addCriterion("SHOP_ADD_ORG like", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgNotLike(String value) {
            addCriterion("SHOP_ADD_ORG not like", value, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgIn(List<String> values) {
            addCriterion("SHOP_ADD_ORG in", values, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgNotIn(List<String> values) {
            addCriterion("SHOP_ADD_ORG not in", values, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgBetween(String value1, String value2) {
            addCriterion("SHOP_ADD_ORG between", value1, value2, "shopAddOrg");
            return (Criteria) this;
        }

        public Criteria andShopAddOrgNotBetween(String value1, String value2) {
            addCriterion("SHOP_ADD_ORG not between", value1, value2, "shopAddOrg");
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