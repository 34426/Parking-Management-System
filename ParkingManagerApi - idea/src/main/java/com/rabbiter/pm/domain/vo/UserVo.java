package com.rabbiter.pm.domain.vo;


/**
 * @author rabbiter
 * @date 2023/3/27
 */
public class UserVo {

    private String username;

    private String nike;

    private String card;

    private Integer pagenum;

    private Integer pageSize;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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
        return "UserVo{" +
                "username='" + username + '\'' +
                ", nike='" + nike + '\'' +
                ", card='" + card + '\'' +
                ", pagenum=" + pagenum +
                ", pageSize=" + pageSize +
                '}';
    }
}
