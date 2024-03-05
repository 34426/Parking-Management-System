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
public class Fee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收费标准ID
     */
    @TableId(value = "fid", type = IdType.AUTO)
    private Integer fid;

    /**
     * 车位类型
     */
    private String carType;

    /**
     * 价格
     */
    private Double money;

    /**
     * 价格描述
     */
    private String moneyDesc;

    /**
     * 创建时间
     */
    private LocalDateTime feeTime;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getMoneyDesc() {
        return moneyDesc;
    }

    public void setMoneyDesc(String moneyDesc) {
        this.moneyDesc = moneyDesc;
    }

    public LocalDateTime getFeeTime() {
        return feeTime;
    }

    public void setFeeTime(LocalDateTime feeTime) {
        this.feeTime = feeTime;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "fid=" + fid +
                ", carType='" + carType + '\'' +
                ", money=" + money +
                ", moneyDesc='" + moneyDesc + '\'' +
                ", feeTime=" + feeTime +
                '}';
    }
}
