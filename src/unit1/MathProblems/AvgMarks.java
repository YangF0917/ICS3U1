package unit1.MathProblems;
import codehs.ConsoleProgram;

public class AvgMarks extends ConsoleProgram {
    public void run(){
        // Create mark1, mark2, mark3, mark4;
        double mark1, mark2, mark3, mark4;
        //Get values for mark1, mark2, mark3, mark4 from user input
        mark1 = readDouble("What is the first mark? ");
        mark2 = readDouble("What is the second mark? ");
        mark3 = readDouble("What is the third mark? ");
        mark4 = readDouble("What is the fourth mark? ");
        //Compute avg = (mark1+mark2+mark3+mark4) / 4
        double avg = (mark1+mark2+mark3+mark4) / 4;
        System.out.println("Your average is: "+ avg);
        //Output average




    }
}
