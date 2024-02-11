//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.recamanSequence(n);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        int a[]=new int[n];
        ArrayList<Integer> li=new ArrayList<Integer>();
        HashSet<Integer> s=new HashSet<>();
        a[0]=0;
        li.add(a[0]);
        s.add(a[0]);
        for(int i=1;i<n;i++){
            a[i]=a[i-1]-i;
            if(a[i]<0 || s.contains(a[i])){
                a[i]=a[i-1]+i;
            }
            s.add(a[i]);
            li.add(a[i]);
        }
        return li;
    }
}