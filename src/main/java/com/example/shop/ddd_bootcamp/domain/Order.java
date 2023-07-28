package com.example.shop.ddd_bootcamp.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Currency;
import java.util.List;
import java.util.UUID;
@Data
public class Order {

    private String id;
    private List<Product> productList;

    public Order(List<Product> productList) {
        this.id = UUID.randomUUID().toString();
        this.productList = productList;
    }

}
