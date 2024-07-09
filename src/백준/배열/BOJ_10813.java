package 백준.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Object temp_a = list.get(a - 1);
            Object temp_b = list.get(b - 1);

            list.set(a - 1, temp_b);
            list.set(b - 1, temp_a);
        }

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
