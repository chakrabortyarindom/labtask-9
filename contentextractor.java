import java.util.*;
import java.util.regex.*;

public class contentextractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // number of lines

        String regex = "<(.+?)>([^<]+)</\\1>";
        Pattern p = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            Matcher m = p.matcher(line);

            boolean found = false;
            while (m.find()) {
                System.out.println(m.group(2)); // print content inside tag
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        sc.close();
    }
}
