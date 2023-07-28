package com.example.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private List<Item> items;

    public List<Item> addItem(Item item){
         this.items.add(item);
         return items;
    }

    public void viewItem(){
        this.items.forEach(item-> System.out.println(item));
    }
}
