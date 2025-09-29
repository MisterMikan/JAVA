import java.util.Scanner;
public class LoopForPractice {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
 
// ----- START OF PROGRAM ----------

/* Write a Java program that asks the user to enter an integer. 
 * The program should then use a for loop.
 * To display the multiplication table of that number from 1 to 10.
 */

// ----- INPUT ---------------------


System.out.println("Enter a number: ");
int number = input.nextInt();

System.out.println("Multiplication Table of " + number + ":");
System.out.println();

// ----- PROCESS -------------------

printMultiplicationTable(number);

    input.close();

 }

// ----- OUTPUT --------------------

public static void printMultiplicationTable(int num) {

    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));

    }
  }
}

// ----- END OF PROGRAM -------------
