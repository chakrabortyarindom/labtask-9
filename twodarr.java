public class twodarr {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        System.out.println("Element at [0][2]: " + matrix[0][2]); // 3
        System.out.println("Element at [2][1]: " + matrix[2][1]); // 8

        
        System.out.println("All elements:");
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
