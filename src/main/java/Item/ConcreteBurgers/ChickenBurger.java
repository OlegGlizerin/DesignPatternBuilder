package Item.ConcreteBurgers;

import Item.AbstractItems.Burger;

public class ChickenBurger extends Burger{
    public String name() {
        return "Chicken Burger";
    }

    public float price() {
        return 35.0f;
    }
}
