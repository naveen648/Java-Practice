package recursions;

public class LinearRecursionBacktracking {
    public static void main(String[] args) {
        // int i=1;
        int n=5;
        func(n,n);

    }

    public static void func(int i, int n) {

        if(i<1){
            return;
        }


        func(i-1, n);
        System.out.println(i);



    }
}
