package Item;

import Packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
