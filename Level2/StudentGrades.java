import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                int mark = scanner.nextInt();
                if (mark >= 0) {
                    physics[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Enter again.");
                }
            }
            while (true) {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                int mark = scanner.nextInt();
                if (mark >= 0) {
                    chemistry[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Enter again.");
                }
            }
            while (true) {
                System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
                int mark = scanner.nextInt();
                if (mark >= 0) {
                    maths[i] = mark;
                    break;
                } else {
                    System.out.println("Marks cannot be negative. Enter again.");
                }
            }
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            double p = percentages[i];
            if (p >= 90) grades[i] = 'A';
            else if (p >= 80) grades[i] = 'B';
            else if (p >= 70) grades[i] = 'C';
            else if (p >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%c%n",
                (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        scanner.close();
    }
}
