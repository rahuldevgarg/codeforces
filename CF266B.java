// 266B - Queue at the School
// http://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class CF266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String queue = sc.next();
        char[] state = queue.toCharArray();
        char[] state1 = queue.toCharArray();
        for (int j = 0; j < t; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (state1[i] == 'B' && state1[i + 1] == 'G') {
                    char temp = state[i];
                    state[i] = state[i + 1];
                    state[i + 1] = temp;
                }
            }
            if (n >= 0) System.arraycopy(state, 0, state1, 0, n);


        }
        for (
                char i : state
        ) {
            System.out.print(i);
        }
    }
}
