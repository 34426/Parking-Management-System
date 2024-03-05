package com.rabbiter.pm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class LoginInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录日志编号
     */
    @TableId(value = "yid", type = IdType.AUTO)
    private Integer yid;

    /**
     * 用户
     */
    private String person;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 登录时间
     */
    @TableField("login_time")
    private LocalDateTime loginTime;

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "yid=" + yid +
                ", person='" + person + '\'' +
                ", ip='" + ip + '\'' +
                ", browser='" + browser + '\'' +
                ", os='" + os + '\'' +
                ", loginTime=" + loginTime +
                '}';
    }
}
