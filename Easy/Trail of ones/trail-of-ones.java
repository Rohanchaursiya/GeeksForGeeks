//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int numberOfConsecutiveOnes(int n) {
        // code here
        int dp[]=new int[(int)1e5+2];
        Arrays.fill(dp,0);
        dp[2]=1;
        int prev_sum=0,sum=1;
        for(int i=3;i<=n;i++){
            int curr_sum=(prev_sum+sum)%1000000007;
            dp[i]=((dp[i-1]*2)%1000000007+curr_sum)%1000000007;
            prev_sum=sum;
            sum=curr_sum;
        }
        return dp[n]%1000000007;
        
        
    }
}
