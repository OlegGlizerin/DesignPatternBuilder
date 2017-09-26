package MealBuilder;

import Item.ConcreteBurgers.ChickenBurger;
import Item.ConcreteBurgers.VegBurger;
import Item.ConcreteDrinks.Coke;
import Item.ConcreteDrinks.Pepsi;
import Meal.Meal;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
