// 236A -  Boy or Girl
// https://codeforces.com/problemset/problem/236/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < username.length(); i++) {
            chars.add(username.charAt(i));
        }
        if (chars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();

    }
}
