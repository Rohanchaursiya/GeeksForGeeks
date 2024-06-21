//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        // Code here
        String[] str_arr=str.split(", ");
        String[] ff=str_arr[0].split("/");
        String[] sf=str_arr[1].split("/");
        int fn=Integer.parseInt(ff[0]);
        int fd=Integer.parseInt(ff[1]);
        int sn=Integer.parseInt(sf[0]);
        int sd=Integer.parseInt(sf[1]);
        double f1=(double)((double)fn/(double)fd);
        double f2=(double)((double)sn/(double)sd);
        if(f1==f2)return "equal";
        return (f1>f2) ? fn+"/"+fd :sn+"/"+sd; 
    }
}
