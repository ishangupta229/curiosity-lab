import java.util.*;

public class Class1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int num =0;
        int i=0;
        boolean x = true;
        int even=0;
        int odd=0;
          
        while(x==true){
             i= sc.nextInt();
            num = num*10 + i;
            
            x = sc.nextBoolean();
        }
        
        while (num>0) {
            int rem = num%10;
            num /=10;
            if(rem%2==0){
                even += rem;
            }else{
                odd += rem;
            }
        }
        System.out.println("Sum of even number are : "+ even);
        System.out.println("Sum of odd number are : "+ odd);
    }
}
