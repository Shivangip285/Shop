package com.example.shop;

import com.example.shop.ddd_bootcamp.domain.Cart;
import com.example.shop.ddd_bootcamp.domain.Item;
import com.example.shop.ddd_bootcamp.domain.Price;
import com.example.shop.ddd_bootcamp.domain.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CartTest {

    @Test
    public void shouldAddPencilToCartItem(){
        Cart cart=new Cart(new ArrayList<>(),new ArrayList<>());
        Item pencil = new Item(new Product("Apple pencil",new Price(10.7)),2);
        Item sonyWirelessHeadphone = new Item(new Product("Sony Wireless headphone",new Price(Currency.getInstance("CAD"),10.7)),5);
        cart.viewItem(List.of(pencil,sonyWirelessHeadphone));

        cart.addItem(pencil);
        cart.addItem(sonyWirelessHeadphone);

        assertThat(cart.getItems()).isEqualTo(List.of(pencil,sonyWirelessHeadphone));

        cart.removeItem(pencil);
        assertThat(cart.getItems()).isEqualTo(List.of(sonyWirelessHeadphone));
        assertThat(cart.getRemovedItems()).isEqualTo(List.of(pencil));

        cart.addItem(pencil);
        assertThat(cart.getItems()).isEqualTo(List.of(sonyWirelessHeadphone, pencil));
        assertThat(cart.getRemovedItems()).isEqualTo(List.of());

        cart.removeItem(pencil);

        Item item1 = new Item(new Product("Sony Wireless headphone", new Price(10.7)), 1);
        Item item2 = new Item(new Product("Sony Wireless headphone",new Price(Currency.getInstance("CAD"),10.7)), 1);
        Cart cart1 = new Cart(new ArrayList<>(),new ArrayList<>());
        Cart cart2 = new Cart(new ArrayList<>(),new ArrayList<>());
        cart1.addItem(item1);
        cart2.addItem(item2);
        assertThat(cart1).isNotEqualTo(cart2);
    }
}