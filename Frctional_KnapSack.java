
import java.util.PriorityQueue;
public class Frctional_KnapSack {
    static class Pair implements Comparable<Pair> {
        int ratio;
        int idx;
        public Pair(int ratio, int idx) {   
            this.ratio = ratio;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p){
            return p.ratio - this.ratio; // Sort in descending order of ratio
        }
    }
    public static void main(String[] args) {
        int[] values = {60, 100, 120, 240, 50, 30};
        int[] weights = {10, 20, 30, 40, 25, 5};
        int capacity = 50;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < values.length; i++) {
            int ratio = values[i] / weights[i];
            pq.add(new Pair(ratio, i));
        }

        long totalValue = 0;
        while(!pq.isEmpty() && capacity > 0) {
            Pair current = pq.poll();
            int idx = current.idx;
            int ratio = current.ratio;
            int weight = weights[idx];
            int value = values[idx];

            if(weight <= capacity) {
                totalValue += value;
                capacity -= weight;
            } else {
                totalValue +=  ratio*capacity;
                break;
            }
        }
        System.out.println("Maximum value in the knapsack: " + totalValue);
      

    }
}
