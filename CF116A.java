// 116A -  Tram
// https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;

public class CF116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int inside = 0;
        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            inside += (enter - exit);
            if (inside > max) {
                max = inside;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
