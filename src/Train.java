/**
 * The Train class is a subclass of the LandTransportation class.
 * The Train class contains the constructor for a train object.
 */
class Train extends LandTransportation {
    private String onboardDining;
    /**
     * @param capacity, seating capacity.
     * @param maxSpeed, Maximum speed.
     * @param cost, Cost of the ticket or rental.
     * @param ticketOrRental, Requires a ticket or a rental.
     * @param numWheels, Number of wheels.
     * @param onboardDining, Does the train offer onboard dining.
     */
    public Train(int capacity, float maxSpeed, double cost, String ticketOrRental, int numWheels, String onboardDining) {
        super(capacity, maxSpeed, cost, ticketOrRental, numWheels);  // Call LandTransportation constructor
        this.onboardDining = onboardDining;
    }

    /**
     * Return onboard dining availability.
     * @return onboardDining, Does the train offer onboard dining options.
     */
    public String getOnboardDining(){return onboardDining;}

    /**
     * Set the onboard dining availability.
     * @param onboardDining, String
     */
    public void setOnboardDining(String onboardDining){this.onboardDining = onboardDining;}

    /**
     * Returns the string representation of the Train object.
     * Shows Capacity, maximum speed, cost, ticket or rental, number of wheels, and if onboard dining is included.
     * @return String representation of the Train object.
     */
    @Override
    public String toString() {
        return super.toString() + ", Onboard dining: " + onboardDining;
    }
}
