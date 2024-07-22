//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int K;
            K = sc.nextInt();

            int N;
            N = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> ans = obj.combinationSum(K, N);
            Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
                @Override   public int compare(ArrayList<Integer> a,
                                             ArrayList<Integer> b) {
                    int al = a.size();
                    int bl = b.size();
                    int min = Math.min(al, bl);
                    for (int i = 0; i < min; i++) {
                        if (a.get(i) < b.get(i))
                            return -1;
                        else if (a.get(i) > b.get(i))
                            return 1;
                    }
                    if (al < bl)
                        return -1;
                    else if (al > bl)
                        return 1;
                    return -1;
                }
            });
            for (int i = 0; i < ans.size(); i++) {
                ArrayList<Integer> cur = ans.get(i);
                for (int j = 0; j < cur.size(); j++) {
                    System.out.print(cur.get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static void solve(ArrayList<Integer> A, int ind, int target,int len1,int len2, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
        if(target == 0 && temp.size()==len2) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=ind;i<A.size();i++) {
            if(i>ind && A.get(i)==A.get(i-1)) {
                continue;
            }
            if(A.get(i) > target) break;
            temp.add(A.get(i));
            solve(A, i+1, target - A.get(i),len1,len2, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum(int K, int N) {
         ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<9;i++)
        {
            arr.add(i+1);
        }
          ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        solve(arr,0,N,9,K,l,ans);
        return ans;
        
        
    }
}