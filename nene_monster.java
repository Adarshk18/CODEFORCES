import java.util.*;

public class nene_monster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            List<Integer> nonZeroMonsters = findNonZeroMonsters(n, a);
            if (nonZeroMonsters.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(nonZeroMonsters.size());
                for (int monster : nonZeroMonsters) {
                    System.out.print(monster + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }

    public static List<Integer> findNonZeroMonsters(int n, int[] a) {
        int maxEnergy = 0;
        for (int energy : a) {
            maxEnergy = Math.max(maxEnergy, energy);
        }

        if (maxEnergy == 0) {
            return Collections.emptyList();
        }

        List<Integer> nonZeroMonsters = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int nextEnergy = Math.max(0, a[i] - maxEnergy);
            if (nextEnergy != 0 || a[i] == maxEnergy) {
                nonZeroMonsters.add(i + 1);
            }
        }
        return nonZeroMonsters;
    }
}
