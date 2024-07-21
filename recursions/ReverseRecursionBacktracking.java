package recursions;

public class ReverseRecursionBacktracking {
    public static void main(String[] args) {
        int n=1;
        func(n,n);
    }

    public static void func(int i, int n) {
        if(i>5){
            return;
        }

        func(i+1, n);
        System.out.println(i);
    }
}
