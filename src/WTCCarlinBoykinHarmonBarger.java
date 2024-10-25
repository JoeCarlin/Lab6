
import java.util.Scanner;
import java.lang.Math;

/**
 * Main driver class for the transportation lab.
 * Users get to choose their method of transportation, and it calculates the cost based on the amount of passengers.
 * @Author Joseph Carlin
 * @Author Jordan Boykin
 * @Author Connor Harmon
 * @Author Emma Barger
 * @Date: 10/25/24
 */
public class WTCCarlinBoykinHarmonBarger {
    /**
     * Main method for running the program.
     * @param args, command line arguments.
     */
    public static void main(String[] args){
        String confirmation = "yes";
        // Do while loop for running the program again if user wants to change their selection
        // or inputs incorrect information.
        do{
            Scanner input1 = new Scanner(System.in);
            // User choice of land, sea, or air transportation options
            System.out.println("Which type of transportation would you like to use:\n" +
                    "Land, Sea, or Air?");
            String userchoice = input1.nextLine();
            // Convert to lowercase for case-sensitive applications
            userchoice = userchoice.toLowerCase();


            //land options
            Bus greyhound = new Bus(25, 70, 8.50, "Ticket", 6, "Yes");
            Train rockyMountaineer = new Train(100, 80, 12.75, "Ticket", 30, "Yes");
            Bike schwinn = new Bike(2, 30, 8.50, "Rental", 2, "Yes");
            Automobile toyota = new Automobile(4, 100, 32, "Rental", 4, "No");
            String[] landNames = {"Bus", "Train", "Bike", "Automobile"};
            LandTransportation[] landOptions = {greyhound, rockyMountaineer, schwinn, toyota};

            //water options
            Submarine Titan = new Submarine(5, 50, 100000, "Ticket", "nuclear", 50000);
            Boat GenericBoat = new Boat(4, 15, 250, "rental", "sail", "individual");
            Ship CruiseShip = new Ship(1000, 500, 1000, "ticket", "steam", true);
            String[] waterNames = {"Submarine", "Boat", "Ship"};
            WaterTransportation[] waterOptions = {Titan, GenericBoat, CruiseShip};

            //air options
            Plane Boeing = new Plane(100, 600, 2000, "ticket", 300);
            Helicopter Sikorsky = new Helicopter(2, 500, 1500, "rental", 6000);
            Dirigible airship = new Dirigible(5, 20, 1000, "rental", 800);
            HotAirBalloon balloon = new HotAirBalloon(4, 10, 800, "ticket", 500);
            String[] airNames = {"Airplane", "Helicopter", "Dirigible", "HotAirBalloon"};
            AirTransportation[] airOptions = {Boeing, Sikorsky, airship, balloon};

            Scanner input2 = new Scanner(System.in);
            // Transportation object that gets chosen by the user
            // Uses polymorphism to match the correct transportation class object
            Transportation transportChoice = null;
            // Switch case for determining which transportation methods to show from user input
            switch (userchoice) {
                // Land transportation options
                case "land":
                    System.out.printf("%25s%20s%15s%15s\n", "Cost:", "Ticket or Rental:", "Speed:", "Passengers:");
                    for (int i = 0; i < landNames.length; i++) {
                        System.out.printf("%-15s%10s%15s%20s%15s\n", landNames[i], landOptions[i].getCost(), landOptions[i].getTicketOrRental(),
                                landOptions[i].getMaxSpeed(), landOptions[i].getCapacity());
                    }
                    System.out.println("Which mode of transportation would you like to use?\n");
                    String landChoice = input2.nextLine();
                    for (int i = 0; i < landNames.length; i++) {
                        if (landChoice.equalsIgnoreCase(landNames[i])) {
                            // Choice of transport vehicle assigned for future reference
                            transportChoice = landOptions[i];
                            System.out.println(landOptions[i].toString());
                        }
                    }
                    userchoice = landChoice;
                    break;
                // Water transportation options
                case "sea":
                    System.out.printf("%25s%20s%15s%15s\n", "Cost:", "Ticket or Rental:", "Speed:", "Passengers:");
                    for (int i = 0; i < waterNames.length; i++) {
                        System.out.printf("%-15s%10s%15s%20s%15s\n", waterNames[i], waterOptions[i].getCost(), waterOptions[i].getTicketOrRental(),
                                waterOptions[i].getMaxSpeed(), waterOptions[i].getCapacity());
                    }
                    System.out.println("Which mode of transportation would you like to use?\n");
                    String seaChoice = input2.nextLine();
                    for (int i = 0; i < waterNames.length; i++) {
                        if (seaChoice.equalsIgnoreCase(waterNames[i])) {
                            // Choice of transport vehicle assigned for future reference
                            transportChoice = waterOptions[i];
                            System.out.println(waterOptions[i].toString());
                        }
                    }
                    userchoice = seaChoice;
                    break;
                // Air transportation options
                case "air":
                    System.out.printf("%25s%20s%15s%15s\n", "Cost:", "Ticket or Rental:", "Speed:", "Passengers:");
                    for (int i = 0; i < airNames.length; i++) {
                        System.out.printf("%-15s%10s%15s%20s%15s\n", airNames[i], airOptions[i].getCost(), airOptions[i].getTicketOrRental(),
                                airOptions[i].getMaxSpeed(), airOptions[i].getCapacity());
                    }
                    System.out.println("Which mode of transportation would you like to use?\n");
                    String airChoice = input2.nextLine();
                    for (int i = 0; i < airNames.length; i++) {
                        if (airChoice.equalsIgnoreCase(airNames[i])) {
                            // Choice of transport vehicle assigned for future reference
                            transportChoice = airOptions[i];
                            System.out.println(airOptions[i].toString());
                        }
                    }
                    userchoice = airChoice;
                    break;
                // If input for transport type is not land, sea, or air
                // Rerun program
                default:
                    confirmation = "no";
                    continue;
            }

            System.out.printf("%s%s\n%s\n","Are you sure that you want to use ", userchoice,"Enter 'yes' or 'no': ");
            Scanner input3 = new Scanner(System.in);
            confirmation = input3.nextLine();

            if(confirmation.equalsIgnoreCase("yes")) {
                Scanner input4 = new Scanner(System.in);
                System.out.println("How many passengers do you have?");
                int noOfPassengers = input4.nextInt();
                // Total number of vehicles needed for the amount of passengers.
                double totalOfModes = Math.ceil((float) noOfPassengers / (float) transportChoice.getCapacity());
                // Total cost of all vehicles
                double totalCost = transportChoice.getCost() * totalOfModes;
                // Plural forms of the user selected vehicle
                String pluralUserChoice = userchoice;
                String ticket = "ticket";
                String rental = "rental";
                if(totalOfModes > 1 && !userchoice.equalsIgnoreCase("bus")){
                    pluralUserChoice += "s";
                    ticket  += "s";
                    rental  += "s";

                }
                // Specific to bus object
                else if (totalOfModes > 1 && userchoice.equalsIgnoreCase("bus")) {
                    pluralUserChoice += "es";
                    ticket  += "s";
                    rental  += "s";
                }

                System.out.printf("%s%.2f%s%.0f%s\n", "The total cost is: $",totalCost, " for ", totalOfModes, " " + pluralUserChoice);
                if (transportChoice.getTicketOrRental().equalsIgnoreCase("Ticket")){
                    System.out.printf("%s%s%s%s", "Your ", userchoice, " " + ticket, " will be ready at 12:00pm");
                }else{System.out.printf("%s%s%s%s", "Your ", userchoice, " " + rental, " will be ready at 8:00am");}
            }
            // While confirmation of transport type is not "yes"
        }while(!confirmation.equalsIgnoreCase("yes"));
    }
}
