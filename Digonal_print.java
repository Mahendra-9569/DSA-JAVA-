import java.util.*;
public class Digonal_print {
    public static void Addelements(int grid[][], int n, int m, List<Integer> ans) {
        int countDiagonals = n + m - 1;
        for(int i = 1; i <= countDiagonals; i++){
            int startRow = Math.min(i - 1, n - 1);
            int startCol = Math.max(0, i-n);

            int count = Math.min(i, m - startCol);
            for(int j = 0; j < count; j++){
                ans.add(grid[startRow][startCol]);
                startRow--;
                startCol++;
            }
        }
    }
    public static void main(String args[]){
        
        int grid[][] = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int n = grid.length;
        int m = grid[0].length;

        List<Integer> ans = new ArrayList<>();

        Addelements(grid, n, m, ans);
        System.out.println(ans);

    }
}
