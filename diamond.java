import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sp = num-1;
        int st = 1;
        int row =1;
        while (row<=2*num-1) {
            for (int i = 0; i < sp; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < st; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < sp; i++) {
                System.out.print(" ");
                
            }
            if(row<num){
                st =st+2;
                sp--;
            }else{
                sp++;
                st=st-2;
            }

            System.out.println();
            row++;
        }

    }
}
