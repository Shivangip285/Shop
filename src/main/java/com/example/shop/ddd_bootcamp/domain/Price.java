package com.example.shop.ddd_bootcamp.domain;

import lombok.*;

import java.util.Currency;
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Price {//value object
    private Currency currency;
    private double amount;

    @Override
    public String toString() {
        return "Price{" +
                "currency=" + currency +
                ", amount=" + amount +
                '}';
    }

    public Price(double amount) {
        this.amount = amount;
        this.currency = Currency.getInstance("USD"); // Set default currency to USD
    }
}
