public class Zero_OneKnapsack {
    public static int Knapsack(int[] wt, int[] val, int W, int n) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            return Knapsack(wt, val, W, n - 1);
        } else {
            return Math.max(val[n - 1] + Knapsack(wt, val, W - wt[n - 1], n - 1),
                            Knapsack(wt, val, W, n - 1));
        }


    }


    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 2, 4};
        int[] val = {10, 15, 40, 30, 50};
        int W = 8;
        int n = wt.length;

        int maxProfit = Knapsack(wt, val, W, n);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
