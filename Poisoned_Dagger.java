import java.util.Scanner;

public class Poisoned_Dagger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0){
            int n = in.nextInt();
            long h = in.nextLong();

            int[] attacks = new int[n];
            for (int i = 0; i < n; i++) {
                attacks[i] = in.nextInt();
            }
            long low=1,high=h;
            while(low<=high){
                long mid = low + (high-low)/2;
                long damage =0;
                for (int i = 0; i < n-1; i++) {
                    damage += Math.min(mid,attacks[i+1]-attacks[i]);
                }
                damage += mid;

                if(damage>=h){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            System.out.println(low);
        }
        in.close();
    }
}
