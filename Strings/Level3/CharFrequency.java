import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt = sc.nextLine();
        String[][] freqArr = findFrequency(txt);
        System.out.println("Character frequencies:");
        for (int i = 0; i < freqArr.length; i++)
            System.out.println(freqArr[i][0] + ": " + freqArr[i][1]);
        sc.close();
    }

    public static String[][] findFrequency(String txt) {
        int[] freq = new int[256];
        for (int i = 0; i < txt.length(); i++) freq[txt.charAt(i)]++;
        int n = 0;
        for (int i = 0; i < txt.length(); i++)
            if (freq[txt.charAt(i)] > 0) n++;
        String[][] arr = new String[n][2];
        boolean[] done = new boolean[256];
        int idx = 0;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (!done[c]) {
                arr[idx][0] = String.valueOf(c);
                arr[idx][1] = String.valueOf(freq[c]);
                done[c] = true;
                idx++;
            }
        }
        return arr;
    }
}
