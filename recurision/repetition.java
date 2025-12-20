public class repetition{
    public static void main(String[] args) {
        int[] arr ={2,4,6,4,6,4};
        int target= 4;
        rep(arr, target, 0);
        
        
    }
    static void rep(int[]arr , int target, int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.println(idx);
        }
        rep(arr, target, idx+1);
    }

}