package patterns;

import java.util.Scanner;

public class Pattern7_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        erect_pyramid(n);
    }

    static void erect_pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
