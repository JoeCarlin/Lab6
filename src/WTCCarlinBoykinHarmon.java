//Driver Class

public class WTCCarlinBoykinHarmon {

    public static void main(String[] args){

        //land options
        Bus greyhound = new Bus(25,70,8.50,"Ticket", 6, "Yes");
        Train  rockyMountaineer = new Train(100,80,12.75,"Ticket", 30, "Yes");
        Bike schwinn = new Bike(2,30,8.50,"Rental", 2, "Yes");
        Automobile toyota = new Automobile(4,100,32,"Rental", 4, "No");

        //water options
        Submarine Titan = new Submarine(5, 50, 100000, "Ticket", "nuclear", 50000);
        Boat GenericBoat = new Boat(4, 15, 250, "rental", "sail", "individual");
        Ship CruiseShip = new Ship(1000, 500, 1000, "ticket", "steam", true);

        //air options
        Plane Boeing = new Plane(100, 600, 2000, "ticket", 300);
        Helicopter Sikorsky = new Helicopter(2, 500, 1500, "rental", 6000);
        Dirigible airship = new Dirigible(5, 20, 1000, "rental", 800);
        HotAirBalloon balloon = new HotAirBalloon(4, 10, 800, "ticket", 500);


        String[] landNames = {"Bus", "Train", "Bike", "Automobile"};
        LandTransportation[] landOptions = {greyhound, rockyMountaineer, schwinn, toyota};
        for(int i = 0; i < landNames.length; i++){
            System.out.printf("%-15s%s\n", landNames[i], landOptions[i]);
        }

        String[] waterNames = {"Submarine", "Boat", "Ship"};
        WaterTransportation[] waterOptions = {Titan, GenericBoat, CruiseShip};
        for(int i = 0; i < waterNames.length; i++){
            System.out.printf("%-15s%S\n", waterNames[i], waterOptions[i]);
        }
    }
}
