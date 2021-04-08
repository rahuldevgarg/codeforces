// 80A -  Panoramix's Prediction
// http://codeforces.com/problemset/problem/80/A

import java.util.Scanner;

public class CF80A {
    private static final int[] mas = {
            2,
            3,
            5,
            7,
            11,
            13,
            17,
            19,
            23,
            29,
            31,
            37,
            41,
            43,
            47
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = 0;
        for (int i = 0; i < 14; i++) {
            if (a == mas[i] && b == mas[i + 1]) {
                h++;
                break;
            }
        }
        if (h == 0) {
            System.out.print("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();
    }
}
