package recursions;

public class Recursion {
    public static void main(String[] args) {
        
        int i=1;
        int n=5;
        func(i,n);

    }

    public static void func(int i,int n) {

        if(i>n){
            return;
        }
    
        System.out.println("Naveen");
        
        func(i+1,n);
    }
}
