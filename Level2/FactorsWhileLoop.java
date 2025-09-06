import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Number is not positive.");
            scanner.close();
            return;
        }

        System.out.println("Factors of " + number + " are:");
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0) System.out.println(counter);
            counter++;
        }

        scanner.close();
    }
}
