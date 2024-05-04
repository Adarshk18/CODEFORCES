import java.util.Scanner;

public class Ribbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            int partsWithDifferentColors = n / m + (n % m != 0 ? 1 : 0);
            int partsBobCanRepaint = n - partsWithDifferentColors;

            if (partsBobCanRepaint<=k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}
