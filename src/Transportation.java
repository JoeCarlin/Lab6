// Worked on by Joseph Carlin
// Worked on by Connor Harmon 10/3/2024. Added a value check for ticketOrRental in the constructor

import java.util.Locale;

/**
 * The Transportation class represents a general mode of transportation.
 * It contains attributes for capacity, maximum speed, cost, and whether
 * the transportation is for a ticket or rental.
 */
public class Transportation {
    // Attributes
    private int capacity;
    private float maxSpeed;
    private double cost;
    private String ticketOrRental;

    /**
     * Constructs a Transportation object with the specified capacity, maximum speed,
     * cost, and ticket or rental type.
     *
     * @param capacity       the number of passengers the transportation can accommodate
     * @param maxSpeed       the maximum speed of the transportation in kilometers per hour
     * @param cost           the cost of the transportation
     * @param ticketOrRental the type of service (either "Ticket" or "Rental")
     */
    public Transportation(int capacity, float maxSpeed, double cost, String ticketOrRental) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.cost = cost;

        if(ticketOrRental.equalsIgnoreCase("ticket") || ticketOrRental.equalsIgnoreCase("rental")){
            this.ticketOrRental = ticketOrRental.toLowerCase();
        }
        else{
            this.ticketOrRental = "";
        }
    }

    /**
     * Gets the capacity of the transportation.
     *
     * @return the capacity of the transportation.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the transportation.
     *
     * @param capacity the number of passengers the transportation can accommodate.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the maximum speed of the transportation.
     *
     * @return the maximum speed of the transportation in kilometers per hour.
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the maximum speed of the transportation.
     *
     * @param maxSpeed the maximum speed of the transportation in kilometers per hour.
     */
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gets the cost of the transportation.
     *
     * @return the cost of the transportation.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the cost of the transportation.
     *
     * @param cost the cost of the transportation.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Gets the type of service (either "Ticket" or "Rental").
     *
     * @return the service type of the transportation.
     */
    public String getTicketOrRental() {
        return ticketOrRental;
    }

    /**
     * Sets the type of service (either "Ticket" or "Rental").
     *
     * @param ticketOrRental the service type of the transportation.
     */
    public void setTicketOrRental(String ticketOrRental) {
        this.ticketOrRental = ticketOrRental;
    }

    /**
     * Returns a string representation of the transportation object, showing the capacity,
     * maximum speed, cost, and service type.
     *
     * @return a string representation of the transportation object.
     */
    @Override
    public String toString() {
        return "Capacity: " + capacity + ", Max Speed: " + maxSpeed +
                ", Cost: " + cost + ", Ticket or Rental: " + ticketOrRental;
    }
}
