package com.aisino.db2.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Arrays;

public class VerificationCode {
    private String id;

    private String zone;

    private String imagetip;

    private String content;

    private byte verify;

    private String md5;

    @JsonDeserialize
    private byte[] image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public String getImagetip() {
        return imagetip;
    }

    public void setImagetip(String imagetip) {
        this.imagetip = imagetip == null ? null : imagetip.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public byte getVerify() {
        return verify;
    }

    public void setVerify(byte verify) {
        this.verify = verify;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "VerificationCode{" +
                "id='" + id + '\'' +
                ", zone='" + zone + '\'' +
                ", imagetip='" + imagetip + '\'' +
                ", content='" + content + '\'' +
                ", verify=" + verify +
                ", md5='" + md5 + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public VerificationCode(String id, String zone, String imagetip, byte verify, String md5, byte[] image) {
        this.id = id;
        this.zone = zone;
        this.imagetip = imagetip;
        this.verify = verify;
        this.md5 = md5;
        this.image = image;
    }

    public VerificationCode() {
    }
}