public class unique{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(uniquenum(arr));
    }
    static int uniquenum(int[] arr){
        if(arr.length==0){
            return -1;
        }
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                 arr[i]=-1;
                 arr[j]=-1;
                    
                }
                
            }

            
        }
        int ans =-1;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k]!=-1){
                ans = arr[k];
                break;
            }
            
        }
      return ans;
    }
}