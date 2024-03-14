package MealFactory;

import java.util.Random;

public class Carbs extends Macronutrient {
    private static Carbs carbs = null;
    private final Random RANDOM = new Random();

    private Carbs() {
    }

    public static Carbs instance() {
        if (carbs == null) {
            carbs = new Carbs();
        }
        return carbs;
    }

    @Override
    public void meal(Plan plan) {
        if (plan.equals(Plan.PALEO)) {
            System.out.println(paleo());
        } else if (plan.equals(Plan.VEGAN)) {
            System.out.println(vegan());
        } else if (plan.equals(Plan.NUT_ALLERGY)) {
            System.out.println(nutAllergy());
        } else {
            System.out.println(noRestriction());
        }
    }

    private String paleo() {
        return "Pistachio";
    }

    private String vegan() {
        int pick = RANDOM.nextInt() % 3;
        if (pick == 0) {
            return "Bread";
        } else if (pick == 1) {
            return "Lentils";
        } else {
            return "Pistachio";
        }
    }

    private String nutAllergy() {
        int pick = RANDOM.nextInt() % 3;
        if (pick == 0) {
            return "Cheese";
        } else if (pick == 1) {
            return "Bread";
        } else {
            return "Lentils";
        }
    }

    private String noRestriction() {
        int pick = RANDOM.nextInt() % 4;
        if (pick == 0) {
            return "Cheese";
        } else if (pick == 1) {
            return "Bread";
        } else if (pick == 2) {
            return "Lentils";
        } else {
            return "Pistachio";
        }
    }
}
