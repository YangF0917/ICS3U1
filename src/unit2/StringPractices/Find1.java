package unit2.StringPractices;
import codehs.*;

public class Find1 extends ConsoleProgram{
    public void run(){
        String name = readLine("Enter your name (first and last name): ");
        System.out.println("First Name: "+ name.substring(0, name.indexOf(" ")));
        System.out.println("Last Name: "+ name.substring(name.indexOf(" ")+ 1));
    }
}
