package unit1;
import codehs.*;
import com.sun.org.apache.bcel.internal.generic.StackProducer;

import javax.jnlp.IntegrationService;

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
        int counter =0;
        for (int j = 1; j<poly[degree+1];j++){

        }
        Stack<Integer>s =new Stack<Integer>();
    }
}
