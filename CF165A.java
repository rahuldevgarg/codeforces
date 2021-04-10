// 165A - Supercentral Point
// https://codeforces.com/problemset/problem/165/A

import java.util.Scanner;

public class CF165A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean r = false;
            boolean u = false;
            boolean l = false;
            boolean d = false;
            for (int j = 0; j < n; j++) {
                if (x[j] > x[i] && y[j] == y[i]) r = true;
                if (x[j] < x[i] && y[j] == y[i]) l = true;
                if (x[j] == x[i] && y[j] > y[i]) u = true;
                if (x[j] == x[i] && y[j] < y[i]) d = true;
            }
            if (r && l && u && d) count++;
        }
        System.out.println(count);
        sc.close();

    }
}
