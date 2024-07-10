package 백준.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stList = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<Integer> attendance = new ArrayList<>();
        int max = 30;
        int n = 28;

        for (int i = 1; i <= max; i++) {
            attendance.add(i);
        }

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            stList.add(a);
        }

        for (Integer i : attendance) {
            boolean check = false;
            for (Integer j : stList) {
                if (i == j) {
                    check = true;
                }
            }

            if (!check) {
                tempList.add(i);
            }
        }

        for (Integer result : tempList) {
            System.out.println(result);
        }
    }
}
