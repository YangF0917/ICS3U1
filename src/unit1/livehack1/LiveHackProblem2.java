package unit1.livehack1;
import codehs.*;

/**
 * A simple program
 * @author: F. Yang
 *
 */


public class LiveHackProblem2 extends ConsoleProgram{
    public void run (){
        // Create f and c variables to store the temperature in fahrenheit and celsius respectively
        double f;
        double c;
        // Get f from user input
        f = readDouble("Enter the temperature in Fahrenheit: ");
        // Compute c = 5 / 9 * (f - 32);
        c = 5 / 9 * (f - 32);
    }
}
