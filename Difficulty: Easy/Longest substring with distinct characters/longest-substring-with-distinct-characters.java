//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        int i = 0, max = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                i = Math.max(map.get(ch) + 1, i);  
            }

            map.put(ch, j); 
            max = Math.max(max, j - i + 1); 
        }

        return max;
    }
}