package unit4;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A group of array methods each related to a reading / creating an array
 *
 * @author Y.Felix
 */

public class ArraysAssignment {
    public static void main (String [] args) {
        // In case there is a test that the user would like to try themselves
        // Scanner sc = new Scanner(System.in);

        // Testing the shiftLeft3 method
        System.out.println("Test 1:");
        int [] test1m1 = {1, 2, 3};
        System.out.println("shiftLeft3(test1m1)");
        System.out.println("Expected Result: 2, 3, 1");
        System.out.println("Actual Result: " + Arrays.toString(shiftLeft3(test1m1)) + "\n");

        System.out.println("Test 2:");
        int [] test2m1 = {2, 1, 1};
        System.out.println("shiftLeft3(test2m1)");
        System.out.println("Expected Result: 1, 1, 2");
        System.out.println("Actual Result: " + Arrays.toString(shiftLeft3(test2m1)) + "\n");

        // Testing the pairEverywhere method
        int [] test1m2 = {1, 2, 1, 2};
        System.out.println("Test 1");
        System.out.println("pairEverywhere(test1m2, 1)");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + pairEverywhere(test1m2, 1) + "\n");

        int [] test2m2 = {1, 2, 2, 1};
        System.out.println("Test 2");
        System.out.println("pairEverywhere(test2m2, 1)");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + pairEverywhere(test1m2, 1) + "\n");

        int [] test3m2 = {2, 2, 1, 2};
        System.out.println("Test 3");
        System.out.println("pairEverywhere(test3m2, 1)");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + pairEverywhere(test3m2, 1) + "\n");

        // Testing the closeBy2 method

        System.out.println();

        // Testing the printPascal method
        int [][] user3 = pascal(3,4);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(user3[i][j] + " ");
            }
            System.out.print("\n");
        }

        int length = String.valueOf(1000).length();
        System.out.println(length);
    }

    /**
     * A simple method that takes in an integer array from the user and will return an array with its elements
     * shifted to the left one space
     *
     * @param user The array that will be shifted
     * @return The shifted array
     */

    public static int [] shiftLeft3(int [] user){
        // Creating a temporary variable to first hold the number at the 1st position in the array
        int temp = user[0];

        // Initialize an integer to hold the old value in the array
        int bring;

        // Starts by accessing the last variable and changing that first
        for (int index = user.length - 1; index >= 0; index--){

            // Bring hold the number that is going to be brought over to the next index on the left
            bring = user[index];

            // Changing the current index to the stored index
            user[index] = temp;

            // Then changing the temporary value to be the number that was originally stored
            temp = bring;
        }

        // After the array has been shifted, return the resulting array
        return user;
    }

    /**
     * A simple method that receives 2 parameters, one being the array and one being a number to check for.
     * The method will return true if every space in the array is or is adjacent to the number. Otherwise it will
     * return false
     *
     * @param user The array that the user will input to check for the number
     * @param everywhere The number that the method checks whether it is "Everywhere"
     * @return true or false
     */

    public static boolean pairEverywhere(int [] user, int everywhere){
        // Counts how many indexes are covered by the everywhere variable
        int coverCounter = 0;

        // Loops through all indexes in the user's array
        for (int i = 0; i < user.length; i++){

            // First checks whether the index accessed is the last or first index and modifies the check accordingly
            if (i == 0) {

                // If the number or the number ahead of it is the everywhere variable, then add one to coverCounter
                if (user[i] == everywhere || user[i + 1] == everywhere) {
                    coverCounter++;
                }
            }

            // If not the first index, it checks whether it is accessing the last index
            else if (i == user.length - 1) {

                // If the number before it or the number is the everywhere variable, then add one to coverCounter
                if (user[i] == everywhere || user[i - 1] == everywhere) {
                    coverCounter++;
                }
            }

            // Otherwise check whether the number, the number before or after is equal to everywhere
            else if (user[i] == everywhere || user[i + 1] == everywhere || user[i - 1] == everywhere){

                // Adds one to coverCounter if the condition is met
                coverCounter++;
            }
        }

        // At the end checks whether all indexes were beside or were the everywhere variable
        if (coverCounter == user.length){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * A simple method that takes in 2 integer arrays and outputs true if every corresponding element in each array is
     * less than 2 apart and false otherwise.
     *
     * @param firstUser The first array that the user inputs
     * @param secondUser The second array that the user inputs
     * @return true or false
     */

    public static int closeBy2 (int [] firstUser, int [] secondUser){

        // Used to hold how many numbers were "close by 2". Initialized to 0 in the beginning
        int counter = 0;

        // Loops for every index in the array
        for (int index = 0; index < firstUser.length; index++){

            // Checks for every index whether it is "close by" by 2 or less but not the same
            if (Math.abs(firstUser[index] - secondUser[index]) <= 2 && firstUser[index] != secondUser[index]){
                // Increment counter by 1
                counter++;
            }
        }
        // Returns counter in the very end
        return counter;
    }

    /**
     * A simple method that takes in 2 numbers from the user and prints out a pascals grid using those 2 numbers
     *
     * @param columns the number of columns the grid will have
     * @param rows the number of rows the grid will have
     * @return the pascals grid
     */

    public static int [][] pascal(int columns, int rows){

        // Creating a 2D array with the dimensions entered by the user
        int [][] pascalTriangle = new int [columns][rows];

        // Using a nested for loop to initialize the pascalTriangle array
        for (int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){

                // Checks whether the index accessed is on the very left or top of the 2D array
                if (i == 0 || j == 0){
                    // If its on the side, it is equal to 1
                    pascalTriangle [i][j] = 1;
                }
                else{
                    // If it is not on the top or left edge, then add the number above and left of the index to get the value
                    pascalTriangle [i][j] = pascalTriangle [i - 1][j] + pascalTriangle [i][j - 1];
                }
            }
        }
        return pascalTriangle;
    }
}
