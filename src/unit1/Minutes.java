package unit1;
import codehs.*;

public class Minutes extends ConsoleProgram{
    public void run(){
        //Create minutes variable
        int minutes;
        //Get minutes from user input
        minutes = readInt("Enter the number of minutes: ");
        //Compute and output minutes/1440, (minutes%1440)/60, minutes%60
        System.out.println(minutes + " is equal to "+minutes/1440 + " days, "+ (minutes%1440)/60 + " hours "+ minutes%60+ " minutes.");
    }
}
