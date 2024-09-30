/**
 * The Bus class is a subclass of the LandTransportation class.
 * Contains the constructor for a bus object.
 */
class Bus extends LandTransportation {
    public Bus(int capacity, float maxSpeed, double cost, String ticketOrRental) {
        super(capacity, maxSpeed, cost, ticketOrRental);  // Call superclass constructor
    }
}
