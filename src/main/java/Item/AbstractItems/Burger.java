package Item.AbstractItems;

import Item.Item;
import Packing.Wrapper;
import Packing.Packing;

public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

}
