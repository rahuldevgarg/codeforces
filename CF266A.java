// 266A - Stones on the Table
// http://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class CF266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String colors = sc.next();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (colors.charAt(i) == colors.charAt(i + 1)) {
                count++;
            }
        }
        System.out.print(count);
    }
}
