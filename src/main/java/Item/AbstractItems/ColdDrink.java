package Item.AbstractItems;

import Item.Item;
import Packing.Bottle;
import Packing.Packing;

public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
}
