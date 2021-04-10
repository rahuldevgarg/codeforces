// 112A - Petya and Strings
// https://codeforces.com/problemset/problem/112/A

import java.util.Scanner;

public class CF112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int ans = a.compareTo(b);
        System.out.print(Integer.compare(ans, 0));
        sc.close();
    }
}
