// 271A - Beautiful Year
// http://codeforces.com/problemset/problem/271/A

import java.util.Scanner;

public class CF271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        while (true) {
            y += 1;
            int a = y / 1000;
            int b = y / 100 % 10;
            int c = y / 10 % 10;
            int d = y % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                break;
            }
        }
        System.out.print(y);
    }
}
