package MealFactory;

public class Macronutrient {
    private static Macronutrient macronutrient = null;

    Macronutrient() {

    }

    public static Macronutrient instance() {
        if (macronutrient == null) {
            macronutrient = new Macronutrient();
        }
        return macronutrient;
    }

    public void meal(Plan plan) {
        Carbs.instance().meal(plan);
        Protein.instance().meal(plan);
        Fats.instance().meal(plan);
    }
}
