class Solution {
    public int findPeakElement(int[] arr) {
      
        int start = 0;
        int end=arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in decreasing part of array
                //but look at left
                //this is why end != mid-1
                end=mid;
            }else {
                start=mid + 1;
                //because we know mid+1 element > mid element
            }
        }
        //in the end start==end and pointing to the largest number because of the 2 conditions
        //start and end are always try to find max element in the above 2 checks
        // hence when they are pointing to just one element that is the max one because that is what the check say
        //more eleaboration: at every point of time for start and end they have the best possible answer till that time
        //and if we are saying that only one item is rem beacuse of above line that is the best answer.
        return start;// or return end as both are equal 

    
    }
}