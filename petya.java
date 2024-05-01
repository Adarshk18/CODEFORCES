import java.util.Scanner;

public final class petya{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine().toLowerCase();
        String s2 = in.nextLine().toLowerCase();

        int result = s1.compareTo(s2);

        if(result<0){
            System.out.print("-1");
        }else if (result>0) {
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}