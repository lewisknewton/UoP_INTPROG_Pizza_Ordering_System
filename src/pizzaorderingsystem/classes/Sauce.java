package pizzaorderingsystem.classes;

public enum Sauce {
    TOMATO(0, "Tomato"), PESTO(0.5, "Pesto");

    private double cost;
    private String name;

    Sauce(double costIn, String nameIn) {
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
