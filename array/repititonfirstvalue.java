public class repititonfirstvalue {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 4, 5, 3};
        System.out.println(first(arr));
    }

    static int first(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return arr[i];   // return immediately when first duplicate found
                }
                // break;
            }
        }
        return -1; // if no repetition found
    }
}
