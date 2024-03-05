package com.rabbiter.pm.domain.vo;

/**
 * @author rabbiter
 */
public class StallCarVo {

    private String nike;

    private String card;

    private Integer pageSize;

    private Integer pagenum;

    public String getNike() {
        return nike;
    }

    public void setNike(String nike) {
        this.nike = nike;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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
        return "StallCarVo{" +
                "nike='" + nike + '\'' +
                ", card='" + card + '\'' +
                ", pageSize=" + pageSize +
                ", pagenum=" + pagenum +
                '}';
    }
}
