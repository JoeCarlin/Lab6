/**
 * The Train class contains the constructor for a train object.
 */
class Train extends LandTransportation {
    public Train(int capacity, float maxSpeed, double cost, String ticketOrRental) {
        super(capacity, maxSpeed, cost, ticketOrRental);  // Call superclass constructor
    }
}
