package ISU3U1;
import java.util.Scanner;

public class CPT {

    public static int passcode;
    public static int keys = 0;
    public static final String [] Home1 = {};
    public static final String [] Home2 = {};
    public static final String [] AbandonedWarehouse = {};
    public static final String [] WaterPump = {};
    public static final String [] Library = {};
    public static final String [] ResearchLab = {};
    public static String[][] places = {Home1, AbandonedWarehouse, WaterPump, Library, ResearchLab};
    public static int hydrationWatch = 1;

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        introduction();
    }
    public static void introduction(){
        System.out.println("You open your eyes and find yourself on your bed. It's awfully quiet around the house. " +
                "You find a note on the door that says \n\"Evacuation Site: Go towar---------------\"\n" +
                "The rest of the ink has been smudged by some red liquid. It's been 2 years since the beginning of" +
                " the plague and no cure has been found yet.\n\n\u001B[1mThe end of humanity is near.");
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

    }
    public static void AbandonedWarehouseNavigation(){

    }
    public static void ResearchLabNavigation(){

    }

}
