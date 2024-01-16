//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int Solve(int i,int n,int m){
        if(n==0)return 1;
        int ans=0;
        for(int j=2*i;j<=m;j++){
            ans+=Solve(j,n-1,m);
        }
        return ans;
        
    }
    static int numberSequence(int m, int n)
    {
        // code here
        int res=0;
        for(int i=1;i<=m;i++){
            res+=Solve(i,n-1,m);
        }
        return res;
        
    }
}