//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int merged[]=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            merged[k++]=a[i];
        }
        for(int i=0;i<m;i++){
            merged[k++]=b[i];
        }
        Arrays.sort(merged);
        int length=merged.length;
        double ans=0;
        if(length%2==0){
            int middle1=merged[(length/2)-1];
            int middle2=merged[length/2];
            ans=(double)(middle1+middle2)/2;
        }else{
            ans=(double)merged[length/2];
        }
        return ans;
    }
}