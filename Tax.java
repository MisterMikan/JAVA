import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {

        // ----- START OF PROGRAM -----------------------------------------------

        // ----- DISPLAY TASK ---------------------------------------------------

        // Write a Java program that asks the user for the following inputs:
        /*
         * 1.) The total bill amount (before tax and tip)
         * 2.) The tax rate as a percentage (e.g., enter 12 for 12%)
         * 3.) The tip rate as a percentage (e.g., enter 10 for 10%)
         * 4.) The number of people to split the bill
         */

        // Your program shouuld compute and display:
        /*
         * The total tax amount
         * The tip amount (based on the bill before tax)
         * The total amount (bill + tax + tip)
         * The amount each person should pay
         */

        // ----- INPUT ---------------------------------------------------------

        Scanner scan = new Scanner(System.in);

        //

        System.out.println("Please enter your total bill amount (no tax, no tip):");
        float totalBillAmount = scan.nextInt();
        System.out.println();

        //

        System.out.println("Please enter your tax rate:");
        float taxRate = scan.nextInt();
        System.out.println();

        //

        System.out.println("Please enter your tip rate:");
        float tipRate = scan.nextInt();
        System.out.println();

        //

        System.out.println("Enter the number of people to split the bill:");
        float numPeople = scan.nextInt();
        System.out.println();

        // ----- PROCESS ---------------------------------------------------------

        float TotalBillAmount = totalBillAmount / 1;
        System.out.println("Total Bill Amount: " + TotalBillAmount);
        System.out.println();

        //

        float Tax = taxRate / 1;
        System.out.println("Tax: " + Tax);
        System.out.println();

        //

        float Tip = tipRate / 1;
        System.out.println("Tip: " + Tip);
        System.out.println();

        //

        System.out.println("Number of people: " + numPeople);

        // ----- OUTPUT -----------------------------------------------------------

        System.out.println("----------------------------------------------------------");

        System.out.println("Total Tax Amount:");
        float totalTaxAmount = totalBillAmount / taxRate + Tax + Tip;
        System.out.println(totalTaxAmount);

        //

        System.out.println("Tip Amount:");
        float tipAmount = (Tip * numPeople) - Tip;
        System.out.println(tipAmount);
        
        //

        System.out.println("Total Amount:");
        float totalAmount = totalTaxAmount + tipAmount + totalBillAmount;
        System.out.println(totalAmount);

        //

        System.out.println("Each person should pay:");
        float pricePerPerson = totalAmount / numPeople;
        System.out.println(pricePerPerson);

        // -------------------------------------------------------------------------------

        scan.close();

    }
}
