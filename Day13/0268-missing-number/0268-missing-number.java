class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swapArr(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swapArr(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}