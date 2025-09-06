import java.util.Scanner;

public class TeamBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2]; // [weight, heightCM]
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }
        String[][] bmiTable = computeBMIStatusTable(persons);
        displayTable(bmiTable);
        sc.close();
    }

    public static String[][] computeBMIStatusTable(double[][] persons) {
        String[][] result = new String[10][4];
        for (int i = 0; i < persons.length; i++) {
            double heightM = persons[i][1] / 100;
            double bmi = persons[i][0] / (heightM * heightM);
            result[i][0] = String.format("%.2f", persons[i][0]);
            result[i][1] = String.format("%.2f", persons[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = bmiStatus(bmi);
        }
        return result;
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-12s\n", "Weight", "Height", "BMI", "Status");
        for (String[] row : table)
            System.out.printf("%-10s %-10s %-10s %-12s\n", row[0], row[1], row[2], row[3]);
    }
}
