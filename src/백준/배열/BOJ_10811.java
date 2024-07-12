package 백준.배열;

import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = 0;

        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            while (a < b) {
                temp = list[a];
                list[a] = list[b];
                list[b] = temp;
                a++;
                b--;
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
