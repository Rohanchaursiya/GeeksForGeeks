//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    // public static boolean isLetter(char ch)
    // {
    //     if (!Character.isLetter(ch))
    //         return false;
 
    //     return true;
    // }
    public static boolean checkPangram  (String s) {
        // your code here
        s=s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int dist=(int)s.chars().distinct().count();
        return (dist==26) ? true : false;
        
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends