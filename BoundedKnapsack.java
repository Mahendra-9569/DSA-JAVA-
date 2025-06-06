public class BoundedKnapsack {
    public static void main(String args[]){
        int[] weights = {1, 2, 3};
        int[] values = {10, 15, 40};
        int capacity = 6;
        int n = weights.length;
        
        System.out.println("Maximum value in Knapsack = " + boundedKnapsack(weights, values, n, capacity));
    }

    public static int boundedKnapsack(int[] weights, int[] values, int n, int capacity) {
        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (weights[n - 1] > capacity) {
            return boundedKnapsack(weights, values, n - 1, capacity);
        } else {
            int include = values[n - 1] + boundedKnapsack(weights, values, n, capacity - weights[n - 1]);
            int exclude = boundedKnapsack(weights, values, n - 1, capacity);
            return Math.max(include, exclude);
        }
    }
}
