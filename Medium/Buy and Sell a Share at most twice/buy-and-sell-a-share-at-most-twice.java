//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int help(int n,int price[]){
        
        int fb=Integer.MIN_VALUE,sb=Integer.MIN_VALUE;
        int fs=0,ss=0;
        for(int i=0;i<n;i++){
            fb=Math.max(fb,-price[i]);
            fs=Math.max(fs,fb+price[i]);
            sb=Math.max(sb,fs-price[i]);
            ss=Math.max(ss,sb+price[i]);
            //System.out.println(fb+" "+fs+" "+sb+" "+ss);
            
        }
        return ss;
    }
    
    public static int maxProfit(int n, int[] price) {
        // code here
        return help(n,price);
        
    }
}
        
