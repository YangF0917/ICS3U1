package unit2.forLoopPractice;
import codehs.*;

public class FtoC extends ConsoleProgram {
    public void run()
    {
        for (int f = -30; f <= 100; f += 20)
        {
            System.out.println(f + " degrees Fahrenheit is "+ f * 1.8 + 32 + " degrees Celcius");
        }
    }
}
