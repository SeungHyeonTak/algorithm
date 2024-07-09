package 백준.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10810 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(0);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = (a > 0) ? a - 1 : a; j < b; j++) {
                list.set(j, c);
            }
        }

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
