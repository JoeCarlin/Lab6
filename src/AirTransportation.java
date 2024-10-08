<<<<<<< Updated upstream
public class AirTransportation {
    // attributes



    public AirTransportation(){


    }


=======
// AirTransportation class representing air-based modes of transportation.
// Worked on by Joseph Carlin


/**
 * The AirTransportation class represents a general mode of air transportation.
 * It extends the Transportation class.
 */
public class AirTransportation extends Transportation {
    // Attributes
    private String airType;

    /**
     * Constructs an AirTransportation object with the specified attributes.
     *
     * @param capacity       the number of passengers the transportation can accommodate
     * @param maxSpeed       the maximum speed of the transportation in kilometers per hour
     * @param cost           the cost of the transportation
     * @param ticketOrRental the type of service (either "Ticket" or "Rental")
     * @param airType        the type of air transportation (e.g., "Plane", "Helicopter")
     */
    public AirTransportation(int capacity, float maxSpeed, double cost, String ticketOrRental, String airType) {
        super(capacity, maxSpeed, cost, ticketOrRental);
        this.airType = airType;
    }

    /**
     * Gets the type of air transportation.
     *
     * @return the type of air transportation.
     */
    public String getAirType() {
        return airType;
    }

    /**
     * Sets the type of air transportation.
     *
     * @param airType the type of air transportation.
     */
    public void setAirType(String airType) {
        this.airType = airType;
    }

    /**
     * Returns a string representation of the air transportation object, showing all its attributes.
     *
     * @return a string representation of the air transportation object.
     */
    @Override
    public String toString() {
        return "Air Transportation: " + super.toString() + ", Air Type: " + airType;
    }
>>>>>>> Stashed changes
}
