package Meal;

import java.util.ArrayList;
import java.util.List;

import Item.Item;

public class Meal {
    private List<Item> items = new ArrayList<Item>();


    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float totalCost = 0;
        for(Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems() {
        System.out.println("The items are:");
        for(Item item : items) {
            System.out.println(item.name());
        }
    }
}
