
import java.util.Arrays;

public class onevaluerotated{
    public static void main(String[] args) {
        int[] arr = {2,4,0,7,0,9};
        int target =0;
        System.out.println(Arrays.toString(tum(arr, target)));
        
    }
    static int[] tum(int[] arr,int target){
        int n = arr.length;
        int[] onevlaue = new int[n];
        int value = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                onevlaue[value++] = arr[i];
            }
            
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]!=target){
                onevlaue[value++]=arr[i];
            }
            
        }
        return onevlaue;
    }
}