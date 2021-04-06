// 32B - Borze
// http://codeforces.com/problemset/problem/32/B

import java.util.Scanner;

public class CF32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '.') {
                sb.append('0');
            } else if (s.charAt(i) == '-') {
                if (s.charAt(i + 1) == '.') {
                    sb.append('1');
                    i++;
                } else if (s.charAt(i + 1) == '-') {
                    sb.append('2');
                    i++;
                }
            }
        }
        System.out.print(sb.toString());
    }
}
