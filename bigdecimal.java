import java.util.*;
import java.math.BigDecimal;

public class bigdecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // read N
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextLine()); // read each number as string
        }


        numbers.sort((a,b) -> new BigDecimal(b).compareTo(new BigDecimal(a)));


        for (String num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }


}


