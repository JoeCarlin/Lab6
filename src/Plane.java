// Plane class representing a specific type of air transportation.
// Worked on by Joseph Carlin


/**
 * The Plane class represents an airplane.
 * It extends the AirTransportation class.
 */
public class Plane extends AirTransportation {
    // Attributes
    private double wingSpan;

    /**
     * Constructs a Plane object with the specified attributes.
     *
     * @param capacity       the number of passengers the transportation can accommodate
     * @param maxSpeed       the maximum speed of the transportation in kilometers per hour
     * @param cost           the cost of the transportation
     * @param ticketOrRental the type of service (either "Ticket" or "Rental")
     * @param wingSpan       the wingspan of the airplane in meters
     */
    public Plane(int capacity, float maxSpeed, double cost, String ticketOrRental, double wingSpan) {
        super(capacity, maxSpeed, cost, ticketOrRental, "Plane");
        this.wingSpan = wingSpan;
    }

    /**
     * Gets the wingspan of the plane.
     *
     * @return the wingspan of the plane in meters.
     */
    public double getWingSpan() {
        return wingSpan;
    }

    /**
     * Sets the wingspan of the plane.
     *
     * @param wingSpan the wingspan of the plane in meters.
     */
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    /**
     * Returns a string representation of the plane object, showing all its attributes.
     *
     * @return a string representation of the plane object.
     */
    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan + " meters";
    }
}
