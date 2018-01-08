package unit4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

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

        int [] test3m2 = {1, 2, 1, 2};
        System.out.println("Test 3");
        System.out.println("pairEverywhere(test3m2, 1)");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + pairEverywhere(test3m2, 1) + "\n");

        // Testing the closeBy2 method

        // Testing the printPascal method
        int [][] user3 = printPascal(3,4);
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
        int coverCounter = 0;
        for (int i = 0; i < user.length; i++){
            if (user[i] == everywhere || user[i+1] == everywhere || user[i-1] == everywhere){
                coverCounter++;
            }
        }
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
        int counter = 0;
        for (int index = 0; index < firstUser.length; index++){
            if (Math.abs(firstUser[index] - secondUser[index]) <= 2 && firstUser[index] != secondUser[index]){
                counter++;
            }
        }
        return counter;
    }

    /**
     * A simple method that takes in 2 numbers from the user and prints out a pascals grid using those 2 numbers
     *
     * @param columns the number of columns the grid will have
     * @param rows the number of rows the grid will have
     * @return the pascals grid
     */

    public static int [][] printPascal(int columns, int rows){
        int [][] pascalTriangle = new int [columns][rows];
        for (int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                if (i == 0 || j == 0){
                    pascalTriangle [i][j] = 1;
                }
                else{
                    pascalTriangle [i][j] = pascalTriangle [i - 1][j] + pascalTriangle [i][j - 1];
                }
            }
        }
        return pascalTriangle;
    }
}
