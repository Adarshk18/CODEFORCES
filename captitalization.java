import java.util.Scanner;

public class captitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        String capitalize = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        System.out.println(capitalize);
    }
}
