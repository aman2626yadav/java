import java.util.Arrays;

public class kithrotatedarray {
    public static void main(String[] args) {
        int[] arr = {21,2,3,4,5,6,7};
        int k = 5;
        System.out.println(Arrays.toString(rotated(arr, k)));
    }

    static int[] rotated(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }
}
