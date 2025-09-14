
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validusername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();


        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

        if (Pattern.matches(regex, username)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
