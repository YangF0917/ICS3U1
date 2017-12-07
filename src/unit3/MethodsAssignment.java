package unit3;
import java.util.Scanner;

/**
 * Four methods that have their own respective testing methods to call and run the method to test for its accuracy
 *
 * @author Y. Felix
 */

public class MethodsAssignment {

    public static void main (String[] args){
        // Just in case the user wants to test a certain case
        Scanner sc = new Scanner (System.in);

        // Calling the isPerfect testing method (Just for fun)
        isPerfectTest();

        // Calling the dayYear testing method (Just for fun)
        dayYearTest();

        // Calling the censorPlus testing method
        censorPlusTest();

        // Calls the LCM method tester
        lcmTest();
    }

    // This one was just for fun
    /**
     * The isPerfect method takes an integer parameter and returns whether the sum of all of the numbers factors is
     * equal to the number itself. Ex. 6 has 3 non equal factors: 1, 2 and 3 and when added together equals the
     * original number 6
     * @param num the parameter that the method takes in
     * @return true if the condition above is met and false otherwise
     */
    // Working tests: 0, 1, 6, 8128. Positive number.
    public static boolean isPerfect(int num){
        // Create and initialize an integer variable called factorSum to hold the sum of factors at 0
        int factorSum = 0;

        // Find whether possFactor is a factor of num or not and repeat until (num - 1)
        for (int possFactor = 1; possFactor < num; possFactor++){
            // Test whether possFactor is a factor or not
            if (num % possFactor == 0) {
                // If possFactor is a factor of num
                factorSum += possFactor;
            }
        }
        if (factorSum == num || num == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public static void isPerfectTest(){
        System.out.println("Perfect Numbers:");
        for (int i = 0; i <= 10000; i++){
            if (isPerfect(i)){
                System.out.println(i);
            }
        }
    }

    /**
     * The dayYear method takes two ints and finds what day it is from Janurary 1st
     * @param day The exact day number of a certain month
     * @param month Month at which the day is found in
     * @return The number of days that the date is away from December 31st of the last year
     */
    // Just for fun, also it became really difficult to test for illegal test dates
    public static int dayYear(int day, int month){
        // Set the temporary month to be the month they enter -1
        int newMonth = month - 1;

        if (newMonth == 0){
            return day;
        }
        else if (day < 1){
            throw new IllegalArgumentException("Must be a valid day");
        }
        else if (month > 12 || month < 0){
            throw new IllegalArgumentException("Month > 12 or Month < 0");
        }
        else if (newMonth == 2){
            day += 28;
            return dayYear(day, newMonth);
        }
        else if (newMonth % 2 == 1 && newMonth <= 7){
            day += 31;
            return dayYear(day, newMonth);
        }
        else if (newMonth % 2 == 0 && newMonth >= 8){
            day += 31;
            return dayYear(day, newMonth);
        }
        else{
            day += 30;
            return dayYear(day, newMonth);
        }
    }

    public static void dayYearTest(){
        // Test 1:
        System.out.println("Test 1:");
        System.out.println("dayYear(31, 12)");
        System.out.println("Expected result: 365");
        System.out.println("Actual Result: " + dayYear(31, 12));

        // Test 2:
        System.out.println("Test 2:");
        System.out.println("dayYear(1, 20)");
        System.out.println("Expected result: Illegal Argument: Month > 12 or Month < 0");
        System.out.println(dayYear(1,20));

        // Test 3:
        System.out.println("Test 3:");
        System.out.println("dayYear(31, 2");
        System.out.println("Expected result: Illegal Argument: Illegal day number");
        System.out.println(dayYear(31,2));
    }

    /**
     * Takes a 2 strings and censors a string with pluses except for instances of the other string
     * @param user is the string that will be censored
     * @param keep is the string that will be left uncensored
     * @return The final censored string
     */
    public static String censorPlus(String user, String keep){
        // The length of the string to keep
        int replaceLength = keep.length();
        // Checks for empty strings
        if (user.equals("")){
            // Returns an empty string if an empty string is given
            return "";
        }
        // Test for empty replace string
        else if (keep.equals("")){
            // It creates a return for the pluses equal to its size
            String pluses = "";
            for (int i = 0; i < user.length(); i++){
                pluses += "+";
            }
            return pluses;
        }
        // if there is no more instance of the keep string, return pluses equal to the remaining length
        else if (user.indexOf(keep) == -1){
            // Return the pluses equal to the remaining string length
            String pluses = "";
            for (int i = 0; i < user.length(); i++){
                pluses += "+";
            }
            return pluses;
        }
        // If there is an instance of keep in the user string
        else {
            // Create a variable first to store the first index of keep in the string
            int first = user.indexOf(keep);
            String pluses = "";
            for (int i = 0; i < first; i++){
                pluses += "+";
            }
            // Returns pluses equal to the number of characters before the first instance of keep and calls itself
            return pluses + keep + censorPlus(user.substring(first + replaceLength), keep);
        }
    }

    public static void censorPlusTest(){
        // Test 1
        System.out.println("Test 1:");
        System.out.println("censorPlus(\"12xy34abxyc\", \"xy\")");
        System.out.println("Expected Result: ++xy++++xy+");
        System.out.println("Actual Result: " + censorPlus("12xy34abxyc", "xy") + "\n");

        // Test 2
        System.out.println("Test 2:");
        System.out.println("censorPlus(\"\", \"hello\")");
        System.out.println("Expected Result: ");
        System.out.println("Actual Result: " + censorPlus("", "hello") + "\n");

        // Test 3
        System.out.println("Test 3:");
        System.out.println("censorPlus(\"hello\", \"\")");
        System.out.println("Expected Result: +++++");
        System.out.println("Actual Result: " + censorPlus("hello", "") + "\n");
    }

    /**
     * Takes 2 numbers from the user and finds the lcm of the two
     * @param var1 The first number that the user inputs
     * @param var2 The second number that the user inputs
     * @return Either an error or the LCM of the 2 numbers
     */
    public static int lcm (int var1, int var2){
        /*
         3 variables min is just initialized, ABSvar1 holds the absolute value of var1 and ABSvar2 does the same with
         the other
          */
        int min;
        int ABSvar1 = Math.abs(var1);
        int ABSvar2 = Math.abs(var2);
        // Minimum stores the minimum value of the two numbers var1 and var2
        if (ABSvar1 < ABSvar2){
            min = ABSvar1;
        }
        else {
            min = ABSvar2;
        }
        // Create a variable to hold the greatest common factor and set it to be 0
        int gcf = 0;
        // In case the user inputs 0, The try Catch will catch the error
        try {
            // If the user did not input a 0, it will find the gcf of var1 and var2
            for (int i = 1; i <= min; i++) {
                if (ABSvar1 % i == 0 && ABSvar2 % i == 0) {
                    gcf = i;
                }
            }
            // It will print a statement below and return the LCM
            System.out.print("The LCM of " + var1 + " and " + var2 + " is: ");
            // Return ABSvar1 * ABSvar2 / gcf
            return ABSvar1 * ABSvar2 / gcf;
        }
        catch (ArithmeticException e){
            // Otherwise if the user inputs a zero, it will return a message and output a default -1
            System.out.print("Enter a non zero value. ERROR LCM: ");
            return -1;
        }
    }
    public static void lcmTest(){
        // Test 1
        System.out.println("Test 1");
        System.out.println("lcm(3, 7)");
        System.out.println("Expected result: 21");
        System.out.println("Actual result: " + lcm(3, 7) + "\n");

        // Test 2
        System.out.println("Test 2");
        System.out.println("lcm(0, 0)");
        System.out.println("Expected result: Enter a non zero value. ERROR LCM: -1");
        System.out.println("Actual result: " + lcm(0, 0) + "\n");

        // Test 3
        System.out.println("Test 3");
        System.out.println("lcm(-5, -7)");
        System.out.println("Expected result: 35");
        System.out.println("Actual result: " + lcm(-5, -7) + "\n");
    }
}
