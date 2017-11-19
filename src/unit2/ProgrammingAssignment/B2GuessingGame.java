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
        secretNum = numGen.nextInt(100)+ 1;
        System.out.println(secretNum);

        // Have the user guess as long as he has made less than 5 guesses
        guess = readInt("Enter your guess:\n");
        for (int guessNumber = 1; guessNumber < 5; guessNumber++)
        {
            // First check if their guess is equal to the secret number
            if (guess == secretNum)
            {
                // if true, then output congratulations and set guessNumber to 5 to stop the for loop
                System.out.println("Congrats you guessed the number");
                guessNumber = 5;
            }
            // If they guessed incorrectly, check whether their guess was too high or low
            else if (guess < secretNum)
            {
                // If their guess was too low, Output too low and have the user reenter another number
                guess = readInt("Too low, guess again:\n");
            }
            else{
                // If their guess was too high, output too high and have the user reenter another number
                guess = readInt("Too high guess again:\n");
            }
        }
        // At the end of the 5 guesses, if they hadn't guessed it correctly output nice try
        if (guess != secretNum)
        {
            System.out.println("Nice Try");
        }
    }
}
