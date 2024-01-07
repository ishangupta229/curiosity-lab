import java.util.*;
public class tri01 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");

        int num = sc.nextInt();
        boolean pr = true;
        
        for (int i = 1; i <=num; i++) {
            pr = (i%2==0)? false : true;
            for (int j = 1; j <=i; j++) {
                // int q = (boolean) pr;
                int q = pr ? 1 : 0;
                System.out.print(q);
                pr = !pr;
            }
            System.out.println("");
            //System.out.print(i);
        }

    }
}
