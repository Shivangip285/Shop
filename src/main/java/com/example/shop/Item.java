package com.example.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
public class Item {
    @NotEmpty
    String name;
    @Positive
    int Count;
}
