import java.util.*;
public class duplicateregex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Regex for consecutive duplicate words
        String regex = "\\b(\\w+)(?:\\s+\\1)+\\b";

        // Replace consecutive duplicates with single word
        String result = input.replaceAll(regex, "$1");

        System.out.println(result);
    }
}
