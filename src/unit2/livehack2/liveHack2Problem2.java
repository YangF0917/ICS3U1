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

        // Using a while loop, find out when the distance would be greater than or equal to 1600
        while (distance < 1600)
        {
            distance += 7;
            year++;
        }

        // After the while loop has finished changing the value of year, output the variable year
        System.out.println(year);
    }
}
