package unit1;
import codehs.ConsoleProgram;

import java.io.Console;

public class KiloToLbs extends ConsoleProgram{
    public void run(){
        double kg;
        kg = readDouble("What is your weight in kilos? ");
        System.out.println("You weight "+2.2*kg+" lbs");
    }
}
