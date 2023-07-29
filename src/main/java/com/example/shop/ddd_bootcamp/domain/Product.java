package com.example.shop.ddd_bootcamp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class Product {
    @NotEmpty
    String name;

    Price price;

    double weight;


}
