import java.util.*;

public class Class1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n =sc.nextInt();
        int fac = 1;
        for(int i=1; i<=n; i++){
            fac *= i;
        }
        System.out.print("Factorial for "+n+ " is " + fac);
    }
}
