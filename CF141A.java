// 141A -  Amusing Joke
// https://codeforces.com/problemset/problem/141/A

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> chars = new HashMap<>();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        char[] charsa = a.toCharArray();
        char[] charsb = b.toCharArray();
        char[] charsc = c.toCharArray();
        for (char i : charsa
        ) {
            if (chars.containsKey(i)) {
                chars.put(i, chars.get(i) + 1);
            } else {
                chars.put(i, 1);
            }
        }
        for (char i : charsb
        ) {
            if (chars.containsKey(i)) {
                chars.put(i, chars.get(i) + 1);
            } else {
                chars.put(i, 1);
            }
        }
        for (char i : charsc
        ) {
            if (chars.containsKey(i)) {
                int n = chars.get(i);
                if (n > 1) {
                    chars.put(i, n - 1);
                } else if (n == 1) {
                    chars.remove(i);
                }
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        if (chars.size() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();
    }
}
