import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> s = new ArrayList<>();
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                int num = scanner.nextInt();
                s.add(num);
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }
            int mx1 = Collections.max(s);
            int mx2 = Collections.min(s);
            for (int i = 0; i < n; ++i) {
                if (s.get(i) < mx1 && s.get(i) > mx2) mx2 = s.get(i);
            }
            for (int i = 0; i < n; ++i) {
                if (s.get(i) != mx1) System.out.print((s.get(i) - mx1) + " ");
                else if (mp.get(s.get(i)) <= 1) System.out.print((s.get(i) - mx2) + " ");
                else System.out.print((s.get(i) - mx1) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
