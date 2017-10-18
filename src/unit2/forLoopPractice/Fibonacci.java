package unit2.forLoopPractice;
import codehs.*;

public class Fibonacci extends ConsoleProgram {
    public void run()
    {
        int n = readInt("Enter a number n: ");
        int t1 = 0;
        int t2 = 1;
        int hold;
        for (int i = 1; i <= n; i++)
        {
            System.out.println(t2);
            hold = t2;
            t2 += t1;
            t1 = hold;
        }
    }
}

