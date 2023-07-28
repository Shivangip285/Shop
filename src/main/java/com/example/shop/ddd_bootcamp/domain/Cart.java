package com.example.shop.ddd_bootcamp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Cart {//entity
    private final List<Item> items;
    private final List<Item> removedItems;
    private String id= UUID.randomUUID().toString();



    public Cart(List<Item> items, List<Item> removedItems) {
        this.items = items;
        this.removedItems = removedItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return items.equals(cart.items) && removedItems.equals(cart.removedItems) && id.equals(cart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, removedItems, id);
    }

    public List<Item> addItem(Item item){
        if(removedItems.contains(item)){
            System.out.println("The items is removed from removedItems while adding:" + item);
            removedItems.remove(item);
        }
         this.items.add(item);
         return items;
    }

    public List<Item> getItems() {
        return this.items;
    }
    public void viewItem(List<Item> items){
        System.out.println("The items in the cart are:");
        items.forEach(item-> System.out.println(item));
    }

    public List<Item> removeItem(Item item){
        this.items.remove(item);
        this.removedItems.add(item);
        return items;
    }

    public String createOrder(){
        List<Product> productList=new ArrayList<>();
       getItems().forEach(x->productList.add(x.product));
        Order order = new Order(productList);
        return order.getId();
    }
}
