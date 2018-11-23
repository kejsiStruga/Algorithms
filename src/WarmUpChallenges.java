import java.util.*;

public class WarmUpChallenges {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\\s");

        int M=0;

        int c = 0;

        List<Integer> L = new ArrayList<Integer>();

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
}