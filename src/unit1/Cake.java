package unit1;
import codehs.ConsoleProgram;

public class Cake extends ConsoleProgram{
    public void run (){
    int cake;
    cake = readInt("How many pieces of cake were eaten? ");
    System.out.println("You need to jog "+ 2.25*cake + " km");
    }
}
