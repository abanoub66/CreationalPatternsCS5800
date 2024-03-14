import MealFactory.Customer;
import MealFactory.Plan;

import java.util.LinkedList;
import java.util.List;

public class MealDriverTurnInVersion {

    public static void main(String[] args) {
        List<Customer> customers = generateCustomers();
        for (Customer c : customers) {
            System.out.println(c.NAME);
            c.generateMeal();
            System.out.println();
        }
    }

    public static List<Customer> generateCustomers() {
        List<Customer> customers = new LinkedList<>();
        customers.add(new Customer("No Restriction", Plan.NO_RESTRICTION));
        customers.add(new Customer("Paleo", Plan.PALEO));
        customers.add(new Customer("Vegan", Plan.VEGAN));
        customers.add(new Customer("Nut Allergy", Plan.NUT_ALLERGY));
        customers.add(new Customer("NR 2", Plan.NO_RESTRICTION));
        customers.add(new Customer("V 2", Plan.VEGAN));
        return customers;
    }
}
