public class secondmax {
    public static void main(String[] args) {
        int[] arr = {9, 8, 9, 5, 7};
        System.out.println("Second Max: " + secmax(arr));
    }

    // Find maximum in array
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Find second maximum in array
    static int secmax(int[] arr) {
        int mx = max(arr);  // first maximum

        // replace all maximum values with very small number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        return max(arr); // second maximum
    }
}
