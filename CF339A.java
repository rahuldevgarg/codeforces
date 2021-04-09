// 339A -  Helpful Maths
// https://codeforces.com/problemset/problem/339/A

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> nums = new HashMap<String, Integer>() {{
            put("1", 0);
            put("2", 0);
            put("3", 0);
        }};
        String expr = sc.next();
        String[] arr = expr.split("\\+");
        for (String i : arr) {
            nums.put(i, nums.get(i) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.get("1"); i++) {
            sb.append("1+");
        }
        for (int i = 0; i < nums.get("2"); i++) {
            sb.append("2+");
        }
        for (int i = 0; i < nums.get("3"); i++) {
            sb.append("3+");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        sc.close();
    }
}
