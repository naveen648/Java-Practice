public class Palindrome {
    public static void main(String[] args) {
        
        int num=67176;
        int numcpy=num;
        int rev=0;
        int rem;

        while(num>0){

            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;            

        }
        if(rev==numcpy){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
