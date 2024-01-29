//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.TotalCount(str);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int help(String s,int index,int preSum,int dp[][]){
        if(index==s.length())return 1;
        if(dp[index][preSum]!=-1)return dp[index][preSum];
        int currSum=0,ans=0;
        for(int i=index;i<s.length();i++){
            currSum+=s.charAt(i)-'0';
            if(currSum>=preSum){
                ans+=help(s,i+1,currSum,dp);
            }
        }
        return dp[index][preSum]=ans;
    }
    public int TotalCount(String str)
    {
        // Code here
        int n=str.length();
        int dp[][]=new int[n][901];
        for(int temp[] : dp){
            Arrays.fill(temp,-1);
        }
       return help(str,0,0,dp);
    }
}