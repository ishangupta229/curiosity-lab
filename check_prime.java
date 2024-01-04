import java.util.*;
public class check_prime {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean x = false;
        for(int i=2; i<= num/2; i++){
            if (num%i==0){
                x = true;
                break;
            }
        }
        if(x == false){
            System.out.println(num + " number is prime");
        }else{
            System.out.println(num +" not a prime number");
        }
    }
}
