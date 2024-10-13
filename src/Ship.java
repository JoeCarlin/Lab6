//Worked on by Connor Harmon 10/12/2024, created ship class with constructor, setters/getters, and toString

/** The Ship class is a subclass of the WaterTransportation class
 * that represents a ship object.
 * Contains an overnight variable to signify if the voyage is overnight
 */
public class Ship extends WaterTransportation{
    //attributes
    private boolean overnight;

    /**
     * creates a Ship object with all attributes and superclass attributes
     * @param capacity num of passengers the boat can safely handle
     * @param maxSpeed the fastest speed the ship can safely travel
     * @param cost how much it costs to ride
     * @param ticketOrRental whether the ship is being rented or ticketed
     * @param poweredBy how the ship is powered
     * @param overnight whether the trip lasts overnight
     */
    public Ship(int capacity, float maxSpeed, double cost, String ticketOrRental, String poweredBy, boolean overnight){
        super(capacity, maxSpeed, cost, ticketOrRental, poweredBy);
        this.overnight = overnight;
    }

    /**
     * returns boolean overnight variable
     * @return overnight
     */
    public boolean getOvernight(){
        return overnight;
    }

    /**
     * sets boolean overnight variable
     * @param overnight whether the trip lasts overnight
     */
    public void setOvernight(boolean overnight){
        this.overnight = overnight;
    }

    /**
     * adds ship variables to superclass toString()
     * @return string
     */
    @Override
    public String toString(){
        if(overnight) {
            return super.toString() + ", overnight: " + "yes";
        }
        else{
            return super.toString() + ", overnight: " + "no";
        }
    }
}
