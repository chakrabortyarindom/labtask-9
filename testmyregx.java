import java.util.*;
import java.util.regex.Pattern;
public class testmyregx {
    public static final String pattern =
            "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
                    + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();


        if (Pattern.matches(testmyregx.pattern, ip)) {
            System.out.println("valid: " );
        } else {
            System.out.println("Invalid  " );
        }
    }
}



