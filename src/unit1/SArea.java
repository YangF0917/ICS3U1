package unit1;
import codehs.ConsoleProgram;

public class SArea extends ConsoleProgram {
    public void run(){
        double l, w, h;
        l = readDouble("What is the length of the box?");
        w = readDouble("What is the width of the box?");
        h = readDouble("What is the height of the box?");
        System.out.println("The surface area of the box is: "+ 2(l*w+l*h+h*w));
    }
}
