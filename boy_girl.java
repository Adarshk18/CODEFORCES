import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class boy_girl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();


        Set<Character> set = new HashSet<>();
        for(char c: userName.toCharArray()){
            set.add(c);
        }

        if (set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
