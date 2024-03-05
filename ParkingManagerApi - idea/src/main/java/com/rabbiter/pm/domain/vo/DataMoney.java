package com.rabbiter.pm.domain.vo;

import java.time.LocalDateTime;

/**
 * @author rabbiter
 * @date 2023/4/14
 */
public class DataMoney {

    private LocalDateTime name;

    private Double value;

    public LocalDateTime getName() {
        return name;
    }

    public void setName(LocalDateTime name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataMoney{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }
}
