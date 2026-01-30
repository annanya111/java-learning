
public class SumOf2DArray {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {        // rows
            for (int j = 0; j < matrix[i].length; j++) { // columns
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
