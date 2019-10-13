package pizzaorderingsystem.classes;

import java.util.ArrayList;

public class Order {

    private ArrayList<Pizza> pizzas;

    /*
        Empty constructor
        for creating an empty ArrayList of Pizza objects
     */
    public Order() {
        pizzas = new ArrayList();
    }

    /*
        General constructor
        for inclusion of ArrayList of Pizza objects
     */
    public Order(ArrayList<Pizza> pizzasIn) {
        pizzas = pizzasIn;
    }

    /*
        Getter methods
        for pizzas ArrayList, individual Pizza objects, and pizza indexes 
     */
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public Pizza getPizza(int pizzaIndex) {
        if (!pizzas.isEmpty()) {
            return pizzas.get(pizzaIndex);
        }

        return pizzas.get(0);
    }

    public ArrayList<String> getPizzaIndexes() {
        ArrayList<String> pizzaIndexes = new ArrayList<>();

        if (!pizzas.isEmpty()) {
            for (Pizza orderedPizza : pizzas) {
                pizzaIndexes.add(String.valueOf(pizzas.indexOf(orderedPizza)));
            }
        }

        return pizzaIndexes;
    }

    /*
        Setter method
        for setting a new ArrayList of Pizza objects
     */
    public void setPizzas(ArrayList<Pizza> newPizzas) {
        pizzas = newPizzas;
    }

    /*
        (1) Method for returning information to the user,
            including costs, size, crust, toppings, and sauce of ordered pizzas
     */
    public String getOrderInformation() {
        String orderInformation = "";

        if (!pizzas.isEmpty()) {
            for (Pizza orderedPizza : pizzas) {
                orderInformation += orderedPizza.getInformation();

                if (pizzas.indexOf(orderedPizza) < pizzas.size() - 1) {
                    orderInformation += "\n\n";
                }
            }
        } else {
            orderInformation += "There are no pizzas to display. "
                    + "\n\nPlease add a new pizza to the order.";
        }

        return orderInformation;
    }

    /*
        (2) Method for returning calculated total cost
     */
    public double calculateOrderCost() {
        double totalCost = 0;

        for (Pizza orderedPizza : pizzas) {
            totalCost += orderedPizza.calculateTotalCost();
        }

        return totalCost;
    }

    /*
        (3) Method for returning the number of pizzas in the order
     */
    public int countPizzas() {
        return pizzas.size();
    }

    /*
        (4) Methods for adding a pizza to the order, accepting either:
            - a Pizza object as an argument
            - size, crust, sauce, and topping choices as arguments
     */
    public void addPizza(Pizza newPizza) {
        pizzas.add(newPizza);
    }

    public void addPizza(Size sizeIn, Crust crustIn,
            Sauce sauceIn, Topping topping1In, Topping topping2In
    ) {
        Pizza newPizza = new Pizza(sizeIn, crustIn, sauceIn,
                topping1In, topping2In);
        pizzas.add(newPizza);
    }

    /*
        (5) Methods to select and delete a 
            specific pizza from the order, accepting either:
            - an index of a pizza stored in the ArrayList
            - a Pizza object stored in the ArrayList
     */
    public void deletePizza(int pizzaIndex) {
        pizzas.remove(pizzaIndex);
    }

    public void deletePizza(Pizza pizzaToDelete) {
        pizzas.remove(pizzaToDelete);
    }

    /*
        (6) Method to select and update a 
            specific pizza from the order, accepting either:
            - an index of a pizza stored in the ArrayList and a Pizza object
            - an index of a pizza stored in the ArrayList and chosen options
     */
    public Pizza updatePizza(int pizzaIndex, Pizza updatedPizza) {
        for (Pizza orderedPizza : pizzas) {
            if (pizzas.indexOf(orderedPizza) == pizzaIndex) {
                orderedPizza.setSize(updatedPizza.getSize());
                orderedPizza.setCrust(updatedPizza.getCrust());
                orderedPizza.setSauce(updatedPizza.getSauce());
                orderedPizza.setTopping1(updatedPizza.getTopping1());
                orderedPizza.setTopping2(updatedPizza.getTopping2());
            }
        }

        return pizzas.get(pizzaIndex);
    }

    public Pizza updatePizza(int pizzaIndex, Size newSize, Crust newCrust,
            Sauce newSauce, Topping newTopping1, Topping newTopping2
    ) {
        for (Pizza orderedPizza : pizzas) {
            if (pizzas.indexOf(orderedPizza) == pizzaIndex) {
                orderedPizza.setSize(newSize == null
                        ? orderedPizza.getSize()
                        : newSize);
                orderedPizza.setCrust(newCrust == null
                        ? orderedPizza.getCrust()
                        : newCrust);
                orderedPizza.setSauce(newSauce == null
                        ? orderedPizza.getSauce()
                        : newSauce);
                orderedPizza.setTopping1(newTopping1 == null
                        ? orderedPizza.getTopping1()
                        : newTopping1);
                orderedPizza.setTopping2(newTopping2 == null
                        ? orderedPizza.getTopping2()
                        : newTopping2);
            }
        }

        return pizzas.get(pizzaIndex);
    }
}
