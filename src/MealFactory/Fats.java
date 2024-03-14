package MealFactory;

import java.util.Random;

public class Fats extends Macronutrient {
    private static Fats fats = null;
    private final Random RANDOM = new Random();

    private Fats() {

    }

    public static Fats instance() {
        if (fats == null) {
            fats = new Fats();
        }
        return fats;
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
        int pick = RANDOM.nextInt() % 3;
        if (pick == 0) {
            return "Avocado";
        } else if (pick == 1) {
            return "Tuna";
        } else {
            return "Peanuts";
        }
    }

    private String vegan() {
        int pick = RANDOM.nextInt() % 2;
        if (pick == 0) {
            return "Avocado";
        } else {
            return "Peanuts";
        }
    }

    private String nutAllergy() {
        int pick = RANDOM.nextInt() % 3;
        if (pick == 0) {
            return "Avocado";
        } else if (pick == 1) {
            return "Sour cream";
        } else {
            return "Tuna";
        }
    }

    private String noRestriction() {
        int pick = RANDOM.nextInt() % 4;
        if (pick == 0) {
            return "Avocado";
        } else if (pick == 1) {
            return "Sour cream";
        } else if (pick == 2) {
            return "Tuna";
        } else {
            return "Peanuts";
        }
    }
}
