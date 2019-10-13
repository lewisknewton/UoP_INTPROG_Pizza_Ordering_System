package pizzaorderingsystem.classes;

public enum Size {
    SMALL(9.45, "Small"), MEDIUM(11.87, "Medium"), LARGE(15.9, "Large");

    private double cost;
    private String name;

    Size(double costIn, String nameIn) {
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
