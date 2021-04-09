// 228A -  Is your horseshoe on the other hoof?
// https://codeforces.com/problemset/problem/228/A

import java.util.Arrays;
import java.util.Scanner;

public class CF228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
