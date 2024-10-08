// Dirigible class representing a specific type of air transportation.
// Worked on by Joseph Carlin


/**
 * The Dirigible class represents a dirigible (airship).
 * It extends the AirTransportation class.
 */
public class Dirigible extends AirTransportation {
    // Attributes
    private double balloonVolume;

    /**
     * Constructs a Dirigible object with the specified attributes.
     *
     * @param capacity       the number of passengers the transportation can accommodate
     * @param maxSpeed       the maximum speed of the transportation in kilometers per hour
     * @param cost           the cost of the transportation
     * @param ticketOrRental the type of service (either "Ticket" or "Rental")
     * @param balloonVolume   the volume of the balloon in cubic meters
     */
    public Dirigible(int capacity, float maxSpeed, double cost, String ticketOrRental, double balloonVolume) {
        super(capacity, maxSpeed, cost, ticketOrRental, "Dirigible");
        this.balloonVolume = balloonVolume;
    }

    /**
     * Gets the volume of the dirigible's balloon.
     *
     * @return the volume of the balloon in cubic meters.
     */
    public double getBalloonVolume() {
        return balloonVolume;
    }

    /**
     * Sets the volume of the dirigible's balloon.
     *
     * @param balloonVolume the volume of the balloon in cubic meters.
     */
    public void setBalloonVolume(double balloonVolume) {
        this.balloonVolume = balloonVolume;
    }

    /**
     * Returns a string representation of the dirigible object, showing all its attributes.
     *
     * @return a string representation of the dirigible object.
     */
    @Override
    public String toString() {
        return "Dirigible: " + super.toString() + ", Balloon Volume: " + balloonVolume + " cubic meters";
    }
}
