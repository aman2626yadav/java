import java.util.Arrays;
public class moving{
    public static void main(String[] args) {
        int[] arr ={0,5,0,3,4,2};
        move(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
    static void  move(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]==0&&arr[j+1]!=0){
                    int temp = arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j] = temp;
                }
                
            }
        }
    }
}