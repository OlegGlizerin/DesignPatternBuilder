import MealBuilder.MealBuilder;
import Meal.Meal;
public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilderNonVegan = new MealBuilder();
        Meal mealNonVegan = mealBuilderNonVegan.prepareNonVegMeal();
        mealNonVegan.showItems();
        System.out.println("Total cost for non vegan meal: " + mealNonVegan.getCost());

        MealBuilder mealBuilderVegan = new MealBuilder();
        Meal mealVegan = mealBuilderVegan.prepareVegMeal();
        mealVegan.showItems();
        System.out.println("Total cost for vegan meal: " + mealVegan.getCost());


    }
}
