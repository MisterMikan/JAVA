import java.util.Scanner;
public class LoopForSum {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

// ----- START OF PROGRAM ----------

/*Write a Java program that asks the user to enter a positive integer N. The program should then
 * use a for loop to calculate the sum of the first N natural numbers (1 + 2 + 3 + ... + N)
 * and display the result.
 */

// ----- INPUT ---------------------

System.out.println("Enter a positive integer: ");
int number = input.nextInt();
System.out.println();

// ----- PROCESS -------------------

int sum = number - number;

for (int i = 1; i <= 5; i++) {
    sum += i;
}

// ----- OUTPUT --------------------

System.out.println("The sum of the first 5 natural numbers is: " + sum);

 }
}

// ----- END OF PROGRAM ------------