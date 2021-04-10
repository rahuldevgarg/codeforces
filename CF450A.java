// 450A - Jzzhu and Children
// https://codeforces.com/problemset/problem/450/A

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class CF450A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Child> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(new Child(i, sc.nextInt()));
        }
        while (queue.size() > 1) {
            Child i = queue.peek();
            if (i.req > m) {
                queue.add(new Child(i.index, i.req - m));
            }
            queue.remove();
        }

        System.out.println(queue.peek().index);

    }
}

class Child {
    int index;
    int req;

    public Child(int index, int req) {
        this.index = index;
        this.req = req;
    }
}
