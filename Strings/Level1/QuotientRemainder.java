import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int d = scanner.nextInt();
        int[] result = findRemainderAndQuotient(n, d);
        System.out.println("Quotient: " + result[1] + ", Remainder: " + result[0]);
        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
