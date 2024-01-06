import java.util.*;

public class yo {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int num = sc.nextInt();

        for(int i=num; i>0; i-- ){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
