import java.util.Scanner;

public class rectangle{
    public static boolean ck1(char[][] a, char ch, int n, int m) {
        if (a[0][0] == ch && a[0][m - 1] == ch) {
            for (int i = 0; i < m; ++i) {
                if (a[n - 1][i] == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ck2(char[][] a, char ch, int n, int m) {
        if (a[n - 1][0] == ch && a[n - 1][m - 1] == ch) {
            for (int i = 0; i < m; ++i) {
                if (a[0][i] == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ck3(char[][] a, char ch, int n, int m) {
        if (a[0][0] == ch && a[n - 1][0] == ch) {
            for (int i = 0; i < n; ++i) {
                if (a[i][m - 1] == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ck4(char[][] a, char ch, int n, int m) {
        if (a[0][m - 1] == ch && a[n - 1][m - 1] == ch) {
            for (int i = 0; i < n; ++i) {
                if (a[i][0] == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] a = new char[n][m];

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (scanner.hasNext()) {
                        a[i][j] = scanner.next().charAt(0);
                    }
                }
            }

            boolean f = false;
            if (ck1(a, 'W', n, m) || ck1(a, 'B', n, m)) f = true;
            if (ck2(a, 'W', n, m) || ck2(a, 'B', n, m)) f = true;
            if (ck3(a, 'W', n, m) || ck3(a, 'B', n, m)) f = true;
            if (ck4(a, 'W', n, m) || ck4(a, 'B', n, m)) f = true;
            if (a[0][0] == a[n - 1][m - 1] || a[n - 1][0] == a[0][m - 1]) f = true;

            System.out.println(f ? "YES" : "NO");
        }
        scanner.close();
    }
}
