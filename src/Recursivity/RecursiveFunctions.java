package Recursivity;

public class RecursiveFunctions {


    public static String reverse(String str) {

        if((str == null) || (str.length() <=1)) {
            return str;
        }
        System.out.println(str);
        return reverse(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {

        System.out.println("Hello".substring(1));
        System.out.println("Hello".charAt(0));
        System.out.println(RecursiveFunctions.reverse("Hello"));

    }


}
