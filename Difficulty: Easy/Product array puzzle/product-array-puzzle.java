//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int prod=1;
        int zero_count=0;
        int ans[]=new int[arr.length];
        for(int i : arr){
            if(i==0){
                zero_count++;
            }else{
                prod*=i;
            }
        }
        if(zero_count>=2)return ans;
        
        for(int i=0;i<arr.length;i++){
            if(zero_count==1){
                ans[i]=(arr[i]==0)? prod : 0;
            }else{
                ans[i]=prod/arr[i];
            }
        }
        
        return ans;
    }
}
