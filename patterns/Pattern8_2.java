package patterns;

import java.util.Scanner;

public class Pattern8_2 {
      public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        invert_pyramid(n);
    }

    static void invert_pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
