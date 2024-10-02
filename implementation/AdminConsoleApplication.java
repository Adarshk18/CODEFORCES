package codeforces.implementation;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        int x =0;

        for(int i=0; i<n; i++){
            String statement = in.nextLine();
            if(statement.contains("++")){
                x++;
            }else if(statement.contains("--")){
                x--;
            }
        }
        System.out.println(x);
        in.close();
    }
}
