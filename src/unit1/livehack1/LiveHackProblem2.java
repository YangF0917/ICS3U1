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
        double degf;
        double degc;

        // Get f from user input
        degf = readDouble("Enter the temperature in Fahrenheit: ");

        // Compute c = 5.0 / 9 * (f - 32);
        degc = (5.0 / 9) * (f - 32);

        // Output c
        System.out.println("The temperature in Celsius is "+degc+" degrees.");
    }
}
