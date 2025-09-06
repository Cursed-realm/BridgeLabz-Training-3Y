import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = scanner.nextInt();
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        scanner.close();
    }

    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }
}
