import java.util.*;

public class Dyn{
    public static int fibonacci(int n, int dp[]){
        if(n == 1 || n == 0){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int fn1 = fibonacci(n-1, dp);
        int fn2 = fibonacci(n-2, dp);
        dp[n] = fn1 + fn2;
        return dp[n];
    }
    public static void main(String args[]) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
      
        int fibo =  fibonacci(n, dp);
        System.out.println(fibo);
    }
}