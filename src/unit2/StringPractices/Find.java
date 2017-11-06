package unit2.StringPractices;
import codehs.*;

public class Find extends ConsoleProgram{
    public void run(){
        String find = readLine("Enter your text: ");
        int finds = readInt("Which character do you want me to find: ");
        System.out.println("The character is \""+ find.charAt(finds)+ "\"");
    }
}
