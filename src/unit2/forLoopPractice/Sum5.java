package unit2.forLoopPractice;
import codehs.*;
import java.util.*;

public class Sum5 extends ConsoleProgram {
    public void run()
    {
        int sum = 0;
        for (int i = 1; i<=5; i++)
        {
            sum += readInt("Enter a number: ");
        }
        System.out.println(sum);
    }
}
