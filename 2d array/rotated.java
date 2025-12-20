import java.util.Arrays;

public class rotated {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 4},
            {3, 1, 5},
            {4, 2, 6}
        };

        // Rotate 90 degrees clockwise
        rotate(matrix, 3);

        // Print result
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    // Step 1: Transpose
    static void trans(int[][] matrix, int row, int col) {
        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Step 2: Reverse a row
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Rotate 90° clockwise
    static void rotate(int[][] matrix, int n) {
        trans(matrix, n, n); // transpose
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]); // reverse each row
        }
    }
}
