package unit3;

public class MethodsAssignment {

    public static void main (String[] args){
        //
        isPerfectTest();

        //
        dayYearTest();

        //
        censorPlusTest();
    }

    /**
     * The isPerfect method takes an integer parameter and returns whether the sum of all of the numbers factors is
     * equal to the number itself. Ex. 6 has 3 non equal factors: 1, 2 and 3 and when added together equals the
     * original number 6
     * @param num the parameter that the method takes in
     * @return true if the condition above is met and false otherwise
     */
    // Working tests: 6, 8128.
    public static boolean isPerfect(int num){
        int factorSum = 0;
        for (int possFactor = 1; possFactor < num; possFactor++){
            if (num % possFactor == 0){
                factorSum += 
            }
        }
        return true;
    }

    public static void isPerfectTest(){

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
    public static String censorPlus(){
        return "";
    }

    public static void censorPlusTest(){

    }
}
