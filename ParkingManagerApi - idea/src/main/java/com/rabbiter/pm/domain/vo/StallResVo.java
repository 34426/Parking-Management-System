package com.rabbiter.pm.domain.vo;


import java.time.LocalDateTime;

/**
 * @author rabbiter
 * @date 2023/4/8
 */
public class StallResVo {

    private String person;

    private String stallArea;

    private LocalDateTime inTime;

    private LocalDateTime outTime;

    private Integer pageSize;

    private Integer pagenum;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getStallArea() {
        return stallArea;
    }

    public void setStallArea(String stallArea) {
        this.stallArea = stallArea;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalDateTime inTime) {
        this.inTime = inTime;
    }

    public LocalDateTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    @Override
    public String toString() {
        return "StallResVo{" +
                "person='" + person + '\'' +
                ", stallArea='" + stallArea + '\'' +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                ", pageSize=" + pageSize +
                ", pagenum=" + pagenum +
                '}';
    }
}
