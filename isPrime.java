import java.util.*;
public class isPrime {

    public static boolean isPrime(int a) {
        if (a==2) {
            return true;
        }
        boolean yo =true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeRange(int a) {
        int count = 0;
        for (int i = 2; i <= a; i++) {
            boolean know = isPrime(i);
            if (know==true) {
                System.out.print(i + ", ");
                count++;
            } 
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number for range : ");
        int num = sc.nextInt();

        PrimeRange(num);
    }
}
