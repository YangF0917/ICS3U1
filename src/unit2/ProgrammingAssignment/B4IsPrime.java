package unit2.ProgrammingAssignment;
import codehs.*;

/**
 * A simple program that gets the user to input a number
 * and the program will return whether the number is prime
 * or composite
 *
 * @author: F. Yang
 *
 */

public class B4IsPrime extends ConsoleProgram{
    public void run(){
        // Create a variable to hold the user input
        int userNum;

        // Get the value of userNum from the user
        userNum = readInt("Enter your number \n");

        // Create a counter variable that will act as a counter for the factors of the number
        int factors = 0;

        /*
        Use a loop to find out whether num is a factor of the userNum, num is initialized at 1 to avoid divide by 0
        errors and also because 0 is not a factor of any number that the user chooses.
        Also, the maximum unique factor of a number is the square root of the number thus in order to preven repeats,
        The loop repeats until it hits the square root rounded down to the nearest one
         */
        for (int num = 1; num <= Math.sqrt(userNum); num++)
        {
            // Test whether the user's number is divisible by the number
            if (userNum % num == 0)
            {
                // Increase the counter by 1
                factors++;
            }
        }
        /*
         A prime number only has 2 factors, one and itself, however, the code only tests for half of the factors.
         however it also needs to make an exception for 1;
          */
        if (userNum != 1) {
            if (factors == 1) {
                System.out.println(userNum + " is a Prime Number");
            }
            /*
            If the number has more than one factor that is less than the square root of the original number,
            then it is a composite number
                */
            else if (factors > 1) {
                System.out.println(userNum + " is a Composite Number");
            }
        }
        // Print an exception for one
        else{
            System.out.println("1 is neither a prime nor composite number");
        }
    }
}
