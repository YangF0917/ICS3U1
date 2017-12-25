package ISU3U1;
import java.util.Scanner;

public class CPT {

    public static Scanner sc = new Scanner (System.in);
    public static int currentroom = 0;
    public static int passcode;
    public static int keys = 0;
    public static final String [] Home1 = {};
    public static final String [] Home2 = {};
    public static final String [] AbandonedWarehouse = {};
    public static String [] AbandonedWarehouseDirections = {"S2", "E2S4", "N0E3S5W1", "S6W2", "N1E5S7", "N2E6S8W4", "N3S9W5",
    "N4E8", "N5E9W7","N6W8"};
    public static final String [] WaterPump = {"You are fully hydrated"};
    public static final String [] Library = {};
    public static final String [] ResearchLab = {};
    public static int TutorialKeys = 0;
    public static final String [] TutorialLocation = {"You are at the Entrance. (N)", "North you see an intersection (N)", "Get" +
            "ting closer to the intersection (N)", "The hallway splits in 2 directions, East and West. (E, W)", "You find a key! (E)", "" +
            "There's a locked gate. Looks like there's a keyhole (W, N)", "You require a password to continue. (Enter: 1234)(N)","" +
            "Everytime you move on the world map, it takes 1 water, if you run out, you black out. You can refill your water" +
            "at a Water pump. (N)", "Actions require energy, you can regain energy from eating at a kitchen or sleeping in a bed. (N)",
            "You reached the exit of the tutorial, when you exit a location, you will be brought to the world map."};
    public static String [] TutorialDirections = {"N1", "N2S0", "N3S1", "W4E5S2", "E3", "W3N6","S5N7","S6N8","S7N9","S8"};
    public static String[][] places = {Home1, AbandonedWarehouse, WaterPump, Library, ResearchLab};
    public static int HydrationWatch = 1;
    public static int EnergyWatch = 100;
    public static boolean hasBottle = false;

    public static void main (String[] args){
        tutorialInterface();
        introduction();
        interfaceCheck();
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
    public static void House2Navigation(){

    }
    public static void House1Navigation(){

    }
    public static String LibraryNavigation(int bookNumber){
        return "";
    }
    public static void WaterpumpNavigation(){
        System.out.println(WaterPump[0]);
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
        for (int i = 0; i < 20; i++){
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
        for (int i = 0; i < 20; i++){
            System.out.print("~");
        }
        System.out.println("");
    }
    public static void tutorial(){
        System.out.println("Move North, East, West or South whenever prompted to by responding" +
                " N, E, W or S respectively, Available directions are shown in bracketsY.");
        System.out.println(TutorialLocation[0]);
        NOnly();
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
    public static void tutorialNavigation(){
        currentroom = 0;
        if (currentroom == 0){

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

    public static void NOnly(){
        if (sc.nextLine().equals("N")){
        }
        else{
            System.out.println("Enter a valid direction: ");
            NOnly();
        }
    }
    public static void EOnly(){
        if (sc.nextLine().equals("E")){
        }
        else{
            System.out.println("Enter a valid direction: ");
            EOnly();
        }
    }
    public static void WOnly(){
        if (sc.nextLine().equals("W")){
        }
        else{
            System.out.println("Enter a valid direction: ");
            WOnly();
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