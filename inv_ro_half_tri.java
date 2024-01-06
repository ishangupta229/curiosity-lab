public class inv_ro_half_tri {
    public static void main(String[] args) {
        int row = 40;

        for (int i = row; i>0; i--) {
            boolean lo=false;
            for (int j = row; j>0; j--) {
                if(lo==true){
                    System.out.print("*");
                }else{
                if(i+j==row+1){
                    System.out.print("*");
                    lo=true;
                }else{
                    System.out.print(" ");
                }}
                    
            }
            lo=false;
            System.out.println();
        }
    }
}
