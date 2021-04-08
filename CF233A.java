// 233A -  Perfect Permutation
// http://codeforces.com/problemset/problem/233/A

import java.util.Scanner;

public class CF233A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            System.out.print("2 1");
            for (int i = 3; i < n; i += 2) {
                System.out.print(" " + (i + 1) + " " + i);
            }
        }
        sc.close();
    }
}
