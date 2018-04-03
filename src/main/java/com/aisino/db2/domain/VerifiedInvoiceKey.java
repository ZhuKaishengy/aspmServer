package com.aisino.db2.domain;

public class VerifiedInvoiceKey {
    private String code;

    private String number;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public VerifiedInvoiceKey() {
    }

    public VerifiedInvoiceKey(String code, String number) {

        this.code = code;
        this.number = number;
    }
}