package com.example.shop;

import com.example.shop.ddd_bootcamp.domain.Cart;
import com.example.shop.ddd_bootcamp.domain.Item;
import com.example.shop.ddd_bootcamp.domain.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CartTest {

    @Test
    public void shouldAddPencilToCartItem(){
        Cart cart=new Cart(new ArrayList<>());
        Item pencil = new Item(new Product("Apple pencil"),2);
        Item sonyWirelessHeadphone = new Item(new Product("Sony Wireless headphone"),5);
        cart.viewItem();

        cart.addItem(pencil);
        cart.addItem(sonyWirelessHeadphone);

        assertThat(cart.getItems()).isEqualTo(List.of(pencil,sonyWirelessHeadphone));
        assertThat(cart.getItems().get(0).getProduct()).isEqualTo(new Product("Apple pencil"));
    }
}