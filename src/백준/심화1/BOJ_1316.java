package 백준.심화1;

import java.util.Scanner;

public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isGroupString(sc.next()))
                count++;
        }

        System.out.println(count);
    }

    static boolean isGroupString(String str) {
        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            int prev = (i > 0) ? str.charAt(i - 1) : 0;

            if (alpha[now - 'a'] == false) {
                alpha[now - 'a'] = true;
            } else if (now != prev) {
                return false;
            }
        }

        return true;
    }
}
