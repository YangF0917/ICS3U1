package unit2.ProgrammingAssignment;
import codehs.*;
import java.util.Random;

/**
 * A simple program that gets the user to attempt to guess
 * correctly the randomly generated number and if not, it
 * will give a hint to the user stating whether their guess
 * was too high or low.
 *
 * @author: F. Yang
 *
 */

public class B2GuessingGame extends ConsoleProgram{
    public void run(){
        // Create a new Random object by first importing the Java library and then calling it
        Random numGen = new Random();

        // Create 2 integer variables, one for the secret number and one for the guess that the user makes
        int secretNum;
        int guess;

        // Initialize the secretNum variable using the Random object
        secretNum = numGen.nextInt(100)+1;

        // Have the user guess as long as he has made less than 5 guesses
        for (int guessNumber = 0; guessNumber < 5; guessNumber++)
        {

        }
    }
}
