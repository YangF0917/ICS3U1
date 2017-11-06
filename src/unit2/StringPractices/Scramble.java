package unit2.StringPractices;
import codehs.*;

public class Scramble extends ConsoleProgram{
    public void run(){
        String split = readLine("Enter your text: ");
        String fh = split.substring(0, split.length()/2);
        String sh = split.substring(split.length()/2);
        System.out.println("First Half: "+ fh);
        System.out.println("Second Half: "+ sh);
        System.out.println("Scrambled: "+ sh + fh);
    }
}
