package unit1.MathProblems;
import codehs.*;

public class Circumference extends ConsoleProgram {
    public void run(){
        //Create radius variables
        double radius;
        //Get radius from user input
        radius = readDouble("Enter the radius of the circle: ");
        //Compute and output 2*radius*Math.PI
        System.out.println("The circumference of the circle is "+2*radius*Math.PI);
    }
}
