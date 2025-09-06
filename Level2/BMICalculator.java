import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weights[i] = scanner.nextDouble();
                if (weights[i] <= 0) {
                    System.out.println("Please enter positive weight.");
                } else break;
            }
            while (true) {
                System.out.print("Enter height (meters) for person " + (i + 1) + ": ");
                heights[i] = scanner.nextDouble();
                if (heights[i] <= 0) {
                    System.out.println("Please enter positive height.");
                } else break;
            }

            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] < 18.5) weightStatus[i] = "Underweight";
            else if (bmi[i] < 24.9) weightStatus[i] = "Normal weight";
            else if (bmi[i] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                (i + 1), heights[i], weights[i], bmi[i], weightStatus[i]);
        }
        scanner.close();
    }
}
