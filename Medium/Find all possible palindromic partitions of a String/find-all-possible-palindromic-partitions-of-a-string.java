//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static boolean isPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    
    private static void Helper(ArrayList<ArrayList<String>> res,String s,int ind,ArrayList<String> curr ){
        if(ind==s.length()){
            res.add(new ArrayList<String>(curr));
            return;
        }
        String temp="";
        for(int i=ind;i<s.length();i++){
            temp+=s.charAt(i);
            if(isPalin(temp)){
                curr.add(temp);
                Helper(res,s,i+1,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        // code here
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        int ind=0;
        ArrayList<String> curr=new ArrayList<>();
        Helper(res,S,ind,curr);
        
        return res;
    }
    
     
};