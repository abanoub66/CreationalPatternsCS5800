import MealFactory.*;

import java.util.Scanner;

public class MealDriverUserInputVersion {
    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            String name = getName();
            Plan plan;
            try {
                plan = getPlan();
            } catch (IncorrectInputException e) {
                System.out.println("Wrong input please try again");
                continue;
            }
            Customer current = new Customer(name, plan);
            current.generateMeal();
        }
    }

    private static String getName() {
        System.out.println("Please enter your name and then hit enter");
        return CONSOLE.nextLine();
    }

    private static Plan getPlan() {
        System.out.println("Please enter a meal plan code from the list and then hit enter");
        mealPlanList();
        String p = CONSOLE.nextLine();
        return switch (p) {
            case "NR" -> Plan.NO_RESTRICTION;
            case "P" -> Plan.PALEO;
            case "V" -> Plan.VEGAN;
            case "NA" -> Plan.NUT_ALLERGY;
            default -> throw new IncorrectInputException();
        };
    }

    private static void mealPlanList() {
        System.out.println("No Restrictions (NR)");
        System.out.println("Paleo (P)");
        System.out.println("Vegan (V)");
        System.out.println("Nut Allergy (NA)");
    }
}
