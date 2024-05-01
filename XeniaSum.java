import java.util.*;

public class XeniaSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sum = in.nextLine();
        String result = reArrange(sum);
        System.out.println(result);
        in.close();
    }

    public static String reArrange(String sum){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < sum.length(); i+=2) {
            int num = Character.getNumericValue(sum.charAt(i));
            numbers.add(num);
        }

        Collections.sort(numbers);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            result.append(numbers.get(i));
            if(i<numbers.size()-1)
            result.append("+");
        }
        return result.toString();
    }
}
