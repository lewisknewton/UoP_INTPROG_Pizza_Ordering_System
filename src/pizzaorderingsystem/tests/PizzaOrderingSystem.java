package pizzaorderingsystem.tests;

import java.util.ArrayList;
import java.util.Arrays;
import pizzaorderingsystem.classes.Crust;
import pizzaorderingsystem.classes.Order;
import pizzaorderingsystem.classes.Pizza;
import pizzaorderingsystem.classes.Sauce;
import pizzaorderingsystem.classes.Size;
import pizzaorderingsystem.classes.Topping;

public class PizzaOrderingSystem {

    public static void main(String[] args) {
        /*
            (1) Pizza Class Testing
            --------------------------------------------------
            To test the Pizza class on its own, please open 'TestPizza'
         */
        System.out.println("========== (1) Pizza Class Testing - Sample Pizzas 1-4 ==========");

        // (Preparation) Initialising sample pizzas #1 - #4
        Pizza samplePizza1 = new Pizza(Size.MEDIUM, Crust.THIN, Sauce.PESTO,
                Topping.EXTRA_CHEESE, Topping.CHILLI);
        Pizza samplePizza2 = new Pizza(Size.MEDIUM, Crust.STUFFED, Sauce.PESTO,
                Topping.OLIVES, Topping.ONION);
        Pizza samplePizza3 = new Pizza(Size.SMALL, Crust.THIN, Sauce.PESTO,
                Topping.CHILLI, Topping.PEPPERONI);
        Pizza samplePizza4 = new Pizza(Size.SMALL, Crust.THIN, Sauce.PESTO,
                Topping.OLIVES, Topping.OLIVES);

        // (1-1) Outputting formatted strings for all sample pizzas information
        System.out.println("\n--- (1-1) Pizza Display ---\n");

        System.out.println(samplePizza1.getInformation() + '\n');
        System.out.println(samplePizza2.getInformation() + '\n');
        System.out.println(samplePizza3.getInformation() + '\n');
        System.out.println(samplePizza4.getInformation());

        // (1-2) Caculating the cost of all sample pizzas
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

        // (Extra) Empty constructor, getter/setter methods 
        System.out.println("\n\n========== (1) Pizza Class Testing - Sample Pizza 3 (Alternative Constructor) ==========\n");

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

        /*
            (2) Order Class Testing
            --------------------------------------------------
            To test the Order class on its own, please open 'TestOrder'
         */
        System.out.println("\n========== (2) Order Class Testing - Sample Pizzas 1-4 ==========");

        Order testOrder1 = new Order();

        // (2-1) Outputting details for testOrder1 (empty)
        System.out.println("\n--- (2-1) testOrder1 - Order Information (Empty Order) ---\n");
        System.out.println(testOrder1.getOrderInformation());

        // (2-2) Calculating the cost of testOrder1 (empty)
        System.out.println("\n--- (2-2) testOrder1 - Order Cost (Empty Order) ---\n");
        System.out.println(String.format("£%.2f", testOrder1.calculateOrderCost()));

        // (2-3) Retrieving the number of pizzas in testOrder1 (empty)
        System.out.println("\n--- (2-3) testOrder1 - Pizza Count (Empty Order) ---\n");
        System.out.println("Count: " + testOrder1.countPizzas());

        /*
            (2-4) Adding sample pizzas to testOrder1
                Tests: (samplePizza1, samplePizza2, samplePizza3)
                       (SMALL, THIN, PESTO, OLIVES, OLIVES)
         */
        System.out.println("\n--- (2-4) testOrder1 - Adding Sample Pizzas 1-3 ---\n");
        testOrder1.addPizza(samplePizza1);
        testOrder1.addPizza(samplePizza2);
        testOrder1.addPizza(samplePizza3);

        System.out.println(testOrder1.getOrderInformation());

        System.out.println(String.format("\n(2-2) Order cost: £%.2f",
                testOrder1.calculateOrderCost()));
        System.out.println("(2-3) Count: " + testOrder1.countPizzas());

        System.out.println("\n--- (2-4) testOrder1 - Adding Sample Pizza 4 (Alternative Method) ---\n");
        testOrder1.addPizza(Size.SMALL, Crust.THIN, Sauce.PESTO,
                Topping.OLIVES, Topping.OLIVES);

        System.out.println(testOrder1.getOrderInformation());

        System.out.println(String.format("\n(2-2) Order cost: £%.2f",
                testOrder1.calculateOrderCost()));
        System.out.println("(2-3) Count: " + testOrder1.countPizzas());

        /*
            (2-5) Selecting and deleting a pizza in testOrder1
                Tests: samplePizza1 (index of 0), samplePizza3 
         */
        System.out.println("\n--- (2-5) testOrder1 - Deleting Pizza at Index 0 (Sample Pizza 1) ---\n");
        testOrder1.deletePizza(0);

        System.out.println(testOrder1.getOrderInformation());

        System.out.println(String.format("\n(2-2) Order cost: £%.2f",
                testOrder1.calculateOrderCost()));
        System.out.println("(2-3) Count: " + testOrder1.countPizzas());

        System.out.println("\n--- (2-5) testOrder1 - Deleting Pizza by Object Reference (Sample Pizza 3) ---\n");
        testOrder1.deletePizza(samplePizza3);

        System.out.println(testOrder1.getOrderInformation());

        System.out.println(String.format("\n(2-2) Order cost: £%.2f",
                testOrder1.calculateOrderCost()));
        System.out.println("(2-3) Count: " + testOrder1.countPizzas());

        /*
            (2-6) Selecting and updating a pizza in testOrder1
                Tests: (index 0, Medium, Stuffed, Pesto, Olive, Onion), 
                       (index 1, samplePizza1)
         */
        System.out.println("\n--- (2-6) testOrder1 - Updating Pizza at Index 0 (Sample Pizza 2) ---\n");

        System.out.println("Test Data:\n "
                + "\tSize.MEDIUM\n"
                + "\tCrust.STUFFED\n"
                + "\tSauce.PESTO\n"
                + "\tTopping.OLIVES\n"
                + "\tTopping.ONION\n"
        );

        testOrder1.updatePizza(0, Size.MEDIUM, Crust.STUFFED,
                Sauce.PESTO, Topping.OLIVES, Topping.ONION);

        System.out.println(testOrder1.getOrderInformation());

        System.out.println(String.format("\n(2-2) Order cost: £%.2f",
                testOrder1.calculateOrderCost()));
        System.out.println("(2-3) Count: " + testOrder1.countPizzas());

        System.out.println("\n--- (2-6) testOrder1 - Updating Pizza at Index 1 (Sample Pizza 4) with Sample Pizza 1 ---\n");
        testOrder1.updatePizza(1, samplePizza1);

        System.out.println(testOrder1.getOrderInformation());

        System.out.println(String.format("\n(2-2) Order cost: £%.2f",
                testOrder1.calculateOrderCost()));
        System.out.println("(2-3) Count: " + testOrder1.countPizzas());

        /*
            (Extra) Testing testOrder2,
                    using the constructor with an ArrayList as its parameter
         */
        ArrayList<Pizza> samplePizzas = new ArrayList<>(
                Arrays.asList(samplePizza1, samplePizza2,
                        samplePizza3, samplePizza4)
        );
        testOrder1.setPizzas(samplePizzas);

        System.out.println("\n--- (Extra) testOrder1 - Order Information (After Setter Method) ---\n");

        System.out.println("Test Data in ArrayList (samplePizzas):\n "
                + "\tsamplePizza1\n"
                + "\tsamplePizza2\n"
                + "\tsamplePizza3\n"
                + "\tsamplePizza4\n"
        );

        System.out.println(testOrder1.getOrderInformation());

        System.out.println(String.format("\n(2-2) Order cost: £%.2f",
                testOrder1.calculateOrderCost()));
        System.out.println("(2-3) Count: " + testOrder1.countPizzas());

        System.out.println("\n--- (Extra) testOrder1 - Getter/Setter methods ---\n");
        System.out.println("Pizza at index 0:\n\t" + testOrder1.getPizza(0));
        System.out.println("Pizza indexes:\n\t" + testOrder1.getPizzaIndexes());
        System.out.println("Pizzas ArrayList:\n\t" + testOrder1.getPizzas());
    }
}
