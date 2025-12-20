
import java.util.Arrays;

public class quick{
    public static void main(String[] args){
        int[] arr ={6,3,1,5,4};
        int n = arr.length;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]= temp;
    }
    static int  quicksort(int[]arr,int start, int end){
        int pivot= arr[start];
        int count =0;
        for(int i=start+1;i<=end;i++){
          if(arr[i]<=pivot){
            count++;
          }
        }
        int pivotidx = start+count;
        swap(arr, start, pivotidx); 
        int i = start, j = end;
        while(i<pivotidx && j>pivotidx){
            if(arr[i]<=pivot) i++;
            if(arr[j]>=pivot) j--;
        if(i<pivotidx && j>pivotidx){
            swap(arr,i,j);
        }
        } 
        return pivotidx;
    }
    static void sort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int pi = quicksort(arr,start,end);
        sort(arr, start, pi-1);
        sort(arr, pi+1, end);
    }
} 
// time complexity o(ologn); best case( n2)
