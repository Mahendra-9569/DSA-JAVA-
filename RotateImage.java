public class RotateImage {
    public static void transpose(int matrix[][]){
        for(int i = 0; i<matrix.length; i++){
            for(int j  = i; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void swap(int arr[][]){
         for(int i = 0; i<arr.length; i++){
             int start = 0;
             int end = arr[0].length-1;
             while(start < end){
               int temp  = arr[i][start];
               arr[i][start] = arr[i][end];
               arr[i][end] = temp;
               start++;
               end--;
             }
         }
    }

    public static void printArr(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {4,3,2,1},
            {9,8,7,6}
        };

        transpose(arr);

        swap(arr);


        printArr(arr);



    }
}
