package unit1;
import codehs.ConsoleProgram;

public class Cake extends ConsoleProgram{
    public void run (){
    //Create cake variable
    int cake;
    //Get cake from user input
    cake = readInt("How many pieces of cake were eaten? ");
    //Output and compute 2.25*cake
    System.out.println("You need to jog "+ 2.25*cake + " km");
    }
}
