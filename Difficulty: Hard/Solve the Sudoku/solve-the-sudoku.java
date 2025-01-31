//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = 9;
            int matrix[][] = new int[n][n];
            // String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ob.solveSudoku(matrix);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
     // Function to find a solved Sudoku.
    static boolean sudokuUtils(int[][] mat){
        for(int i = 0; i < 9; ++i){
            for(int j = 0; j < 9; ++j){
                if(mat[i][j] == 0){
                    for(int val = 1; val <= 9; ++val){
                        if(isValid(mat, i, j, val)){
                            mat[i][j] = val;
                            if(sudokuUtils(mat)){
                                return true;
                            }
                            else{
                                mat[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static void solveSudoku(int[][] mat) {
        // code here
        sudokuUtils(mat);
    }
    
    static boolean isValid(int[][] mat, int r, int c, int val){
        for(int i = 0; i < 9; ++i){
            if(mat[i][c] == val){
                return false;
            }
            if(mat[r][i] == val){
                return false;
            }
            
            if(mat[3 * (r / 3) + i / 3][3 * (c/3) + i % 3] == val){
                return false;
            }
            
        }
        
        return true;
    }
}