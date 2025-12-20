public class twosum{
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,6,1,5};
        int target = 7;
        int ans = sum(arr, target);
        System.out.println(ans);

    }
    static int sum(int[] arr, int target){
        int count =0;
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            // or if j = i+1 then the repeted num on back side in used
            if (arr[i]+arr[j]==target) {
                count++;
                
            }    
        }
           
       }
       return count;
    }
}