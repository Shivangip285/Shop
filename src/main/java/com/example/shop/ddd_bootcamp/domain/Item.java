package com.example.shop.ddd_bootcamp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
public class Item {
    Product product;
    @Positive
    int Count;


}
