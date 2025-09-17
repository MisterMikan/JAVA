import java.util.Scanner;

public class Kelvin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Relay the problem given

        System.out.println("Please enter a temperature (Celsius):");

        // ---------------------------------------------------

        // Read the Celsius temperature from the user

        double celsius = scan.nextDouble();
        double kelvin = celsius + 273.15;

        // ----------------------------------------------------

        System.out.println("This is your selected Celsius temperature: " + celsius);

        // ----------------------------------------------------

        System.out.println("This is your Celsius temperature in Kelvin: " + kelvin);

        scan.close();
    }
}
