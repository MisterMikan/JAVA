import java.util.Scanner;
public class PriceMethod {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
     
        InputPrice();
    }
    
    static void InputPrice(){
        float price1 = 0;
        float price2 = 0;
        float price3 = 0;

        System.out.print("Please enter a price for item 1:");
        price1 = input.nextFloat();

        System.out.print("Please enter a price for item 2:");
        price2 = input.nextFloat();

        System.out.print("Please enter a price for item 3:");
        price3 = input.nextFloat();

        Solveprice(price1, price2, price3);
    }

    static void Solveprice(float price1, float price2, float price3){
        float totalPrice = price1 + price2 + price3;
        float averagePrice = totalPrice / 3;
        float totalPriceWithTax = totalPrice * 1.12f;

        DisplayResult(totalPrice, averagePrice, totalPriceWithTax);
    }

    static void DisplayResult(float totalPrice, float averagePrice, float totalPriceWithTax){
        System.out.print("Total Price: " + totalPrice);
        System.out.println();
        System.out.print("Average Price: " + averagePrice);
        System.out.println();
        System.out.print("Total Price with 12% Sales Tax: " + totalPriceWithTax);
        System.out.println();

    }
}
