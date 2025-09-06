import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = scanner.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;

        char grade;
        String remarks;

        if (percentage >= 90) {
            grade = 'A';
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = 'B';
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = 'C';
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = 'D';
            remarks = "Average";
        } else {
            grade = 'F';
            remarks = "Fail";
        }

        System.out.printf("Average Mark = %.2f%%, Grade = %c, Remarks = %s%n", percentage, grade, remarks);

        scanner.close();
    }
}
