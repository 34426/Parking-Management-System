package com.rabbiter.pm.domain.vo;


/**
 * @author rabbiter
 * @date 2023/3/23
 */
public class StallVo {

    private String carArea;

    private String carType;

    private String carState;

    private Integer pagenum;

    private Integer pageSize;

    public StallVo() {
    }

    public StallVo(String carArea, String carType, String carState, Integer pagenum, Integer pageSize) {
        this.carArea = carArea;
        this.carType = carType;
        this.carState = carState;
        this.pagenum = pagenum;
        this.pageSize = pageSize;
    }

    public String getCarArea() {
        return carArea;
    }

    public void setCarArea(String carArea) {
        this.carArea = carArea;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarState() {
        return carState;
    }

    public void setCarState(String carState) {
        this.carState = carState;
    }

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "StallVo{" +
                "carArea='" + carArea + '\'' +
                ", carType='" + carType + '\'' +
                ", carState='" + carState + '\'' +
                ", pagenum=" + pagenum +
                ", pageSize=" + pageSize +
                '}';
    }
}
