// HotAirBalloon class representing a specific type of air transportation.
// Worked on by Joseph Carlin

/**
 * The HotAirBalloon class represents a hot air balloon.
 * It extends the AirTransportation class.
 */
public class HotAirBalloon extends AirTransportation {
    // Attributes
    private double balloonVolume;  // The volume of the balloon in cubic meters.

    /**
     * Constructs a HotAirBalloon object with the specified attributes.
     *
     * @param capacity       the number of passengers the balloon can accommodate
     * @param maxSpeed       the maximum speed of the balloon in kilometers per hour
     * @param cost           the cost of the transportation
     * @param ticketOrRental the type of service (either "Ticket" or "Rental")
     * @param balloonVolume  the volume of the hot air balloon in cubic meters
     */
    public HotAirBalloon(int capacity, float maxSpeed, double cost, String ticketOrRental, double balloonVolume) {
        super(capacity, maxSpeed, cost, ticketOrRental, "Hot Air Balloon");
        this.balloonVolume = balloonVolume;
    }

    /**
     * Gets the balloon volume.
     *
     * @return the volume of the balloon in cubic meters.
     */
    public double getBalloonVolume() {
        return balloonVolume;
    }

    /**
     * Sets the balloon volume.
     *
     * @param balloonVolume the volume of the balloon in cubic meters.
     */
    public void setBalloonVolume(double balloonVolume) {
        this.balloonVolume = balloonVolume;
    }

    /**
     * Returns a string representation of the hot air balloon object, showing all its attributes.
     *
     * @return a string representation of the hot air balloon object.
     */
    @Override
    public String toString() {
        return super.toString() + ", Balloon Volume: " + balloonVolume + " cubic meters";
    }
}
