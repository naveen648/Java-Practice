public class Pattern8 {
    public static void main(String[] args) {
        for(int k=5;k>=1;k--){
            for(int i=1;i<=5-k;i++){
                System.out.print("  ");
            }
            for(int i=1;i<=(k*2)-1;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
