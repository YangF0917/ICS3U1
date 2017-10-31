package unit2.livehack2;
import codehs.*;

/**
 * A simple program
 * @author: F. Yang
 *
 */

public class liveHack2Problem2 extends ConsoleProgram{
    public void run()
    {
        // Create a variable distance to equal 800 and a year to be the starting year 2017
        int distance = 800;
        int year = 2017;

        // Continue to check whether distance is less than 1600 m
        while (distance < 1600)
        {
            /*
            If the distance is less than 1600, then it adds 7 to the distance and 1 to the year
            And then checks again for the next year. The loop stops once it has a year and a distance greater than or
            equal to 1600 m. If the distance is greater than or equal to 1600, then the loop will stop processing
            this calculation and will stop at the year that corresponds to a distance greater than or equal to 1600
            */
            distance += 7;
            year++;
        }

        // After the while loop has finished changing the value of year, output the variable year
        System.out.println("The lodge will need to close in " + year);
    }
}
