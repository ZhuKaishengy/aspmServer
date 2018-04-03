package com.aisino.db1.domain;

import java.math.BigDecimal;
import java.util.Date;

public class SysOrg {
    private Integer orgId;

    private String orgName;

    private Integer parentOrgId;

    private Integer unitsLevel;

    private String businessAddress;

    private String communicationAddress;

    private String zipCode;

    private String areaCode;

    private String opretor;

    private String hotline;

    private String fax;

    private String principalTelephone;

    private String principalMobile;

    private String complainTelephone;

    private String url;

    private String email;

    private BigDecimal defaultChargeAmount;

    private Short defaultChargeExpiryRule;

    private String taxId;

    private String registeredFund;

    private Integer enterpriseTypeId;

    private String legalPerson;

    private String headOfUnit;

    private Short serviceVehicles;

    private Short uidvalidity;

    private Integer zoneId;

    private Integer orgTaxDepartmentId;

    private Date foundationDate;

    private Date anticounterfeitingDate;

    private Date creatDate;

    private String fileOfficialSeal;

    private String generalManager;

    private String assistantGeneralManager;

    private String financeManager;

    private String customerServiceManager;

    private String consignee;

    private String business;

    private String firstOpenBadPrincipal;

    private String otherContact;

    private String accountBank;

    private String account;

    private String taxpayerIdentifierNumber;

    private String billTelephone;

    private String billAccountBank;

    private String billAddress;

    private String receiveZipCode;

    private String receiveAddress;

    private String companyTrainInformation;

    private Short companyAttribute;

    private Short companyProperties;

    private Integer parentDepartmentId;

    private Short changeIsValid;

    private String orgShortName;

    private Short ileaf;

    private String code;

    private Integer fwdwid;

    private Short synDataMark;

    private Integer selfZoneId;

    private String shopAddOrg;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Integer getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Integer parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public Integer getUnitsLevel() {
        return unitsLevel;
    }

    public void setUnitsLevel(Integer unitsLevel) {
        this.unitsLevel = unitsLevel;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress == null ? null : businessAddress.trim();
    }

    public String getCommunicationAddress() {
        return communicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        this.communicationAddress = communicationAddress == null ? null : communicationAddress.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getOpretor() {
        return opretor;
    }

    public void setOpretor(String opretor) {
        this.opretor = opretor == null ? null : opretor.trim();
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline == null ? null : hotline.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getPrincipalTelephone() {
        return principalTelephone;
    }

    public void setPrincipalTelephone(String principalTelephone) {
        this.principalTelephone = principalTelephone == null ? null : principalTelephone.trim();
    }

    public String getPrincipalMobile() {
        return principalMobile;
    }

    public void setPrincipalMobile(String principalMobile) {
        this.principalMobile = principalMobile == null ? null : principalMobile.trim();
    }

    public String getComplainTelephone() {
        return complainTelephone;
    }

    public void setComplainTelephone(String complainTelephone) {
        this.complainTelephone = complainTelephone == null ? null : complainTelephone.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getDefaultChargeAmount() {
        return defaultChargeAmount;
    }

    public void setDefaultChargeAmount(BigDecimal defaultChargeAmount) {
        this.defaultChargeAmount = defaultChargeAmount;
    }

    public Short getDefaultChargeExpiryRule() {
        return defaultChargeExpiryRule;
    }

    public void setDefaultChargeExpiryRule(Short defaultChargeExpiryRule) {
        this.defaultChargeExpiryRule = defaultChargeExpiryRule;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId == null ? null : taxId.trim();
    }

    public String getRegisteredFund() {
        return registeredFund;
    }

    public void setRegisteredFund(String registeredFund) {
        this.registeredFund = registeredFund == null ? null : registeredFund.trim();
    }

    public Integer getEnterpriseTypeId() {
        return enterpriseTypeId;
    }

    public void setEnterpriseTypeId(Integer enterpriseTypeId) {
        this.enterpriseTypeId = enterpriseTypeId;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getHeadOfUnit() {
        return headOfUnit;
    }

    public void setHeadOfUnit(String headOfUnit) {
        this.headOfUnit = headOfUnit == null ? null : headOfUnit.trim();
    }

    public Short getServiceVehicles() {
        return serviceVehicles;
    }

    public void setServiceVehicles(Short serviceVehicles) {
        this.serviceVehicles = serviceVehicles;
    }

    public Short getUidvalidity() {
        return uidvalidity;
    }

    public void setUidvalidity(Short uidvalidity) {
        this.uidvalidity = uidvalidity;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getOrgTaxDepartmentId() {
        return orgTaxDepartmentId;
    }

    public void setOrgTaxDepartmentId(Integer orgTaxDepartmentId) {
        this.orgTaxDepartmentId = orgTaxDepartmentId;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Date getAnticounterfeitingDate() {
        return anticounterfeitingDate;
    }

    public void setAnticounterfeitingDate(Date anticounterfeitingDate) {
        this.anticounterfeitingDate = anticounterfeitingDate;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getFileOfficialSeal() {
        return fileOfficialSeal;
    }

    public void setFileOfficialSeal(String fileOfficialSeal) {
        this.fileOfficialSeal = fileOfficialSeal == null ? null : fileOfficialSeal.trim();
    }

    public String getGeneralManager() {
        return generalManager;
    }

    public void setGeneralManager(String generalManager) {
        this.generalManager = generalManager == null ? null : generalManager.trim();
    }

    public String getAssistantGeneralManager() {
        return assistantGeneralManager;
    }

    public void setAssistantGeneralManager(String assistantGeneralManager) {
        this.assistantGeneralManager = assistantGeneralManager == null ? null : assistantGeneralManager.trim();
    }

    public String getFinanceManager() {
        return financeManager;
    }

    public void setFinanceManager(String financeManager) {
        this.financeManager = financeManager == null ? null : financeManager.trim();
    }

    public String getCustomerServiceManager() {
        return customerServiceManager;
    }

    public void setCustomerServiceManager(String customerServiceManager) {
        this.customerServiceManager = customerServiceManager == null ? null : customerServiceManager.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getFirstOpenBadPrincipal() {
        return firstOpenBadPrincipal;
    }

    public void setFirstOpenBadPrincipal(String firstOpenBadPrincipal) {
        this.firstOpenBadPrincipal = firstOpenBadPrincipal == null ? null : firstOpenBadPrincipal.trim();
    }

    public String getOtherContact() {
        return otherContact;
    }

    public void setOtherContact(String otherContact) {
        this.otherContact = otherContact == null ? null : otherContact.trim();
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getTaxpayerIdentifierNumber() {
        return taxpayerIdentifierNumber;
    }

    public void setTaxpayerIdentifierNumber(String taxpayerIdentifierNumber) {
        this.taxpayerIdentifierNumber = taxpayerIdentifierNumber == null ? null : taxpayerIdentifierNumber.trim();
    }

    public String getBillTelephone() {
        return billTelephone;
    }

    public void setBillTelephone(String billTelephone) {
        this.billTelephone = billTelephone == null ? null : billTelephone.trim();
    }

    public String getBillAccountBank() {
        return billAccountBank;
    }

    public void setBillAccountBank(String billAccountBank) {
        this.billAccountBank = billAccountBank == null ? null : billAccountBank.trim();
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress == null ? null : billAddress.trim();
    }

    public String getReceiveZipCode() {
        return receiveZipCode;
    }

    public void setReceiveZipCode(String receiveZipCode) {
        this.receiveZipCode = receiveZipCode == null ? null : receiveZipCode.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public String getCompanyTrainInformation() {
        return companyTrainInformation;
    }

    public void setCompanyTrainInformation(String companyTrainInformation) {
        this.companyTrainInformation = companyTrainInformation == null ? null : companyTrainInformation.trim();
    }

    public Short getCompanyAttribute() {
        return companyAttribute;
    }

    public void setCompanyAttribute(Short companyAttribute) {
        this.companyAttribute = companyAttribute;
    }

    public Short getCompanyProperties() {
        return companyProperties;
    }

    public void setCompanyProperties(Short companyProperties) {
        this.companyProperties = companyProperties;
    }

    public Integer getParentDepartmentId() {
        return parentDepartmentId;
    }

    public void setParentDepartmentId(Integer parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public Short getChangeIsValid() {
        return changeIsValid;
    }

    public void setChangeIsValid(Short changeIsValid) {
        this.changeIsValid = changeIsValid;
    }

    public String getOrgShortName() {
        return orgShortName;
    }

    public void setOrgShortName(String orgShortName) {
        this.orgShortName = orgShortName == null ? null : orgShortName.trim();
    }

    public Short getIleaf() {
        return ileaf;
    }

    public void setIleaf(Short ileaf) {
        this.ileaf = ileaf;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getFwdwid() {
        return fwdwid;
    }

    public void setFwdwid(Integer fwdwid) {
        this.fwdwid = fwdwid;
    }

    public Short getSynDataMark() {
        return synDataMark;
    }

    public void setSynDataMark(Short synDataMark) {
        this.synDataMark = synDataMark;
    }

    public Integer getSelfZoneId() {
        return selfZoneId;
    }

    public void setSelfZoneId(Integer selfZoneId) {
        this.selfZoneId = selfZoneId;
    }

    public String getShopAddOrg() {
        return shopAddOrg;
    }

    public void setShopAddOrg(String shopAddOrg) {
        this.shopAddOrg = shopAddOrg == null ? null : shopAddOrg.trim();
    }
}