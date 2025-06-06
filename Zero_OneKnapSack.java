import java.util.*;
public class Zero_OneKnapSack {

    public static int Knapsack(int[] values, int[] weights, int capacity, int n, int[][] dp) {
        if (n <= 0 || capacity == 0) {
            return 0;
        }

        if (dp[n][capacity] != -1) {
            return dp[n][capacity];
        }

       if(weights[n] < capacity){
          int ans1 = values[n] + Knapsack(values, weights, capacity - weights[n], n - 1, dp);
          int ans2 = Knapsack(values, weights, capacity, n - 1, dp);
          dp[n][capacity] = Math.max(ans1, ans2);
       }
         else {
             dp[n][capacity] = Knapsack(values, weights, capacity, n - 1, dp);
         }
         return dp[n][capacity];

    }
    public static void main(String[] args) {
        int[] values = {60, 100, 120, 240, 50, 30};
        int[] weights = {10, 20, 30, 40, 25, 5};
        int capacity = 50;
        int n = values.length-1;
        int dp[][] = new int[n + 1][capacity + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = Knapsack(values, weights, capacity, n, dp);
        System.out.println("Maximum value in the knapsack: " + ans);
        

    }
}