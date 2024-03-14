package MealFactory;

public class Customer {
    public final String NAME;
    public final Plan PLAN;

    public Customer(String name, Plan plan) {
        NAME = name;
        PLAN = plan;
    }

    public void generateMeal() {
        Macronutrient.instance().meal(PLAN);
    }
}
