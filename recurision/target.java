public class target{
  public static void main(String[] args) {
    int[] arr = {2,4,6,7,8};
    int target = 4;
    System.out.println(find(arr, target, 0));
      
  }
  static int find(int[] arr, int target,int idx){
    if(idx>=arr.length) return -1;
    // self work
    if(arr[idx]==target) return idx;
    return find(arr, target, idx+1);
  }
}  
// here the output is true and fa;se;
// public class target{
//   public static void main(String[] args) {
//     int[] arr = {2,4,6,7,8};
//     int target = 9;
//     System.out.println(find(arr, target, 0));
      
//   }
//   static boolean  find(int[] arr, int target,int idx){
//     if(idx>=arr.length) return false;
//     // self work
//     if(arr[idx]==target) return true;
//     return find(arr, target, idx+1);
//   }
// }