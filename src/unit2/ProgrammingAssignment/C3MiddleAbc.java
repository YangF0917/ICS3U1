package unit2.ProgrammingAssignment;
import codehs.*;

/**
 * A simple program that will take a string from the user and
 * output whether the string "abc" appears in the middle of
 * the string
 *
 * @author: F. Yang
 *
 */

public class C3MiddleAbc extends ConsoleProgram{
    public void run(){
        // Create a variable to hold the string that the user inputs
        String userIn;

        // Get user input from the user
        userIn = readLine("Enter your abc string: \n");

        // Create a boolean value to hold the output at the end and default it to false
        boolean isAbcMiddle = false;

        // Check whether the user inputted an empty string
        if (!userIn.equals("")) {
            // First check whether the length of the string is perfectly divisible by 2 and do something accordingly
            if (userIn.length() % 2 == 1) {
            /*
            Knowing that the string is has an odd length, the letter b in abc would be the direct middle of the string
            if abc is in the middle
             */
                if (userIn.substring(userIn.length() / 2 - 1, userIn.length() / 2 + 2).equals("abc")) {
                    isAbcMiddle = true;
                }
            }
            // The defaulted else is for the even length strings
            else {
            /*
            Find out whether the index of abc in a string would one less than half or two less than half. Ex.
            AabcBB, the index of abc is 1, the string length is 6, so the result would be length / 2 - 2
            AAabcB the index of abc is 2, the string length is 6, so the result would be length / 2 - 1
            These are the only two cases for even numbers therefore if either are correct, then abc is in the middle
             */
                if (userIn.substring(userIn.length() / 2 - 1, userIn.length() / 2 + 2).equals("abc") || userIn.substring
                        (userIn.length() / 2 - 2, userIn.length() / 2 + 1).equals("abc")) {
                    isAbcMiddle = true;
                }
            }
        }
        System.out.println(isAbcMiddle);

    }
}
