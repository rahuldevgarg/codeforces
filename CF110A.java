// 110A - Nearly Lucky Number
// http://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class CF110A {
    private static boolean isLucky(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4') {
                continue;
            }
            if (str.charAt(i) == '7') {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String number = sc.next();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '4') {
                count++;
            }
            if (number.charAt(i) == '7') {
                count++;
            }
        }
        if (isLucky(String.valueOf(count))) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
