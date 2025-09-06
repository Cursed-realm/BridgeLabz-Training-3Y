import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;

        System.out.println("Bonus amount: " + bonus);

        scanner.close();
    }
}
