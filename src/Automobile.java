/**
 * The Automobile class is a subclass of LandTransportation.
 * Contains the constructor for an automobile object.
 */
class Automobile extends LandTransportation {
    public Automobile(int capacity, float maxSpeed, double cost, String ticketOrRental) {
        super(capacity, maxSpeed, cost, ticketOrRental);  // Call superclass constructor
    }
}
