package codeforces.BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class dima_xor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("NIE");
            return;
        }

        int currentXor = 0;
        int[][] values = new int[rows][columns];

        // Read the input values and calculate the initial XOR for the first column
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                values[i][j] = scanner.nextInt();
                if (j == 0) {
                    currentXor ^= values[i][0];
                }
            }
        }

        // Initialize the answer array with default values
        int[] ans = new int[rows];
        Arrays.fill(ans, 1);

        // If the initial XOR is zero, attempt to adjust values to make it non-zero
        if (currentXor == 0) {
            boolean found = false;
            for (int i = 0; i < rows && !found; ++i) {
                for (int j = 1; j < columns; ++j) { // start from 1 to skip the first column
                    if (values[i][j] != values[i][0]) {
                        ans[i] = j + 1;
                        currentXor ^= values[i][0];
                        currentXor ^= values[i][j];
                        found = true;
                        break;
                    }
                }
            }
        }

        // Check if we have a valid non-zero XOR configuration
        if (currentXor == 0) {
            System.out.println("NIE");
        } else {
            System.out.println("TAK");
            System.out.print(ans[0]);
            for (int i = 1; i < rows; ++i) {
                System.out.print(" " + ans[i]);
            }
            System.out.println();
        }

        scanner.close();
    }
}