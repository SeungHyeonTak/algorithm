package 백준.문자와문자열;

import java.util.Scanner;

public class BOJ_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(str.charAt(i - 1));
    }
}
