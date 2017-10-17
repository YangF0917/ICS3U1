package unit2.forLoopPractice;
import codehs.*;

public class Factorial extends ConsoleProgram {
    public void run()
    {
        int pro = 1;
        int n = readInt("Enter a number: ");
        for (int i = 1; i<=n; i++)
        {
            pro = pro * i;
        }
        System.out.println(pro);
    }
}

