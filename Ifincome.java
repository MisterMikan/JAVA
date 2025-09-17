import java.util.Scanner;
public class Ifincome {
    
    static Scanner scan = new Scanner(System.in);

public static void main (String[] args) {

// ----- START OF PROGRAM ---------------------------------------------------------

//Write a Java program that asks the user to enter their monthly salary.

/* If the salary is 100, 000 or above, display "Highly Income"
 * If the salary is 50, 000 to 99, 999,display "Middle Income"
 * If the salary is 20, 000 to 49, 999, display "Low Income"
 * Otherwise, display "Very Low Income"
 */

 // ----- INPUT -------------------------------------------------------------------

System.out.println("Please enter your monthly salary: ");
int salary = scan.nextInt();
System.out.println();
System.out.println(" Monthly Salary: " + salary);
System.out.println();

// ----- PROCESS & OUTPUT----------------------------------------------------------

if (salary >= 100000) {
    System.out.println("Your salary has a Highly Income.");
    // 
}else if (salary >= 50000) {
    System.out.println("Your salary has a Middle Income. ");
    //
}else if (salary >= 20000) {
    System.out.println("Your salary has a Low Income.");
    //
}else {
    System.out.println("Your salary has a Very Low Income.");
   scan.close();

      }
     }
   }

// ----- END OF PROGRAM -----------------------------------------------------------