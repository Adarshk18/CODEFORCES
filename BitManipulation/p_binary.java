package codeforces.BitManipulation;

import java.util.Scanner;

public class p_binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long n = in.nextLong();
        long p = in.nextLong();

        for (int i = 0; i <= 32; i++) {
            long tmp = n-i*p;
            if(tmp>=i && Long.bitCount(tmp)<=i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        in.close();
    }
}
