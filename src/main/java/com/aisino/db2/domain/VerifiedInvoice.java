package com.aisino.db2.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class VerifiedInvoice extends VerifiedInvoiceKey {
    private String type;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
    private Date date;

    private String device;

    private String checkcode;

    private String buyername;

    private String buyertaxcode;

    private String buyeraddressphone;

    private String buyerbankaccount;

    private String sellername;

    private String sellertaxcode;

    private String selleraddressphone;

    private String sellerbankaccount;

    private BigDecimal amount;

    private BigDecimal tax;

    private BigDecimal amountwithtax;

    private String memo;

    private byte iscanceled;

    private byte islistadded;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode == null ? null : checkcode.trim();
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername == null ? null : buyername.trim();
    }

    public String getBuyertaxcode() {
        return buyertaxcode;
    }

    public void setBuyertaxcode(String buyertaxcode) {
        this.buyertaxcode = buyertaxcode == null ? null : buyertaxcode.trim();
    }

    public String getBuyeraddressphone() {
        return buyeraddressphone;
    }

    public void setBuyeraddressphone(String buyeraddressphone) {
        this.buyeraddressphone = buyeraddressphone == null ? null : buyeraddressphone.trim();
    }

    public String getBuyerbankaccount() {
        return buyerbankaccount;
    }

    public void setBuyerbankaccount(String buyerbankaccount) {
        this.buyerbankaccount = buyerbankaccount == null ? null : buyerbankaccount.trim();
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername == null ? null : sellername.trim();
    }

    public String getSellertaxcode() {
        return sellertaxcode;
    }

    public void setSellertaxcode(String sellertaxcode) {
        this.sellertaxcode = sellertaxcode == null ? null : sellertaxcode.trim();
    }

    public String getSelleraddressphone() {
        return selleraddressphone;
    }

    public void setSelleraddressphone(String selleraddressphone) {
        this.selleraddressphone = selleraddressphone == null ? null : selleraddressphone.trim();
    }

    public String getSellerbankaccount() {
        return sellerbankaccount;
    }

    public void setSellerbankaccount(String sellerbankaccount) {
        this.sellerbankaccount = sellerbankaccount == null ? null : sellerbankaccount.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getAmountwithtax() {
        return amountwithtax;
    }

    public void setAmountwithtax(BigDecimal amountwithtax) {
        this.amountwithtax = amountwithtax;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public byte getIscanceled() {
        return iscanceled;
    }

    public void setIscanceled(byte iscanceled) {
        this.iscanceled = iscanceled;
    }

    public byte getIslistadded() {
        return islistadded;
    }

    public void setIslistadded(byte islistadded) {
        this.islistadded = islistadded;
    }
}