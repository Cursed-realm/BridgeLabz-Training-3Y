import java.util.Arrays;
import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        System.out.println("Generated numbers: " + Arrays.toString(nums));

        double[] stats = findAverageMinMax(nums);
        System.out.printf("Average: %.2f, Min: %d, Max: %d%n", stats[0], (int)stats[1], (int)stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(9000) + 1000; // 1000-9999
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }
}
