//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        long count=0;
        int pre_sum=0;
        for(int i=0;i<n;i++){
            pre_sum+=arr[i];
            if(mp.containsKey(pre_sum)){
                count+=mp.get(pre_sum);
                mp.put(pre_sum,mp.get(pre_sum)+1);
            }else{
                mp.put(pre_sum,1);
            }
        }
        return count;
    }
}