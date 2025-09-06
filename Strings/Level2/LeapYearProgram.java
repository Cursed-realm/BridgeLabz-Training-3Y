import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
        sc.close();
    }

    public static boolean isLeapYear(int yr) {
        return (yr % 400 == 0) || (yr % 4 == 0 && yr % 100 != 0);
    }
}
