public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -4, -3,0, 2, 3, 4,15, 17, 18, 20, 21};
        int target = 20;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find middle element
//            int mid = (start + end)/2;
            //but here we have a problem
            //as integer has fixed size and
            //if we take a large value of start and end
            //then there might be possibility that
            //start+end will get out of range of int
            //gives an error
            int mid = (start + (end-start))/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}