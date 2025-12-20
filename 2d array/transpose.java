
import java.util.Arrays;

public class transpose{
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,4},
            {3,1,5},
            {4,2,6}
        };
        int[][] ans =trans(matrix, 3, 3);
        for (int i = 0; i < ans.length; i++) {
        System.out.println(Arrays.toString(ans[i]));
            
        }
            

        
            }
        static int[][] trans(int[][] matrix, int row,int col){
                int [][] ans = new int[col][row];
                for (int i = 0; i < col; i++) {
                    for (int j = 0; j < row; j++) {
                        ans[i][j]=matrix[j][i];
                        // and we can do throught swapping matrix without using next arr crated; see next question on rotated;
                        
                    }
                    
                }

             return ans;
            }
}