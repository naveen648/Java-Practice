public class primeNumbers {
    public static void main(String args[]){
        
        int num=727;
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
                if (num/i!=0){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println(" Prime");
        }
        else{
            System.out.println(" Not Prime");
        }

    }
}
