import java.util.Scanner;

public class Modulo {
    static final int N = 300005;
    static long[] a = new long[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long l = 0, r = m;
        while ((r - l) > 1) {
            long mid = l + (r - l) / 2;
            if (ok(mid, n, m)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        if (ok(l, n, m)) {
            System.out.println(l);
        } else {
            System.out.println(r);
        }

        scanner.close();
    }

    static boolean ok(long maxi, long n, long m) {
        long prev = 0;
        for (int i = 0; i < n; i++) {
            if (prev <= a[i]) {
                long k = m - (a[i] - prev);
                if (k > maxi) {
                    prev = a[i];
                }
            } else {
                long k = prev - a[i];
                if (k > maxi) {
                    return false;
                }
            }
        }
        return true;
    }
}
