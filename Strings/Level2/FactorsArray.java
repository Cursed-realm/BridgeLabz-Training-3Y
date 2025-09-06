import java.util.Scanner;
import java.util.Arrays;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of factors: " + sumArray(factors));
        System.out.println("Sum of squares of factors: " + sumSquares(factors));
        System.out.println("Product of factors: " + productArray(factors));
        scanner.close();
    }

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static int productArray(int[] arr) {
        int product = 1;
        for (int n : arr) product *= n;
        return product;
    }

    public static int sumSquares(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += Math.pow(n, 2);
        return sum;
    }
}
