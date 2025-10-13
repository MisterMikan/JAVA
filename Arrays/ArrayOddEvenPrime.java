package Arrays;
import java.util.Scanner;
public class ArrayOddEvenPrime {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

// Start of Program

/* Write a Java program that:
 * 
 * 1.) Accepts N integers from the user (where N is specified by the user).
 * 2.) Stores the numbers in a single-dimensional array.
 * 3.) Counts and displays how many numbers are:
 * 
 * Even Numbers
 * Odd Numbers
 * Prime Numbers
 */

System.out.println("How many numbers do you want to enter? ");
int n = input.nextInt();

int[] numbers = new int[n];

System.out.println("Enter " + n + " integers: ");
    for (int i = 0; i < n; i++) {
        numbers[i] = input.nextInt();
        //
    }

int evenCount = 0;
int oddCount = 0;
int primeCount = 0;

    for (int num : numbers) {
        if (num % 2 == 0) {
            evenCount++;
        }else {
            oddCount++;
        }

        boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            }else if (num ==2) {
                isPrime = true;
            }else if (num % 2 == 0) {
                isPrime = false;
            }else {
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeCount++;
            }
          }

System.out.println("\nResults:");
System.out.println("Even Numbers: " + evenCount);
System.out.println("Odd Numbers: " + oddCount);
System.out.println("Prime Numbers: " + primeCount);

input.close();

 }
}

// End of Program