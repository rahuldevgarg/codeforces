// 282A - Bit++
// https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;

public class CF282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            if (op.contains("++")) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
