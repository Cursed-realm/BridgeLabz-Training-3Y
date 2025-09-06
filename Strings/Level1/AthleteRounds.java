import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double s1 = scanner.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double s2 = scanner.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double s3 = scanner.nextDouble();
        int rounds = calculateRounds(s1, s2, s3, 5000); // 5000 is 5km in meters
        System.out.println("Rounds to complete 5km run: " + rounds);
        scanner.close();
    }

    public static int calculateRounds(double s1, double s2, double s3, double distance) {
        double perimeter = s1 + s2 + s3;
        return (int)Math.ceil(distance / perimeter);
    }
}
