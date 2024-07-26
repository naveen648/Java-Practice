// package recursions;
import java.util.Arrays;

// package recursions;

public class Test {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int i=0;
        func(i,arr);
    }

    public static void func(int i,int[] arr) {

        // int i=0;
        System.err.println(""+i);
        int end=arr.length;
        int temp=arr[i];
        arr[i]=arr[end-i-1];
        arr[end-i-1]=temp;
        // i++;
        if(i==(end/2)-1){
            
            System.out.println(Arrays.toString(arr));
            return;

        }
        

        func(i+1,arr);

        
        

    }

    

    
}
