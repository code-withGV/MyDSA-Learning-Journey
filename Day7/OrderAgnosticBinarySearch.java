public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
    int[] arr = {-12, -4, -3,0, 2, 3, 4,15,16,18,20,89};
    int target = 22;
    int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether arr is sorted in asc/desc
        boolean isAsc = arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isAsc=true;
//        } else {
//            isAsc= false;
//        }
        while (start <= end) {
            int mid = (start + (end - start)) / 2;
            if (arr[mid] == target) {
                return mid;
            }
                if (isAsc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid - 1;
                    }
                }
        }

        return -1;

    }

}