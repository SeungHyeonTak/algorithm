package 백준.문자와문자열;

import java.util.Scanner;

public class BOJ_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array = {
                {},  // 1
                {"A", "B", "C"},  // 2
                {"D", "E", "F"},  // 3
                {"G", "H", "I"},  // 4
                {"J", "K", "L"},  // 5
                {"M", "N", "O"},  // 6
                {"P", "Q", "R", "S"},  // 7
                {"T", "U", "V"},  // 8
                {"W", "X", "Y", "Z"},  // 9
        };

        String str = sc.next();
        int temp = 0;

        for (int k = 0; k < str.length(); k++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].equals(String.valueOf(str.charAt(k)))) {
                        temp += i + 1;
                    }
                }
            }
        }

        System.out.println(temp + str.length());
    }
}
