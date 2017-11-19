package unit2.ProgrammingAssignment;
import codehs.*;
import java.util.*;
import java.lang.*;

/**
 * A simple program that gets the user to input a string
 * and will output whether the substring between the first
 * and last indexes of "bread"
 * @author: F. Yang
 *
 */

public class C4IsSandwich extends ConsoleProgram{
    public void run(){
        // Create a variable to hold the user input
        String userIn;

        // Get the value of userIn from the user
        userIn = readLine("Enter your string: \n");

        // Find the first instance of bread in the string
        int firstBread = userIn.indexOf("bread");

        // Create a new variable to keep track of the index and initialize ot to 0
        int substringIndex = 0;

        // Create a variable to hold the last index of bread that was found
        int lastBread;

        // Find the last value of bread using a do while loop
        do {
            String userSubstring = "";
            userSubstring = userIn.substring(substringIndex);
            lastBread = userSubstring.indexOf("bread");
            substringIndex++;
        }
        while(substringIndex < userIn.length());
    }

}
