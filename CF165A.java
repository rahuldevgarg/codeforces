// 165A - Supercentral Point
// https://codeforces.com/problemset/problem/165/A

import java.util.Scanner;

public class CF165A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] points = new Node[n+1];
        for (int i = 1; i <= n; i++) {
            points[i] = new Node(sc.nextInt(), sc.nextInt());
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                if (points[j].y == points[i].y && points[i].x < points[j].x) a = 1; //right
                else if (points[j].y == points[i].y && points[i].x > points[j].x) b = 1; //left
                else if (points[j].y > points[i].y && points[i].x == points[j].x) c = 1; //up
                else if (points[j].y < points[i].y && points[i].x == points[j].x) d = 1; //down

                if ((a + b + c + d) == 0) {
                    ans++;
                    break;
                }

            }
        }
        System.out.println(ans);
    }
}

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}