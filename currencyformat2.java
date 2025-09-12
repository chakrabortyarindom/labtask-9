import java.util.*;
import java.text.*;
public class currencyformat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double currency= input.nextDouble();

        NumberFormat usformat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indformat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat japanformat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat franceformat = NumberFormat.getCurrencyInstance(Locale.FRANCE);



        System.out.println(usformat.format(currency));
        System.out.println(indformat.format(currency));
        System.out.println(japanformat.format(currency));
        System.out.println(franceformat.format(currency));



    }
}
