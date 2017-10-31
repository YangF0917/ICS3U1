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

        // Initialize the initial distance to be 800
        distance = 800;

        // Create a for loop to print out the distance of the glacier every year until less than year
        for (int i = 2017; i <= year; i++)
        {
            // Output the year and the meters value
            distance = 800+(i-2017)*7;
            System.out.println("Year: "+ i + ", Glacier Edge Distance: "+ distance);
        }
    }
}
