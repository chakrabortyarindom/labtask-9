import java .util.*;
public class stringtoken {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String tokens[] = str.trim().split("[^A-Za-z]+");
        for(String token:tokens){
            System.out.println(token);
        }
    }
}
