import java.util.Scanner;

public class maximumSum {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long[] a = new long[n];
            long sum = 0, p_sum = 0, t_sum = 0;
            for (int i = 0; i < n; ++i) {
                a[i] = scanner.nextLong();
                t_sum += a[i];
            }

            long mx_found = Long.MIN_VALUE, mx_end = 0;
            for (int i = 0; i < n; ++i) {
                mx_end += a[i];
                if (mx_found < mx_end) mx_found = mx_end;
                if (mx_end < 0) mx_end = 0;
            }
            p_sum = mx_found;

            if (p_sum <= 0) {
                System.out.println(getMod(t_sum, MOD));
            } else {
                long ans = 0;
                for (int i = 0; i < k; ++i) {
                    ans += getMod(getMod(p_sum, MOD) * binpow(2, i, MOD), MOD);
                }
                System.out.println(getMod(ans + t_sum, MOD));
            }
        }
    }

    static long binpow(long a, long b, int MOD) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = getMod(res * a, MOD);
            }
            a = getMod(a * a, MOD);
            b >>= 1;
        }
        return res;
    }

    static long getMod(long x, int MOD) {
        return (x % MOD + MOD) % MOD;
    }
}
