package Search.quicksort;

import java.util.Arrays;

public class AppMain {

    public static void quickSort(int [] arr, int start, int end) {

        if(start < end) {
            int pp = partition(arr, start, end); // index pos of the correctly placed pivot value
            quickSort(arr, start, pp-1); // sort the left hand of the range
            quickSort(arr, pp+1, end);
        }

    }

    public static int partition (int [] arr, int start, int end) {

        int pivot = arr[end];
        // in the first iteration, i starts from -1
        int i = start-1;
        for (int j = start; j<=end-1; j++) {
            if(arr[j] <= pivot) {
                i++;
                int ival = arr[i];
                int jval = arr[j];
                arr[i] = jval;
                arr[j] = ival;
            }
        }

        // put the pivot value in the correct slot
        int ival = arr[i+1];
        arr[end] = ival;
        arr[i+1] = pivot; // here pivot value is placed in the correct slot of the array;

        return 0;
    }

    public static void main(String[] args) {

        // first, figure out the pivot!
        int[] inputArray = { 12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
        quickSort(inputArray, 0, inputArray.length-1);

        System.out.println(Arrays.toString(inputArray));


    }
}
