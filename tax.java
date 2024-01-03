import java.util.*;
public class Class1 {public static void main(String[] args) {
        // tax calculator
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        
        if(income<=5){
            System.out.println("No tax");

        }else if(income>5 && income<=10){
            //System.out.print("Your tax is 20%, which amounts to : ");
            double a = income*(0.2);
            //System.out.println(a);
            System.out.print("Your income is :");
            System.out.println(income-a);
        }else if(income>10){
            //System.out.print("Your tax is 30%, which amounts to : ");
            double a = income*(0.3);
            //System.out.println(a);
            System.out.print("Your income is :");
            System.out.println(income-a);
        }else{
            System.out.println("Error");
        }

}
}
