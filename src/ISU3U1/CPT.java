package ISU3U1;

public class CPT {

    public static int passcode;
    public static int keys = 0;
    public static String [] places = {"Home", "Abandoned Warehouse", "Water Pump", "Library", "Research Lab"};
    public static int hydrationWatch = 1;

    public static void main (String[] args){
        introduction();
    }
    public static void introduction(){
        System.out.println("You open your eyes and find yourself on your bed. It's awfully quiet around the house. " +
                "You find a note on the door that says \"Evacuation Site: Go towar---------------\"" +
                ". The rest of the ink has been smudged by some red liquid. It's been 2 years since the beginning of" +
                " the plague and no cure has been found yet. The end of humanity is near.");
    }

}
