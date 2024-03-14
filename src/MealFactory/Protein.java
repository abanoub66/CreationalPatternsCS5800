package MealFactory;

import java.util.Random;

public class Protein extends Macronutrient {
    private static Protein protein = null;
    private final Random RANDOM = new Random();

    private Protein() {}

    public static Protein instance() {
        if (protein == null) {
            protein = new Protein();
        }
        return protein;
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
            return "Fish";
        } else if (pick == 1) {
            return "Chicken";
        } else {
            return "Beef";
        }
    }

    private String vegan() {
        return "Tofu";
    }

    private String nutAllergy() {
        return noRestriction();
    }

    private String noRestriction() {
        int pick = RANDOM.nextInt() % 4;
        if (pick == 0) {
            return "Fish";
        } else if (pick == 1) {
            return "Chicken";
        } else if (pick == 2){
            return "Beef";
        } else {
            return "Tofu";
        }
    }
}
