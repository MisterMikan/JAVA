import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        // ----- START OF PROGRAM
        // -----------------------------------------------------------------

        // ----- DISPLAY THE TASK
        // -----------------------------------------------------------------

        // Write a Java program that:
        /*
         * 1) Asks the user to input the following three values:
         * Principal Amount (P)
         * Annual Interest Rate in percent (R)
         * Time in Years (T)
         * 
         * 2.) Calculates the Simple Interest using the formula: Simple Interest = P x R
         * x T / 100
         * 
         * 3.) Display the Simple Interest and the Total Amount after the interest:
         * Total Amount = P + Simple Interest
         */

        // ----- INPUT
        // ---------------------------------------------------------------------------

        Scanner scan = new Scanner(System.in);

        // ----- PROCESS
        // -------------------------------------------------------------------------

        // ----- PRINCIPAL AMOUNT
        // ----------------------------------------------------------------

        System.out.println("Enter the Principal Amount:");
        float principalAmount = scan.nextFloat();
        System.out.println(principalAmount);
        System.out.println();

        // ----- ANNUAL INTEREST RATE IN PERCENT -------------------------------------------------

        System.out.println("Enter the Annual Interest Rate in Percent:");
        int annualInterestRate = scan.nextInt();
        System.out.println(annualInterestRate);
        System.out.println();

        // ----- NUMBER OF YEARS ----------------------------------------------

        System.out.println("Enter the number of Years:");
        float years = scan.nextFloat();
        System.out.println(years);
        System.out.println();

        // ----- OUTPUT -------------------------------------------------------------------

        // ----- PRINCIPAL AMOUNT --------------------------------------------

        float simpleInterest = principalAmount * annualInterestRate * years / 100;
        System.out.println("This is your Simple Interest: " + simpleInterest);

        // ----- TOTAL AMOUNT ------------------------------------------------

        float totalAmount = principalAmount + simpleInterest;
        System.out.println("This is your Total Amount: " + totalAmount);

        scan.close();

        // ----- END OF PROGRAM ----------------------------------------------
        
    }
}
