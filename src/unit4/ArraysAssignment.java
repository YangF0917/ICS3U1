package unit4;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A group of array methods
 * @author Y.Felix
 */

public class ArraysAssignment {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int [] user = {1, 2, 3};
        System.out.println(Arrays.toString(shiftLeft3(user)));
    }
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

}
