package Item.ConcreteDrinks;

import Item.AbstractItems.ColdDrink;

public class Coke extends ColdDrink {
    public String name() {
        return "Coke";
    }

    public float price() {
        return 9f;
    }
}
