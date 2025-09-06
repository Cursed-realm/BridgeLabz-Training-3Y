import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }

        int i = 100;
        System.out.println("Multiples of " + number + " below 100 are:");
        while (i > 0) {
            if (i % number == 0) {
                System.out.println(i);
            }
            i--;
        }

        scanner.close();
    }
}
