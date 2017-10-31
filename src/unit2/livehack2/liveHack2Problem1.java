package unit2.livehack2;
import codehs.*;

/**
 * A simple program
 * @author: F. Yang
 *
 */

public class liveHack2Problem1 extends ConsoleProgram{
    public void run()
    {

        // Create 2 variables, one to hold the user input for the year and the other to hold the distance value
        int distance, year;

        // Get year from user input
        year = readInt("Enter the future year: ");

        // Initialize the initial distance to be 800 m
        distance = 800;

        // Create a for loop to print out the distance of the glacier every year until less than the year from user input
        for (int i = 2017; i <= year; i++)
        {
            // Compute the distance between the lodge and the glacier using 800 + (i - 2017) * 7
            distance = 800 + (i - 2017) * 7;
            // Output the year using the value i and the distance using the variable distance
            System.out.println("Year: "+ i + ", Glacier Edge Distance: "+ distance);
        }
    }
}
