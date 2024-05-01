import java.util.Scanner;

public class icpc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();  

        while (t-->0) {
            int n = in.nextInt();
            in.nextLine();

            String s = in.nextLine();

            int[] balloons = new int[26];
            int totBalloons =0;

            for (int i = 0; i < n; i++) {
                char problem = s.charAt(i);
                int index = problem - 'A';

                if (balloons[index]==0) {
                    totBalloons +=2;
                }else{
                    totBalloons++;
                }
                balloons[index]++;
            }
            System.out.println(totBalloons);
           
        }
        in.close();
    }
}
