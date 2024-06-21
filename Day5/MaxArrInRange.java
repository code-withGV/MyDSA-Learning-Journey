public class MaxArrInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 7, 81 };

        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxRange(int[] arr, int start, int end) {

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;

    }

}
