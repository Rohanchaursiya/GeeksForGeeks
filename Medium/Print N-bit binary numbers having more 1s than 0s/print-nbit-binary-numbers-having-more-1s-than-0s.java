//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void Help(ArrayList<String> ans,String s,int ones,int zeros,int n){
        if(ones<zeros)return;
        if(s.length()==n){
            ans.add(s);
            return;
        }
        Help(ans,s+'1',ones+1,zeros,n);
        Help(ans,s+'0',ones,zeros+1,n);
        return;
    }
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        String s="";
        Help(ans,s,0,0,N);
        return ans;
    }
}