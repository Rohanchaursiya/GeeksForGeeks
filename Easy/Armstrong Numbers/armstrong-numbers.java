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

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean isArm(int n){
        int m=n;
        int sum=0;
        while(m!=0){
            sum+=Math.pow(m%10,3);
            m/=10;
        }
        if(sum==n)return true;
        return false;
    }
    static String armstrongNumber(int n) {
        // code here
        return isArm(n) ? "true" : "false";
        
    }
}