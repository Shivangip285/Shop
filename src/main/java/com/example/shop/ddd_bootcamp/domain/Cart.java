package com.example.shop.ddd_bootcamp.domain;

import lombok.Data;

import java.util.List;
@Data
public class Cart {
    private final List<Item> items;
    private final List<Item> removedItems;

    public Cart(List<Item> items, List<Item> removedItems) {
        this.items = items;
        this.removedItems = removedItems;
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
}
