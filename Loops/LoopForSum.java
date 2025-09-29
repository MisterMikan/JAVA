import java.util.Scanner;
public class LoopForSum {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
 
 // ----- START OF PROGRAM ----------
 
 /* Write a Java program that asks user to enter a positive integer N. The program should then:
  * 
  * Use a loop to calculate the sum of the first N natural numbers (1 + 2 + 3 + ... + N).
  * And display the result.
  */

// ----- INPUT ----------------------

System.out.println("Enter a positive integer: ");
int number = input.nextInt();
System.out.println();

int sum = sumNaturalNumbers(number);

System.out.println("The sum of the first " + number + " natural numbers is: " + sum);

    input.close();

 }

// ----- PROCESS & OUTPUT -----------

 public static int sumNaturalNumbers(int n) {

    int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;

 }
}

// ----- END OF PROGRAM --------------