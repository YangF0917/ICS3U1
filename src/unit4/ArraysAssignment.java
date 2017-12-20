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

        int [] user2 = {1, 2, 1, 4, 1, 1, 4, 5, 1};
        System.out.println(pairEverywhere(user2, 1));
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

}
