public class checksorted {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 9, 15};
        int ans = leanersearch(arr);
        System.out.println(ans);
    }

    static int leanersearch(int[] arr) {
        if (arr.length == 0) {
            return -1; // empty array
        }
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (element < arr[i - 1]) {
                sorted = false;
                break; // stop checking
            }
        }
        if (sorted) {
            return 1;  // sorted
        } else {
            return -1; // not sorted
        }
    }
}
