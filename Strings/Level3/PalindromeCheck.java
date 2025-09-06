import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean logic1 = isPalindrome(text);
        boolean logic2 = isPalindromeRec(text, 0, text.length() - 1);
        boolean logic3 = isPalindromeArray(text);

        System.out.println("Logic 1 (index scan): " + (logic1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (recursion): " + (logic2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (char arrays): " + (logic3 ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }

    // Logic 1: Compare indices
    public static boolean isPalindrome(String txt) {
        int s = 0, e = txt.length() - 1;
        while (s < e) {
            if (txt.charAt(s) != txt.charAt(e)) return false;
            s++; e--;
        }
        return true;
    }
    // Logic 2: Recursion
    public static boolean isPalindromeRec(String txt, int s, int e) {
        if (s >= e) return true;
        if (txt.charAt(s) != txt.charAt(e)) return false;
        return isPalindromeRec(txt, s + 1, e - 1);
    }
    // Logic 3: Arrays
    public static boolean isPalindromeArray(String txt) {
        char[] arr = txt.toCharArray();
        char[] rev = reverseArray(txt);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != rev[i]) return false;
        return true;
    }
    public static char[] reverseArray(String txt) {
        char[] rev = new char[txt.length()];
        for (int i = 0; i < txt.length(); i++)
            rev[i] = txt.charAt(txt.length() - 1 - i);
        return rev;
    }
}
