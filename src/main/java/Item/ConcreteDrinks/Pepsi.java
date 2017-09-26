package Item.ConcreteDrinks;

import Item.AbstractItems.ColdDrink;

public class Pepsi extends ColdDrink {
    public String name() {
        return "Pepsi";
    }

    public float price() {
        return 10f;
    }
}
