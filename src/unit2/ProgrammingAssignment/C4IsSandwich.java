package unit2.ProgrammingAssignment;
import codehs.*;

/**
 * A simple program that gets the user to input a string
 * and will output the substring between the first
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

        /*
         There is the possibility that the string does not find an index for "bread" and will output -1, therefore
         if that is the case, then change the -1 to a 0 as the following code will keep lastBread to be 0 if there
         is no instance of bread in the string
          */
        if (firstBread == -1)
        {
            firstBread = 0;
        }

        // Create a new variable to keep track of the index and initialize substringIndex to 0
        int substringIndex = 0;

        // Create a variable to hold the last index of bread that was found, initialize it at 0 if no bread is found
        int lastBread = 0;

        /*
        Find the last value of bread using a do while loop
        Create a blank string to hold the cut original string
         */
        String userSubstring = "";
        do {
            /*
             Essentially, the original string is being cut one letter at a time from the front and if it finds the word
             bread anywhere in the substring, it stores the value of the index of bread in the lastBread variable
              */
            userSubstring = userIn.substring(substringIndex);
            // Check if there still is an instance of bread left in the substring before executing
            if (userSubstring.indexOf("bread")!= -1) {
                // If there still is an instance of bread, store its index in lastBread
                lastBread = userSubstring.indexOf("bread");
                /*
                 Because the original string is being cut one letter at the time from the beginning, it is measured
                 in the variable substringIndex therefore, add substringIndex back to add the number of letters that
                 were cut from the original string
                  */
                lastBread += substringIndex;
            }
            // Increments substringIndex by one to cut another letter off
            substringIndex++;
        }
        // Repeats the code in the do statement while this condition is met
        while(substringIndex < userIn.length());

        // In case the string contains one or no instances of "bread"
        if (firstBread != lastBread) {
            /*
             Printing out the substring in between the two instances of bread, the index given by first bread will
             contain the first instance of bread as well. Therefore, add 5 to the index of the first bread to cut out
             the first bread.
              */
            System.out.println(userIn.substring(firstBread + 5, lastBread));
        }
    }
}
