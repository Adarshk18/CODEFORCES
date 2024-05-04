import java.util.Scanner;

public class nene {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();   //no of test cases

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();  //no of rounds
            int minPasses = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                int m = in.nextInt();  //no of players
                int maxPasses = 0;

                for (int k = 0; k < m; k++) {
                    int p = in.nextInt(); // no pf passes
                    maxPasses = Math.max(maxPasses,p);
                }
                if (n == 1) {
                    minPasses = maxPasses;
                } else {
                    minPasses = Math.min(minPasses, maxPasses);
                }
            }

            System.out.println(minPasses);
        }
    }
}
