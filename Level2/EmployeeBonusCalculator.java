import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            // Input salary with validation
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                if (salary <= 0) {
                    System.out.println("Invalid salary, please enter a positive number.");
                    continue;
                }
                salaries[i] = salary;
                break;
            }
            // Input years of service with validation
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();
                if (years < 0) {
                    System.out.println("Invalid years of service, please enter a non-negative number.");
                    continue;
                }
                yearsOfService[i] = years;
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Bonus and Salary Details");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout = %.2f%n", totalBonus);
        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);

        scanner.close();
    }
}
