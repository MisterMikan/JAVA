import java.util.Scanner;
public class LoopWhile {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

// ----- START OF PROGRAM ----------

/* Write a Java program that asks the user for numbers.
 * The program should keep asking until the user enters a negative number.
 * When a negative number is entered, stop and display how many positive numbers were entered.
 */

 // ----- INPUT --------------------

 int number;
 int count = 0;

 System.out.println("Enter a number: ");
 System.out.println();

 // ----- PROCESS -------------------

 while (true) {
    number = input.nextInt();

    if (number < 0) {
        break;
        //
    }

    count++;

 }

 // ----- OUTPUT ---------------------

    if (count == 1) {
        System.out.println("You have entered " + count + " positive number.");
        //
    }else {
        System.out.println("You have entered " + count + " positive numbers.");
    }

    input.close();

 } 
}

// ----- END OF PROGRAM ---------------
