package com.example.shop.ddd_bootcamp.domain.domain_service;

import com.example.shop.ddd_bootcamp.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class CompetativeBasedPricer {
    private List<Product> products;


    public CompetativeBasedPricer(List<Product> products) {
        this.products = products;
    }

    public Double getDiscount(String productName){
        List<Product> productStream = products.stream().filter(x -> x.getName().equals(productName)).collect(Collectors.toList());
        return productStream.get(0).getPrice().getAmount()*0.9;
    }
}
