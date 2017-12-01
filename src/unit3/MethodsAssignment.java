package unit3;
import java.util.Scanner;

public class MethodsAssignment {

    public static void main (String[] args){
        // Just in case the user wants to test a certain case
        Scanner sc = new Scanner (System.in);

        //
        isPerfectTest();

        //
        dayYearTest();

        //
        censorPlusTest();

        // Call the LCM method tester;
        lcmTest();
    }

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
     * The dayYear method takes two ints
     */
    public static int dayYear(){
        return 0;
    }

    public static void dayYearTest(){

    }

    /**
     *
     */
    public static String censorPlus(String user, String replace){
        int replaceLength = replace.length();
        for (int i = 0; i < user.length(); i++){
            for (int j = 0; j < replaceLength; j++){
                if (user.charAt(i + j) == replace.charAt(j)){

                }
            }
        }
        return "";
    }

    public static void censorPlusTest(){

    }

    public static int lcm (int var1, int var2){
        int min;
        if (var1 < var2){
            min = var1;
        }
        else {
            min = var2;
        }
        if (var1 < 0 || var2 < 0){
            var1 = Math.abs(var1);
            var2 = Math.abs(var2);
        }
        if (var1 == 0 || var2 == 0){
            return 0;
        }
        int gcf = 0;
        for (int i = 1; i <= min; i++) {
                if (var1 % i == 0 && var2 % i == 0) {
                    gcf = i;
                }
            }
            return var1 * var2 / gcf;
    }
    public static void lcmTest(){
        System.out.println("The LCM of 3 and 7 is " + lcm(3, 7));
        System.out.println("The LCM of 2 and 2 is " + lcm(2, 2));
        System.out.println("The LCM of 6 and 4 is " + lcm(6, 4));
        System.out.println("The LCM of 7 and 10 is " + lcm(7, 10));
        System.out.println("The LCM of 3 and 5 is " + lcm(3, 5));
        // System.out.println(lcm(-5, 5));
        // System.out.println(lcm(0, 0));
        // System.out.println(lcm(-5, -7));
    }
}
