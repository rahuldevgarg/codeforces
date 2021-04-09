// 71A -  Way Too Long Words
// https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class CF71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            String s = str[i];
            if (s.length() <= 10) {
                System.out.println(s);
                continue;
            }
            String sb = String.valueOf(s.charAt(0)) +
                    (s.length() - 2) +
                    s.charAt(s.length() - 1);
            System.out.println(sb);
        }
        sc.close();
    }
}
