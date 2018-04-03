package com.aisino.db2.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VerifiedInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VerifiedInvoiceExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("Number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("Number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("Number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("Device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("Device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("Device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("Device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("Device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("Device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("Device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("Device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("Device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("Device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("Device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("Device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("Device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("Device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNull() {
            addCriterion("CheckCode is null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNotNull() {
            addCriterion("CheckCode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeEqualTo(String value) {
            addCriterion("CheckCode =", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotEqualTo(String value) {
            addCriterion("CheckCode <>", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThan(String value) {
            addCriterion("CheckCode >", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CheckCode >=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThan(String value) {
            addCriterion("CheckCode <", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThanOrEqualTo(String value) {
            addCriterion("CheckCode <=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLike(String value) {
            addCriterion("CheckCode like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotLike(String value) {
            addCriterion("CheckCode not like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIn(List<String> values) {
            addCriterion("CheckCode in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotIn(List<String> values) {
            addCriterion("CheckCode not in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeBetween(String value1, String value2) {
            addCriterion("CheckCode between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotBetween(String value1, String value2) {
            addCriterion("CheckCode not between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNull() {
            addCriterion("BuyerName is null");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNotNull() {
            addCriterion("BuyerName is not null");
            return (Criteria) this;
        }

        public Criteria andBuyernameEqualTo(String value) {
            addCriterion("BuyerName =", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotEqualTo(String value) {
            addCriterion("BuyerName <>", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThan(String value) {
            addCriterion("BuyerName >", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThanOrEqualTo(String value) {
            addCriterion("BuyerName >=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThan(String value) {
            addCriterion("BuyerName <", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThanOrEqualTo(String value) {
            addCriterion("BuyerName <=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLike(String value) {
            addCriterion("BuyerName like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotLike(String value) {
            addCriterion("BuyerName not like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameIn(List<String> values) {
            addCriterion("BuyerName in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotIn(List<String> values) {
            addCriterion("BuyerName not in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameBetween(String value1, String value2) {
            addCriterion("BuyerName between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotBetween(String value1, String value2) {
            addCriterion("BuyerName not between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeIsNull() {
            addCriterion("BuyerTaxCode is null");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeIsNotNull() {
            addCriterion("BuyerTaxCode is not null");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeEqualTo(String value) {
            addCriterion("BuyerTaxCode =", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeNotEqualTo(String value) {
            addCriterion("BuyerTaxCode <>", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeGreaterThan(String value) {
            addCriterion("BuyerTaxCode >", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BuyerTaxCode >=", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeLessThan(String value) {
            addCriterion("BuyerTaxCode <", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeLessThanOrEqualTo(String value) {
            addCriterion("BuyerTaxCode <=", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeLike(String value) {
            addCriterion("BuyerTaxCode like", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeNotLike(String value) {
            addCriterion("BuyerTaxCode not like", value, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeIn(List<String> values) {
            addCriterion("BuyerTaxCode in", values, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeNotIn(List<String> values) {
            addCriterion("BuyerTaxCode not in", values, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeBetween(String value1, String value2) {
            addCriterion("BuyerTaxCode between", value1, value2, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyertaxcodeNotBetween(String value1, String value2) {
            addCriterion("BuyerTaxCode not between", value1, value2, "buyertaxcode");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneIsNull() {
            addCriterion("BuyerAddressPhone is null");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneIsNotNull() {
            addCriterion("BuyerAddressPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneEqualTo(String value) {
            addCriterion("BuyerAddressPhone =", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneNotEqualTo(String value) {
            addCriterion("BuyerAddressPhone <>", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneGreaterThan(String value) {
            addCriterion("BuyerAddressPhone >", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneGreaterThanOrEqualTo(String value) {
            addCriterion("BuyerAddressPhone >=", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneLessThan(String value) {
            addCriterion("BuyerAddressPhone <", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneLessThanOrEqualTo(String value) {
            addCriterion("BuyerAddressPhone <=", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneLike(String value) {
            addCriterion("BuyerAddressPhone like", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneNotLike(String value) {
            addCriterion("BuyerAddressPhone not like", value, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneIn(List<String> values) {
            addCriterion("BuyerAddressPhone in", values, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneNotIn(List<String> values) {
            addCriterion("BuyerAddressPhone not in", values, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneBetween(String value1, String value2) {
            addCriterion("BuyerAddressPhone between", value1, value2, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyeraddressphoneNotBetween(String value1, String value2) {
            addCriterion("BuyerAddressPhone not between", value1, value2, "buyeraddressphone");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountIsNull() {
            addCriterion("BuyerBankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountIsNotNull() {
            addCriterion("BuyerBankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountEqualTo(String value) {
            addCriterion("BuyerBankAccount =", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountNotEqualTo(String value) {
            addCriterion("BuyerBankAccount <>", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountGreaterThan(String value) {
            addCriterion("BuyerBankAccount >", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("BuyerBankAccount >=", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountLessThan(String value) {
            addCriterion("BuyerBankAccount <", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountLessThanOrEqualTo(String value) {
            addCriterion("BuyerBankAccount <=", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountLike(String value) {
            addCriterion("BuyerBankAccount like", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountNotLike(String value) {
            addCriterion("BuyerBankAccount not like", value, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountIn(List<String> values) {
            addCriterion("BuyerBankAccount in", values, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountNotIn(List<String> values) {
            addCriterion("BuyerBankAccount not in", values, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountBetween(String value1, String value2) {
            addCriterion("BuyerBankAccount between", value1, value2, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andBuyerbankaccountNotBetween(String value1, String value2) {
            addCriterion("BuyerBankAccount not between", value1, value2, "buyerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellernameIsNull() {
            addCriterion("SellerName is null");
            return (Criteria) this;
        }

        public Criteria andSellernameIsNotNull() {
            addCriterion("SellerName is not null");
            return (Criteria) this;
        }

        public Criteria andSellernameEqualTo(String value) {
            addCriterion("SellerName =", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotEqualTo(String value) {
            addCriterion("SellerName <>", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThan(String value) {
            addCriterion("SellerName >", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThanOrEqualTo(String value) {
            addCriterion("SellerName >=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThan(String value) {
            addCriterion("SellerName <", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThanOrEqualTo(String value) {
            addCriterion("SellerName <=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLike(String value) {
            addCriterion("SellerName like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotLike(String value) {
            addCriterion("SellerName not like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameIn(List<String> values) {
            addCriterion("SellerName in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotIn(List<String> values) {
            addCriterion("SellerName not in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameBetween(String value1, String value2) {
            addCriterion("SellerName between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotBetween(String value1, String value2) {
            addCriterion("SellerName not between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeIsNull() {
            addCriterion("SellerTaxCode is null");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeIsNotNull() {
            addCriterion("SellerTaxCode is not null");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeEqualTo(String value) {
            addCriterion("SellerTaxCode =", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeNotEqualTo(String value) {
            addCriterion("SellerTaxCode <>", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeGreaterThan(String value) {
            addCriterion("SellerTaxCode >", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SellerTaxCode >=", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeLessThan(String value) {
            addCriterion("SellerTaxCode <", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeLessThanOrEqualTo(String value) {
            addCriterion("SellerTaxCode <=", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeLike(String value) {
            addCriterion("SellerTaxCode like", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeNotLike(String value) {
            addCriterion("SellerTaxCode not like", value, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeIn(List<String> values) {
            addCriterion("SellerTaxCode in", values, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeNotIn(List<String> values) {
            addCriterion("SellerTaxCode not in", values, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeBetween(String value1, String value2) {
            addCriterion("SellerTaxCode between", value1, value2, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSellertaxcodeNotBetween(String value1, String value2) {
            addCriterion("SellerTaxCode not between", value1, value2, "sellertaxcode");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneIsNull() {
            addCriterion("SellerAddressPhone is null");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneIsNotNull() {
            addCriterion("SellerAddressPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneEqualTo(String value) {
            addCriterion("SellerAddressPhone =", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneNotEqualTo(String value) {
            addCriterion("SellerAddressPhone <>", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneGreaterThan(String value) {
            addCriterion("SellerAddressPhone >", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SellerAddressPhone >=", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneLessThan(String value) {
            addCriterion("SellerAddressPhone <", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneLessThanOrEqualTo(String value) {
            addCriterion("SellerAddressPhone <=", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneLike(String value) {
            addCriterion("SellerAddressPhone like", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneNotLike(String value) {
            addCriterion("SellerAddressPhone not like", value, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneIn(List<String> values) {
            addCriterion("SellerAddressPhone in", values, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneNotIn(List<String> values) {
            addCriterion("SellerAddressPhone not in", values, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneBetween(String value1, String value2) {
            addCriterion("SellerAddressPhone between", value1, value2, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSelleraddressphoneNotBetween(String value1, String value2) {
            addCriterion("SellerAddressPhone not between", value1, value2, "selleraddressphone");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountIsNull() {
            addCriterion("SellerBankAccount is null");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountIsNotNull() {
            addCriterion("SellerBankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountEqualTo(String value) {
            addCriterion("SellerBankAccount =", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountNotEqualTo(String value) {
            addCriterion("SellerBankAccount <>", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountGreaterThan(String value) {
            addCriterion("SellerBankAccount >", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("SellerBankAccount >=", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountLessThan(String value) {
            addCriterion("SellerBankAccount <", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountLessThanOrEqualTo(String value) {
            addCriterion("SellerBankAccount <=", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountLike(String value) {
            addCriterion("SellerBankAccount like", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountNotLike(String value) {
            addCriterion("SellerBankAccount not like", value, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountIn(List<String> values) {
            addCriterion("SellerBankAccount in", values, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountNotIn(List<String> values) {
            addCriterion("SellerBankAccount not in", values, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountBetween(String value1, String value2) {
            addCriterion("SellerBankAccount between", value1, value2, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andSellerbankaccountNotBetween(String value1, String value2) {
            addCriterion("SellerBankAccount not between", value1, value2, "sellerbankaccount");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("Tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("Tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("Tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("Tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("Tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("Tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("Tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("Tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxIsNull() {
            addCriterion("AmountWithTax is null");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxIsNotNull() {
            addCriterion("AmountWithTax is not null");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxEqualTo(BigDecimal value) {
            addCriterion("AmountWithTax =", value, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxNotEqualTo(BigDecimal value) {
            addCriterion("AmountWithTax <>", value, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxGreaterThan(BigDecimal value) {
            addCriterion("AmountWithTax >", value, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AmountWithTax >=", value, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxLessThan(BigDecimal value) {
            addCriterion("AmountWithTax <", value, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AmountWithTax <=", value, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxIn(List<BigDecimal> values) {
            addCriterion("AmountWithTax in", values, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxNotIn(List<BigDecimal> values) {
            addCriterion("AmountWithTax not in", values, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AmountWithTax between", value1, value2, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andAmountwithtaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AmountWithTax not between", value1, value2, "amountwithtax");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andIscanceledIsNull() {
            addCriterion("IsCanceled is null");
            return (Criteria) this;
        }

        public Criteria andIscanceledIsNotNull() {
            addCriterion("IsCanceled is not null");
            return (Criteria) this;
        }

        public Criteria andIscanceledEqualTo(Boolean value) {
            addCriterion("IsCanceled =", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotEqualTo(Boolean value) {
            addCriterion("IsCanceled <>", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledGreaterThan(Boolean value) {
            addCriterion("IsCanceled >", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsCanceled >=", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledLessThan(Boolean value) {
            addCriterion("IsCanceled <", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledLessThanOrEqualTo(Boolean value) {
            addCriterion("IsCanceled <=", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledIn(List<Boolean> values) {
            addCriterion("IsCanceled in", values, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotIn(List<Boolean> values) {
            addCriterion("IsCanceled not in", values, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCanceled between", value1, value2, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCanceled not between", value1, value2, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIslistaddedIsNull() {
            addCriterion("IsListAdded is null");
            return (Criteria) this;
        }

        public Criteria andIslistaddedIsNotNull() {
            addCriterion("IsListAdded is not null");
            return (Criteria) this;
        }

        public Criteria andIslistaddedEqualTo(Boolean value) {
            addCriterion("IsListAdded =", value, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedNotEqualTo(Boolean value) {
            addCriterion("IsListAdded <>", value, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedGreaterThan(Boolean value) {
            addCriterion("IsListAdded >", value, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsListAdded >=", value, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedLessThan(Boolean value) {
            addCriterion("IsListAdded <", value, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsListAdded <=", value, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedIn(List<Boolean> values) {
            addCriterion("IsListAdded in", values, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedNotIn(List<Boolean> values) {
            addCriterion("IsListAdded not in", values, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsListAdded between", value1, value2, "islistadded");
            return (Criteria) this;
        }

        public Criteria andIslistaddedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsListAdded not between", value1, value2, "islistadded");
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