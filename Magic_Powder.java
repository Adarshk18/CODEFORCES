import java.util.Scanner;

public class Magic_Powder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //no of ingredients & powder
        long n = in.nextLong();
        long k = in.nextLong();

        int[] req = new int[(int)n];
        int[] have = new int[(int)n];

        for (int i = 0; i < n; i++) {
            req[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            have[i] = in.nextInt();
        }

        long low = 0,high = 2001;
        while(low<=high){
            long mid = low + (high-low)/2;
            long z=0,cost =0;

            for (int i = 0; i < n; i++) {
                cost += Math.max(req[i]*mid-have[i],z);
            }

            if(cost<=k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(high);
        in.close();
    }
}
