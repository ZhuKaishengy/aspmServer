package com.aisino.db2.domain;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserdescIsNull() {
            addCriterion("userdesc is null");
            return (Criteria) this;
        }

        public Criteria andUserdescIsNotNull() {
            addCriterion("userdesc is not null");
            return (Criteria) this;
        }

        public Criteria andUserdescEqualTo(String value) {
            addCriterion("userdesc =", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescNotEqualTo(String value) {
            addCriterion("userdesc <>", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescGreaterThan(String value) {
            addCriterion("userdesc >", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescGreaterThanOrEqualTo(String value) {
            addCriterion("userdesc >=", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescLessThan(String value) {
            addCriterion("userdesc <", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescLessThanOrEqualTo(String value) {
            addCriterion("userdesc <=", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescLike(String value) {
            addCriterion("userdesc like", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescNotLike(String value) {
            addCriterion("userdesc not like", value, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescIn(List<String> values) {
            addCriterion("userdesc in", values, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescNotIn(List<String> values) {
            addCriterion("userdesc not in", values, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescBetween(String value1, String value2) {
            addCriterion("userdesc between", value1, value2, "userdesc");
            return (Criteria) this;
        }

        public Criteria andUserdescNotBetween(String value1, String value2) {
            addCriterion("userdesc not between", value1, value2, "userdesc");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andCorpIsNull() {
            addCriterion("corp is null");
            return (Criteria) this;
        }

        public Criteria andCorpIsNotNull() {
            addCriterion("corp is not null");
            return (Criteria) this;
        }

        public Criteria andCorpEqualTo(String value) {
            addCriterion("corp =", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpNotEqualTo(String value) {
            addCriterion("corp <>", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpGreaterThan(String value) {
            addCriterion("corp >", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpGreaterThanOrEqualTo(String value) {
            addCriterion("corp >=", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpLessThan(String value) {
            addCriterion("corp <", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpLessThanOrEqualTo(String value) {
            addCriterion("corp <=", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpLike(String value) {
            addCriterion("corp like", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpNotLike(String value) {
            addCriterion("corp not like", value, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpIn(List<String> values) {
            addCriterion("corp in", values, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpNotIn(List<String> values) {
            addCriterion("corp not in", values, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpBetween(String value1, String value2) {
            addCriterion("corp between", value1, value2, "corp");
            return (Criteria) this;
        }

        public Criteria andCorpNotBetween(String value1, String value2) {
            addCriterion("corp not between", value1, value2, "corp");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalcode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalcode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalcode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalcode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalcode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalcode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalcode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalcode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalcode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("postalcode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("postalcode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalcode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalcode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createuser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createuser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("updatetime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("updatetime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("updateuser is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("updateuser =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("updateuser <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("updateuser >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("updateuser >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("updateuser <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("updateuser <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("updateuser like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("updateuser not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("updateuser in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("updateuser not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("updateuser between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("updateuser not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("valid like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("valid not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andCzryDmIsNull() {
            addCriterion("czry_dm is null");
            return (Criteria) this;
        }

        public Criteria andCzryDmIsNotNull() {
            addCriterion("czry_dm is not null");
            return (Criteria) this;
        }

        public Criteria andCzryDmEqualTo(String value) {
            addCriterion("czry_dm =", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmNotEqualTo(String value) {
            addCriterion("czry_dm <>", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmGreaterThan(String value) {
            addCriterion("czry_dm >", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmGreaterThanOrEqualTo(String value) {
            addCriterion("czry_dm >=", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmLessThan(String value) {
            addCriterion("czry_dm <", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmLessThanOrEqualTo(String value) {
            addCriterion("czry_dm <=", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmLike(String value) {
            addCriterion("czry_dm like", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmNotLike(String value) {
            addCriterion("czry_dm not like", value, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmIn(List<String> values) {
            addCriterion("czry_dm in", values, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmNotIn(List<String> values) {
            addCriterion("czry_dm not in", values, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmBetween(String value1, String value2) {
            addCriterion("czry_dm between", value1, value2, "czryDm");
            return (Criteria) this;
        }

        public Criteria andCzryDmNotBetween(String value1, String value2) {
            addCriterion("czry_dm not between", value1, value2, "czryDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmIsNull() {
            addCriterion("swjg_dm is null");
            return (Criteria) this;
        }

        public Criteria andSwjgDmIsNotNull() {
            addCriterion("swjg_dm is not null");
            return (Criteria) this;
        }

        public Criteria andSwjgDmEqualTo(String value) {
            addCriterion("swjg_dm =", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmNotEqualTo(String value) {
            addCriterion("swjg_dm <>", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmGreaterThan(String value) {
            addCriterion("swjg_dm >", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmGreaterThanOrEqualTo(String value) {
            addCriterion("swjg_dm >=", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmLessThan(String value) {
            addCriterion("swjg_dm <", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmLessThanOrEqualTo(String value) {
            addCriterion("swjg_dm <=", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmLike(String value) {
            addCriterion("swjg_dm like", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmNotLike(String value) {
            addCriterion("swjg_dm not like", value, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmIn(List<String> values) {
            addCriterion("swjg_dm in", values, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmNotIn(List<String> values) {
            addCriterion("swjg_dm not in", values, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmBetween(String value1, String value2) {
            addCriterion("swjg_dm between", value1, value2, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andSwjgDmNotBetween(String value1, String value2) {
            addCriterion("swjg_dm not between", value1, value2, "swjgDm");
            return (Criteria) this;
        }

        public Criteria andCzryMcIsNull() {
            addCriterion("czry_mc is null");
            return (Criteria) this;
        }

        public Criteria andCzryMcIsNotNull() {
            addCriterion("czry_mc is not null");
            return (Criteria) this;
        }

        public Criteria andCzryMcEqualTo(String value) {
            addCriterion("czry_mc =", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcNotEqualTo(String value) {
            addCriterion("czry_mc <>", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcGreaterThan(String value) {
            addCriterion("czry_mc >", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcGreaterThanOrEqualTo(String value) {
            addCriterion("czry_mc >=", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcLessThan(String value) {
            addCriterion("czry_mc <", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcLessThanOrEqualTo(String value) {
            addCriterion("czry_mc <=", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcLike(String value) {
            addCriterion("czry_mc like", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcNotLike(String value) {
            addCriterion("czry_mc not like", value, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcIn(List<String> values) {
            addCriterion("czry_mc in", values, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcNotIn(List<String> values) {
            addCriterion("czry_mc not in", values, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcBetween(String value1, String value2) {
            addCriterion("czry_mc between", value1, value2, "czryMc");
            return (Criteria) this;
        }

        public Criteria andCzryMcNotBetween(String value1, String value2) {
            addCriterion("czry_mc not between", value1, value2, "czryMc");
            return (Criteria) this;
        }

        public Criteria andSwryDmIsNull() {
            addCriterion("swry_dm is null");
            return (Criteria) this;
        }

        public Criteria andSwryDmIsNotNull() {
            addCriterion("swry_dm is not null");
            return (Criteria) this;
        }

        public Criteria andSwryDmEqualTo(String value) {
            addCriterion("swry_dm =", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmNotEqualTo(String value) {
            addCriterion("swry_dm <>", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmGreaterThan(String value) {
            addCriterion("swry_dm >", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmGreaterThanOrEqualTo(String value) {
            addCriterion("swry_dm >=", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmLessThan(String value) {
            addCriterion("swry_dm <", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmLessThanOrEqualTo(String value) {
            addCriterion("swry_dm <=", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmLike(String value) {
            addCriterion("swry_dm like", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmNotLike(String value) {
            addCriterion("swry_dm not like", value, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmIn(List<String> values) {
            addCriterion("swry_dm in", values, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmNotIn(List<String> values) {
            addCriterion("swry_dm not in", values, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmBetween(String value1, String value2) {
            addCriterion("swry_dm between", value1, value2, "swryDm");
            return (Criteria) this;
        }

        public Criteria andSwryDmNotBetween(String value1, String value2) {
            addCriterion("swry_dm not between", value1, value2, "swryDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmIsNull() {
            addCriterion("qx_swjg_dm is null");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmIsNotNull() {
            addCriterion("qx_swjg_dm is not null");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmEqualTo(String value) {
            addCriterion("qx_swjg_dm =", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmNotEqualTo(String value) {
            addCriterion("qx_swjg_dm <>", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmGreaterThan(String value) {
            addCriterion("qx_swjg_dm >", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmGreaterThanOrEqualTo(String value) {
            addCriterion("qx_swjg_dm >=", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmLessThan(String value) {
            addCriterion("qx_swjg_dm <", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmLessThanOrEqualTo(String value) {
            addCriterion("qx_swjg_dm <=", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmLike(String value) {
            addCriterion("qx_swjg_dm like", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmNotLike(String value) {
            addCriterion("qx_swjg_dm not like", value, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmIn(List<String> values) {
            addCriterion("qx_swjg_dm in", values, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmNotIn(List<String> values) {
            addCriterion("qx_swjg_dm not in", values, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmBetween(String value1, String value2) {
            addCriterion("qx_swjg_dm between", value1, value2, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andQxSwjgDmNotBetween(String value1, String value2) {
            addCriterion("qx_swjg_dm not between", value1, value2, "qxSwjgDm");
            return (Criteria) this;
        }

        public Criteria andXybzIsNull() {
            addCriterion("xybz is null");
            return (Criteria) this;
        }

        public Criteria andXybzIsNotNull() {
            addCriterion("xybz is not null");
            return (Criteria) this;
        }

        public Criteria andXybzEqualTo(String value) {
            addCriterion("xybz =", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzNotEqualTo(String value) {
            addCriterion("xybz <>", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzGreaterThan(String value) {
            addCriterion("xybz >", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzGreaterThanOrEqualTo(String value) {
            addCriterion("xybz >=", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzLessThan(String value) {
            addCriterion("xybz <", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzLessThanOrEqualTo(String value) {
            addCriterion("xybz <=", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzLike(String value) {
            addCriterion("xybz like", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzNotLike(String value) {
            addCriterion("xybz not like", value, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzIn(List<String> values) {
            addCriterion("xybz in", values, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzNotIn(List<String> values) {
            addCriterion("xybz not in", values, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzBetween(String value1, String value2) {
            addCriterion("xybz between", value1, value2, "xybz");
            return (Criteria) this;
        }

        public Criteria andXybzNotBetween(String value1, String value2) {
            addCriterion("xybz not between", value1, value2, "xybz");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNull() {
            addCriterion("yxbz is null");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNotNull() {
            addCriterion("yxbz is not null");
            return (Criteria) this;
        }

        public Criteria andYxbzEqualTo(String value) {
            addCriterion("yxbz =", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotEqualTo(String value) {
            addCriterion("yxbz <>", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThan(String value) {
            addCriterion("yxbz >", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThanOrEqualTo(String value) {
            addCriterion("yxbz >=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThan(String value) {
            addCriterion("yxbz <", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThanOrEqualTo(String value) {
            addCriterion("yxbz <=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLike(String value) {
            addCriterion("yxbz like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotLike(String value) {
            addCriterion("yxbz not like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzIn(List<String> values) {
            addCriterion("yxbz in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotIn(List<String> values) {
            addCriterion("yxbz not in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzBetween(String value1, String value2) {
            addCriterion("yxbz between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotBetween(String value1, String value2) {
            addCriterion("yxbz not between", value1, value2, "yxbz");
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