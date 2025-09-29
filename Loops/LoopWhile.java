import java.util.Scanner;
public class LoopWhile {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
   
// ----- START OF PROGRAM ----------

/* Write a Java program that asks the user for numbers. 
 * The program should keep asking until the user enters a negative number.
 * When a negative number is entered, stop and display how many positive numbers were entered.
 */

 // ----- INPUT ---------------------

 int count = countPositiveNumbers();

 if (count == 1) {
    System.out.println("You have entered " + count + " positive number.");
    //
 }else {
    System.out.println("You have entered " + count + " positive numbers.");
    //
 }

 input.close();

 }

// ----- PROCESS & OUTPUT -----------

public static int countPositiveNumbers() {

    int count = 0;
    int number;

    System.out.println("Enter a number: ");

    while (true) {

        number = input.nextInt();

        if (number < 0) {
            break;

        }

        count++;
    }

    return count;

 }
}

// ----- END OF PROGRAM ----------