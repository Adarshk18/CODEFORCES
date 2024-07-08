import java.util.*;

public class Stressful_Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long[] a = new long[n];
        long[] b = new long[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        
        System.out.println(findMinimumChargerPower(n, k, a, b));
    }
    
    private static long findMinimumChargerPower(int n, int k, long[] a, long[] b) {
        long low = 0;
        long high = 10000000; // This is the max value of bi
        
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (canAllSurvive(n, k, a, b, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        // Check if the found low is a valid solution
        if (canAllSurvive(n, k, a, b, low)) {
            return low;
        } else {
            return -1;
        }
    }

    private static boolean canAllSurvive(int n, int k, long[] a, long[] b, long x) {
        for (int i = 0; i < n; i++) {
            long requiredCharge = b[i] * k - a[i];
            if (requiredCharge > 0 && requiredCharge > x * k) {
                return false;
            }
        }
        return true;
    }
}
