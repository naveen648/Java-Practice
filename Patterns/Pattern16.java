public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        alpha(n);
    }

    static void alpha(int n) {
    
        for(int i=0;i<n;i++){
            int temp=(int)'A'+i;
                for(char j=0;j<=i;j++){
                    System.out.print((char)temp);
                }
                System.out.println();
            }
            
        }
    
}
