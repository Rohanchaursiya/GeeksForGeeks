//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isPrime(int n){
        if(n==0 || n==1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    static List<Integer> primeDivision(int N){
        // code here
        ArrayList<Integer> li=new ArrayList<>();
        int i=0;
        while(i<=(N/2)){
            if(isPrime(i)==true && isPrime(N-i)){
                li.add(i);
                li.add(N-i);
            }
            i++;
        }
        return li;
    }
}