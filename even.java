import java.io .*;
import java.lang .*;
import java.util .*;

class even{

public static boolean isEven(int x)
{

if(x%2 == 0)

return true;

return false;

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
if(x == 0)

System.out.println("The number is 0");

else if(isEven(x))
{

}
else{
System.out.println("The number is Odd");

}

System.out.println("The number is Even");

if(isEven(12)) // test case for 12 to be even

System.out.println("Function is working fine");

else{
System.out.println("Function is not working fine");
}
