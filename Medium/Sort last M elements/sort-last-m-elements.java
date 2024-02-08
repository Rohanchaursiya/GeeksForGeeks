//{ Driver Code Starts
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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            String[] S = br.readLine().trim().split(" ");
            int[] nums = new int[n+m];
            for(int i = 0; i < S.length; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution obj = new Solution();
            obj.sortLastMelements(nums, n, m);
            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void sortLastMelements(int[] nums, int n, int m)
    {
        // Code here
        Arrays.sort(nums,nums.length-m,nums.length);
    }
}