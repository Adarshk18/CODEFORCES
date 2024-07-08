package codeforces.BitManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class power_of_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sum = 0;
        int k2 = k, n2 = n;
        List<Integer> ans = new ArrayList<>();

        for (int i = 30; i >= 0 && k > 0; ) {
            int m = 1 << i;  // equivalent to 2^i

            if (m > n) {
                i--;
                continue;
            }

            if (n - m < k - 1) {
                i--;
                continue;
            }

            sum += m;
            ans.add(m);
            n -= m;
            k--;
        }

        if (ans.size() == k2 && sum == n2) {
            System.out.println("YES");
            for (int e : ans) {
                System.out.print(e + " ");
            }
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
