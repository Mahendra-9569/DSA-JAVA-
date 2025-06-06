

import java.util.*;
public class MatrixGraph {
    static class pair{
        int row;
        int col;
        int tm;
        pair(int row, int col, int tm){
            this.row = row;
            this.col = col;
            this.tm = tm;
        }
    }
    public static void main(String args[]) {
  
        int[][] graph = {
            {0, 1, 1, 2},
            {0, 1, 1, 1},
            {0, 1, 1, 0},
            {1, 2, 0, 0}
        };

        Queue<pair> q = new LinkedList<pair>();
         int delRow[] = {-1, 0, 1, 0};
         int delCol[] = {0, 1, 0, -1};
 
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].length; j++) {
                if(graph[i][j] == 2) {
                    q.add(new pair(i, j, 0));
                }
            }
        }

        int maxtm = 0;
        while(!q.isEmpty()) {
            pair p = q.poll();
            int x = p.row;
            int y = p.col;
            int time = p.tm;

            maxtm = Math.max(maxtm, time);
            for(int i = 0; i < 4; i++) {
                int newRow = x + delRow[i];
                int newCol = y + delCol[i];
                if(newRow >= 0 && newRow < graph.length && newCol >= 0 && newCol < graph[0].length && graph[newRow][newCol] == 1) {
                    graph[newRow][newCol] = 2;
                    q.add(new pair(newRow, newCol, time + 1));
                }
            }
        }

        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].length; j++) {
               System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("Maximum time taken: " + maxtm);

    }
}












