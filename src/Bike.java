/**
 * The Bike class is a subclass of LandTransportation.
 * Contains a constructor for a bike object.
 */
class Bike extends LandTransportation {
    public Bike(int capacity, float maxSpeed, double cost, String ticketOrRental) {
        super(capacity, maxSpeed, cost, ticketOrRental);  // Call superclass constructor
    }
}
