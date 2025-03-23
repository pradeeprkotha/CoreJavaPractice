import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrimeNumber {
    public static boolean isPrime(int n){
        for(int i=2; i<=n; i++){
            if(n%i==0){
                return false;
            }else {
                return true;
            }
        }
        return false;
    }
    public void printPrimes(int n){

        String k = "10";
        int m = Integer.parseInt(k);

        for (int i = 0; i<n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }


    }

    public static void main(String[] args) {
        String n = "13";

//        BigInteger intger =new BigInteger(n);
//        System.out.println(intger.isProbablePrime(10) ? "prime" : "not prime");

        System.out.println(Pattern.matches(
                "1we*", "geeksforgeeks2"));

        String s = "HelloWorld";
        System.out.println(s.substring(3,7));

    }
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.matches();
    }
}
