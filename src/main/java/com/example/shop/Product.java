package com.example.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
@AllArgsConstructor
public class Product {
    @NotEmpty
    String name;
}