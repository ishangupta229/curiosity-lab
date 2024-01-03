import java.util.*;
public class report{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your number : ");
        float number = sc.nextFloat();

        String result = (number>=33.33)? "Pass":"Fail";
        System.out.println(result);

    }
}
