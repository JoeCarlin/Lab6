// Helicopter class representing a specific type of air transportation.
// Worked on by Joseph Carlin

/**
 * The Helicopter class represents a helicopter.
 * It extends the AirTransportation class.
 */
public class Helicopter extends AirTransportation {
    // Attributes
    private double maxAltitude;

    /**
     * Constructs a Helicopter object with the specified attributes.
     *
     * @param capacity       the number of passengers the transportation can accommodate
     * @param maxSpeed       the maximum speed of the transportation in kilometers per hour
     * @param cost           the cost of the transportation
     * @param ticketOrRental the type of service (either "Ticket" or "Rental")
     * @param maxAltitude    the maximum altitude the helicopter can reach in meters
     */
    public Helicopter(int capacity, float maxSpeed, double cost, String ticketOrRental, double maxAltitude) {
        super(capacity, maxSpeed, cost, ticketOrRental, "Helicopter");
        this.maxAltitude = maxAltitude;
    }

    /**
     * Gets the maximum altitude of the helicopter.
     *
     * @return the maximum altitude of the helicopter in meters.
     */
    public double getMaxAltitude() {
        return maxAltitude;
    }

    /**
     * Sets the maximum altitude of the helicopter.
     *
     * @param maxAltitude the maximum altitude of the helicopter in meters.
     */
    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    /**
     * Returns a string representation of the helicopter object, showing all its attributes.
     *
     * @return a string representation of the helicopter object.
     */
    @Override
    public String toString() {
        return "Helicopter: " + super.toString() + ", Max Altitude: " + maxAltitude + " meters";
    }
}
