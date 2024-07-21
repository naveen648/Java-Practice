import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
            erect_pyramid(n);
            invert_pyramid(n);
        }
    }

    static void erect_pyramid(int n){
        for(int k=1;k<=n;k++){

            /*
             * for(int i=n;i>=k;i--){
                System.out.print("  ");
            }
             */
            for(int i=n-k;i>=1;i--){
                System.out.print("  ");
            }
            for(int j=1;j<=(k*2)-1;j++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    static void invert_pyramid(int n){
        for(int k=n;k>=1;k--){
            for(int i=1;i<=n-k;i++){
                System.out.print("  ");
            }
            for(int i=1;i<=(k*2)-1;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
