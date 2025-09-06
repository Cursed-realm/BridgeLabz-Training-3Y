import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double baseCm = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();

        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = 0.5 * baseCm * heightCm;

        System.out.println("Area of the triangle in square inches is " + areaInches +
                           " and in square centimeters is " + areaCm);

        scanner.close();
    }
}
