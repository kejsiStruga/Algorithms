package Adt.ds.stack;

public class AppMain {

    public static String reverseString(String str) {
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String str_reversed = "";

        while(!stack.isEmpty()) {
            char value = stack.pop();
            str_reversed = str_reversed + value;
        }
        return str_reversed;
    }

    public static void main(String[] args) {
        System.out.println(AppMain.reverseString("Kejsi"));
    }

}
