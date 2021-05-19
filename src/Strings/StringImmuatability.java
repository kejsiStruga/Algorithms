package Strings;

public class StringImmuatability {


    public static String hello(String s){
        return "hello " + s;
    }

    public static void main(String[] args) {
        String str1 = "Value1";
        String str2 = str1;
        str2 = "Value2";

        System.out.println(str1);
        System.out.println(str2);
    }

}
