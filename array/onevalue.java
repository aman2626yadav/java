public class onevalue{
    public static void main(String[] args) {
        int[] arr = {2,3,8,5,6};
        int target = 8;
        System.out.println( "value found and upated is"+value(arr, target));
        for(int num : arr) {
            System.out.println(num+" ");
            
        }

    }
    static int value(int[]arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                int temp = arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
                return arr[0];


            }
            
        }
        return -1;
    }

}