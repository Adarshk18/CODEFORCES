import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long r = in.nextLong();
            long c = in.nextLong();
            long k = in.nextLong();

            long low = 1,high = r*c,ans = -1;
            while(low<=high){
                long mid = (low+high)/2;
                long count = 0;

                for(long i=1; i<=r; i++){
                    count += Math.min(c,(mid-1)/i);
                    if(count>k){
                        break;
                    }
                }
                if(count<k){
                    ans = mid;
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}
