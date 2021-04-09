// 248A -  Cupboards
// https://codeforces.com/problemset/problem/248/A

import java.util.Scanner;

public class CF248A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            left += l;
            int r = sc.nextInt();
            right += r;
        }
        System.out.println(Math.min(left, n - left) + Math.min(right, n - right));
        sc.close();
    }
}
