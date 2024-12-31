//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            long topDownans = obj.topDown(n);
            long bottomUpans = obj.bottomUp(n);
            if (topDownans != bottomUpans)
                System.out.println(-1);
            else
                System.out.println(topDownans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static long mod=(long)1e9+7;
    static long fun(int n,long dp[]){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=(fun(n-1,dp)+fun(n-2,dp))%mod;
    }

    static long topDown(int n) {
        // code here
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        return fun(n,dp);
        
        
    }

    static long bottomUp(int n) {
        // code here
        if(n<=1)return n;
        long dp2[]=new long[n+1];
        dp2[0]=0;
        dp2[1]=1;
        for(int i=2;i<=n;i++){
            dp2[i]=(dp2[i-1]+dp2[i-2])%mod;
        }
        return dp2[n];
    }
}
