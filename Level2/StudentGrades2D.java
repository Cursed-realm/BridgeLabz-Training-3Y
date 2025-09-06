import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3]; // physics, chemistry, maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.printf("Enter %s marks for student %d: ", subject, i + 1);
                    int mark = scanner.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Marks cannot be negative. Enter again.");
                    }
                }
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        scanner.close();
    }
}
