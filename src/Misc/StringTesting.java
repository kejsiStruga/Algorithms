package Misc;

public class StringTesting {

    public static void main(String[] args) {

        String s1 = "Kejsi";
        String s2 = s1;

        String s3 = "Kejsi";

        s1 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1);

        String firstString = "Gaurav";
        String secondString = "Gaurav";
        String thirdString =  new String("Gaurav");

        System.out.println(thirdString == firstString);
        System.out.println(thirdString == firstString);
        System.out.println(secondString == firstString);

        String third = "Baeldung";
        String fourth = "Baeldung";
        System.out.println(third == fourth); // False




    }

}
