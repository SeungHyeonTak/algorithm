package 백준.문자와문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();

            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).charAt(0) + "" + list.get(i).charAt(list.get(i).length() - 1));
        }
    }
}
