package com.rabbiter.pm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-30
 */
public class StallType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车位类型编号
     */
    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    /**
     * 车位类型
     */
    private String otype;

    /**
     * 车位价格
     */
    private Double omoney;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype;
    }

    public Double getOmoney() {
        return omoney;
    }

    public void setOmoney(Double omoney) {
        this.omoney = omoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StallType stallType = (StallType) o;
        return Objects.equals(oid, stallType.oid) && Objects.equals(otype, stallType.otype) && Objects.equals(omoney, stallType.omoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid, otype, omoney);
    }

    @Override
    public String toString() {
        return "StallType{" +
                "oid=" + oid +
                ", otype='" + otype + '\'' +
                ", omoney=" + omoney +
                '}';
    }
}
