package 백준.심화1;

import java.util.Scanner;

public class BOJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strList = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = sc.next();

        for (int i = 0; i < strList.length; i++) {
            if (str.contains(strList[i])) {
                str = str.replace(strList[i], "#");
            }
        }

        System.out.println(str.length());
    }
}
