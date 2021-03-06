package finalproject;
import java.util.Scanner;
import java.util.Random;

public class CPT {

    // Use random to create passcodes and "facts"
    public static Random r = new Random();
    public static String a = Integer.toString(r.nextInt(10));
    public static String b = Integer.toString(r.nextInt(10));
    public static String c = Integer.toString(r.nextInt(10));
    public static String d = Integer.toString(r.nextInt(10));
    public static Scanner sc = new Scanner (System.in);
    public static int currentroom = 0;
    public static int currentlocation = 5;
    public static String passcode = a + b + c + d;
    public static boolean tkey = false;
    public static boolean tdoor1 = false;
    public static boolean tdoor2 = false;
    public static final String [] Home1 = {"You are at the entrance of the home. \nThe living room is to the East, Stairs" +
            " to the second floor are to the south and the garage is to the west. (E, S, W)",
            "The living room feels awfully chilling. \nTo the west is the entrance and the kitchen is to the south" +
            "(W, S)", "There seems to still be edible food here. \nTo the west is the office and to the north is " +
            "the living room (W, N)", "There" +
            " seems to be a note written on the office walls... It's indecipherable. \nTo the north is the garage" +
            " and east is the kitchen. (N, E)", "The garage door is falling" +
            " apart. There's a smell of decay here. \nTo the east is the entrance and to the south is the office" +
            "(E, S)", "You are at the stairs, the stairs seem to be falling apart . . . looks like they'll work for another" +
            " day. \nThe entrance is to the north (N)"};
    public static String [] Home1Directions = {"S5E1W4", "W0S2", "N1W3", "E2N4", "S3E0", "N0"};
    public static final String [] Home2 = {"Your bedroom seems to be the only warmth in this house. \nThe stairs are to the west. " +
            "(W)", "A long abandoned" +
            " guest bedroom. There hasn't been another guest here since the outbreak. \nTo the north is stairs. (N)",
            "Decay is evident beyond doubt. " +
            "Everything in the bathroom is either rusting or has grown some sort of mold. \nTo the east is the stairs (E)"
            , "Once was a master's bedroom, " +
            "is now the servant to decay. \nThe stairs are to the south. (S)",
            "You are at the stairs of the house. \nTo the north is the master's bedroom, east is your bedroom," +
            "south is the guest bedroom and west is the bathroom. (N, E, S, W)"};
    public static String [] Home2Directions = {"W4", "N4", "E4", "S4", "N3E0S1W2"};
    public static final String [] AbandonedWarehouse = {"You are at the entrance of the abandoned warehouse. \nTo the south" +
            " is first section of the warehouse. (S)", "You are in the top left corner of the warehouse" +
            ". You need a key to open the compartment to the south.\nThe first section" +
            " of the warehouse is the the east. (E)", "You are in the first compartment of the warehouse.  You need a key" +
            " to open the compartment to the south.\nTo the North" +
            " is the entrance, East is the top right corner of the warehouse. (N, E, W)", "You are in the top right corner of the " +
            "warehouse.  You need a key to open the compartment to the south.\nWest is the first compartment. (W)",
            "There's a unlocked safe box in this room. To the South and East are locked warehouse sections.\nTo the north" +
            " is top left corner of the warehouse. (N)", "You are in the middle of the warehouse. There are locked compa" +
            "rtments to the east, south and west.\nNorth is the first section of the warehouse. (N)", "There's a shelf that" +
            " might hold something. To the West is a locked warehouse section.\nNorth is the top right corner of the ware" +
            "house, and there's a smuggler to the south. (N, S)", "You are in the bottom west" +
            " segment of the warehouse. There are locked compartments to the North and East.\n", "There's a bag in the " +
            "middle of the room. There are locked compartments to the North and West.\nThere's a smuggler to the east (E, W)"
            ,"The smuggler greets you. \nThere are compartments to the North and West. (N, W)"};
    public static String [] AbandonedWarehouseDirections = {"S2", "E2", "N0E3W1", "W2", "N1E5", "N2E6W4", "N3S9W5",
    "N4E8", "N5E9W7","N6W8"};
    public static final String [] WaterPump = {"You are fully hydrated"};

    // Just a btw, these books are intentionally misspelled if they are not part of the password
    public static final String [] Library = {"Blade Runner by Philip K. Dick, 199"+a+"? . . . What a waste of time.",
    "Harry Pooter by J.K Rowling, 1989? Interesting...", "Lord of the Things by J.R.R. Tolkien, 1870? What a great read",
    "The Alchemist by Pablo Coelho, 178"+b+"? Wow, provides amazing insight.", "Lord of the Flies by William Golding" +
    ", 167"+c+"? Hmmm . . . maybe it should be left aside as a school novel.", "Romeo and Rosaline by William Shakespeare" +
    ", 1695? Way too lovey-dovey for my taste", "The Hungry Games by Suzanne Collins, 2004? Interesting concept creates" +
    " a dystopian society for the characters.", "Tweyelight by Stephenie Meyer, 2000? Bleh . . . I'm going to have to " +
    "wash my hands after that.", "Stranger Things by Erin Healy 198"+d+"? Isn't that a TV show???", "Jeva Basics 101 by" +
    " Felix Yang, 2030? Wait... That hasn't even come out yet."};
    public static final String [] ResearchLab = {"You are at the entrance of the research lab. \nA hallway is to the south (S)",
    "You are at the lab. \nWould you like to look through a nearby textbook? To the east is the hallway (E)",
    "Old pictures hang on the wall of this otherwise empty hallway.\nTo the east is a research lab, south" +
            " is another boring hallway, west is a storage room and north leads back to the entrance(N, E, S, W)",
    "You are in the storage room of the lab. There might still be chemicals to salvage. \nTo the west is a hallway(W)",
    "You are at the lab. \nWould you like to look through a nearby textbook? To the east is a hallway. (E)",
    "A smell of rusted iron lingers in the air. \nTo the east and west are research labs, the hallway continues north (N, E, W)",
    "You are at the lab. \nWould you like to look through a nearby textbook? To the west is the hallway (W)"};
    public static String [] ResearchLabDirections = {"S2", "E2", "N0S5W1", "W2", "E5", "N2E6W4", "W5"};
    public static final String [] TutorialLocation = {"You are at the Entrance. (N)", "North you see an intersection (N)", "Get" +
            "ting closer to the intersection (N)", "The hallway splits in 2 directions, East and West. (E, W)", "There's a table in the" +
            " middle of the room. (E)", "" +
            "There's a locked gate. Looks like there's a keyhole (W, N)", "You require a password to continue. (N)","" +
            "Everytime you move on the world map, it takes 1 water, if you run out, you black out. You can refill your water" +
            " at a Water pump. (N)", "Actions require energy, you can regain energy from sleeping in your bed. (N)",
            "You reached the exit of the tutorial, when you exit a location, you will be brought to the world map."};
    public static String [] TutorialDirections = {"N1", "N2S0", "N3S1", "W4E5S2", "E3", "W3","S5","S6N8","S7N9","S8"};
    public static String [][] places = {Home1, AbandonedWarehouse, WaterPump, Library, ResearchLab, Home2};
    public static String [][] placesNav = {Home1Directions, AbandonedWarehouseDirections, {}, {}, ResearchLabDirections,
    Home2Directions};
    public static String [] placesDes = {"You are at your home. \nNorth is the abandoned warehouse, East is the water pump," +
            " South is the library and West is the Research lab. (N, E, S, W)", "You are at the Abandoned warehouse. \n" +
            " South is your House. (S)", "You are at the water pump.\nWest is your Home. (W)", "You are at the Library.\n" +
            " North is your House. (N)", "You are at the research lab. Your house is to the East. (E)"};

    public static int [] HomeLocation = {1, 2, 3, 4};
    public static int [] AWLocation = {-1, -1, 0, -1};
    public static int [] WPLocation = {-1, -1, -1, 0};
    public static int [] LibraryLocation = {0, -1, -1, -1};
    public static int [] RLLocation = {-1, 0, -1, -1};
    public static int [] Home2Location = {-1, -1, -1, -1};
    public static int [][] WorldMapDirections = {HomeLocation, AWLocation, WPLocation, LibraryLocation, RLLocation, Home2Location};

    public static int HydrationWatch = 1;
    public static int EnergyWatch = 100;

    public static boolean hasBottle = false;
    public static boolean key1 = false;
    public static boolean key2 = false;
    public static boolean key3 = false;
    public static boolean key4 = false;
    public static boolean key5 = false;
    public static boolean passcodecorrect = false;

    /**
     * The main method which starts the game
     * @param args
     */
    public static void main (String[] args){
        System.out.println(passcode);
        tutorialInterface();
    }

    /**
     * Starts the introduction description
     */
    public static void introduction(){
        System.out.println("You open your eyes and find yourself on your bed. It's awfully quiet around the house. " +
                "You find a note on the door that says \n\"Evacuation Site: Go towar---------------\"\n" +
                "You haven't taken that note down yet. The rest of the ink has been smudged by some red liquid. " +
                "It's been 2 years since the \nbeginning of the plague and no cure has been found yet." +
                "\nClick enter to continue: ");
        enterCheck();
        System.out.println("\n\u001B[1mThe end of humanity is near. You are the only one who can create a cure.");
        System.out.println("\nYou are almost out of water, you need to find more water.");
    }

    /**
     * Used to print the contents of the library
     * @param bookNumber the book that the user wishes to access
     * @return the description of the book
     */
    public static String LibraryNavigation(int bookNumber)
    {
        EnergyWatch -= 30;
        return Library[bookNumber];
    }

    /**
     * A separate navigation system made for the Water pump
     */
    public static void WaterpumpNavigation(){
        System.out.println(WaterPump[0]);
        if (hasBottle){
            HydrationWatch = 7;
        }
        else{
            HydrationWatch = 5;
        }
        if(Exit()){
            WorldMapNavigation();
        }
        else{
            System.out.println("You are already fully hydrated: ");
            WaterpumpNavigation();
        }
    }

    /**
     * Method that combines both the WaterCheck() and EnergyCheck() into one smooth method
     */
    public static void interfaceCheck(){
        EnergyCheck();
        WaterCheck();
    }

    /**
     * Outputs the energy that the user still has after it changes
     */
    public static void EnergyCheck(){
        for (int i = 0; i < 25; i++){
            System.out.print("~");
        }
        System.out.println("\nEnergy Level: " + EnergyWatch + " / 100");
    }

    /**
     * Outputs the hydration level of the user
     */
    public static void WaterCheck(){
        if (!hasBottle) {
            System.out.println("Hydration Level: " + HydrationWatch + " / 5");
        }
        else{
            System.out.println("Hydration Level: " + HydrationWatch + " / 7");
        }
        for (int i = 0; i < 25; i++){
            System.out.print("~");
        }
        System.out.println("");
    }

    /**
     * Prints out a basic instruction for the user
     */
    public static void tutorial(){
        System.out.println("Move North, East, West or South whenever prompted to by responding" +
                " N, E, W or S respectively, Available directions are shown in brackets.");
        TutorialTraveller();
    }

    /**
     * Prompts the user whether to begin with the tutorial or not
     */
    public static void tutorialInterface(){
        System.out.println("Would you like to play a tutorial? Y for Yes and N for No ");
        String response = sc.nextLine();
        if (response.equals("Y")){
            tutorial();
        }
        else if (response.equals("N")){
            introduction();
            interfaceCheck();
            RoomTraveller();
        }
        else {
            System.out.println("Please enter a valid response.\n");
            tutorialInterface();
        }
    }

    /**
     * Simple method that checks whether the user clicks enter
     * @return true is the user has or false otherwise
     */
    public static boolean enterCheck(){
        String enter = sc.nextLine();
        if (enter.equals("")){
            return true;
        }
        else{
            System.out.println("Click the enter key: ");
            return enterCheck();
        }
    }

    /**
     * The bulk of room travelling in the game. It is a recursive method thay continues to run until the game is over
     * or when the user is out navigating the world map
     */
    public static void RoomTraveller(){
        // Preset Conditions
        if(currentlocation == 5 && currentroom == 4){
            if (Exit()){
                currentlocation = 0;
                currentroom = 0;
                System.out.println(places[currentlocation][currentroom]);
            }
        }
        if (currentlocation != 5 && currentroom == 0){
            if (Exit()){
                WorldMapNavigation();
                currentroom = 0;
            }
        }
        if (currentlocation == 5 && currentroom == 0 && HydrationWatch > 1){
            System.out.println("Would you like to sleep?");
            System.out.println("Sleeping exhausts 1 water level but replenishes 50 energy at a max of 100");
            if (sc.nextLine().equals("Y")) {
                Sleep();
            }
        }
        if (currentlocation == 5 && currentroom == 3 && !key1){
            System.out.println("You find a key in this room.");
            key1 = true;
        }
        if (currentlocation == 5 && !key2 && currentroom == 1){
            System.out.println("You find a key in this room.");
            key2 = true;
        }
        if (currentlocation == 0 && currentroom == 3 && !key3){
            System.out.println("You find a key in this room.");
            key3 = true;
        }
        if (currentlocation == 0 && currentroom == 2 && !key4){
            System.out.println("You find a key in this room.");
            key4 = true;
        }
        if (currentlocation == 5 && currentroom == 2 && !key5){
            System.out.println("You find a key in this room.");
            key5 = true;
        }
        if (currentlocation == 1 && currentroom == 1 && key1){
            System.out.println("The storage compartment to the south is open.");
            placesNav[currentlocation][currentroom] += "S4";
        }
        if (currentlocation == 1 && currentroom == 2 && key2){
            System.out.println("The storage compartment to the south is open.");
            placesNav[currentlocation][currentroom] += "S5";
        }
        if (currentlocation == 1 && currentroom == 3 && key3){
            System.out.println("The storage compartment to the south is open.");
            placesNav[currentlocation][currentroom] += "S6";
        }
        if (currentlocation == 1 && currentroom == 4 && key4){
            System.out.println("The storage compartment to the south is open.");
            placesNav[currentlocation][currentroom] += "S7";
        }
        if (currentlocation == 1 && currentroom == 5 && key5){
            System.out.println("The storage compartment to the south is open.");
            placesNav[currentlocation][currentroom] += "S8";
        }
        if (currentlocation == 1 && currentroom == 7 && !hasBottle){
            System.out.println("You pick up a bottle from the floor... Looks like it can still hold water.");
            hasBottle = true;
        }
        if (currentlocation == 1 && currentroom == 9){
            System.out.println("The smuggler can provide you information with some downside... Continue? (Y, N)");
            if (sc.nextLine().equals("Y")){
                Smuggler();
            }
        }
        if (currentlocation == 0 && currentroom == 5){
            System.out.println("You are at the stairs of the house.");
            if (Exit()){
                currentlocation = 5;
                currentroom = 4;
            }
        }
        if (currentlocation == 4 && currentroom == 2 && !passcodecorrect){
            currentroom = 3;
            System.out.println("You need a password to open the storage room:");
            if(passcodecheck()){
                System.out.println("The door shuts behind you. You hear a smugglers laugh as he locks you in.");
                System.out.println("He will only open the door if you discover the cure or when your body decays and rots due to the fumes.");
                if(cureordeath()){
                    System.out.println("You pray that the smuggler was telling the truth about the cure, you mix the" +
                            " two chemicals in and it works!");
                    System.out.println("The smuggler opens the door and runs off to the evacuation site to spead the news.");
                    System.out.println("Looks like all that studying and knowledge was put to good use.");
                }
                else{
                    System.out.println("Immediately after you put the 2 chemicals in, purple fumes burst out.");
                    System.out.println("They quickly envelop your body and soon you begin to lose consciousness");
                    System.out.println("You quickly look around and notice your skin turning green.");
                    System.out.println("The last thing you see is the smuggler pointing a shotgun to your forehead.");
                }
            }
        }
        if (!(currentlocation == 4 && currentroom == 3)) {
            if (currentlocation != 3) {
                System.out.println(places[currentlocation][currentroom]);
            }
            String user = sc.nextLine();
            System.out.println("");
            if (user.equals("N") || user.equals("E") || user.equals("S") || user.equals("W")) {
                if (placesNav[currentlocation][currentroom].indexOf(user) != -1) {
                    int newRoomLocation = ((placesNav[currentlocation])[currentroom]).indexOf(user) + 1;
                    currentroom = Integer.parseInt(Character.toString(placesNav[currentlocation][currentroom].charAt(newRoomLocation)));
                    RoomTraveller();
                } else {
                    System.out.println("Enter a valid direction.");
                    RoomTraveller();
                }
            } else {
                System.out.println("Enter a valid direction.");
                RoomTraveller();
            }
        }
    }

    /**
     * Made a separate method to account for travel in the tutorial map
     * @return blank string when tutorial is finished or recursively calls itself
     */
    public static String TutorialTraveller(){
        if (currentroom == 4 && !tkey){
            System.out.println("You found a key!");
            tkey = true;
        }
        if(currentroom == 5 && tkey && !tdoor1){
            TutorialLocation[5] = ("The gate is now unlocked you may now move north. (N, W)");
            TutorialDirections[5] += "N6";
            tdoor1 = true;

        }
        if(currentroom == 6 && !tdoor2){
            if(tpasscodecheck()) {
                TutorialLocation[6] = ("The password you entered is correct, the door opens (N)");
                TutorialDirections[6] += "N7";
                tdoor2 = true;
            }
        }
        if (currentroom == 9){
            System.out.println(TutorialLocation[currentroom]);
            currentroom = 0;
            introduction();
            interfaceCheck();
            RoomTraveller();
            return "";
        }
        System.out.println(TutorialLocation[currentroom]);
        String user = sc.nextLine();
        System.out.println("");
         if (user.equals("N") || user.equals("E") || user.equals("S") || user.equals("W")) {
            if (TutorialDirections[currentroom].indexOf(user) != -1){
                int newRoomLocation = TutorialDirections[currentroom].indexOf(user) + 1;
                currentroom = Integer.parseInt(Character.toString(TutorialDirections[currentroom].charAt(newRoomLocation)));
                return TutorialTraveller();
            }
            else{
                System.out.println("Enter a valid direction.");
                return TutorialTraveller();
            }
        }
        else{
            System.out.println("Enter a valid direction.");
            return TutorialTraveller();
        }
    }

    /**
     * Used as the main source of exit of a location.
     * @return true if the user inputs Y and false otherwise
     */
    public static boolean Exit(){
        System.out.println("Would you like to leave? (Y, N)");
        if (sc.nextLine().equals("Y")){
            System.out.println("");
            return true;
        }
        else{
            System.out.println("");
            return false;
        }
    }

    /**
     * Used for navigation across the world map.
     * Also checks for certain special locations
     */
    public static void WorldMapNavigation(){
        if (HydrationWatch != 0) {
            System.out.println(placesDes[currentlocation]);
            if (HydrationWatch <= 2) {
                System.out.println("You might want to start heading towards the water pump.");
            }
            String direction = sc.nextLine();
            if (direction.equals("N")) {
                if (WorldMapDirections[currentlocation][0] != -1) {
                    currentlocation = WorldMapDirections[currentlocation][0];
                    HydrationWatch--;
                    interfaceCheck();
                } else {
                    System.out.println("There's nothing but wastelands in that direction.");
                    WorldMapNavigation();
                }
            } else if (direction.equals("E")) {
                if (WorldMapDirections[currentlocation][1] != -1) {
                    currentlocation = WorldMapDirections[currentlocation][1];
                    HydrationWatch--;
                    interfaceCheck();
                } else {
                    System.out.println("There's nothing but wastelands in that direction.");
                    WorldMapNavigation();
                }
            } else if (direction.equals("S")) {
                if (WorldMapDirections[currentlocation][2] != -1) {
                    currentlocation = WorldMapDirections[currentlocation][2];
                    HydrationWatch--;
                    interfaceCheck();
                } else {
                    System.out.println("There's nothing but wastelands in that direction.");
                    WorldMapNavigation();
                }
            } else if (direction.equals("W")) {
                if (WorldMapDirections[currentlocation][3] != -1) {
                    currentlocation = WorldMapDirections[currentlocation][3];
                    HydrationWatch--;
                    interfaceCheck();
                } else {
                    System.out.println("There's nothing but wastelands in that direction.");
                    WorldMapNavigation();
                }
            } else {
                System.out.println("Enter a valid direction:");
                WorldMapNavigation();
            }
            if (currentlocation == 2) {
                WaterpumpNavigation();
            }
            if (currentlocation == 3){
                System.out.println("There" +
                        " are a lot of books. \nHint remember the last digit of the year of every real book in order from" +
                        " first to last book to get some code... Might come in handy\n It costs 30 energy to read a book");
                if (EnergyWatch >= 30) {
                    Reading();
                }
                else{
                    System.out.println("You are too tired to read books at the moment. Maybe take a rest.");
                }
                WorldMapNavigation();
            }
        }
        else{
            System.out.println("You begin to black out . . . It's over...");
        }
    }

    /**
     * Method that accounts for the reading action in the game
     */
    public static void Reading(){
        boolean isDone = Exit();
        if(!isDone) {
            System.out.println("Pick a book numbered 1-10:");
            int bookNum = sc.nextInt() - 1;
                if (bookNum >= 0 && bookNum <= 9) {
                    System.out.println(LibraryNavigation(bookNum));
                    interfaceCheck();
                    String a = sc.nextLine();
                    if(EnergyWatch >= 30) {
                        Reading();
                    }
                } else {
                    System.out.println("Enter a valid book number.");
                    Reading();
                    String a = sc.nextLine();
                }
            }
    }

    /**
     * Method that accounts for the sleeping action in the game
     */
    public static void Sleep(){
        while(!Exit()){
            System.out.println("You lie on your bed and take a quick nap. . .");
            EnergyWatch += 50;
            if (EnergyWatch > 100){
                EnergyWatch = 100;
            }
            HydrationWatch -= 1;
            interfaceCheck();
        }
    }

    /**
     * Method that accounts for receiving information from the smuggler
     */
    public static void Smuggler(){
        if (EnergyWatch >= 50) {
            EnergyWatch -= 50;
            System.out.println("Hmm... The cure should be green.");
        }
        else{
            System.out.println("You don't have enough energy to make this exchange.");
        }
    }

    /**
     * Method that tests whether the user inputs the right password, 5 tries
     * @return true is the password matches and false otherwise
     */
    public static boolean tpasscodecheck(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the passcode:");
            if (sc.nextLine().equals("1234")){
                return true;
            }
            else{
                System.out.println("Try 1234");
            }
        }
        return false;
    }

    /**
     * Method that accounts for the password in the actual game.
     * @return true if the password entered matches and false otherwise
     */
    public static boolean passcodecheck(){
        System.out.println("Please enter the password:");
        if (sc.nextLine().equals(passcode)){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Method that tests for the user's final entry of the game
     * If they enter the right combo they win else they lose
     * @return true or false based on if they win or not
     */
    public static boolean cureordeath(){
        System.out.println("There is an assortment of colourful liquids on the shelf");
        System.out.println("(G)reen, (Y)ellow, (B)lue, (R)ed, (P)urple, (O)range");
        System.out.println("You NEED to mix 2 of these liquids to find the cure.");
        String ele1 = sc.nextLine();
        String ele2 = sc.nextLine();
        if (ele1.equals("B") && ele2.equals("Y")){
            return true;
        }
        else if(ele1.equals("Y") && ele2.equals("B")){
            return true;
        }
        else {
            return false;
        }
    }
}