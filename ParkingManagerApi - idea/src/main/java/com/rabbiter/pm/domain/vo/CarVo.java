package com.rabbiter.pm.domain.vo;


/**
 * @author rabbiter
 * @description
 * @date 2023/4/2
 */
public class CarVo {

    private String person;

    private String carType;

    private String card;

    private Integer pagenum;

    private Integer pageSize;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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
        return "CarVo{" +
                "person='" + person + '\'' +
                ", carType='" + carType + '\'' +
                ", card='" + card + '\'' +
                ", pagenum=" + pagenum +
                ", pageSize=" + pageSize +
                '}';
    }
}
