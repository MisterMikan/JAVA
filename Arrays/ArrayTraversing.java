package Arrays;
import java.util.Scanner;
public class ArrayTraversing {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

// Start of Program

/* Write a Java program that:
 * 
 * 1.) Accepts N integers from the user (where N is specified by the user).
 * 2.) Stores the numbers in a single-dimensional array.
 * 3.) Determine and Display:
 * 
 * The frequency of each unique element(how many times it appears).
 * The element(s) that appear most frequently.
 * The element(s) that appear least frequently.
 */

 System.out.print("Enter number of elements: ");
 int elements = input.nextInt();

 int[] numbers = new int[elements];

 System.out.println("Enter " + elements + " integers:");

    for (int i = 0; i < elements; i++) {
        numbers[i] = input.nextInt();
        //
    }

    int[] unique = new int[elements];
    int[] freq = new int[elements];
    int uniqueCount = 0;

    for (int i = 0; i < elements; i++) {
        boolean found = false;
     for (int j = 0; j < uniqueCount; j++) {
        if (numbers[i] == unique[j]) {
            freq[j]++;
            found = true;
            break;
        }
     }

        if (!found) {
            unique[uniqueCount] = numbers[i];
            freq[uniqueCount] = 1;
            uniqueCount++;
        }
    }

System.out.println("\nFrequencies: ");
    for (int i = 0; i < uniqueCount; i++) {
        System.out.println();
        System.out.println("Element " + unique[i] + " appears " + freq[i] + " time(s)");
        System.out.println();
        //
    }

    int maxFreq = freq[0];
    int minFreq = freq[0];
        for (int i = 1; i < uniqueCount; i++) {
            if (freq[i] > maxFreq) maxFreq = freq[i];
            if (freq[i] < minFreq) minFreq = freq[i];
            //
        }

System.out.print("Most frequent element(s): ");
    for (int i = 0; i < uniqueCount; i++) {
        if (freq[i] == maxFreq) {
            System.out.print(unique[i] + " ");
            System.out.println();
            //
        }
    }

System.out.print("Less frequent element(s): ");
    for (int i = 0; i < uniqueCount; i++) {
        if (freq[i] == minFreq) {
            System.out.print(unique[i] + " ");
            //
        }
    }

input.close();

 }   
}

// End of Program
