import java.util.Scanner;

public class Hamburgers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Read the recipe
        String r = in.nextLine();

        //Read the number of ingredients
        long nb = in.nextLong();
        long ns = in.nextLong();
        long nc = in.nextLong();

        //Read the prices
        long pb = in.nextLong();
        long ps = in.nextLong();
        long pc = in.nextLong();


        //Rubles
        long rubbles = in.nextLong();

        long a =0,b=0,c=0;
        for(char ch: r.toCharArray()){
            if(ch=='B') a++;
            else if(ch=='S') b++;
            else if(ch=='C') c++;
        }

        long low =0,high = rubbles+200;
        while(low<=high){
            long mid = low + (high-low)/2;
            long z = 0;
            long r1 = Math.max(a*mid-nb,z);
            long r2 = Math.max(b*mid-ns,z);
            long r3 = Math.max(c*mid-nc,z);

            long price = r1*pb+r2*ps+r3*pc;

            if(price<=rubbles){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(high);
        in.close();
    }
}
