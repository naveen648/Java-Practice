public class Pattern7 {
    public static void main(String[] args) {        
        for(int k=1;k<=5;k++){

            for(int i=5;i>=k;i--){
                System.out.print("  ");
            }
            for(int j=1;j<=(k*2)-1;j++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
