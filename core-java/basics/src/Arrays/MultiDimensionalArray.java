package Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
//        no of cols not manditory when initializing
        int [][] arr= new int[3][];
        int [][] arr2D= {
                {1, 2, 4}, // 0th index
                {5, 6}, // 1st index
                {7, 8, 9} // 2nd index
        };

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++){
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }
    }
}
