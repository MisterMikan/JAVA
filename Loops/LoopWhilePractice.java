import java.util.Scanner;
public class LoopWhilePractice {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

// ----- START OF PROGRAM ----------

/* Write a Java program that asks the user to enter numbers. \
 * Keep asking until the user asks 0.
 * When the loop ends display the sum of all numbers entered (excluding 0).
 */

// ----- INPUT ---------------------

int sum = sumNumbers();

    System.out.println("The sum of all entered numbers is: " + sum);

    input.close();

 }

// ----- PROCESS & OUTPUT ----------

 public static int sumNumbers() {

    int number;
    int sum = 0;

        System.out.println("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            
            sum += number;
            System.out.println("Enter a number: ");
            number = input.nextInt();

        }

        return sum;
        
 }
}

// ----- END OF PROGRAM ------------