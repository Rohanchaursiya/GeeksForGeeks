//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String a, String b) {

        // Your code here
        int m=a.length();
        int n=b.length();
        char temp1[] = a.toCharArray();
        Arrays.sort(temp1);
        char temp2[] = b.toCharArray();
        Arrays.sort(temp2);
        
        if(m!=n){
            return false;
        }
        for(int i=0;i<m;i++){
            if(temp1[i]!=temp2[i]){return false;
                //break;
            }
            
        }
        return true;
    }
}