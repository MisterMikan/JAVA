import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        
//Create a Java Program that asks the user to enter (3 inputs) hours, minutes, seconds. Convert the inputs to display the time in hours.

   Scanner scan = new Scanner(System.in);

   // Display the data provided by the user.

   // -----HOURS-------------------------------------------------------

   System.out.println("Please enter your preferred number for hours: ");
   int number1 = scan.nextInt();
   System.out.println("This is your chosen number for hours: " + number1);
   System.out.println();
    
   // -----MINUTES-----------------------------------------------------

   System.out.println("Please enter your preferred number for minutes: ");
   int number2 = scan.nextInt();
   System.out.println("This is your chosen number for minutes: " + number2);
   System.out.println();

   // -----SECONDS-----------------------------------------------------

   System.out.println("Please enter your preferred number for seconds: ");
   int number3 = scan.nextInt();
   System.out.println("This is your chosen number for seconds: " + number3);

   // ------------------------------------------------------------------

   int total = number3 / 60;
   int total2 = total + 500;
   int total3 = total2 / 60;

  int total4 = number1 + total3;
  System.out.println();

   // -----TOTAL--------------------------------------------------------

   System.out.println("Total number for hours: " + total4 + " hours");

   // ------------------------------------------------------------------

        System.out.println();
        System.out.println("Thank You!");

    // -----------------------------------------------------------------


   
        scan.close();



    
    }
}
