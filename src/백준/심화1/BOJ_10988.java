package 백준.심화1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            list.add(String.valueOf(str.charAt(i)));
        }

        Collections.reverse(list);

        System.out.println(validation(list, str));

    }

    public static int validation(ArrayList<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) != str.charAt(i)) {
                return 0;
            }
        }
        return 1;
    }
}
