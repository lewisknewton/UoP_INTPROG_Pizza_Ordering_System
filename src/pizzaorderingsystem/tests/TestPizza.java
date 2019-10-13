package pizzaorderingsystem.tests;

import pizzaorderingsystem.classes.Crust;
import pizzaorderingsystem.classes.Pizza;
import pizzaorderingsystem.classes.Sauce;
import pizzaorderingsystem.classes.Size;
import pizzaorderingsystem.classes.Topping;

public class TestPizza {

    public static void main(String[] args) {
        System.out.println("========== Pizza Class Testing - Sample Pizzas 1-4 ==========");

        /*
            (Preparation) Initialising sample pizzas #1 - #4
         */
        Pizza samplePizza1 = new Pizza(Size.MEDIUM, Crust.THIN, Sauce.PESTO,
                Topping.EXTRA_CHEESE, Topping.CHILLI);
        Pizza samplePizza2 = new Pizza(Size.MEDIUM, Crust.STUFFED, Sauce.PESTO,
                Topping.OLIVES, Topping.ONION);
        Pizza samplePizza3 = new Pizza(Size.SMALL, Crust.THIN, Sauce.PESTO,
                Topping.CHILLI, Topping.PEPPERONI);
        Pizza samplePizza4 = new Pizza(Size.SMALL, Crust.THIN, Sauce.PESTO,
                Topping.OLIVES, Topping.OLIVES);

        /*
            (1-1) Outputting formatted strings for all sample pizzas information
         */
        System.out.println("\n--- (1-1) Pizza Display ---\n");

        System.out.println(samplePizza1.getInformation() + '\n');
        System.out.println(samplePizza2.getInformation() + '\n');
        System.out.println(samplePizza3.getInformation() + '\n');
        System.out.println(samplePizza4.getInformation());

        /*
            (2-2) Caculating the cost of all sample pizzas
         */
        System.out.println("\n--- (1-2) Calculating Costs ---\n");
        System.out.println("Total: calculateTotalCost()\n"
                + "Base: calculateBaseCost()\n"
                + "Toppings: calculateToppingsCost()\n");

        System.out.println("SAMPLE:\t\tTOTAL:\t|\tBASE:\t\tTOPPINGS:");
        System.out.println(String.format("1\t\t£%.2f\t|\t£%.2f\t\t£%.2f",
                samplePizza1.calculateTotalCost(),
                samplePizza1.calculateBaseCost(),
                samplePizza1.calculateToppingsCost()
        ));
        System.out.println(String.format("2\t\t£%.2f\t|\t£%.2f\t\t£%.2f",
                samplePizza2.calculateTotalCost(),
                samplePizza2.calculateBaseCost(),
                samplePizza2.calculateToppingsCost()
        ));
        System.out.println(String.format("3\t\t£%.2f\t|\t£%.2f\t\t£%.2f",
                samplePizza3.calculateTotalCost(),
                samplePizza3.calculateBaseCost(),
                samplePizza3.calculateToppingsCost()
        ));
        System.out.println(String.format("4\t\t£%.2f\t|\t£%.2f\t\t£%.2f",
                samplePizza4.calculateTotalCost(),
                samplePizza4.calculateBaseCost(),
                samplePizza4.calculateToppingsCost()
        ));

        /*
            (Extra) Empty constructor, getter/setter methods 
         */
        System.out.println("\n\n========== Pizza Class Testing - Sample Pizza 3 (Alternative Constructor) ==========\n");

        Pizza additionalPizza = new Pizza();

        System.out.println("Test Data:\n "
                + "\tSize.SMALL\n"
                + "\tCrust.THIN\n"
                + "\tSauce.PESTO\n"
                + "\tTopping.CHILLI\n"
                + "\tTopping.PEPPERONI"
        );

        // Core setter methods
        additionalPizza.setSize(Size.SMALL);
        additionalPizza.setCrust(Crust.THIN);
        additionalPizza.setSauce(Sauce.PESTO);
        additionalPizza.setTopping1(Topping.CHILLI);
        additionalPizza.setTopping2(Topping.PEPPERONI);

        System.out.println("\n--- (1-1) Pizza Display (After Setter Methods) ---\n");

        System.out.println(additionalPizza.getInformation());

        System.out.println("\n--- Getter Methods (Core, Cost, Name) ---\n");

        // Core getter methods
        System.out.println("Core (get enumerated values):");
        System.out.println("\t" + additionalPizza.getSize());
        System.out.println("\t" + additionalPizza.getCrust());
        System.out.println("\t" + additionalPizza.getSauce());
        System.out.println("\t" + additionalPizza.getTopping1());
        System.out.println("\t" + additionalPizza.getTopping2());

        // Extra getter methods (on enumerated types)
        System.out.println("\nCost (get costs from enumerated values):");
        System.out.println("\t" + additionalPizza.getSize().getCost());
        System.out.println("\t" + additionalPizza.getCrust().getCost());
        System.out.println("\t" + additionalPizza.getSauce().getCost());
        System.out.println("\t" + additionalPizza.getTopping1().getCost());
        System.out.println("\t" + additionalPizza.getTopping2().getCost());

        System.out.println("\nName (get name from enumerated values):");
        System.out.println("\t" + additionalPizza.getSize().getName());
        System.out.println("\t" + additionalPizza.getCrust().getName());
        System.out.println("\t" + additionalPizza.getSauce().getName());
        System.out.println("\t" + additionalPizza.getTopping1().getName());
        System.out.println("\t" + additionalPizza.getTopping2().getName());
    }
}
