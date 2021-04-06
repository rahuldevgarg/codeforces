// 59A - Word
// http://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

public class CF59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
                continue;
            }
            lower++;
        }
        if (lower >= upper) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toUpperCase());
        }
        sc.close();

    }
}
