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

        // Call the LCM method tester (JUST FOR FUN)
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
    public static int dayYear(int day, int month){
        int newMonth = month - 1;

        if (newMonth == 0){
            return day;
        }
        else if (month == 2){
            day += 28;
            newMonth--;
            return dayYear(day, newMonth);
        }
        else if (month % 2 == 1 && month <= 7){
            day += 31;
            newMonth--;
            return dayYear(day, newMonth);
        }
        else if (month % 2 == 0 && month >= 8){
            day += 31;
            newMonth--;
            return dayYear(day, newMonth);
        }
        else{
            day += 30;
            newMonth--;
            return dayYear(day, newMonth);
        }
    }

    public static void dayYearTest(){
        System.out.println(dayYear(31, 12));
        System.out.println(dayYear(3,1));
        System.out.println(dayYear(9,1));
    }

    /**
     *
     */
    public static String censorPlus(String user, String replace){
        int replaceLength = replace.length();
        for (int i = 0; i < user.length(); i++){
            for (int j = 0; j < replaceLength; j++){
                if (user.charAt(i + j) == replace.charAt(j)){
                    // Hello Sir
                }
            }
        }
        return "";
    }

    public static void censorPlusTest(){

    }

    // LCM Program was just for fun
    public static int lcm (int var1, int var2){
        int min;
        int ABSvar1 = Math.abs(var1);
        int ABSvar2 = Math.abs(var2);
        if (ABSvar1 < ABSvar2){
            min = ABSvar1;
        }
        else {
            min = ABSvar2;
        }
        int gcf = 0;
        try {
            for (int i = 1; i <= min; i++) {
                if (ABSvar1 % i == 0 && ABSvar2 % i == 0) {
                    gcf = i;
                }
            }
            System.out.print("The LCM of " + var1 + " and " + var2 + " is: ");
            return ABSvar1 * ABSvar2 / gcf;
        }
        catch (ArithmeticException e){
            System.out.print("Enter a non zero value. ERROR LCM: ");
            return -1;
        }
    }
    public static void lcmTest(){
        System.out.println(lcm(-5, 5));
        System.out.println(lcm(3, 7));
        System.out.println(lcm(2, 2));
        System.out.println(lcm(6, 4));
        System.out.println(lcm(7, 10));
        System.out.println(lcm(3, 5));
        System.out.println(lcm(0, 0));
        System.out.println(lcm(-5, -7));
    }
}
