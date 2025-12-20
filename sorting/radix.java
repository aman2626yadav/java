import java.util.Arrays;

public class radix {
    public static void main(String[] args) {
        int[] arr = {43, 453, 645, 879, 56};
        radixsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void radixsort(int[] arr) {
        int maxe = max(arr);
        for (int exp = 1; maxe / exp > 0; exp *= 10) {
            countsort(arr, exp);
        }
    }

    static void countsort(int[] arr, int value) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];  // only 0–9 needed

        // Count occurrences of digits
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / value) % 10]++;
        }

        // Make prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array (stable sort → traverse backwards)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / value) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
