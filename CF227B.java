// 227B - Effective Approach
// https://codeforces.com/problemset/problem/227/B

import java.util.Scanner;

public class CF227B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] index = new int[100001];
        for (int i = 1; i <= n; ++i) {
            int a = sc.nextInt();
            index[a] = i;
        }

        int m = sc.nextInt();
        long Vasya = 0L;
        long Petya = 0L;
        while (m-- > 0) {
            int b = sc.nextInt();
            Vasya += index[b];
            Petya += (n + 1 - index[b]);
        }
        System.out.print(Vasya);
        System.out.print(" ");
        System.out.print(Petya);
        sc.close();
    }
}
