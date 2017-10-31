package unit2.livehack2;
import codehs.*;

/**
 * A simple program that finds the distance of the Athabascan Glacier from the lodge given a year from user input
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

        // Just in case, if the user decides to mess with the year, test whether the year is greater than or equal to 2017
        if (year >= 2017) {
            // Create a for loop to print out the distance of the glacier every year until less than the year from user input
            for (int i = 2017; i <= year; i++) {
            /*
            Compute the distance between the lodge and the glacier using 800 + (i - 2017) * 7
            It is important that the distance value is reinitialized to 800 every time you add distance to it so that
            the addition does not accumulate.
            It is possible to find the change in year from 2017 by subtracting the current year 2017 from the year that
            is being accessed (i) by using (i - 2017)
            By using distance += (i - 2017) * 7; the addition from the last year would be added to the value stored in
            distance
            It is also possible (and simpler) to use distance += 7;
            */
                distance = 800 + (i - 2017) * 7;

                // Output the year using the value i and the distance using the variable distance
                System.out.println("Year: " + i + ", Glacier Edge Distance: " + distance);
            }
        }
    }
}
