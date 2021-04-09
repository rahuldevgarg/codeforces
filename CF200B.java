// 200B -  Drinks
// https://codeforces.com/problemset/problem/200/B

import java.util.Scanner;

public class CF200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum / n);
        sc.close();
    }
}
