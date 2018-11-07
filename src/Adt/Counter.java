package Adt;

public class Counter {

    private String str = null;
    private int value = 0;

    public Counter(String str) {
        this.str = str;
    }

    public void increment() {
        value++;
    }

    public int getCurrentValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
