package com.example.shop.ddd_bootcamp.domain.bank;

import java.util.List;
import java.util.UUID;

public class Customer {
    private String CustomerId;
    private List<BankAccount> bankAccounts;
    private Address address;

    public Customer(List<BankAccount> bankAccounts, Address address) {
        CustomerId = UUID.randomUUID().toString();
        this.bankAccounts = bankAccounts;
        this.address = address;
    }

    public void updateAddress(Address address){
        this.address=address;
        bankAccounts.forEach(x->x.setAddress(address));
    }

    public void addAccount(BankAccount bankAccount){

    }
}
