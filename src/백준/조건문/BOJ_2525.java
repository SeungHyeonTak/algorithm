package 백준.조건문;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int plus_m = sc.nextInt();

        int add_m = m + plus_m;

        if (add_m >= 60) {
            int th = add_m / 60;
            int tm = add_m % 60;

            h += th;
            add_m = tm;
        }

        if (h >= 24)
            h -= 24;

        System.out.println(h + " " + add_m);
    }
}
