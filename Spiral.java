public class Spiral {
    public static void main(String args[]){
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {4,3,2,1},
            {9,8,7,6}
        };

        int left = 0;
        int right = arr[0].length-1;
        int upper = 0;
        int down  = arr.length-1;

        while(left <= right && upper <= down){
             for(int i = left; i<=right; i++){
                System.out.print(arr[upper][i]);
             }
             upper++;

             for(int i = upper; i<=down; i++){
                System.out.print(arr[i][right]);
             }
             right--;

             if(upper <= down){
                for(int i = right; i>=left; i--){
                    System.out.print(arr[down][i]);
                }
                down--;
             }

             if(left <= right){
                for(int i = down; i>=upper; i--){
                    System.out.print(arr[i][left]);
                }
                left++;
             }
        }
    }
}
