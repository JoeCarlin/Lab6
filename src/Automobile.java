/**
 * The Automobile class is a subclass of LandTransportation.
 * Contains the constructor for an automobile object.
 */
class Automobile extends LandTransportation {
    private String isConvertible;
    /**
     * @param capacity, seating capacity.
     * @param maxSpeed, Maximum speed.
     * @param cost, Cost of the ticket or rental.
     * @param ticketOrRental, Requires a ticket or a rental.
     * @param numWheels, Number of wheels.
     * @param isConvertible, Is it a convertible.
     */
    public Automobile(int capacity, float maxSpeed, double cost, String ticketOrRental, int numWheels, String isConvertible) {
        super(capacity, maxSpeed, cost, ticketOrRental, numWheels);  // Call LandTransportation constructor
        this.isConvertible = isConvertible;
    }

    /**
     * Returns if the automobile is convertible or not.
     * @return isConvertible, If it is a convertible or not.
     */
    public String getIsConvertible(){return isConvertible;}

    /**
     * Sets if the automobile is convertible or not.
     * @param isConvertible, Is it a convertible or not.
     */
    public void setIsConvertible(String isConvertible){this.isConvertible = isConvertible;}
    /**
     * Returns the string representation of the Automobile object.
     * Shows Capacity, maximum speed, cost, ticket or rental, number of wheels, and if it is a convertible.
     * @return String representation of the Automobile object.
     */
    @Override
    public String toString() {
        return super.toString() + ", Convertible: " + isConvertible;
    }
}
