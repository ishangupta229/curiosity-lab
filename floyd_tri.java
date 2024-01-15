import java.util.*;

public class floyd_tri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }

    }
}
