package unit1;
import codehs.*;

public class Hours extends ConsoleProgram{
    public void run(){
        //Create hours variable
        int hours;
        //Get hours user input
        hours = readInt("Enter the number of hours: ");
        //Output and compute hours/24 and hours%24
        System.out.println(hours+" hours is equal to: "+ hours/24+" days, "+ "and "+ hours%24 + " hours.");
    }
}
