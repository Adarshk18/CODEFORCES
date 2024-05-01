import java.util.Scanner;

public final class team{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();

        int implementedCount =0;

        while (n-->0) {
            int petya = in.nextInt();
            int vasya = in.nextInt();
            int tonya = in.nextInt();

            int sum = petya + vasya + tonya;
            if (sum>=2) {
                implementedCount++;
            }
        }
        System.out.println(implementedCount);
    }
}