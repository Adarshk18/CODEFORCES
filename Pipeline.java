import java.util.Scanner;
public class Pipeline{

    public static long sum(long n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        in.close();

        n -=1;
        long s = sum(k-1);
        if(s<n){
            System.out.println(-1);
        }else{
            long low =0,high=k-1;
            while(low<=high){
                long mid = low + (high-low)/2;
                if(s-sum(mid)>=n){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            System.out.println(k-1-high);
        }
    }
}