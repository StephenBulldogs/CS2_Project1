/**
 * Represents an amenity that can be added to a reservation.
 *
 *@author Stephen Schwender
 */
public class Amenity {
    private String name;
    private double cost;

    /**
     * Default constructor.
     */
    public Amenity() {
        name = "Kayak Rental";
        cost = 0.00;
    }

    /**
     * Constructor with Arguments for Amenity()
     * Creates an amenity with the specified name and cost.
     *
     * @param name the name of the amenity
     * @param cost the cost of the amenity
     */
    public Amenity(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Returns the name of the amenity.
     *
     * @return the amenity name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the amenity.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the cost of the amenity.
     *
     * @return the amenity cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the cost of the amenity.
     *
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Returns a string with the amenity name and cost.
     *
     * @return a string of the amenity
     */
    @Override
    public String toString() {
        return "Amenity: " + name + " ($" + String.format("%.2f", cost) + ")";
    }
}