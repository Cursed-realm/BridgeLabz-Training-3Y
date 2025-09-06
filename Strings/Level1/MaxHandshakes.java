import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        int max = calculateHandshakes(n);
        System.out.println("Maximum number of possible handshakes: " + max);
        scanner.close();
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
