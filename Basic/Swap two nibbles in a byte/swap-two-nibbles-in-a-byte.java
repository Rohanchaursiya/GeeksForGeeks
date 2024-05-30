//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
        String bin=Integer.toString(n,2);
        int l=bin.length();
        while(l<8){
            bin='0'+bin;
            l++;
        }
        String s=bin.substring(bin.length()/2,bin.length())+bin.substring(0,bin.length()/2);
        int ans=Integer.parseInt(s,2);
        return ans;
    }
}