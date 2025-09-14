import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class syntexcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int testcase = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<testcase;i++){
            String pattern =sc.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("invalid");

            }
        }
    }
}
