import java.util.Scanner;
public class MenuProgram {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int mainChoice;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1.) Convert");
            System.out.println("2.) Arithmetic Operations");
            System.out.println("0.) Exit");
            System.out.print("Enter your Choice: ");
            mainChoice = input.nextInt(); // fixed typo

            switch (mainChoice) {
                case 1:
                    handleConversion(input);
                    break;
                case 2:
                    handleArithmetic(input);
                    break;
                case 0:
                    System.out.println("Exiting Program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        } while (mainChoice != 0);

        input.close();
    }

    public static void handleConversion(Scanner input) {
        System.out.print("Enter a decimal number to convert: ");
        int decimal = input.nextInt();

        System.out.println("Binary: " + decimalToBinary(decimal));
        System.out.println("Octal: " + decimalToOctal(decimal));
        System.out.println("Hexadecimal: " + decimalToHex(decimal));
    }

    public static void handleArithmetic(Scanner input) {
        int opChoice;

        do {
            System.out.println("\nArithmetic Menu:");
            System.out.println("1.) Addition");
            System.out.println("2.) Subtraction");
            System.out.println("0.) Back to Main Menu");
            System.out.print("Enter your Choice: ");
            opChoice = input.nextInt();

            if (opChoice == 0) return;

            int baseChoice;
            do {
                System.out.println("\nChoose Number Base: ");
                System.out.println("1.) Binary");
                System.out.println("2.) Octal");
                System.out.println("3.) Hexadecimal");
                System.out.println("0.) Back to Main Menu");
                System.out.print("Enter your Choice: ");
                baseChoice = input.nextInt();

                if (baseChoice == 0) return;

                System.out.print("Enter first number: ");
                String num1 = input.next();
                System.out.print("Enter second number: ");
                String num2 = input.next();

                int dec1 = convertToDecimal(num1, baseChoice);
                int dec2 = convertToDecimal(num2, baseChoice);

                if (opChoice == 2 && dec1 < dec2) {
                    System.out.println("Invalid! First number must be greater than second for subtraction.");
                    return;
                }

                int result = performArithmetic(dec1, dec2, opChoice);

                String output = switch (baseChoice) {
                    case 1 -> decimalToBinary(result);
                    case 2 -> decimalToOctal(result);
                    case 3 -> decimalToHex(result);
                    default -> "Invalid Base";
                };

                System.out.println("Result: " + output);

            } while (baseChoice != 0);

        } while (opChoice != 0);
    }

    public static String decimalToBinary(int num) {
        if (num == 0) return "0";
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }

    public static String decimalToOctal(int num) {
        if (num == 0) return "0";
        String octal = "";
        while (num > 0) {
            octal = (num % 8) + octal;
            num /= 8;
        }
        return octal;
    }

    public static String decimalToHex(int num) {
        if (num == 0) return "0";
        String hex = "";
        String hexDigits = "0123456789ABCDEF";
        while (num > 0) {
            int remainder = num % 16;
            hex = hexDigits.charAt(remainder) + hex;
            num /= 16;
        }
        return hex;
    }

    public static int convertToDecimal(String num, int baseChoice) {
        int base;
        if (baseChoice == 1) base = 2;
        else if (baseChoice == 2) base = 8;
        else if (baseChoice == 3) base = 16;
        else base = 10;

        int decimal = 0;
        int power = 1;

        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            int digit;

            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else if (c >= 'a' && c <= 'f') {
                digit = c - 'a' + 10;
            } else {
                System.out.println("Invalid character '" + c + "' in input.");
                return 0;
            }

            if (digit >= base) {
                System.out.println("Invalid digit '" + c + "' for base " + base);
                return 0;
            }

            decimal += digit * power;
            power *= base;
        }

        return decimal;
    }

    public static int performArithmetic(int a, int b, int opChoice) {
        if (opChoice == 1) return a + b;
        else return a - b;
    }
}