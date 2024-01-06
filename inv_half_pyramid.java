public class inv_half_pyramid {
    public static void main(String[] args) {
        int row = 5;
        for (int i = row; i >0; i--) {
            for (int j = 1; j<=row; j++) {
                if(j<=i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }   
    }
}
