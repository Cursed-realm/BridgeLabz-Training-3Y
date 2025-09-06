import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter power: ");
        int power = scanner.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Enter positive integers.");
            scanner.close();
            return;
        }

        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is " + result);

        scanner.close();
    }
}

