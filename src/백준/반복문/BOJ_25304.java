package 백준.반복문;

import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_money = sc.nextInt();
        int total_count = sc.nextInt();

        int add_money = 0;

        for (int i = 0; i < total_count; i++) {
            int money = sc.nextInt();
            int count = sc.nextInt();

            money *= count;
            add_money += money;
        }

        if (total_money == add_money) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
