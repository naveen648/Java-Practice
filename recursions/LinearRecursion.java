package recursions;

public class LinearRecursion {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        
        func(i,n);
    }

    public static void func(int i,int n) {
        if(i>n){
            return;
        }

        System.out.println(i);
        
        func(i+1, n);



    }
}
