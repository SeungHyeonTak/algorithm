package 백준.배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> resultList = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        Collections.sort(list);

        int max = list.get(n - 1);

        for (double i : list) {
            resultList.add(i / max * 100);
        }

        double sum = resultList.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println(sum / n);
    }
}
