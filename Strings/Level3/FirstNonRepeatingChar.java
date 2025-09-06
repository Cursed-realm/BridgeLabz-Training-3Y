
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = sc.nextLine();
        char ch = firstNonRepeating(txt);
        System.out.println(ch != 0 ? "First non-repeating: " + ch : "No non-repeating character.");
        sc.close();
    }

    public static char firstNonRepeating(String txt) {
        int[] freq = new int[256];
        for (int i = 0; i < txt.length(); i++) freq[txt.charAt(i)]++;
        for (int i = 0; i < txt.length(); i++)
            if (freq[txt.charAt(i)] == 1) return txt.charAt(i);
        return 0;
    }
}
