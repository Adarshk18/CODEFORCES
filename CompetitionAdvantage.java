import java.util.Scanner;

public class CompetitionAdvantage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // length of the array
            int[] strengths = new int[n];
            int maxStrength = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                strengths[i] = scanner.nextInt(); // strengths of the participants
                maxStrength = Math.max(maxStrength, strengths[i]); // find the maximum strength
            }

            // Print the differences
            for (int i = 0; i < n; i++) {
                int diff = maxStrength - strengths[i];
                System.out.print(diff);
                if (i != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
