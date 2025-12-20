public class arrmax{
    public static void main(String[] args) {
        int[] arr = {2,4,6,4,3};
        System.out.println(arrmax(arr,0));
    }
    static int arrmax(int[]arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int sec = arrmax(arr,idx+1);
        return Math.max(arr[idx], sec);
    }

}