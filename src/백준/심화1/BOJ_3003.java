package 백준.심화1;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {1, 1, 2, 2, 2, 8};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int k = sc.nextInt();

            if (list[i] - k != 0) {
                arrayList.add(list[i] - k);
            } else {
                arrayList.add(0);
            }
        }

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
    }
}
