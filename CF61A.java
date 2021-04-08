// 61A -  Ultra-Fast Mathematician
// http://codeforces.com/problemset/problem/61/A

import java.util.Arrays;
import java.util.Scanner;

public class CF61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] mas = new int[105];
        Arrays.fill(mas, 1);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                mas[i] = 0;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.print(mas[i]);
        }
        sc.close();
    }
}
