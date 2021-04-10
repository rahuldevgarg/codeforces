// 133A - HQ9+
// https://codeforces.com/problemset/problem/133/A

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class CF133A {
    final private static Set<Character> HQ9 = new HashSet<Character>() {{
        add('H');
        add('Q');
        add('9');
    }};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (HQ9.contains(str.charAt(i))) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
