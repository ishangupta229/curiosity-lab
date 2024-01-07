import java.util.*;
public class solid_rhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of rhombus : ");
        int side = sc.nextInt();
        // int side =5;
        for ( int i = 0; i < side; i++) {
            for (int j = 1; j <= 2*side-1; j++) {
                if (side-j-i>0) {
                    System.out.print(" ");
                }else if(j+i>=2*side) {
                    System.out.print(" ");
                }else{
                    System.err.print("*");
                }
            }
            System.out.println();
        }

    }
}
