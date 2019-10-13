package pizzaorderingsystem.classes;

public enum Topping {
    NONE(0, "None"), OLIVES(0.08, "Olive"),
    EXTRA_CHEESE(0.02, "Extra Cheese"), CHILLI(0.06, "Chilli"),
    PEPPERONI(0.1, "Pepperoni"), MUSHROOM(0.03, "Mushroom"),
    ROCKET(0.05, "Rocket"), JALAPENOS(0.2, "Jalapenos"),
    ONION(0.07, "Onion"), ANCHOVY(0.09, "Anchovy");

    private double cost;
    private String name;

    Topping(double costIn, String nameIn) {
        cost = costIn;
        name = nameIn;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
