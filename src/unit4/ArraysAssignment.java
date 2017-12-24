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

        int [][] user3 = printPascal(10,10);
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(user3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     *
     * @param user
     * @return
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
     *
     * @param user
     * @param everywhere
     * @return
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
     *
     * @param firstUser
     * @param secondUser
     * @return
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
     *
     * @param columns
     * @param rows
     * @return
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
