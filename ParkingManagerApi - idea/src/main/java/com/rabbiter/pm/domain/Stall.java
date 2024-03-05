package com.rabbiter.pm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-22
 */
public class Stall implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车位编号
     */
    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    /**
     * 车位号
     */
    @TableField("stall_num")
    private String stallNum;

    /**
     * 车位区域
     */
    @TableField("stall_area")
    private String stallArea;

    /**
     * 车位类型
     */
    @TableField("stall_type")
    private String stallType;

    /**
     * 车位状态
     */
    @TableField("stall_state")
    private String stallState;

    /**
     * 车位收费
     */
    @TableField("stall_money")
    private Double stallMoney;

    /**
     *  逻辑删除标志
     */
    @TableField("stall_live")
    private String stallLive;

    /**
     * 用户编号
     */
    @TableField("user_id")
    private Integer userId;

    @TableField(exist = false)
    private User user;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStallNum() {
        return stallNum;
    }

    public void setStallNum(String stallNum) {
        this.stallNum = stallNum;
    }

    public String getStallArea() {
        return stallArea;
    }

    public void setStallArea(String stallArea) {
        this.stallArea = stallArea;
    }

    public String getStallType() {
        return stallType;
    }

    public void setStallType(String stallType) {
        this.stallType = stallType;
    }

    public String getStallState() {
        return stallState;
    }

    public void setStallState(String stallState) {
        this.stallState = stallState;
    }

    public Double getStallMoney() {
        return stallMoney;
    }

    public void setStallMoney(Double stallMoney) {
        this.stallMoney = stallMoney;
    }

    public String getStallLive() {
        return stallLive;
    }

    public void setStallLive(String stallLive) {
        this.stallLive = stallLive;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Stall{" +
                "sid=" + sid +
                ", stallNum='" + stallNum + '\'' +
                ", stallArea='" + stallArea + '\'' +
                ", stallType='" + stallType + '\'' +
                ", stallState='" + stallState + '\'' +
                ", stallMoney=" + stallMoney +
                ", stallLive='" + stallLive + '\'' +
                ", userId=" + userId +
                ", user=" + user +
                '}';
    }
}
