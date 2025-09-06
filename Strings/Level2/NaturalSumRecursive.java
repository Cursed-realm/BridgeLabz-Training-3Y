import java.util.Scanner;

public class NaturalSumRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number greater than 0");
            sc.close();
            return;
        }

        int sumRec = sumRecursive(n);
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum by recursion: " + sumRec);
        System.out.println("Sum by formula: " + sumFormula);
        System.out.println("Both results equal? " + (sumRec == sumFormula));
        sc.close();
    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }
}
