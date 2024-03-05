package com.rabbiter.pm.domain.vo;


/**
 * @author rabbiter
 * 地理位置信息实体
 * @date 2023/1/12 15:14
 */
public class IpAddress {

    private String ip;

    private String pro;

    private String proCode;

    private String city;

    private String cityCode;

    private String region;

    private String addr;

    private String regionNames;

    private String err;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getRegionNames() {
        return regionNames;
    }

    public void setRegionNames(String regionNames) {
        this.regionNames = regionNames;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    @Override
    public String toString() {
        return "IpAddress{" +
                "ip='" + ip + '\'' +
                ", pro='" + pro + '\'' +
                ", proCode='" + proCode + '\'' +
                ", city='" + city + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", region='" + region + '\'' +
                ", addr='" + addr + '\'' +
                ", regionNames='" + regionNames + '\'' +
                ", err='" + err + '\'' +
                '}';
    }
}
