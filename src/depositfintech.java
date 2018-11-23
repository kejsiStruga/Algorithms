import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class depositfintech {

    @SuppressWarnings("Duplicates")
    public static String selectionSort(int [] arr) {
        int min;

        for(int i = 0; i< arr.length-1; i++) {
            min=i;
            for (int j = i+1; j< arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return Arrays.toString(arr);
    }

    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {

        for (Integer a:
             arr) {
            if(a == k) {
                return "YES";
            }
        }
        return "NO";
    }

    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {

        List<Integer> arr = new ArrayList<>();

            for(int i=l; i<=r; i++) {
                if(i % 2 != 0) {
                    arr.add(i);
                }
            }
        return arr;
    }


    static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        // Merge two lists together, so that later can perform the sorting
        int list2Size = list2.size();
        for(int i=0;i<list2Size;i++){
            list1.add(list2.get(i));
        }

        // I opted for Selection sort to make the final sort, hence the
        // code below refers to the selection sort algorithm upon __list1__

        int min;

        for(int i = 0; i< list1.size()-1; i++) {
            min=i;
            for (int j = i+1; j< list1.size(); j++) {
                if(list1.get(j) < list1.get(min)) {
                    min = j;
                }
            }
            int temp = list1.get(i);
            list1.set(i,list1.get(min));
            list1.set(min,temp);
        }
        return list1;
    }


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(10);

        List<Integer> list2 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(4);
        list1.add(12);

        System.out.println(mergeLists(list1,list2));

        int arr [] = new int [] {4, 1, 3, 2};
    }
}
