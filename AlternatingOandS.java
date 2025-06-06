
import java.util.*;
public class AlternatingOandS {

    public static void SpiralMethod(char grid[][], int m, int n){
       int top = 0;
       int bottom = m-1;
       int left = 0;
       int right = n-1;
       int cnt = 1;
       while(top <= bottom && left <= right){
              
              for(int i = left; i <= right; i++){
                if(cnt % 2 == 0) {
                     grid[top][i] = 'O';
                } else {
                     grid[top][i] = 'S';
                }
                
              }
              top++;
    
              
              for(int i = top; i <= bottom; i++){
                if(cnt % 2 == 0) {
                     grid[i][right] = 'O';
                } else {
                     grid[i][right] = 'S';
                }
                
              }
              right--;
    
        
              if(top <= bottom){
                for(int i = right; i >= left; i--){
                     if(cnt % 2 == 0) {
                          grid[bottom][i] = 'O';
                     } else {
                          grid[bottom][i] = 'S';
                     }
                     
                }
                bottom--;
              }
    
              
              if(left <= right){
                for(int i = bottom; i >= top; i--){
                     if(cnt % 2 == 0) {
                          grid[i][left] = 'O';
                     } else {
                          grid[i][left] = 'S';
                     }
                     
                }
                left++;
              }

                cnt++;
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        char grid[][] = new char[m][n];

        SpiralMethod(grid , m, n);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
