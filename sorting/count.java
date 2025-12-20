
import java.util.Arrays;

public class count{
    public static void main(String[] args){
        int[] arr ={2,4,2,5,4,8,3,9};
        countsort(arr);
        // sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]>=max){
            max= arr[i];

        }
           
       }
       return  max;
    }
    // best method but not stable;
    // static void sort(int[]arr){
    //    int maxe= max(arr);
    //     int[] count = new int[maxe+1];
    //     for (int i = 0; i < arr.length; i++) {
    //         count[arr[i]]++;
            
    //     }
    //     int k =0;
    //     for (int i= 0; i<count.length; i++) {
    //         for (int j = 0; j <count[i]; j++) {
    //             arr[k++] = i;
    //             // k++;
                
    //         }

            
    //     }

    // }
    // this statement is used for to make a stable array througout the sorting; it works without the implemention of this array using upper function;
    static void countsort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int maxe= max(arr);
        int[] count = new int[maxe+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

    }
    // make prifixsum;
    for (int i = 1; i < count.length; i++) {
        count[i]+=count[i-1];
        
    }
    // find the index of each element in original array and put it in output array;
    for (int i = n-1; i>=0; i--) {
        int idx = count[arr[i]]-1;
        output[idx] = arr[i];
        count[arr[i]]--;
        
    }
    for (int i = 0; i < n; i++) {
        arr[i]= output[i];
        
    }

    }

}