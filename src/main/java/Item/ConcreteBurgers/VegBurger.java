package Item.ConcreteBurgers;

import Item.AbstractItems.Burger;

public class VegBurger extends Burger {
    public String name() {
        return "VegBurger";
    }

    public float price() {
        return 25.0f;
    }
}
