import java.util.*;

public class reverse {
    public static void main(String[] args) {

        long a = 1234567898;
        long ans =0;

        while (a>0) {
            long b= a%10;
            ans = ans*10 + b;
            a/=10;
            //System.err.println(b +" "+ a + " "+ ans);
        }
        
        System.out.println(ans);
            
    }
}
