public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8, 10, 20, 35, 19 };
        int target = 19;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        // find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // conditon for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end=previous end + sizeofBox*2
            end = end + ((end - start + 1) * 2);
            // update the start
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = (start + (end - start)) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
