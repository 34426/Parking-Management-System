package com.rabbiter.pm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-27
 */
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车辆编号
     */
    @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    /**
     * 车牌号
     */
    private String card;

    /**
     * 车类别
     */
    @TableField("car_type")
    private String carType;

    /**
     * 用户
     */
    private String person;

    /**
     * 录入时间
     */
    private LocalDateTime xtime;


    @TableField(exist = false)
    private User user;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public LocalDateTime getXtime() {
        return xtime;
    }

    public void setXtime(LocalDateTime xtime) {
        this.xtime = xtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(tid, car.tid) && Objects.equals(card, car.card) && Objects.equals(carType, car.carType) && Objects.equals(person, car.person) && Objects.equals(xtime, car.xtime) && Objects.equals(user, car.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, card, carType, person, xtime, user);
    }

    @Override
    public String toString() {
        return "Car{" +
                "tid=" + tid +
                ", card='" + card + '\'' +
                ", carType='" + carType + '\'' +
                ", person='" + person + '\'' +
                ", xtime=" + xtime +
                ", user=" + user +
                '}';
    }
}
