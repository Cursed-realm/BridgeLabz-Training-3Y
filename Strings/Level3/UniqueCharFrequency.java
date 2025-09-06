import java.util.Scanner;

public class UniqueCharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = sc.nextLine();
        char[] uniques = findUnique(txt);
        int[] freq = findCharFrequency(txt, uniques);

        System.out.println("Character frequencies (unique only):");
        for (int i = 0; i < uniques.length; i++) {
            if (uniques[i] != 0)
                System.out.println(uniques[i] + ": " + freq[i]);
        }
        sc.close();
    }

    public static char[] findUnique(String txt) {
        char[] result = new char[txt.length()];
        int k = 0;
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (result[j] == ch) { found = true; break; }
            }
            if (!found) result[k++] = ch;
        }
        return result;
    }

    public static int[] findCharFrequency(String txt, char[] uniques) {
        int[] freq = new int[uniques.length];
        for (int i = 0; i < uniques.length; i++) {
            if (uniques[i] != 0) {
                int count = 0;
                for (int j = 0; j < txt.length(); j++) {
                    if (txt.charAt(j) == uniques[i]) count++;
                }
                freq[i] = count;
            }
        }
        return freq;
    }
}
