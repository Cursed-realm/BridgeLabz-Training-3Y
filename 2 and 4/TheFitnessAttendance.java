// The Fitness Center Attendance 
// A gym tracks attendance for 10 days using an array.
// Use a for loop to calculate the total number of visitors in 10 days.
// Identify the day with the maximum attendance.
// Find the minimum attendance day.
// Display all days where attendance was above the average.
public class TheFitnessAttendance {
    public static void main(String[] args) {

        int[] dailyAttendance = { 75, 68, 90, 85, 65, 95, 82, 88, 71, 93 };

        int totalVisitors = 0;
        for (int visitors : dailyAttendance) {
            totalVisitors += visitors;
        }

        int maxAttendance = dailyAttendance[0];
        int minAttendance = dailyAttendance[0];
        int maxDay = 1;
        int minDay = 1;

        for (int i = 0; i < dailyAttendance.length; i++) {
            if (dailyAttendance[i] > maxAttendance) {
                maxAttendance = dailyAttendance[i];
                maxDay = i + 1;
            }
            if (dailyAttendance[i] < minAttendance) {
                minAttendance = dailyAttendance[i];
                minDay = i + 1;
            }
        }

        double averageAttendance = totalVisitors / (double) dailyAttendance.length;

        System.out.println("Fitness Center Attendance Analysis");
        System.out.println("--------------------------------");
        System.out.println(totalVisitors);
        System.out.println(averageAttendance);
        System.out.println("Maximum attendance: " + maxAttendance + " on day " + maxDay);
        System.out.println("Minimum attendance: " + minAttendance + " on day " + minDay);

        System.out.println("\nDays with above-average attendance:");
        for (int i = 0; i < dailyAttendance.length; i++) {
            if (dailyAttendance[i] > averageAttendance) {
                System.out.println(String.format("Day %d: %d visitors", (i + 1), dailyAttendance[i]));
            }
        }
    }

    public static double calculateAttendanceRate(int totalMembers, int attendedToday) {
        if (totalMembers == 0) {
            return 0.0;
        }
        return (attendedToday / (double) totalMembers) * 100;
    }

}