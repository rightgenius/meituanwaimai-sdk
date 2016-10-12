package com.jiabangou.mtwmsdk.model;

import java.io.Serializable;

/**
 * Created by wanglei on 16-10-11.
 */
public class Sku implements Serializable {

    private String sku_id;
    private String spec;
    private String upc;
    private Double price;
    private Integer stock;
    private String location_code;
    private AvailableTimes available_times;

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getLocation_code() {
        return location_code;
    }

    public void setLocation_code(String location_code) {
        this.location_code = location_code;
    }

    public AvailableTimes getAvailable_times() {
        return available_times;
    }

    public void setAvailable_times(AvailableTimes available_times) {
        this.available_times = available_times;
    }

    @Override
    public String toString() {
        return "Sku{" +
                "sku_id=" + sku_id +
                ", spec='" + spec + '\'' +
                ", upc='" + upc + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", location_code='" + location_code + '\'' +
                ", available_times=" + available_times +
                '}';
    }
}
