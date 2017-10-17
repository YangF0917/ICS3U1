package unit1;
import codehs.*;

public class PolynomialSolver extends ConsoleProgram{
    public void run() {

        // Create degree variable to store the degree of the polynomial
        int degree;

        // Get degree from user input before initializing the double array
        degree = readInt("Enter the degree of your polynomial: ");

        // Initialize the polynomial array and answer array
        int[] poly = new int[degree+1];
        double[] ans = new double[degree];

        // Ask for user input for each coefficient
        for (int i = 0; i<degree+1;i++){
            poly[i] = readInt("Enter the coefficient of the polynomial at degree: "+i+": ");
        }

        // Creating 2 counter variables to input a number at a certain index and a third variable to
        // find the index of the first non-zero co-efficient
        int counter = 0;
        int counter2 = 0;
        int index = 0;

        // Storing the factors of the leading co-efficient
        int[] faca = new int[poly[degree]];
        for (int k = 1; k<=poly[degree];k++){
            if (poly[degree]%k == 0){
                faca[counter] = k;
                counter++;
            }
            if (k == poly[degree]){
                faca[counter] = k;
            }
        }

        // Finding the index of the first non-zero value in the array
        for (int i = 0; i<degree;i++){
            if (poly[i] != 0){
                index = i;
                break;
            }
        }

        // Create an array to hold all the factors of the first non-zero coefficient
        int[] facb = new int[poly[index]];
        for (int k = 1; k<=poly[degree];k++){
            if (poly[degree]%k == 0){
                facb[counter2] = k;
                counter2++;
            }
            if (k == poly[degree]){
                facb[counter2] = k;
            }
        }
        // Put a zero of 0 for every degree skipped

        // Use a fraction system to plug into f(x)

        // Use remainder theorem to find out whether f(x) = 0

        // Testing section
        for (int l = 0; l<counter; l++){
            System.out.println(faca[l]);
        }
        for (int l = 0; l<counter2; l++){
            System.out.println(facb[l]);
        }
    }
}
