
import java.util.Arrays;
public class Target_Sum_Subset {
    public static boolean isSubsetSum(int[] arr, int n, int sum, boolean[][] dp) {
         if(sum == 0){
            return true;
         }

         if(n == 0){
            return false;
         }

         if(dp[n][sum] == true) {
            return true;
           
        }

         if(sum >= arr[n-1]) {
            boolean ans1 =  isSubsetSum(arr, n - 1, sum - arr[n - 1], dp);
            boolean ans2 =  isSubsetSum(arr, n - 1, sum, dp);
            dp[n][sum] = ans1 || ans2;
            return dp[n][sum];
         }

         else{
            dp[n][sum] = isSubsetSum(arr, n - 1, sum, dp);
            return dp[n][sum];
         }


         
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 14;
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (boolean[] bs : dp) {
            Arrays.fill(bs, false);
        }


        if (isSubsetSum(arr, n, sum, dp)) {
            System.out.println("Found a subset with the given sum");
        } else {
            System.out.println("No subset with the given sum");
        }
    }
  
}
