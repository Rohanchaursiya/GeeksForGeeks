//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
          
            String S = read.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.removeReverse(S); 
            System.out.println(ans);
        }
    } 
} 

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    // String removeReverse(String S) 
    // { 
    //     // code here
    //     // String S="";
        
    //     // if(str.charAt(0)>str.charAt(str.length()-1)){
    //     //     StringBuilder sb=new StringBuilder(str);
    //     //     sb.reverse();
    //     //     S=sb.toString();
    //     // }else{
    //     //     S+=str;
    //     // }
    //     HashMap<Character,Integer> hm=new HashMap<>();
    //     for(int i=0;i<S.length();i++){
    //         if(!hm.containsKey(S.charAt(i))){
    //             hm.put(S.charAt(i),1);
    //         }else{
    //             hm.put(S.charAt(i),hm.get(S.charAt(i))+1);
    //         }
    //     }
    //     int i=0;
    //     int j=S.length()-1;
    //     int c=0;
    //     String ans1="";
    //     String ans2="";
    //     while(i<=j){
    //         if(c%2==0){
    //             if(hm.containsKey(S.charAt(i)) && hm.get(S.charAt(i))>1){
    //             hm.put(S.charAt(i),hm.get(S.charAt(i))-1);
    //             i++;
    //             }
    //             else{
    //                 ans1+=S.charAt(i);
    //                 i++;
    //             }
    //             c++;
    //         }else{
    //             if(hm.containsKey(S.charAt(j)) && hm.get(S.charAt(j))>1){
    //                 hm.put(S.charAt(j),hm.get(S.charAt(j))-1);
    //                 j--;
    //             }
    //             else{
    //                 ans2=S.charAt(j)+ans2;
    //                 j--;
    //             }
    //             c++;
    //         }
    //     }
    //      StringBuffer ans=new StringBuffer(ans1+ans2);
        
    //     if(c%2==1) ans.reverse();
        
    //         return ans.toString();
    // }
    String removeReverse(String S) 
    { 
        int i=0,j=S.length()-1;
        
        int[] map=new int[26]; Arrays.fill(map,0);
        boolean flag=true;
        int cnt=0;
        
        
        for(char ch:S.toCharArray()) map[ch-'a']++;
        
        String begin="",end="";
        
        while(i<=j)
        {
            char ch;
            if(flag) ch=S.charAt(i++);
            else ch=S.charAt(j--);
            
            if(map[ch-'a']>1)
            {
                map[ch-'a']--;
                cnt++;
                flag=!flag;
            }
            else
            {
                if(flag) begin+=ch;
                else end=ch+end;
            }
        }
        
        StringBuffer ans=new StringBuffer(begin+end);
        
        if(cnt%2==1) ans.reverse();
        
            return ans.toString();
        
    }
} 

//{ Driver Code Starts.

// } Driver Code Ends