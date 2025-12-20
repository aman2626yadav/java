
import java.util.Arrays;

public class selection{
    public static void main(String[] args) {
        int[] arr ={4,7,5,8,2,9};
    sort(arr);
    System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int[]arr){
       int n = arr.length;
       for (int i = 0; i < n; i++) {
        int smallest =i;
        for (int j = i+1; j < n-1; j++) {
            if(arr[j]<arr[smallest]){
                smallest=j;
            }
            
        }
        int temp = arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;


           
       }

    }
    
}