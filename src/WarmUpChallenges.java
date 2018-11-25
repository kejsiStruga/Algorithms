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

    public static void main(String[] args) {
    }
}