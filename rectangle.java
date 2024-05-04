import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String row = scanner.next();
                for (int j = 0; j < m; j++) {
                    grid[i][j] = row.charAt(j);
                }
            }
            System.out.println(canMakeSameColor(grid) ? "Yes" : "No");
        }
    }

    public static boolean canMakeSameColor(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Check if corners have the same color
        char topLeft = grid[0][0];
        char topRight = grid[0][m - 1];
        char bottomLeft = grid[n - 1][0];
        char bottomRight = grid[n - 1][m - 1];

        if (topLeft == topRight && topRight == bottomLeft && bottomLeft == bottomRight) {
            // Check if each row and column either has the same color or can be made the same color
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (grid[i][j] != grid[i][j - 1] && grid[i][j] != topLeft && grid[i][j] != topRight) {
                        return false;
                    }
                }
            }

            for (int j = 0; j < m; j++) {
                for (int i = 1; i < n; i++) {
                    if (grid[i][j] != grid[i - 1][j] && grid[i][j] != topLeft && grid[i][j] != bottomLeft) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
