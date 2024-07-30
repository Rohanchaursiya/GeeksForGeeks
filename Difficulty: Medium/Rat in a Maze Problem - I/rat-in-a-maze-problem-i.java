//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    ArrayList<String> ans = new ArrayList<>();
    void solve(int i, int j, int n, int m, String s, int[][] vis, int[][] mat) {
        if(i < 0 || j < 0 || i >= n || j >= m || vis[i][j] == 1 || mat[i][j] == 0) {
            return;
        }
        if(i == n-1 && j == m-1) {
            ans.add(s);
            return;
        }
        vis[i][j] = 1;
        solve(i+1, j, n, m, s+'D', vis, mat); 
        solve(i, j+1, n, m, s+'R', vis, mat); 
        solve(i-1, j, n, m, s+'U', vis, mat); 
        solve(i, j-1, n, m, s+'L', vis, mat); 
        vis[i][j] = 0;
    }

    public ArrayList<String> findPath(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        if(mat[0][0] == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add("-1");
            return result;
        }
        int[][] vis = new int[n][m];
        solve(0, 0, n, m, "", vis, mat);
        if (ans.isEmpty()) {
            ans.add("-1");
        }
        return ans;
    }
}