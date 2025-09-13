import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine().toLowerCase();
        String s2= sc.nextLine().toLowerCase();
        char arr1[] =s1.toCharArray();
        char arr2[] =s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
