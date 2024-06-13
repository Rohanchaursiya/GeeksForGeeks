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
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
        if(n==0 || n==1 || n==2){
            return 1;
        }
        int mod=(int)1e9+7;
        int a[]=new int[n+1];
        a[0]=a[1]=a[2]=1;
        for(int i=3;i<=n;i++){
            a[i]=(a[i-2]%mod+a[i-3]%mod);
        }
        return a[n]%mod;
    }
    
}
