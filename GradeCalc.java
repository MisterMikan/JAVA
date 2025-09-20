import java.util.Scanner;
public class GradeCalc {

    static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {

// ----- START OF PROGRAM -----------------------------------------------

// Write a Java program that:

/* 1.) Asks the user to enter their name.
 * 2.) Asks the user to enter 3 grades (numbers 0-100).
 * 3.) Compute the average grade.
 * 4.) Displays the student's name, average grade, and whether they passed or failed.
 * 
 * Passing Mark = 75 or higher
 */

 // ----- INPUT ----------------------------------------------------------

 System.out.println("Enter your name: ");
 String name = scan.nextLine();
 System.out.println();

 System.out.println("Enter grade 1: ");
 int grade1 = scan.nextInt();
 System.out.println();

 System.out.println("Enter grade 2: ");
 int grade2 = scan.nextInt();
 System.out.println();

 System.out.println("Enter grade 3: ");
 int grade3 = scan.nextInt();
 System.out.println();

 // ----- PROCESS ---------------------------------------------------------

 double sum = grade1 + grade2 + grade3;
 //
 double average = sum / 3.0;

 // ----- OUTPUT ----------------------------------------------------------
 System.out.println("Entered name: " + name);
 System.out.println();

 System.out.println("Average: " + average);
 System.out.println();

 if (average >= 75) {
    System.out.println("Result: Passed.");
    //
 }else {
    System.out.println("Result: Failed.");
    //

    scan.close();
    
// ----- END OF PROGRAM ----------------------------------------------------

  }
 }
}