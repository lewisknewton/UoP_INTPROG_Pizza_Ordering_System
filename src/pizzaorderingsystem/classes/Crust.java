package pizzaorderingsystem.classes;

public enum Crust {
    THIN(1.08, "Thin"), DEEP(1.1, "Deep"), STUFFED(2.14, "Stuffed");

    private double cost;
    private String name;

    Crust(double costIn, String nameIn) {
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
