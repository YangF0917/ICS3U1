package unit4;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A group of array methods
 * @author Y.Felix
 */

public class ArraysAssignment {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] user = {1, 2, 3};
        System.out.println(Arrays.toString(shiftLeft3(user)));

        int[] user2 = {1, 2, 1, 4, 1, 1, 4, 5, 1};
        System.out.println(pairEverywhere(user2, 1));

        int [][] user3 = printPascal(3,4);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(user3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     * A simple method that takes in an integer array from the user and will return an array with its elements
     * shifted to the left one space
     *
     * @param user The array that will be shifted
     * @return The shifted array
     */

    public static int [] shiftLeft3(int [] user){
        int temp = user[0];
        int bring;
        for (int index = user.length - 1; index >= 0; index--){
            bring = user[index];
            user[index] = temp;
            temp = bring;
        }
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
