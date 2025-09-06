import java.util.Scanner;

public class CharFrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        System.out.println("Character frequencies (nested loops):");
        for (int i = 0; i < freq.length; i++) {
            if (chars[i] != '0')
                System.out.println(chars[i] + ": " + freq[i]);
        }
        sc.close();
    }
}
