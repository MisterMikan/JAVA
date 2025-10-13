package Arrays;
import java.util.Scanner;
public class Array1DArithmetic {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
  
// ----- Start of Program ----------

/* Write a Java program that:
 * 
 * 1.) Accepts 10 integers from the user and stores them in a single-dimensional array.
 * 2.) Display all the numbers entered.
 * 3.) Find and displays:
 * 
 * - The sum of all numbers.
 * - The average of all the numbers.
 * - The largest number.
 * - The smallest number.
 */

 int[] numbers = new int[10];
 
 System.out.println("Enter 10 integers: ");
  //
  for (int i = 0; i < numbers.length; i++) {
    System.out.println("Number " + (i + 1) + ": ");
    numbers[i] = input.nextInt();
    //
  }

  System.out.println("\nNumbers entered:");
    //
    for (int num : numbers) {
      System.out.print(num + " ");
      //
    }

    System.out.println();

 int sum = 0;
 int largest = numbers[0];
 int smallest = numbers[0];

 for (int num : numbers) {
  sum += num;
  if (num > largest) {
    largest = num;
  }
  if (num < smallest) {
    smallest = num;
  }
 }

 double average = (double)sum / numbers.length;

 System.out.println("\nSum: " + sum);
 System.out.println("Average: " + average);
 System.out.println("Largest Number: " + largest);
 System.out.println("Smallest Number: " + smallest);

 input.close();

 }
}

