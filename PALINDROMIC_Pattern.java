package pattern;
import java.util.Scanner;

public class PALINDROMIC_Pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        int sp = rows-1;
        
        for (int num=1;num<=rows;num++) {
            
            for (int i = 0; i <sp; i++) {
                System.out.print(" ");
            }
            
            for (int j = num; j>0; j--) {
                System.out.print(j);
                }
            for (int j = 2; j<=num; j++) {
                System.out.print(j);
            }


            for (int i = 0; i <sp; i++) {
                System.out.print(" ");
            }
            System.out.println();
            sp--;

        }
    }
}
