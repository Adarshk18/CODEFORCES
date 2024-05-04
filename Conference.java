import java.util.Scanner;

public class Conference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] count = new int[200001];

        // Update count array based on lecturer availability
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            count[l]++;
            count[r + 1]--;
        }

        // Calculate prefix sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Count the number of ways to select a segment of k consecutive days as conference dates
        for (int k = 1; k <= n; k++) {
            int ways = 0;
            for (int i = 1; i < count.length - k + 1; i++) {
                if (count[i] == k) {
                    ways++;
                }
            }
            System.out.println(ways);
        }
    }
}
