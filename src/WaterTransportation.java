//Worked on by Connor Harmon 10/3/2024, created constructor, setters and getters and toString

/**
 * The WaterTransportation class is a subclass of the Transportation class
 * that represents water transportation and is a super class of Boat, Ship and
 * Submarine classes.
 * Contains a string attribute called poweredBy to represent how the vessel is travelling
 */
public class WaterTransportation extends Transportation {
    //attributes
    private String poweredBy;

    /**
     * Constructs a WaterTransportation object with the poweredBy attribute
     * and all attributes from the Transportation superclass.
     * @param capacity total amount of passengers vessel can hold
     * @param maxSpeed max speed of the vessel
     * @param cost cost to ride on the vessel
     * @param ticketOrRental indicates whether the customer is buying a ticket or renting the vessel
     * @param poweredBy indicates how the vessel is powered
     */
    public WaterTransportation(int capacity, float maxSpeed, double cost, String ticketOrRental, String poweredBy){
        super(capacity, maxSpeed, cost, ticketOrRental);
        this.poweredBy = poweredBy;
    }

    /**
     * Gets how the vessel is powered
     *
     * @return how the vessel is powered
     */
    public String getPoweredBy(){
        return this.poweredBy;
    }

    /**
     * Sets how the vessel is powered
     *
     * @param poweredBy A string representing how the vessel is powered
     */
    public void setPoweredBy(String poweredBy){
        this.poweredBy = poweredBy;
    }

    @Override
    public String toString(){
        return super.toString() + ", Powered by: " + poweredBy;
    }
}
