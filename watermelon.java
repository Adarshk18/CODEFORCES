import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        if (w%2==0 && w>2) {
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
