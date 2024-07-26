import java.util.*;

class SelectionSorting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// int t = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n]; 
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Solution obj = new Solution();
		obj.selectionSort(arr, n);
			
		for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
		System.out.println();
			
	}
}


class Solution
{
	int  select(int arr[], int i)
	{
        int min=i;
        for(int j=i;j<arr.length-1;j++){
            
            if(arr[j+1]<arr[min]&&arr[j+1]<arr[j]){
                min=j+1;
            }

        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    int tmp;
	    for(int i=0;i<n-1;i++){
	        
	        int k=select(arr,i);
	        tmp=arr[k];
	        arr[k]=arr[i];
	        arr[i]=tmp;
	        
	    }
	}
}