import java.util.*;

public class Misc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<String, String>();

        System.out.println("====================================");

        for (int i=0; i<3; i++) {
            String s1 = scan.next();
            int x = scan.nextInt();

            String xs="";

            if (s1.length() <= 10 && (x>=0 && x<=999)) {
                for (int j = s1.length(); j<15; j++) {
                    s1 += " ";
                }
                if( x >= 10 && x <= 99 ) {
                    xs+= "0" + x;
                    map.put(s1,  xs);
                } else {
                    map.put(s1,  x+"");
                }
            }
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair);
        }


        System.out.println("====================================");
//        42
//        3.1415
//        Welcome to HackerRank's Java tutorials!
    }
}