import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        invert_gap(n);
        
        
    }
    static void invert_gap(int n){
        int spaces=2*(n-1);

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();

            // spaces=spaces-2;
            spaces-=2;
        }
        // for(int k=n;k>=1;k--){
        //     for(int i=1;i<=n-k;i++){
        //         System.out.print("  ");
        //     }
        //     for(int i=1;i<=(k*2)-1;i++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
