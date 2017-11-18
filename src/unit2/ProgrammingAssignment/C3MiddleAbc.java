package unit2.ProgrammingAssignment;
import codehs.*;

public class C3MiddleAbc extends ConsoleProgram{
    public void run(){
        // Create a variable to hold the string that the user inputs
        String userIn;

        // Get user input from the user
        userIn = readLine("Enter your abc string: \n");

        // First check whether the length of the string is perfectly divisible by 2 and do something accordingly
        if (userIn.length() % 2 == 1)
        {
            // Given an example AAabcBB - Index of abc is 2 or AabcB index of abc is 1
            if (userIn.indexOf("abc") == userIn.length() / 2 - 1)
            {
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        // The defaulted else is for the even length strings
        else{
            if (userIn.indexOf("abc") == userIn.length() / 2 - 1 || userIn.indexOf("abc") == userIn.length() / 2 - 2)
            {
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

    }
}
