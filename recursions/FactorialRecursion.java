public class FactorialRecursion{
    public static void main(String[] args){
        int n=5;
        System.out.println(" "+fact(n));
    }

    private static int fact(int n) {

        //n==0
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
        
    }
}