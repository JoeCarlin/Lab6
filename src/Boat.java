//Worked on by Connor Harmon 10/12/2024, created boat class with constructor, setters/getters, and toString

/**
 * The boat class is a subclass of WaterTransportation
 * that represents a boat object
 * contains an operatorType variable that says whether the
 * boat is owned by an individual or a company
 */
public class Boat extends WaterTransportation{
    //attributes
    private String operatorType;

    /**
     * creates a boat object with all attributes and superclass attributes
     * @param capacity num of passengers boat can safely handle
     * @param maxSpeed fastest speed boat can safely travel
     * @param cost the cost to ride the boat
     * @param ticketOrRental whether the user is buying a ticket or renting the boat
     * @param poweredBy how the boat is powered
     * @param operatorType whether the boat is owned by an individual or company, must input "individual" or "company"
     *                or variable will be set to an empty string
     */
    public Boat(int capacity, float maxSpeed, double cost, String ticketOrRental, String poweredBy, String operatorType){
        super(capacity, maxSpeed, cost, ticketOrRental, poweredBy);

        //validity check for ownedBy
        if(operatorType.equalsIgnoreCase("individual")){
            this.operatorType = "individual";
        }
        else if(operatorType.equalsIgnoreCase("company")){
            this.operatorType = "company";
        }
        else{
            this.operatorType = "";
        }
    }

    public String getOperatorType(){
        return operatorType;
    }

    public void setOperatorType(String ownedBy){
        this.operatorType = ownedBy;
    }

    @Override
    public String toString(){
        return super.toString() + ", owned by: " + operatorType;
    }
}
