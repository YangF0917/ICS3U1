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
        int lastBread = -1;

        // Find the last value of bread using a do while loop
        // Create a blank string to hold the cut original string
        String userSubstring = "";
        do {
            /*
             Essentially, the original string is being cut one letter at a time from the front and if it finds the word
             bread anywhere in the substring, it stores the value of the index of bread in the lastBread variable
              */
            userSubstring = userIn.substring(substringIndex);
            System.out.println(userSubstring);
            if (userSubstring.indexOf("bread")!= -1) {
                lastBread = userSubstring.indexOf("bread");
                lastBread += substringIndex;
            }
            substringIndex++;
        }
        while(substringIndex < userIn.length());

        // Printing out the substring in between the two instances of bread
        System.out.println(firstBread + " ," + lastBread);
        System.out.println(userIn.substring(firstBread + 5, lastBread));
    }
}
