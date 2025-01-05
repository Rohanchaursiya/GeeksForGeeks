//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    int BinarySearch(int[] arr,int comp){
        int low=0;
        int high=arr.length-1;
        int res=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=comp){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int c=0;
        int ind=0;
        for(int i=0;i<arr.length;i++){
            ind=BinarySearch(arr,target-arr[i]);
            c+=ind;
            if(ind>i){
                c--;
            }
        }
        return c/2;
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends