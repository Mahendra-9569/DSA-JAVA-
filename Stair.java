import java.util.Arrays;
public class Stair {
    public static int countWays(int n, int[] dp) {
        if (n == 0 ) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp)+ countWays(n - 3, dp);
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 4; 
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ways = countWays(n, dp);
        System.out.println(ways);
        
    }
 
}
