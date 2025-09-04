import java.util.Scanner;

public class OddEvenPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number is not a natural number.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
        scanner.close();
    }
}
