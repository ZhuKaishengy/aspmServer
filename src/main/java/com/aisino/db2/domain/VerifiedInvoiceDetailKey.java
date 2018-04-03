package com.aisino.db2.domain;

public class VerifiedInvoiceDetailKey {
    private String invoicecode;

    private String invoicenumber;

    private Integer detailindex;

    private byte islistitem;

    public String getInvoicecode() {
        return invoicecode;
    }

    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode == null ? null : invoicecode.trim();
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber == null ? null : invoicenumber.trim();
    }

    public Integer getDetailindex() {
        return detailindex;
    }

    public void setDetailindex(Integer detailindex) {
        this.detailindex = detailindex;
    }

    public byte getIslistitem() {
        return islistitem;
    }

    public void setIslistitem(byte islistitem) {
        this.islistitem = islistitem;
    }
}