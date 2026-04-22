package com.revature.jpaspringecomm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order_details")
@IdClass(OrderDetailId.class)
public class OrderDetail {

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;
    private Double discount;

    public OrderDetail() {}

    public OrderDetail(Order order, Product product, Integer quantity, Double discount) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
    }


    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Double getDiscount() { return discount; }
    public void setDiscount(Double discount) { this.discount = discount; }
}