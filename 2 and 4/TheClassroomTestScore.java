// The Classroom Test Scores 
// A teacher records the marks of 12 students in an array.
// Use a loop to calculate the class average.
// Find the highest and lowest marks.
// Count how many students scored above the average.
// Display a message if any student scored below passing marks (say 40).
public class TheClassroomTestScore {
    public static void main(String[] args) {  
        int[] studentMarks = { 65, 78, 35, 92, 88, 45, 73, 85, 55, 38, 68, 95 };
        final int PASSING_MARK = 40;

        int totalMarks = 0;
        for (int mark : studentMarks) {
            totalMarks += mark;
        }
        double averageMark = totalMarks / (double) studentMarks.length;

        int highestMark = studentMarks[0];
        int lowestMark = studentMarks[0];
        int aboveAverage = 0;
        boolean hasFailingGrades = false;

        for (int mark : studentMarks) {
            if (mark > highestMark) {
                highestMark = mark;
            }
            if (mark < lowestMark) {
                lowestMark = mark;
            }
            if (mark > averageMark) {
                aboveAverage++;
            }
            if (mark < PASSING_MARK) {
                hasFailingGrades = true;
            }
        }

        System.out.println("Classroom Test Score Analysis");
        System.out.println("----------------------------");
        System.out.printf("Class Average: %.2f\n", averageMark);
        System.out.printf("Highest Mark: %d\n", highestMark);
        System.out.printf("Lowest Mark: %d\n", lowestMark);
        System.out.printf("Number of students above average: %d\n", aboveAverage);

        if (hasFailingGrades) {
            System.out.println("\nWarning: Some students scored below passing mark!");
            System.out.println("Students with failing grades:");
            for (int i = 0; i < studentMarks.length; i++) {
                if (studentMarks[i] < PASSING_MARK) {
                    System.out.printf("Student %d: %d marks\n", (i + 1), studentMarks[i]);
                }
            }
        }
    }

}