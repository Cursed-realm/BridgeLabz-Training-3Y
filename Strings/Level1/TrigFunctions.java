import java.util.Scanner;

public class TrigFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("sin(%.2f°)=%.4f, cos(%.2f°)=%.4f, tan(%.2f°)=%.4f%n",
            angle, results[0], angle, results[1], angle, results[2]);
        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }
}
