package com.rabbiter.pm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-27
 */
public class Recharge implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 充值编号
     */
    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    /**
     * 用户
     */
    private String person;

    /**
     * 充值金额
     */
    private Double money;

    /**
     * 充值时间
     */
    private LocalDateTime ctime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Recharge{" +
                "cid=" + cid +
                ", person='" + person + '\'' +
                ", money=" + money +
                ", ctime=" + ctime +
                '}';
    }
}
