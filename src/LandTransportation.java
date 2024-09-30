/**
 * LandTransportation class is the superclass for all
 * forms of land transportation.
 */
class LandTransportation extends Transportation {
    public LandTransportation(int capacity, float maxSpeed, double cost, String ticketOrRental) {
        super(capacity, maxSpeed, cost, ticketOrRental);  // Call superclass constructor
    }
}
