import java.util.Scanner;
public class LargestSmallest {

    public static void main(String[] args) {
        
    

// ----- START ----------------------------------------------------------------------------------------------------------

// Create a Java code that accepts 5 whole numbers. Using an if..else...if statement, find and display the largest and smallest value.

/*REQUIREMENTS
 * 
 * Main Method
 * 1 input method
 * Method to check the biggest value
 * Method to check the smallest value
 * 1 output method to display the biggest and smallest value
 */
    
// ----- INPUT -----------------------------------------------------------------------------------------------------------

int num1 = inputNumbers(1);
int num2 = inputNumbers(2);
int num3 = inputNumbers(3);
int num4 = inputNumbers(4);
int num5 = inputNumbers(5);

int largest = findLargest(num1, num2, num3, num4, num5);

int smallest = findSmallest(num1, num2, num3, num4, num5);

displayResults(largest, smallest);

 }

 // ----- PROCESS --------------------------------------------------------------------------------------------------------

    public static int inputNumbers(int index) {
        Scanner input = new Scanner(System.in);
        
      System.out.println("Enter 5 whole numbers: ");

      return input.nextInt();

    }


    public static int findLargest(int n1, int n2, int n3, int n4, int n5) {
        
        int largest = n1;

       if (n2 > largest) {
        largest = n2;
        //
       }else if (n2 == largest) {
        //
       }else {
        //
       }

       if (n3 > largest) {
        largest = n3;
        //
       }else if (n3 == largest) {
        //
       }else {
        //
       }

       if (n4 > largest) {
        largest = n4;
        //
       }else if (n4 == largest) {
        //
       }else {
        //
       }

       if (n5 > largest) {
        largest = n5;
        //
       }else if (n5 == largest) {
        //
       }else {
        //
       }

       return largest;
 }

    public static int findSmallest(int n1, int n2, int n3, int n4, int n5) {
        
        int smallest = n1;

        if (n2 < smallest) {
            smallest = n2;
            //
        }else if (n2 == smallest) {
            //
        }else {
            //
        }

        if (n3 < smallest) {
            smallest = n3;
            //
        }else if (n3 == smallest) {
            //
        }else {
            //
        }

        if (n4 < smallest) {
            smallest = n4;
            //
        }else if (n4 == smallest) {
            //
        }else {
            //
        }

        if (n5 < smallest) {
            smallest = n5;
            //
        }else if (n5 == smallest) {
            //
        }else {
            //
        }

        return smallest;
    }

// ----- OUTPUT ---------------------------------------------------------------------------------------------------

public static void displayResults(int largest, int smallest) {
    
    System.out.println("The Largest Number is: " + largest);
    //
    System.out.println("The Smallest Number is: " + smallest);

// ----- END ------------------------------------------------------------------------------------------------------

 }
}