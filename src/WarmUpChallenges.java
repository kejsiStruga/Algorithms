import java.util.*;

public class WarmUpChallenges {

    public static void misc(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s");

        int M=0;

        int c = 0;

        List<Integer> L = new ArrayList<>();

        M = scanner.nextInt();

        // flush scanner
        scanner.nextLine();

        while(scanner.hasNextInt() && c < 1024) {
            // suppose user will always input an integer!
            Integer nr = scanner.nextInt();

            if(nr >= 0 && nr <= (Math.pow(2,32)-1)) {
                L.add(nr);
            }
            c++;
        }
        if(scanner.nextLine()!=null) {
            if(M > 0 && M < (Math.pow(2,32)-1)) {
                try {
                    System.out.println(L.get(L.size()-M));
                } catch (Exception e){
                    System.out.println("NIL");
                }
            }
        }
        scanner.close();
    }

    public static void getNrOfNegativeSubArrays() {
        Scanner scan = new Scanner(System.in);
        int nrOfElements = scan.nextInt();

        int arr [] =  new int[nrOfElements];

        int count = 0;

        for(int i=0; i<nrOfElements; i++) {
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum+=arr[j];
                if(sum<0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void queryLines() {

        Scanner scan = new Scanner(System.in);
        int nrOfLines = scan.nextInt();

        ArrayList<ArrayList> elements = new ArrayList<>();

        for(int i = 0; i < nrOfLines; i++) {

            int nrOfElements = scan.nextInt();

            ArrayList<Integer> line = new ArrayList<>();

            for(int j = 0; j < nrOfElements; j++) {
                line.add(scan.nextInt());
            }

            elements.add(line);

            scan.nextLine();
        }

        // Go on with queries
        int numOfQueries = scan.nextInt();

        for(int i = 0; i < numOfQueries; i++) {
            int line = scan.nextInt() - 1;
            int element = scan.nextInt() - 1;

            System.out.println("line: " +line);
            System.out.println(element);
            scan.nextLine();

            if(line < elements.size() && element < elements.get(line).size()) {
                System.out.println(elements.get(line).get(element));
            } else {
                System.out.println("ERROR!");
            }
        }

    }
    /**
     *
     * Let’s play a game on an array! You’re standing at index 0 of an n-element array named game.
     * From some index i(where 0<=i<n ), you can perform one of the following moves:
     *
     * Move Backward: If cell  i-1 exists and contains a 0, you can walk back to cell i-1.
     * Move Forward:
     * If cell i+1  contains a zero, you can walk to cell i+1 .
     * If cell i+leap contains a zero,you can jump to cell i+leap.
     * If you’re standing in cell n-1 or the value of i+leap>=n, you can walk or jump off the end of the array
     * and win the game.
     * In other words, you can move from index  to index i+1,i-1 , or i+leap  as long as the destination
     * index is a cell containing a 0. If the destination index is greater than , you win the game.
     * Given leap and game,complete the function in the editor below so that it return true if
     * you win the game(or false if you cannot).
     * Input Format
     *
     * The first line contains an integer, q, denoting the number of queries (i.e., function calls).
     * The  2*q subsequent lines describe each query over two lines:
     *
     * The first line contains two space-separated integers describing the respective values of n and leap.
     * The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the
     * respective values of game_0,game_1,…,game_n-1.
     *
     * @return
     */
    public static boolean canWin(int [] arr, int m, int i) {
        /* Base Cases */
        if(i < 0 || arr[i] == 1) {
            return false;
        } else if( i + 1 >= arr.length || i + m >= arr.length) {
            return true;
        }

        arr[i] = 1; // mark as visited;

        // Recursive cases (tries +m first to try to finish game quickly)
        return canWin(arr, m, i + m) ||
                canWin(arr, m, i + 1) ||
                canWin(arr, m, i - 1);
    }

    public static void canWinGetInput() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T --> 0) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int [] array = new int[n];
            for(int i=0; i<n; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(canWin(array, leap, 0) ? "YES" : "NO");
        }
        scanner.close();
    }

    public static void mergeListsMergeSort(int arr1[], int arr2[]) {

    }


    // Binary search ^^
    @SuppressWarnings("Duplicates")
    public static int  binarySearch1(int [] arr, int x) {

        int p = 0;
        int r = arr.length - 1;


        while( p <= r) {

            // Find the middle point
            int mid = (p+r) / 2;

            if(x < arr[mid]) {
                r = mid-1;
            } else if(x > arr[mid]) {
                r = mid+1;
            } else {
                return r;
            }

        }

        return -1;
    }

    public static int recursiveLinearSearch(int arr[], int start, int x) {

        if(start >= arr.length) {
            return -1;
        } else if(arr[start] == x) {
            return start;
        } else {
            // make the recursive call
            return recursiveLinearSearch(arr, start+1, x);
        }

    }


    @SuppressWarnings("Duplicates")
    public static int recursiveBinarySearch(int p, int r, int [] arr, int x) {

        // find the middle
        int mid = (p+r) / 2;

        // base case is if the beginning index is greater than the end index
        if(p>r) {
            return -1;
        } else if(x < arr[mid]) { // compare with the middle element
            // make the recursive call if on the left
            return recursiveBinarySearch(p, mid+1, arr, x);
        } else if(x > arr[mid]) {
            // make the recursive call on the right
            return recursiveBinarySearch(mid+1, r, arr, x);
        } else {
            // return the MIDDLE POINT!!
            return mid;
        }
    }

    @SuppressWarnings("Duplicates")
    public static void insertionSort(int [] arr) {

        // Start from 1 so that I can compare with the previous element
        for (int i = 1; i < arr.length; i++) {

            int element = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j]; // swap previous with current
                j--; // => -1
            }
            arr[j + 1] = element; // swap previous with current

        }

    }

    @SuppressWarnings("Duplicates")
    private static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        // Append list2 to list1
        int list2Size = list2.size();
        for (int i=0; i< list2Size; i++) {
            list1.add(list2.get(i));
        }

        int start = 0;
        int end = list1.size()-1;
        int mid = (start+end)/2;

        int tempArray[] = new int[end - start+1];

        // index counter for the left side of the array
        int leftIdx = start;
        // index counter for the right side of the array
        int rightIdx = mid+1;

        int k = 0;

        while (leftIdx<=mid && rightIdx<=end) {
            if(list1.get(leftIdx) < list1.get(rightIdx)) {
                tempArray[k] = list1.get(leftIdx);
                leftIdx++;
            } else {
                tempArray[k] = list1.get(rightIdx);
                rightIdx++;
            }
            k++;
        } // done sorting! So both the right and left side of the sub-arr are sorted

        if(leftIdx <= mid) { // consider the right side done being sorted, left must be sorted already
            while (leftIdx<=mid) {
                tempArray[k] = list1.get(leftIdx);
                leftIdx++;
                k++;
            }
        } else if(rightIdx <= end) {
            while (rightIdx<=end) {
                tempArray[k] = list1.get(rightIdx);
                rightIdx++;
                k++;
            }
        }
        // copy over the temp array into the appropriate slots of arr
        for(int i=0; i<tempArray.length; i++) {
            list1.set(start+i, tempArray[i]);
        }

        return list1;
    }

    /**
     *
     * A palindrome is a string that reads the same forward and backward
     *
     * radar or madam
     * @param str
     */
    public static boolean isPalindrome(String str) {
        // str = [ a n n a ];
        str = str.toLowerCase();

        if(str.length()==1 || str.length()==0) {
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)) {
            return isPalindrome(str.substring(1, str.length()-1));
        }

        return false;
    }

    public static boolean isPalindromeNonRecursive(String str) {

        if(str.length() == 0 || str.length() == 1) {
            return true;
        }

        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static int reverse1(int nr) {

        int reversed=0;
        int remainder; // %

        while (nr > 0) {

            remainder = nr % 10;
            nr = nr/10;
            reversed = reversed*10 + remainder;
        }

        return reversed;
    }

    public static int reverse(int nr) {
        int reversed = 0;
        int remainder;

        while(nr > 0) {
            remainder = nr % 10;
            System.out.println("remainder: " + remainder);
            nr = nr / 10;
            System.out.println("nr: " + nr);
            reversed = reversed * 10 + remainder;
            System.out.println("reversed: " + reversed);
        }

        return reversed;
    }

    public static int reverseNr(int nr) {

        String strNr = String.valueOf(nr);

        StringBuilder newString = new StringBuilder();

        for(int i=strNr.length()-1; i>=0; i--) {
            newString.append(strNr.charAt(i));
        }

        int backNr = Integer.parseInt(newString.toString());

        return backNr;
    }

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(5);
//        list1.add(10);
//
//        List<Integer> list2 = new ArrayList<>();
//        list1.add(3);
//        list1.add(4);
//        list1.add(12);
//
//        System.out.println(mergeLists(list1,list2));
//
//        int arr [] = new int [] {4, 1, 3, 2};

//        System.out.println(isPalindromeNonRecursive("anna"));

        System.out.println(reverse(1234));
    }











































}