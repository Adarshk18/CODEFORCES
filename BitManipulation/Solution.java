package codeforces.BitManipulation;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        if(k==1){
            System.out.println(n);
            return;
        }

        long m = 1;
        while(m<n){
            m = 2*m+1;
        }
        System.out.println(m);
    }
}
