import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        //

        Scanner scan = new Scanner(System.in);

        // Encode the user's 1st number.

        System.out.println();
        System.out.println("Please enter your 1st number: ");
        //
        int number1 = scan.nextInt();
        System.out.println("This is your 1st number: " + number1);

        // --------------------------------------------------------------

        // Encode the user's 2nd number.

        System.out.println();
        System.out.println("Please enter your 2nd number: ");
        //
        int number2 = scan.nextInt();
        System.out.println("This is your 2nd number: " + number2);

        // -------------------------------------------------------------

        // Encode the user's 3rd number

        System.out.println();
        System.out.println("Please enter your 3rd number: ");
        //
        int number3 = scan.nextInt();
        System.out.println("This is your 3rd number: " + number3);

        // -------------------------------------------------------------

        // Encode the user's 4th number

        System.out.println();
        System.out.println("Please enter your 4th number: ");
        //
        int number4 = scan.nextInt();
        System.out.println("This is your 4th number: " + number4);

        // ------------------------------------------------------------

        // Encode the user's 5th number

        System.out.println();
        System.out.println("Please enter your 5th number: ");
        //
        int number5 = scan.nextInt();
        System.out.println("This is your 5th number: " + number5);

        // ------------------------------------------------------------

        // Reverse the user's selected numbers

        System.out.println("");
        System.out.println("This is your selected numbers: " + number1 + ", " + number2 + ", " + number3 + ", "
                + number4 + ", " + number5);
        System.out.println();

        // ------------------------------------------------------------------

        // Encode the user's reversed selected numbers

        System.out.println("This is a reversed list of your selected 5 numbers:");
        System.out.println(number5);
        System.out.println(number4);
        System.out.println(number3);
        System.out.println(number2);
        System.out.println(number1);

        // ------------------------------------------------------------------

        System.out.println("Thank You and Enjoy!");

        // ------------------------------------------------------------------

        scan.close();

    }
}
