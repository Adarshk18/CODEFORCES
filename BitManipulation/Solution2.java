package codeforces.BitManipulation;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        final long MOD = 1000000007;
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();

        while(t-->0){
            long n = in.nextLong();
            long k = in.nextLong();

            long res = 0;
            long cur = 1;

            while (k>0) {
                if((k&1)==1){
                    res = (res+cur)%MOD;
                }
                cur = (cur*n)%MOD;
                k >>= 1;
            }

            System.out.println(res);
        }

    }
}
