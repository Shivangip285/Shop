package com.example.shop.ddd_bootcamp.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Currency;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
public class Order {

    private String id;
    private List<Product> productList;

    public Order(List<Product> productList) {
        this.id = UUID.randomUUID().toString();
        this.productList = productList;
    }

    public double totalCost(List<Product> productList){
        double cost = 0;

        for (Product product : productList) {
            cost += (product.price.getAmount()+product.getWeight()*0.1);
        }
        return cost;
    }

}
