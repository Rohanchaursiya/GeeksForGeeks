//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public static void generate(int ind , int n, List<String> list, StringBuilder str){
        if(str.length() == n){
            list.add(str.toString());
            return;
        }
            str.append('0');
            generate(ind+1 ,n, list, str);
            str.deleteCharAt(str.length() - 1);
        if((str.length()>=1 && str.charAt(str.length()-1) == '0') || str.length() == 0){
            str.append('1');
            generate(ind+1 ,n, list, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        generate(0,n,list,str);
        return list;
    }
}
     
     