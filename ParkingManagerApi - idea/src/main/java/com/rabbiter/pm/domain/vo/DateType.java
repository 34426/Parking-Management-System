package com.rabbiter.pm.domain.vo;

/**
 * @author rabbiter
 * @date 2023/4/14
 */
public class DateType {

    private String name;

    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DateType{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
