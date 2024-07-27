package 백준.심화1;

import java.util.Scanner;

public class BOJ_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalScore = 0;
        float totalCredit = 0;

        for (int i = 0; i < 20; i++) {
            String a = sc.next();
            float b = sc.nextFloat();
            String c = sc.next();

            totalCredit += b;

            if (c.equals("A+")) b *= 4.5;
            else if (c.equals("A0")) b *= 4.0;
            else if (c.equals("B+")) b *= 3.5;
            else if (c.equals("B0")) b *= 3.0;
            else if (c.equals("C+")) b *= 2.5;
            else if (c.equals("C0")) b *= 2.0;
            else if (c.equals("D+")) b *= 1.5;
            else if (c.equals("D0")) b *= 1.0;
            else if (c.equals("F")) b *= 0.0;
            else if (c.equals("P")) {
                totalCredit -= b;
                b *= 0;
            }

            totalScore += b;
        }

        System.out.println(totalScore / totalCredit);
    }
}
