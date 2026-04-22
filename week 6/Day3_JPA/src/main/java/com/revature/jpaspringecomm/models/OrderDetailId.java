package com.revature.jpaspringecomm.models;

import java.io.Serializable;

public class OrderDetailId implements Serializable {

    private Long order;
    private Long product;

    public OrderDetailId() {}

    public OrderDetailId(Long order, Long product) {
        this.order = order;
        this.product = product;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }
}