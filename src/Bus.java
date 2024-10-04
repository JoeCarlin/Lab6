/**
 * The Bus class is a subclass of the LandTransportation class.
 * Contains the constructor for a bus object.
 */
class Bus extends LandTransportation {
    private String mapOfRoute;
    /**
     * @param capacity, seating capacity.
     * @param maxSpeed, Maximum speed.
     * @param cost, Cost of the ticket or rental.
     * @param ticketOrRental, Requires a ticket or a rental.
     * @param numWheels, Number of wheels.
     * @param mapOfRoute, Is there a map of the route onboard.
     */
    public Bus(int capacity, float maxSpeed, double cost, String ticketOrRental, int numWheels, String mapOfRoute) {
        super(capacity, maxSpeed, cost, ticketOrRental, numWheels);  // Call LandTransportation constructor
        this.mapOfRoute = mapOfRoute;
    }

    /**
     * Get route map availability.
     * @return mapOfRoute, The availability of a route map on the bus.
     */
    public String getMapOfRoute(){return mapOfRoute;}

    /**
     * Set the map availability.
     * @param mapOfRoute, The availability of a route map on the bus.
     */
    public void setMapOfRoute(String mapOfRoute){this.mapOfRoute = mapOfRoute;}

    /**
     * Returns the string representation of the Bus object.
     * Shows Capacity, maximum speed, cost, ticket or rental, number of wheels, and if a route map is included.
     * @return String representation of the Bus object.
     */
    @Override
    public String toString() {
        return super.toString() + ", Map of Route: " + mapOfRoute;
    }
}
