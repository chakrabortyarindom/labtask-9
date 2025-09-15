import java.util.*;
import java.math.BigInteger;

public class primalitytest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();  // read large number

        // Use BigInteger's built-in primality test
        if (n.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        sc.close();
    }
}
