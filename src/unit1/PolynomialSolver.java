package unit1;
import codehs.*;

public class PolynomialSolver extends ConsoleProgram{
    public void run() {
        //Create degree, coefficients in arrays.
        int degree;
        //Get degree from user input before initializing the double array
        degree = readInt("Enter the degree of your polynomial: ");
        //Initialize the polynomial array and answer array
        int[] poly = new int[degree+1];
        double[] ans = new double[degree];
        //Ask for user input for each coefficient
        for (int i = 0; i<degree+1;i++){
            poly[i] = readInt("Enter the coefficient of the polynomial at degree: "+i+": ");
        }

        int counter = 0;
        int counter2 = 0;
        for (int j = 1; j<poly[degree]; j++){
            if (poly[degree]%j == 0){
                counter++;
            }
        }
        int[] faca = new int[poly[degree]];
        for (int k = 1; k<=poly[degree];k++){
            if (poly[degree]%k == 0){
                faca[counter2] = k;
                counter2++;
            }
            if ();
        }
        for (int l = 0; l<counter; l++){
            System.out.println(faca[l]);
        }
    }
}
