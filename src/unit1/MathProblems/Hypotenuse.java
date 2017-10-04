package unit1.MathProblems;
import codehs.*;

public class Hypotenuse extends ConsoleProgram{
    public void run(){
        //Create sidea, sideb, hyp variables
        double sidea, sideb, hyp;
        //Get length values for side a&b
        sidea = readDouble("Enter length of Side A: ");
        sideb = readDouble("Enter length of Side B: ");
        //Compute hypotenuse
        hyp = Math.sqrt(Math.pow(sidea,2)+Math.pow(sideb,2));
        //Output hypotenuse
        System.out.println("The hypotenuse of the triangle is "+ hyp);
        //Using trig functions
        double deg;
        deg = readDouble("Enter the angle measure in degrees: ");
        System.out.println(Math.cos(Math.toRadians(deg)));
    }
}
