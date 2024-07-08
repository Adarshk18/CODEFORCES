import java.util.Scanner;

public class Water_Taps {

    static final double EPS = 1e-9;

    static boolean check(double x, int n, int T, int[] a, int[] t) {
        double totalWater = 0;
        double totalTemp = 0;
    
        for (int i = 0; i < n; i++) {
            double flowRate = Math.min(x, a[i]);
            totalTemp += t[i] * flowRate;
            totalWater += flowRate;
        }
    
        return totalTemp / totalWater >= T - EPS;
    }
    

    static double maxWaterFlow(int n, int T, int[] a, int[] t) {
        double l = 0;
        double r = 1e18; // Some upper bound for binary search
        double ans = 0;

        while (r - l > EPS) {
            double mid = (l + r) / 2;
            if (check(mid, n, T, a, t)) {
                ans = mid;
                l = mid;
            } else {
                r = mid;
            }
        }

        return ans * T;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int T = scanner.nextInt();

        int[] a = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }

        double result = maxWaterFlow(n, T, a, t);
        System.out.printf("%.12f\n", result);

        scanner.close();
    }
}
