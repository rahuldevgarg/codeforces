// 231A - Team
// https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;

public class CF231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((sc.nextInt() + sc.nextInt() + sc.nextInt()) >= 2) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
