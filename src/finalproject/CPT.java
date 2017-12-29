package finalproject;
import java.util.Scanner;
import java.util.Random;

public class CPT {
    public Random r = new Random();
    public static Scanner sc = new Scanner (System.in);
    public static int currentroom = 0;
    public static int currentlocation = 5;
    public static int passcode;
    public static int keys = 0;
    public static final String [] Home1 = {"You are at the entrance of the home. Would you like to leave? (E, S, W)" +
            "The living room feels awfully chilling. (W, S)", "There seems to still be edible food here. (W, N)", "There" +
            " seems to be a note written on the office walls... It's indecipherable. (N, E)", "The garage door is falling" +
            " apart. There's a smell of decay here. (E, S)", "Would you like to move to the second floor? (N)"};
    public static String [] Home1Directions = {"S5E1W4", "W0S2", "N1W3", "E2N4", "S3E0", "N0"};
    public static final String [] Home2 = {"Your bedroom seems to be the only warmth in this house. (W)", "A long abandoned" +
            " guest bedroom. There hasn't been another guest here since the outbreak. (N)", "Decay is evident beyond doubt. " +
            "Everything in the bathroom is either rusting or has grown some sort of mold (E)", "Once was a master's bedroom, " +
            "is now the servant to decay. (S)", "Would you like to go down to the first floor? (N, E, S, W)"};
    public static String [] Home2Directions = {"W4", "N4", "E4", "S4", "N3E0S1W2"};
    public static final String [] AbandonedWarehouse = {};
    public static String [] AbandonedWarehouseDirections = {"S2", "E2S4", "N0E3S5W1", "S6W2", "N1E5S7", "N2E6S8W4", "N3S9W5",
    "N4E8", "N5E9W7","N6W8"};
    public static final String [] WaterPump = {"You are fully hydrated"};
    public static final String [] Library = {""};
    public static final String [] ResearchLab = {};
    public static String [] ResearchLabDirections = {"S2", "E2S4", "N0E3S5W1", "S6W2", "N1E5", "N2E6", "W4", "N3W5"};
    public static int TutorialKeys = 0;
    public static final String [] TutorialLocation = {"You are at the Entrance. (N)", "North you see an intersection (N)", "Get" +
            "ting closer to the intersection (N)", "The hallway splits in 2 directions, East and West. (E, W)", "You find a key! (E)", "" +
            "There's a locked gate. Looks like there's a keyhole (W, N)", "You require a password to continue. (Enter: 1234)(N)","" +
            "Everytime you move on the world map, it takes 1 water, if you run out, you black out. You can refill your water" +
            " at a Water pump. (N)", "Actions require energy, you can regain energy from eating at a kitchen or sleeping in a bed. (N)",
            "You reached the exit of the tutorial, when you exit a location, you will be brought to the world map."};
    public static String [] TutorialDirections = {"N1", "N2S0", "N3S1", "W4E5S2", "E3", "W3N6","S5N7","S6N8","S7N9","S8"};
    public static String[][] places = {Home1, AbandonedWarehouse, WaterPump, Library, ResearchLab, Home2};
    public static String [][] placesNav = {Home1Directions, AbandonedWarehouseDirections, {}, {}, ResearchLabDirections,
    Home2Directions};
    public static String [] WorldMapDirections = {""};
    public static int HydrationWatch = 1;
    public static int EnergyWatch = 100;
    public static boolean hasBottle = false;

    public static void main (String[] args){
        tutorialInterface();
        introduction();
        interfaceCheck();
        RoomTraveller();
    }
    public static void introduction(){
        System.out.println("You open your eyes and find yourself on your bed. It's awfully quiet around the house. " +
                "You find a note on the door that says \n\"Evacuation Site: Go towar---------------\"\n" +
                "The rest of the ink has been smudged by some red liquid. It's been 2 years since the beginning of" +
                " the plague and no cure has been found yet. \nClick enter to continue: ");
        enterCheck();
        System.out.println("\n\u001B[1mThe end of humanity is near.");
        System.out.println("\nYou are almost out of water, you need to find more water.");
    }
    public static String LibraryNavigation(int bookNumber){
        return "";
    }
    public static void WaterpumpNavigation(){
        System.out.println(WaterPump[0]);
        if (hasBottle){
            HydrationWatch = 5;
        }
        else{
            HydrationWatch = 3;
        }
        if(Exit()){

        }
        else{
            System.out.println("You are already fully hydrated: ");
            WaterpumpNavigation();
        }
    }
    public static void AbandonedWarehouseNavigation(){

    }
    public static void ResearchLabNavigation(){

    }
    public static void interfaceCheck(){
        EnergyCheck();
        WaterCheck();
    }
    public static void EnergyCheck(){
        for (int i = 0; i < 25; i++){
            System.out.print("~");
        }
        System.out.println("\nEnergy Level: " + EnergyWatch + " / 100");
    }
    public static void WaterCheck(){
        if (!hasBottle) {
            System.out.println("Hydration Level: " + HydrationWatch + " / 3");
        }
        else{
            System.out.println("Hydration Level: " + HydrationWatch + " / 5");
        }
        for (int i = 0; i < 25; i++){
            System.out.print("~");
        }
        System.out.println("");
    }
    public static void tutorial(){
        System.out.println("Move North, East, West or South whenever prompted to by responding" +
                " N, E, W or S respectively, Available directions are shown in brackets.");
        System.out.println("\n" + TutorialLocation[0]);
        TutorialTraveller();
    }
    public static void tutorialInterface(){
        System.out.println("Would you like to play a tutorial? Y for Yes and N for No ");
        String response = sc.nextLine();
        if (response.equals("Y")){
            tutorial();
        }
        else if (response.equals("N")){
            System.out.println("");
        }
        else {
            System.out.println("Please enter a valid response.\n");
            tutorialInterface();
        }
    }
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
    public static void RoomTraveller(){
        String user = sc.nextLine();
        if (user.equals("N") || user.equals("E") || user.equals("S") || user.equals("W")) {
            int newRoomLocation = ((placesNav[currentlocation])[currentroom]).indexOf(user) + 1;
            currentroom = Integer.parseInt(Character.toString(placesNav[currentlocation][currentroom].charAt(newRoomLocation)));
            System.out.println(places[currentlocation][currentroom]);
            RoomTraveller();
        }
        else{
            System.out.println("Enter a valid direction.");
            System.out.println(places[currentlocation][currentroom]);
            RoomTraveller();
        }
    }
    public static void TutorialTraveller(){
        String user = sc.nextLine();
        if (user.equals("N") || user.equals("E") || user.equals("S") || user.equals("W")) {
            int newRoomLocation = TutorialDirections[currentroom].indexOf(user) + 1;
            currentroom = Integer.parseInt(Character.toString(TutorialDirections[currentroom].charAt(newRoomLocation)));
            System.out.println(TutorialLocation[currentroom]);
            TutorialTraveller();
        }
        else{
            System.out.println("Enter a valid direction.");
            System.out.println(TutorialLocation[currentroom]);
            TutorialTraveller();
        }
    }
    public static boolean Exit(){
        if (sc.nextLine().equals("Y")){
            return true;
        }
        else{
            return false;
        }
    }
    public static void WorldMapNavigation(){

    }
}