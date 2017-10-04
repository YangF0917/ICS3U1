package unit1.MathProblems;
import codehs.*;

public class Cos3rd extends ConsoleProgram{
    public void run(){
        //Create sidea, sideb and angc variables
        double sidea, sideb, angc;
        //Get sidea, sideb and angc from user input
        sidea = readDouble("Enter the first side: ");
        sideb = readDouble("Enter the second side: ");
        angc = readDouble("Enter the contained angle in radians: ");
        //compute and output Math.sqrt(Math.pow(sidea,2)+Math.pow(sideb,2)-2*sidea*sideb*Math.cos(angc)))
        System.out.println("The third side of the triangle is: "+ Math.sqrt(Math.pow(sidea,2)+Math.pow(sideb,2)-2*sidea*sideb*Math.cos(angc)));
    }
}
