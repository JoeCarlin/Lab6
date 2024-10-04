/**
 * LandTransportation class is the superclass for all
 * forms of land transportation.
 * Extends the Transportation class.
 */
class LandTransportation extends Transportation {
    private int numWheels; // Number of wheels

    /**
     * @param capacity, seating capacity.
     * @param maxSpeed, Maximum speed.
     * @param cost, Cost of the ticket or rental.
     * @param ticketOrRental, Requires a ticket or a rental.
     * @param numWheels, Number of wheels.
     */
    public LandTransportation(int capacity, float maxSpeed, double cost, String ticketOrRental, int numWheels) {
        super(capacity, maxSpeed, cost, ticketOrRental);  // Call transportation constructor
        this.numWheels = numWheels;
    }

    /**
     * Gets the number of wheels on the mode of transportation.
     * @return numWheels, the number of wheels.
     */
    public int getWheels(){return numWheels;} // Returns number of wheels

    /**
     * Sets the number of wheels for the desired transportation object.
     * @param numWheels, the number of wheels.
     */
    public void setWheels(int numWheels){this.numWheels = numWheels;} // Sets number of wheels

    /**
     * Returns the string representation of the LandTransportation object.
     * Shows Capacity, maximum speed, cost, ticket or rental, and the number of wheels.
     * @return String representation of the LandTransportation object.
     */
    @Override
    public String toString() {
        return super.toString() + ", Number of wheels: " + numWheels;
    }
}
