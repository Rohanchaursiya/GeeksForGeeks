//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution ob = new Solution();

            if (ob.equalPartition(arr))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int N=arr.length;
        int sum=0;
        for(int a: arr){
            sum+=a;
        }
        if(sum%2!=0) return false;
        sum=sum/2;
        int[][] dp= new int[N+1][sum+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return (fun(0, arr, sum, N,dp)==0 ? false : true);
    }
    static int fun(int pos, int[] arr, int sum, int n,int[][] dp){
        if(sum==0) return 1;
        if(pos==n || sum<0) return 0;
        if(dp[pos][sum]!= -1){
            return dp[pos][sum];
        }
        return dp[pos][sum]=Math.max(fun(pos+1,arr,sum-arr[pos],n,dp),fun(pos+1,arr,sum,n,dp));
    }
        
}