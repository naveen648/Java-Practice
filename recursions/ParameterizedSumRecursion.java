package recursions;

public class ParameterizedSumRecursion {
    public static void main(String[] args) {
        int n=5;
        fun(n,0);
    }

    public static void fun(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        fun(i-1,sum+i);

    }


}
