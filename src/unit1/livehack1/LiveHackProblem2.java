package unit1.livehack1;
import codehs.*;

/**
 * A simple program
 * @author: F. Yang
 *
 */


public class LiveHackProblem2 extends ConsoleProgram{
    public void run (){

        // Create degF and degC variables to store the temperature in fahrenheit and celsius respectively
        double degF;
        double degC;

        // Get degF from user input
        degF = readDouble("Enter the temperature in Fahrenheit: ");

        // Compute degC = 5.0 / 9 * (f - 32);
        degC = (5.0 / 9) * (degF - 32);
        // Output degC
        System.out.println("The temperature in Celsius is " + degC + " degrees.");
    }
}
