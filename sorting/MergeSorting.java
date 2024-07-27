import java.util.*;

class MergeSorting
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
		obj.mergeSort(arr, n);
			
		for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
		System.out.println();
			
	}
}


class Solution
{
	
	void mergeSort(int arr[], int n)
	{
	    int tmp;
	    for(int i=0;i<n-1;i++){

            for(int j=i;j<n-1;j++){

                if(arr[j+1]<arr[j])
				{
                    tmp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=tmp;
                }
                
            }
	        
	    }
	}
}