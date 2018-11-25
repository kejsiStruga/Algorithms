package Search.mergesort;

import java.util.Arrays;

public class MergeSort1 {

    // the entry point => called in main
    @SuppressWarnings("Duplicates")
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length-1);
    }

    // recursive function
    @SuppressWarnings("Duplicates")
    public static void  sort(int[] arr, int start, int end) {

        // base case
        if(end <= start) {
            return;
        }

        // recursive call on halves
        int mid = (start+end) / 2;

        sort(arr, start, mid);
        sort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    // the hear of the algorithm, because here the sorting occurs
    @SuppressWarnings("Duplicates")
    public static void merge(int[] arr, int start, int mid, int end) {

        // Create new array to hold the sorted elements
        int tempArr[] = new int[end - start+1];

        // index counter for the left side of the array
        int leftIdx = start;

        // index counter for the right side of the array
        int rightIdx = mid+1;

        // I also need an index for the new array
        int k = 0;

        while(leftIdx <= mid && rightIdx <= end) {
            if(arr[leftIdx] < arr[rightIdx]) {
                tempArr[k] = arr[leftIdx];
                leftIdx++;
            } else {
                tempArr[k] = arr[rightIdx];
                rightIdx++;
            }
            k++;
        }

        // if this is the case => right array is sorted => append left array elements to the new sorted array
        if(leftIdx <= mid) {
            while (leftIdx<=mid) {
                tempArr[k] = arr[leftIdx];
                leftIdx++;
                k++;
            }
        } else if(rightIdx <= end) {
            while (rightIdx<=end) {
                tempArr[k] = arr[rightIdx];
                rightIdx++;
                k++;
            }
        }

        // copy the temp array into the org array
        for(int i=0; i<tempArr.length; i++) {
            arr[start+i] = tempArr[i];
        }
    }


}
