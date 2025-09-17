import java.util.Scanner;

public class TravelCost {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // -----------------------------------------

        InputCosts();

    }

    static void InputCosts() {
        int kilometers = 0;
        float fuelConsumption = 0;
        int fuel = 0;

        System.out.print("Please enter your distance in kilometers:");
        kilometers = input.nextInt();
        System.out.println();

        System.out.print("Please enter your fuel consumption:");
        fuelConsumption = input.nextFloat();
        System.out.println();

        System.out.print("Please enter fuel price per liter:");
        fuel = input.nextInt();
        System.out.println();

        Formula(kilometers, fuelConsumption, fuel);
    }

    static void Formula(int kilometers, float fuelConsumption, int fuel) {

        float totalFuelNeeded = kilometers * fuelConsumption;
        float totalCost = totalFuelNeeded * fuel;
        float costPerKilometer = totalCost / kilometers;

        DisplayResult(totalFuelNeeded, totalCost, costPerKilometer);
    }

    static void DisplayResult(float totalFuelNeeded, float totalCost, float costPerKilometer) {

        System.out.print("Total Fuel Needed: " + totalFuelNeeded);
        System.out.println();
        System.out.print("Total Fuel Cost: " + totalCost);
        System.out.println();
        System.out.print("Fuel Cost per km: " + costPerKilometer);
        System.out.println();
    }
}
