package Search.mergesort;

/**
 *
 * The DA of Merge Sort is that it requires to make a complete copy of the array
 * the benefit is that it makes far less comparisons than isnertion or selection sort
 *
 */
public class MergeSort {

    @SuppressWarnings("Duplicates")
    public static void sort(int inputArray[]) {
        sort(inputArray, 0, inputArray.length-1);
    }

    @SuppressWarnings("Duplicates")
    public static void sort(int inputArray[], int start, int end) {
        if(end <= start) {
            return;
        }

        int mid = (start+end)/2;
        sort(inputArray, start, mid);
        sort(inputArray, mid+1, end);
        // merge sorted results into the inputarrays

//        System.out.println(Arrays.toString(inputArray));

        merge(inputArray, start, mid, end);
    }

    @SuppressWarnings("Duplicates")
    private static void merge(int[] arr, int start, int mid, int end) {

        int tempArray[] = new int[end - start+1];

        // index counter for the left side of the array
        int leftIdx = start;
        // index counter for the right side of the array
        int rightIdx = mid+1;

        int k = 0;

        while (leftIdx<=mid && rightIdx<=end) {
            if(arr[leftIdx] < arr[rightIdx]) {
                tempArray[k] = arr[leftIdx];
                leftIdx++;
            } else {
                tempArray[k] = arr[rightIdx];
                rightIdx++;
            }
            k++;
        } // done sorting! So both the right and left side of the sub-arr are sorted

        if(leftIdx <= mid) { // consider the right side done being sorted, left must be sorted already
            while (leftIdx<=mid) {
                tempArray[k] = arr[leftIdx];
                leftIdx++;
                k++;
            }
        } else if(rightIdx <= end) {
            while (rightIdx<=end) {
                tempArray[k] = arr[rightIdx];
                rightIdx++;
                k++;
            }
        }
        // copy over the temp array into the appropriate slots of arr
        for(int i=0; i<tempArray.length; i++) {
            arr[start+i] = tempArray[i];
        }

    }

}
