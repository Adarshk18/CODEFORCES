import java.util.Scanner;

public class domino_pilling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int totSq = n*m;
        int maxDomino = totSq/2;

        System.out.println(maxDomino);
    }
}
