package PizzaBuilder;

import java.util.LinkedList;
import java.util.List;

public class DominosPizza implements Pizza {
    public final String CHAIN = "Domino's";
    public final Size SIZE;
    public List<Topping> toppings;

    public DominosPizza(Size size) {
        SIZE = size;
        toppings = new LinkedList<>();
    }

    @Override
    public void eat() {
        System.out.println(sizeToString() + " " + CHAIN + " pizza with " + toppingsToString());
    }

    @Override
    public void set(Topping topping) {
        toppings.add(topping);
    }

    private String sizeToString() {
        if (SIZE.equals(Size.SMALL)) {
            return "Small";
        }
        else if (SIZE.equals(Size.MEDIUM)) {
            return "Medium";
        }
        else {
            return "Large";
        }
    }

    private String toppingsToString() {
        StringBuilder toppingsAsString = new StringBuilder();
        for (Topping t : toppings) {
            toppingsAsString.append(t.toString().toLowerCase()).append(", ");
        }
        return toppingsAsString.substring(0, toppingsAsString.toString().length() - 2).replace('_', ' ');
    }
}
