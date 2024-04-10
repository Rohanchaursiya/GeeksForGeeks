//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String pre) {
        // code here
         Stack<String> s= new Stack<>();
        for(int i=pre.length()-1;i>=0;i--){
            char ch=pre.charAt(i);
            if(Character.isLetter(ch)){
                s.push(String.valueOf(ch));
            }
            else if(ch=='+'|| ch=='-' || ch=='/' || ch=='*'){
                s.push('('+s.pop()+ch+s.pop()+')');
            }
        }
        return s.peek();
    }
}
