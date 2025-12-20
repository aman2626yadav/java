public class max{
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,2,8};
        int max=0;
        for(int i=0;i<=arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

        }


        }