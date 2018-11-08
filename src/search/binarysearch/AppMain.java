package search.binarysearch;

public class AppMain {

    public static int binarySearch(int [] a, int x) {
        int p = 0;
        int r = a.length - 1;

        while (p <= r) {
            int q = (p+r)/2;
            if(x < a[q]) r = q-1;
            else if (x > a[q]) p = q+1;
            else return q; // we have found it!
        }
        return -1;
    }

    public static int recursiveLinearSearch(int [] arr, int i, int x) {
        if(i >= arr.length) {
            return -1;
        } else if(arr[i] == x) {
            return i;
        } else {
            System.out.println("index at: "+i);
            return recursiveLinearSearch(arr, i+1, x);
        }
    }

    public static int recursiveBinarySearch(int p, int r, int [] arr, int x) {

        int q = (p+r) / 2;

        if(p>r) {
            return -1;
        }
        else if(arr[q] > x) {
            return recursiveBinarySearch(p, q+1, arr, x);
        } else if(arr[q] < x) {
            return recursiveBinarySearch(q+1, r, arr, x);
        } else {
            return q;
        }
    }

    public static void main(String[] args) {
//        System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7,8,9}, 10));
        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(recursiveBinarySearch(0, arr.length-1, arr, 10));
    }
}