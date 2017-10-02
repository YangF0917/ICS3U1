package unit1;
import codehs.*;

public class Hypotenuse extends ConsoleProgram{
    public void run(){
        //Create sidea, sideb, hyp variables
        double sidea, sideb, hyp;
        //Get length values for side a&b
        sidea = readDouble("Enter length of Side A: ");
        sideb = readDouble("Enter length of Side B: ");
        //Compute hypotenuse
        hyp = math.sqrt(math.pow(sidea,2)+math.pow(sideb,2));
        //Output hypotenuse
        System.out.println("The hypotenuse of the triangle is ")
    }
}
