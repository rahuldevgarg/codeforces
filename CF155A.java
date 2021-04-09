// 155A -  I_love_%username%
// https://codeforces.com/problemset/problem/155/A

import java.util.Scanner;

public class CF155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int max = f;
        int min = f;
        int amazing = 0;
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if (num > max) {
                amazing += 1;
                max = num;
            }
            if (num < min) {
                amazing += 1;
                min = num;
            }
        }
        System.out.println(amazing);
        sc.close();
    }
}
