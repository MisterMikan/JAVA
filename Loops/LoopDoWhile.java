import java.util.Scanner;
import java.util.Random;
public class LoopDoWhile {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

public static void main(String[] args) {

// ----- START OF PROGRAM ----------

/* Create a Java program that implements a Number Guessing Game using a do..while loop.
 * 
 * The program will generate a random number between 1 and 100.
 * The user must guess the number.
 * After each guess, the program will tell the user if the guess is too high or too low.
 * The loop continues until the user guesses correctly.
 * Finally, display how many attempts the user made.
 */

 // ----- INPUT ---------------------

 int attempts = playGuessingGame();
    System.out.println("You guessed the number in " + attempts + " attempts.");
        input.close();

 }   

// ----- PROCESS --------------------

public static int playGuessingGame() {

    int secretNumber = rand.nextInt(100) + 1;
    int guess;
    int attempts = 0;

        do {

            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            attempts++;

        if (guess > secretNumber) {
            System.out.println("Too high! Try again.");
            //
        } else if (guess < secretNumber) {
            System.out.println("Too low! Try again.");
            //
        } else {
            System.out.println("Congratulations! You guessed the correct number!");
        }

// ----- OUTPUT ----------------------

  } while (guess != secretNumber);
  
    return attempts;

 }
}

// ----- END OF PROGRAM --------------  