public class ReverseNumbers {
    public static void main(String args[]){
        
        int rev=0;
        int rno=5987;
        int rem;
        while(rno>0){
            rem=rno%10;
            rno=rno/10;
            rev=(rev*10)+rem;
        }
        System.out.println(rev);
    }
}
