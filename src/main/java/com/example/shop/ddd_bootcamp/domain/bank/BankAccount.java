package com.example.shop.ddd_bootcamp.domain.bank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccount {
    private String customerId;
    private Address address;
}
