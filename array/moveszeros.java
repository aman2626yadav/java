public class moveszeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,4,7,0};
        moveZeroe(arr);
    }
        
    
    public static  void moveZeroe(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[k++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr1[k++] = arr[i];
            }
        }
    }
    
}
