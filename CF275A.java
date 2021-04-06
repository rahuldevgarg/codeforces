// 275A - Lights Out
// http://codeforces.com/problemset/problem/275/A

import java.util.Scanner;

public class CF275A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int[][] state = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
                state[i][j] = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] == 0)
                    continue;
                if (mat[i][j] % 2 == 0)
                    continue;
                state[i][j] = 1 - state[i][j];
                if ((j + 1) < 3) {

                    state[i][j + 1] = 1 - state[i][j + 1];
                }
                if ((i + 1) < 3) {
                    state[i + 1][j] = 1 - state[i + 1][j];
                }
                if ((i - 1) >= 0) {
                    state[i - 1][j] = 1 - state[i - 1][j];
                }
                if ((j - 1) >= 0) {
                    state[i][j - 1] = 1 - state[i][j - 1];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(state[i][j]);
            System.out.println();
        }
        sc.close();

    }
}
