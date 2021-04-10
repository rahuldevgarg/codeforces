// 151A - Soft Drinking
// https://codeforces.com/problemset/problem/151/A

import java.util.Scanner;

public class CF151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int drink = (k * l) / nl;
        int salt = p / np;
        int lime = c * d;
        System.out.println(Math.min(drink, Math.min(salt, lime)) / n);
        sc.close();

    }
}
