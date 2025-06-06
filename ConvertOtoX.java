public class ConvertOtoX {

    public static void dfs(char[][] grid, int i, int j, int[] x, int[] y) {
        grid[i][j]  = 'T';
        for(int k = 0; k < 4; k++) {
            int newX = i + x[k];
            int newY = j + y[k];
            if(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == 'O') {
                dfs(grid, newX, newY, x, y);
            }
        }
     
    }
    public static void main(String args[]){
       char[][] grid =  {{'X', 'O', 'X', 'X', 'X', 'X'}, 
                        {'X', 'O', 'X', 'X', 'O', 'X'},
                        {'X', 'X', 'X', 'O', 'O', 'X'},
                        {'O', 'X', 'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'O'},
                        {'O', 'O', 'X', 'O', 'O', 'O'}
                    };

                 int m = grid.length;
                 int n = grid[0].length;
                 int x[] = {-1, 0, 1, 0};
                 int y[] = {0, 1, 0, -1};


                 for(int i = 0; i < m; i++) {
                     for(int j = 0; j < n; j++) {
                         if( i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                             if(grid[i][j] == 'O') {
                                 dfs(grid, i, j, x, y);
                             }
                         }
                     }
                 }

                 for(int i = 0; i < m; i++) {
                     for(int j = 0; j < n; j++) {
                         if(grid[i][j] == 'O') {
                             grid[i][j] = 'X';
                         } else if(grid[i][j] == 'T') {
                             grid[i][j] = 'O';
                         }
                     }
                 }
                 for(int i = 0; i < m; i++) {
                     for(int j = 0; j < n; j++) {
                         System.out.print(grid[i][j] + " ");
                     }
                     System.out.println();
                 }

        }
    }
    

