public class Amenity {
    private String name;
    private double cost;

    public Amenity() {
        name = "Kayak Rental";
        cost = 0.00;
    }

    public Amenity(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Amenity: " + name + " ($" + String.format("%.2f", cost) + ")";
    }
}
