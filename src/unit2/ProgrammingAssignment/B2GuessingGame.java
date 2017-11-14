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
        int guess = 0;

        // Initialize the secretNum variable using the Random object
        secretNum = numGen.nextInt(100)+1;
        System.out.println(secretNum);

        // Have the user guess as long as he has made less than 5 guesses
        guess = readInt("Enter your guess:\n");
        for (int guessNumber = 1; guessNumber < 5; guessNumber++)
        {
            if (guess == secretNum)
            {
                System.out.println("Congrats you guessed the number");
                guessNumber = 5;
            }
            else if (guess < secretNum)
            {
                guess = readInt("Too low, guess again:\n");
            }
            else{
                guess = readInt("Too high guess again:\n");
            }
        }
        if (guess != secretNum)
        {
            System.out.println("Nice Try");
        }
    }
}
