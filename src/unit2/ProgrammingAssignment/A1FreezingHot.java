package unit2.ProgrammingAssignment;
import codehs.*;
import java.util.*;

/**
 * A simple program that returns a boolean value
 * determined by 2 temperatures given by the user
 * one being greater than 100 and the other being
 * less than 0
 * @author: F. Yang
 *
 */

public class A1FreezingHot extends ConsoleProgram{
    public void run(){
        // Create 2 temperature variables to hold the temperatures that the user will input
        int temp1, temp2;

        // Get the temperatures from the user
        temp1 = readInt("Enter the first temperature: \n");
        temp2 = readInt("Enter the second temperature: \n");

        // Create a Boolean variable to hold output and initialize it to be false
        boolean isFreezingHot = false;

        // If not then test whether one of the variables are greater than 100
        if (temp1 > 100)
        {
            isFreezingHot = true;
        }
        if (temp2 > 100)
        {
            isFreezingHot = true;
        }

        /*
        Test whether temp1 * temp2 >= 0 because if it is then it would just be false
        Because if it was greater than 0, that would mean that either both temp1 and temp2
        are both positive or both negative
         */
        if (temp1 * temp2 >= 0)
        {
            // Set the default false if the condition is met
            isFreezingHot = false;
        }

        // Output the final result
        System.out.println(isFreezingHot);
    }
}
