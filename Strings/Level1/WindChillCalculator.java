import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (°C): ");
        double temp = scanner.nextDouble();
        System.out.print("Enter wind speed (km/h): ");
        double windSpeed = scanner.nextDouble();
        double chill = calculateWindChill(temp, windSpeed);
        System.out.printf("Wind chill temperature: %.2f°C%n", chill);
        scanner.close();
    }

    public static double calculateWindChill(double temp, double windSpeed) {
        // Wind chill formula (typical for °C and km/h)
        return 13.12 + 0.6215 * temp - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * temp * Math.pow(windSpeed, 0.16);
    }
}
