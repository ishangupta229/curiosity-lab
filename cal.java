import java.util.*;
public class cal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        System.out.println("Select a Operator (+-/*): ");

        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '/':System.out.println(a/b);
                break;
            case '*':System.out.println(a*b);
                break;
            default:System.out.println("Error");
                break;
        }        
    }
}
