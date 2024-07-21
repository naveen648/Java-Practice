public class CountDigits {
    public static void main(String[] args) {
        
        int input=89896;
        int count=0;
        while(input>0){
            input =input/10;
            count++;
        }

        System.out.println(count);
    }
}
