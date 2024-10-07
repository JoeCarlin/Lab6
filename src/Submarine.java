//Worked on my Connor Harmon 10/7/2024

/**
 * Submarine class is a subclass of WaterTransportation
 * and represents a submarine. Has a variable for the max depth
 * the submarine is able to travel safely
 */
public class Submarine extends WaterTransportation{

    private int maxDepth;

    /**
     * creates a Submarine object with all objects in WaterTransportation superclass
     * @param capacity total capacity of the submarine
     * @param maxSpeed max speed the submarine can travel at
     * @param cost the cost to ride the submarine
     * @param ticketOrRental specifying whether you are renting or getting a ticket
     * @param poweredBy how the submarine is powered
     * @param maxDepth how deep the submarine can safely travel
     */
    public Submarine(int capacity, float maxSpeed, double cost, String ticketOrRental, String poweredBy, int maxDepth){
        super(capacity, maxSpeed, cost, ticketOrRental, poweredBy);
        this.maxDepth = maxDepth;
    }

    /**
     * gets maxDepth
     * @return maxDepth
     */
    public int getMaxDepth(){
        return this.maxDepth;
    }

    /**
     * sets maxDepth
     * @param maxDepth - max depth submarine can safely travel
     */
    public void setMaxDepth(int maxDepth){
        this.maxDepth = maxDepth;
    }

    /**
     * adds submarine variables to superclass toString()
     * @return string
     */
    @Override
    public String toString(){
        return super.toString() + ", Max depth: " + maxDepth;
    }
}
