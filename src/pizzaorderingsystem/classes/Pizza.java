package pizzaorderingsystem.classes;

public class Pizza {

    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1;
    private Topping topping2;

    /*
        Empty constructor
        to test object initialisation
     */
    public Pizza() {
    }

    /*
        General constructor
        for inclusion of size, crust, sauce, and toppings
     */
    public Pizza(Size sizeIn, Crust crustIn,
            Sauce sauceIn, Topping topping1In, Topping topping2In
    ) {
        size = sizeIn;
        crust = crustIn;
        sauce = sauceIn;
        topping1 = topping1In;
        topping2 = topping2In;
    }

    /*
        Getter methods
        for size, crust, sauce, and toppings
     */
    public Size getSize() {
        return size;
    }

    public Crust getCrust() {
        return crust;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Topping getTopping1() {
        return topping1;
    }

    public Topping getTopping2() {
        return topping2;
    }

    /*
        Setter methods
        for size, crust, sauce, and toppings
     */
    public void setSize(Size newSize) {
        size = newSize;
    }

    public void setCrust(Crust newCrust) {
        crust = newCrust;
    }

    public void setSauce(Sauce newSauce) {
        sauce = newSauce;
    }

    public void setTopping1(Topping newTopping1) {
        topping1 = newTopping1;
    }

    public void setTopping2(Topping newTopping2) {
        topping2 = newTopping2;
    }

    /*
        (1) Method for returning information to the user,
        including costs, size, crust, toppings, and sauce
     */
    public String getInformation() {
        return String.format(
                "TOTAL COST: £%.2f"
                + "\n%s Size: £%.2f"
                + "\n%s Crust: £%.2f"
                + "\nBASE COST: £%.2f"
                + "\n%s Topping: 5* £%.2f = £%.2f"
                + "\n%s Topping: 4* £%.2f = £%.2f"
                + "\n%s Sauce: £%.2f",
                calculateTotalCost(),
                size.getName(), size.getCost(),
                crust.getName(), crust.getCost(),
                calculateBaseCost(),
                topping1.getName(), topping1.getCost(), calculateTopping1Cost(),
                topping2.getName(), topping2.getCost(), calculateTopping2Cost(),
                sauce.getName(), sauce.getCost()
        );
    }

    /*
        (2) Methods for returning calculated costs
        for the toppings, base, and total.
     */
    public double calculateTotalCost() {
        double totalCost = calculateBaseCost() + sauce.getCost()
                + calculateToppingsCost();

        return totalCost;
    }

    public double calculateBaseCost() {
        return size.getCost() + crust.getCost();
    }

    public double calculateToppingsCost() {
        return calculateTopping1Cost() + calculateTopping2Cost();
    }

    public double calculateTopping1Cost() {
        return topping1.getCost() * 5;
    }

    public double calculateTopping2Cost() {
        return topping2.getCost() * 4;
    }
}
