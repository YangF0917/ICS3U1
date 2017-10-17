package unit2.forLoopPractice;
import codehs.*;
import java.util.*

public class Avg5 extends ConsoleProgram {
    public void run()
    {
        Scanner sc = new Scanner (System.in);
        int a, b, c, d, e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        System.out.println((a+b+c+d+e)/5.0);
    }
}
