package com.javatechie.dto;

import com.javatechie.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ProductEvent {

    private String eventType;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private Product product;

    public ProductEvent(String eventType, Product product) {
        this.eventType = eventType;
        this.product = product;
    }

    public ProductEvent() {
    }
}
