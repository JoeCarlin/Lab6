/**
 * The Bike class is a subclass of LandTransportation.
 * Contains the constructor for a bike object.
 */
class Bike extends LandTransportation {
    private String helmetIncluded;
    /**
     * @param capacity, seating capacity.
     * @param maxSpeed, Maximum speed.
     * @param cost, Cost of the ticket or rental.
     * @param ticketOrRental, Requires a ticket or a rental.
     * @param numWheels, Number of wheels.
     * @param helmetIncluded, Is a helmet included in the rental.
     */
    public Bike(int capacity, float maxSpeed, double cost, String ticketOrRental, int numWheels, String helmetIncluded) {
        super(capacity, maxSpeed, cost, ticketOrRental, numWheels);// Call LandTransportation constructor
        this.helmetIncluded = helmetIncluded;
    }

    /**
     * Returns if a helmet is included or not in the rental.
     * @return helmetIncluded, If a helmet is included.
     */
    public String getHelmetIncluded(){return helmetIncluded;}

    /**
     * Sets if a helmet is included or not.
     * @param helmetIncluded, If a helmet is included or not.
     */
    public void setHelmetIncluded(String helmetIncluded){this.helmetIncluded = helmetIncluded;}

    /**
     * Returns the string representation of the Bike object.
     * Shows Capacity, maximum speed, cost, ticket or rental, number of wheels, and if a helmet is included.
     * @return String representation of the Bike object.
     */
    @Override
    public String toString() {
        return super.toString() +", Helmet Included: " + helmetIncluded;
    }
}
