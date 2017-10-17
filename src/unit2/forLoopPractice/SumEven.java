package unit2.forLoopPractice;
import codehs.*;

public class SumEven extends ConsoleProgram {
    public void run()
    {
        int sum = 0;
        int n = readInt("Enter the value for n: ");
        for (int i = 0; i <= n; i+=2)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
