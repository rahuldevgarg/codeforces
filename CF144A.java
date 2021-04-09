// 233A -  Arrival of the General
// https://codeforces.com/problemset/problem/144/A

import java.util.Scanner;

public class CF144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int large = 0;
        int small = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[large]) {
                large = i;
            }
            if (arr[i] <= arr[small]) {
                small = i;
            }
        }
        if (large > small) {
            small += 1;
        }
        System.out.println(large + (n - 1 - small));
        sc.close();
    }
}
