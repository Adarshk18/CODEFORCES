import java.util.Scanner;

public class chocolate_factory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long m = in.nextLong();
        in.close();

        long low = 1;
        long high = Long.MAX_VALUE/2;
        long result = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long ways = countWays(mid);
            if (ways >= m) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (countWays(result) == m) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }

    private static long countWays(long n) {
        long count = 0;
        for (long k = 2; k * k * k <= n; k++) {
            count += n / (k * k * k);

            if (count > 1000000000000000000L) {
                break;
            }
        }
        return count;
    }
}
