// 272A - Dima and Friends
// https://codeforces.com/problemset/problem/272/A

import java.util.Scanner;

public class CF272A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int answer = 0;
        for (int i = 0; i < n; ++i) {
            int f = sc.nextInt();
            total += f;
        }
        for (int i = 1; i <= 5; ++i) {
            if ((total + i) % (n + 1) != 1) {
                answer += 1;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
