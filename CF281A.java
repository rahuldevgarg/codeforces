// 281A - Word Capitalization
// http://codeforces.com/problemset/problem/281/A

import java.util.Scanner;

public class CF281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String res = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println(res);
    }
}
