import java.util.Scanner;

public class Array {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){

            int n=sc.nextInt();

            String arr[] = new String[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt()+"";
            }

            String ans ="YES";

            int prev = 0;
            String first = arr[0];
            if(first.length()==1){
                prev = first.charAt(0)-48;
            }else{
                int val1 = first.charAt(0)-48;
                int val2 = first.charAt(1)-48;
                if(val1<=val2){
                    prev = val2;
                }else
                    prev = Integer.parseInt(first);
            }

            for(int i=1;i<n;i++){

                String s = arr[i];
                if(s.length()==1){
                    int val = s.charAt(0)-48;
                    if(val<prev){
                        ans = "NO";
                        break;
                    }else{
                        prev = val;
                    }
                }else{
                    int val1 = s.charAt(0)-48;
                    int val2 = s.charAt(1)-48;

                    int both = Integer.parseInt(s);

                    if(val1<=val2){
                        if(prev<=val1){
                            prev=val2;
                        }else{
                            if(both>=prev){
                                prev = both;
                            }else{
                                ans = "NO";
                            }
                        }
                    }else{
                        if(both>=prev){
                            prev = both;
                        }else{
                            ans = "NO";
                        }
                    }
                }
            }

            System.out.println(ans);
            t--;
        }


    }
}