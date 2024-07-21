package recursions;

public class ReverseRecursion {
    public static void main(String[] args) {

        int n=5;
        func(n,n);

    }

    private static void func(int i, int n) {
        if(i<1){
            return;
        }

        System.out.println(i);
        func(i-1,n);
    }
}
