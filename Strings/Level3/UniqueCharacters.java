import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = sc.nextLine();
        int len = getLength(txt);
        char[] uniques = findUnique(txt, len);
        System.out.print("Unique characters: ");
        for (char c : uniques)
            if (c != 0) System.out.print(c + " ");
        System.out.println();
        sc.close();
    }

    public static int getLength(String txt) {
        int count = 0;
        try {
            while (true) {
                txt.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] findUnique(String txt, int len) {
        char[] result = new char[len];
        int k = 0;
        for (int i = 0; i < len; i++) {
            char ch = txt.charAt(i);
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (result[j] == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[k++] = ch;
            }
        }
        return result;
    }
}
