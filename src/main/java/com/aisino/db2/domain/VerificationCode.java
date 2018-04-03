package com.aisino.db2.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class VerificationCode {
    private String id;

    private String zone;

    private String imagetip;

    private String content;

    private byte verify;

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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}