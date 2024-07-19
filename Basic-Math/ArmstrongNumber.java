public class ArmstrongNumber {
    public static void main(String[] args) {
        

        int num=370;
        int numcpy=num;
        int rem;
        int sum=0;

        while(num>0){
            rem=num%10;
            num=num/10;
            sum=sum+(rem*rem*rem);
        }

        if(sum==numcpy) System.out.println("True");
        else System.out.println("False");

    }
}
