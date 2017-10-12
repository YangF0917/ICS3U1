package unit1.livehack1;
import codehs.*;

/**
 * A simple program
 * @author: F. Yang
 *
 */

public class LiveHackProblem1 extends ConsoleProgram{
    public void run()
    {
        // Create a for the side length of the rectangular pentagon and d for the length of the diagonal
        double a;
        double d;
        // Get a from user input
        a = readDouble("Enter the side length of the pentagon: ");
        // Compute  d = a*(1 + Math.sqrt(5))/2
        d = a*(1 + Math.sqrt(5))/2;
        // Output the value of d
        System.out.println("The diagonal of a rectangular pentagon with side length "+ a + " is "+d);
    }
}
