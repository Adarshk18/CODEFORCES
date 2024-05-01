import java.util.Scanner;

public class way_to_long {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            if (word.length()>10) {
                String shortened = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(shortened);
            }else{
                System.out.println(word);
            }
        }

    }
}
