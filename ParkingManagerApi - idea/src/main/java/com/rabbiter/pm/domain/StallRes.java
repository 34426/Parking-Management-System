package com.rabbiter.pm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * @author rabbiter
 * @date 2023/3/23
 */
@TableName("stall_res")
public class StallRes {


    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    @TableField("person")
    private String person;

    @TableField("stall_id")
    private Integer stallId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("over_time")
    private LocalDateTime overTime;

    @TableField("pay_money")
    private Double money;

    @TableField(exist = false)
    private Stall stall;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Integer getStallId() {
        return stallId;
    }

    public void setStallId(Integer stallId) {
        this.stallId = stallId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getOverTime() {
        return overTime;
    }

    public void setOverTime(LocalDateTime overTime) {
        this.overTime = overTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Stall getStall() {
        return stall;
    }

    public void setStall(Stall stall) {
        this.stall = stall;
    }

    @Override
    public String toString() {
        return "StallRes{" +
                "pid=" + pid +
                ", person='" + person + '\'' +
                ", stallId=" + stallId +
                ", createTime=" + createTime +
                ", overTime=" + overTime +
                ", money=" + money +
                ", stall=" + stall +
                '}';
    }
}
