//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int n){
        // code here
        long sum=0;
        long v=1;
        for(int i=1; i<=n; i++) {
            long p=1;
            int j=i;
            while(j--!=0){
                p=(p%1000000007)*v;
                v++;
            }
            sum=sum%1000000007+p;
        }
        return sum%1000000007;
    }
}