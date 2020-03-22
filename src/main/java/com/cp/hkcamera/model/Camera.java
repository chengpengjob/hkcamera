package com.cp.hkcamera.model;

public class Camera {
    private Integer cameraid;//监控id

    private String cameraindexcode;//监控点唯一标识

    private String recordlocation;//录像存储位置

    private String recordlocationname;//录像存储位置说明

    private String status;//在线状态（0-未知，1-在线，2-离线）

    private String statusname;//状态说明

    private String cameraname;//监控点名称

    public Integer getCameraid() {
        return cameraid;
    }

    public void setCameraid(Integer cameraid) {
        this.cameraid = cameraid;
    }

    public String getCameraindexcode() {
        return cameraindexcode;
    }

    public void setCameraindexcode(String cameraindexcode) {
        this.cameraindexcode = cameraindexcode == null ? null : cameraindexcode.trim();
    }

    public String getRecordlocation() {
        return recordlocation;
    }

    public void setRecordlocation(String recordlocation) {
        this.recordlocation = recordlocation == null ? null : recordlocation.trim();
    }

    public String getRecordlocationname() {
        return recordlocationname;
    }

    public void setRecordlocationname(String recordlocationname) {
        this.recordlocationname = recordlocationname == null ? null : recordlocationname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
    }

    public String getCameraname() {
        return cameraname;
    }

    public void setCameraname(String cameraname) {
        this.cameraname = cameraname == null ? null : cameraname.trim();
    }
}