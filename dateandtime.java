import java.util.*;
public class dateandtime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,day,0,0,0);
        cal.set(Calendar.MILLISECOND,0);
        int dayofweek = cal.get( Calendar.DAY_OF_WEEK);
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(days[dayofweek-1]);
    }
}
