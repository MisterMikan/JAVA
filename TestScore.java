import java.util.Scanner;
public class TestScore {

    static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
    
// ----- START OF PROGRAM ---------------------------------------------------------

//Write a Java program that asks the user to enter 5 test scores (0-100) and compute for the average. Display the grade message if:

/*The average is 90 or above, display "Excellent".
 * The average is 75 to 89, display "Good".
 * The average is 50 to 74, display "Pass".
 * The average is below 50, display "Fail".
 * The average is outside 0-100, display "Invalid".
 */

 // ----- INPUT -------------------------------------------------------------------

    Scores();
    }

    static void Scores() {
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
        double num5 = 0;

    System.out.println("Please enter your 5 test scores: ");
     num1 = scan.nextDouble();
     num2 = scan.nextDouble();
     num3 = scan.nextDouble();
     num4 = scan.nextDouble();
     num5 = scan.nextDouble();

    System.out.println("Test Scores: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);

    // ----- PROCESS & OUTPUT -------------------------------------------------------

    double scores = num1 + num2 + num3 + num4 + num5;
    double average = scores / 3.0;

if (average <= 0 && average >= 100) {
    System.out.println("Invalid.");
    //
}else if (average >= 90) {
    System.out.println("Excellent.");
    //
}else if (average >= 75) {
    System.out.println("Good");
    //
}else if (average >= 50) {
    System.out.println("Pass.");
    //
}else {
    System.out.println("Fail.");
    //
}

    scan.close();

    }
   }

// ----- END OF PROGRAM --------------------------------------------------------------