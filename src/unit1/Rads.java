package unit1;
import codehs.*;

public class Rads extends ConsoleProgram{
    public void run(){
        //Create degree variable
        double degree;
        //Get degree from user input
        degree = readDouble("Enter the angle measure in degrees: ");
        //Compute and output Math.toRadians(degree)
        System.out.println("The angle is: "+ Math.toRadians(degree)+" radians.");
    }
}
