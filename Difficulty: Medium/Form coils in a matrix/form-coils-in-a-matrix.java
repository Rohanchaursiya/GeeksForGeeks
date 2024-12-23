//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[][] ptr = ob.formCoils(n);
            
            for(int i=0; i<2; i++)
            {
                for(int j=0; j<ptr[i].length; j++)
                {
                    System.out.print(ptr[i][j] + " ");
                }
                System.out.println();
            }
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[][] formCoils(int n) {
        // code here
        int m=8*n*n;
        int[] coil1=new int[8*n*n];
        int[] coil2=new int[8*n*n];
        int flag=1;
        int step=2;
        coil1[0]=8*n*n+2*n;
        int curr=coil1[0];
        int index=1;
        
        while(index<m){
            
            for(int i=0; i<step; i++){
                coil1[index++]=(curr-4*n*flag);
                curr=(curr-4*n*flag);
                if(index>=m){
                    break;
                }
            }
            
            if(index>=m){
                break;
            }
            
            for(int i=0; i<step; i++){
                coil1[index++]=(curr+flag);
                curr=(curr+flag);
                if(index>=m){
                    break;
                }
            }
            
            if(index>=m){
                 break;
            }
            
           flag=flag*(-1);
            step+=2;
        }
        
        for(int i=0; i<m; i++){
            coil2[i]=16*n*n+1-coil1[i];
        }
        int[][] ans=new int[][]{coil1,coil2};
        return ans;
    }
}