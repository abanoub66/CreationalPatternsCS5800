import PizzaBuilder.*;

public class PizzaDriver {

    public static void main(String[] args) {
        smallPizzaHutPizzaWithThreeToppings();
        mediumPizzaHutPizzaWithSixToppings();
        largePizzaHutPizzaWithNineToppings();
        largePizzaHutPizzaWithThreeToppings();
        smallPizzaHutPizzaWithTwoToppings();
        mediumLittleCaesarsPizzaWithEightToppings();
        smallLittleCaesarsPizzaWithSixToppings();
        smallDominosPizzaWithOneTopping();
        largeDominosPizzaWithThreeToppings();
    }

    private static void smallPizzaHutPizzaWithThreeToppings() {
        Pizza pizza = new PizzaHutPizza(Size.SMALL);
        pizza.set(Topping.PEPPERONI);
        pizza.set(Topping.SAUSAGE);
        pizza.set(Topping.MUSHROOMS);
        pizza.eat();
    }

    private static void mediumPizzaHutPizzaWithSixToppings() {
        Pizza pizza = new PizzaHutPizza(Size.MEDIUM);
        pizza.set(Topping.BACON);
        pizza.set(Topping.ONIONS);
        pizza.set(Topping.EXTRA_CHEESE);
        pizza.set(Topping.PEPPERS);
        pizza.set(Topping.CHICKEN);
        pizza.set(Topping.OLIVES);
        pizza.eat();
    }

    private static void largePizzaHutPizzaWithNineToppings() {
        Pizza pizza = new PizzaHutPizza(Size.LARGE);
        pizza.set(Topping.SPINACH);
        pizza.set(Topping.TOMATO_AND_BASIL);
        pizza.set(Topping.BEEF);
        pizza.set(Topping.HAM);
        pizza.set(Topping.PESTO);
        pizza.set(Topping.SPICY_PORK);
        pizza.set(Topping.HAM_AND_PINEAPPLE);
        pizza.set(Topping.SAUSAGE);
        pizza.set(Topping.PEPPERS);
        pizza.eat();
    }

    private static void largePizzaHutPizzaWithThreeToppings() {
        Pizza pizza = new PizzaHutPizza(Size.LARGE);
        pizza.set(Topping.BACON);
        pizza.set(Topping.EXTRA_CHEESE);
        pizza.set(Topping.CHICKEN);
        pizza.eat();
    }

    private static void smallPizzaHutPizzaWithTwoToppings() {
        Pizza pizza = new PizzaHutPizza(Size.SMALL);
        pizza.set(Topping.PEPPERONI);
        pizza.set(Topping.SAUSAGE);
    }

    private static void mediumLittleCaesarsPizzaWithEightToppings() {
        Pizza pizza = new LittleCaesarsPizza(Size.MEDIUM);
        pizza.set(Topping.SPINACH);
        pizza.set(Topping.TOMATO_AND_BASIL);
        pizza.set(Topping.BEEF);
        pizza.set(Topping.HAM);
        pizza.set(Topping.PESTO);
        pizza.set(Topping.SPICY_PORK);
        pizza.set(Topping.HAM_AND_PINEAPPLE);
        pizza.set(Topping.SAUSAGE);
        pizza.eat();
    }

    private static void smallLittleCaesarsPizzaWithSixToppings() {
        Pizza pizza = new LittleCaesarsPizza(Size.MEDIUM);
        pizza.set(Topping.SPINACH);
        pizza.set(Topping.TOMATO_AND_BASIL);
        pizza.set(Topping.BEEF);
        pizza.set(Topping.HAM);
        pizza.set(Topping.PESTO);
        pizza.set(Topping.SPICY_PORK);
        pizza.eat();
    }

    private static void smallDominosPizzaWithOneTopping() {
        Pizza pizza = new DominosPizza(Size.SMALL);
        pizza.set(Topping.SPICY_PORK);
        pizza.eat();
    }

    private static void largeDominosPizzaWithThreeToppings() {
        Pizza pizza = new DominosPizza(Size.LARGE);
        pizza.set(Topping.PEPPERONI);
        pizza.set(Topping.PESTO);
        pizza.set(Topping.TOMATO_AND_BASIL);
        pizza.eat();
    }
}
