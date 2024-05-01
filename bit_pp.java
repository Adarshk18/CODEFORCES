import java.util.Scanner;

public class bit_pp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        int x = 0;
        for (int i = 0; i < n; i++) {
            String st = in.nextLine();
            if (st.charAt(0)=='+' || st.charAt(2)=='+') {
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
