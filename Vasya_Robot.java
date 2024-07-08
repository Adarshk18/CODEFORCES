import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Vasya_Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String operations = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Calculate current position after performing all operations
        int cx = 0, cy = 0;
        for (char op : operations.toCharArray()) {
            if (op == 'U') cy++;
            else if (op == 'D') cy--;
            else if (op == 'L') cx--;
            else if (op == 'R') cx++;
        }

        // Calculate the needed change in position
        int dx = x - cx;
        int dy = y - cy;

        // If the exact position is already achieved
        if (dx == 0 && dy == 0) {
            System.out.println(0);
            return;
        }

        // Count occurrences of each operation
        Map<Character, Integer> counter = new HashMap<>();
        for (char op : operations.toCharArray()) {
            counter.put(op, counter.getOrDefault(op, 0) + 1);
        }

        // Define the excess or deficit operations needed to reach (x, y)
        Map<Character, Integer> required = new HashMap<>();
        if (dx > 0) required.put('R', dx);
        else if (dx < 0) required.put('L', -dx);
        if (dy > 0) required.put('U', dy);
        else if (dy < 0) required.put('D', -dy);

        // Check if impossible to achieve target with the given sequence
        if (required.getOrDefault('R', 0) > counter.getOrDefault('R', 0) || 
            required.getOrDefault('L', 0) > counter.getOrDefault('L', 0) ||
            required.getOrDefault('U', 0) > counter.getOrDefault('U', 0) ||
            required.getOrDefault('D', 0) > counter.getOrDefault('D', 0)) {
            System.out.println(-1);
            return;
        }

        // Initialize sliding window
        int minLength = n + 1;
        int left = 0;
        Map<Character, Integer> current = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char rightOp = operations.charAt(right);
            current.put(rightOp, current.getOrDefault(rightOp, 0) + 1);

            while (isValid(current, required)) {
                minLength = Math.min(minLength, right - left + 1);
                char leftOp = operations.charAt(left);
                current.put(leftOp, current.get(leftOp) - 1);
                left++;
            }
        }

        System.out.println(minLength <= n ? minLength : -1);

        sc.close();
    }

    private static boolean isValid(Map<Character, Integer> current, Map<Character, Integer> required) {
        for (char key : required.keySet()) {
            if (current.getOrDefault(key, 0) < required.get(key)) {
                return false;
            }
        }
        return true;
    }
}
