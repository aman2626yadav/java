public class repition{
    public static void main(String[] args) {
        int[] arr = {3,5,7,5,5,15};
        int target= 5;
        int ans= leanersearch(arr, target);
            System.out.println(ans);
    }
    static int leanersearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
              count++;
            }

            
        }
     return count;
    }
}