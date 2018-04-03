package com.aisino.db2.domain;

import java.util.Date;

public class Product {
    private Integer productId;

    private String productName;

    private String productDesc;

    private String researchUnit;

    private String contacts;

    private String contactNumber;

    private Date createTime;

    private Date updateTime;

    private String installFileName;

    private String installFilePath;

    private String latestVersionNo;

    private String state;

    private String createId;

    private String updateId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getResearchUnit() {
        return researchUnit;
    }

    public void setResearchUnit(String researchUnit) {
        this.researchUnit = researchUnit == null ? null : researchUnit.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getInstallFileName() {
        return installFileName;
    }

    public void setInstallFileName(String installFileName) {
        this.installFileName = installFileName == null ? null : installFileName.trim();
    }

    public String getInstallFilePath() {
        return installFilePath;
    }

    public void setInstallFilePath(String installFilePath) {
        this.installFilePath = installFilePath == null ? null : installFilePath.trim();
    }

    public String getLatestVersionNo() {
        return latestVersionNo;
    }

    public void setLatestVersionNo(String latestVersionNo) {
        this.latestVersionNo = latestVersionNo == null ? null : latestVersionNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }
}