import java.util.Scanner;

public class next_round {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
        }

        int advancepart = 0;
        int kscore = scores[k-1];

        for(int score: scores){
            if(score>0 && score>=kscore){
                advancepart++;
            }
        }
        System.out.println(advancepart);
    }
}
