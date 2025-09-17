import java.util.Scanner;
public class LeapYear {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
     

 // ----- START -----------------------------------------------------------------------------------------

 // Create a Java program that asks the user to enter a year. 
/*If the year is divisible by 4 but not by 100, or divisble by 400, display "___ is a leap year"
 * Otherwise, display "____ is not a leap year"
 */

// ----- INPUT ------------------------------------------------------------------------------------------

 System.out.println("Please enter a year: ");
 int year = input.nextInt();
 System.out.println("This is your selected year: " + year);
 System.out.println();

 // ----- PROCESS & OUTPUT ------------------------------------------------------------------------------

 if ((year % 4 == 0) || (year % 4 == 0 && year % 100 != 0)){
    System.out.println(year + " is a leap year.");
 }else {
    System.out.println(year + " is not a leap year.");
        }    

        input.close();

    }
}

  // ----- END OF PROGRAM -------------------------------------------------------------------------------