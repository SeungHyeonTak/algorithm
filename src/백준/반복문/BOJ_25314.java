package 백준.반복문;

import java.util.Scanner;

public class BOJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt() / 4;

        for (int j = 0; j < i; j++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
