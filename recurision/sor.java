public class sor{
    public static void main(String[] args) {
        int[] arr ={3,4,5,6};
        System.out.println(sum(arr,0));
        
    }
    static int sum(int[]arr, int idx){
        if(idx==arr.length){
            return 0;

        }
        int small = sum(arr, idx+1);
        return small + arr[idx];
    }

}