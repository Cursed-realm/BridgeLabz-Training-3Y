import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even." : "odd."));
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int compareResult = compare(numbers[0], numbers[4]);
        if (compareResult == 1) System.out.println("First number is greater than last number.");
        else if (compareResult == 0) System.out.println("First and last numbers are equal.");
        else System.out.println("First number is less than last number.");

        sc.close();
    }

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }
}
