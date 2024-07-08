package codeforces.BitManipulation;

import java.util.*;
import java.io.*;

public class Petr_Lock {
    static long n ,l;
    static List<Long> v = new ArrayList<>();

    static boolean dfs(int i, long sum){
        if(i==n){
            return sum%360==0;
        }else{
            return dfs(i+1,sum+v.get(i)) || dfs(i+1,sum-v.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextLong();


        for (int i = 0; i < n; i++) {
            l = in.nextLong();
            v.add(l);
        }

        if(dfs(0,0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

