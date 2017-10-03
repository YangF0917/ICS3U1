package unit1;
import codehs.*;

public class PolynomialSolver extends ConsoleProgram{
    public void run() {
        //Create degree, coefficients in arrays.
        int degree;
        //Get degree from user input before initializing the double array
        degree = readInt("Enter the degree of your polynomial: ");
        //Initialize the polynomial array and answer array
        double[] poly = new double[degree+1];
        double[] ans = new double[degree];
        //Ask for user input for each coefficient
        for (int i = 0; i<degree+1;i++){
            poly[i] = readDouble("Enter the coefficient of the polynomial at degree: "+i+": ");
        }



    }
}
