public class mergedsorted{
     public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        mergedsorted obj = new mergedsorted();
        int[] merged = obj.sort(arr1, arr2);
        for(int num : merged){
            System.out.println(num);
        }
     }
      
    public int[] sort(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] merge = new int[m + n];
        int i = 0, j = 0;

        // Merge arrays using for loop
        for (int k = 0; k < m + n; k++) {
            if (i < m && (j >= n || arr1[i] < arr2[j])) {
                merge[k] = arr1[i++];
            } else {
                merge[k] = arr2[j++];
            }
        }
        return merge;   // return merged array
    }
     
}

