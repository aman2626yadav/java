public class arrprint {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6};
        arrprint(arr, 0); // start printing from index 2
    }

    static void arrprint(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);  // print element, not index
        arrprint(arr, idx+1);
    }
}
