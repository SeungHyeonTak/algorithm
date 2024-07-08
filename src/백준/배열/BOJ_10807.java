package 백준.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> arrayList = new ArrayList<>();

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int essence = sc.nextInt();
            arrayList.add(essence);
        }

        int select = sc.nextInt();
//        int check = 0;
//        int[] check = {0};

//        for (Object o : arrayList) {
//            if (o.equals(select)) {
//                check++;
//            }
//        }

//        arrayList.forEach(o -> {
//            if (o.equals(select)){
//                check[0]++;
//            }
//        });

        long check = arrayList.stream()
                .filter(o -> o.equals(select))
                .count();

        System.out.println(check);
    }
}
