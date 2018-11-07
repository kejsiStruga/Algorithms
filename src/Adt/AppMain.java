package Adt;

public class AppMain {

    public static void main(String[] args) {
        Counter example = new Counter("example");
        example.increment();
        example.increment();
        example.increment();
        example.increment();

        System.out.println(example.getCurrentValue());
    }
}
