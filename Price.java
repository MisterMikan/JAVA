import java.util.Scanner;
public class Price {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       // ----- START --------------------------------------------------------------------------
       
       System.out.print("Please enter a price for item 1:");
       int number1 = scan.nextInt();
       System.out.println();

       System.out.print("Please enter a price for item 2:");
       int number2 = scan.nextInt();
       System.out.println();

       System.out.print("Please enter a price for item 3:");
       int number3 = scan.nextInt();
       System.out.println();

       // -----------------------------------------------------------------------------------------

       float totalPrice = number1 + number2 + number3;
        System.out.print("Total Price: " + totalPrice);
        System.out.println();

        float averagePrice = totalPrice / 3;
        System.out.print("Average Price: " + averagePrice);
        System.out.println();

        float totalTax = totalPrice * 0.12f + totalPrice;
        System.out.print("Total price with 12% sales tax: " + totalTax);
        System.out.println();


        scan.close();
        // ----- END -------------------------------------------------------------------------------

        


        
    }
    
}
