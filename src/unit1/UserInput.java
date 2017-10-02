/*
 A general program template utilizing codehs ConsoleProgram.
 The main method and user input method have been abstracted
 for simplification.

 1) Change this description to appropriately describe the program
 2) Change the class name to match the file name
 3) Refer to documentation for configuring your program to run.

 @author: EDIT: yourName
 */

package unit1;    // EDIT: set to appropriate lesson unit for this program
import codehs.*;  // utilize all code in the codehs package
import java.util.Scanner;

public class UserInput extends ConsoleProgram{  //EDIT: change the class name to match the file name

    public void run() {
        //One Method with Scanner
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        double mark = sc.nextDouble();
        boolean locker = sc.nextBoolean();
        System.out.println(name);
        System.out.println(age);
        System.out.println(mark);
        System.out.println(locker);

        //Using the IntelliJ read
        String name1 = readLine("Enter your name: ");
        int age1 = readInt("Enter your age: ");
        double mark1 = readDouble("Enter your current mark: ");
        boolean lock1 = readBoolean("Have you been assigned a locker (true/false): ");

        System.out.println("Name: "+name1);
        System.out.println("Age: "+age1);
        System.out.println("Current Mark: "+mark1);
        System.out.println("Locker Assigned: "+lock1);

    }
}
