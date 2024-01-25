//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    // boolean isPrime(int n){
    //     if(n==0 || n==1){
    //         return false;
    //     }
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // int count=0;
    // int Solution(int n,int m){
    //     if(n==m){
    //         return count;
    //     }
    //     if(isPrime(n+1)){
    //         count++;
    //     }
    //     return Solution(n+1,m);
        
    // }
    int solve(int Num1,int Num2){
        //code here
        int n=10000;
        int prime[]=new int[n];
        Arrays.fill(prime,1);
        for(int i=2;i*i<n;i++){
            for(int j=i*i;j<n;j+=i){
                if(prime[j]==1) prime[j]=0;
            }
        }
        int dp[]=new int[10000];
        int vis[]=new int[10000];
        int ans=0;
        Queue<Integer> q=new LinkedList<>();
        
        q.add(Num1);
        while(!q.isEmpty()){
            int node=q.remove();
            if(vis[node]==1)continue;
            
            vis[node]=1;
            String num = Integer.toString(node);
            for(int i=0;i<4;i++){
                for(char c = '0';c<='9';c++){
                    if((i==0 && c=='0') || num.charAt(i)==c)
                    continue;
                    
                    String next = num.substring(0,i)+c+num.substring(i+1);
                    int nxtNode = Integer.parseInt(next);
                    if(prime[nxtNode]==1 && dp[nxtNode]==0){
                        dp[nxtNode] = 1 + dp[node];
                        q.add(nxtNode);
                    }
                }
            }
        }
        return dp[Num2];
        
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int num1=Integer.parseInt(input_line[0]);
            int num2=Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.solve(num1,num2));
        }
    }
}
// } Driver Code Ends