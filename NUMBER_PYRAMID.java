import java.util.*;

public class NUMBER_PYRAMID {

    public static void main(String[] args) {
        int num=1;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        int sp = rows-1;
        
        while (num<=rows) {
            for (int i = 0; i <sp; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < num; i++) {
                System.out.print(num + " ");
            }
            for (int i = 0; i <sp; i++) {
                System.out.print(" ");
            }
            System.out.println();
            num++;
            sp--;

        }
    }
}
