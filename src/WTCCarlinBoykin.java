//Driver Class

public class WTCCarlinBoykin {

    public static void main(String[] args){
        String landOptions = land();  // Call land method and return a string of landTransportation objects
        System.out.println(landOptions);  // Display each objects attributes.
    }

    /**
     * Creates objects for each mode of land transportation with appropriate attributes
     * and converts them to a string for display.
     *
     * @return landOptions, The options for land transportation returned as a string.
     */
    public static String land(){
        Bus greyhound = new Bus(25,70,8.50,"Ticket", 6, "Yes");
        Train  rockyMountaineer = new Train(100,80,12.75,"Ticket", 30, "Yes");
        Bike schwinn = new Bike(2,30,8.50,"Rental", 2, "Yes");
        Automobile toyota = new Automobile(4,100,32,"Rental", 4, "No");
        return "Bus: " + greyhound + "\nTrain: " + rockyMountaineer + "\nBike: " +schwinn + "\nAutomobile: " + toyota;
    }
}
