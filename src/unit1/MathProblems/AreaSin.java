package unit1.MathProblems;
import codehs.*;

public class AreaSin extends ConsoleProgram{
    public void run(){
        //Create sidea, sideb, and angc variables
        double sidea, sideb, angc;
        //Get sidea, sideb, angc variables
        sidea = readDouble("Enter the first side length: ");
        sideb = readDouble("Enter the second side length: ");
        angc = readDouble("Enter the contained angle in radians: ");
        //Compute and output (sidea*sideb*Math.sin(angc))/2
        System.out.println("The area of the triangle is "+ (sidea*sideb*Math.sin(angc))/2);
    }
}
