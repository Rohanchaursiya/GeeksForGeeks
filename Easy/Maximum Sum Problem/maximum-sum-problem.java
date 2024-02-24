//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // public int Help(int n){
    //     if(n==0)return 0;
    //     int ans1=Math.max(Help(n/2),n/2);
    //     int ans2=Math.max(Help(n/3),n/3);
    //     int ans3=Math.max(Help(n/4),n/4);
        
    //     return Math.max(n,(ans1+ans2+ans3));
    // }
    public int maxSum(int n) 
    { 
        //code here.
        if(n==0)return 0;
        int ans1=Math.max(maxSum(n/2),n/2);
        int ans2=Math.max(maxSum(n/3),n/3);
        int ans3=Math.max(maxSum(n/4),n/4);
        
        return Math.max(n,(ans1+ans2+ans3));
    } 
}
