package com.example.shop.ddd_bootcamp.domain;

import com.example.shop.ddd_bootcamp.domain.domain_service.CompetativeBasedPricer;
import org.junit.jupiter.api.Test;

import java.util.Currency;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    public void shouldReturnTotalOrderCost(){
        List<Product> productList = List.of(new Product("Apple Pencil", new Price(8), 8),
                new Product("Sony Wireless headphone", new Price(8), 8));
        System.out.println(new Order(productList).totalCost(productList));
    }
}