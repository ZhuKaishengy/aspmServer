package com.aisino.db1.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    private Long orgCustomerId;

    private Integer custClassId;

    private String custTaxCode;

    private Integer taxBureauId;

    private Integer substationId;

    private Integer servicePersonalId;

    private Integer orgId;

    private Date createDate;

    private String notes;

    private Date updateDate;

    private String custName;

    private String url;

    private String email;

    private Integer regionId;

    private Integer enterpriseTypeId;

    private Integer vocationId;

    private String businessScope;

    private String accountBank;

    private String bankAccount;

    private String legalPerson;

    private Date registerDate;

    private Short isMissing;

    private Short isValid;

    private Integer createrId;

    private Integer updateOperatorId;

    private String shortcut;

    private Long customerId;

    private Integer subSecurityBureauId;

    private String starLevelId;

    private String custLevelId;

    private BigDecimal registeredFund;

    private Integer personCount;

    private Integer accountantCount;

    private String custScaleId;

    private Integer computerCount;

    private String networkTypeId;

    private String creditLevelId;

    private BigDecimal creditLimit;

    private String custCode;

    private String generalManager;

    private String locationTypeId;

    private Integer trainingCount;

    private Integer securityPersonCount;

    private Integer roomCount;

    private Long parentOrgCustomerId;

    private String vocationForceId;

    private String tel1;

    private String tel2;

    private String tel3;

    private String fax;

    private String mobile;

    private String securityTel;

    private Integer bedCount;

    private String securityPerson;

    private String remarkInfo;

    private String managerOrg;

    private String policeStation;

    private String subCountyCode;

    private String subSecurityBureau;

    private String registerPerson;

    private String ownCustomerId;

    private Short createFrom;

    private Short state;

    private String collectionBank;

    private String collectionAccount;

    private Integer serviceDepartmentId;

    private Integer custLevel;

    private Integer localTaxAuthorityId;

    private Integer enterpriseScale;

    private Short isWithBranches;

    private String custNamePinyin;

    private Integer sourceBusinessTypeId;

    private Integer policeId;

    private Short synDataMark;

    private Short isBankCollection;

    private String bankCode;

    private String bankCollectionAgreementId;

    private Date bankCollectionAgreementDate;

    private String importNo;

    private String vpnNo;

    private String vpnPass;

    private Integer childPoliceId;

    private String selfSelValue;

    private String userDefine01;

    private String userDefine02;

    private String userDefine03;

    private String userDefine04;

    private String userDefine05;

    private String userDefine06;

    private String userDefine07;

    private String userDefine08;

    private String userDefine09;

    private String userDefine10;

    private String userDefine11;

    private String userDefine12;

    private String userDefine13;

    private String userDefine14;

    private String userDefine15;

    private String userDefine16;

    private String isDkh;

    private String userDefine18;

    private String userDefine19;

    private String userDefine20;

    private String taxRate;

    private String merCode;

    private Short merDevproperty;

    private String merTransaction;

    private String merBusTime;

    private String merSingle;

    private String merCommu;

    private String shopKeyid;

    private String shopOrRe;

    private Integer selfHy;

    private Integer selfEhy;

    private Integer selfShy;

    private Short selfIsMoveout;

    private Short selfIsInstall;

    private String selfContractno;

    private Short selfCampinc;

    private Short logoutNote;

    private String backupTaxCode;

    private String orgMerId;

    private Short selfJni;

    private Short selfFwuq;

    private Integer partaAffiliationCode;

    private String relatedPartyCode;

    private Short auditSign;

    private Short selfIsvip;

    private Short resourceCode;

    private String userDefine17;

    private String invoiceName;

    private String invoiceTel;

    private String invoiceAddr;

    public Long getOrgCustomerId() {
        return orgCustomerId;
    }

    public void setOrgCustomerId(Long orgCustomerId) {
        this.orgCustomerId = orgCustomerId;
    }

    public Integer getCustClassId() {
        return custClassId;
    }

    public void setCustClassId(Integer custClassId) {
        this.custClassId = custClassId;
    }

    public String getCustTaxCode() {
        return custTaxCode;
    }

    public void setCustTaxCode(String custTaxCode) {
        this.custTaxCode = custTaxCode == null ? null : custTaxCode.trim();
    }

    public Integer getTaxBureauId() {
        return taxBureauId;
    }

    public void setTaxBureauId(Integer taxBureauId) {
        this.taxBureauId = taxBureauId;
    }

    public Integer getSubstationId() {
        return substationId;
    }

    public void setSubstationId(Integer substationId) {
        this.substationId = substationId;
    }

    public Integer getServicePersonalId() {
        return servicePersonalId;
    }

    public void setServicePersonalId(Integer servicePersonalId) {
        this.servicePersonalId = servicePersonalId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
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

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getEnterpriseTypeId() {
        return enterpriseTypeId;
    }

    public void setEnterpriseTypeId(Integer enterpriseTypeId) {
        this.enterpriseTypeId = enterpriseTypeId;
    }

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Short getIsMissing() {
        return isMissing;
    }

    public void setIsMissing(Short isMissing) {
        this.isMissing = isMissing;
    }

    public Short getIsValid() {
        return isValid;
    }

    public void setIsValid(Short isValid) {
        this.isValid = isValid;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Integer getUpdateOperatorId() {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(Integer updateOperatorId) {
        this.updateOperatorId = updateOperatorId;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut == null ? null : shortcut.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getSubSecurityBureauId() {
        return subSecurityBureauId;
    }

    public void setSubSecurityBureauId(Integer subSecurityBureauId) {
        this.subSecurityBureauId = subSecurityBureauId;
    }

    public String getStarLevelId() {
        return starLevelId;
    }

    public void setStarLevelId(String starLevelId) {
        this.starLevelId = starLevelId == null ? null : starLevelId.trim();
    }

    public String getCustLevelId() {
        return custLevelId;
    }

    public void setCustLevelId(String custLevelId) {
        this.custLevelId = custLevelId == null ? null : custLevelId.trim();
    }

    public BigDecimal getRegisteredFund() {
        return registeredFund;
    }

    public void setRegisteredFund(BigDecimal registeredFund) {
        this.registeredFund = registeredFund;
    }

    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
    }

    public Integer getAccountantCount() {
        return accountantCount;
    }

    public void setAccountantCount(Integer accountantCount) {
        this.accountantCount = accountantCount;
    }

    public String getCustScaleId() {
        return custScaleId;
    }

    public void setCustScaleId(String custScaleId) {
        this.custScaleId = custScaleId == null ? null : custScaleId.trim();
    }

    public Integer getComputerCount() {
        return computerCount;
    }

    public void setComputerCount(Integer computerCount) {
        this.computerCount = computerCount;
    }

    public String getNetworkTypeId() {
        return networkTypeId;
    }

    public void setNetworkTypeId(String networkTypeId) {
        this.networkTypeId = networkTypeId == null ? null : networkTypeId.trim();
    }

    public String getCreditLevelId() {
        return creditLevelId;
    }

    public void setCreditLevelId(String creditLevelId) {
        this.creditLevelId = creditLevelId == null ? null : creditLevelId.trim();
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public String getGeneralManager() {
        return generalManager;
    }

    public void setGeneralManager(String generalManager) {
        this.generalManager = generalManager == null ? null : generalManager.trim();
    }

    public String getLocationTypeId() {
        return locationTypeId;
    }

    public void setLocationTypeId(String locationTypeId) {
        this.locationTypeId = locationTypeId == null ? null : locationTypeId.trim();
    }

    public Integer getTrainingCount() {
        return trainingCount;
    }

    public void setTrainingCount(Integer trainingCount) {
        this.trainingCount = trainingCount;
    }

    public Integer getSecurityPersonCount() {
        return securityPersonCount;
    }

    public void setSecurityPersonCount(Integer securityPersonCount) {
        this.securityPersonCount = securityPersonCount;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Long getParentOrgCustomerId() {
        return parentOrgCustomerId;
    }

    public void setParentOrgCustomerId(Long parentOrgCustomerId) {
        this.parentOrgCustomerId = parentOrgCustomerId;
    }

    public String getVocationForceId() {
        return vocationForceId;
    }

    public void setVocationForceId(String vocationForceId) {
        this.vocationForceId = vocationForceId == null ? null : vocationForceId.trim();
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1 == null ? null : tel1.trim();
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2 == null ? null : tel2.trim();
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3 == null ? null : tel3.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSecurityTel() {
        return securityTel;
    }

    public void setSecurityTel(String securityTel) {
        this.securityTel = securityTel == null ? null : securityTel.trim();
    }

    public Integer getBedCount() {
        return bedCount;
    }

    public void setBedCount(Integer bedCount) {
        this.bedCount = bedCount;
    }

    public String getSecurityPerson() {
        return securityPerson;
    }

    public void setSecurityPerson(String securityPerson) {
        this.securityPerson = securityPerson == null ? null : securityPerson.trim();
    }

    public String getRemarkInfo() {
        return remarkInfo;
    }

    public void setRemarkInfo(String remarkInfo) {
        this.remarkInfo = remarkInfo == null ? null : remarkInfo.trim();
    }

    public String getManagerOrg() {
        return managerOrg;
    }

    public void setManagerOrg(String managerOrg) {
        this.managerOrg = managerOrg == null ? null : managerOrg.trim();
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation == null ? null : policeStation.trim();
    }

    public String getSubCountyCode() {
        return subCountyCode;
    }

    public void setSubCountyCode(String subCountyCode) {
        this.subCountyCode = subCountyCode == null ? null : subCountyCode.trim();
    }

    public String getSubSecurityBureau() {
        return subSecurityBureau;
    }

    public void setSubSecurityBureau(String subSecurityBureau) {
        this.subSecurityBureau = subSecurityBureau == null ? null : subSecurityBureau.trim();
    }

    public String getRegisterPerson() {
        return registerPerson;
    }

    public void setRegisterPerson(String registerPerson) {
        this.registerPerson = registerPerson == null ? null : registerPerson.trim();
    }

    public String getOwnCustomerId() {
        return ownCustomerId;
    }

    public void setOwnCustomerId(String ownCustomerId) {
        this.ownCustomerId = ownCustomerId == null ? null : ownCustomerId.trim();
    }

    public Short getCreateFrom() {
        return createFrom;
    }

    public void setCreateFrom(Short createFrom) {
        this.createFrom = createFrom;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getCollectionBank() {
        return collectionBank;
    }

    public void setCollectionBank(String collectionBank) {
        this.collectionBank = collectionBank == null ? null : collectionBank.trim();
    }

    public String getCollectionAccount() {
        return collectionAccount;
    }

    public void setCollectionAccount(String collectionAccount) {
        this.collectionAccount = collectionAccount == null ? null : collectionAccount.trim();
    }

    public Integer getServiceDepartmentId() {
        return serviceDepartmentId;
    }

    public void setServiceDepartmentId(Integer serviceDepartmentId) {
        this.serviceDepartmentId = serviceDepartmentId;
    }

    public Integer getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(Integer custLevel) {
        this.custLevel = custLevel;
    }

    public Integer getLocalTaxAuthorityId() {
        return localTaxAuthorityId;
    }

    public void setLocalTaxAuthorityId(Integer localTaxAuthorityId) {
        this.localTaxAuthorityId = localTaxAuthorityId;
    }

    public Integer getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(Integer enterpriseScale) {
        this.enterpriseScale = enterpriseScale;
    }

    public Short getIsWithBranches() {
        return isWithBranches;
    }

    public void setIsWithBranches(Short isWithBranches) {
        this.isWithBranches = isWithBranches;
    }

    public String getCustNamePinyin() {
        return custNamePinyin;
    }

    public void setCustNamePinyin(String custNamePinyin) {
        this.custNamePinyin = custNamePinyin == null ? null : custNamePinyin.trim();
    }

    public Integer getSourceBusinessTypeId() {
        return sourceBusinessTypeId;
    }

    public void setSourceBusinessTypeId(Integer sourceBusinessTypeId) {
        this.sourceBusinessTypeId = sourceBusinessTypeId;
    }

    public Integer getPoliceId() {
        return policeId;
    }

    public void setPoliceId(Integer policeId) {
        this.policeId = policeId;
    }

    public Short getSynDataMark() {
        return synDataMark;
    }

    public void setSynDataMark(Short synDataMark) {
        this.synDataMark = synDataMark;
    }

    public Short getIsBankCollection() {
        return isBankCollection;
    }

    public void setIsBankCollection(Short isBankCollection) {
        this.isBankCollection = isBankCollection;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankCollectionAgreementId() {
        return bankCollectionAgreementId;
    }

    public void setBankCollectionAgreementId(String bankCollectionAgreementId) {
        this.bankCollectionAgreementId = bankCollectionAgreementId == null ? null : bankCollectionAgreementId.trim();
    }

    public Date getBankCollectionAgreementDate() {
        return bankCollectionAgreementDate;
    }

    public void setBankCollectionAgreementDate(Date bankCollectionAgreementDate) {
        this.bankCollectionAgreementDate = bankCollectionAgreementDate;
    }

    public String getImportNo() {
        return importNo;
    }

    public void setImportNo(String importNo) {
        this.importNo = importNo == null ? null : importNo.trim();
    }

    public String getVpnNo() {
        return vpnNo;
    }

    public void setVpnNo(String vpnNo) {
        this.vpnNo = vpnNo == null ? null : vpnNo.trim();
    }

    public String getVpnPass() {
        return vpnPass;
    }

    public void setVpnPass(String vpnPass) {
        this.vpnPass = vpnPass == null ? null : vpnPass.trim();
    }

    public Integer getChildPoliceId() {
        return childPoliceId;
    }

    public void setChildPoliceId(Integer childPoliceId) {
        this.childPoliceId = childPoliceId;
    }

    public String getSelfSelValue() {
        return selfSelValue;
    }

    public void setSelfSelValue(String selfSelValue) {
        this.selfSelValue = selfSelValue == null ? null : selfSelValue.trim();
    }

    public String getUserDefine01() {
        return userDefine01;
    }

    public void setUserDefine01(String userDefine01) {
        this.userDefine01 = userDefine01 == null ? null : userDefine01.trim();
    }

    public String getUserDefine02() {
        return userDefine02;
    }

    public void setUserDefine02(String userDefine02) {
        this.userDefine02 = userDefine02 == null ? null : userDefine02.trim();
    }

    public String getUserDefine03() {
        return userDefine03;
    }

    public void setUserDefine03(String userDefine03) {
        this.userDefine03 = userDefine03 == null ? null : userDefine03.trim();
    }

    public String getUserDefine04() {
        return userDefine04;
    }

    public void setUserDefine04(String userDefine04) {
        this.userDefine04 = userDefine04 == null ? null : userDefine04.trim();
    }

    public String getUserDefine05() {
        return userDefine05;
    }

    public void setUserDefine05(String userDefine05) {
        this.userDefine05 = userDefine05 == null ? null : userDefine05.trim();
    }

    public String getUserDefine06() {
        return userDefine06;
    }

    public void setUserDefine06(String userDefine06) {
        this.userDefine06 = userDefine06 == null ? null : userDefine06.trim();
    }

    public String getUserDefine07() {
        return userDefine07;
    }

    public void setUserDefine07(String userDefine07) {
        this.userDefine07 = userDefine07 == null ? null : userDefine07.trim();
    }

    public String getUserDefine08() {
        return userDefine08;
    }

    public void setUserDefine08(String userDefine08) {
        this.userDefine08 = userDefine08 == null ? null : userDefine08.trim();
    }

    public String getUserDefine09() {
        return userDefine09;
    }

    public void setUserDefine09(String userDefine09) {
        this.userDefine09 = userDefine09 == null ? null : userDefine09.trim();
    }

    public String getUserDefine10() {
        return userDefine10;
    }

    public void setUserDefine10(String userDefine10) {
        this.userDefine10 = userDefine10 == null ? null : userDefine10.trim();
    }

    public String getUserDefine11() {
        return userDefine11;
    }

    public void setUserDefine11(String userDefine11) {
        this.userDefine11 = userDefine11 == null ? null : userDefine11.trim();
    }

    public String getUserDefine12() {
        return userDefine12;
    }

    public void setUserDefine12(String userDefine12) {
        this.userDefine12 = userDefine12 == null ? null : userDefine12.trim();
    }

    public String getUserDefine13() {
        return userDefine13;
    }

    public void setUserDefine13(String userDefine13) {
        this.userDefine13 = userDefine13 == null ? null : userDefine13.trim();
    }

    public String getUserDefine14() {
        return userDefine14;
    }

    public void setUserDefine14(String userDefine14) {
        this.userDefine14 = userDefine14 == null ? null : userDefine14.trim();
    }

    public String getUserDefine15() {
        return userDefine15;
    }

    public void setUserDefine15(String userDefine15) {
        this.userDefine15 = userDefine15 == null ? null : userDefine15.trim();
    }

    public String getUserDefine16() {
        return userDefine16;
    }

    public void setUserDefine16(String userDefine16) {
        this.userDefine16 = userDefine16 == null ? null : userDefine16.trim();
    }

    public String getIsDkh() {
        return isDkh;
    }

    public void setIsDkh(String isDkh) {
        this.isDkh = isDkh == null ? null : isDkh.trim();
    }

    public String getUserDefine18() {
        return userDefine18;
    }

    public void setUserDefine18(String userDefine18) {
        this.userDefine18 = userDefine18 == null ? null : userDefine18.trim();
    }

    public String getUserDefine19() {
        return userDefine19;
    }

    public void setUserDefine19(String userDefine19) {
        this.userDefine19 = userDefine19 == null ? null : userDefine19.trim();
    }

    public String getUserDefine20() {
        return userDefine20;
    }

    public void setUserDefine20(String userDefine20) {
        this.userDefine20 = userDefine20 == null ? null : userDefine20.trim();
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate == null ? null : taxRate.trim();
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public Short getMerDevproperty() {
        return merDevproperty;
    }

    public void setMerDevproperty(Short merDevproperty) {
        this.merDevproperty = merDevproperty;
    }

    public String getMerTransaction() {
        return merTransaction;
    }

    public void setMerTransaction(String merTransaction) {
        this.merTransaction = merTransaction == null ? null : merTransaction.trim();
    }

    public String getMerBusTime() {
        return merBusTime;
    }

    public void setMerBusTime(String merBusTime) {
        this.merBusTime = merBusTime == null ? null : merBusTime.trim();
    }

    public String getMerSingle() {
        return merSingle;
    }

    public void setMerSingle(String merSingle) {
        this.merSingle = merSingle == null ? null : merSingle.trim();
    }

    public String getMerCommu() {
        return merCommu;
    }

    public void setMerCommu(String merCommu) {
        this.merCommu = merCommu == null ? null : merCommu.trim();
    }

    public String getShopKeyid() {
        return shopKeyid;
    }

    public void setShopKeyid(String shopKeyid) {
        this.shopKeyid = shopKeyid == null ? null : shopKeyid.trim();
    }

    public String getShopOrRe() {
        return shopOrRe;
    }

    public void setShopOrRe(String shopOrRe) {
        this.shopOrRe = shopOrRe == null ? null : shopOrRe.trim();
    }

    public Integer getSelfHy() {
        return selfHy;
    }

    public void setSelfHy(Integer selfHy) {
        this.selfHy = selfHy;
    }

    public Integer getSelfEhy() {
        return selfEhy;
    }

    public void setSelfEhy(Integer selfEhy) {
        this.selfEhy = selfEhy;
    }

    public Integer getSelfShy() {
        return selfShy;
    }

    public void setSelfShy(Integer selfShy) {
        this.selfShy = selfShy;
    }

    public Short getSelfIsMoveout() {
        return selfIsMoveout;
    }

    public void setSelfIsMoveout(Short selfIsMoveout) {
        this.selfIsMoveout = selfIsMoveout;
    }

    public Short getSelfIsInstall() {
        return selfIsInstall;
    }

    public void setSelfIsInstall(Short selfIsInstall) {
        this.selfIsInstall = selfIsInstall;
    }

    public String getSelfContractno() {
        return selfContractno;
    }

    public void setSelfContractno(String selfContractno) {
        this.selfContractno = selfContractno == null ? null : selfContractno.trim();
    }

    public Short getSelfCampinc() {
        return selfCampinc;
    }

    public void setSelfCampinc(Short selfCampinc) {
        this.selfCampinc = selfCampinc;
    }

    public Short getLogoutNote() {
        return logoutNote;
    }

    public void setLogoutNote(Short logoutNote) {
        this.logoutNote = logoutNote;
    }

    public String getBackupTaxCode() {
        return backupTaxCode;
    }

    public void setBackupTaxCode(String backupTaxCode) {
        this.backupTaxCode = backupTaxCode == null ? null : backupTaxCode.trim();
    }

    public String getOrgMerId() {
        return orgMerId;
    }

    public void setOrgMerId(String orgMerId) {
        this.orgMerId = orgMerId == null ? null : orgMerId.trim();
    }

    public Short getSelfJni() {
        return selfJni;
    }

    public void setSelfJni(Short selfJni) {
        this.selfJni = selfJni;
    }

    public Short getSelfFwuq() {
        return selfFwuq;
    }

    public void setSelfFwuq(Short selfFwuq) {
        this.selfFwuq = selfFwuq;
    }

    public Integer getPartaAffiliationCode() {
        return partaAffiliationCode;
    }

    public void setPartaAffiliationCode(Integer partaAffiliationCode) {
        this.partaAffiliationCode = partaAffiliationCode;
    }

    public String getRelatedPartyCode() {
        return relatedPartyCode;
    }

    public void setRelatedPartyCode(String relatedPartyCode) {
        this.relatedPartyCode = relatedPartyCode == null ? null : relatedPartyCode.trim();
    }

    public Short getAuditSign() {
        return auditSign;
    }

    public void setAuditSign(Short auditSign) {
        this.auditSign = auditSign;
    }

    public Short getSelfIsvip() {
        return selfIsvip;
    }

    public void setSelfIsvip(Short selfIsvip) {
        this.selfIsvip = selfIsvip;
    }

    public Short getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(Short resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getUserDefine17() {
        return userDefine17;
    }

    public void setUserDefine17(String userDefine17) {
        this.userDefine17 = userDefine17 == null ? null : userDefine17.trim();
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName == null ? null : invoiceName.trim();
    }

    public String getInvoiceTel() {
        return invoiceTel;
    }

    public void setInvoiceTel(String invoiceTel) {
        this.invoiceTel = invoiceTel == null ? null : invoiceTel.trim();
    }

    public String getInvoiceAddr() {
        return invoiceAddr;
    }

    public void setInvoiceAddr(String invoiceAddr) {
        this.invoiceAddr = invoiceAddr == null ? null : invoiceAddr.trim();
    }
}